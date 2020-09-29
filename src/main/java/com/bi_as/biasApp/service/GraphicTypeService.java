package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.GraphicTypeRepository;
import com.bi_as.biasApp.domain.Graphictype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraphicTypeService {

    GraphicTypeRepository graphicTypeRepository;

    @Autowired
    public GraphicTypeService(GraphicTypeRepository graphicTypeRepository) {
        this.graphicTypeRepository = graphicTypeRepository;
    }





    public Graphictype getGraphicTypeByIdGraphicType(int idGraphicType){
        Graphictype graphictype=graphicTypeRepository.findByIdGraphictype(idGraphicType);
        return graphictype;
    }
}
