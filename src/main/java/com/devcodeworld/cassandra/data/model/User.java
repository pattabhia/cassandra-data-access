package com.devcodeworld.cassandra.data.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @PrimaryKey
    private int id;
    private String name;
    private String address;
    private int age;
}
