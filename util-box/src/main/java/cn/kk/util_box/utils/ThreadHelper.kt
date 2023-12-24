package cn.kk.util_box.utils

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executors

object ThreadHelper {

    val singleExecutors = Executors.newSingleThreadExecutor()
    val executors = Executors.newCachedThreadPool()

    fun runOnUIThread(runnable: Runnable){
        Handler(Looper.getMainLooper()).post(runnable)
    }

    /**
     * 执行轻量级大量的
     */
    fun runTightTask(runnable: Runnable) {
        executors.execute(runnable)
    }

    fun runTask(runnable: Runnable) {
        singleExecutors.execute(runnable)
    }

}