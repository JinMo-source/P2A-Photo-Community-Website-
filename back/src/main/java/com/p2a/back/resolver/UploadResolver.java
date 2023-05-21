package com.p2a.back.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UploadResolver implements GraphQLQueryResolver {
    public List<Users> users() {
        // Return a list of Users
        return Arrays.asList(
                new Users("1", "Han", "1234", "hsd@example.com", "good"),
                new Users("2", "Jin", "1234", "pjm@example.com", "nice")
        );
    }
    public List<Pictures> pictures() {
        // Return a list of Pictures
        return Arrays.asList(
                new Pictures("1", "Beautiful Sunset", "A stunning sunset over the ocean.", Arrays.asList("sunset", "nature"), 100, 500),
                new Pictures("2", "Cityscape at Night", "A vibrant city skyline at night.", Arrays.asList("city", "night"), 75, 300)
        );
    }

}
