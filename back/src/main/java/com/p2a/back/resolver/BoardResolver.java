package com.p2a.back.resolver;

import com.p2a.back.builer.BoardsBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Arrays;

@Controller
@Slf4j
public class BoardResolver {
    @QueryMapping
    public BoardsBuilder boardsBuilder() {
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
}
