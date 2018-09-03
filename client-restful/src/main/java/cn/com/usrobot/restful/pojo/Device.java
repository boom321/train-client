package cn.com.usrobot.restful.pojo;

public class Device {
    private Integer id;

    private Float x;

    private Float y;

    private String name;

    private String serialNumber;

    private Boolean onRobot;

    private Integer deviceCategoryId;

    private Integer plantUnitId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Boolean getOnRobot() {
        return onRobot;
    }

    public void setOnRobot(Boolean onRobot) {
        this.onRobot = onRobot;
    }

    public Integer getDeviceCategoryId() {
        return deviceCategoryId;
    }

    public void setDeviceCategoryId(Integer deviceCategoryId) {
        this.deviceCategoryId = deviceCategoryId;
    }

    public Integer getPlantUnitId() {
        return plantUnitId;
    }

    public void setPlantUnitId(Integer plantUnitId) {
        this.plantUnitId = plantUnitId;
    }
}