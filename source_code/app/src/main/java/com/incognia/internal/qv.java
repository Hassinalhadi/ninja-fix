package com.incognia.internal;

import g9.a;
import h9.C1823a;
import h9.am;
import h9.w;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class qv implements Gg {

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f11182b;

    /* renamed from: W, reason: collision with root package name */
    public D5f f11181W = aNe.f10097b;

    /* renamed from: f9, reason: collision with root package name */
    public final XO f11183f9 = new w(this, 1);

    public qv(pl2 pl2Var) {
        this.f11182b = pl2Var;
    }

    public static final void W(qv qvVar) {
        AtomicReference atomicReference = IZZ.f8909W;
        IZZ.b(qvVar.f11183f9);
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.f11181W = tOI.f11377b;
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f11182b;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.f11181W = b66.f10146b;
        njO.b(this, new a(19, this));
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.f11181W;
    }

    public static final void W() {
        BA2.b();
    }

    public static final void b(qv qvVar) {
        njO.b(qvVar, new C1823a(6));
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new am(13, this, cj0));
    }

    public static final void b(qv qvVar, Function0 function0) {
        AtomicReference atomicReference = IZZ.f8909W;
        IZZ.f9(qvVar.f11183f9);
        qvVar.f11181W = L4.f9041b;
        function0.invoke();
    }
}
