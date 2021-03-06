package com.inspoDataBase.jpaUsageDataBase.jpaRepository;


import com.inspoDataBase.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mmikilchenko on 09.02.2017.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User saveAndFlush(User user);

    List<User> findAll();

    User findByUserId(Integer userId);

    @Query("SELECT u FROM User u WHERE LOWER(u.userName) = LOWER(:userName)")
    User findByUserName(@Param("userName") String userName);

    @Query("SELECT u FROM User u WHERE LOWER(u.userName) = LOWER(:userName) AND u.password =:password ")
   List< User> findByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);

    @Transactional
    void deleteByUserId(Integer userId);

}
