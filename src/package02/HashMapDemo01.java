package package02;

import java.util.*;

public class HashMapDemo01{
    public static void main(String[] args) {
        Map<student,String> hm = new HashMap<>();
        student stu1 = new student("zhangsan",20);
        student stu2 = new student("lisi",21);
        student stu3 = new student("wangwu",22);

        hm.put(stu1,"a");
        hm.put(stu2,"b");
        hm.put(stu3,"c");

        Set<student> keys = hm.keySet();
        for (student key : keys) {
            System.out.println(key + " , " + hm.get(key));
        }

        Set<Map.Entry<student, String>> entries = hm.entrySet();
        for (Map.Entry<student, String> studentStringEntry : entries) {
            System.out.println(studentStringEntry.getKey()+" , "+studentStringEntry.getValue());
        }

        hm.forEach((student,String)-> System.out.println(student+" , "+String));

    }





}
