/**
 * Project Name:dt59haomework
 * File Name:Test01.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午11:35:53
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午11:35:53 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Test01 {
    public static void main(String[] args) {
        double a = 399;
        Scanner input = new Scanner(System.in);
        System.out.println("您的卡是什么类型？");
        System.out.println("1、至尊2、钻石3、铂金4、黄金5、白银");
        String key = input.next();
        VipType vipType = new VipType();
        double count = vipType.count(key, a);
        System.out.println(count);
    }
}

class VipType{
    
    String vipType;
    
    double count(String vipType, double money){
        double count = 0;
        switch (vipType) {
        case "至尊":
            count = 7.5 * money;
            break;
        case "钻石":
            count = 8 * money;
            break;
        case "铂金":
            count = 8.5 * money;
            break;
        case "黄金":
            count = 9 * money;
            break;
        case "白银":
            count = 9.5 * money;
            break;
        }
        return count;
    }
}
