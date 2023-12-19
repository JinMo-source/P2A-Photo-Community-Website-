package com.p2a.back.resolver;

import com.p2a.back.builer.BoardsBuilder;
import com.p2a.back.builer.UsersBuilder;
import com.p2a.back.model.Entity.EntityUsers;
import com.p2a.back.model.Users;
import com.p2a.back.repository.UsersRepository;
import com.p2a.back.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
@Slf4j
public class UserResolver {
    private final UserService userService;
    private final UsersRepository usersRepository;
    @Autowired
    public UserResolver (UsersRepository usersRepository, UserService usersService){
        this.usersRepository = usersRepository;
        this.userService = usersService;
    }
    @QueryMapping
    public UsersBuilder usersBuilder() {
        // Return a list of Users
        //new Users("1", "Han", "1234", "hsd@example.com", "good");
        return UsersBuilder.builder()
                .id("1")
                .name("Han")
                .password("1234")
                .email("hsd@example.com")
                .nickname("good")
                .build();
    }
    /**
     * CREATE
     * @param user
     * @return
     */
    @MutationMapping
    public EntityUsers createUser(@Argument("input") Users user) {
        log.info("User created: {}", user);
        Optional.ofNullable(user)
                .orElseThrow(NullPointerException::new);

        return userService.saveAndFlushUser(mapToEntity(user));
    }

    /**
     * READ
     * ALL USER
     * @return
     */
    @QueryMapping
    public List<EntityUsers> getAllUsers() {
        return usersRepository.findAll();
    }

    /**
     * READ
     * USER BY ID
     * @param id
     * @return
     */
    @QueryMapping
    public Optional<EntityUsers> getUserById(@Argument("id") String id) {
        return usersRepository.findById(id);
    }

    /**
     * UPDATE
     * @param id
     * @param user
     * @return
     */
    @MutationMapping
    public EntityUsers updateUser(@Argument("id") String id, @Argument("input") Users user){
        log.info("id info: {}, user info: {}",id, user);
        Optional<EntityUsers> findUser = usersRepository.findById(id);
        if (findUser.isPresent()){
            return getEntityUsers(user, findUser.get());
        }
        log.error("UserResolver: User with ID '{}' does not exist!", id);
        System.out.println("UserResolver line(79): 찾으려는 ID가 존재하지 않습니다!");
        return null;
    }

    @MutationMapping
    public boolean deleteUserById(@Argument("id") String id){
        Optional<EntityUsers> deleteUser = usersRepository.findById(id);
        if (deleteUser.isPresent()){
            usersRepository.delete(deleteUser.get());
            log.atInfo();
            return true;
        } else {
            log.atError();
            return false;
        }
    }



    private EntityUsers getEntityUsers(Users user, EntityUsers findUser) {
        findUser.setName(user.getName());
        findUser.setPassword(user.getPassword());
        findUser.setEmail(user.getEmail());
        findUser.setNickname(user.getNickname());
        log.debug("Get EntityUsers And Set changed info: {}", findUser);
        return usersRepository.saveAndFlush(findUser);
    }

    private EntityUsers mapToEntity(Users user) {
        EntityUsers tupleUser = new EntityUsers();
        tupleUser.setId(user.getId());
        tupleUser.setName(user.getName());
        tupleUser.setNickname(user.getNickname());
        tupleUser.setEmail(user.getEmail());
        tupleUser.setPassword(user.getPassword());
        log.debug("Mapping user to entity: {}", tupleUser);
        return tupleUser;
    }
}

