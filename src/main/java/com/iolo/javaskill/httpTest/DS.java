package com.iolo.javaskill.httpTest;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 数据中心返回值车辆信息
 *
 * @author Fengxinxin
 * @date 2019-04-15
 */
public class DS {
    /**
     * 车牌号
     */
    private String CPH;

    /**
     * 车辆识别代号
     */
    private String VIN;

    /**
     * 登记日期
     */
    private String DATE;

    /**
     * 车辆名称
     */
    private String CLMC;

    /**
     * 车辆品牌
     */
    private String clpp;

    /**
     * 车辆型号
     */
    private String CLXH;

    /**
     * 发送机号
     */
    private String FDJH;

    /**
     * 额定载客
     */
    private String EDZK;

    /**
     * 排量
     */
    private String PL;

    /**
     * 车型大分类
     */
    private String CXDFL;

    /**
     * 承保时间
     */
    private String YEAR_DATE;

    /**
     * 上险省份
     */
    private String PROVINCE;

    /**
     * 上险城市
     */
    private String CITY;

    /**
     * 二手车交易次数
     */
    private String USED_CAR_NUM;

    @JsonProperty("CPH")
    public String getCPH() {
        return CPH;
    }

    public void setCPH(String CPH) {
        this.CPH = CPH;
    }

    @JsonProperty("VIN")
    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    @JsonProperty("DATE")
    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    @JsonProperty("CLMC")
    public String getCLMC() {
        return CLMC;
    }

    public void setCLMC(String CLMC) {
        this.CLMC = CLMC;
    }

    @JsonProperty("CLPP")
    public String getClpp() {
        return clpp;
    }

    public void setClpp(String clpp) {
        this.clpp = clpp;
    }

    @JsonProperty("CLXH")
    public String getCLXH() {
        return CLXH;
    }

    public void setCLXH(String CLXH) {
        this.CLXH = CLXH;
    }

    @JsonProperty("FDJH")
    public String getFDJH() {
        return FDJH;
    }

    public void setFDJH(String FDJH) {
        this.FDJH = FDJH;
    }

    @JsonProperty("EDZK")
    public String getEDZK() {
        return EDZK;
    }

    public void setEDZK(String EDZK) {
        this.EDZK = EDZK;
    }

    @JsonProperty("PL")
    public String getPL() {
        return PL;
    }

    public void setPL(String PL) {
        this.PL = PL;
    }

    @JsonProperty("CXDFL")
    public String getCXDFL() {
        return CXDFL;
    }

    public void setCXDFL(String CXDFL) {
        this.CXDFL = CXDFL;
    }

    @JsonProperty("YEAR_DATE")
    public String getYEAR_DATE() {
        return YEAR_DATE;
    }

    public void setYEAR_DATE(String YEAR_DATE) {
        this.YEAR_DATE = YEAR_DATE;
    }

    @JsonProperty("PROVINCE")
    public String getPROVINCE() {
        return PROVINCE;
    }

    public void setPROVINCE(String PROVINCE) {
        this.PROVINCE = PROVINCE;
    }

    @JsonProperty("CITY")
    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    @JsonProperty("USED_CAR_NUM")
    public String getUSED_CAR_NUM() {
        return USED_CAR_NUM;
    }

    public void setUSED_CAR_NUM(String USED_CAR_NUM) {
        this.USED_CAR_NUM = USED_CAR_NUM;
    }
}
