package cn.kk.util_box.utils

import android.graphics.Bitmap
import android.graphics.Matrix

/**
 * 位图工具类
 */
object BitmapHelper {


    /**
     * 选择变换
     * @param origin 原图
     * @param degree  旋转角度，可正可负
     * @return 旋转后的图片
     */
     fun rotateBitmap(origin: Bitmap?, degree: Float): Bitmap? {
        if (origin == null) {
            return null
        }
        val width = origin.width
        val height = origin.height
        val matrix = Matrix()
        matrix.setRotate(degree)
        // 围绕原地进行旋转
        val newBM = Bitmap.createBitmap(origin, 0, 0, width, height, matrix, false)
        if (newBM == origin) {
            return newBM
        }
        origin.recycle()
        return newBM
    }
}