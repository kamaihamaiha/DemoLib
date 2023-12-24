package cn.kk.util_box.utils;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.content.ContextCompat;


public class PermissionsHelper {
    private final Context mContext;

    public PermissionsHelper(Context context) {
        mContext = context.getApplicationContext();
    }

    // 判断权限集合
    public boolean lacksPermissions(String[] permissions) {
        for (String permission : permissions) {
            if (lacksPermission(permission)) {
                return true;
            }
        }
        return false;
    }

    // 判断是否缺少权限
    private boolean lacksPermission(String permission) {
        return ContextCompat.checkSelfPermission(mContext, permission) ==
                PackageManager.PERMISSION_DENIED;
    }

}
