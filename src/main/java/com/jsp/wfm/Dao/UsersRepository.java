package com.jsp.wfm.Dao;

import com.jsp.wfm.Models.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User,Long> {

    @Query(value = "SELECT u.user_id as user_id, u.username as username, u.password as password, u.email as email FROM Users u WHERE username = :username", nativeQuery = true)
    public User getUserByUsername(String username);

    @Query(value = "SELECT u.user_id as user_id, u.username as username, u.password as password, u.email as email FROM Users u WHERE username = :username", nativeQuery = true)
    public Optional<User> getOptionalUser(String username);
}
