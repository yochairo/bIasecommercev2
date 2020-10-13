package com.bi_as.biasApp.dto;

import com.bi_as.biasApp.domain.PermissionUserSeller;

public class PermissionDto {
    private int iduserseler;
    private int idpermiso;
    private int active;

    public PermissionDto(PermissionUserSeller permissionUserSeller) {
        this.iduserseler = permissionUserSeller.getUserSellerIdUserseller().getIdUserseller();
        this.idpermiso = permissionUserSeller.getIdPermissionuser();
        this.active = permissionUserSeller.getActive();
    }

    public PermissionDto(){
    }

    public int getIduserseler() {
        return iduserseler;
    }

    public void setIduserseler(int iduserseler) {
        this.iduserseler = iduserseler;
    }

    public int getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(int idpermiso) {
        this.idpermiso = idpermiso;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
