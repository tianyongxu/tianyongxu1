/**
 * Project Name:dt59haomework
 * File Name:AboutString.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:09:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;
import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午4:09:54 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class AboutString {
    private final static Logger LOG = Logger.getLogger(AboutString.class);
    
    public static void main(String[] args) {
/**
 * String的第一个方法，输出字符串制定未知的字符；
 */
        String str ="abcdefg";
        char cha = str.charAt(2);
        LOG.info("输出的是"+cha);
 /**
  * String 的第二个方法，连接到指定字符串的结尾；
  */
        String str1= "123456";
        String str2=str1.concat("789");
        LOG.info("第二个方法是"+str2);
 /**
  * String 的第三个方法，找出指定字符在字符串中的位置；
  */
      String str3="北大青鸟教学IT";
      int num=str3.indexOf('青');
     LOG.info("青在与剧中的位置是"+(num+1));
/**
 *  String 的第四个方法，判断字符串的长度是不是为零；
 */
     String str4="";
     boolean restlt=str4.isEmpty();
     LOG.info(restlt);

/**
 * String 的第五个 方法，返回一个新的字符串；
 */
    String str5 ="这是一个字符串";
    String str6 =str5.substring(3);    
    LOG.info(str6);
    }
  

}

