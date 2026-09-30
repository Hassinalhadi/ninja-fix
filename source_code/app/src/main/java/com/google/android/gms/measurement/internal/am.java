package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes2.dex */
public final class am {
    public static final AtomicReference bravo = new AtomicReference();
    public static final AtomicReference charlie = new AtomicReference();
    public static final AtomicReference delta = new AtomicReference();
    public final ay alpha;

    public am(ay ayVar) {
        this.alpha = ayVar;
    }

    public static final String golf(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z2;
        String str2;
        V5.x.hotel(atomicReference);
        if (strArr.length == strArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        V5.x.bravo(z2);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (Objects.equals(str, strArr[i4])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i4];
                        if (str2 == null) {
                            str2 = strArr2[i4] + "(" + strArr[i4] + ")";
                            strArr3[i4] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String alpha(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder tango = Q0.c.tango(Constants.AES_PREFIX);
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = bravo((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (tango.length() != 1) {
                    tango.append(", ");
                }
                tango.append(valueOf);
            }
        }
        tango.append(Constants.AES_SUFFIX);
        return tango.toString();
    }

    public final String bravo(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.alpha.alpha()) {
            return bundle.toString();
        }
        StringBuilder tango = Q0.c.tango("Bundle[{");
        for (String str : bundle.keySet()) {
            if (tango.length() != 8) {
                tango.append(", ");
            }
            tango.append(echo(str));
            tango.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = alpha(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = alpha((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = alpha(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            tango.append(valueOf);
        }
        tango.append("}]");
        return tango.toString();
    }

    public final String charlie(zzbh zzbhVar) {
        String bravo2;
        ay ayVar = this.alpha;
        if (!ayVar.alpha()) {
            return zzbhVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzbhVar.red);
        sb2.append(",name=");
        sb2.append(delta(zzbhVar.alpha));
        sb2.append(",params=");
        zzbf zzbfVar = zzbhVar.purple;
        if (zzbfVar == null) {
            bravo2 = null;
        } else if (!ayVar.alpha()) {
            bravo2 = zzbfVar.alpha.toString();
        } else {
            bravo2 = bravo(zzbfVar.o());
        }
        sb2.append(bravo2);
        return sb2.toString();
    }

    public final String delta(String str) {
        if (str == null) {
            return null;
        }
        if (!this.alpha.alpha()) {
            return str;
        }
        return golf(str, W.charlie, W.alpha, bravo);
    }

    public final String echo(String str) {
        if (str == null) {
            return null;
        }
        if (!this.alpha.alpha()) {
            return str;
        }
        return golf(str, W.foxtrot, W.echo, charlie);
    }

    public final String foxtrot(String str) {
        if (str == null) {
            return null;
        }
        if (!this.alpha.alpha()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return ao.ad.gray("experiment_id(", str, ")");
        }
        return golf(str, W.juliet, W.india, delta);
    }
}
