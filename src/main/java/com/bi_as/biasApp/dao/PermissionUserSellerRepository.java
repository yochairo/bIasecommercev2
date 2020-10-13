package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.PermissionUserSeller;
import com.bi_as.biasApp.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PermissionUserSellerRepository extends JpaRepository<PermissionUserSeller,Integer> {

    @Query(value = "select * from permission_user_seller where user_seller_id_userseller=?1",nativeQuery = true)
    List<PermissionUserSeller> listofpermissionseller(int var);

    @Query(value = "select * from permission_user_seller where id_permissionuser=?1",nativeQuery = true)
    PermissionUserSeller findbyiduserseller(int var);

}
