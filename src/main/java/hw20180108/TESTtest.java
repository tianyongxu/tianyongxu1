/**
 * Project Name:dt59haomework
 * File Name:TESTtest.java
 * Package Name:hw20180108
 * Date:2018年1月8日上午10:39:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;


/**
 * Description:   <br/>
 * Date:     2018年1月8日 上午10:39:59 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class TESTtest {

    public static void main(String[] args) {
   //  System.out.println("nnnn");
       for(int i =1;i<10;i++){
         Test test = new Test(i);
         test.start();
         if(i==2){
            System.out.println( test.MAX_PRIORITY);
         }
         }

    }

}

