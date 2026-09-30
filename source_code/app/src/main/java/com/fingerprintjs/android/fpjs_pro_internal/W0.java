package com.fingerprintjs.android.fpjs_pro_internal;

import android.media.AudioTrack;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class W0 implements cd {
    public static int alpha;
    public static int bravo;

    public static int alpha() {
        int i4 = alpha;
        int i5 = i4 % 5965575;
        alpha = i4 + 1;
        if (i5 != 0) {
            return bravo;
        }
        int tango = ao.ad.tango(804807618);
        bravo = tango;
        return tango;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.cd
    public final N14263A23323 component5(byte[] bArr) {
        try {
            Object[] objArr = {0L, new U0(bArr), 1, null};
            Object echo = am.echo(853678683);
            if (echo == null) {
                echo = am.charlie((char) (40619 - (ViewConfiguration.getTouchSlop() >> 8)), 52 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 222, 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            return (N14263A23323) ((Method) echo).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
