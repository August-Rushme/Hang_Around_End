package com.august.hang_around.resp;

import java.math.BigDecimal;

/**
 * @author 战神
 */
public class GoodsManageSaveResp {
    private Long gid;

    private String gname;

    private String gtype;

    private BigDecimal gprice;

    private String gstock;

    private Long uid;

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

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "GoodsManageSaveResp{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gtype='" + gtype + '\'' +
                ", gprice=" + gprice +
                ", gstock='" + gstock + '\'' +
                ", uid=" + uid +
                '}';
    }
}
