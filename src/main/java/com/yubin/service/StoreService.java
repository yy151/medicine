package com.yubin.service;

import com.yubin.model.Hospital;
import com.yubin.model.Result;
import com.yubin.model.Store;

/**
 * Created by percent on 16/3/29.
 */
public interface StoreService extends BaseService<Store>{

    /**
     * 药房药店列表API接口-天狗药店分类列表接口
     * @param cityId
     * @param page
     * @return
     */
    public Result<Store> list(long cityId, int page);

    /**
     * 周边药店列表API接口-天狗药店定位列表接口
     */
    public Result<Hospital> location(double x, double y, int page);

    /**
     * 药房药店详情API接口-天狗药店详情开放接口
     * @param storeId
     * @return
     */
    public Hospital show(long storeId);

    /**
     * 药店名称详情API接口-天狗药店详情开放接口
     * @param storeId
     * @return
     */
    public Hospital name(long storeId);
}
