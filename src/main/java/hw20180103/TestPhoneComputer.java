/**
 * Project Name:dt59haomework
 * File Name:TestPhoneComputer.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午7:53:37
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午7:53:37 <br/>
 * 
 * @author tianyongxu
 * @version
 * @see 在主函数里面实现重写；
 */
public class TestPhoneComputer {

    public static void main(String[] args) {

        Outlet outlet = new Computer();
        System.out.println("电脑" + outlet.charge());
        Intenet intenet1 = new Computer();
        System.out.println("电脑"+intenet1.surf());
        Intenet intenet = new Phone();
        System.out.println("手机" + intenet.surf());

    }

}
