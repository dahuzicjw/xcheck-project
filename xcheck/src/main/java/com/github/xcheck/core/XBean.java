package com.github.xcheck.core;

import com.github.xcheck.core.item.CheckItem;

import java.util.List;
import java.util.Map;

public class XBean {

    private Map<String, String> fieldAlias;
    private List<CheckItem> checkItems;
    private boolean hasPathParam;
    private String[] urls;

    public XBean(Map<String, String> fieldAlias, List<CheckItem> checkItems, boolean hasPathParam, String[] urls) {
        this.fieldAlias = fieldAlias;
        this.checkItems = checkItems;
        this.hasPathParam = hasPathParam;
        this.urls = urls;
    }

    public Map<String, String> getFieldAlias() {
        return fieldAlias;
    }
    public List<CheckItem> getCheckItems() {
        return checkItems;
    }
    public void setFieldAlias(Map<String, String> fieldAlias) {
        this.fieldAlias = fieldAlias;
    }
    public void setCheckItems(List<CheckItem> checkItems) {
        this.checkItems = checkItems;
    }
    public boolean hasPathParam() {
        return hasPathParam;
    }
    public String[] getUrls() {
        return urls;
    }
    public void setUrls(String[] urls) {
        this.urls = urls;
    }
}