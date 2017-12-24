/**
 * Project Name:dt59haomework
 * File Name:Dog.java
 * Package Name:dt59haomework1
 * Date:2017年12月24日下午1:25:39
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59haomework1;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 下午1:25:39 <br/>
 * @author  tianyongxu
 * @version
 * @see
 */
public class Dog {

    public static void main(String[] args) {
        Dog1 puppy = new Dog1();//类就是很多空的对象的集合；
        puppy.leg =4;          //类中规定了这个类里面所有的对象需要有的属性，需要有的方法；
        puppy.color = "灰色";   //类中的空对象需要自己从类中规定的属性充实自己，变成唯一的一个对象；
        puppy.ear=3;          // 这个格式  对象名.属性  可以理解为这个对象名的这个属性为 例如：puppy的ear是什么样的
        int a = puppy.run();
       System.out.println(puppy.ear);
       System.out.println(a);//方法的调用和属性的调用只差一个（）；
    }

}
  class Dog1{
      int leg; //这里就是描述这个属性，自己定义想知道的，后面引用的时候需要知道这里描述的是什么？
      String color;
      int ear;
      
      int run(){//这里是方法的定义；固定格式不能少，（）中以后还需要加东西；
          return 100;
      }
      String yell(){
          return "load";
      }
      void eat(){
          System.out.println("shit");
      }
      
  }
