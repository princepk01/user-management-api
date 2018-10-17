package com.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.dao.UserDAO;

@Repository
public interface UserRepository extends JpaRepository<UserDAO, Long> {

}
