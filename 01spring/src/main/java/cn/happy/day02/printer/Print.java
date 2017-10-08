package cn.happy.day02.printer;

import cn.happy.day02.link.Ink;
import cn.happy.day02.paper.Paper;

/**
 * Created by 13447 on 2017/9/28.
 */
public class Print {

    private Ink ink;

    private Paper paper;

    public void getprintSometing(){
        System.out.println("大姐！你正在"+ink.getColor()+"的"+paper.getPaper()+"上打印我爱学习这几个字");
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}
