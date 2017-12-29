/**
 * Project Name:dt59haomework
 * File Name:Bus.java
 * Package Name:hw20171229
 * Date:2017年12月29日下午3:19:58
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:19:58 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Bus extends Car {
  private  int tyre=4;
  private String name;
    
    public int getTyre() {
    return tyre;
}

public void setTyre(int tyre) {
    this.tyre = tyre;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

    public void run(){
        System.out.println("车子能跑1999m/s");
      
        
    }

}

