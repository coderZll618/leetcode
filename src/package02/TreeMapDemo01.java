package package02;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo01 {
    public static void main(String[] args) {
        TreeMap<student, String> tm = new TreeMap<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                int i = o2.getAge() - o1.getAge();
                i = i == 0 ? o2.getName().compareTo(o1.getName()) : i;
                return i;
            }
        });
        student stu1 = new student("zhangsan",20);
        student stu2 = new student("lisi",21);
        student stu3 = new student("wangwu",22);
        tm.put(stu1,"aa");
        tm.put(stu2,"bb");
        tm.put(stu3,"cc");

        System.out.println(tm);
    }
}
