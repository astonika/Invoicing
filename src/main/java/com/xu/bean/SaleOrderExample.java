package com.xu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleOrderExample() {
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

        public Criteria andSaleOrderIdIsNull() {
            addCriterion("sale_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdIsNotNull() {
            addCriterion("sale_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdEqualTo(Long value) {
            addCriterion("sale_order_id =", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotEqualTo(Long value) {
            addCriterion("sale_order_id <>", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdGreaterThan(Long value) {
            addCriterion("sale_order_id >", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_order_id >=", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdLessThan(Long value) {
            addCriterion("sale_order_id <", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("sale_order_id <=", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdIn(List<Long> values) {
            addCriterion("sale_order_id in", values, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotIn(List<Long> values) {
            addCriterion("sale_order_id not in", values, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdBetween(Long value1, Long value2) {
            addCriterion("sale_order_id between", value1, value2, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("sale_order_id not between", value1, value2, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayIsNull() {
            addCriterion("sale_order_pay is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayIsNotNull() {
            addCriterion("sale_order_pay is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayEqualTo(String value) {
            addCriterion("sale_order_pay =", value, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayNotEqualTo(String value) {
            addCriterion("sale_order_pay <>", value, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayGreaterThan(String value) {
            addCriterion("sale_order_pay >", value, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayGreaterThanOrEqualTo(String value) {
            addCriterion("sale_order_pay >=", value, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayLessThan(String value) {
            addCriterion("sale_order_pay <", value, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayLessThanOrEqualTo(String value) {
            addCriterion("sale_order_pay <=", value, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayLike(String value) {
            addCriterion("sale_order_pay like", value, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayNotLike(String value) {
            addCriterion("sale_order_pay not like", value, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayIn(List<String> values) {
            addCriterion("sale_order_pay in", values, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayNotIn(List<String> values) {
            addCriterion("sale_order_pay not in", values, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayBetween(String value1, String value2) {
            addCriterion("sale_order_pay between", value1, value2, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderPayNotBetween(String value1, String value2) {
            addCriterion("sale_order_pay not between", value1, value2, "saleOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateIsNull() {
            addCriterion("sale_order_sale_date is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateIsNotNull() {
            addCriterion("sale_order_sale_date is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateEqualTo(Date value) {
            addCriterion("sale_order_sale_date =", value, "saleOrderSaleDate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateNotEqualTo(Date value) {
            addCriterion("sale_order_sale_date <>", value, "saleOrderSaleDate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateGreaterThan(Date value) {
            addCriterion("sale_order_sale_date >", value, "saleOrderSaleDate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_order_sale_date >=", value, "saleOrderSaleDate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateLessThan(Date value) {
            addCriterion("sale_order_sale_date <", value, "saleOrderSaleDate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateLessThanOrEqualTo(Date value) {
            addCriterion("sale_order_sale_date <=", value, "saleOrderSaleDate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateIn(List<Date> values) {
            addCriterion("sale_order_sale_date in", values, "saleOrderSaleDate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateNotIn(List<Date> values) {
            addCriterion("sale_order_sale_date not in", values, "saleOrderSaleDate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateBetween(Date value1, Date value2) {
            addCriterion("sale_order_sale_date between", value1, value2, "saleOrderSaleDate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderSaleDateNotBetween(Date value1, Date value2) {
            addCriterion("sale_order_sale_date not between", value1, value2, "saleOrderSaleDate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalIsNull() {
            addCriterion("sale_order_total is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalIsNotNull() {
            addCriterion("sale_order_total is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalEqualTo(Double value) {
            addCriterion("sale_order_total =", value, "saleOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalNotEqualTo(Double value) {
            addCriterion("sale_order_total <>", value, "saleOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalGreaterThan(Double value) {
            addCriterion("sale_order_total >", value, "saleOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_order_total >=", value, "saleOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalLessThan(Double value) {
            addCriterion("sale_order_total <", value, "saleOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalLessThanOrEqualTo(Double value) {
            addCriterion("sale_order_total <=", value, "saleOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalIn(List<Double> values) {
            addCriterion("sale_order_total in", values, "saleOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalNotIn(List<Double> values) {
            addCriterion("sale_order_total not in", values, "saleOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalBetween(Double value1, Double value2) {
            addCriterion("sale_order_total between", value1, value2, "saleOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleOrderTotalNotBetween(Double value1, Double value2) {
            addCriterion("sale_order_total not between", value1, value2, "saleOrderTotal");
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