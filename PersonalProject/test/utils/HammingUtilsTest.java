package utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class HammingUtilsTest {

    //计算海明距离测试，两串字符串完全相同的情况
    @Test
    public void getHammingDistance() {
        String str1 = "000111";
        String str2 = "000111";
        System.out.println("海明距离测试1结果：" + HammingUtils.getHammingDistance(str1,str2));

    }

    //计算海明距离测试，两串字符串完全不相同的情况
    @Test
    public void getHammingDistance1() {
        String str1 = "000111";
        String str2 = "111000";
        System.out.println("海明距离测试2结果：" + HammingUtils.getHammingDistance(str1,str2));

    }

    //计算海明距离测试，两串字符串长度不相同的情况
    @Test
    public void getHammingDistance2() {
        String str1 = "000111";
        String str2 = "1010101100";
        System.out.println("海明距离测试3结果：" + HammingUtils.getHammingDistance(str1,str2));

    }

    //计算重复率测试，海明距离为0的情况
    @Test
    public void getRepetitionRate() {
        int distance = 0;
        System.out.println("计算重复率测试1结果：" + HammingUtils.getRepetitionRate(distance));
    }

    //计算重复率测试，海明距离为50的情况
    @Test
    public void getRepetitionRate1() {
        int distance = 50;
        System.out.println("计算重复率测试2结果：" + HammingUtils.getRepetitionRate(distance));
    }

    //计算重复率测试，海明距离为128的情况
    @Test
    public void getRepetitionRate2() {
        int distance = 128;
        System.out.println("计算重复率测试3结果：" + HammingUtils.getRepetitionRate(distance));
    }

}