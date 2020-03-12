package com.xu.bean;

import java.util.ArrayList;
import java.util.List;

public class SaleReturnItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleReturnItemExample() {
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

        public Criteria andSaleReturnItemIdIsNull() {
            addCriterion("sale_return_item_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemIdIsNotNull() {
            addCriterion("sale_return_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemIdEqualTo(Long value) {
            addCriterion("sale_return_item_id =", value, "saleReturnItemId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemIdNotEqualTo(Long value) {
            addCriterion("sale_return_item_id <>", value, "saleReturnItemId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemIdGreaterThan(Long value) {
            addCriterion("sale_return_item_id >", value, "saleReturnItemId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_return_item_id >=", value, "saleReturnItemId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemIdLessThan(Long value) {
            addCriterion("sale_return_item_id <", value, "saleReturnItemId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemIdLessThanOrEqualTo(Long value) {
            addCriterion("sale_return_item_id <=", value, "saleReturnItemId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemIdIn(List<Long> values) {
            addCriterion("sale_return_item_id in", values, "saleReturnItemId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemIdNotIn(List<Long> values) {
            addCriterion("sale_return_item_id not in", values, "saleReturnItemId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemIdBetween(Long value1, Long value2) {
            addCriterion("sale_return_item_id between", value1, value2, "saleReturnItemId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemIdNotBetween(Long value1, Long value2) {
            addCriterion("sale_return_item_id not between", value1, value2, "saleReturnItemId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountIsNull() {
            addCriterion("sale_return_item_count is null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountIsNotNull() {
            addCriterion("sale_return_item_count is not null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountEqualTo(Long value) {
            addCriterion("sale_return_item_count =", value, "saleReturnItemCount");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountNotEqualTo(Long value) {
            addCriterion("sale_return_item_count <>", value, "saleReturnItemCount");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountGreaterThan(Long value) {
            addCriterion("sale_return_item_count >", value, "saleReturnItemCount");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_return_item_count >=", value, "saleReturnItemCount");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountLessThan(Long value) {
            addCriterion("sale_return_item_count <", value, "saleReturnItemCount");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountLessThanOrEqualTo(Long value) {
            addCriterion("sale_return_item_count <=", value, "saleReturnItemCount");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountIn(List<Long> values) {
            addCriterion("sale_return_item_count in", values, "saleReturnItemCount");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountNotIn(List<Long> values) {
            addCriterion("sale_return_item_count not in", values, "saleReturnItemCount");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountBetween(Long value1, Long value2) {
            addCriterion("sale_return_item_count between", value1, value2, "saleReturnItemCount");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemCountNotBetween(Long value1, Long value2) {
            addCriterion("sale_return_item_count not between", value1, value2, "saleReturnItemCount");
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

        public Criteria andSaleReturnItemPriceIsNull() {
            addCriterion("sale_return_item_price is null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemPriceIsNotNull() {
            addCriterion("sale_return_item_price is not null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemPriceEqualTo(Double value) {
            addCriterion("sale_return_item_price =", value, "saleReturnItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemPriceNotEqualTo(Double value) {
            addCriterion("sale_return_item_price <>", value, "saleReturnItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemPriceGreaterThan(Double value) {
            addCriterion("sale_return_item_price >", value, "saleReturnItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_return_item_price >=", value, "saleReturnItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemPriceLessThan(Double value) {
            addCriterion("sale_return_item_price <", value, "saleReturnItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemPriceLessThanOrEqualTo(Double value) {
            addCriterion("sale_return_item_price <=", value, "saleReturnItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemPriceIn(List<Double> values) {
            addCriterion("sale_return_item_price in", values, "saleReturnItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemPriceNotIn(List<Double> values) {
            addCriterion("sale_return_item_price not in", values, "saleReturnItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemPriceBetween(Double value1, Double value2) {
            addCriterion("sale_return_item_price between", value1, value2, "saleReturnItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleReturnItemPriceNotBetween(Double value1, Double value2) {
            addCriterion("sale_return_item_price not between", value1, value2, "saleReturnItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdIsNull() {
            addCriterion("sale_return_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdIsNotNull() {
            addCriterion("sale_return_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdEqualTo(Long value) {
            addCriterion("sale_return_order_id =", value, "saleReturnOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdNotEqualTo(Long value) {
            addCriterion("sale_return_order_id <>", value, "saleReturnOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdGreaterThan(Long value) {
            addCriterion("sale_return_order_id >", value, "saleReturnOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_return_order_id >=", value, "saleReturnOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdLessThan(Long value) {
            addCriterion("sale_return_order_id <", value, "saleReturnOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("sale_return_order_id <=", value, "saleReturnOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdIn(List<Long> values) {
            addCriterion("sale_return_order_id in", values, "saleReturnOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdNotIn(List<Long> values) {
            addCriterion("sale_return_order_id not in", values, "saleReturnOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdBetween(Long value1, Long value2) {
            addCriterion("sale_return_order_id between", value1, value2, "saleReturnOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("sale_return_order_id not between", value1, value2, "saleReturnOrderId");
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