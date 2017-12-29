/**
 * Project Name:dt59haomework
 * File Name:Car.java
 * Package Name:hw20171229
 * Date:2017年12月29日下午3:12:14
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:12:14 <br/>
 * 
 * @author tianyongxu
 * @version
 * @see
 */
public abstract class Car {
  private  int tyre;

  private String color;

    public void summary() {
        System.out.println("车是靠发动机带动轮子转动的代步工具");

    }

    public int getTyre() {
        return tyre;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
