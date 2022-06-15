package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CategorieEmploye;
import com.ird.faa.ws.rest.provided.vo.CategorieEmployeVo;

@Component
public class CategorieEmployeConverter extends AbstractConverter<CategorieEmploye,CategorieEmployeVo>{


public  CategorieEmployeConverter(){
init(true);
}

@Override
public CategorieEmploye toItem(CategorieEmployeVo vo) {
if (vo == null) {
return null;
} else {
CategorieEmploye item = new CategorieEmploye();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
        if(StringUtil.isNotEmpty(vo.getCode()))
        item.setCode(vo.getCode());
        if(StringUtil.isNotEmpty(vo.getDescription()))
        item.setDescription(vo.getDescription());


return item;
}
}

@Override
public CategorieEmployeVo toVo(CategorieEmploye item) {
if (item == null) {
return null;
} else {
CategorieEmployeVo vo = new CategorieEmployeVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

        if(StringUtil.isNotEmpty(item.getCode()))
        vo.setCode(item.getCode());

        if(StringUtil.isNotEmpty(item.getDescription()))
        vo.setDescription(item.getDescription());


return vo;
}
}

public void init(Boolean value) {
}











}
