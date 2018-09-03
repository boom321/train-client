package cn.com.usrobot.restful.pojo;

public class Variable {
    private Integer id;

    private String name;

    private Integer deviceId;

    private Integer dataSubtypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getDataSubtypeId() {
        return dataSubtypeId;
    }

    public void setDataSubtypeId(Integer dataSubtypeId) {
        this.dataSubtypeId = dataSubtypeId;
    }
}