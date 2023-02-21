package com.devcodeworld.cassandra.data.repository;

import com.devcodeworld.cassandra.data.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User, Integer> {
}
