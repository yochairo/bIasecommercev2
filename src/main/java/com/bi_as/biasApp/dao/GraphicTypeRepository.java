package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.GraphicType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GraphicTypeRepository extends JpaRepository<GraphicType,Integer> {

    @Query(value = "select * from graphictype where id_graphictype=?1 LIMIT 1",nativeQuery = true)
    GraphicType findByIdGraphictype(int idGraphictype);
//    Graphictype findByName(String name);
}
