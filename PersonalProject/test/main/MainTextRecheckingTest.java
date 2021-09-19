package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTextRecheckingTest {

    @Test
    public void main() {
        String[] testpath = {"D:\\TestText\\orig","D:\\TestText\\orig_0.8_add"};
        MainTextRechecking.main(testpath);
    }

    @Test
    public void main1() {
        String[] testpath = {"D:\\TestText\\orig","D:\\TestText\\orig_0.8_del"};
        MainTextRechecking.main(testpath);
    }

    @Test
    public void main2() {
        String[] testpath = {"D:\\TestText\\orig","D:\\TestText\\orig_0.8_dis_10"};
        MainTextRechecking.main(testpath);
    }
}