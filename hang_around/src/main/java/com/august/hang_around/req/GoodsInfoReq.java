package com.august.hang_around.req;

/**
 * @author august
 */
public class GoodsInfoReq extends PageReq {
private String id;
private String query;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
                "id='" + id + '\'' +
                ", query='" + query + '\'' +
                '}';
    }
}
