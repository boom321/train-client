package cn.com.usrobot.restful.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeviceCategoryHasDataSubtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceCategoryHasDataSubtypeExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andDeviceCategoryIdIsNull() {
            addCriterion("device_category_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCategoryIdIsNotNull() {
            addCriterion("device_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCategoryIdEqualTo(Integer value) {
            addCriterion("device_category_id =", value, "deviceCategoryId");
            return (Criteria) this;
        }

        public Criteria andDeviceCategoryIdNotEqualTo(Integer value) {
            addCriterion("device_category_id <>", value, "deviceCategoryId");
            return (Criteria) this;
        }

        public Criteria andDeviceCategoryIdGreaterThan(Integer value) {
            addCriterion("device_category_id >", value, "deviceCategoryId");
            return (Criteria) this;
        }

        public Criteria andDeviceCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_category_id >=", value, "deviceCategoryId");
            return (Criteria) this;
        }

        public Criteria andDeviceCategoryIdLessThan(Integer value) {
            addCriterion("device_category_id <", value, "deviceCategoryId");
            return (Criteria) this;
        }

        public Criteria andDeviceCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_category_id <=", value, "deviceCategoryId");
            return (Criteria) this;
        }

        public Criteria andDeviceCategoryIdIn(List<Integer> values) {
            addCriterion("device_category_id in", values, "deviceCategoryId");
            return (Criteria) this;
        }

        public Criteria andDeviceCategoryIdNotIn(List<Integer> values) {
            addCriterion("device_category_id not in", values, "deviceCategoryId");
            return (Criteria) this;
        }

        public Criteria andDeviceCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("device_category_id between", value1, value2, "deviceCategoryId");
            return (Criteria) this;
        }

        public Criteria andDeviceCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_category_id not between", value1, value2, "deviceCategoryId");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdIsNull() {
            addCriterion("data_subtype_id is null");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdIsNotNull() {
            addCriterion("data_subtype_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdEqualTo(Integer value) {
            addCriterion("data_subtype_id =", value, "dataSubtypeId");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdNotEqualTo(Integer value) {
            addCriterion("data_subtype_id <>", value, "dataSubtypeId");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdGreaterThan(Integer value) {
            addCriterion("data_subtype_id >", value, "dataSubtypeId");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_subtype_id >=", value, "dataSubtypeId");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdLessThan(Integer value) {
            addCriterion("data_subtype_id <", value, "dataSubtypeId");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("data_subtype_id <=", value, "dataSubtypeId");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdIn(List<Integer> values) {
            addCriterion("data_subtype_id in", values, "dataSubtypeId");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdNotIn(List<Integer> values) {
            addCriterion("data_subtype_id not in", values, "dataSubtypeId");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdBetween(Integer value1, Integer value2) {
            addCriterion("data_subtype_id between", value1, value2, "dataSubtypeId");
            return (Criteria) this;
        }

        public Criteria andDataSubtypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("data_subtype_id not between", value1, value2, "dataSubtypeId");
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