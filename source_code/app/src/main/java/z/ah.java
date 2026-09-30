package z;

import a0.as;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.P3;

/* loaded from: classes3.dex */
public final class ah implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14169a;
    public final /* synthetic */ T.s alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f14170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P.d f14171c;
    public final /* synthetic */ as purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ b.ab teal;
    public final /* synthetic */ float white;
    public final /* synthetic */ InterfaceC1673j yellow;

    public ah(float f5, float f10, long j5, P.d dVar, T.s sVar, as asVar, b.ab abVar, InterfaceC1673j interfaceC1673j, Function0 function0, boolean z2) {
        this.alpha = sVar;
        this.purple = asVar;
        this.red = j5;
        this.silver = f5;
        this.teal = abVar;
        this.white = f10;
        this.yellow = interfaceC1673j;
        this.f14169a = z2;
        this.f14170b = function0;
        this.f14171c = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            E0 e02 = t.alpha;
            T.s charlie = androidx.compose.foundation.a.charlie(P3.charlie(this.alpha.then(MinimumInteractiveModifier.alpha), this.purple, P3.delta(this.red, (l) c0585q.kilo(q.alpha), this.silver, c0585q), this.teal, this.white), this.yellow, aa.alpha(7), this.f14169a, null, this.f14170b, 24);
            ap delta = AbstractC0547m.delta(T.d.alpha, true);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(charlie, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            this.f14171c.invoke(c0585q, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
