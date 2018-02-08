package cn.itcast.crm.service;

import cn.itcast.crm.pojo.BaseDict;

import java.util.List;

public interface BaseDictService {
    /**
     *  根据类别代码查询
     *
     *  @param dictTypeCode
     *  @return
     */
    List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode);
}
