package traversalFolder;

import java.io.File;

/**
 * Created by CZWGOGO on 2019/10/22 12:55
 */

//遍历文件夹，找出最大和最小的文件
public class TestFile {
    public static void main(String[] args) {
        File f=new File("c:\\windows");
        File[]fs=f.listFiles();
        if(null==fs)
            return;
        long minSize=Integer.MAX_VALUE;
        long maxSize=0;
        File minFile=null;
        File maxFile=null;
        for(File file:fs){
            if(file.isDirectory())
                continue;
            if(file.length()>maxSize){
                maxSize=file.length();
                maxFile=file;
            }
            if(file.length()!=0&&file.length()<minSize){
                maxSize=file.length();
                minFile=file;
            }
        }
        System.out.printf("最大的文件是%s,其大小%,d字%n",maxFile.getAbsoluteFile(),maxFile.length());
        System.out.printf("最小的文件是%s,其大小为%,d字%n",minFile.getAbsoluteFile(),minFile.length());






    }
}
