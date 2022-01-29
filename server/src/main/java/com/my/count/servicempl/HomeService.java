package com.my.count.servicempl;

import com.my.count.dao.IHomeMapper;
import com.my.count.model.HomeDto;
import com.my.count.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService implements IHomeService {

    @Autowired
    IHomeMapper mapper;

    @Override
    public List<HomeDto> labels() {
        return mapper.labels();
    }

    @Override
    public boolean add(HomeDto dto) {
        return mapper.add(dto);
    }
}
