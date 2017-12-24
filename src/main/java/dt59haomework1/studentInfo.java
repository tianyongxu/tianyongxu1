/**
 * Project Name:dt59haomework
 * File Name:studentInfo.java
 * Package Name:dt59haomework1
 * Date:2017年12月24日上午10:37:56
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59haomework1;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 上午10:37:56 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class studentInfo{
    public static void main(String[] args){
        info student=new info();
        student.age=12;
        student.chengji=222;
        student.name="田永旭";
        
        System.out.println(student.name);
    }
}
     class info {
    
         String name ;
         int age;
         int chengji;
        
        
         
    void kaoshi(){
        System.out.println("会考试");
    }
    int run(){
        return 100;
    }
        
     
}

