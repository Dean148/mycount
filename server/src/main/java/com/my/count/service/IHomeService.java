package com.my.count.service;

import com.my.count.model.HomeDto;

import java.util.List;

public interface IHomeService {
    List<HomeDto> labels();

    boolean add(HomeDto dto);
}
