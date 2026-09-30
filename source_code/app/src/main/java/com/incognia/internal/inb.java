package com.incognia.internal;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class inb implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10633W = LazyKt.lazy(uQ.f11466b);

    /* renamed from: b, reason: collision with root package name */
    public final Av7 f10634b;

    public inb(Av7 av7) {
        this.f10634b = av7;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10633W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        String str;
        try {
            Result.Companion companion = Result.INSTANCE;
            Float f5 = null;
            try {
                Display display = (Display) this.f10634b.f8390f9.getValue();
                str = String.valueOf(display != null ? Integer.valueOf(display.getDisplayId()) : null);
            } catch (Throwable unused) {
                str = null;
            }
            String gmP = this.f10634b.gmP();
            Integer b2 = this.f10634b.b();
            try {
                Resources resources = this.f10634b.f8389b.getResources();
                f5 = Float.valueOf((resources != null ? resources.getDisplayMetrics() : new DisplayMetrics()).density);
            } catch (Throwable unused2) {
            }
            m206constructorimpl = Result.m206constructorimpl(new K5((String) wGk.f11617G.getValue(), new IlU(str, gmP, b2, f5)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
