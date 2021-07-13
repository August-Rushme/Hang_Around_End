package com.august.hang_around.resp;

import java.math.BigDecimal;

/**
 * @author 战神
 */
public class GoodsSearchResp {
    private String id;

    private String name;

    private String type;

    private String color;

    private String old;

    private String use;

    private String others;

    private BigDecimal price;

    private String range;

    private String imgSrc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
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
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", color=").append(color);
        sb.append(", old=").append(old);
        sb.append(", use=").append(use);
        sb.append(", others=").append(others);
        sb.append(", price=").append(price);
        sb.append(", range=").append(range);
        sb.append(", imgSrc=").append(imgSrc);
        sb.append("]");
        return sb.toString();
    }
}
