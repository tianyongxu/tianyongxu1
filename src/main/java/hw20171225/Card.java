/**
 * Project Name:dt59haomework
 * File Name:Card.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:35:19
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:35:19 <br/>
 * 
 * @author tianyongxu
 * @version
 * @see
 */
public class Card {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VipKind cardd= new VipKind();
        System.out.println("您的卡是什么类型？");
        System.out.println("1、至尊2、钻石3、铂金4、黄金5、白银");
         int key = input.nextInt();
         switch (key) {
        case 1:
            System.out.println(cardd.discount1());
            break;
        case 2:
            System.out.println(cardd.discount2());
            break;
        case 3:
            System.out.println(cardd.discount3());
            break;
        case 4:
            System.out.println(cardd.discount4());
            break;
        case 5:
            System.out.println(cardd.discount5());
            break;
        default:
            System.out.println("输入不正确");
            break;
        }
    }
}

class VipKind {
    double consume = 5000;
    String vipCard1;
    String vipCard2;
    String vipCard3;
    String vipCard4;
    String vipCard5;
    double discount1() {
        
        return 7.5 * consume;
    }
    double discount2(){
        return 8 * consume;
    }
    double discount3(){
        return 8.5 * consume;
    }
    double discount4(){
        return 9 * consume;
    }
    double discount5(){
        return 9.5 * consume;
    }
}
