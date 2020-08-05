package com.example.sptdemoweb1.dao;

import com.example.sptdemoweb1.pojo.Khmc;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface IndexDao {
    @Select("select * from khmc")
    public List<Khmc> getALl();
}
