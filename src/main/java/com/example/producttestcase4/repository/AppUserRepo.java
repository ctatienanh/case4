package com.example.producttestcase4.repository;


import com.example.producttestcase4.model.AppUser;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface AppUserRepo extends CrudRepository<AppUser, Long> {
    AppUser findByUserName(String userName);
//    @Query(nativeQuery = true,value = "select id from app_user where user_name=:username")
//    int findidbyName(@Param("username") String username);
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "insert into app_user_roles values (:id,1)")
    void saveRole(@Param("id") long id);
    @Query(nativeQuery = true,value = "select name from role join app_user_roles on role.id=app_user_roles.roles_id join app_user on app_user.id=app_user_roles.app_user_id where user_name=:username")
    List<String> findRoleById(@Param("username") String username);




}