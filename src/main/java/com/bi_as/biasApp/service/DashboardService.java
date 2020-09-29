package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.DashboardRepository;
import com.bi_as.biasApp.domain.Dashboard;
import com.bi_as.biasApp.domain.User;
import com.bi_as.biasApp.dto.DashboardDto;
import com.bi_as.biasApp.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DashboardService {
    DashboardRepository dashboardRepository;
    UserService userService;

    @Autowired
    public DashboardService(DashboardRepository dashboardRepository,UserService userService) {
        this.dashboardRepository = dashboardRepository;
        this.userService=userService;
    }

    public List<DashboardDto> findAllDashboard(){
        List<DashboardDto> dashboardDtoList=new ArrayList<>();
        for(Dashboard dashboard:dashboardRepository.findAll()){
            dashboardDtoList.add(new DashboardDto(dashboard));
        }
        return dashboardDtoList;
    }

    public Dashboard addDashboard(DashboardDto dashboardDto) {
        User user=userService.getUserByid(dashboardDto.getIdUser());
        Dashboard dashboard=new Dashboard();
        dashboard.setIdDashboard(dashboardDto.getIdDashboard());
        dashboard.setName(dashboardDto.getName());
        dashboard.setTxUser(dashboardDto.getTxUser());
        dashboard.setTxHost(dashboardDto.getTxHost());
        dashboard.setTxDate(dashboardDto.getTxDate());
        dashboard.setUserIdUser(user);
        dashboardRepository.save(dashboard);
        return dashboard;
    }

    public Dashboard getDashboardByIdDashboard(int idDashboard){
        Dashboard dashboard=dashboardRepository.findByIdDashboard(idDashboard);
        return dashboard;
    }

    public List<DashboardDto> findDashboardListByUserIdWithDashboardDtoParameter(int idUser){

        return findDashboardListByUserId(idUser);
    }

    public List<DashboardDto> findDashboardListByUserId(int idUser){
        List<DashboardDto> dashboardDtoList=new ArrayList<>();
        User user=userService.getUserByid(idUser);
        for(Dashboard dashboard:user.getDashboardList()){
            dashboardDtoList.add(new DashboardDto(dashboard));
        }
        return dashboardDtoList;
    }
}
