package com.august.hang_around.req;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author august
 */
public class GoodsManageSaveReq extends PageReq {
    private Long gid;
    @NotEmpty(message = "【商品名称】不能为空")
    private String gname;
    @NotEmpty(message = "【商品分类】不能为空")
    private String gtype;
    @NotNull(message = "【商品价格】不能为空")
    private BigDecimal gprice;
    @NotEmpty(message = "【商品库存】不能为空")
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
        return "GoodsManageSaveReq{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gtype='" + gtype + '\'' +
                ", gprice=" + gprice +
                ", gstock='" + gstock + '\'' +
                ", uid=" + uid +
                '}';
    }
}
