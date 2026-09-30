package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import ap.a;
import g.C1718a;
import j2.AbstractC1936c;
import java.io.File;

/* loaded from: classes3.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File cacheDir;
        Context createDeviceProtectedStorageContext;
        Context createDeviceProtectedStorageContext2;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                AbstractC1936c.tango(context, new a(1), new C1718a(7, this), true);
                return;
            }
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        C1718a c1718a = new C1718a(7, this);
                        try {
                            AbstractC1936c.echo(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            c1718a.charlie(10, null);
                            return;
                        } catch (PackageManager.NameNotFoundException e) {
                            c1718a.charlie(7, e);
                            return;
                        }
                    }
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                C1718a c1718a2 = new C1718a(7, this);
                if (Build.VERSION.SDK_INT >= 24) {
                    Process.sendSignal(Process.myPid(), 10);
                    c1718a2.charlie(12, null);
                    return;
                } else {
                    c1718a2.charlie(13, null);
                    return;
                }
            }
            if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                C1718a c1718a3 = new C1718a(7, this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 34) {
                        createDeviceProtectedStorageContext2 = context.createDeviceProtectedStorageContext();
                        cacheDir = createDeviceProtectedStorageContext2.getCacheDir();
                    } else if (i4 >= 24) {
                        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                        cacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                    } else if (i4 == 23) {
                        cacheDir = context.getCodeCacheDir();
                    } else {
                        cacheDir = context.getCacheDir();
                    }
                    if (AbstractC1936c.charlie(cacheDir)) {
                        c1718a3.charlie(14, null);
                        return;
                    } else {
                        c1718a3.charlie(15, null);
                        return;
                    }
                }
                c1718a3.charlie(16, null);
            }
        }
    }
}
