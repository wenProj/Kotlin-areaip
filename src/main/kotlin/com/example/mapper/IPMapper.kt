package com.example.mapper

import org.apache.ibatis.annotations.Mapper
import com.example.pojo.IP

@Mapper
interface IPMapper {
	fun selectList(): Array<IP>
}