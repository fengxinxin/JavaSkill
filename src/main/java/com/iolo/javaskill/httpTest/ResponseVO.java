package com.iolo.javaskill.httpTest;

import java.util.List;

/**
 * 数据中心返回值 返回体
 *
 * @author Fengxinxin
 * @date 2019-04-15
 */
public class ResponseVO {
    /**
     * 状态
     */
    private int ok;

    /**
     * 内容
     */
    private List<DS> ds;

    public int getOk() {
        return ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }

    public List<DS> getDs() {
        return ds;
    }

    public void setDs(List<DS> ds) {
        this.ds = ds;
    }
}
