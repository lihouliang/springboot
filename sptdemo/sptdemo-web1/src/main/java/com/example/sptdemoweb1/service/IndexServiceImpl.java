package com.example.sptdemoweb1.service;

import com.example.sptdemobase.util.TestUtils;
import com.example.sptdemoweb1.dao.IndexDao;
import com.example.sptdemoweb1.pojo.Khmc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexDao indexDao;
    @Override
    public List<Khmc> getAll() {
        System.out.print("service");
        TestUtils.show();
        return indexDao.getALl();
    }
}
