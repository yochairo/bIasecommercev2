package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Permissions;
import com.bi_as.biasApp.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PermissionsRepository extends JpaRepository<Permissions,Integer> {

    @Query(value = "select * from product where active=1",nativeQuery = true)
    List<Product> findproduclist();

}
