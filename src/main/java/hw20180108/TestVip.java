/**
 * Project Name:dt59haomework
 * File Name:TestVip.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:54:26
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:54:26 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class TestVip {

    public static void main(String[] args) {
        for(int i =1;i<100;i++){
        AboutVip aV = new AboutVip(i);
        if(i==90){
            System.out.print("VIP:");
            aV.setPriority(Thread.MAX_PRIORITY);//这里并没有什么用啊，用MIN_PRIORITY
        }
        if(i==2){
            System.out.print("团购");
            aV.setPriority(Thread.MIN_PRIORITY);
        }
        aV.start();
        }

    }

}

