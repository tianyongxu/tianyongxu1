/**
 * Project Name:dt59haomework
 * File Name:Computer.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午7:43:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午7:43:53 <br/>
 * @author   tianyongxu
 * @version
 * @see
 * 电脑使用 网络的，插座的功能 且必须继承；
 */
public class Computer implements Outlet,Intenet {

    @Override
    public String charge() {

        return "充电后能启动";
    }

    @Override
    public String surf() {
        
      
        return "连接网络后可以网上冲浪";
    }

}

