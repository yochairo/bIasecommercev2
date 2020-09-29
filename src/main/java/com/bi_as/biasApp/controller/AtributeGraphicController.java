package com.bi_as.biasApp.controller;

import com.bi_as.biasApp.domain.Atribute;
import com.bi_as.biasApp.dto.GraphicColumnsDto;
import com.bi_as.biasApp.service.AtributeGraphicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/atributeGraphic")
public class AtributeGraphicController {

    AtributeGraphicService atributeGraphicService;

    @Autowired
    public AtributeGraphicController(AtributeGraphicService atributeGraphicService) {
        this.atributeGraphicService = atributeGraphicService;
    }

    @RequestMapping("/attributesByGraphic/{id}")
    public List<Atribute> getGraphicByIdGraphic(@PathVariable("id") int idgraphic){
        return atributeGraphicService.getAtributeListByIdGraphic(idgraphic);
    }

    @RequestMapping("/columnGraphic/{id}")
    public List<GraphicColumnsDto> getAtributeLisOfColumnsByIdGraphic(@PathVariable("id") int idgraphic){
        return atributeGraphicService.getGraphicColumnsListByIdGraphic(idgraphic);
    }

}
