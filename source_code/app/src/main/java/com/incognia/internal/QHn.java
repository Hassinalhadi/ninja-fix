package com.incognia.internal;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class QHn {

    /* renamed from: W, reason: collision with root package name */
    public static final kT f9491W;

    /* renamed from: b, reason: collision with root package name */
    public static final kT f9492b;

    /* renamed from: f9, reason: collision with root package name */
    public static final kT f9493f9;
    public static final Nk6 sVU;

    static {
        Context context = OQ.f9304b;
        if (context != null) {
            uJ5 uj5 = new uJ5(context, (String) wGk.mI.getValue(), (String) wGk.hXu.getValue());
            ZH6 zh6 = ZH6.f10036b;
            f9492b = new kT(uj5, new pl2(zh6, true), new bt1());
            Context context2 = OQ.f9304b;
            if (context2 != null) {
                f9491W = new kT(new y(context2, (String) wGk.f11713p.getValue(), (String) wGk.f11709o.getValue()), new pl2(zh6, true), new bt1());
                Context context3 = OQ.f9304b;
                if (context3 != null) {
                    f9493f9 = new kT(new y(context3, (String) wGk.uz.getValue(), (String) wGk.f11624J1.getValue()), new pl2(zh6, true), new bt1());
                    Context context4 = OQ.f9304b;
                    if (context4 != null) {
                        sVU = new Nk6(context4, (String) wGk.kpu.getValue(), new bt1());
                        return;
                    }
                    throw new NullPointerException("Using SDK context before initialization");
                }
                throw new NullPointerException("Using SDK context before initialization");
            }
            throw new NullPointerException("Using SDK context before initialization");
        }
        throw new NullPointerException("Using SDK context before initialization");
    }
}
