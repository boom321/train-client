package cn.com.usrobot.restful.pojo;

import java.util.ArrayList;
import java.util.List;

public class VariablePresetPositionMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VariablePresetPositionMapExample() {
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

        public Criteria andVariableIdIsNull() {
            addCriterion("variable_id is null");
            return (Criteria) this;
        }

        public Criteria andVariableIdIsNotNull() {
            addCriterion("variable_id is not null");
            return (Criteria) this;
        }

        public Criteria andVariableIdEqualTo(Integer value) {
            addCriterion("variable_id =", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotEqualTo(Integer value) {
            addCriterion("variable_id <>", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdGreaterThan(Integer value) {
            addCriterion("variable_id >", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("variable_id >=", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdLessThan(Integer value) {
            addCriterion("variable_id <", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdLessThanOrEqualTo(Integer value) {
            addCriterion("variable_id <=", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdIn(List<Integer> values) {
            addCriterion("variable_id in", values, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotIn(List<Integer> values) {
            addCriterion("variable_id not in", values, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdBetween(Integer value1, Integer value2) {
            addCriterion("variable_id between", value1, value2, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("variable_id not between", value1, value2, "variableId");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdIsNull() {
            addCriterion("inspection_position_id is null");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdIsNotNull() {
            addCriterion("inspection_position_id is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdEqualTo(Integer value) {
            addCriterion("inspection_position_id =", value, "inspectionPositionId");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdNotEqualTo(Integer value) {
            addCriterion("inspection_position_id <>", value, "inspectionPositionId");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdGreaterThan(Integer value) {
            addCriterion("inspection_position_id >", value, "inspectionPositionId");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspection_position_id >=", value, "inspectionPositionId");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdLessThan(Integer value) {
            addCriterion("inspection_position_id <", value, "inspectionPositionId");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("inspection_position_id <=", value, "inspectionPositionId");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdIn(List<Integer> values) {
            addCriterion("inspection_position_id in", values, "inspectionPositionId");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdNotIn(List<Integer> values) {
            addCriterion("inspection_position_id not in", values, "inspectionPositionId");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("inspection_position_id between", value1, value2, "inspectionPositionId");
            return (Criteria) this;
        }

        public Criteria andInspectionPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inspection_position_id not between", value1, value2, "inspectionPositionId");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdIsNull() {
            addCriterion("ptz_preset_number_id is null");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdIsNotNull() {
            addCriterion("ptz_preset_number_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdEqualTo(Integer value) {
            addCriterion("ptz_preset_number_id =", value, "ptzPresetNumberId");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdNotEqualTo(Integer value) {
            addCriterion("ptz_preset_number_id <>", value, "ptzPresetNumberId");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdGreaterThan(Integer value) {
            addCriterion("ptz_preset_number_id >", value, "ptzPresetNumberId");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptz_preset_number_id >=", value, "ptzPresetNumberId");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdLessThan(Integer value) {
            addCriterion("ptz_preset_number_id <", value, "ptzPresetNumberId");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdLessThanOrEqualTo(Integer value) {
            addCriterion("ptz_preset_number_id <=", value, "ptzPresetNumberId");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdIn(List<Integer> values) {
            addCriterion("ptz_preset_number_id in", values, "ptzPresetNumberId");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdNotIn(List<Integer> values) {
            addCriterion("ptz_preset_number_id not in", values, "ptzPresetNumberId");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdBetween(Integer value1, Integer value2) {
            addCriterion("ptz_preset_number_id between", value1, value2, "ptzPresetNumberId");
            return (Criteria) this;
        }

        public Criteria andPtzPresetNumberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ptz_preset_number_id not between", value1, value2, "ptzPresetNumberId");
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