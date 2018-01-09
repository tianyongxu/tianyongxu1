/**
 * Project Name:dt59haomework
 * File Name:DXoneTest.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:18:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:18:18 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class DXoneTest extends Thread {
    private int i;
    
    public DXoneTest(int i) {
        this.i = i;
    }

    public void run(){
        System.out.println("我是"+this.i+"号");
    }
}

