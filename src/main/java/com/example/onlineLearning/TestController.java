package com.example.onlineLearning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/11/03/11:05
 * @Description: 致敬
 */
@RestController
@RequestMapping("")
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "test success!";
    }
}
