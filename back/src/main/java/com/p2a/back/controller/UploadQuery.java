package com.p2a.back.controller;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class UploadQuery implements GraphQLQueryResolver {
    public String uploads(){
        return "Hello GraphQL";
    }
}
