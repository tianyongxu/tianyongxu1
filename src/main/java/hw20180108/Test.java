/**
 * Project Name:dt59haomework
 * File Name:Test.java
 * Package Name:hw20180108
 * Date:2018年1月8日上午10:37:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 上午10:37:55 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Test extends Thread {
    private int num;

    public Test(int num) {
        this.num = num;
    }

        public void run() {
        
           System.out.println(this.num + "个香蕉");
        
    }
}

