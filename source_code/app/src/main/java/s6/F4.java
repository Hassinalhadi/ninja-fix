package s6;

import T.s;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import fb.C1705d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import ob.AbstractC2214g;
import s6.F4;
import t6.AbstractC3076w3;

/* loaded from: classes2.dex */
public abstract class F4 {
    public static final void alpha(final T.s sVar, final String orderStatusLabel, final String str, AbstractC1680b abstractC1680b, AbstractC1680b abstractC1680b2, long j5, float f5, float f10, long j6, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        final AbstractC1680b abstractC1680b3;
        final AbstractC1680b abstractC1680b4;
        final long j7;
        final float f11;
        final float f12;
        final long j10;
        AbstractC1680b charlie;
        int i10;
        float f13;
        long j11;
        float f14;
        long j12;
        int i11;
        int i12;
        int i13;
        Intrinsics.echo(orderStatusLabel, "orderStatusLabel");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1493458383);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(sVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(orderStatusLabel)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.golf(str)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        }
        int i14 = i5 | 3072;
        if ((i4 & 24576) == 0) {
            i14 = i5 | 11264;
        }
        int i15 = 920125440 | i14;
        if ((306717843 & i15) != 306717842) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i15 & 1, z2)) {
            c0585q2.orange();
            if ((i4 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                i10 = i15 & (-516097);
                abstractC1680b3 = abstractC1680b;
                charlie = abstractC1680b2;
                j11 = j5;
                f13 = f5;
                f14 = f10;
                j12 = j6;
            } else {
                abstractC1680b3 = AbstractC3076w3.charlie(R.drawable.ic_save_circle, c0585q2, 0);
                charlie = AbstractC3076w3.charlie(R.drawable.ic_upload_invoice, c0585q2, 0);
                i10 = i15 & (-516097);
                long j13 = AbstractC2214g.charlie;
                f13 = AbstractC2214g.delta;
                j11 = j13;
                f14 = AbstractC2214g.echo;
                j12 = AbstractC2214g.foxtrot;
            }
            c0585q2.romeo();
            int i16 = (i10 & 7182) | ((i10 >> 3) & 458752);
            int i17 = i10 >> 6;
            c0585q = c0585q2;
            G4.bravo(sVar, new C1705d(abstractC1680b3, orderStatusLabel, str), null, AbstractC2094g.bravo(f13), j11, f14, j12, c0585q, i16 | (3670016 & i17) | (i17 & 29360128), 260);
            f11 = f13;
            abstractC1680b4 = charlie;
            j7 = j11;
            f12 = f14;
            j10 = j12;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            abstractC1680b3 = abstractC1680b;
            abstractC1680b4 = abstractC1680b2;
            j7 = j5;
            f11 = f5;
            f12 = f10;
            j10 = j6;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: fb.b
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    String str2 = str;
                    float f15 = f12;
                    long j14 = j10;
                    F4.alpha(s.this, orderStatusLabel, str2, abstractC1680b3, abstractC1680b4, j7, f11, f15, j14, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
