/**
 * Project Name:dt59haomework
 * File Name:ListAndMap.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:55:52
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午4:55:52 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class ListAndMap {
    private final static Logger LOG= Logger.getLogger(ListAndMap.class);
      public static void main(String[] args) {
        /**
         * 关于list map的增、删、改、查四项功能；
         */
        List list =new ArrayList();
        list.add("姓名");
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        LOG.info("这个list的集合的长度"+list.size());
        list.get(4);                     //先查看第四个元素
        LOG.info("这时第4个元素是:"+list.get(4));
        list.remove(4);                  //再清除第四个元素
        LOG.info("这时第4个元素是:"+list.get(4));
        list.set(4, "你");               //改第四个元素
        LOG.info("这时第4个元素是:"+list.get(4)+list.size());
        list.indexOf("好");
        LOG.info("这时:"+list.size());
        Iterator iterator =list.iterator();
        while(iterator.hasNext()){
            LOG.info(iterator.next());
        }
         Map map = new HashMap();//重写
        map.put("周一", "语文");//增加量
        map.put("周二", "数学");
        map.put("周三", "英语");
        map.put("周四", "物理");
        LOG.info(map.size());
        map.remove("周一");//删除
        map.get("周一");
      Set keys =map.keySet();//
      for(Object key:keys){
          LOG.info(key);
          LOG.info(map.get(key));
      }
    }

}

