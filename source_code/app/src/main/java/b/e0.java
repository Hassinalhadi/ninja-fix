package b;

import com.airbnb.lottie.compose.LottieConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import t6.U3;

/* loaded from: classes3.dex */
public final class e0 extends T.r implements s0.ab, s0.e0 {
    public g0 alpha;
    public boolean purple;

    @Override // s0.e0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    @Override // s0.e0
    public final void india(A0.ad adVar) {
        A0.aa.foxtrot(adVar);
        final int i4 = 0;
        final int i5 = 1;
        A0.i iVar = new A0.i(new Function0(this) { // from class: b.d0
            public final /* synthetic */ e0 purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return Float.valueOf(this.purple.alpha.foxtrot());
                    default:
                        return Float.valueOf(this.purple.alpha.delta.juliet());
                }
            }
        }, new Function0(this) { // from class: b.d0
            public final /* synthetic */ e0 purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return Float.valueOf(this.purple.alpha.foxtrot());
                    default:
                        return Float.valueOf(this.purple.alpha.delta.juliet());
                }
            }
        });
        if (this.purple) {
            A0.ac acVar = A0.x.uniform;
            ge.v vVar = A0.aa.alpha[12];
            acVar.alpha(adVar, iVar);
        } else {
            A0.ac acVar2 = A0.x.tango;
            ge.v vVar2 = A0.aa.alpha[11];
            acVar2.alpha(adVar, iVar);
        }
    }

    @Override // s0.ab
    public final int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (!this.purple) {
            i4 = LottieConstants.IterateForever;
        }
        return interfaceC2401t.delta(i4);
    }

    @Override // s0.ab
    public final int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (this.purple) {
            i4 = LottieConstants.IterateForever;
        }
        return interfaceC2401t.romeo(i4);
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    public final q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        d.K k6;
        int golf;
        Function1 function1;
        int i4;
        if (this.purple) {
            k6 = d.K.alpha;
        } else {
            k6 = d.K.purple;
        }
        U3.charlie(j5, k6);
        boolean z2 = this.purple;
        int i5 = LottieConstants.IterateForever;
        if (z2) {
            golf = Integer.MAX_VALUE;
        } else {
            golf = Q0.a.golf(j5);
        }
        if (this.purple) {
            i5 = Q0.a.hotel(j5);
        }
        AbstractC2367C victor = aoVar.victor(Q0.a.alpha(j5, 0, i5, 0, golf, 5));
        int i10 = victor.alpha;
        int hotel = Q0.a.hotel(j5);
        if (i10 > hotel) {
            i10 = hotel;
        }
        int i11 = victor.purple;
        int golf2 = Q0.a.golf(j5);
        if (i11 > golf2) {
            i11 = golf2;
        }
        int i12 = victor.purple - i11;
        int i13 = victor.alpha - i10;
        if (!this.purple) {
            i12 = i13;
        }
        g0 g0Var = this.alpha;
        g0Var.delta.kilo(i12);
        S.g echo = r6.u.echo();
        if (echo != null) {
            function1 = echo.echo();
        } else {
            function1 = null;
        }
        S.g foxtrot = r6.u.foxtrot(echo);
        try {
            if (g0Var.foxtrot() > i12) {
                g0Var.alpha.kilo(i12);
            }
            r6.u.juliet(echo, foxtrot, function1);
            g0 g0Var2 = this.alpha;
            if (this.purple) {
                i4 = i11;
            } else {
                i4 = i10;
            }
            g0Var2.bravo.kilo(i4);
            return arVar.papa(i10, i11, kotlin.collections.t.alpha, new androidx.compose.runtime.P(i12, 1, this, victor));
        } catch (Throwable th) {
            r6.u.juliet(echo, foxtrot, function1);
            throw th;
        }
    }

    @Override // s0.ab
    public final int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (!this.purple) {
            i4 = LottieConstants.IterateForever;
        }
        return interfaceC2401t.jade(i4);
    }

    @Override // s0.ab
    public final int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (this.purple) {
            i4 = LottieConstants.IterateForever;
        }
        return interfaceC2401t.lima(i4);
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yankee() {
        return false;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yellow() {
        return false;
    }
}
