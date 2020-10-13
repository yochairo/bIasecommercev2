package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.PermissionUserSellerRepository;
import com.bi_as.biasApp.domain.PermissionUserSeller;
import com.bi_as.biasApp.domain.Permissions;
import com.bi_as.biasApp.domain.UserClient;
import com.bi_as.biasApp.dto.PermissionDto;
import com.bi_as.biasApp.dto.PersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionService {

    PermissionUserSellerRepository permissionUserSellerRepository;

    @Autowired
    public PermissionService(PermissionUserSellerRepository permissionUserSellerRepository) {
        this.permissionUserSellerRepository = permissionUserSellerRepository;
    }


    public List<PermissionDto> getlistpermission(PermissionDto permissionDto){

        List<PermissionUserSeller> permissionsList=permissionUserSellerRepository.listofpermissionseller(permissionDto.getIduserseler());

        List<PermissionDto> permissionDtoList=new ArrayList<>();

        for(PermissionUserSeller permissionUserSeller:permissionsList){
            permissionDtoList.add(new PermissionDto(permissionUserSeller));
        }

        return  permissionDtoList;
    }

    public List<PermissionDto> editPermission(List<PermissionDto> permissionDtoList){



        for(PermissionDto permissionDto:permissionDtoList){
            PermissionUserSeller permissionUserSeller=permissionUserSellerRepository.findbyiduserseller(permissionDto.getIdpermiso());
            permissionUserSeller.setActive(permissionDto.getActive());
            permissionUserSellerRepository.save(permissionUserSeller);

        }



        return permissionDtoList;
    }

}
