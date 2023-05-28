package com.p2a.back.config;

import com.p2a.back.resolver.UserResolver;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Configuration
public class GraphQLConfig {
    /*@Bean
    public TypeDefinitionRegistry typeRegistry() {
        // 스키마 정의를 .graphql 파일에서 로드하고 TypeDefinitionRegistry 객체를 생성합니다.
        SchemaParser schemaParser = new SchemaParser();
        ClassPathResource schemaResource = new ClassPathResource("graphql/schema.graphqls"); // 스키마 파일 경로를 적절히 수정하세요
        try (InputStream inputStream = schemaResource.getInputStream()) {
            return schemaParser.parse(new InputStreamReader(inputStream));
        } catch (IOException e) {
            // 파일 로드 중에 예외가 발생한 경우 처리
            throw new IllegalStateException("Failed to load schema file", e);
        }
    }

    @Bean
    public RuntimeWiring runtimeWiring(UserResolver userResolver) {
        return RuntimeWiring.newRuntimeWiring()
                .type(TypeRuntimeWiring.newTypeWiring("Query")
                        .dataFetcher("usersBuilder", environment -> userResolver.usersBuilder())
                       // .dataFetcher("boardsBuilder", environment -> userResolver.boardsBuilder())
                )
                .build();
    }
    @Bean
    public GraphQLSchema graphQLSchema(TypeDefinitionRegistry typeRegistry, RuntimeWiring runtimeWiring) {
        return new SchemaGenerator().makeExecutableSchema(typeRegistry, runtimeWiring);
    }*/
  /*  @Bean
    public UploadResolver uploadResolver() {
        return new UploadResolver();
    }*/
}
