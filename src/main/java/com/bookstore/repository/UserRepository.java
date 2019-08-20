package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.User;

/*
 * created this interface with using "CrudRepository" interface
 *  which allows generating CRUD operations on a repository for a specific type
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);

}
