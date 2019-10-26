package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by CZWGOGO on 2019/10/26 23:32
 */

//写入数据到文件中
public class TestStream3 {
    public static void main(String[] args) {
        try{
            File f=new File("D:/abc/lol.txt");
            //abc目录不存在,会报错

            //首先获取文件所在目录
            File dir=f.getParentFile();
            //如果该目录不存在，则创建该目录
            if(!dir.exists()){
                //dir.mkdir();//使用mkdir会抛出异常，因为该目录的父目录也不存在
                dir.mkdirs();
            }
            byte data[]={88,89};

            FileOutputStream fos=new FileOutputStream(f);

            fos.write(data);

            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
