package g1;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import com.clevertap.android.sdk.PushPermissionHandler;
import f1.AbstractC1687g;
import f1.ac;
import i1.AbstractC1882c;
import i1.i;
import i1.k;
import java.util.Objects;
import java.util.concurrent.Executor;
import o1.ExecutorC2190c;

/* renamed from: g1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1735d {
    public static final Object alpha = null;

    public static int alpha(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(PushPermissionHandler.ANDROID_PERMISSION_STRING, str)) {
                if (new ac(context).alpha()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int bravo(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                        int callingUid = Binder.getCallingUid();
                        int i4 = 1;
                        if (appOpsManager == null) {
                            noteProxyOpNoThrow = 1;
                        } else {
                            noteProxyOpNoThrow = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, packageName);
                        }
                        if (noteProxyOpNoThrow == 0) {
                            String alpha2 = AbstractC1687g.alpha(context);
                            if (appOpsManager != null) {
                                i4 = appOpsManager.checkOpNoThrow(permissionToOp, myUid, alpha2);
                            }
                            noteProxyOpNoThrow = i4;
                        }
                    } else {
                        noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0046, code lost:
    
        if (r5.charlie == r9.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList charlie(int i4, Context context) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        i1.h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        i iVar = new i(resources, theme);
        synchronized (k.charlie) {
            try {
                SparseArray sparseArray = (SparseArray) k.bravo.get(iVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (hVar = (i1.h) sparseArray.get(i4)) != null) {
                    if (hVar.bravo.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (hVar.charlie != 0) {
                            }
                            colorStateList2 = hVar.alpha;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i4);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = k.alpha;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i4, typedValue, true);
        int i5 = typedValue.type;
        if (i5 < 28 || i5 > 31) {
            try {
                colorStateList = AbstractC1882c.alpha(resources, resources.getXml(i4), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList != null) {
            k.alpha(iVar, i4, colorStateList, theme);
            return colorStateList;
        }
        return resources.getColorStateList(i4, theme);
    }

    public static Executor delta(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC1734c.alpha(context);
        }
        return new ExecutorC2190c(new Handler(context.getMainLooper()));
    }
}
