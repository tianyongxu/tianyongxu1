/**
 * Project Name:dt59haomework
 * File Name:MyTeacher.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:54:38
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>第三题
 * Date:     2017年12月27日 下午2:54:38 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class MyTeacher {

    public static void main(String[] args) {
        String str="老师";
        int age=23;
        char gender = '男';
       Teacher teac = new Teacher(str, age, gender);
       System.out.println(teac.name);
       System.out.println(teac.age);
       System.out.println(teac.gender);
    }

}

