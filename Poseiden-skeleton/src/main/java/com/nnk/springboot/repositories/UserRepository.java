package com.nnk.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nnk.springboot.domain.User;


public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
    @Query(value = "select * from users where userName = :userName", nativeQuery = true)
    User findByUserName(@Param("userName") String userName);
}
