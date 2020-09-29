package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Persona;
import com.bi_as.biasApp.domain.UserSeller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserSellerRepository extends JpaRepository<UserSeller, Integer> {

//@Query(value = "select *from user_seller where ")
    //@Query(value = "select * from user_selller where id_us") UserSeller findUserselerbyid(int var1);

    @Query(value = "select * from user_seller where id_userseller=?1",nativeQuery = true)
    UserSeller findUserselerbyid(int var1);

}
