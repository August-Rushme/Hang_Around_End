package com.august.hang_around.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsInfoExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andOldIsNull() {
            addCriterion("`old` is null");
            return (Criteria) this;
        }

        public Criteria andOldIsNotNull() {
            addCriterion("`old` is not null");
            return (Criteria) this;
        }

        public Criteria andOldEqualTo(String value) {
            addCriterion("`old` =", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotEqualTo(String value) {
            addCriterion("`old` <>", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldGreaterThan(String value) {
            addCriterion("`old` >", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldGreaterThanOrEqualTo(String value) {
            addCriterion("`old` >=", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLessThan(String value) {
            addCriterion("`old` <", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLessThanOrEqualTo(String value) {
            addCriterion("`old` <=", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLike(String value) {
            addCriterion("`old` like", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotLike(String value) {
            addCriterion("`old` not like", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldIn(List<String> values) {
            addCriterion("`old` in", values, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotIn(List<String> values) {
            addCriterion("`old` not in", values, "old");
            return (Criteria) this;
        }

        public Criteria andOldBetween(String value1, String value2) {
            addCriterion("`old` between", value1, value2, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotBetween(String value1, String value2) {
            addCriterion("`old` not between", value1, value2, "old");
            return (Criteria) this;
        }

        public Criteria andUseIsNull() {
            addCriterion("`use` is null");
            return (Criteria) this;
        }

        public Criteria andUseIsNotNull() {
            addCriterion("`use` is not null");
            return (Criteria) this;
        }

        public Criteria andUseEqualTo(String value) {
            addCriterion("`use` =", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotEqualTo(String value) {
            addCriterion("`use` <>", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThan(String value) {
            addCriterion("`use` >", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThanOrEqualTo(String value) {
            addCriterion("`use` >=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThan(String value) {
            addCriterion("`use` <", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThanOrEqualTo(String value) {
            addCriterion("`use` <=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLike(String value) {
            addCriterion("`use` like", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotLike(String value) {
            addCriterion("`use` not like", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseIn(List<String> values) {
            addCriterion("`use` in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotIn(List<String> values) {
            addCriterion("`use` not in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseBetween(String value1, String value2) {
            addCriterion("`use` between", value1, value2, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotBetween(String value1, String value2) {
            addCriterion("`use` not between", value1, value2, "use");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("`others` is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("`others` is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(String value) {
            addCriterion("`others` =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(String value) {
            addCriterion("`others` <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(String value) {
            addCriterion("`others` >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(String value) {
            addCriterion("`others` >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(String value) {
            addCriterion("`others` <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(String value) {
            addCriterion("`others` <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLike(String value) {
            addCriterion("`others` like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotLike(String value) {
            addCriterion("`others` not like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<String> values) {
            addCriterion("`others` in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<String> values) {
            addCriterion("`others` not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(String value1, String value2) {
            addCriterion("`others` between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(String value1, String value2) {
            addCriterion("`others` not between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andImgSrcIsNull() {
            addCriterion("img_src is null");
            return (Criteria) this;
        }

        public Criteria andImgSrcIsNotNull() {
            addCriterion("img_src is not null");
            return (Criteria) this;
        }

        public Criteria andImgSrcEqualTo(String value) {
            addCriterion("img_src =", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotEqualTo(String value) {
            addCriterion("img_src <>", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcGreaterThan(String value) {
            addCriterion("img_src >", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcGreaterThanOrEqualTo(String value) {
            addCriterion("img_src >=", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcLessThan(String value) {
            addCriterion("img_src <", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcLessThanOrEqualTo(String value) {
            addCriterion("img_src <=", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcLike(String value) {
            addCriterion("img_src like", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotLike(String value) {
            addCriterion("img_src not like", value, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcIn(List<String> values) {
            addCriterion("img_src in", values, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotIn(List<String> values) {
            addCriterion("img_src not in", values, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcBetween(String value1, String value2) {
            addCriterion("img_src between", value1, value2, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andImgSrcNotBetween(String value1, String value2) {
            addCriterion("img_src not between", value1, value2, "imgSrc");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRangeIsNull() {
            addCriterion("`range` is null");
            return (Criteria) this;
        }

        public Criteria andRangeIsNotNull() {
            addCriterion("`range` is not null");
            return (Criteria) this;
        }

        public Criteria andRangeEqualTo(String value) {
            addCriterion("`range` =", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotEqualTo(String value) {
            addCriterion("`range` <>", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThan(String value) {
            addCriterion("`range` >", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThanOrEqualTo(String value) {
            addCriterion("`range` >=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThan(String value) {
            addCriterion("`range` <", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThanOrEqualTo(String value) {
            addCriterion("`range` <=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLike(String value) {
            addCriterion("`range` like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotLike(String value) {
            addCriterion("`range` not like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeIn(List<String> values) {
            addCriterion("`range` in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotIn(List<String> values) {
            addCriterion("`range` not in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeBetween(String value1, String value2) {
            addCriterion("`range` between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotBetween(String value1, String value2) {
            addCriterion("`range` not between", value1, value2, "range");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}