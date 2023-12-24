package cn.kk.util_box.utils

/**
 * 数值计算帮助类
 */
object ValueHelper {

    /**
     * 两个数是否差不多大
     */
    fun valueIsNearBy(valueA: Int, valueB: Int): Boolean{
        val min = Math.min(valueA, valueB)
        val diff = if (min < 30) min else 30
        return Math.abs(valueA - valueB) < diff
    }

    fun getRandomValue(start: Int, end: Int): Int {
        return (start .. end).random()
    }
}