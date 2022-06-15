package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.TypePaiementMarche;
import com.ird.faa.ws.rest.provided.vo.TypePaiementMarcheVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypePaiementMarcheAdminService extends AbstractService<TypePaiementMarche,Long,TypePaiementMarcheVo>{





/**
    * delete TypePaiementMarche from database
    * @param id - id of TypePaiementMarche to be deleted
    *
    */
    int deleteById(Long id);









}
