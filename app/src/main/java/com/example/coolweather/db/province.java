package com.example.coolweather.db;
import org.litepal.crud.LitePalSupport;
public class province extends LitePalSupport {
    private int id;  //实体类id
    private String provinceName;  //记录省的名字
    private int provinceCode;  //记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
