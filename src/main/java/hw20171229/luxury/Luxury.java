/**
 * Project Name:dt59haomework
 * File Name:Luxury.java
 * Package Name:hw20171229.luxury
 * Date:2017年12月29日下午3:52:14
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229.luxury;

import hw20171229.Car;

/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:52:14 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Luxury extends Car {
    private String cost;
    private int money;
    private String typeString;
    public String getCost() {
        return cost;
    }
    public void setCost(String cost) {
        this.cost = cost;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public String getTypeString() {
        return typeString;
    }
    public void setTypeString(String typeString) {
        this.typeString = typeString;
    }
    public void summary() {
        System.out.println("我是豪车---车是靠发动机带动轮子转动的代步工具");
    }

}

