package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by CZWGOGO on 2019/10/25 23:36
 */

//以字节流的形式读取文件内容
public class TestStream1 {
    public static void main(String[] args) {
        try{
            //准备文件lol.txt，其中内容是AB，对应的ASCII分别是65,66
            File f=new File("d:/abc/lol.txt");
            //创建基于文件的输入流
            FileInputStream fis=new FileInputStream(f);
            //创建字节数组，其长度是文件的长度
            byte[] all=new byte[(int)f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for(byte b:all){
                //打印出来是65,66
                System.out.println(b);
            }
            //每次使用完流，需要关闭

                fis.close();
        }catch (IOException e) {
                e.printStackTrace();
        }
    }
}

