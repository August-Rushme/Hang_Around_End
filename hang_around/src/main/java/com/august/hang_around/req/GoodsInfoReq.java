package com.august.hang_around.req;

/**
 * @author august
 */
public class GoodsInfoReq extends PageReq {
private Long id;
private Long uid;
private String query;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getQuery() {
        return query;
    }

    @Override
    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "GoodsInfoReq{" +
                "id=" + id +
                ", uid=" + uid +
                ", query='" + query + '\'' +
                '}';
    }
}
