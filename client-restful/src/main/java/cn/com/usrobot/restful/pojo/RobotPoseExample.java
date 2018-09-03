package cn.com.usrobot.restful.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RobotPoseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RobotPoseExample() {
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

        public Criteria andRobotIdIsNull() {
            addCriterion("robot_id is null");
            return (Criteria) this;
        }

        public Criteria andRobotIdIsNotNull() {
            addCriterion("robot_id is not null");
            return (Criteria) this;
        }

        public Criteria andRobotIdEqualTo(Integer value) {
            addCriterion("robot_id =", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdNotEqualTo(Integer value) {
            addCriterion("robot_id <>", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdGreaterThan(Integer value) {
            addCriterion("robot_id >", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("robot_id >=", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdLessThan(Integer value) {
            addCriterion("robot_id <", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdLessThanOrEqualTo(Integer value) {
            addCriterion("robot_id <=", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdIn(List<Integer> values) {
            addCriterion("robot_id in", values, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdNotIn(List<Integer> values) {
            addCriterion("robot_id not in", values, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdBetween(Integer value1, Integer value2) {
            addCriterion("robot_id between", value1, value2, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("robot_id not between", value1, value2, "robotId");
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

        public Criteria andZIsNull() {
            addCriterion("z is null");
            return (Criteria) this;
        }

        public Criteria andZIsNotNull() {
            addCriterion("z is not null");
            return (Criteria) this;
        }

        public Criteria andZEqualTo(Float value) {
            addCriterion("z =", value, "z");
            return (Criteria) this;
        }

        public Criteria andZNotEqualTo(Float value) {
            addCriterion("z <>", value, "z");
            return (Criteria) this;
        }

        public Criteria andZGreaterThan(Float value) {
            addCriterion("z >", value, "z");
            return (Criteria) this;
        }

        public Criteria andZGreaterThanOrEqualTo(Float value) {
            addCriterion("z >=", value, "z");
            return (Criteria) this;
        }

        public Criteria andZLessThan(Float value) {
            addCriterion("z <", value, "z");
            return (Criteria) this;
        }

        public Criteria andZLessThanOrEqualTo(Float value) {
            addCriterion("z <=", value, "z");
            return (Criteria) this;
        }

        public Criteria andZIn(List<Float> values) {
            addCriterion("z in", values, "z");
            return (Criteria) this;
        }

        public Criteria andZNotIn(List<Float> values) {
            addCriterion("z not in", values, "z");
            return (Criteria) this;
        }

        public Criteria andZBetween(Float value1, Float value2) {
            addCriterion("z between", value1, value2, "z");
            return (Criteria) this;
        }

        public Criteria andZNotBetween(Float value1, Float value2) {
            addCriterion("z not between", value1, value2, "z");
            return (Criteria) this;
        }

        public Criteria andOrientationXIsNull() {
            addCriterion("orientation_x is null");
            return (Criteria) this;
        }

        public Criteria andOrientationXIsNotNull() {
            addCriterion("orientation_x is not null");
            return (Criteria) this;
        }

        public Criteria andOrientationXEqualTo(Float value) {
            addCriterion("orientation_x =", value, "orientationX");
            return (Criteria) this;
        }

        public Criteria andOrientationXNotEqualTo(Float value) {
            addCriterion("orientation_x <>", value, "orientationX");
            return (Criteria) this;
        }

        public Criteria andOrientationXGreaterThan(Float value) {
            addCriterion("orientation_x >", value, "orientationX");
            return (Criteria) this;
        }

        public Criteria andOrientationXGreaterThanOrEqualTo(Float value) {
            addCriterion("orientation_x >=", value, "orientationX");
            return (Criteria) this;
        }

        public Criteria andOrientationXLessThan(Float value) {
            addCriterion("orientation_x <", value, "orientationX");
            return (Criteria) this;
        }

        public Criteria andOrientationXLessThanOrEqualTo(Float value) {
            addCriterion("orientation_x <=", value, "orientationX");
            return (Criteria) this;
        }

        public Criteria andOrientationXIn(List<Float> values) {
            addCriterion("orientation_x in", values, "orientationX");
            return (Criteria) this;
        }

        public Criteria andOrientationXNotIn(List<Float> values) {
            addCriterion("orientation_x not in", values, "orientationX");
            return (Criteria) this;
        }

        public Criteria andOrientationXBetween(Float value1, Float value2) {
            addCriterion("orientation_x between", value1, value2, "orientationX");
            return (Criteria) this;
        }

        public Criteria andOrientationXNotBetween(Float value1, Float value2) {
            addCriterion("orientation_x not between", value1, value2, "orientationX");
            return (Criteria) this;
        }

        public Criteria andOrientationYIsNull() {
            addCriterion("orientation_y is null");
            return (Criteria) this;
        }

        public Criteria andOrientationYIsNotNull() {
            addCriterion("orientation_y is not null");
            return (Criteria) this;
        }

        public Criteria andOrientationYEqualTo(Float value) {
            addCriterion("orientation_y =", value, "orientationY");
            return (Criteria) this;
        }

        public Criteria andOrientationYNotEqualTo(Float value) {
            addCriterion("orientation_y <>", value, "orientationY");
            return (Criteria) this;
        }

        public Criteria andOrientationYGreaterThan(Float value) {
            addCriterion("orientation_y >", value, "orientationY");
            return (Criteria) this;
        }

        public Criteria andOrientationYGreaterThanOrEqualTo(Float value) {
            addCriterion("orientation_y >=", value, "orientationY");
            return (Criteria) this;
        }

        public Criteria andOrientationYLessThan(Float value) {
            addCriterion("orientation_y <", value, "orientationY");
            return (Criteria) this;
        }

        public Criteria andOrientationYLessThanOrEqualTo(Float value) {
            addCriterion("orientation_y <=", value, "orientationY");
            return (Criteria) this;
        }

        public Criteria andOrientationYIn(List<Float> values) {
            addCriterion("orientation_y in", values, "orientationY");
            return (Criteria) this;
        }

        public Criteria andOrientationYNotIn(List<Float> values) {
            addCriterion("orientation_y not in", values, "orientationY");
            return (Criteria) this;
        }

        public Criteria andOrientationYBetween(Float value1, Float value2) {
            addCriterion("orientation_y between", value1, value2, "orientationY");
            return (Criteria) this;
        }

        public Criteria andOrientationYNotBetween(Float value1, Float value2) {
            addCriterion("orientation_y not between", value1, value2, "orientationY");
            return (Criteria) this;
        }

        public Criteria andOrientationZIsNull() {
            addCriterion("orientation_z is null");
            return (Criteria) this;
        }

        public Criteria andOrientationZIsNotNull() {
            addCriterion("orientation_z is not null");
            return (Criteria) this;
        }

        public Criteria andOrientationZEqualTo(Float value) {
            addCriterion("orientation_z =", value, "orientationZ");
            return (Criteria) this;
        }

        public Criteria andOrientationZNotEqualTo(Float value) {
            addCriterion("orientation_z <>", value, "orientationZ");
            return (Criteria) this;
        }

        public Criteria andOrientationZGreaterThan(Float value) {
            addCriterion("orientation_z >", value, "orientationZ");
            return (Criteria) this;
        }

        public Criteria andOrientationZGreaterThanOrEqualTo(Float value) {
            addCriterion("orientation_z >=", value, "orientationZ");
            return (Criteria) this;
        }

        public Criteria andOrientationZLessThan(Float value) {
            addCriterion("orientation_z <", value, "orientationZ");
            return (Criteria) this;
        }

        public Criteria andOrientationZLessThanOrEqualTo(Float value) {
            addCriterion("orientation_z <=", value, "orientationZ");
            return (Criteria) this;
        }

        public Criteria andOrientationZIn(List<Float> values) {
            addCriterion("orientation_z in", values, "orientationZ");
            return (Criteria) this;
        }

        public Criteria andOrientationZNotIn(List<Float> values) {
            addCriterion("orientation_z not in", values, "orientationZ");
            return (Criteria) this;
        }

        public Criteria andOrientationZBetween(Float value1, Float value2) {
            addCriterion("orientation_z between", value1, value2, "orientationZ");
            return (Criteria) this;
        }

        public Criteria andOrientationZNotBetween(Float value1, Float value2) {
            addCriterion("orientation_z not between", value1, value2, "orientationZ");
            return (Criteria) this;
        }

        public Criteria andOrientationWIsNull() {
            addCriterion("orientation_w is null");
            return (Criteria) this;
        }

        public Criteria andOrientationWIsNotNull() {
            addCriterion("orientation_w is not null");
            return (Criteria) this;
        }

        public Criteria andOrientationWEqualTo(Float value) {
            addCriterion("orientation_w =", value, "orientationW");
            return (Criteria) this;
        }

        public Criteria andOrientationWNotEqualTo(Float value) {
            addCriterion("orientation_w <>", value, "orientationW");
            return (Criteria) this;
        }

        public Criteria andOrientationWGreaterThan(Float value) {
            addCriterion("orientation_w >", value, "orientationW");
            return (Criteria) this;
        }

        public Criteria andOrientationWGreaterThanOrEqualTo(Float value) {
            addCriterion("orientation_w >=", value, "orientationW");
            return (Criteria) this;
        }

        public Criteria andOrientationWLessThan(Float value) {
            addCriterion("orientation_w <", value, "orientationW");
            return (Criteria) this;
        }

        public Criteria andOrientationWLessThanOrEqualTo(Float value) {
            addCriterion("orientation_w <=", value, "orientationW");
            return (Criteria) this;
        }

        public Criteria andOrientationWIn(List<Float> values) {
            addCriterion("orientation_w in", values, "orientationW");
            return (Criteria) this;
        }

        public Criteria andOrientationWNotIn(List<Float> values) {
            addCriterion("orientation_w not in", values, "orientationW");
            return (Criteria) this;
        }

        public Criteria andOrientationWBetween(Float value1, Float value2) {
            addCriterion("orientation_w between", value1, value2, "orientationW");
            return (Criteria) this;
        }

        public Criteria andOrientationWNotBetween(Float value1, Float value2) {
            addCriterion("orientation_w not between", value1, value2, "orientationW");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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