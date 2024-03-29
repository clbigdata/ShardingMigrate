package com.sharding.migrate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sharding.migrate.domain.TOrder;
import com.sharding.migrate.domain.request.OrderReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TOrderMapper extends BaseMapper<TOrder> {
    List<TOrder> selectList();

    TOrder selectOne(OrderReq orderReq);
}