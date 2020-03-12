package com.xu.bean;

import java.util.ArrayList;
import java.util.List;

public class ReturnItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReturnItemExample() {
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

        public Criteria andReturnItemIdIsNull() {
            addCriterion("return_item_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdIsNotNull() {
            addCriterion("return_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdEqualTo(Long value) {
            addCriterion("return_item_id =", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdNotEqualTo(Long value) {
            addCriterion("return_item_id <>", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdGreaterThan(Long value) {
            addCriterion("return_item_id >", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("return_item_id >=", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdLessThan(Long value) {
            addCriterion("return_item_id <", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdLessThanOrEqualTo(Long value) {
            addCriterion("return_item_id <=", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdIn(List<Long> values) {
            addCriterion("return_item_id in", values, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdNotIn(List<Long> values) {
            addCriterion("return_item_id not in", values, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdBetween(Long value1, Long value2) {
            addCriterion("return_item_id between", value1, value2, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdNotBetween(Long value1, Long value2) {
            addCriterion("return_item_id not between", value1, value2, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountIsNull() {
            addCriterion("return_item_count is null");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountIsNotNull() {
            addCriterion("return_item_count is not null");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountEqualTo(Long value) {
            addCriterion("return_item_count =", value, "returnItemCount");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountNotEqualTo(Long value) {
            addCriterion("return_item_count <>", value, "returnItemCount");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountGreaterThan(Long value) {
            addCriterion("return_item_count >", value, "returnItemCount");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountGreaterThanOrEqualTo(Long value) {
            addCriterion("return_item_count >=", value, "returnItemCount");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountLessThan(Long value) {
            addCriterion("return_item_count <", value, "returnItemCount");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountLessThanOrEqualTo(Long value) {
            addCriterion("return_item_count <=", value, "returnItemCount");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountIn(List<Long> values) {
            addCriterion("return_item_count in", values, "returnItemCount");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountNotIn(List<Long> values) {
            addCriterion("return_item_count not in", values, "returnItemCount");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountBetween(Long value1, Long value2) {
            addCriterion("return_item_count between", value1, value2, "returnItemCount");
            return (Criteria) this;
        }

        public Criteria andReturnItemCountNotBetween(Long value1, Long value2) {
            addCriterion("return_item_count not between", value1, value2, "returnItemCount");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceIsNull() {
            addCriterion("return_item_price is null");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceIsNotNull() {
            addCriterion("return_item_price is not null");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceEqualTo(Double value) {
            addCriterion("return_item_price =", value, "returnItemPrice");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceNotEqualTo(Double value) {
            addCriterion("return_item_price <>", value, "returnItemPrice");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceGreaterThan(Double value) {
            addCriterion("return_item_price >", value, "returnItemPrice");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("return_item_price >=", value, "returnItemPrice");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceLessThan(Double value) {
            addCriterion("return_item_price <", value, "returnItemPrice");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceLessThanOrEqualTo(Double value) {
            addCriterion("return_item_price <=", value, "returnItemPrice");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceIn(List<Double> values) {
            addCriterion("return_item_price in", values, "returnItemPrice");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceNotIn(List<Double> values) {
            addCriterion("return_item_price not in", values, "returnItemPrice");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceBetween(Double value1, Double value2) {
            addCriterion("return_item_price between", value1, value2, "returnItemPrice");
            return (Criteria) this;
        }

        public Criteria andReturnItemPriceNotBetween(Double value1, Double value2) {
            addCriterion("return_item_price not between", value1, value2, "returnItemPrice");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdIsNull() {
            addCriterion("return_order_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdIsNotNull() {
            addCriterion("return_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdEqualTo(Long value) {
            addCriterion("return_order_id =", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotEqualTo(Long value) {
            addCriterion("return_order_id <>", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdGreaterThan(Long value) {
            addCriterion("return_order_id >", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("return_order_id >=", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdLessThan(Long value) {
            addCriterion("return_order_id <", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("return_order_id <=", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdIn(List<Long> values) {
            addCriterion("return_order_id in", values, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotIn(List<Long> values) {
            addCriterion("return_order_id not in", values, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdBetween(Long value1, Long value2) {
            addCriterion("return_order_id between", value1, value2, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("return_order_id not between", value1, value2, "returnOrderId");
            return (Criteria) this;
        }
    }

    /**
     */
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