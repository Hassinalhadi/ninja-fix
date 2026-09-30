package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.am;
import java.net.BindException;
import java.net.ServerSocket;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class sZ implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final frU f11304W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f11305b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11306f9 = LazyKt.lazy(M6h.f9100b);

    public sZ(pl2 pl2Var, frU fru) {
        this.f11305b = pl2Var;
        this.f11304W = fru;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11306f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f11305b.b(new am(14, wa2, this));
    }

    public static final void b(Function1 function1, sZ sZVar) {
        Object m206constructorimpl;
        boolean z2;
        try {
            Result.Companion companion = Result.INSTANCE;
            synchronized (sZVar.f11304W) {
                try {
                    new ServerSocket(27042).close();
                } catch (BindException unused) {
                    z2 = false;
                }
            }
            z2 = true;
            boolean z10 = !z2;
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) sZVar.f11306f9.getValue(), Boolean.valueOf(z10), new pFh(new Q7(z10))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        j.quebec(m206constructorimpl, function1);
    }
}
