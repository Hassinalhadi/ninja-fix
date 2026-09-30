package com.incognia.internal;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class YO extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Me f9989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YO(Me me2) {
        super(0);
        this.f9989b = me2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TCP tcp = this.f9989b.DOu.sVU;
        if (tcp != null) {
            tcp.f9644J.compareAndSet(false, true);
        }
        this.f9989b.sVU.f9820b.clear();
        Me me2 = this.f9989b;
        me2.IB = false;
        me2.f9152Y = null;
        me2.f9144E = false;
        me2.f9156n9 = false;
        me2.f9153ar = null;
        me2.f9145H.clear();
        Me me3 = this.f9989b;
        me3.f9145H.addAll(me3.a2F);
        this.f9989b.a2F.clear();
        this.f9989b.f9146J.getClass();
        QHn.f9493f9.b(Me.Gw, Long.valueOf(SystemClock.elapsedRealtime()));
        Me me4 = this.f9989b;
        if (me4.Qs) {
            me4.Qs = false;
            me4.b((U91) null);
        }
        return Unit.INSTANCE;
    }
}
