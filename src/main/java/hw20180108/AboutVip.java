/**
 * Project Name:dt59haomework
 * File Name:AboutVip.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:40:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:40:32 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class AboutVip extends Thread {
    private int vip;

    public AboutVip(int vip) {
        this.vip = vip;
    }
    public void run(){
        System.out.println(vip);
    }
    
}

