package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.GraphicRepository;
import com.bi_as.biasApp.domain.*;
import com.bi_as.biasApp.dto.AtributeDto;
import com.bi_as.biasApp.dto.GraphicDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GraphicService {

    GraphicRepository graphicRepository;
    ViewService viewService;
    GraphicTypeService graphicTypeService;

    @Autowired
    public GraphicService(GraphicRepository graphicRepository, ViewService viewService, GraphicTypeService graphicTypeService) {
        this.graphicRepository = graphicRepository;
        this.viewService = viewService;
        this.graphicTypeService = graphicTypeService;
    }


    public List<GraphicDto> findAllGraphic(){
        List<GraphicDto> GraphicDtoList= new ArrayList<>();
        for (Graphic graphic:graphicRepository.findAll()) {
            GraphicDtoList.add(new GraphicDto(graphic));
        }
        return GraphicDtoList;
    }
    /*
    public List<AtributeService> saveAttributeService(int idGraphic,int idAtribute){
       Graphic graphic=getGraphicByidGraphic(idGraphic);
       Atribute atribute=
    }*/

    public Graphic addView(GraphicDto graphicDto) {
        View view=viewService.getViewByidView(graphicDto.getIdView());
        Graphictype graphictype=graphicTypeService.getGraphicTypeByIdGraphicType(graphicDto.getIdTypeGraphic());
        Graphic graphic=new Graphic();
        graphic.setName(graphicDto.getName());
        graphic.setActive(graphicDto.getActive());
        graphic.setTxDate(graphicDto.getTxDate());
        graphic.setTxHost(graphicDto.getTxHost());
        graphic.setTxUser(graphicDto.getTxUser());
        graphic.setViewidview(view);
        graphic.setGraphicTypeidgraphictype(graphictype);
        graphicRepository.save(graphic);
        return graphic;
    }

    public Graphic getGraphicByidGraphic(int idGraphic){
        Graphic graphic= graphicRepository.findByIdGraphic(idGraphic);
        return graphic;
    }
/*
    public List<Atribute> getAtributeListByIdGraphic(int idGraphic) {
        Graphic graphic=graphicRepository.findByIdGraphic(idGraphic);
        List<AtributeGraphic> atributeGraphicList=graphic.getAtributeGraphicList();
        List<Atribute> atributeList=new ArrayList<>();
        for(AtributeGraphic atributeGraphic:atributeGraphicList){
            atributeList.add(atributeGraphic.getIdAtribute());
        }
        return atributeList;
    }*/

}
