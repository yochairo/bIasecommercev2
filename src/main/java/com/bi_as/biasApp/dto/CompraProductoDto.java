package com.bi_as.biasApp.dto;

public class CompraProductoDto {

    private int id_producto;
    private int total;
    private int estado;
    private int precio;

    public CompraProductoDto(){

    }

    public CompraProductoDto(int id_producto, int total, int estado, int precio) {
        this.id_producto = id_producto;
        this.total = total;
        this.estado = estado;
        this.precio = precio;
    }
}
