package com.incognia.internal;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.Signature;
import com.incognia.internal.Ssq;
import com.incognia.internal.toy;
import g3.z;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;

/* loaded from: classes2.dex */
public final class Ssq {

    /* renamed from: R, reason: collision with root package name */
    public static final String f9623R = (String) wGk.mU4.getValue();

    /* renamed from: J, reason: collision with root package name */
    public r3 f9624J;
    public fKw PqK;

    /* renamed from: V, reason: collision with root package name */
    public Signature f9625V;

    /* renamed from: W, reason: collision with root package name */
    public final PackageManager f9626W;

    /* renamed from: b, reason: collision with root package name */
    public final XMI f9627b;

    /* renamed from: f9, reason: collision with root package name */
    public final boolean f9628f9;
    public final String olU;
    public final H2T sVU = new H2T();
    public final YJ5 gmP = new YJ5();

    public Ssq(Context context, vY vYVar, XMI xmi) {
        this.f9627b = xmi;
        this.f9626W = context.getPackageManager();
        this.f9628f9 = vYVar.sVU;
        this.olU = context.getPackageName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if ((r5.protectionLevel & 15) == 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean W(String str) {
        int protection;
        try {
            PermissionInfo permissionInfo = this.f9626W.getPermissionInfo(str, 128);
            boolean z2 = false;
            if (CnH.b(CnH.f8484b, 28, 0, 2)) {
                protection = permissionInfo.getProtection();
                if (protection == 1) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        } catch (Throwable unused) {
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:4:0x0002, B:6:0x0006, B:8:0x001e, B:12:0x004a, B:13:0x0023, B:21:0x003f, B:25:0x004c), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized r3 b() {
        String str;
        r3 b2;
        ApplicationInfo applicationInfo;
        try {
            if (this.f9624J == null) {
                gLt glt = gLt.f10471b;
                int b4 = OFM.f9292b.b() | 4224;
                boolean b6 = this.f9627b.b(glt);
                String str2 = this.olU;
                if (Intrinsics.areEqual(str2, str2) || this.f9628f9) {
                    PackageInfo b10 = Uck.b(this.f9626W, str2, b4);
                    if (b6 && b10 != null) {
                        try {
                            applicationInfo = b10.applicationInfo;
                        } catch (Throwable unused) {
                        }
                        if (applicationInfo != null) {
                            str = this.f9626W.getApplicationLabel(applicationInfo).toString();
                            if (b10 != null) {
                                this.sVU.getClass();
                                b2 = H2T.b(b10, str);
                                this.f9624J = b2;
                            }
                        }
                    }
                    str = null;
                    if (b10 != null) {
                    }
                }
                b2 = null;
                this.f9624J = b2;
            }
        } catch (Throwable unused2) {
            return null;
        }
        return this.f9624J;
    }

    public final fKw f9(String str) {
        InstallSourceInfo installSourceInfo;
        if (CnH.b(CnH.f8484b, 30, 0, 2)) {
            installSourceInfo = this.f9626W.getInstallSourceInfo(str);
            this.gmP.getClass();
            return YJ5.b(installSourceInfo);
        }
        String installerPackageName = this.f9626W.getInstallerPackageName(str);
        this.gmP.getClass();
        return new fKw(null, installerPackageName, null, null);
    }

    public final Boolean b(byte[] bArr) {
        Object m206constructorimpl;
        boolean hasSigningCertificate;
        if (!CnH.b(CnH.f8484b, 28, 0, 2)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            hasSigningCertificate = this.f9626W.hasSigningCertificate(this.olU, bArr, 0);
            m206constructorimpl = Result.m206constructorimpl(Boolean.valueOf(hasSigningCertificate));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        return (Boolean) (m206constructorimpl instanceof k ? null : m206constructorimpl);
    }

    public final Boolean b(String str) {
        try {
            return Boolean.valueOf(this.f9626W.hasSystemFeature(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [h9.u] */
    public final void b(final toy toyVar) {
        try {
            if (CnH.b(CnH.f8484b, 31, 0, 2)) {
                PackageManager packageManager = this.f9626W;
                String str = this.olU;
                z.quebec();
                z.romeo(packageManager, str, new PackageManager.OnChecksumsReadyListener() { // from class: h9.u
                    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                    public final void onChecksumsReady(List list) {
                        Ssq.b(toy.this, list);
                    }
                });
                return;
            }
            toyVar.b(null);
        } catch (Throwable unused) {
            toyVar.b(null);
        }
    }

    public static final void b(toy toyVar, List list) {
        String str;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            ApkChecksum golf = z.golf(it.next());
            if (z.bravo(golf) == 1) {
                str = cT.f9(2, z.azure(golf));
                break;
            }
        }
        toyVar.b(str);
    }
}
