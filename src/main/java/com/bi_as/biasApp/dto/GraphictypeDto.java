package com.bi_as.biasApp.dto;

import com.bi_as.biasApp.domain.GraphicType;

public class GraphictypeDto {
    private Integer idGraphictype;
    private int name;
    private int active;

    public GraphictypeDto(GraphicType graphictype) {
        this.idGraphictype=graphictype.getIdGraphictype();
        this.name=graphictype.getName();
        this.active=graphictype.getActive();
    }

    public GraphictypeDto(Integer idGraphictype, int name, int active) {
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

    public int getName() {
        return name;
    }

    public void setName(int name) {
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