package cn.bihu.text;

/**
 * Created by duanlei on 2016/11/8.
 */
public class TestJava {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

class TestJavaTest{
    public static void main(String[] args) {
        TestJava testJava = new TestJava();
        testJava.setName("张三");
        testJava.setAge(18);
        System.out.println("姓名："+testJava.getName()+"-----"+"年龄："+testJava.getAge());
    }
}
