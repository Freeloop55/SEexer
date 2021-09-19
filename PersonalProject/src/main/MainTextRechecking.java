package main;

import utils.HammingUtils;
import utils.SimhashUtils;
import utils.TextIOUtil;

import java.io.File;

public class MainTextRechecking {
    public static void main(String[] args) {

        //通过命令行参数的文件路径读取文件
        File oldfile = new File(args[0] + ".txt");
        File newfile = new File(args[1] + ".txt");
        String oldtext = TextIOUtil.readText(oldfile);
        String newtext = TextIOUtil.readText(newfile);

        //计算simhash值
        String simHash1 = SimhashUtils.getSimHash(oldtext);
        String simHash2 = SimhashUtils.getSimHash(newtext);

        //计算重复率
        double repetitionRate = HammingUtils.getRepetitionRate(HammingUtils.getHammingDistance(simHash1,simHash2));
        String writetextString = repetitionRate + "%";

        //写出文件
        TextIOUtil.writeText("查重完成，重复率为：" + writetextString,args[1] + ".result.txt");
    }
}
