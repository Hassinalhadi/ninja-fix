package y;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3032n3;

/* renamed from: y.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3364d implements Xd.l {
    public final /* synthetic */ long alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ InterfaceC3372l silver;

    public C3364d(long j5, boolean z2, T.s sVar, InterfaceC3372l interfaceC3372l) {
        this.alpha = j5;
        this.purple = z2;
        this.red = sVar;
        this.silver = interfaceC3372l;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        C0537c c0537c;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            long j5 = this.alpha;
            androidx.compose.runtime.as asVar = C0580l.alpha;
            final InterfaceC3372l interfaceC3372l = this.silver;
            boolean z10 = this.purple;
            if (j5 != 9205357640488583168L) {
                c0585q.purple(3458246);
                if (z10) {
                    c0537c = AbstractC0538d.bravo;
                } else {
                    c0537c = AbstractC0538d.alpha;
                }
                T.s juliet = V.juliet(this.red, Q0.i.bravo(j5), Q0.i.alpha(j5), 0.0f, 0.0f, 12);
                S alpha = Q.alpha(c0537c, T.d.f2060c, c0585q, 0);
                long j6 = c0585q.magenta;
                int i4 = (int) (j6 ^ (j6 >>> 32));
                androidx.compose.runtime.I mike = c0585q.mike();
                T.s charlie = T.a.charlie(juliet, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, alpha);
                C0564b.blue(C2551k.echo, c0585q, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
                    ao.ad.blue(i4, c0585q, i4, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie);
                T.p pVar = T.p.alpha;
                boolean india = c0585q.india(interfaceC3372l);
                Object jade = c0585q.jade();
                if (india || jade == asVar) {
                    final int i5 = 0;
                    jade = new Function0() { // from class: y.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z11;
                            boolean z12;
                            switch (i5) {
                                case 0:
                                    if ((interfaceC3372l.alpha() & 9223372034707292159L) != 9205357640488583168L) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    return Boolean.valueOf(z11);
                                default:
                                    if ((interfaceC3372l.alpha() & 9223372034707292159L) != 9205357640488583168L) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    return Boolean.valueOf(z12);
                            }
                        }
                    };
                    c0585q.f(jade);
                }
                AbstractC3032n3.charlie(6, pVar, c0585q, (Function0) jade, z10);
                c0585q.quebec(true);
                c0585q.quebec(false);
            } else {
                c0585q.purple(4389176);
                boolean india2 = c0585q.india(interfaceC3372l);
                Object jade2 = c0585q.jade();
                if (india2 || jade2 == asVar) {
                    final int i10 = 1;
                    jade2 = new Function0() { // from class: y.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z11;
                            boolean z12;
                            switch (i10) {
                                case 0:
                                    if ((interfaceC3372l.alpha() & 9223372034707292159L) != 9205357640488583168L) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    return Boolean.valueOf(z11);
                                default:
                                    if ((interfaceC3372l.alpha() & 9223372034707292159L) != 9205357640488583168L) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    return Boolean.valueOf(z12);
                            }
                        }
                    };
                    c0585q.f(jade2);
                }
                AbstractC3032n3.charlie(0, this.red, c0585q, (Function0) jade2, z10);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
