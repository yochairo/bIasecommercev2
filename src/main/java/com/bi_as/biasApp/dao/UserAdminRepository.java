package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.UserAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAdminRepository extends JpaRepository<UserAdmin,Integer> {
}
