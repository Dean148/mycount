package com.my.count.controller;

import com.my.count.model.HomeDto;
import com.my.count.reqdto.Querydto;
import com.my.count.resdto.ListResult;
import com.my.count.service.IHomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/home")
@Api(tags = "首页")
public class Home {

    @Autowired
    IHomeService homeService;

    @GetMapping("/list")
    @ApiOperation("列表查询")
    public ResponseEntity<ListResult> list(){

        return ResponseEntity.ok(homeService.labels());
    }

    @PostMapping("/add")
    @ApiOperation("添加")
    public ResponseEntity<Boolean> add(@RequestBody HomeDto dto){
        return ResponseEntity.ok(homeService.add(dto));
    }
}
