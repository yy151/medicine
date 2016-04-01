package com.yubin.service;

import com.yubin.model.Drug;
import com.yubin.model.DrugClass;
import com.yubin.model.Result;


/**
 * Created by percent on 16/3/29.
 */
public interface DrugService extends BaseService<Drug>{

    /**
     * 药品分类API接口，取得药品的分类。药品分类有两级，可以通过第一级的ID取得下级的药品分类。
     * @return
     */
    public Result<DrugClass> listClass(long classId);

    /**
     * 药品列表API接口-通过药品分类ID，取得药品列表
     * @return
     */
    public Result<Drug> list(long classId, int page);

    /**
     * 药品名称详情API接口-通过药品名称，直接取得相关的药品信息。
     * @param name
     * @return
     */
    public Drug name(String name);

    /**
     * 药品国药准字接口，通过国药准字，取得药品信息，生产厂家等。
     * @param number
     * @return
     */
    public Drug number(String number);

    /**
     * 药品国条形码接口，通过商品条形码，取得药品信息，生产厂家等。
     * @param code
     * @return
     */
    public Drug code(String code);

    /**
     * 药品信息搜索接口，通过相关的关键词，搜索需要的药品结果。固定Map要加上name为drug
     * @param keywords
     * @return
     */
    public Result<Drug> search(String keywords);

}
