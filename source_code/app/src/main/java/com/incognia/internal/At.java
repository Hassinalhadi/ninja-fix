package com.incognia.internal;

import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class At {

    /* renamed from: W, reason: collision with root package name */
    public static VJU f8382W;

    /* renamed from: b, reason: collision with root package name */
    public static final long f8383b = TimeUnit.MINUTES.toMillis(3);

    public static VJU b() {
        int i4;
        VJU vju = f8382W;
        if (vju != null) {
            return vju;
        }
        Context context = OQ.f9304b;
        if (context != null) {
            Zno zno = new Zno(context, new pl2(ZH6.f10036b, true));
            kT kTVar = QHn.f9492b;
            String str = Zno.f10065f9;
            M39 m39 = (M39) kTVar.b(bFB.f10165b, str);
            if (m39 == null) {
                m39 = zno.b();
                if (m39 != null) {
                    kTVar.b(str, m39, sb.f11307b);
                } else {
                    m39 = null;
                }
            }
            if (m39 != null) {
                i4 = m39.f9096W;
            } else {
                i4 = 0;
            }
            int i5 = i4;
            hi hiVar = hi.f10563b;
            return new VJU((Long) null, (Long) null, (Long) null, i5, (String) wGk.Ev.getValue(), (List) null, 79);
        }
        throw new NullPointerException("Using SDK context before initialization");
    }
}
