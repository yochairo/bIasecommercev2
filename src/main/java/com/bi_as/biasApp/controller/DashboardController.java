package com.bi_as.biasApp.controller;

import com.bi_as.biasApp.domain.Dashboard;
import com.bi_as.biasApp.domain.User;
import com.bi_as.biasApp.dto.DashboardDto;
import com.bi_as.biasApp.dto.UserDto;
import com.bi_as.biasApp.service.DashboardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/dashboard")
public class DashboardController {


    private  DashboardService dashboardService;
    private static final Logger LOGGER= LoggerFactory.getLogger(UserController.class);


    @Autowired
    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    List<DashboardDto> all(){
        List<DashboardDto> dashboardDtoList=new ArrayList<>();
        for(DashboardDto dashboardDto:dashboardService.findAllDashboard()){
            dashboardDtoList.add(dashboardDto);
        }
        return dashboardDtoList;
    }

    @RequestMapping(/*value =*/"/userdash/{id}"/*,method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE*/)
    public List<DashboardDto> getAllDashboardsByIdUser(@PathVariable("id") Integer idUser){
        return dashboardService.findDashboardListByUserIdWithDashboardDtoParameter(idUser);
    }

    @PostMapping("/add/")
    public Dashboard addView(@RequestBody DashboardDto dashboard){
        LOGGER.info("Agregando usuario");
        return dashboardService.addDashboard(dashboard);
    }

    @RequestMapping("/{id}")
    public DashboardDto getDashboardByIdDash(@PathVariable("id") Integer idDashboard){
        LOGGER.info("Agregando usuario");
        return new DashboardDto(dashboardService.getDashboardByIdDashboard(idDashboard));
    }

}
