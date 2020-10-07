package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.GraphicTypeRepository;
import com.bi_as.biasApp.domain.GraphicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraphicTypeService {

    GraphicTypeRepository graphicTypeRepository;

    @Autowired
    public GraphicTypeService(GraphicTypeRepository graphicTypeRepository) {
        this.graphicTypeRepository = graphicTypeRepository;
    }





    public GraphicType getGraphicTypeByIdGraphicType(int idGraphicType){
        GraphicType graphictype=graphicTypeRepository.findByIdGraphictype(idGraphicType);
        return graphictype;
    }
}
