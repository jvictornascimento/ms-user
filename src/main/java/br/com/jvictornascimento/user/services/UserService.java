package br.com.jvictornascimento.user.services;

import br.com.jvictornascimento.user.models.UserModel;
import br.com.jvictornascimento.user.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    @Transactional
    public UserModel save (UserModel userModel){
        return repository.save(userModel);
    }
}
