/**
 * Project Name:dt59haomework
 * File Name:TestXc.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:30:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:30:34 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class TestXc {

    public static void main(String[] args) {

       for (int i = 0; i <10; i++) {
        Xc xc = new Xc(i);//这是将Thread th =new Thread();
        new Thread(xc).start();
    }

    }

}

