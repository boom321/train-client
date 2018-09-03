package cn.com.usrobot.restful.pojo;

public class ChargingRoute {
    private Integer robotId;

    private Integer seq;

    private Float x;

    private Float y;

    private Float z;

    private Float orientationZ;

    private Float orientationW;

    public Integer getRobotId() {
        return robotId;
    }

    public void setRobotId(Integer robotId) {
        this.robotId = robotId;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
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

    public Float getZ() {
        return z;
    }

    public void setZ(Float z) {
        this.z = z;
    }

    public Float getOrientationZ() {
        return orientationZ;
    }

    public void setOrientationZ(Float orientationZ) {
        this.orientationZ = orientationZ;
    }

    public Float getOrientationW() {
        return orientationW;
    }

    public void setOrientationW(Float orientationW) {
        this.orientationW = orientationW;
    }
}