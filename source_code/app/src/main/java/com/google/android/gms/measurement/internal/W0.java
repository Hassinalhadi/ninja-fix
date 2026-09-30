package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.measurement.C1314f0;

/* loaded from: classes2.dex */
public final class W0 extends T0 {
    public static final boolean Z(String str) {
        String str2 = (String) ac.tango.alpha(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(Constants.SEPARATOR_COMMA)) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final String X(String str) {
        A a6 = this.purple.alpha;
        Z0.cyan(a6);
        String m02 = a6.m0(str);
        if (!TextUtils.isEmpty(m02)) {
            Uri parse = Uri.parse((String) ac.romeo.alpha(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(m02 + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return (String) ac.romeo.alpha(null);
    }

    public final boolean Y(String str, String str2) {
        Z0 z02 = this.purple;
        A a6 = z02.alpha;
        Z0.cyan(a6);
        C1314f0 l02 = a6.l0(str);
        if (l02 != null) {
            C1450j c1450j = z02.red;
            Z0.cyan(c1450j);
            ao T02 = c1450j.T0(str);
            if (T02 != null) {
                if (!l02.coral() || l02.uniform().november() != 100) {
                    d1 d1Var = ((G) this.alpha).e;
                    G.delta(d1Var);
                    if (!d1Var.M0(str, T02.india())) {
                        if (!TextUtils.isEmpty(str2) && Math.abs(str2.hashCode() % 100) < l02.uniform().november()) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
