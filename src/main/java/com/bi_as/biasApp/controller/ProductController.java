package com.bi_as.biasApp.controller;


import com.bi_as.biasApp.domain.Product;
import com.bi_as.biasApp.dto.PersonaDto;
import com.bi_as.biasApp.dto.ProductoDto;
import com.bi_as.biasApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.NamedStoredProcedureQueries;

@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping("/k1/producto")
public class ProductController {
    private ProductService productService;
    private static final Logger LOGGER=LoggerFactory.getLogger(ProductController.class);

    @Autowired
    public ProductController( ProductService productService){
        this.productService= productService;
    }


    @RequestMapping("/idproducto/{id}")
    public ProductoDto encotraproducto(@PathVariable("id")String id){
        LOGGER.info("Obteniendo id graphic");
        int idNumber=Integer.parseInt(id);
        ProductoDto productoDto=new ProductoDto(productService.findidproduct(idNumber));
        return  productoDto;
    }


    @PostMapping("/idtienda/{id}")
    public ProductoDto addproduct(@PathVariable("id")String id,@RequestBody ProductoDto productoDto){
        LOGGER.info("llego aqui xd");
        int idtienda =Integer.parseInt(id);
       // LOGGER.info(productService.nuevoproducto(productoDto,idtienda).toString());
        return productService.nuevoproducto(productoDto,idtienda);
    }


    @PutMapping("/editproducto")
    public ProductoDto editPublication(@RequestBody ProductoDto productoDto){
        LOGGER.info("Realizando modificacion de editar user  esss "+productoDto.getIdProduct());


        return productService.ediproducto(productoDto);

    }
}
