package com.august.hang_around.resp;

import java.math.BigDecimal;

/**
 * @author 战神
 */
public class GoodsManageResp {
    private Long gid;

    private String gname;

    private String gtype;

    private BigDecimal gprice;

    private String gstock;

    private String other;

    private Long uid;

    private String imgSrc;

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

    public BigDecimal getGprice() {
        return gprice;
    }

    public void setGprice(BigDecimal gprice) {
        this.gprice = gprice;
    }

    public String getGstock() {
        return gstock;
    }

    public void setGstock(String gstock) {
        this.gstock = gstock;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
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
        sb.append(", other=").append(other);
        sb.append(", uid=").append(uid);
        sb.append(", imgSrc=").append(imgSrc);
        sb.append("]");
        return sb.toString();
    }
}
