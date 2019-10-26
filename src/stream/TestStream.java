package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by CZWGOGO on 2019/10/26 0:27
 */

//以字节流的形式向文件写入数据
public class TestStream {
    public static void main(String[] args){
        try{
            //准备文件lol.txt其中的内容是空的
            File f=new File("D:/lol2.txt");
            //准备长度是2的字节数组，用88,89初始化，其对应的字符分别是x，y
            byte data[]={88,89};

            //创建基于文件的输出流
            FileOutputStream fos=new FileOutputStream(f);
            //把数据写入输入流
            fos.write(data);
            //关闭输出流
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
