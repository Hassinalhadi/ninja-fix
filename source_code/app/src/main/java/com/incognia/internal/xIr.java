package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1821B;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final class xIr implements Rfd {
    public static final String PqK = (String) wGk.hl.getValue();

    /* renamed from: J, reason: collision with root package name */
    public final String f11784J;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f11785W;

    /* renamed from: b, reason: collision with root package name */
    public final P0 f11786b;

    /* renamed from: f9, reason: collision with root package name */
    public final L7E f11787f9;
    public final boolean gmP;
    public boolean sVU;

    public xIr(P0 p02, F3q f3q, boolean z2) {
        boolean z10;
        Boolean bool;
        this.f11786b = p02;
        this.f11785W = z2;
        L7E l7e = new L7E(p02.W(), f3q.f8641b, f3q.f8640W);
        this.f11787f9 = l7e;
        AI b2 = l7e.f9042W.b(l7e.f9043b);
        if (b2 != null && (bool = b2.gmP) != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        this.gmP = z10;
        this.f11784J = PqK + p02.W();
    }

    public static final void f9(Function1 function1, xIr xir) {
        Result.Companion companion = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new TYz(xir.f11786b.W()))), function1);
    }

    public final boolean W(pl2 pl2Var, Function1 function1) {
        Boolean bool;
        L7E l7e = this.f11787f9;
        AI b2 = l7e.f9042W.b(l7e.f9043b);
        if ((b2 == null || (bool = b2.f8349f9) == null) ? true : bool.booleanValue()) {
            return false;
        }
        pl2Var.b(new C1821B(function1, this, 1));
        return true;
    }

    public final boolean b(pl2 pl2Var, Function1 function1) {
        if (!this.sVU) {
            return false;
        }
        pl2Var.b(new C1821B(function1, this, 0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (((r1 == null || (r1 = r1.f8346J) == null) ? true : r1.booleanValue()) != false) goto L25;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(pl2 pl2Var, Function1 function1, Function1 function12, ArrayList arrayList) {
        Boolean bool;
        if (b(pl2Var, function12) || W(pl2Var, function12) || b(pl2Var, function12, arrayList)) {
            return;
        }
        boolean z2 = true;
        this.sVU = true;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? obj = new Object();
        obj.alpha = -1;
        L7E l7e = this.f11787f9;
        AI b2 = l7e.f9042W.b(l7e.f9043b);
        if ((b2 == null || (bool = b2.f8349f9) == null) ? true : bool.booleanValue()) {
            AI b4 = l7e.f9042W.b(l7e.f9043b);
        }
        z2 = false;
        if (z2) {
            pl2 pl2Var2 = mXi.f10907b;
            obj.alpha = mXi.b(this.f11784J);
        }
        this.f11786b.b(new yE(pl2Var, this, arrayList, objectRef, function1), new WA(obj, pl2Var, this, arrayList, objectRef, function12));
    }

    public static final void W(Function1 function1, xIr xir) {
        Result.Companion companion = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new bJ(xir.f11786b.W()))), function1);
    }

    public static final void b(Function1 function1, xIr xir) {
        Result.Companion companion = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new uAV(xir.f11786b.W()))), function1);
    }

    public final boolean b(pl2 pl2Var, Function1 function1, ArrayList arrayList) {
        if (this.f11787f9.b(arrayList)) {
            return false;
        }
        pl2Var.b(new C1821B(function1, this, 2));
        return true;
    }
}
