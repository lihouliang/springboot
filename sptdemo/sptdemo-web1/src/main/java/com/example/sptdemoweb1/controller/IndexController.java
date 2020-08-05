package com.example.sptdemoweb1.controller;

import com.example.sptdemoweb1.pojo.Khmc;
import com.example.sptdemoweb1.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private IndexService indexService;

    @RequestMapping("test.do")
    @ResponseBody
    public boolean get(){
        return  false;
    }

    @RequestMapping("index")
    public String index(){
        return  "web1";
    }

    @RequestMapping("getkhmc.do")
    @ResponseBody
    public List<Khmc> getKhmc(){
        return indexService.getAll();
    }
}
