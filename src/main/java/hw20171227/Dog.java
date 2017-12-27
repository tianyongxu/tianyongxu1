/**
 * Project Name:dt59haomework
 * File Name:Dog.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午3:16:14
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>第四题；
 * Date:     2017年12月27日 下午3:16:14 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Dog {
    String name;
    int age;
    char gender;
    public Dog(String name){
        this.name="狗子";                      
    }
    public Dog(String name, int age){
        this(name);
        this.age=211;
    }
    public Dog(String name,int age,char gender){
        this(name, age);
        this.gender='男';
        
    }
}

