package com.xu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleReturnOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleReturnOrderExample() {
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

        public Criteria andSaleReturnOrderPayIsNull() {
            addCriterion("sale_return_order_pay is null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayIsNotNull() {
            addCriterion("sale_return_order_pay is not null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayEqualTo(String value) {
            addCriterion("sale_return_order_pay =", value, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayNotEqualTo(String value) {
            addCriterion("sale_return_order_pay <>", value, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayGreaterThan(String value) {
            addCriterion("sale_return_order_pay >", value, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayGreaterThanOrEqualTo(String value) {
            addCriterion("sale_return_order_pay >=", value, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayLessThan(String value) {
            addCriterion("sale_return_order_pay <", value, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayLessThanOrEqualTo(String value) {
            addCriterion("sale_return_order_pay <=", value, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayLike(String value) {
            addCriterion("sale_return_order_pay like", value, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayNotLike(String value) {
            addCriterion("sale_return_order_pay not like", value, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayIn(List<String> values) {
            addCriterion("sale_return_order_pay in", values, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayNotIn(List<String> values) {
            addCriterion("sale_return_order_pay not in", values, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayBetween(String value1, String value2) {
            addCriterion("sale_return_order_pay between", value1, value2, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderPayNotBetween(String value1, String value2) {
            addCriterion("sale_return_order_pay not between", value1, value2, "saleReturnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateIsNull() {
            addCriterion("sale_return_order_return_date is null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateIsNotNull() {
            addCriterion("sale_return_order_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateEqualTo(Date value) {
            addCriterion("sale_return_order_return_date =", value, "saleReturnOrderReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateNotEqualTo(Date value) {
            addCriterion("sale_return_order_return_date <>", value, "saleReturnOrderReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateGreaterThan(Date value) {
            addCriterion("sale_return_order_return_date >", value, "saleReturnOrderReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_return_order_return_date >=", value, "saleReturnOrderReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateLessThan(Date value) {
            addCriterion("sale_return_order_return_date <", value, "saleReturnOrderReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateLessThanOrEqualTo(Date value) {
            addCriterion("sale_return_order_return_date <=", value, "saleReturnOrderReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateIn(List<Date> values) {
            addCriterion("sale_return_order_return_date in", values, "saleReturnOrderReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateNotIn(List<Date> values) {
            addCriterion("sale_return_order_return_date not in", values, "saleReturnOrderReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateBetween(Date value1, Date value2) {
            addCriterion("sale_return_order_return_date between", value1, value2, "saleReturnOrderReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderReturnDateNotBetween(Date value1, Date value2) {
            addCriterion("sale_return_order_return_date not between", value1, value2, "saleReturnOrderReturnDate");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalIsNull() {
            addCriterion("sale_return_order_total is null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalIsNotNull() {
            addCriterion("sale_return_order_total is not null");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalEqualTo(Double value) {
            addCriterion("sale_return_order_total =", value, "saleReturnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalNotEqualTo(Double value) {
            addCriterion("sale_return_order_total <>", value, "saleReturnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalGreaterThan(Double value) {
            addCriterion("sale_return_order_total >", value, "saleReturnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_return_order_total >=", value, "saleReturnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalLessThan(Double value) {
            addCriterion("sale_return_order_total <", value, "saleReturnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalLessThanOrEqualTo(Double value) {
            addCriterion("sale_return_order_total <=", value, "saleReturnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalIn(List<Double> values) {
            addCriterion("sale_return_order_total in", values, "saleReturnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalNotIn(List<Double> values) {
            addCriterion("sale_return_order_total not in", values, "saleReturnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalBetween(Double value1, Double value2) {
            addCriterion("sale_return_order_total between", value1, value2, "saleReturnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andSaleReturnOrderTotalNotBetween(Double value1, Double value2) {
            addCriterion("sale_return_order_total not between", value1, value2, "saleReturnOrderTotal");
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