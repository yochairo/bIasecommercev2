package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Dashboard;
import com.bi_as.biasApp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DashboardRepository extends JpaRepository<Dashboard,Integer> {

    Dashboard findByName(String name);
    Dashboard findByActive(boolean isActive);

    List<Dashboard> findByUserIdUser(User idUser);

    @Query(value = "select * from dashboard where id_dashboar=?1 LIMIT 1",nativeQuery = true)
    Dashboard findByIdDashboard(int idDashboard);

    @Query(value = "select * from dashboard where user_id_user=?1 ",nativeQuery = true)
    List<Dashboard> getDashboardlist(int idDashboard);



}
