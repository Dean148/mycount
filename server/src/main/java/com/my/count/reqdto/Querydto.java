package com.my.count.reqdto;

import io.swagger.annotations.ApiModelProperty;

public class Querydto {
    @ApiModelProperty(value = "关键字")
    String keyword;
    @ApiModelProperty(value = "类型")
    String type;

    @ApiModelProperty(value = "页码（从1开始）")
    int page;
    @ApiModelProperty(value = "每页数量")
    int num;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
