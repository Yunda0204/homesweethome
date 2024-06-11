package servlets;

public class Student {
    public static int num = 1000;
    public int stnum;

    public Student() {
    num++;
        stnum = num;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Student.num = num;
    }

    public int getStnum() {
        return stnum;
    }

    public void setStnum(int stnum) {
        this.stnum = stnum;
    }
}
