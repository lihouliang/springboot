package com.example.sptdemoweb1.pojo;

import java.io.Serializable;

public class Khmc implements Serializable {
    private long khmc_id;
    private String khmc_name;

    public long getKhmc_id() {
        return khmc_id;
    }

    public void setKhmc_id(long khmc_id) {
        this.khmc_id = khmc_id;
    }

    public String getKhmc_name() {
        return khmc_name;
    }

    public void setKhmc_name(String khmc_name) {
        this.khmc_name = khmc_name;
    }
}
