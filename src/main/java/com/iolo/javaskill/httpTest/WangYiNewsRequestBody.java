package com.iolo.javaskill.httpTest;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author Fengxinxin
 * @date 2019-06-19
 */
public class WangYiNewsRequestBody {
    public String page;

    public String count;

    public WangYiNewsRequestBody() {
    }

    public WangYiNewsRequestBody(String page, String count) {
        this.page = page;
        this.count = count;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
