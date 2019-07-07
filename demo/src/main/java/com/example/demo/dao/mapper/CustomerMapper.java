/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: CustomerMapper
 * Author:   IT002
 * Date:     2018/9/13 15:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.dao.mapper;
import com.example.demo.dao.entity.Customer;
import com.example.demo.dao.mapper.base.BaseMapper;
import com.example.demo.domain.CustomerExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @author IT002
 * @create 2018/9/13
 * @since 1.0.0
 */

public interface CustomerMapper extends BaseMapper<Customer> {
    /**
     * 插入一条记录
     * @return
     */
    int insertbean(Customer Customer) throws Exception;

    /**
     * 插入多条记录
     * @return
     */
    int batchInsert(List<Customer> Customer) throws Exception;

    /**
     * 删除记录
     * @return
     */
    int deleteById(@Param("customerId") long id) throws Exception;

    /**
     * 删除记录
     * @return
     */
    int deleteExtByExample(@Param("example") CustomerExample example) throws Exception;

    /**
     * 删除多条记录
     * @return
     */
    int deleteIn(String ids) throws Exception;

    /**
     * 更新一条记录
     * @return
     */
    int updateById(Customer obj) throws Exception;


    /**
     * 更新记录
     * @return
     */
    int updateExtByExample(@Param("example") CustomerExample example) throws Exception;

    /**
     * 批量更新记录
     * @return
     */
    int batchUpdate(List<Customer> Customer) throws Exception;


    /**
     * 通过组合条件获取记录
     * @return
     */
    List<Customer> selectExtByExample(@Param("example") CustomerExample example) throws Exception;

    /**
     * 通过条件获取一条记录
     * @return
     */
    Customer selectOneByExample(@Param("example") CustomerExample example) throws Exception;

    /**
     * 通过条件获取多条记录
     * @return
     */
    int selectIn(String ids) throws Exception;

    /**
     * 通过条件获取记录数
     * @return
     */
    int countByExample(@Param("example") CustomerExample example) throws Exception;

    /**
     * 通过分页条件获取记录数
     * @return
     */
    int pageCountBy(@Param("example") CustomerExample example) throws Exception;
}
