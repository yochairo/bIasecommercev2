package com.bi_as.biasApp.controller;

import com.bi_as.biasApp.domain.Atribute;
import com.bi_as.biasApp.domain.Graphic;
import com.bi_as.biasApp.dto.GraphicDto;
import com.bi_as.biasApp.service.GraphicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/graphic")
public class GraphicController {

    GraphicService graphicService;
    private static final Logger LOGGER= LoggerFactory.getLogger(UserController.class);

    @Autowired
    public GraphicController(GraphicService graphicService) {
        this.graphicService = graphicService;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    List<GraphicDto> all(){
        List<GraphicDto> graphicDtoList=new ArrayList<>();
        for(GraphicDto graphicDto:graphicService.findAllGraphic()){
            graphicDtoList.add(graphicDto);
        }
        return graphicDtoList;
    }


    @PostMapping("/add/")
    public Graphic addView(@RequestBody GraphicDto graphic){
        LOGGER.info("Agregando usuario");
        return graphicService.addView(graphic);
    }
    @RequestMapping("/{id}")
    public GraphicDto getGraphicByIdGraphic(@PathVariable("id") Integer idgraphic){
        LOGGER.info("Obteniendo id graphic");
        return new GraphicDto(graphicService.getGraphicByidGraphic(idgraphic));
    }
/*
    @RequestMapping("/attributesByGraphic/{id}")
    public List<Atribute> getGraphicByIdGraphic(@PathVariable("id") int idgraphic){
        LOGGER.info("Obteniendo id graphic");
        return graphicService.getAtributeListByIdGraphic(idgraphic);
    }
*/

}
