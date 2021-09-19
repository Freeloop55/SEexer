package utils;

public class HammingUtils {

    //计算两个simHash值的海明距离
    public static int getHammingDistance(String simHash1,String simHash2){
        int distance = 0;
        for (int i = 0; i < simHash1.length(); i++) {
            if (simHash1.charAt(i) != simHash2.charAt(i)){
                distance++;
            }
        }
        return distance;
    }

    //计算查重率
    public static double getRepetitionRate(int distance){
        return (100 - (distance * 100 / 128));
    }

}
