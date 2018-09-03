package cn.com.usrobot.restful.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("x is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("x is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(Float value) {
            addCriterion("x =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(Float value) {
            addCriterion("x <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(Float value) {
            addCriterion("x >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(Float value) {
            addCriterion("x >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(Float value) {
            addCriterion("x <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(Float value) {
            addCriterion("x <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<Float> values) {
            addCriterion("x in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<Float> values) {
            addCriterion("x not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(Float value1, Float value2) {
            addCriterion("x between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(Float value1, Float value2) {
            addCriterion("x not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(Float value) {
            addCriterion("y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(Float value) {
            addCriterion("y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(Float value) {
            addCriterion("y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(Float value) {
            addCriterion("y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(Float value) {
            addCriterion("y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(Float value) {
            addCriterion("y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<Float> values) {
            addCriterion("y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<Float> values) {
            addCriterion("y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(Float value1, Float value2) {
            addCriterion("y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(Float value1, Float value2) {
            addCriterion("y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andOnRobotIsNull() {
            addCriterion("on_robot is null");
            return (Criteria) this;
        }

        public Criteria andOnRobotIsNotNull() {
            addCriterion("on_robot is not null");
            return (Criteria) this;
        }

        public Criteria andOnRobotEqualTo(Boolean value) {
            addCriterion("on_robot =", value, "onRobot");
            return (Criteria) this;
        }

        public Criteria andOnRobotNotEqualTo(Boolean value) {
            addCriterion("on_robot <>", value, "onRobot");
            return (Criteria) this;
        }

        public Criteria andOnRobotGreaterThan(Boolean value) {
            addCriterion("on_robot >", value, "onRobot");
            return (Criteria) this;
        }

        public Criteria andOnRobotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("on_robot >=", value, "onRobot");
            return (Criteria) this;
        }

        public Criteria andOnRobotLessThan(Boolean value) {
            addCriterion("on_robot <", value, "onRobot");
            return (Criteria) this;
        }

        public Criteria andOnRobotLessThanOrEqualTo(Boolean value) {
            addCriterion("on_robot <=", value, "onRobot");
            return (Criteria) this;
        }

        public Criteria andOnRobotIn(List<Boolean> values) {
            addCriterion("on_robot in", values, "onRobot");
            return (Criteria) this;
        }

        public Criteria andOnRobotNotIn(List<Boolean> values) {
            addCriterion("on_robot not in", values, "onRobot");
            return (Criteria) this;
        }

        public Criteria andOnRobotBetween(Boolean value1, Boolean value2) {
            addCriterion("on_robot between", value1, value2, "onRobot");
            return (Criteria) this;
        }

        public Criteria andOnRobotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("on_robot not between", value1, value2, "onRobot");
            return (Criteria) this;
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

        public Criteria andPlantUnitIdIsNull() {
            addCriterion("plant_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andPlantUnitIdIsNotNull() {
            addCriterion("plant_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlantUnitIdEqualTo(Integer value) {
            addCriterion("plant_unit_id =", value, "plantUnitId");
            return (Criteria) this;
        }

        public Criteria andPlantUnitIdNotEqualTo(Integer value) {
            addCriterion("plant_unit_id <>", value, "plantUnitId");
            return (Criteria) this;
        }

        public Criteria andPlantUnitIdGreaterThan(Integer value) {
            addCriterion("plant_unit_id >", value, "plantUnitId");
            return (Criteria) this;
        }

        public Criteria andPlantUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_unit_id >=", value, "plantUnitId");
            return (Criteria) this;
        }

        public Criteria andPlantUnitIdLessThan(Integer value) {
            addCriterion("plant_unit_id <", value, "plantUnitId");
            return (Criteria) this;
        }

        public Criteria andPlantUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("plant_unit_id <=", value, "plantUnitId");
            return (Criteria) this;
        }

        public Criteria andPlantUnitIdIn(List<Integer> values) {
            addCriterion("plant_unit_id in", values, "plantUnitId");
            return (Criteria) this;
        }

        public Criteria andPlantUnitIdNotIn(List<Integer> values) {
            addCriterion("plant_unit_id not in", values, "plantUnitId");
            return (Criteria) this;
        }

        public Criteria andPlantUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("plant_unit_id between", value1, value2, "plantUnitId");
            return (Criteria) this;
        }

        public Criteria andPlantUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plant_unit_id not between", value1, value2, "plantUnitId");
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