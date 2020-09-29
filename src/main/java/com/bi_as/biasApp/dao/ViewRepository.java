package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ViewRepository extends JpaRepository<View,Integer> {
    View findByName(String viewName);

    @Query(value = "select * from view where id_view=?1 LIMIT 1",nativeQuery = true)
    View findByIdView(int idView);
}
