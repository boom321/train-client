package cn.com.usrobot.restful.pojo;

public class AlertConfig {
    private Integer id;

    private Float upperLimit;

    private Float lowerLimit;

    private Integer alertLevelId;

    private Integer variableId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Float upperLimit) {
        this.upperLimit = upperLimit;
    }

    public Float getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(Float lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public Integer getAlertLevelId() {
        return alertLevelId;
    }

    public void setAlertLevelId(Integer alertLevelId) {
        this.alertLevelId = alertLevelId;
    }

    public Integer getVariableId() {
        return variableId;
    }

    public void setVariableId(Integer variableId) {
        this.variableId = variableId;
    }
}