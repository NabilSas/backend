package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CategorieCharge;
import com.ird.faa.ws.rest.provided.vo.CategorieChargeVo;

@Component
public class CategorieChargeConverter extends AbstractConverter<CategorieCharge,CategorieChargeVo>{


public  CategorieChargeConverter(){
init(true);
}

@Override
public CategorieCharge toItem(CategorieChargeVo vo) {
if (vo == null) {
return null;
} else {
CategorieCharge item = new CategorieCharge();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
        if(StringUtil.isNotEmpty(vo.getDescription()))
        item.setDescription(vo.getDescription());
        if(StringUtil.isNotEmpty(vo.getCode()))
        item.setCode(NumberUtil.toLong(vo.getCode()));
        if(StringUtil.isNotEmpty(vo.getType()))
        item.setType(vo.getType());
            if(vo.getArchive() != null)
            item.setArchive(vo.getArchive());
        if(StringUtil.isNotEmpty(vo.getDateArchivage()))
        item.setDateArchivage(DateUtil.parse(vo.getDateArchivage()));
        if(StringUtil.isNotEmpty(vo.getDateCreation()))
        item.setDateCreation(DateUtil.parse(vo.getDateCreation()));


return item;
}
}

@Override
public CategorieChargeVo toVo(CategorieCharge item) {
if (item == null) {
return null;
} else {
CategorieChargeVo vo = new CategorieChargeVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

        if(StringUtil.isNotEmpty(item.getDescription()))
        vo.setDescription(item.getDescription());

        if(item.getCode()!=null)
        vo.setCode(NumberUtil.toString(item.getCode()));

        if(StringUtil.isNotEmpty(item.getType()))
        vo.setType(item.getType());

        if(item.getArchive()!=null)
        vo.setArchive(item.getArchive());
        if(item.getDateArchivage()!=null)
        vo.setDateArchivage(DateUtil.formateDate(item.getDateArchivage()));
        if(item.getDateCreation()!=null)
        vo.setDateCreation(DateUtil.formateDate(item.getDateCreation()));

return vo;
}
}

public void init(Boolean value) {
}



















}
