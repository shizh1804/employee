package com.example.demo.Controller;

import com.example.demo.Model.TVservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/tvservice")
public class TVserviceController {

    @GetMapping
    public List<TVservice> getAll(){
    List<TVservice> list=new ArrayList<>();
        Calendar c =Calendar.getInstance();
        System.out.println(c);
        c.set(2016,Calendar.OCTOBER,2,0,0);
        TVservice tVservice=new TVservice();
        tVservice.setName("王者归来");
        tVservice.setTime(c.getTime());
        list.add(tVservice);
        return list;
    }







}
