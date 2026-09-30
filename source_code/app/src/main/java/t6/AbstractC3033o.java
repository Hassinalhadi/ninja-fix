package t6;

import android.view.DragEvent;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import t6.AbstractC3033o;

/* renamed from: t6.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3033o {
    public static final void alpha(final T.s sVar, final float f5, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        int i11;
        int i12;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1012812818);
        int i13 = i5 & 1;
        if (i13 != 0) {
            i10 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            i10 = i4;
        }
        int i14 = i5 & 2;
        if (i14 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c0585q.delta(f5)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i13 != 0) {
                sVar = T.p.alpha;
            }
            if (i14 != 0) {
                f5 = 1;
            }
            float f10 = f5;
            F.K1.echo(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), f10, Db.c.azure, c0585q, (i10 & 112) | 384, 0);
            f5 = f10;
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: rb.a
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    float f11 = f5;
                    int i15 = i5;
                    AbstractC3033o.alpha(sVar, f11, (InterfaceC0581m) obj, cyan, i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final long bravo(O7.j jVar) {
        DragEvent dragEvent = (DragEvent) jVar.purple;
        float x4 = dragEvent.getX();
        float y10 = dragEvent.getY();
        return (Float.floatToRawIntBits(x4) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L);
    }
}
