package br.com.jvictornascimento.user.producers;

import br.com.jvictornascimento.user.dtos.EmailDto;
import br.com.jvictornascimento.user.models.UserModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {
    final RabbitTemplate rabbitTemplate;

    public UserProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value(value = "${broker.queue.email.name}")
    private String routingKey;

    public void publishMessageEmail(UserModel userModel){
        var emailDto = new EmailDto();
        emailDto.setUserId(userModel.getUserId());
        emailDto.setEmailTo(userModel.getEmail());
        emailDto.setSubject("Cadastro Realizado com sucesso!");
        emailDto.setText(userModel.getName() + "seja bem vindo(a)! \nAfgradecemos o seu cadastro.");

        rabbitTemplate.convertAndSend("",routingKey,emailDto);

    }
}
