package cn.com.usrobot.restful.pojo;

public class InspectionPosition {
    private Integer id;

    private Integer seq;

    private Float posX;

    private Float posY;

    private Float posZ;

    private Float oriZ;

    private Float oriW;

    private String description;

    private Integer deviceId;

    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Float getPosX() {
        return posX;
    }

    public void setPosX(Float posX) {
        this.posX = posX;
    }

    public Float getPosY() {
        return posY;
    }

    public void setPosY(Float posY) {
        this.posY = posY;
    }

    public Float getPosZ() {
        return posZ;
    }

    public void setPosZ(Float posZ) {
        this.posZ = posZ;
    }

    public Float getOriZ() {
        return oriZ;
    }

    public void setOriZ(Float oriZ) {
        this.oriZ = oriZ;
    }

    public Float getOriW() {
        return oriW;
    }

    public void setOriW(Float oriW) {
        this.oriW = oriW;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}