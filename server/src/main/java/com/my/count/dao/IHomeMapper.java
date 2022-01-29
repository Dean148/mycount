package com.my.count.dao;

import com.my.count.model.HomeDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IHomeMapper {
    List<HomeDto> labels();

    boolean add(HomeDto dto);
}
