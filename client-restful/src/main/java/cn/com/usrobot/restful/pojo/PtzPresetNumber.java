package cn.com.usrobot.restful.pojo;

public class PtzPresetNumber {
    private Integer id;

    private Integer cameraId;

    private Float pan;

    private Float tilt;

    private Float zoom;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCameraId() {
        return cameraId;
    }

    public void setCameraId(Integer cameraId) {
        this.cameraId = cameraId;
    }

    public Float getPan() {
        return pan;
    }

    public void setPan(Float pan) {
        this.pan = pan;
    }

    public Float getTilt() {
        return tilt;
    }

    public void setTilt(Float tilt) {
        this.tilt = tilt;
    }

    public Float getZoom() {
        return zoom;
    }

    public void setZoom(Float zoom) {
        this.zoom = zoom;
    }
}