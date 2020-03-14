package com.ssm.dao;

import com.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

public interface IMemberDao {

    @Select("select * from ssm_case.member where id=#{id}")
    public Member findById(String id) throws Exception;
}
