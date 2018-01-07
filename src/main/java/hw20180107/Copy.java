/**
 * Project Name:dt59haomework
 * File Name:Copy.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午4:27:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午4:27:03 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Copy {

    public static void main(String[] args) {
        String path = "D:\\田永旭.txt";
        String path1= "F:\\田永旭.txt";
        File file = new File(path);
        File file2 = new File(path1);
        try {
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos=new FileOutputStream(file2);
            fis.read();
            int temp;
            while((temp=fis.read())!=-1){//先赋值给temp 然后再判断还有没有值；
               fos.write(temp);
              
            }
            
        } catch (FileNotFoundException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        } catch (IOException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }

    }

}

