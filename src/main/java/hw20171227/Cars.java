/**
 * Project Name:dt59haomework
 * File Name:Cars.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午4:09:56
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:09:56 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Cars {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.back());//常规方法，需要重新调用；
        System.out.println(car.money);
        
       System.out.println(Car.type);//Static的直接用类名方法调用；
       System.out.println(Car.run());

    }

}

