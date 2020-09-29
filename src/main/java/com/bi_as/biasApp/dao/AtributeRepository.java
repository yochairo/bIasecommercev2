package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Atribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AtributeRepository extends JpaRepository<Atribute,Integer> {

    Atribute findByActive(boolean isActive);

    @Query(value = "select * from atribute where id_atribute=?1 LIMIT 1",nativeQuery = true)
    Atribute findByIdAtribute(int idAtribute);



}
