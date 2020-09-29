package com.bi_as.biasApp.dto;

import com.bi_as.biasApp.domain.Graphictype;

public class GraphictypeDto {
    private Integer idGraphictype;
    private String name;
    private int active;

    public GraphictypeDto(Graphictype graphictype) {
        this.idGraphictype=graphictype.getIdGraphictype();
        this.name=graphictype.getName();
        this.active=graphictype.getActive();
    }

    public GraphictypeDto(Integer idGraphictype, String name, int active) {
        this.idGraphictype = idGraphictype;
        this.name = name;
        this.active = active;
    }

    public GraphictypeDto() {
    }

    public Integer getIdGraphictype() {
        return idGraphictype;
    }

    public void setIdGraphictype(Integer idGraphictype) {
        this.idGraphictype = idGraphictype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Graphictype{" +
                "idGraphictype=" + idGraphictype +
                ", name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}