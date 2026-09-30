package bx;

import F.C0088b;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t0;
import bz.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: bx.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0771i extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0771i(bz.an anVar, T.p pVar, ax axVar, az azVar, String str, P.d dVar, int i4) {
        super(2);
        this.red = anVar;
        this.silver = pVar;
        this.teal = axVar;
        this.white = azVar;
        this.yellow = str;
        this.purple = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        Object obj3;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    Object jade = c0585q.jade();
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    Function1 function1 = (Function1) this.teal;
                    s sVar = (s) this.white;
                    if (jade == asVar) {
                        jade = (ae) function1.invoke(sVar);
                        c0585q.f(jade);
                    }
                    ae aeVar = (ae) jade;
                    a0 a0Var = (a0) this.red;
                    Object charlie = a0Var.foxtrot().charlie();
                    Object obj4 = this.silver;
                    boolean hotel = c0585q.hotel(Intrinsics.areEqual(charlie, obj4));
                    Object jade2 = c0585q.jade();
                    if (hotel || jade2 == asVar) {
                        if (Intrinsics.areEqual(a0Var.foxtrot().charlie(), obj4)) {
                            obj3 = az.alpha;
                        } else {
                            obj3 = ((ae) function1.invoke(sVar)).bravo;
                        }
                        jade2 = obj3;
                        c0585q.f(jade2);
                    }
                    az azVar = (az) jade2;
                    Object jade3 = c0585q.jade();
                    androidx.compose.runtime.ax axVar = a0Var.delta;
                    if (jade3 == asVar) {
                        jade3 = new o(Intrinsics.areEqual(obj4, ((t0) axVar).getValue()));
                        c0585q.f(jade3);
                    }
                    o oVar = (o) jade3;
                    ax axVar2 = aeVar.alpha;
                    boolean india = c0585q.india(aeVar);
                    Object jade4 = c0585q.jade();
                    if (india || jade4 == asVar) {
                        jade4 = new C0768f(0, aeVar);
                        c0585q.f(jade4);
                    }
                    T.s bravo = androidx.compose.ui.layout.a.bravo((Xd.m) jade4);
                    ((t0) oVar.alpha).setValue(Boolean.valueOf(Intrinsics.areEqual(obj4, ((t0) axVar).getValue())));
                    T.s charlie2 = Q0.c.charlie((s0.F) bravo, oVar);
                    boolean india2 = c0585q.india(obj4);
                    Object jade5 = c0585q.jade();
                    if (india2 || jade5 == asVar) {
                        jade5 = new C0769g(0, obj4);
                        c0585q.f(jade5);
                    }
                    Function1 function12 = (Function1) jade5;
                    boolean golf = c0585q.golf(azVar);
                    Object jade6 = c0585q.jade();
                    if (golf || jade6 == asVar) {
                        jade6 = new C0088b(7, azVar);
                        c0585q.f(jade6);
                    }
                    androidx.compose.animation.b.alpha((a0) this.red, function12, charlie2, axVar2, azVar, (Xd.l) jade6, P.e.echo(-143346359, new C0770h((SnapshotStateList) this.yellow, obj4, sVar, this.purple), c0585q), c0585q, 12582912);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(1572871);
                P.d dVar = this.purple;
                androidx.compose.animation.b.bravo((bz.an) this.red, (T.p) this.silver, (ax) this.teal, (az) this.white, (String) this.yellow, dVar, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0771i(a0 a0Var, Object obj, Function1 function1, s sVar, SnapshotStateList snapshotStateList, P.d dVar) {
        super(2);
        this.red = a0Var;
        this.silver = obj;
        this.teal = function1;
        this.white = sVar;
        this.yellow = snapshotStateList;
        this.purple = dVar;
    }
}
