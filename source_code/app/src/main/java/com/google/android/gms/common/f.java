package com.google.android.gms.common;

import V5.u;
import V5.x;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import bd.AbstractC0754g;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import h6.BinderC1814d;
import java.io.File;
import o6.AbstractC2197a;

/* loaded from: classes2.dex */
public final class f implements Y3.g {
    public static f red;
    public volatile Object alpha;
    public final Object purple;

    public /* synthetic */ f(Object obj) {
        this.purple = obj;
    }

    public static f bravo(Context context) {
        x.hotel(context);
        synchronized (f.class) {
            try {
                if (red == null) {
                    q.alpha(context);
                    red = new f(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return red;
    }

    public static final n delta(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i4 = 0; i4 < nVarArr.length; i4++) {
                if (nVarArr[i4].equals(oVar)) {
                    return nVarArr[i4];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean echo(PackageInfo packageInfo, boolean z2) {
        PackageInfo packageInfo2;
        n delta;
        if (z2) {
            if (packageInfo != null) {
                if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
            } else {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if (!z2) {
                        delta = delta(packageInfo2, p.alpha);
                    } else {
                        delta = delta(packageInfo2, p.alpha[0]);
                    }
                    if (delta == null) {
                        return true;
                    }
                }
                return false;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if (!z2) {
            }
            if (delta == null) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, C2.d] */
    public H3.a alpha() {
        File file;
        if (((H3.a) this.alpha) == null) {
            synchronized (this) {
                try {
                    if (((H3.a) this.alpha) == null) {
                        File cacheDir = ((E5.j) ((D8.c) this.purple).purple).purple.getCacheDir();
                        Object obj = null;
                        obj = null;
                        if (cacheDir == null) {
                            file = null;
                        } else {
                            file = new File(cacheDir, "image_manager_disk_cache");
                        }
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            ?? obj2 = new Object();
                            obj2.silver = new w.o(8);
                            obj2.red = file;
                            obj2.alpha = 262144000L;
                            obj2.purple = new J2.c(7);
                            obj = obj2;
                        }
                        this.alpha = obj;
                    }
                    if (((H3.a) this.alpha) == null) {
                        this.alpha = new g8.d(4);
                    }
                } finally {
                }
            }
        }
        return (H3.a) this.alpha;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01a7 A[LOOP:0: B:6:0x001c->B:12:0x01a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01b5 A[EDGE_INSN: B:13:0x01b5->B:14:0x01b5 BREAK  A[LOOP:0: B:6:0x001c->B:12:0x01a7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean charlie(int i4) {
        s sVar;
        int length;
        boolean z2;
        ApplicationInfo applicationInfo;
        s sVar2;
        zzo zzoVar;
        PackageManager.NameNotFoundException nameNotFoundException;
        String[] packagesForUid = ((Context) this.purple).getPackageManager().getPackagesForUid(i4);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            sVar = null;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    String str = packagesForUid[i5];
                    if (str == null) {
                        sVar = new s(false, "null pkg", null);
                    } else if (!str.equals((String) this.alpha)) {
                        m mVar = q.alpha;
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                q.charlie();
                                z2 = ((u) q.charlie).magenta();
                            } finally {
                            }
                        } catch (RemoteException | DynamiteModule$LoadingException e) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                            z2 = false;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        if (z2) {
                            boolean honorsDebugCertificates = e.honorsDebugCertificates((Context) this.purple);
                            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                x.hotel(q.echo);
                                try {
                                    q.charlie();
                                    zzoVar = new zzo(str, honorsDebugCertificates, false, new BinderC1814d(q.echo), false, true);
                                } catch (DynamiteModule$LoadingException e4) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                                    sVar2 = new s(false, "module init: ".concat(String.valueOf(e4.getMessage())), e4);
                                }
                                try {
                                    u uVar = (u) q.charlie;
                                    Parcel ivory = uVar.ivory();
                                    int i10 = AbstractC2197a.alpha;
                                    ivory.writeInt(1);
                                    zzoVar.writeToParcel(ivory, 0);
                                    Parcel charlie = uVar.charlie(ivory, 6);
                                    zzq zzqVar = (zzq) AbstractC2197a.alpha(charlie, zzq.CREATOR);
                                    charlie.recycle();
                                    if (zzqVar.alpha) {
                                        bc.e.bravo(zzqVar.silver);
                                        sVar = new s(true, null, null);
                                    } else {
                                        String str2 = zzqVar.purple;
                                        if (AbstractC0754g.foxtrot(zzqVar.red) == 4) {
                                            nameNotFoundException = new PackageManager.NameNotFoundException();
                                        } else {
                                            nameNotFoundException = null;
                                        }
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        bc.e.bravo(zzqVar.silver);
                                        AbstractC0754g.foxtrot(zzqVar.red);
                                        sVar = new s(false, str2, nameNotFoundException);
                                    }
                                } catch (RemoteException e5) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
                                    sVar2 = new s(false, "module call", e5);
                                    sVar = sVar2;
                                    if (sVar.alpha) {
                                    }
                                    if (!sVar.alpha) {
                                    }
                                }
                            } finally {
                            }
                        } else {
                            try {
                                PackageInfo packageInfo = ((Context) this.purple).getPackageManager().getPackageInfo(str, 64);
                                boolean honorsDebugCertificates2 = e.honorsDebugCertificates((Context) this.purple);
                                if (packageInfo == null) {
                                    sVar = new s(false, "null pkg", null);
                                } else {
                                    Signature[] signatureArr = packageInfo.signatures;
                                    if (signatureArr != null && signatureArr.length == 1) {
                                        o oVar = new o(packageInfo.signatures[0].toByteArray());
                                        String str3 = packageInfo.packageName;
                                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                        try {
                                            s bravo = q.bravo(str3, oVar, honorsDebugCertificates2, false);
                                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                                            if (bravo.alpha && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                                try {
                                                    s bravo2 = q.bravo(str3, oVar, false, true);
                                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                    if (bravo2.alpha) {
                                                        sVar = new s(false, "debuggable release cert app rejected", null);
                                                    }
                                                } finally {
                                                }
                                            }
                                            sVar = bravo;
                                        } finally {
                                        }
                                    } else {
                                        sVar = new s(false, "single cert required", null);
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                sVar = new s(false, "no pkg ".concat(str), e10);
                            }
                        }
                        if (sVar.alpha) {
                            this.alpha = str;
                        }
                    } else {
                        sVar = s.delta;
                    }
                    if (!sVar.alpha) {
                        break;
                    }
                    i5++;
                } else {
                    x.hotel(sVar);
                    break;
                }
            }
        } else {
            sVar = new s(false, "no pkgs", null);
        }
        if (!sVar.alpha && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Exception exc = sVar.charlie;
            if (exc != null) {
                Log.d("GoogleCertificatesRslt", sVar.alpha(), exc);
            } else {
                Log.d("GoogleCertificatesRslt", sVar.alpha());
            }
        }
        return sVar.alpha;
    }

    @Override // Y3.g
    public Object get() {
        if (this.alpha == null) {
            synchronized (this) {
                try {
                    if (this.alpha == null) {
                        Object obj = ((Y3.g) this.purple).get();
                        Y3.f.charlie(obj, "Argument must not be null");
                        this.alpha = obj;
                    }
                } finally {
                }
            }
        }
        return this.alpha;
    }

    public f(Context context) {
        this.purple = context.getApplicationContext();
    }
}
