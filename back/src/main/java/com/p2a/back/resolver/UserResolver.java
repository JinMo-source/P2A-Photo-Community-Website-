package com.p2a.back.resolver;

import com.p2a.back.builer.BoardsBuilder;
import com.p2a.back.builer.UsersBuilder;
import com.p2a.back.model.Entity.EntityUsers;
import com.p2a.back.model.Users;
import com.p2a.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Controller
public class UserResolver {
    @QueryMapping
    public UsersBuilder users() {
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
    @QueryMapping
    public BoardsBuilder boards() {
        // Return a list of Pictures
        //new Pictures("1", "Beautiful Sunset", "A stunning sunset over the ocean.", Arrays.asList("sunset", "nature"), 100, 500);
        return BoardsBuilder.builder()
                .id("1")
                .title("GoodPicture")
                .description("Very Good Picture.")
                .hashtag(Arrays.asList("good", "nice"))
                .likes(100)
                .views(150)
                .build();
    }
    private final UserService userService;
    @Autowired
    public UserResolver(UserService usersService) {
        this.userService = usersService;
    }
    private AtomicReference<EntityUsers> tupleUser = new AtomicReference();

    @MutationMapping
    public EntityUsers createUser(@Argument("input") Users user) {
        Optional.ofNullable(user).orElseGet(()->Users.builder().build());
        tupleUser = mapToEntity(user);
        return userService.saveAndFlushUser(tupleUser);
    }

    //TODO log4 api 활용해서 로그 만들기!
    private AtomicReference<EntityUsers> mapToEntity(Users user) {
        tupleUser.get().setId(users().getId());
        tupleUser.get().setName(users().getName());
        tupleUser.get().setNickname(users().getNickname());
        tupleUser.get().setEmail(users().getEmail());
        tupleUser.get().setPassword(user.getPassword());
        return tupleUser;
    }
}

