package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.EtatLot;
import com.ird.faa.ws.rest.provided.vo.EtatLotVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface EtatLotAdminService extends AbstractService<EtatLot,Long,EtatLotVo>{





/**
    * delete EtatLot from database
    * @param id - id of EtatLot to be deleted
    *
    */
    int deleteById(Long id);









}
