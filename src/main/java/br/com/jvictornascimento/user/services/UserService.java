package br.com.jvictornascimento.user.services;

import br.com.jvictornascimento.user.models.UserModel;
import br.com.jvictornascimento.user.producers.UserProducer;
import br.com.jvictornascimento.user.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private final UserRepository repository;
    final UserProducer producer;

    public UserService(UserRepository repository, UserProducer producer) {
        this.repository = repository;
        this.producer = producer;
    }
    @Transactional
    public UserModel save (UserModel userModel){
        userModel = repository.save(userModel);
        producer.publishMessageEmail(userModel);
        return userModel;
    }
}
