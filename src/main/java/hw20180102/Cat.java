/**
 * Project Name:dt59haomework
 * File Name:Cat.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:17:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午5:17:03 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Cat extends Pet{
    public void play(){
        this.setHealth(this.getHealth()-20);
        this.setLove(this.getLove()+10);
    }

}

