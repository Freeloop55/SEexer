package utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimhashUtilsTest {

    //求hash值测试，正常文本
    @Test
    public void getHash() {
        String str = "今天天气很不错";
        System.out.println("gethash测试1，结果：" + SimhashUtils.getHash(str));
    }

    //求hash值测试，文本带有特殊符号
    @Test
    public void getHash1() {
        String str = "今天/是%星期天~天气#很好";
        System.out.println("gethash测试2，结果：" + SimhashUtils.getHash(str));
    }

    //求hash值测试，文本有数字
    @Test
    public void getHash2() {
        String str = "我的电话号码是111222333444";
        System.out.println("gethash测试3，结果：" + SimhashUtils.getHash(str));
    }

    //求SimHash值测试，文本过短的情况
    @Test
    public void getSimHash() {
        String str = "该次测试的文本很短";
        System.out.println("getSimHash测试1，结果：" + SimhashUtils.getSimHash(str));
    }

    //求SimHash值测试，文本长度符合要求的情况
    @Test
    public void getSimHash1() {
        String str = "一位真正的作家永远只为内心写作，只有内心才会真实地告诉他，他的自私、他的高尚是多么突出。内心让他真实地了解自己，一旦了解了自己也就了解了世界。很多年前我就明白了这个原则，可是要捍卫这个原则必须付出艰辛的劳动和长时期的痛苦，因为内心并非时时刻刻都是敞开的，它更多的时候倒是封闭起来，于是只有写作，不停地写作才能使内心敞开，才能使自己置身于发现之中，就像日出的光芒照亮了黑暗，灵感这时候才会突然来到。\n" +
                "\n" +
                "    长期以来，我的作品都是源出于和现实的那一层紧张关系。我沉湎于想象之中，又被现实紧紧控制，我明确感受着自我的分裂，我无法使自己变得纯粹，我曾经希望自己成为一位童话作家，要不就是一位实实在在作品的拥有者，如果我能够成为这两者中的任何一个，我想我内心的痛苦将会轻微得多，可是与此同时我的力量也会削弱很多。\n" +
                "\n" +
                "    事实上我只能成为现在这样的作家，我始终为内心的需要而写作，理智代替不了我的写作，正因为此，我在很长一段时间是一个愤怒和冷漠的作家。";
        System.out.println("getSimHash测试2，结果：" + SimhashUtils.getSimHash(str));
    }


}