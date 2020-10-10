package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoRepository extends JpaRepository<Product,Integer> {

    @Query(value = "select * from  product where id_product=?1",nativeQuery = true)
    Product findprodutbyidProduct(int var1);

    @Query(value = "select * from  product where name=?1",nativeQuery = true)
    Product findprodutbyidname(String var1);
}
