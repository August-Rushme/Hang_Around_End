package com.august.hang_around.domain;

public class UGoods {
    private Long gid;

    private String gname;

    private String gtype;

    private String gprice;

    private String gstock;

    private Integer uid;

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }

    public String getGprice() {
        return gprice;
    }

    public void setGprice(String gprice) {
        this.gprice = gprice;
    }

    public String getGstock() {
        return gstock;
    }

    public void setGstock(String gstock) {
        this.gstock = gstock;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gid=").append(gid);
        sb.append(", gname=").append(gname);
        sb.append(", gtype=").append(gtype);
        sb.append(", gprice=").append(gprice);
        sb.append(", gstock=").append(gstock);
        sb.append(", uid=").append(uid);
        sb.append("]");
        return sb.toString();
    }
}