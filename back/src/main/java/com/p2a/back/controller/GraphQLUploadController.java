package com.p2a.back.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQLUploadController {
    private String test = "TEST";

    @QueryMapping
    public String testA() {
        return test;
    }
}
