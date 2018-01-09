/**
 * Project Name:dt59haomework
 * File Name:TestDXone.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:24:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:24:19 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class TestDXone {

    public static void main(String[] args) {
        for (int i = 0; i< 10; i++) {            
            DXoneTest dXoneTest = new DXoneTest(i);
            dXoneTest.start();
        }

    }

}

