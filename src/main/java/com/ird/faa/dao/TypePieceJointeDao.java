package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypePieceJointe;


@Repository
public interface TypePieceJointeDao extends JpaRepository<TypePieceJointe,Long> {




    TypePieceJointe findByCode(String code);

    int deleteByCode(String code);



}
