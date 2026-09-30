package F;

import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;

/* loaded from: classes3.dex */
public abstract class al {
    public static final androidx.compose.foundation.layout.M alpha;
    public static final androidx.compose.foundation.layout.M bravo;
    public static final float charlie;
    public static final float delta;

    static {
        float f5 = 24;
        float f10 = 8;
        alpha = new androidx.compose.foundation.layout.M(f5, f10, f5, f10);
        float f11 = 16;
        AbstractC0538d.charlie(f11, f10, f5, f10);
        float f12 = 12;
        bravo = new androidx.compose.foundation.layout.M(f12, f10, f12, f10);
        AbstractC0538d.charlie(f12, f10, f11, f10);
        charlie = 58;
        delta = 40;
        float f13 = H.g.alpha;
    }

    public static ak alpha(long j5, long j6, long j7, long j10, InterfaceC0581m interfaceC0581m, int i4) {
        long j11;
        long j12;
        if ((i4 & 2) != 0) {
            j6 = C0366t.kilo;
        }
        long j13 = j6;
        if ((i4 & 4) != 0) {
            j11 = C0366t.kilo;
        } else {
            j11 = j7;
        }
        if ((i4 & 8) != 0) {
            j12 = C0366t.kilo;
        } else {
            j12 = j10;
        }
        return charlie((O) ((C0585q) interfaceC0581m).kilo(Q.alpha)).alpha(j5, j13, j11, j12);
    }

    public static ap bravo(float f5, int i4) {
        if ((i4 & 1) != 0) {
            f5 = H.g.alpha;
        }
        return new ap(f5, H.g.india, H.g.foxtrot, H.g.golf, H.g.delta);
    }

    public static ak charlie(O o5) {
        ak akVar = o5.fuchsia;
        if (akVar == null) {
            float f5 = H.g.alpha;
            ak akVar2 = new ak(Q.charlie(o5, 26), Q.charlie(o5, H.g.hotel), C0366t.bravo(0.12f, Q.charlie(o5, H.g.charlie)), C0366t.bravo(0.38f, Q.charlie(o5, H.g.echo)));
            o5.fuchsia = akVar2;
            return akVar2;
        }
        return akVar;
    }

    public static ak delta(long j5, long j6, long j7, long j10, InterfaceC0581m interfaceC0581m, int i4) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        if ((i4 & 1) != 0) {
            j11 = C0366t.kilo;
        } else {
            j11 = j5;
        }
        if ((i4 & 2) != 0) {
            j12 = C0366t.kilo;
        } else {
            j12 = j6;
        }
        if ((i4 & 4) != 0) {
            j13 = C0366t.kilo;
        } else {
            j13 = j7;
        }
        if ((i4 & 8) != 0) {
            j14 = C0366t.kilo;
        } else {
            j14 = j10;
        }
        O o5 = (O) ((C0585q) interfaceC0581m).kilo(Q.alpha);
        ak akVar = o5.gold;
        if (akVar == null) {
            long j16 = C0366t.juliet;
            int i5 = H.m.alpha;
            akVar = new ak(j16, Q.charlie(o5, 26), j16, C0366t.bravo(0.38f, Q.charlie(o5, 18)));
            o5.gold = akVar;
            j15 = j11;
        } else {
            j15 = j11;
        }
        return akVar.alpha(j15, j12, j13, j14);
    }
}
