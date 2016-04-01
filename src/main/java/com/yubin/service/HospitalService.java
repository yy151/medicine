package com.yubin.service;

import com.yubin.model.Hospital;
import com.yubin.model.Result;

/**
 * Created by percent on 16/3/29.
 */
public interface HospitalService extends BaseService<Hospital>{

    public Result<Hospital> list(long cityId);

    /**
     * 周边医院列表API接口-天狗医院定位列表接口
     */
    public Result<Hospital> location(double x, double y, int page);

    /**
     * 医院详情API接口-天狗医院详情开放接口
     */
    public Hospital show(long hostpitalId);

    /**
     * 医院名称详情API接口-天狗医院详情开放接口
     * @param hostpitalName
     * @return
     */
    public Hospital name(String hostpitalName);


}
