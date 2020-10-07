package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StroreRepository extends JpaRepository<Store, Integer> {
    @Query(value="SELECT * FROM strore order by strore.id_store DESC LIMIT 1",nativeQuery = true)
    Store findLastStroreRegister();

}
