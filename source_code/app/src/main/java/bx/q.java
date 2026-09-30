package bx;

import androidx.compose.runtime.D0;
import bz.AbstractC0779d;
import bz.V;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s6.J4;

/* loaded from: classes3.dex */
public final class q extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ long red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j5, D0 d02) {
        super(1);
        this.alpha = 2;
        this.red = j5;
        this.purple = d02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j5;
        long j6;
        switch (this.alpha) {
            case 0:
                V v4 = (V) obj;
                Object alpha = v4.alpha();
                r rVar = (r) this.purple;
                long j7 = 0;
                if (Intrinsics.areEqual(alpha, rVar.silver.alpha())) {
                    if (Q0.m.alpha(rVar.teal, androidx.compose.animation.a.alpha)) {
                        j5 = this.red;
                    } else {
                        j5 = rVar.teal;
                    }
                } else {
                    D0 d02 = (D0) rVar.silver.delta.golf(v4.alpha());
                    if (d02 != null) {
                        j5 = ((Q0.m) d02.getValue()).alpha;
                    } else {
                        j5 = 0;
                    }
                }
                D0 d03 = (D0) rVar.silver.delta.golf(v4.charlie());
                if (d03 != null) {
                    j7 = ((Q0.m) d03.getValue()).alpha;
                }
                K k6 = (K) rVar.red.getValue();
                if (k6 != null) {
                    bz.aa aaVar = (bz.aa) k6.alpha.invoke(new Q0.m(j5), new Q0.m(j7));
                    if (aaVar != null) {
                        return aaVar;
                    }
                }
                return AbstractC0779d.juliet(400.0f, null, 5);
            case 1:
                r rVar2 = (r) this.purple;
                if (Intrinsics.areEqual(obj, rVar2.silver.alpha())) {
                    if (Q0.m.alpha(rVar2.teal, androidx.compose.animation.a.alpha)) {
                        j6 = this.red;
                    } else {
                        j6 = rVar2.teal;
                    }
                } else {
                    D0 d04 = (D0) rVar2.silver.delta.golf(obj);
                    if (d04 != null) {
                        j6 = ((Q0.m) d04.getValue()).alpha;
                    } else {
                        j6 = 0;
                    }
                }
                return new Q0.m(j6);
            default:
                ao.ad.november((c0.d) obj, this.red, 0L, 0L, J4.charlie(((Number) ((D0) this.purple).getValue()).floatValue(), 0.0f, 1.0f), null, 118);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, long j5, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = rVar;
        this.red = j5;
    }
}
