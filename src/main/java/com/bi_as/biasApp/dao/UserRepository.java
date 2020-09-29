package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAll();

    User findOne(int id);

    User save(User p);

    void delete(User p);


    @Query(value = "select * from user where nickname_user=?1 LIMIT 1",nativeQuery = true)
    User findByNicknameUser(String nickname);

    @Query(value = "select * from user where id_user=?1 LIMIT 1",nativeQuery = true)
    User findByIdUser(int idUser);

    @Query(value = "select * from user where nickname_user=?1 and password=?2  LIMIT 1",nativeQuery = true)
    User findByNameAndPassword(String n,String p);
}
