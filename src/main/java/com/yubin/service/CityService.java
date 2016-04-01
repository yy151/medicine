package com.yubin.service;

import com.yubin.model.Area;

import java.util.List;

/**
 * Created by percent on 16/3/29.
 */
public interface CityService extends BaseService<Area>{

    /**
     * 获取省份的城市,33为福建
     * @param provinceId
     * @return
     */
    public List<Area> getList(long provinceId);
}
