package f1;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.PushPermissionHandler;
import g1.AbstractC1735d;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1683c extends AbstractC1735d {
    /* JADX WARN: Multi-variable type inference failed */
    public static void echo(Activity activity, String[] strArr, int i4) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (!TextUtils.isEmpty(strArr[i5])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i5], PushPermissionHandler.ANDROID_PERMISSION_STRING)) {
                    hashSet.add(Integer.valueOf(i5));
                }
            } else {
                throw new IllegalArgumentException(P0.gold(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (!hashSet.contains(Integer.valueOf(i11))) {
                    strArr2[i10] = strArr[i11];
                    i10++;
                }
            }
        }
        if (activity instanceof InterfaceC1682b) {
            ((InterfaceC1682b) activity).validateRequestPermissionsRequestCode(i4);
        }
        activity.requestPermissions(strArr, i4);
    }

    public static boolean foxtrot(Activity activity, String str) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33 && TextUtils.equals(PushPermissionHandler.ANDROID_PERMISSION_STRING, str)) {
            return false;
        }
        if (i4 >= 32) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        if (i4 == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
