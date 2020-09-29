package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Graphictype;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GraphicTypeRepository extends JpaRepository<Graphictype,Integer> {

    @Query(value = "select * from graphictype where id_graphictype=?1 LIMIT 1",nativeQuery = true)
    Graphictype findByIdGraphictype(int idGraphictype);

    Graphictype findByName(String name);
}
