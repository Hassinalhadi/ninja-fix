package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final class yE extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ xIr f11847W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pl2 f11848b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11849f9;
    public final /* synthetic */ kotlin.jvm.internal.i gmP;
    public final /* synthetic */ Ref.ObjectRef sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yE(pl2 pl2Var, xIr xir, ArrayList arrayList, Ref.ObjectRef objectRef, Function1 function1) {
        super(1);
        this.f11848b = pl2Var;
        this.f11847W = xir;
        this.f11849f9 = arrayList;
        this.sVU = objectRef;
        this.gmP = (kotlin.jvm.internal.i) function1;
    }

    public static final void b(xIr xir, List list, Ref.ObjectRef objectRef, G1 g12, Function1 function1) {
        Boolean bool;
        if (xir.f11787f9.b(list)) {
            L7E l7e = xir.f11787f9;
            boolean b2 = l7e.b();
            AI b4 = l7e.f9042W.b(l7e.f9043b);
            AxM axM = new AxM(g12, new FYk(b2, (b4 == null || (bool = b4.f8347W) == null) ? false : bool.booleanValue(), l7e.W(list)), new r4(l7e));
            objectRef.alpha = axM;
            function1.invoke(axM);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((G1) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    public final void b(G1 g12) {
        this.f11848b.b(new h9.y(this.f11847W, this.f11849f9, this.sVU, g12, (Function1) this.gmP));
    }
}
