package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.AtributeGraphic;
import com.bi_as.biasApp.domain.Graphic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GraphicRepository extends JpaRepository<Graphic,Integer> {
    Graphic findByName(String graphicName);

    List<AtributeGraphic> findByIdGraphic(Graphic idGraphic);

    @Query(value = "select * from graphic where id_graphic=?1 LIMIT 1",nativeQuery = true)
    Graphic findByIdGraphic(int id_graphic);



}
