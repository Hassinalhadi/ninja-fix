package b;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.p0;
import com.airbnb.lottie.compose.LottieConstants;
import d.C1551q;
import d.InterfaceC1532g0;
import f.C1674k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class g0 implements InterfaceC1532g0 {
    public static final J2.l india = new J2.l(new S4.b(25), new a5.c(14));
    public final p0 alpha;
    public float echo;
    public final androidx.compose.runtime.ad golf;
    public final androidx.compose.runtime.ad hotel;
    public final p0 bravo = C0564b.whiskey(0);
    public final C1674k charlie = new C1674k();
    public final p0 delta = C0564b.whiskey(LottieConstants.IterateForever);
    public final C1551q foxtrot = new C1551q(new Ya.c(17, this));

    public g0(int i4) {
        this.alpha = C0564b.whiskey(i4);
        final int i5 = 0;
        this.golf = C0564b.quebec(new Function0(this) { // from class: b.f0
            public final /* synthetic */ g0 purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z2;
                boolean z10;
                switch (i5) {
                    case 0:
                        g0 g0Var = this.purple;
                        if (g0Var.foxtrot() < g0Var.delta.juliet()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        if (this.purple.foxtrot() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                }
            }
        });
        final int i10 = 1;
        this.hotel = C0564b.quebec(new Function0(this) { // from class: b.f0
            public final /* synthetic */ g0 purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z2;
                boolean z10;
                switch (i10) {
                    case 0:
                        g0 g0Var = this.purple;
                        if (g0Var.foxtrot() < g0Var.delta.juliet()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        if (this.purple.foxtrot() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                }
            }
        });
    }

    @Override // d.InterfaceC1532g0
    public final boolean alpha() {
        return this.foxtrot.alpha();
    }

    @Override // d.InterfaceC1532g0
    public final Object bravo(M m4, Xd.l lVar, Pd.c cVar) {
        Object bravo = this.foxtrot.bravo(m4, lVar, cVar);
        if (bravo == Od.a.alpha) {
            return bravo;
        }
        return Unit.INSTANCE;
    }

    @Override // d.InterfaceC1532g0
    public final boolean charlie() {
        return ((Boolean) this.hotel.getValue()).booleanValue();
    }

    @Override // d.InterfaceC1532g0
    public final boolean delta() {
        return ((Boolean) this.golf.getValue()).booleanValue();
    }

    @Override // d.InterfaceC1532g0
    public final float echo(float f5) {
        return this.foxtrot.echo(f5);
    }

    public final int foxtrot() {
        return this.alpha.juliet();
    }
}
