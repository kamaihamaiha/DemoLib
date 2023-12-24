package cn.kk.util_box.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TimeHelper {

    private static final SimpleDateFormat SMF = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SSS");


    /**
     * 将 ms 格式化成 时:分
     * @param duration 时长，单位 ms
     * @return
     */
    public static String getDurationFormat(long duration) {
        return String.format(Locale.getDefault(), "%02d:%02d",
                TimeUnit.MILLISECONDS.toMinutes(duration),
                TimeUnit.MILLISECONDS.toSeconds(duration)
                        - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
    }

    public static String getTimeSecond(){
        return SMF.format(new Date());
    }
}
