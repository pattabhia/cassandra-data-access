package com.devcodeworld.cassandra.data;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User, Integer> {
}
