package utils;

import com.hankcs.hanlp.HanLP;
import utils.ShortTextException;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class SimhashUtils {

    //计算字符串的hash值
    public static String getHash(String str) {
        try{
            // 这里使用了MD5获得hash值
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return new BigInteger(1, messageDigest.digest(str.getBytes("UTF-8"))).toString(2);
        }catch(Exception e){
            e.printStackTrace();
            return str;
        }
    }

    //计算字符串的SimHash值
    public static String getSimHash(String str) {
        //如果字符串的长度太短，无法分词，则抛出异常
        try {
            if (str.length() < 50){
                throw new ShortTextException("文本过短！");
            }
        } catch (ShortTextException e) {
            e.printStackTrace();
        }

        //1.将字符串进行分词
        List<String> keywords = HanLP.extractKeyword(str,str.length());

        //128长度的数组表示特征向量
        int[] a = new int[128];
        int len = keywords.size();
        double i = 1.0;
        for (String keyword : keywords) {
            //2.获取集合每一个元素的hash值
            String keywordHash = getHash(keyword);
            if (keywordHash.length() < 128){
                int others = 128-keywordHash.length();
                for (int j = 0; j < others; j++) {
                    keywordHash += "0";
                }
            }

            //3.加权、合并（每一次i的循环都会在a数组中进行一次合并）
            double term = i;
            for (int j = 0; j < a.length; j++) {
                //若hash值为1则取正值，0则取负值
                if (keywordHash.charAt(j) == '1'){
                    //根据词频从高到低，取权重10到0
                    a[j] += (10 - (term / (len / 10)));
                }else {
                    a[j] -= (10 - (term / (len / 10)));
                }
            }
            i = (int) term;
        }

        //4.降维
        String simHash = "";
        for (int k = 0; k < a.length; k++) {
            if (a[k] > 0){
                simHash += "1";
            }else {
                simHash += "0";
            }
        }
        return simHash;
    }



}
