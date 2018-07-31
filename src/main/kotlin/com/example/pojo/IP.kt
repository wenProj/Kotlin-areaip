package com.example.pojo

import java.util.Date
import java.sql.Timestamp

data class IP (
	val id:Long,
	val areaOrigin:String?=null,
	val areaCountry:String?=null,
	val areaProvince:String?=null,
	val areaCity:String?=null,
	val accessCount:Long,//不能为null  IPServiceImpl要求和
	val lastAccessIp:String?=null,
	val updateTime:Timestamp?=null,
	val logDate:Timestamp?=null
)