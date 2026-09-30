package com.incognia.internal;

import android.content.pm.InstallSourceInfo;

/* loaded from: classes2.dex */
public final class YJ5 {
    public static fKw b(InstallSourceInfo installSourceInfo) {
        Integer num;
        String installingPackageName;
        String initiatingPackageName;
        int packageSource;
        CnH cnH = CnH.f8484b;
        String str = null;
        if (CnH.b(cnH, 33, 0, 2)) {
            packageSource = installSourceInfo.getPackageSource();
            num = Integer.valueOf(packageSource);
        } else {
            num = null;
        }
        if (CnH.b(cnH, 34, 0, 2)) {
            str = installSourceInfo.getUpdateOwnerPackageName();
        }
        installingPackageName = installSourceInfo.getInstallingPackageName();
        initiatingPackageName = installSourceInfo.getInitiatingPackageName();
        return new fKw(num, installingPackageName, initiatingPackageName, str);
    }
}
