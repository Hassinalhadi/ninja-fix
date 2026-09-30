package t6;

import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.AbstractC0513k;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import java.util.ArrayList;
import kotlin.Unit;
import t0.AbstractC2901T;
import t6.O3;

/* loaded from: classes2.dex */
public abstract class O3 {
    public static final void alpha(T.s sVar, final long j5, float f5, float f10, InterfaceC0581m interfaceC0581m, final int i4) {
        boolean z2;
        final float f11;
        final float f12;
        float f13;
        float f14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1249392198);
        int i5 = i4 | 3078;
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            c0585q.orange();
            int i10 = i4 & 1;
            T.s sVar2 = T.p.alpha;
            if (i10 != 0 && !c0585q.beige()) {
                c0585q.ochre();
                f13 = f10;
            } else {
                f13 = 0;
                sVar = sVar2;
            }
            c0585q.romeo();
            if (f13 != 0.0f) {
                sVar2 = AbstractC0538d.whiskey(sVar2, f13, 0.0f, 0.0f, 0.0f, 14);
            }
            f11 = f5;
            if (Q0.g.alpha(f11, 0.0f)) {
                c0585q.purple(-455967894);
                f14 = 1.0f / ((Q0.d) c0585q.kilo(AbstractC2901T.hotel)).alpha();
                c0585q.quebec(false);
            } else {
                c0585q.purple(-455901337);
                c0585q.quebec(false);
                f14 = f11;
            }
            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(sVar.then(sVar2), 1.0f), f14), j5, a0.ao.alpha), c0585q, 0);
            f12 = f13;
        } else {
            f11 = f5;
            c0585q.ochre();
            f12 = f10;
        }
        final T.s sVar3 = sVar;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(j5, f11, f12, i4) { // from class: z.o
                public final /* synthetic */ long purple;
                public final /* synthetic */ float red;
                public final /* synthetic */ float silver;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(433);
                    float f15 = this.red;
                    float f16 = this.silver;
                    O3.alpha(T.s.this, this.purple, f15, f16, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void bravo(AbstractC0512j abstractC0512j, ArrayList arrayList) {
        if (!(abstractC0512j instanceof AbstractC0513k)) {
            if (abstractC0512j instanceof av.ae) {
                arrayList.add(((av.ae) abstractC0512j).alpha);
                return;
            } else {
                arrayList.add(new av.v(abstractC0512j));
                return;
            }
        }
        ((AbstractC0513k) abstractC0512j).getClass();
        throw null;
    }
}
