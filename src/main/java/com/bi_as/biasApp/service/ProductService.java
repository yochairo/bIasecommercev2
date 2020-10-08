package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.ProductoRepository;
import com.bi_as.biasApp.dao.StroreRepository;
import com.bi_as.biasApp.domain.Product;
import com.bi_as.biasApp.domain.Store;
import com.bi_as.biasApp.dto.ProductoDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    ProductoRepository productoRepository;
    StroreRepository stroreRepository;
    private static final Logger LOGGER= LoggerFactory.getLogger(ProductService.class);

    public ProductService(ProductoRepository productoRepository, StroreRepository stroreRepository) {
        this.productoRepository = productoRepository;
        this.stroreRepository = stroreRepository;
    }

    public Product findbyidproduct(int id ){
        return productoRepository.findprodutbyidProduct(id);

    }

    public Product nuevoproducto(ProductoDto productoDto,int idtienda){

        Product product= new Product();
        product.setName(productoDto.getName());
        product.setDescription(productoDto.getDescription());
        product.setCost(productoDto.getCost());
        product.setCode(productoDto.getCode());
        product.setQuantity(productoDto.getQuantity());
        product.setType(productoDto.getType());
        product.setUrlImage("urlimagenproducto");
        product.setNameImage("produtoimagen.jpg");
        Store store= new Store();
        store=stroreRepository.findstoreidstore(idtienda);
        product.setStroreIdStore(store);
        productoRepository.save(product);
        return product;
    }

}
