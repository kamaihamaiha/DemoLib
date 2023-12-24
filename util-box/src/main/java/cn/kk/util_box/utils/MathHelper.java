package cn.kk.util_box.utils;

public class MathHelper {

    public static final int DISABLE_NONE_TYPE = 0; // 不禁止
    public static final int DISABLE_EXPORT_TYPE = 1;
    public static final int DISABLE_SHARE_TYPE = 1 << 1;
    public static final int DISABLE_OFFLINE_DOWNLOAD_TYPE = 1 << 2;
    public static final int DISABLE_PRINT_TYPE = 1 << 3;

    public static double toProgress(double process) {
        return Math.ceil(process);
    }

    public static String toPercent(double process) {
        return String.format("%d", (int)(Math.ceil(process * 100))) + "%";
    }

    public static void main(String[] args) {


//        System.out.println("50.1: " + toPercent(0.501));

        int typeCount = 0b11111;

        for (int i = 0; i <= typeCount; i++) {
            System.out.println("type: " + i + " => " + getType(i));
        }
    }

    public static String getType(int type) {
        StringBuilder typeInfo = new StringBuilder("type: ");
        if (typeNone(type)) {
            typeInfo.append("none, ");
        }
        if (typeExport(type)) typeInfo.append("export, ");
        if (typeShare(type)) typeInfo.append("share, ");
        if (typeOfflineDownload(type)) typeInfo.append("offline-download, ");
        if (typePrint(type)) typeInfo.append("print, ");

        return typeInfo.toString();
    }

    public static boolean typeNone(int type){
        return type == DISABLE_NONE_TYPE;
    }

    public static boolean typeExport(int type){
        // 1 个位数：DISABLE_EXPORT_TYPE
        // 1
        // 1

        return (type & DISABLE_EXPORT_TYPE) == DISABLE_EXPORT_TYPE;
    }

    public static boolean typeShare(int type){
        return (type & DISABLE_SHARE_TYPE) == DISABLE_SHARE_TYPE;
    }

    public static boolean typeOfflineDownload(int type){
        return (type & DISABLE_OFFLINE_DOWNLOAD_TYPE) == DISABLE_OFFLINE_DOWNLOAD_TYPE;
    }

    public static boolean typePrint(int type){
        return (type & DISABLE_PRINT_TYPE) == DISABLE_PRINT_TYPE;
    }
}
