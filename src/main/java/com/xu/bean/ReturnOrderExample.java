package com.xu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReturnOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReturnOrderExample() {
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

        public Criteria andReturnOrderOutDateIsNull() {
            addCriterion("return_order_out_date is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderOutDateIsNotNull() {
            addCriterion("return_order_out_date is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderOutDateEqualTo(Date value) {
            addCriterion("return_order_out_date =", value, "returnOrderOutDate");
            return (Criteria) this;
        }

        public Criteria andReturnOrderOutDateNotEqualTo(Date value) {
            addCriterion("return_order_out_date <>", value, "returnOrderOutDate");
            return (Criteria) this;
        }

        public Criteria andReturnOrderOutDateGreaterThan(Date value) {
            addCriterion("return_order_out_date >", value, "returnOrderOutDate");
            return (Criteria) this;
        }

        public Criteria andReturnOrderOutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("return_order_out_date >=", value, "returnOrderOutDate");
            return (Criteria) this;
        }

        public Criteria andReturnOrderOutDateLessThan(Date value) {
            addCriterion("return_order_out_date <", value, "returnOrderOutDate");
            return (Criteria) this;
        }

        public Criteria andReturnOrderOutDateLessThanOrEqualTo(Date value) {
            addCriterion("return_order_out_date <=", value, "returnOrderOutDate");
            return (Criteria) this;
        }

        public Criteria andReturnOrderOutDateIn(List<Date> values) {
            addCriterion("return_order_out_date in", values, "returnOrderOutDate");
            return (Criteria) this;
        }

        public Criteria andReturnOrderOutDateNotIn(List<Date> values) {
            addCriterion("return_order_out_date not in", values, "returnOrderOutDate");
            return (Criteria) this;
        }

        public Criteria andReturnOrderOutDateBetween(Date value1, Date value2) {
            addCriterion("return_order_out_date between", value1, value2, "returnOrderOutDate");
            return (Criteria) this;
        }

        public Criteria andReturnOrderOutDateNotBetween(Date value1, Date value2) {
            addCriterion("return_order_out_date not between", value1, value2, "returnOrderOutDate");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayIsNull() {
            addCriterion("return_order_pay is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayIsNotNull() {
            addCriterion("return_order_pay is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayEqualTo(String value) {
            addCriterion("return_order_pay =", value, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayNotEqualTo(String value) {
            addCriterion("return_order_pay <>", value, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayGreaterThan(String value) {
            addCriterion("return_order_pay >", value, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayGreaterThanOrEqualTo(String value) {
            addCriterion("return_order_pay >=", value, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayLessThan(String value) {
            addCriterion("return_order_pay <", value, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayLessThanOrEqualTo(String value) {
            addCriterion("return_order_pay <=", value, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayLike(String value) {
            addCriterion("return_order_pay like", value, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayNotLike(String value) {
            addCriterion("return_order_pay not like", value, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayIn(List<String> values) {
            addCriterion("return_order_pay in", values, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayNotIn(List<String> values) {
            addCriterion("return_order_pay not in", values, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayBetween(String value1, String value2) {
            addCriterion("return_order_pay between", value1, value2, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andReturnOrderPayNotBetween(String value1, String value2) {
            addCriterion("return_order_pay not between", value1, value2, "returnOrderPay");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIsNull() {
            addCriterion("suppliers_id is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIsNotNull() {
            addCriterion("suppliers_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdEqualTo(Long value) {
            addCriterion("suppliers_id =", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotEqualTo(Long value) {
            addCriterion("suppliers_id <>", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdGreaterThan(Long value) {
            addCriterion("suppliers_id >", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdGreaterThanOrEqualTo(Long value) {
            addCriterion("suppliers_id >=", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdLessThan(Long value) {
            addCriterion("suppliers_id <", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdLessThanOrEqualTo(Long value) {
            addCriterion("suppliers_id <=", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIn(List<Long> values) {
            addCriterion("suppliers_id in", values, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotIn(List<Long> values) {
            addCriterion("suppliers_id not in", values, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdBetween(Long value1, Long value2) {
            addCriterion("suppliers_id between", value1, value2, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotBetween(Long value1, Long value2) {
            addCriterion("suppliers_id not between", value1, value2, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalIsNull() {
            addCriterion("return_order_total is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalIsNotNull() {
            addCriterion("return_order_total is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalEqualTo(Double value) {
            addCriterion("return_order_total =", value, "returnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalNotEqualTo(Double value) {
            addCriterion("return_order_total <>", value, "returnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalGreaterThan(Double value) {
            addCriterion("return_order_total >", value, "returnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("return_order_total >=", value, "returnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalLessThan(Double value) {
            addCriterion("return_order_total <", value, "returnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalLessThanOrEqualTo(Double value) {
            addCriterion("return_order_total <=", value, "returnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalIn(List<Double> values) {
            addCriterion("return_order_total in", values, "returnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalNotIn(List<Double> values) {
            addCriterion("return_order_total not in", values, "returnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalBetween(Double value1, Double value2) {
            addCriterion("return_order_total between", value1, value2, "returnOrderTotal");
            return (Criteria) this;
        }

        public Criteria andReturnOrderTotalNotBetween(Double value1, Double value2) {
            addCriterion("return_order_total not between", value1, value2, "returnOrderTotal");
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