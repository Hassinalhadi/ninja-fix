package F;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.C0778c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2911e0;

/* loaded from: classes3.dex */
public final class T0 extends Lambda implements Xd.l {
    public final /* synthetic */ long alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f1073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.as f1074d;
    public final /* synthetic */ long e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f1076g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P.d f1077h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ N0 f1078i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P.d f1079j;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ C0103e2 red;
    public final /* synthetic */ C0778c silver;
    public final /* synthetic */ vf.ab teal;
    public final /* synthetic */ Function1 white;
    public final /* synthetic */ T.s yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(long j5, Function0 function0, C0103e2 c0103e2, C0778c c0778c, vf.ab abVar, Function1 function1, T.s sVar, float f5, a0.as asVar, long j6, long j7, float f10, P.d dVar, N0 n02, P.d dVar2) {
        super(2);
        this.alpha = j5;
        this.purple = function0;
        this.red = c0103e2;
        this.silver = c0778c;
        this.teal = abVar;
        this.white = function1;
        this.yellow = sVar;
        this.f1073c = f5;
        this.f1074d = asVar;
        this.e = j6;
        this.f1075f = j7;
        this.f1076g = f10;
        this.f1077h = dVar;
        this.f1078i = n02;
        this.f1079j = dVar2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        T.s bravo = A0.o.bravo(T.a.alpha(androidx.compose.foundation.layout.V.charlie, AbstractC2911e0.alpha, new androidx.compose.foundation.layout.d0(0)), false, C0172x.teal);
        q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
        int romeo = C0564b.romeo(interfaceC0581m);
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        androidx.compose.runtime.I mike = c0585q2.mike();
        T.s charlie = T.a.charlie(bravo, interfaceC0581m);
        InterfaceC2552l.maroon.getClass();
        C2550j c2550j = C2551k.bravo;
        c0585q2.white();
        if (c0585q2.lime) {
            c0585q2.lima(c2550j);
        } else {
            c0585q2.i();
        }
        C0564b.blue(C2551k.foxtrot, interfaceC0581m, delta);
        C0564b.blue(C2551k.echo, interfaceC0581m, mike);
        C2549i c2549i = C2551k.golf;
        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
            ao.ad.blue(romeo, c0585q2, romeo, c2549i);
        }
        C0564b.blue(C2551k.delta, interfaceC0581m, charlie);
        C0103e2 c0103e2 = this.red;
        if (((EnumC0107f2) ((androidx.compose.runtime.ad) c0103e2.bravo.juliet).getValue()) != EnumC0107f2.alpha) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j5 = this.alpha;
        Function0 function0 = this.purple;
        AbstractC0122j1.charlie(j5, function0, z2, interfaceC0581m, 0);
        AbstractC0122j1.bravo(this.silver, this.teal, function0, this.white, this.yellow, c0103e2, this.f1073c, this.f1074d, this.e, this.f1075f, this.f1076g, this.f1077h, this.f1078i, this.f1079j, interfaceC0581m, 70);
        c0585q2.quebec(true);
        return Unit.INSTANCE;
    }
}
