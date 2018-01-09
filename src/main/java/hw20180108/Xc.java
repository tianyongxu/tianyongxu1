/**
 * Project Name:dt59haomework
 * File Name:Xc.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:27:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:27:27 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Xc implements Runnable {
    private int i;
    @Override
    public void run() {
        System.out.println("今天是周"+i);
    }
    public Xc(int i) {
        this.i = i;
    }

}

