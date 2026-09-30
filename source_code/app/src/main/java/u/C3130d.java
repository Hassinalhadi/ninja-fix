package u;

import Pd.i;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import b.Q;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3130d implements InterfaceC3133g {
    public final P.d alpha;
    public final Q bravo = new Q();
    public final ax charlie = C0564b.zulu(null);

    public C3130d(P.d dVar) {
        this.alpha = dVar;
    }

    @Override // u.InterfaceC3133g
    public final Object alpha(InterfaceC3132f interfaceC3132f, i iVar) {
        Object bravo = Q.bravo(this.bravo, new C3129c(this, new C3128b(interfaceC3132f), null), iVar);
        if (bravo == Od.a.alpha) {
            return bravo;
        }
        return Unit.INSTANCE;
    }

    public final void bravo(final Function0 function0, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        final Function0 function02;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(723898654);
        if (c0585q.golf(this)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i10 = i5 | i4;
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            C3128b c3128b = (C3128b) ((t0) this.charlie).getValue();
            if (c3128b == null) {
                androidx.compose.runtime.Q uniform = c0585q.uniform();
                if (uniform != null) {
                    final int i11 = 0;
                    uniform.delta = new l(this, function0, i4, i11) { // from class: u.a
                        public final /* synthetic */ int alpha;
                        public final /* synthetic */ C3130d purple;
                        public final /* synthetic */ Function0 red;

                        {
                            this.alpha = i11;
                            this.purple = this;
                        }

                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            int i12 = this.alpha;
                            InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                            ((Integer) obj2).getClass();
                            switch (i12) {
                                case 0:
                                    this.purple.bravo(this.red, interfaceC0581m2, C0564b.cyan(7));
                                    return Unit.INSTANCE;
                                default:
                                    this.purple.bravo(this.red, interfaceC0581m2, C0564b.cyan(7));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            function02 = function0;
            this.alpha.golf(c3128b, c3128b.alpha, function02, c0585q, 384);
        } else {
            function02 = function0;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            final int i12 = 1;
            uniform2.delta = new l(this, function02, i4, i12) { // from class: u.a
                public final /* synthetic */ int alpha;
                public final /* synthetic */ C3130d purple;
                public final /* synthetic */ Function0 red;

                {
                    this.alpha = i12;
                    this.purple = this;
                }

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    int i122 = this.alpha;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                    ((Integer) obj2).getClass();
                    switch (i122) {
                        case 0:
                            this.purple.bravo(this.red, interfaceC0581m2, C0564b.cyan(7));
                            return Unit.INSTANCE;
                        default:
                            this.purple.bravo(this.red, interfaceC0581m2, C0564b.cyan(7));
                            return Unit.INSTANCE;
                    }
                }
            };
        }
    }
}
