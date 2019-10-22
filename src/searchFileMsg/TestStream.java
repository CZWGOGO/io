package searchFileMsg;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by CZWGOGO on 2019/10/23 2:06
 */
public class TestStream {
    //file 查找的目录
    //seacrchStr 查找的字符串
    //测试类，用类方法，减少代码量
    public static void search(File file, String searchStr) {
        if (file.isFile()) {
            if (file.getName().toLowerCase().endsWith(".exe")) {
                String fileContent = readFileContent(file);
                if (fileContent.contains(searchStr)) {
                    System.out.printf("找到子目标字符串%s,在文件:%s%n",searchStr,file);
                }
            }
        }
        if(file.isDirectory()) {
            File[] fs = file.listFiles();
            for(File f:fs){
                search(f,searchStr);
            }
        }
        if(file.isHidden()){
            System.out.println("1");
        }
    }
    //读取文件内容
    public static String readFileContent(File file){
        try(FileReader fr=new FileReader(file)){
            char[]all =new char[(int)file.length()];
            fr.read(all);

            return new String(all);
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

    }
    //如果遍历文件无权限，易抛出空指针异常
    public static void main(String[] args) {
        File folder=new File("F:\\Git");
        search(folder,"github");
    }
}
