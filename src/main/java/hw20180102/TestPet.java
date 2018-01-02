/**
 * Project Name:dt59haomework
 * File Name:TestPet.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:19:14
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午5:19:14 <br/>
 * @author   tianyongxu
 * @version
 * @see
 * 举例一
 * 父类：办公用品：
 * 子类：电脑、打印机
 * 多态的方法（运行）：电脑运行，耗电20kw/天，打印机耗电10kw/天；
 * 举例二
 * 父类：水果
 * 子类：葡萄、西瓜
 * 多态的的方法（榨汁）：葡萄榨汁是紫色，西瓜榨汁是红色；
 * 举例三
 * 父类：学校
 * 子类：新东方、北大青鸟；
 * 多态的的方法（教学）：新东方教英语，北大青鸟教IT；
 */
public class TestPet {

    public static void main(String[] args) {

      Pet pet1 =new Dog();
      Pet pet2 =new Cat();
      pet1.play();
      pet2.play();
      System.out.println("狗的健康值"+pet1.getHealth()+"亲密度"+pet1.getLove());
      System.out.println("猫的健康值"+pet2.getHealth()+"亲密度"+pet2.getLove());

    }

}

