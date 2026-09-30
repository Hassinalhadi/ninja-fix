package X;

import T.r;
import U0.k;
import a0.AbstractC0367u;
import av.ah;
import com.airbnb.lottie.compose.LottieConstants;
import f0.AbstractC1680b;
import kotlin.collections.t;
import q0.AbstractC2367C;
import q0.AbstractC2375K;
import q0.InterfaceC2392k;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import q0.ao;
import q0.aq;
import q0.ar;
import s0.InterfaceC2558s;
import s0.ab;
import s0.an;

/* loaded from: classes3.dex */
public final class g extends r implements ab, InterfaceC2558s {
    public AbstractC1680b alpha;
    public boolean purple;
    public T.f red;
    public InterfaceC2392k silver;
    public float teal;
    public AbstractC0367u white;

    public static boolean c(long j5) {
        if (!Z.e.alpha(j5, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L))) & LottieConstants.IterateForever) < 2139095040) {
            return true;
        }
        return false;
    }

    public static boolean d(long j5) {
        if (!Z.e.alpha(j5, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 >> 32))) & LottieConstants.IterateForever) < 2139095040) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.purple && this.alpha.mo1getIntrinsicSizeNHjbRc() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    @Override // s0.InterfaceC2558s
    public final /* synthetic */ void blue() {
    }

    public final long e(long j5) {
        boolean z2;
        int juliet;
        int india;
        float intBitsToFloat;
        float intBitsToFloat2;
        boolean z10 = false;
        if (Q0.a.delta(j5) && Q0.a.charlie(j5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Q0.a.foxtrot(j5) && Q0.a.echo(j5)) {
            z10 = true;
        }
        if ((!b() && z2) || z10) {
            return Q0.a.alpha(j5, Q0.a.hotel(j5), 0, Q0.a.golf(j5), 0, 10);
        }
        long mo1getIntrinsicSizeNHjbRc = this.alpha.mo1getIntrinsicSizeNHjbRc();
        if (d(mo1getIntrinsicSizeNHjbRc)) {
            juliet = Math.round(Float.intBitsToFloat((int) (mo1getIntrinsicSizeNHjbRc >> 32)));
        } else {
            juliet = Q0.a.juliet(j5);
        }
        if (c(mo1getIntrinsicSizeNHjbRc)) {
            india = Math.round(Float.intBitsToFloat((int) (mo1getIntrinsicSizeNHjbRc & 4294967295L)));
        } else {
            india = Q0.a.india(j5);
        }
        int golf = Q0.b.golf(juliet, j5);
        float foxtrot = Q0.b.foxtrot(india, j5);
        long floatToRawIntBits = (Float.floatToRawIntBits(foxtrot) & 4294967295L) | (Float.floatToRawIntBits(golf) << 32);
        if (b()) {
            if (!d(this.alpha.mo1getIntrinsicSizeNHjbRc())) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (this.alpha.mo1getIntrinsicSizeNHjbRc() >> 32));
            }
            if (!c(this.alpha.mo1getIntrinsicSizeNHjbRc())) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            } else {
                intBitsToFloat2 = Float.intBitsToFloat((int) (this.alpha.mo1getIntrinsicSizeNHjbRc() & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
            if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) {
                floatToRawIntBits = 0;
            } else {
                floatToRawIntBits = AbstractC2375K.juliet(floatToRawIntBits2, this.silver.alpha(floatToRawIntBits2, floatToRawIntBits));
            }
        }
        return Q0.a.alpha(j5, Q0.b.golf(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j5), 0, Q0.b.foxtrot(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j5), 0, 10);
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.InterfaceC2558s
    public final void jade(an anVar) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j5;
        long mo1getIntrinsicSizeNHjbRc = this.alpha.mo1getIntrinsicSizeNHjbRc();
        boolean d4 = d(mo1getIntrinsicSizeNHjbRc);
        c0.b bVar = anVar.alpha;
        if (d4) {
            intBitsToFloat = Float.intBitsToFloat((int) (mo1getIntrinsicSizeNHjbRc >> 32));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (bVar.purple.oscar() >> 32));
        }
        if (c(mo1getIntrinsicSizeNHjbRc)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (mo1getIntrinsicSizeNHjbRc & 4294967295L));
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.purple.oscar() & 4294967295L));
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (bVar.purple.oscar() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.purple.oscar() & 4294967295L)) == 0.0f) {
            j5 = 0;
        } else {
            j5 = AbstractC2375K.juliet(floatToRawIntBits, this.silver.alpha(floatToRawIntBits, bVar.purple.oscar()));
        }
        long alpha = this.red.alpha((Math.round(Float.intBitsToFloat((int) (j5 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j5 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (bVar.purple.oscar() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bVar.purple.oscar() & 4294967295L))) & 4294967295L), anVar.getLayoutDirection());
        float f5 = (int) (alpha >> 32);
        float f10 = (int) (alpha & 4294967295L);
        ((ah) bVar.purple.alpha).red(f5, f10);
        try {
            this.alpha.m205drawx_KDEd0(anVar, j5, this.teal, this.white);
            ((ah) bVar.purple.alpha).red(-f5, -f10);
            anVar.charlie();
        } catch (Throwable th) {
            ((ah) bVar.purple.alpha).red(-f5, -f10);
            throw th;
        }
    }

    @Override // s0.ab
    public final int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (b()) {
            long e = e(Q0.b.bravo(i4, 0, 13));
            return Math.max(Q0.a.india(e), interfaceC2401t.delta(i4));
        }
        return interfaceC2401t.delta(i4);
    }

    @Override // s0.ab
    public final int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (b()) {
            long e = e(Q0.b.bravo(0, i4, 7));
            return Math.max(Q0.a.juliet(e), interfaceC2401t.romeo(i4));
        }
        return interfaceC2401t.romeo(i4);
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    public final aq mo0measure3p2s80s(ar arVar, ao aoVar, long j5) {
        AbstractC2367C victor = aoVar.victor(e(j5));
        return arVar.papa(victor.alpha, victor.purple, t.alpha, new k(victor, 1));
    }

    @Override // s0.ab
    public final int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (b()) {
            long e = e(Q0.b.bravo(i4, 0, 13));
            return Math.max(Q0.a.india(e), interfaceC2401t.jade(i4));
        }
        return interfaceC2401t.jade(i4);
    }

    @Override // s0.ab
    public final int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (b()) {
            long e = e(Q0.b.bravo(0, i4, 7));
            return Math.max(Q0.a.juliet(e), interfaceC2401t.lima(i4));
        }
        return interfaceC2401t.lima(i4);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.alpha + ", sizeToIntrinsics=" + this.purple + ", alignment=" + this.red + ", alpha=" + this.teal + ", colorFilter=" + this.white + ')';
    }
}
