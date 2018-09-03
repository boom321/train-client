package cn.com.usrobot.restful.pojo;

import java.util.ArrayList;
import java.util.List;

public class PtzPresetNumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PtzPresetNumberExample() {
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

        public Criteria andCameraIdIsNull() {
            addCriterion("camera_id is null");
            return (Criteria) this;
        }

        public Criteria andCameraIdIsNotNull() {
            addCriterion("camera_id is not null");
            return (Criteria) this;
        }

        public Criteria andCameraIdEqualTo(Integer value) {
            addCriterion("camera_id =", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdNotEqualTo(Integer value) {
            addCriterion("camera_id <>", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdGreaterThan(Integer value) {
            addCriterion("camera_id >", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("camera_id >=", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdLessThan(Integer value) {
            addCriterion("camera_id <", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdLessThanOrEqualTo(Integer value) {
            addCriterion("camera_id <=", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdIn(List<Integer> values) {
            addCriterion("camera_id in", values, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdNotIn(List<Integer> values) {
            addCriterion("camera_id not in", values, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdBetween(Integer value1, Integer value2) {
            addCriterion("camera_id between", value1, value2, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdNotBetween(Integer value1, Integer value2) {
            addCriterion("camera_id not between", value1, value2, "cameraId");
            return (Criteria) this;
        }

        public Criteria andPanIsNull() {
            addCriterion("pan is null");
            return (Criteria) this;
        }

        public Criteria andPanIsNotNull() {
            addCriterion("pan is not null");
            return (Criteria) this;
        }

        public Criteria andPanEqualTo(Float value) {
            addCriterion("pan =", value, "pan");
            return (Criteria) this;
        }

        public Criteria andPanNotEqualTo(Float value) {
            addCriterion("pan <>", value, "pan");
            return (Criteria) this;
        }

        public Criteria andPanGreaterThan(Float value) {
            addCriterion("pan >", value, "pan");
            return (Criteria) this;
        }

        public Criteria andPanGreaterThanOrEqualTo(Float value) {
            addCriterion("pan >=", value, "pan");
            return (Criteria) this;
        }

        public Criteria andPanLessThan(Float value) {
            addCriterion("pan <", value, "pan");
            return (Criteria) this;
        }

        public Criteria andPanLessThanOrEqualTo(Float value) {
            addCriterion("pan <=", value, "pan");
            return (Criteria) this;
        }

        public Criteria andPanIn(List<Float> values) {
            addCriterion("pan in", values, "pan");
            return (Criteria) this;
        }

        public Criteria andPanNotIn(List<Float> values) {
            addCriterion("pan not in", values, "pan");
            return (Criteria) this;
        }

        public Criteria andPanBetween(Float value1, Float value2) {
            addCriterion("pan between", value1, value2, "pan");
            return (Criteria) this;
        }

        public Criteria andPanNotBetween(Float value1, Float value2) {
            addCriterion("pan not between", value1, value2, "pan");
            return (Criteria) this;
        }

        public Criteria andTiltIsNull() {
            addCriterion("tilt is null");
            return (Criteria) this;
        }

        public Criteria andTiltIsNotNull() {
            addCriterion("tilt is not null");
            return (Criteria) this;
        }

        public Criteria andTiltEqualTo(Float value) {
            addCriterion("tilt =", value, "tilt");
            return (Criteria) this;
        }

        public Criteria andTiltNotEqualTo(Float value) {
            addCriterion("tilt <>", value, "tilt");
            return (Criteria) this;
        }

        public Criteria andTiltGreaterThan(Float value) {
            addCriterion("tilt >", value, "tilt");
            return (Criteria) this;
        }

        public Criteria andTiltGreaterThanOrEqualTo(Float value) {
            addCriterion("tilt >=", value, "tilt");
            return (Criteria) this;
        }

        public Criteria andTiltLessThan(Float value) {
            addCriterion("tilt <", value, "tilt");
            return (Criteria) this;
        }

        public Criteria andTiltLessThanOrEqualTo(Float value) {
            addCriterion("tilt <=", value, "tilt");
            return (Criteria) this;
        }

        public Criteria andTiltIn(List<Float> values) {
            addCriterion("tilt in", values, "tilt");
            return (Criteria) this;
        }

        public Criteria andTiltNotIn(List<Float> values) {
            addCriterion("tilt not in", values, "tilt");
            return (Criteria) this;
        }

        public Criteria andTiltBetween(Float value1, Float value2) {
            addCriterion("tilt between", value1, value2, "tilt");
            return (Criteria) this;
        }

        public Criteria andTiltNotBetween(Float value1, Float value2) {
            addCriterion("tilt not between", value1, value2, "tilt");
            return (Criteria) this;
        }

        public Criteria andZoomIsNull() {
            addCriterion("zoom is null");
            return (Criteria) this;
        }

        public Criteria andZoomIsNotNull() {
            addCriterion("zoom is not null");
            return (Criteria) this;
        }

        public Criteria andZoomEqualTo(Float value) {
            addCriterion("zoom =", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotEqualTo(Float value) {
            addCriterion("zoom <>", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomGreaterThan(Float value) {
            addCriterion("zoom >", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomGreaterThanOrEqualTo(Float value) {
            addCriterion("zoom >=", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomLessThan(Float value) {
            addCriterion("zoom <", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomLessThanOrEqualTo(Float value) {
            addCriterion("zoom <=", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomIn(List<Float> values) {
            addCriterion("zoom in", values, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotIn(List<Float> values) {
            addCriterion("zoom not in", values, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomBetween(Float value1, Float value2) {
            addCriterion("zoom between", value1, value2, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotBetween(Float value1, Float value2) {
            addCriterion("zoom not between", value1, value2, "zoom");
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