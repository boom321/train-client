package cn.com.usrobot.restful.pojo;

public class RobotChargingPosition {
    private Integer robotRobotId;

    private Float x;

    private Float y;

    private Float orientation;

    public Integer getRobotRobotId() {
        return robotRobotId;
    }

    public void setRobotRobotId(Integer robotRobotId) {
        this.robotRobotId = robotRobotId;
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

    public Float getOrientation() {
        return orientation;
    }

    public void setOrientation(Float orientation) {
        this.orientation = orientation;
    }
}