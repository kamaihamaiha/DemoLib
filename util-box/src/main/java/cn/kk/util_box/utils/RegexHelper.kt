package cn.kk.util_box.utils

import java.util.regex.Pattern

/**
 * 正则表达式帮助类
 */
object RegexHelper {

    // 识别标签的正则表达式
    val patternTag = Pattern.compile("#([\\u4e00-\\u9fa5a-zA-Z][\\u4e00-\\u9fa5a-zA-Z0-9]{1,100})")


}