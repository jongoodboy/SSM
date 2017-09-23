package com.zkc.dao;

import com.zkc.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by wangJH on 2017/9/23.
 */
@Repository
public interface TestDao {
    public User findUser();
}
