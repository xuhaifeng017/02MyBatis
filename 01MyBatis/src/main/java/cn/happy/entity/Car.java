package cn.happy.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 13447 on 2017/9/21.
 */
public class Car {
    private Integer cid;
    private  String cname;
    private  Integer pid;
    private List<Car> cars=new ArrayList<Car>();

    @Override
    public String toString() {
        return "Car{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", pid=" + pid +
                ", cars=" + cars +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
