package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class county extends LitePalSupport {
    private int id;
    private String countyNmae;  //记录县的名字
    private String wratherId;  //记录县对应天气的id
    private int cityId;  //记录当前县所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyNmae() {
        return countyNmae;
    }

    public void setCountyNmae(String countyNmae) {
        this.countyNmae = countyNmae;
    }

    public String getWratherId() {
        return wratherId;
    }

    public void setWratherId(String wratherId) {
        this.wratherId = wratherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
