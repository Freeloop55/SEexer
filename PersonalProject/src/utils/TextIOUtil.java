package utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class TextIOUtil {

    //读取文件并转换成字符串
    public static String readText(File file) {
        StringBuilder text = new StringBuilder();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            char[] cbuf = new char[5];
            int len;
            while ( (len = fileReader.read(cbuf)) != -1){
                for (int i = 0; i < len; i++) {
                    text.append(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return text.toString();
    }

    //写出文件
    public static void writeText(String text,String path){
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
