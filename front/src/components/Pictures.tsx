import React from "react";
import { useQuery, gql } from "@apollo/client";
import Client from "../Client";

function Pictures() {
  // interface PICTURES {
  //   id: number;
  //   photo: string;
  //   title: string;
  //   describe: string;
  // }
  // const GET_PICTURES = gql`
  //   id,
  //   title,
  //   photo,
  //   describe

  // `;
  // const { id, title, photo, describe } = useQuery(GET_PICTURES);
  return (
    <section>
      <h1>PICTURES</h1>
    </section>
  );
}

export default Pictures;
