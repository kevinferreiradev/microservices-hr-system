package br.com.ksilvaf.userapi.services.impl;

import br.com.ksilvaf.userapi.domain.User;
import br.com.ksilvaf.userapi.repositories.UserRepository;
import br.com.ksilvaf.userapi.services.UserService;
import br.com.ksilvaf.userapi.services.exeptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {


    private final UserRepository repository;
    private final Environment env;

    @Override
    public User findById(Long id) {
        log.info("PAYROLL_SERVICE ::: Get request on" + env.getProperty("local.server.port") + " port");
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
