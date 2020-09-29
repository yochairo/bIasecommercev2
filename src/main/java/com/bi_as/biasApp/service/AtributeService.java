package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.AtributeRepository;
import com.bi_as.biasApp.domain.Atribute;
import com.bi_as.biasApp.domain.Graphic;
import com.bi_as.biasApp.dto.AtributeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtributeService {

    AtributeRepository atributeRepository;

    @Autowired
    public AtributeService(AtributeRepository atributeRepository) {
        this.atributeRepository = atributeRepository;
    }

    public List<AtributeDto> findAllAtribute(){
        List<AtributeDto> atributeDtoList=new ArrayList<>();

        for (Atribute atribute:atributeRepository.findAll()) {
            atributeDtoList.add(new AtributeDto(atribute));
        }
        return atributeDtoList;
    }

    public Atribute addAtribute(Atribute atribute) {
/*        Atribute atribute=new Atribute();
        atribute.setData(atributeDto.getData());
        atribute.setTxUser(atributeDto.getTxUser());
        atribute.setTxHost(atribute.getTxHost());
        atribute.setTxDate(atribute.getTxDate());
        atribute.setActive(atributeDto.getActive());*/
        atributeRepository.save(atribute);
        return atribute;
    }

    public Atribute getAtributeByIdAtribute(int idAtribute){
        Atribute atribute=atributeRepository.findByIdAtribute(idAtribute);
        return atribute;
    }


    public List<String> saveListOfAttribute(List<String> atributesArray){
        for(String attribute:atributesArray){
            Atribute atribute=new Atribute();
            atribute.setData(attribute);
            atribute.setTxUser("User1");
            atribute.setTxHost("180.0.0");
            atribute.setTxDate("2019-08-07");
            atribute.setActive(1);
            addAtribute(atribute);
        }
        return atributesArray;
    }
}
