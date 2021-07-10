package com.august.hang_around.resp;

import java.util.List;

/**
 * @author august
 * 最终需要返回的类型是变化的，使用泛型比较好
 * 用PageResp来返回数据
 *  currentPage;	//当前页数(从1开始)
 *  pages; //总共页数
 * total, //总共有多少记录数
 */
public class PageResp<T> {
    private long total;

    private List<T> list;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageResp{" +
                "total=" + total +
                ", list=" + list +
                '}';
    }
}
