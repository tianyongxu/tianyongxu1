/**
 * Project Name:dt59haomework
 * File Name:DateDemo.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午5:05:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午5:05:31 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class DateDemo {
    private final static Logger LOG = Logger.getLogger(DateDemo.class);
    public static void main(String[] args) {
        
       Date dt = new Date(2018-1900, 1-1, 6);
       LOG.info(dt);
       //SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
       //sdf.applyLocalizedPattern(date);
       
       //格式：2018-1-6  
       String formatDate = null;  
       formatDate = DateFormat.getDateInstance().format(dt);  
       System.out.println(formatDate);    
         
       //格式：2018年1月6日 星期日  
       formatDate = DateFormat.getDateInstance(DateFormat.FULL).format(dt);  
       System.out.println(formatDate);  
         
       //格式 24小时制： 
       DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //HH表示24小时制；  
       formatDate = dFormat.format(dt);  
       System.out.println(formatDate);  
         
       //格式12小时制：
       DateFormat dFormat12 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //hh表示12小时制；  
       formatDate = dFormat12.format(dt);  
       System.out.println(formatDate);  

}
}
