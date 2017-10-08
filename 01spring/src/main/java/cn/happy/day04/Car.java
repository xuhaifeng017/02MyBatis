package cn.happy.day04;

/**
 * Created by 13447 on 2017/10/7.
 */
public class Car {

    private String car;

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                '}';
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
