package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CategorieEmploye;


@Repository
public interface CategorieEmployeDao extends JpaRepository<CategorieEmploye,Long> {




    CategorieEmploye findByCode(String code);

    int deleteByCode(String code);



}
