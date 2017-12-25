/**
 * Project Name:dt59haomework
 * File Name:InputBig.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:00:54
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:00:54 <br/>
 * 
 * @author A555l
 * @version
 * @see
 */
public class InputBig {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个数");      
        int a = input.nextInt();
        int b = input.nextInt();
        InputBig whichBig = new InputBig();//调用的函数；
        System.out.println(whichBig.big(a, b));//需要保持内部形式的一直；如（num1，num2）

    }

    int big(int num1, int num2) {//这里的是形参，仅仅是告诉我们是什么类型的参数，用来参考；

        if (num1 > num2) {//里面的代码跟普通代码一样；
            return num1;
        } else {
            return num2;//虽然返回值只能有一个，但是只要不是在一个里面，就可以；
        }
    }
}
