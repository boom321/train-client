package cn.com.usrobot.restful.pojo;

public class Robot {
    private Integer id;

    private String ip;

    private Integer port;

    private String rosIp;

    private Integer rosPort;

    private String name;

    private Integer areaId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getRosIp() {
        return rosIp;
    }

    public void setRosIp(String rosIp) {
        this.rosIp = rosIp == null ? null : rosIp.trim();
    }

    public Integer getRosPort() {
        return rosPort;
    }

    public void setRosPort(Integer rosPort) {
        this.rosPort = rosPort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
}