package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTextRecheckingTest {

    @Test
    public void main() {
        String[] testpath1 = {"D:\\TestText\\orig","D:\\TestText\\orig_0.8_add"};
        String[] testpath2 = {"D:\\TestText\\orig","D:\\TestText\\orig_0.8_del"};
        String[] testpath3 = {"D:\\TestText\\orig","D:\\TestText\\orig_0.8_dis_1"};
        String[] testpath4 = {"D:\\TestText\\orig","D:\\TestText\\orig_0.8_dis_10"};
        String[] testpath5 = {"D:\\TestText\\orig","D:\\TestText\\orig_0.8_dis_15"};
        MainTextRechecking.main(testpath1);
        MainTextRechecking.main(testpath2);
        MainTextRechecking.main(testpath3);
        MainTextRechecking.main(testpath4);
        MainTextRechecking.main(testpath5);
    }


}