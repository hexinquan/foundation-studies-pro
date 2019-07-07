package com.example.demo.dao.mapper.base;

import com.example.demo.dao.entity.base.BaseEntity;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface TkBaseMapper<T extends BaseEntity> extends tk.mybatis.mapper.common.BaseMapper<T>
	,ExampleMapper<T>,MySqlMapper<T> {

}
