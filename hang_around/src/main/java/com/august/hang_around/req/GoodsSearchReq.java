package com.august.hang_around.req;

/**
 * @author august
 */
public class GoodsSearchReq extends PageReq {
private int id;
private String query;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return "GoodsSearchReq{" +
                "id=" + id +
                ", query='" + query + '\'' +
                '}';
    }
}
