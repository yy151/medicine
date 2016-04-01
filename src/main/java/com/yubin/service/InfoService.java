package com.yubin.service;

import com.yubin.model.Info;
import com.yubin.model.InfoClass;
import com.yubin.model.Result;

import java.util.List;

/**
 * Created by percent on 16/3/29.
 */
public interface InfoService extends BaseService<Info>{

    /**
     * 健康资讯类接口，取得健康资讯分类：企业要闻\医疗新闻\生活贴士\药品新闻\食品新闻\社会热点\疾病快讯
     * @return
     */
    public Result<InfoClass> listClass();

    /**
     * 健康资讯列表，通过分类的ID，取得该分类下的健康新闻。
     * @param classId
     * @param rows
     * @return
     */
    public Result<Info> listByClassId(long classId, int rows);

    /**
     * 最新健康资讯,通过当前最新的ID，取得最新的新闻列表，通过该方法可以做到数据的不重复！
     */
    public Result<Info> listByNews(long hotId, int classify, int rows);

    /**
     * 健康资讯信息，通过健康资讯的id，取得数据详情。
     * @param id
     * @return
     */
    public Info show(long id);
}
