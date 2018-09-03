package cn.com.usrobot.restful.pojo;

public class HistAlert {
    private Integer id;

    private Integer histDataId;

    private Boolean confirmed;

    private Integer alertConfigId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHistDataId() {
        return histDataId;
    }

    public void setHistDataId(Integer histDataId) {
        this.histDataId = histDataId;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Integer getAlertConfigId() {
        return alertConfigId;
    }

    public void setAlertConfigId(Integer alertConfigId) {
        this.alertConfigId = alertConfigId;
    }
}