/**
 * Project Name:dt59haomework
 * File Name:Dog.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:10:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午5:10:39 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Dog extends Pet {
    public void play(){
        this.setHealth(this.getHealth()-10);
        this.setLove(this.getLove()+5);
        
    }
    

}

