package com.example.service

import org.springframework.stereotype.Service
import com.example.pojo.IP

@Service
interface IPService {
	//查询所有
    fun selectList(): Any
	
}