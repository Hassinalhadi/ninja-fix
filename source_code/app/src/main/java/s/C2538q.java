package s;

import T.s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import k5.C2015h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n.Y;

/* renamed from: s.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2538q {
    public static final C2538q alpha = new Object();

    public final void alpha(Drawable drawable, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(257732500);
        if (c0585q.india(drawable)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            s kilo = V.kilo(T.p.alpha, c.f.juliet);
            boolean india = c0585q.india(drawable);
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new Y(11, drawable);
                c0585q.f(jade);
            }
            AbstractC0547m.alpha(androidx.compose.ui.draw.a.alpha(kilo, (Function1) jade), c0585q, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2015h(i4, 4, this, drawable);
        }
    }

    public final void bravo(final Icon icon, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2116504409);
        if (c0585q.india(icon)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            boolean golf = c0585q.golf(icon) | c0585q.golf(context);
            Object jade = c0585q.jade();
            if (golf || jade == C0580l.alpha) {
                jade = icon.loadDrawable(context);
                c0585q.f(jade);
            }
            Drawable drawable = (Drawable) jade;
            if (drawable == null) {
                Q uniform = c0585q.uniform();
                if (uniform != null) {
                    final int i11 = 1;
                    uniform.delta = new Xd.l(this, icon, i4, i11) { // from class: s.p
                        public final /* synthetic */ int alpha;
                        public final /* synthetic */ C2538q purple;
                        public final /* synthetic */ Icon red;

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
                                    this.purple.bravo(this.red, interfaceC0581m2, C0564b.cyan(49));
                                    return Unit.INSTANCE;
                                default:
                                    this.purple.bravo(this.red, interfaceC0581m2, C0564b.cyan(49));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            alpha(drawable, c0585q, 48);
        } else {
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            final int i12 = 0;
            uniform2.delta = new Xd.l(this, icon, i4, i12) { // from class: s.p
                public final /* synthetic */ int alpha;
                public final /* synthetic */ C2538q purple;
                public final /* synthetic */ Icon red;

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
                            this.purple.bravo(this.red, interfaceC0581m2, C0564b.cyan(49));
                            return Unit.INSTANCE;
                        default:
                            this.purple.bravo(this.red, interfaceC0581m2, C0564b.cyan(49));
                            return Unit.INSTANCE;
                    }
                }
            };
        }
    }
}
