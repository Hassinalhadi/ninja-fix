package F;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2901T;

/* renamed from: F.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0119i2 extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f1133c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1134d;
    public final /* synthetic */ P.d e;
    public final /* synthetic */ a0.as purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ b.ab teal;
    public final /* synthetic */ InterfaceC1673j white;
    public final /* synthetic */ boolean yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119i2(float f5, float f10, long j5, P.d dVar, T.s sVar, a0.as asVar, b.ab abVar, InterfaceC1673j interfaceC1673j, Function0 function0, boolean z2) {
        super(2);
        this.alpha = sVar;
        this.purple = asVar;
        this.red = j5;
        this.silver = f5;
        this.teal = abVar;
        this.white = interfaceC1673j;
        this.yellow = z2;
        this.f1133c = function0;
        this.f1134d = f10;
        this.e = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        androidx.compose.runtime.E0 e02 = AbstractC0145p0.alpha;
        T.s then = this.alpha.then(MinimumInteractiveModifier.alpha);
        long delta = AbstractC0127k2.delta(this.red, this.silver, interfaceC0581m);
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        T.s charlie = androidx.compose.foundation.a.charlie(AbstractC0127k2.charlie(then, this.purple, delta, this.teal, ((Q0.d) c0585q2.kilo(AbstractC2901T.hotel)).lavender(this.f1134d)), this.white, L1.bravo(false, 0.0f, c0585q2, 0, 7), this.yellow, null, this.f1133c, 24);
        q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, true);
        int romeo = C0564b.romeo(c0585q2);
        androidx.compose.runtime.I mike = c0585q2.mike();
        T.s charlie2 = T.a.charlie(charlie, c0585q2);
        InterfaceC2552l.maroon.getClass();
        C2550j c2550j = C2551k.bravo;
        c0585q2.white();
        if (c0585q2.lime) {
            c0585q2.lima(c2550j);
        } else {
            c0585q2.i();
        }
        C0564b.blue(C2551k.foxtrot, c0585q2, delta2);
        C0564b.blue(C2551k.echo, c0585q2, mike);
        C2549i c2549i = C2551k.golf;
        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
            ao.ad.blue(romeo, c0585q2, romeo, c2549i);
        }
        C0564b.blue(C2551k.delta, c0585q2, charlie2);
        this.e.invoke(c0585q2, 0);
        c0585q2.quebec(true);
        return Unit.INSTANCE;
    }
}
