/**
 * Project Name:dt59haomework
 * File Name:Test.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午8:09:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;


/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午8:09:50 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Test {
    private final static Logger LOG= Logger.getLogger(Test.class);
    

    public static void main(String[] args) {

       String str = null;
       try {
           System.out.println(str.charAt(5));
        
    } catch (Exception e) {
        System.out.println("异常信息");
        LOG.info(str);//变量数据值；
        e.printStackTrace();
    }
    }

}

