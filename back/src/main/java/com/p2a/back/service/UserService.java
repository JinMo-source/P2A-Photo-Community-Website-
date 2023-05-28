package com.p2a.back.service;

import com.p2a.back.model.Entity.EntityUsers;
import com.p2a.back.model.Users;
import com.p2a.back.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicReference;

@Service
public class UserService {
    private final UsersRepository usersRepository;

    @Autowired
    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public EntityUsers saveAndFlushUser(EntityUsers user) {
       return usersRepository.saveAndFlush(user);
    }
}
