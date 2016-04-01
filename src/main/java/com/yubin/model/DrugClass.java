package com.yubin.model;

/**
 * Created by percent on 16/1/21.
 */
public class DrugClass {
    private int id;
    private int drugclass; //上级分类ID，0为定级
    private String name;//分类名称
    private String title;//分类的标题
    private String keywords;//关键字
    private String description;//简介
    private int seq;//排序 从0。。。。10开始

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrugclass() {
        return drugclass;
    }

    public void setDrugclass(int drugclass) {
        this.drugclass = drugclass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}
