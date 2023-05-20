import React from "react";
import { ApolloClient, InMemoryCache } from "@apollo/client";

function Client() {
  const clients = new ApolloClient({
    uri: "http://localhost:8080/grapeql",
    cache: new InMemoryCache(),
  });
}

export default Client;
