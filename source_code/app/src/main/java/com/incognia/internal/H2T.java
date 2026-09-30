package com.incognia.internal;

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import java.security.MessageDigest;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class H2T {
    /* JADX WARN: Code restructure failed: missing block: B:71:0x003b, code lost:
    
        r1 = r1.getSigningCertificateHistory();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r3 b(PackageInfo packageInfo, String str) {
        long j5;
        List b2;
        List list;
        boolean z2;
        List list2;
        List list3;
        List list4;
        Integer num;
        Bundle bundle;
        String str2;
        Integer num2;
        List list5;
        String str3;
        Signature signature;
        Signature signature2;
        SigningInfo signingInfo;
        Signature[] signingCertificateHistory;
        boolean hasMultipleSigners;
        Signature[] apkContentsSigners;
        CnH cnH = CnH.f8484b;
        if (CnH.b(cnH, 28, 0, 2)) {
            j5 = packageInfo.getLongVersionCode();
        } else {
            j5 = packageInfo.versionCode;
        }
        long j6 = j5;
        String str4 = null;
        if (CnH.b(cnH, 28, 0, 2)) {
            signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                    if (apkContentsSigners != null) {
                        b2 = ArraysKt.b(apkContentsSigners);
                        list = b2;
                    }
                    list = null;
                }
            }
            if (signingInfo != null && signingCertificateHistory != null) {
                b2 = ArraysKt.b(signingCertificateHistory);
                list = b2;
            }
            list = null;
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                b2 = ArraysKt.b(signatureArr);
                list = b2;
            }
            list = null;
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        long j7 = packageInfo.lastUpdateTime;
        long j10 = packageInfo.firstInstallTime;
        if (applicationInfo != null && (applicationInfo.flags & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            list2 = ArraysKt.b(serviceInfoArr);
        } else {
            list2 = null;
        }
        ActivityInfo[] activityInfoArr = packageInfo.receivers;
        if (activityInfoArr != null) {
            list3 = ArraysKt.b(activityInfoArr);
        } else {
            list3 = null;
        }
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr != null) {
            list4 = ArraysKt.b(strArr);
        } else {
            list4 = null;
        }
        if (applicationInfo != null) {
            num = Integer.valueOf(applicationInfo.targetSdkVersion);
        } else {
            num = null;
        }
        String str5 = packageInfo.packageName;
        String str6 = packageInfo.versionName;
        if (applicationInfo != null) {
            bundle = applicationInfo.metaData;
        } else {
            bundle = null;
        }
        if (applicationInfo != null) {
            str2 = applicationInfo.publicSourceDir;
        } else {
            str2 = null;
        }
        if (applicationInfo != null) {
            num2 = Integer.valueOf(applicationInfo.icon);
        } else {
            num2 = null;
        }
        ActivityInfo[] activityInfoArr2 = packageInfo.activities;
        if (activityInfoArr2 != null) {
            list5 = ArraysKt.b(activityInfoArr2);
        } else {
            list5 = null;
        }
        if (list != null && (signature2 = (Signature) CollectionsKt.green(list)) != null) {
            try {
                byte[] byteArray = signature2.toByteArray();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(byteArray);
                str3 = cT.f9(2, messageDigest.digest());
            } catch (Throwable unused) {
            }
            if (list != null && (signature = (Signature) CollectionsKt.green(list)) != null) {
                try {
                    byte[] byteArray2 = signature.toByteArray();
                    t9 t9Var = new t9();
                    t9Var.b(byteArray2);
                    str4 = cT.f9(2, t9Var.b());
                } catch (Throwable unused2) {
                }
            }
            return new r3(j6, j7, j10, z2, list2, list3, list, list4, num, str5, str6, bundle, str2, num2, str, list5, str3, str4);
        }
        str3 = null;
        if (list != null) {
            byte[] byteArray22 = signature.toByteArray();
            t9 t9Var2 = new t9();
            t9Var2.b(byteArray22);
            str4 = cT.f9(2, t9Var2.b());
        }
        return new r3(j6, j7, j10, z2, list2, list3, list, list4, num, str5, str6, bundle, str2, num2, str, list5, str3, str4);
    }
}
