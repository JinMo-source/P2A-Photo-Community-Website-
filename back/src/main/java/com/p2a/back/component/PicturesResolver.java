package com.p2a.back.component;


import com.p2a.back.domian.Pictures.Pictures;
import com.p2a.back.domian.Pictures.Users;
import graphql.kickstart.annotations.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

@Component
public class PicturesResolver implements GraphQLQueryResolver {
    public List<Users> users() {
        // Return a list of Users
        return Arrays.asList(
                new Users("1", "John Doe", "password123", "john@example.com", "johndoe"),
                new Users("2", "Jane Smith", "pass987", "jane@example.com", "janesmith")
        );
    }
    public List<Pictures> pictures() {
        // Return a list of Pictures
        return Arrays.asList(
                new Pictures("1", "Beautiful Sunset", "A stunning sunset over the ocean.", Arrays.asList("sunset", "nature"), 100, 500),
                new Pictures("2", "Cityscape at Night", "A vibrant city skyline at night.", Arrays.asList("city", "night"), 75, 300)
        );
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
