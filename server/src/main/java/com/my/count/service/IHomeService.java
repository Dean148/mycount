package com.my.count.service;

import com.my.count.model.HomeDto;
import com.my.count.resdto.ListResult;

import java.util.List;

public interface IHomeService {
    ListResult labels();

    boolean add(HomeDto dto);
}
