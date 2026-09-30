package com.google.android.gms.common;

import V5.u;
import V5.v;
import V5.w;
import V5.x;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import h6.BinderC1814d;
import i6.C1894c;
import o6.AbstractC2197a;

/* loaded from: classes2.dex */
public abstract class q {
    public static final m alpha;
    public static final m bravo;
    public static volatile w charlie;
    public static final Object delta;
    public static Context echo;

    static {
        new m(0, n.lime("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new m(1, n.lime("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        alpha = new m(2, n.lime("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        bravo = new m(3, n.lime("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        delta = new Object();
    }

    public static synchronized void alpha(Context context) {
        synchronized (q.class) {
            if (echo == null) {
                if (context != null) {
                    echo = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    public static s bravo(String str, o oVar, boolean z2, boolean z10) {
        try {
            charlie();
            x.hotel(echo);
            zzs zzsVar = new zzs(str, oVar, z2, z10);
            try {
                w wVar = charlie;
                BinderC1814d binderC1814d = new BinderC1814d(echo.getPackageManager());
                u uVar = (u) wVar;
                Parcel ivory = uVar.ivory();
                int i4 = AbstractC2197a.alpha;
                boolean z11 = true;
                ivory.writeInt(1);
                zzsVar.writeToParcel(ivory, 0);
                AbstractC2197a.charlie(ivory, binderC1814d);
                Parcel charlie2 = uVar.charlie(ivory, 5);
                if (charlie2.readInt() == 0) {
                    z11 = false;
                }
                charlie2.recycle();
                if (z11) {
                    return s.delta;
                }
                return new r(new l(z2, str, oVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return new s(false, "module call", e);
            }
        } catch (DynamiteModule$LoadingException e4) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            return new s(false, "module init: ".concat(String.valueOf(e4.getMessage())), e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [V5.w] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void charlie() {
        ?? abstractC1394y;
        if (charlie != null) {
            return;
        }
        x.hotel(echo);
        synchronized (delta) {
            try {
                if (charlie == null) {
                    IBinder bravo2 = C1894c.charlie(echo, C1894c.echo, "com.google.android.gms.googlecertificates").bravo("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i4 = v.hotel;
                    if (bravo2 == null) {
                        abstractC1394y = 0;
                    } else {
                        IInterface queryLocalInterface = bravo2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        if (queryLocalInterface instanceof w) {
                            abstractC1394y = (w) queryLocalInterface;
                        } else {
                            abstractC1394y = new AbstractC1394y(bravo2, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                        }
                    }
                    charlie = abstractC1394y;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
