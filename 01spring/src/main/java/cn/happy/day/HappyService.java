package cn.happy.day;

/**
 * Created by 13447 on 2017/9/28.
 */
public class HappyService {

     private  String info;

     public void work(){
         System.out.println("work"+info);
     }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
