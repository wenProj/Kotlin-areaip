package com.example.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import javax.annotation.Resource
import com.example.service.IPService
import com.example.pojo.IP

@RestController
class IPController() {
	@Resource
    lateinit var iPService:IPService;
	
    @RequestMapping("/ip")
	@ResponseBody
    fun ipList(): Any {
        var map:Any = iPService.selectList()
//		println("++++++++++++++++++++++++++++++"+map);
        return map
    }
	
	//跳转ip.html
//    @RequestMapping("/ip")
//    fun ip(): String {
//        return "ip.html"
//    }
}