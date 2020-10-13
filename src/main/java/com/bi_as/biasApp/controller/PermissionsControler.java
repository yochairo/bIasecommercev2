package com.bi_as.biasApp.controller;

import com.bi_as.biasApp.domain.Permissions;
import com.bi_as.biasApp.dto.PermissionDto;
import com.bi_as.biasApp.dto.PersonaDto;
import com.bi_as.biasApp.service.PermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/k1/permissions")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PermissionsControler {
    private PermissionService permissionService;
    private static final Logger LOGGER = LoggerFactory.getLogger(PermissionsControler.class);

    @Autowired
    public PermissionsControler(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @RequestMapping("/permissionlist")
    public List<PermissionDto> getpermissionlist(PermissionDto permissionDto){
        LOGGER.info("Obteniendo id graphic");
        return permissionService.getlistpermission(permissionDto);
    }

    @PutMapping("/editUserSeller")
    public List<PermissionDto> editPublication(@RequestBody List<PermissionDto> permissionDtoList){
//        LOGGER.info("Realizando modificacion de editar user  esss "+productoDto.getIdProduct());

        permissionService.editPermission(permissionDtoList);
        return permissionDtoList;

    }



}
