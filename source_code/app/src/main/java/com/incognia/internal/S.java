package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1824b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class S implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f9571W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9572b;

    /* renamed from: f9, reason: collision with root package name */
    public final AtomicReference f9573f9;

    public S(pl2 pl2Var) {
        this.f9572b = pl2Var;
        Lazy lazy = LazyKt.lazy(gP.f10477b);
        this.f9571W = lazy;
        this.f9573f9 = new AtomicReference(QHn.sVU.W((String) lazy.getValue()));
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9571W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f9572b.b(new C1824b(this, wa2, 15));
    }

    public static final void b(S s3, Function1 function1) {
        String str = (String) s3.f9573f9.get();
        Result.Companion companion = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(new P7R((String) s3.f9571W.getValue(), (String) s3.f9573f9.get(), new Hnm(new IOg(str)))), function1);
    }

    public final void b(String str) {
        this.f9572b.b(new C1824b(16, this, str));
    }

    public static final void b(S s3, String str) {
        s3.f9573f9.set(str);
        QHn.sVU.b((String) s3.f9571W.getValue(), str);
    }
}
