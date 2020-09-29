package com.bi_as.biasApp.dto;

import com.bi_as.biasApp.domain.Atribute;

public class AtributeDto {
    private Integer idAttribute;
    private String data;
    private String txUser;
    private String txHost;
    private String txDate;
    private int active;

    public AtributeDto(Atribute atribute) {
        this.idAttribute=atribute.getIdAtribute();
        this.data=atribute.getData();
        this.txUser=atribute.getTxUser();
        this.txHost=atribute.getTxHost();
        this.txDate=atribute.getTxDate();
        this.active=atribute.getActive();
    }

    public AtributeDto(Integer idAtribute, String data, int active) {
        this.idAttribute = idAtribute;
        this.data = data;
        this.active = active;
    }

    public AtributeDto() {
    }

    public Integer getIdAtribute() {
        return idAttribute;
    }

    public void setIdAtribute(Integer idAtribute) {
        this.idAttribute = idAtribute;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "AtributeDto{" +
                "idAttribute=" + idAttribute +
                ", data='" + data + '\'' +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate='" + txDate + '\'' +
                ", active=" + active +
                '}';
    }
}
