package com.p2a.back.model.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.log4j.Log4j;

@Entity
@Table(name = "users")
@Data
public class EntityUsers {
    @Id
    private String id;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String nickname;
}
