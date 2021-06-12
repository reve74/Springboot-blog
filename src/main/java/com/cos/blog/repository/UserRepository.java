package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.User;

// DAO
// 자동으로 bean등록이 된다.
// @Repository // 생략가능
public interface UserRepository extends JpaRepository<User, Integer> {

}

// JPA Naming 쿼리
//SELECT * FROM user WHRERE username = ? AND password = ?;
//User findByUsernameAndPassword(String username, String password);

//@Query(value = "SELECT * FROM user WHRERE username = ?1 AND password = ?2", nativeQuery = true)
//User login(String username, String password);
