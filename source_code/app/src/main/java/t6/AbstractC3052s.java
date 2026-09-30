package t6;

import H0.k;
import T.i;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3052s;

/* renamed from: t6.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3052s {
    public static final /* synthetic */ int alpha = 0;

    public static final void alpha(final String value, final String label, final T.s sVar, long j5, long j6, float f5, T.i iVar, H0.k kVar, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        final long j7;
        final long j10;
        final float f10;
        final T.i iVar2;
        final H0.k kVar2;
        H0.k kVar3;
        int i10;
        float f11;
        T.i iVar3;
        long j11;
        long j12;
        H0.k kVar4;
        H0.k kVar5;
        int i11;
        int i12;
        int i13;
        Intrinsics.echo(value, "value");
        Intrinsics.echo(label, "label");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1183653584);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(value)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(label)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.golf(sVar)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        }
        int i14 = i5 | 5972992;
        if ((4793491 & i14) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i14 & 1, z2)) {
            c0585q2.orange();
            if ((i4 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                j11 = j5;
                j12 = j6;
                f11 = f5;
                kVar3 = kVar;
                i10 = i14 & (-29424641);
                iVar3 = iVar;
            } else {
                androidx.compose.runtime.E0 e02 = F.Q.alpha;
                long j13 = ((F.O) c0585q2.kilo(e02)).oscar;
                long j14 = ((F.O) c0585q2.kilo(e02)).sierra;
                T.i iVar4 = T.d.f2063g;
                kVar3 = ((F.S2) c0585q2.kilo(F.T2.alpha)).delta.alpha.foxtrot;
                i10 = i14 & (-29424641);
                f11 = 4;
                iVar3 = iVar4;
                j11 = j13;
                j12 = j14;
            }
            c0585q2.romeo();
            C0537c c0537c = AbstractC0542h.alpha;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.india(f11, T.d.f2060c), iVar3, c0585q2, 48);
            int romeo = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie = T.a.charlie(sVar, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q2, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie);
            long charlie2 = AbstractC2636d7.charlie(16);
            H0.g gVar = H0.k.alpha;
            if (kVar3 == null) {
                kVar4 = gVar;
            } else {
                kVar4 = kVar3;
            }
            long j15 = j11;
            float f12 = f11;
            T.i iVar5 = iVar3;
            F.G2.bravo(value, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j11, charlie2, new H0.v(900), null, kVar4, 0L, 3, 0L, 0, 16744408), c0585q2, i10 & 14, 0, 65534);
            long charlie3 = AbstractC2636d7.charlie(12);
            if (kVar3 == null) {
                kVar5 = gVar;
            } else {
                kVar5 = kVar3;
            }
            long j16 = j12;
            F.G2.bravo(label, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j16, charlie3, new H0.v(HttpConstants.HTTP_BLOCKED), null, kVar5, 0L, 3, 0L, 0, 16744408), c0585q2, (i10 >> 3) & 14, 0, 65534);
            c0585q = c0585q2;
            c0585q.quebec(true);
            j10 = j16;
            kVar2 = kVar3;
            j7 = j15;
            f10 = f12;
            iVar2 = iVar5;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            j7 = j5;
            j10 = j6;
            f10 = f5;
            iVar2 = iVar;
            kVar2 = kVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: rb.c
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    i iVar6 = iVar2;
                    k kVar6 = kVar2;
                    AbstractC3052s.alpha(value, label, sVar, j7, j10, f10, iVar6, kVar6, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
