package com.incognia.internal;

import com.google.android.material.datepicker.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class WA extends Lambda implements Function1 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.i f9834J;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ pl2 f9835W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f9836b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ xIr f9837f9;
    public final /* synthetic */ Ref.ObjectRef gmP;
    public final /* synthetic */ ArrayList sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WA(s sVar, pl2 pl2Var, xIr xir, ArrayList arrayList, Ref.ObjectRef objectRef, Function1 function1) {
        super(1);
        this.f9836b = sVar;
        this.f9835W = pl2Var;
        this.f9837f9 = xir;
        this.sVU = arrayList;
        this.gmP = objectRef;
        this.f9834J = (kotlin.jvm.internal.i) function1;
    }

    public static final void b(xIr xir, Object obj, List list, Ref.ObjectRef objectRef, Function1 function1) {
        Boolean bool;
        boolean z2 = false;
        xir.sVU = false;
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        if (m207exceptionOrNullimpl == null) {
            G1 g12 = (G1) obj;
            if (!xir.f11787f9.b(list) && objectRef.alpha == null) {
                j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new TYz(xir.f11786b.W()))), function1);
                return;
            }
            L7E l7e = xir.f11787f9;
            boolean b2 = l7e.b();
            AI b4 = l7e.f9042W.b(l7e.f9043b);
            if (b4 != null && (bool = b4.f8347W) != null) {
                z2 = bool.booleanValue();
            }
            AxM axM = new AxM(g12, new FYk(b2, z2, l7e.W(list)), new r4(l7e));
            objectRef.alpha = axM;
            j.quebec(Result.m206constructorimpl(axM), function1);
            return;
        }
        Object obj2 = objectRef.alpha;
        if (obj2 == null) {
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(m207exceptionOrNullimpl)), function1);
        } else {
            j.quebec(Result.m206constructorimpl(obj2), function1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        b(((Result) obj).alpha);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    public final void b(Object obj) {
        pl2 pl2Var = mXi.f10907b;
        mXi.f9(this.f9836b.alpha);
        this.f9835W.b(new h9.y(this.f9837f9, obj, this.sVU, this.gmP, (Function1) this.f9834J));
    }
}
