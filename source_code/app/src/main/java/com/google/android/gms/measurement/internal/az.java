package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1315f1;
import com.google.android.gms.internal.measurement.K1;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class az implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ A purple;
    public final /* synthetic */ String red;

    public /* synthetic */ az(A a6, String str, int i4) {
        this.alpha = i4;
        this.purple = a6;
        this.red = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.alpha) {
            case 0:
                J2.c cVar = new J2.c(27, this.purple, this.red, false);
                K1 k12 = new K1("internal.remoteConfig", 0);
                k12.purple.put("getValue", new C1315f1(cVar));
                return k12;
            case 1:
                return new C1315f1(new az(this.purple, this.red, 2));
            default:
                A a6 = this.purple;
                C1450j c1450j = a6.purple.red;
                Z0.cyan(c1450j);
                String str = this.red;
                ao T02 = c1450j.T0(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((G) a6.alpha).yellow.d0();
                hashMap.put("gmp_version", 119002L);
                if (T02 != null) {
                    String echo = T02.echo();
                    if (echo != null) {
                        hashMap.put("app_version", echo);
                    }
                    hashMap.put("app_version_int", Long.valueOf(T02.lime()));
                    hashMap.put("dynamite_version", Long.valueOf(T02.magenta()));
                }
                return hashMap;
        }
    }
}
