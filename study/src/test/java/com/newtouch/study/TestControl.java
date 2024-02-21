package com.newtouch.study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/test")
public class TestControl {

    @GetMapping("/test")
    public Map<String,Object> test()  {

        Map<String, Object> map = new HashMap<>();
        map.put("test","ok");


        return map;
    }

}
