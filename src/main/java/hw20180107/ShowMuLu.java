/**
 * Project Name:dt59haomework
 * File Name:ShowMuLu.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午3:54:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.File;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午3:54:12 <br/>
 * 
 * @author tianyongxu
 * @version
 * @see
 */
public class ShowMuLu {

    public static void main(String[] args) throws Exception {
        String path = "D:\\";
        File file = new File(path);
        File[] files = file.listFiles();
        for (File file2 : files) {
            if(file2.isFile()){
                System.out.println(file2.getName());//输出的是第一级的文件；
            }else{
                File[] shuzufi2=file2.listFiles();
                for (File file3 : shuzufi2) {
                    System.out.println(file3.getName());//输出的是第二级菜单的所有东西
                }
            }
        }
    }

}
