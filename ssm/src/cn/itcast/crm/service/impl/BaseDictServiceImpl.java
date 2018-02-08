package cn.itcast.crm.service.impl;

import cn.itcast.crm.mapper.BaseDictMapper;
import cn.itcast.crm.pojo.BaseDict;
import cn.itcast.crm.mapper.BaseDictMapper;
import cn.itcast.crm.service.BaseDictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService {

    @Resource
    private BaseDictMapper baseDictMapper;

    @Override
    public List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode) {
        List<BaseDict> list = baseDictMapper.queryBaseDictByDictTypeCode(dictTypeCode);
        return list;
    }
}
