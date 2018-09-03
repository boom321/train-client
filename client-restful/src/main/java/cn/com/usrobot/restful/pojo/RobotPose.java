package cn.com.usrobot.restful.pojo;

import java.util.Date;

public class RobotPose {
    private Integer id;

    private Integer robotId;

    private Float x;

    private Float y;

    private Float z;

    private Float orientationX;

    private Float orientationY;

    private Float orientationZ;

    private Float orientationW;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRobotId() {
        return robotId;
    }

    public void setRobotId(Integer robotId) {
        this.robotId = robotId;
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

    public Float getOrientationX() {
        return orientationX;
    }

    public void setOrientationX(Float orientationX) {
        this.orientationX = orientationX;
    }

    public Float getOrientationY() {
        return orientationY;
    }

    public void setOrientationY(Float orientationY) {
        this.orientationY = orientationY;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}