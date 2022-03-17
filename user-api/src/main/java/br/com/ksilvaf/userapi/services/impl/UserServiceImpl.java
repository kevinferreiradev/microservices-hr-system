package br.com.ksilvaf.userapi.services.impl;

import br.com.ksilvaf.userapi.domain.User;
import br.com.ksilvaf.userapi.repositories.UserRepository;
import br.com.ksilvaf.userapi.services.UserService;
import br.com.ksilvaf.userapi.services.exeptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {


    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
