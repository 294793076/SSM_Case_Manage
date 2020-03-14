package com.ssm.dao;

import com.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {

    @Select("select * from ssm_case.product where id =#{id}")
    public Product findById(String id) throws Exception;

    @Select("select * from ssm_case.product ")
    public List<Product> findAll() throws Exception;

    @Insert("insert into ssm_case.product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
}
