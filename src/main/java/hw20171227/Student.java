/**
 * Project Name:dt59haomework
 * File Name:Student.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:31:14
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>第二题
 * Date:     2017年12月27日 下午2:31:14 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Student {
    String name="田永旭";
    int age=25;
    char gender='男';
    public Student(/*String name,int age,char gender*/){
        this.name="小田";
        this.age=5;
        this.gender='雄';
    }
    public static void main(String[] args) {
        Student student =new Student();     
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        
    }
}

