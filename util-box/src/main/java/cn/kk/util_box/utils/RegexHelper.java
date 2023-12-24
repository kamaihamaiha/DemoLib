package cn.kk.util_box.utils;

import java.util.regex.Pattern;

/**
 * 正则表达式帮助类: Java版
 */
public class RegexHelper {



    public static void main(String[] args) {

        String content = "This is text";
        String content2 = "3.14";

        // 匹配规则
        String pattern = ".* is .*";

        /**
         * ^ 定义了以什么开始
         * \d+ 匹配一个或多个数字
         * ? 设置括号内的选项是可选的
         * \. 匹配 "."
         */
        String pattern2 = "^\\d\\.(\\d+)?";

        System.out.println("字符串是否包含了 'is' 子字符串？：" + Pattern.matches(pattern, content));
        System.out.println("字符串是否是小数？：" + Pattern.matches(pattern2, content2));
        System.out.println("字符串是否是小数？：" + Pattern.matches(pattern2, "3"));
        System.out.println("字符串是否是小数？：" + Pattern.matches(pattern2, "3."));
    }
}
