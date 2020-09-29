package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.ViewRepository;
import com.bi_as.biasApp.domain.Dashboard;
import com.bi_as.biasApp.domain.View;
import com.bi_as.biasApp.dto.DashboardDto;
import com.bi_as.biasApp.dto.ViewDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViewService {

    ViewRepository viewRepository;
    DashboardService dashboardService;

    @Autowired
    public ViewService(ViewRepository viewRepository,DashboardService dashboardService) {
        this.viewRepository = viewRepository;
        this.dashboardService=dashboardService;
    }

    public List<ViewDto> findAllViews(){
        List<ViewDto> viewDtoList= new ArrayList<>();
        for (View view:viewRepository.findAll()){
            viewDtoList.add(new ViewDto(view));
        }
        return viewDtoList;
    }


    public View addView(ViewDto viewDto){
        View view=new View();
        Dashboard dashboard=dashboardService.getDashboardByIdDashboard(viewDto.getIdDashboard());
        view.setIdView(viewDto.getIdView());
        view.setName(viewDto.getName());
        view.setActive(viewDto.getActive());
        view.setTxUser(viewDto.getTxUser());
        view.setTxDate(viewDto.getTxDate());
        view.setTxHost(viewDto.getTxHost());
        view.setDashboardiddashboard(dashboard);
//        view.se
        viewRepository.save(view);
        return view;
    }

    public View getViewByidView(int idView){
//        View view= viewRepository.findByName("MiVista1c");
        View view= viewRepository.findByIdView(idView);
        if(view==null){
            System.out.println("Es null la vista");
        }
        return view;
    }

    public List<ViewDto> findViewByIdDashboardWithViewDtoParameter(int idDashboard){
        return findViewByIdDashboard(idDashboard);
    }

    public List<ViewDto> findViewByIdDashboard(int idDashboard){
        List<ViewDto> viewDtoList=new ArrayList<>();
        Dashboard dashboard=dashboardService.getDashboardByIdDashboard(idDashboard);
        for(View view:dashboard.getViewList()){
            viewDtoList.add(new ViewDto(view));
        }
        return viewDtoList;
    }
}
