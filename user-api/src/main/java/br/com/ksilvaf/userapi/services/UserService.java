package br.com.ksilvaf.userapi.services;

import br.com.ksilvaf.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
