package j2;

import V0.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import com.google.android.gms.measurement.internal.r;
import java.io.File;
import java.io.IOException;

/* renamed from: j2.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1940g {
    public static final m alpha = new Object();
    public static final Object bravo = new Object();
    public static r charlie = null;

    public static long alpha(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC1938e.alpha(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static r bravo() {
        r rVar = new r(11);
        charlie = rVar;
        alpha.juliet(rVar);
        return charlie;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void charlie(Context context, boolean z2) {
        boolean z10;
        boolean z11;
        boolean z12;
        C1939f alpha2;
        C1939f c1939f;
        int i4;
        if (z2 || charlie == null) {
            synchronized (bravo) {
                if (!z2) {
                    if (charlie != null) {
                        return;
                    }
                }
                int i5 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (openFd.getLength() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z10 = false;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28 && i10 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    if (file.exists() && length > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (file2.exists() && length2 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    try {
                        long alpha3 = alpha(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                alpha2 = C1939f.alpha(file3);
                            } catch (IOException unused2) {
                                bravo();
                                return;
                            }
                        } else {
                            alpha2 = null;
                        }
                        if (alpha2 != null && alpha2.charlie == alpha3 && (i4 = alpha2.bravo) != 2) {
                            i5 = i4;
                            if (z2 && z12 && i5 != 1) {
                                i5 = 2;
                            }
                            if (alpha2 != null && alpha2.bravo == 2 && i5 == 1 && length < alpha2.delta) {
                                i5 = 3;
                            }
                            c1939f = new C1939f(1, i5, alpha3, length2);
                            if (alpha2 != null || !alpha2.equals(c1939f)) {
                                c1939f.bravo(file3);
                            }
                            bravo();
                            return;
                        }
                        if (z11) {
                            i5 = 1;
                        } else if (z12) {
                            i5 = 2;
                        }
                        if (z2) {
                            i5 = 2;
                        }
                        if (alpha2 != null) {
                            i5 = 3;
                        }
                        c1939f = new C1939f(1, i5, alpha3, length2);
                        if (alpha2 != null) {
                        }
                        c1939f.bravo(file3);
                        bravo();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        bravo();
                        return;
                    }
                }
                bravo();
            }
        }
    }
}
