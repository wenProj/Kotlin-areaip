package com.example.service

import org.springframework.stereotype.Service
import javax.annotation.Resource
import com.example.mapper.IPMapper
import com.example.pojo.IP

@Service(value="iPService")
class IPServiceImpl:IPService {
	@Resource
    lateinit var iPMapper:IPMapper
	
	//查询所有
    override fun selectList(): Any{
		val mapTemp = mapOf<String ,Any>(Pair("ips",""),Pair("sum",""))
		val map = mapTemp.toMutableMap()//转为可变map
		
		var ips:Array<IP> = iPMapper.selectList()
		map["ips"] = ips;
		
		var sum:Long = 0//计算总访问量
		for((id,areaOrigin,areaCountry,areaProvince,areaCity,accessCount,lastAccessIp,updateTime,logDate) in ips){//解构
			sum += accessCount
		}
		map["sum"] = sum;
		
		return map
		
	}
}	