package com.p2a.back.controller;

import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.stereotype.Component;

@Component
public class UploadQuery extends GraphQlProperties.Graphiql {
    public String uploads(){
        return "Hello GraphQL";
    }
}
