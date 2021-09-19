package utils;


import org.junit.Test;


import java.io.File;


public class TextIOUtilTest {


//测试文件读取，路径存在的情况
@Test
    public void readText() {
    File file = new File("D:\\TestText\\orig.txt");
    String string = TextIOUtil.readText(file);
    System.out.println(string);
    }

    //测试文件读取，路径不存在的情况
    @Test
    public void readText1() {
        File file = new File("D:\\TestText\\orig1.txt");
        String string = TextIOUtil.readText(file);
        System.out.println(string);
    }

    //测试文件的写出
    @Test
    public void writeText() {
        String string = "测试文件的写出";
        TextIOUtil.writeText(string,"D:\\TestText\\testwrite.txt");

    }


}
