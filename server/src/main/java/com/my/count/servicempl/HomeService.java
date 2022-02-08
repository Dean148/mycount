package com.my.count.servicempl;

import com.my.count.dao.IHomeMapper;
import com.my.count.model.HomeDto;
import com.my.count.resdto.ListResult;
import com.my.count.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService implements IHomeService {

    @Autowired
    IHomeMapper mapper;

    @Override
    public ListResult labels() {
        ListResult result = new ListResult();
        result.setList(mapper.labels());
        result.setCount(mapper.num());
        return result;
    }

    @Override
    public boolean add(HomeDto dto) {
        return mapper.add(dto);
    }
}
