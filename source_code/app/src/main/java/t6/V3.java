package t6;

import T.s;
import a0.C0366t;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import s6.J4;
import t6.V3;
import xb.AbstractC3318b;
import xb.C3321e;
import zb.AbstractC3502e;
import zb.C3504g;

/* loaded from: classes2.dex */
public abstract class V3 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final C3504g stats, final T.s sVar, C2093f c2093f, long j5, long j6, long j7, long j10, long j11, float f5, long j12, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        C2093f c2093f2;
        int i10;
        long j13;
        int i11;
        long j14;
        int i12;
        char c3;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        C0585q c0585q;
        final long j15;
        final C2093f c2093f3;
        final long j16;
        final long j17;
        final long j18;
        final long j19;
        final float f11;
        final long j20;
        androidx.compose.runtime.Q uniform;
        long j21;
        long j22;
        int i18;
        long j23;
        C2093f c2093f4;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        float f12;
        char c4;
        char c10;
        char c11;
        int i19;
        long j30;
        long j31;
        C2093f c2093f5;
        long j32;
        Intrinsics.echo(stats, "stats");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1380413194);
        int i20 = i4 | (c0585q2.golf(stats) ? 4 : 2);
        int i21 = 4 & i5;
        if (i21 != 0) {
            i10 = i20 | 384;
            c2093f2 = c2093f;
        } else {
            c2093f2 = c2093f;
            i10 = i20 | (c0585q2.golf(c2093f2) ? Barcode.FORMAT_QR_CODE : 128);
        }
        if ((i5 & 8) == 0) {
            j13 = j5;
            if (c0585q2.foxtrot(j13)) {
                i11 = 2048;
                int i22 = i10 | i11;
                if ((i5 & 16) != 0) {
                    j14 = j6;
                    if (c0585q2.foxtrot(j14)) {
                        i12 = Http2.INITIAL_MAX_FRAME_SIZE;
                        int i23 = i22 | i12;
                        if ((i5 & 32) == 0) {
                            c3 = 2;
                            if (c0585q2.foxtrot(j7)) {
                                i13 = 131072;
                                int i24 = (((i5 & 128) == 0 || !c0585q2.foxtrot(j11)) ? 4194304 : 8388608) | i23 | i13 | (((i5 & 64) == 0 || !c0585q2.foxtrot(j10)) ? 524288 : 1048576);
                                i14 = 256 & i5;
                                if (i14 == 0) {
                                    i15 = i24 | 100663296;
                                    f10 = f5;
                                } else {
                                    f10 = f5;
                                    i15 = i24 | (c0585q2.delta(f10) ? 67108864 : 33554432);
                                }
                                i16 = i5 & 512;
                                if (i16 == 0) {
                                    i17 = i15 | 805306368;
                                } else {
                                    i17 = i15 | (c0585q2.foxtrot(j12) ? 536870912 : 268435456);
                                }
                                if (!c0585q2.magenta(i17 & 1, (i17 & 306783379) == 306783378)) {
                                    c0585q2.orange();
                                    if ((i4 & 1) != 0 && !c0585q2.beige()) {
                                        c0585q2.ochre();
                                        if ((i5 & 8) != 0) {
                                            i17 &= -7169;
                                        }
                                        if ((i5 & 16) != 0) {
                                            i17 &= -57345;
                                        }
                                        if ((i5 & 32) != 0) {
                                            i17 &= -458753;
                                        }
                                        if ((i5 & 64) != 0) {
                                            i17 &= -3670017;
                                        }
                                        if ((128 & i5) != 0) {
                                            i17 &= -29360129;
                                        }
                                        j28 = j10;
                                        j27 = j12;
                                        j29 = j11;
                                        f12 = f10;
                                        c4 = c3;
                                        c10 = 0;
                                        c11 = 1;
                                        i19 = 3;
                                        j30 = j7;
                                        j31 = j14;
                                        j32 = j13;
                                        c2093f5 = c2093f2;
                                    } else {
                                        C2093f c2093f6 = i21 != 0 ? AbstractC3502e.alpha : c2093f2;
                                        if ((i5 & 8) != 0) {
                                            j21 = ((F.O) c0585q2.kilo(F.Q.alpha)).papa;
                                            i17 &= -7169;
                                        } else {
                                            j21 = j13;
                                        }
                                        if ((i5 & 16) != 0) {
                                            j22 = ((F.O) c0585q2.kilo(F.Q.alpha)).azure;
                                            i17 &= -57345;
                                        } else {
                                            j22 = j14;
                                        }
                                        if ((i5 & 32) != 0) {
                                            i18 = -29360129;
                                            j23 = C0366t.bravo(0.3f, ((F.O) c0585q2.kilo(F.Q.alpha)).azure);
                                            i17 &= -458753;
                                        } else {
                                            i18 = -29360129;
                                            j23 = j7;
                                        }
                                        if ((i5 & 64) != 0) {
                                            c2093f4 = c2093f6;
                                            j24 = j23;
                                            j25 = ((F.O) c0585q2.kilo(F.Q.alpha)).oscar;
                                            i17 &= -3670017;
                                        } else {
                                            c2093f4 = c2093f6;
                                            j24 = j23;
                                            j25 = j10;
                                        }
                                        if ((128 & i5) != 0) {
                                            j26 = C0366t.bravo(0.5f, ((F.O) c0585q2.kilo(F.Q.alpha)).azure);
                                            i17 &= i18;
                                        } else {
                                            j26 = j11;
                                        }
                                        float f13 = i14 != 0 ? 44 : f10;
                                        if (i16 != 0) {
                                            j29 = j26;
                                            f12 = f13;
                                            c10 = 0;
                                            j27 = a0.ao.charlie(251658240);
                                            i19 = 3;
                                            j28 = j25;
                                            c4 = c3;
                                            c11 = 1;
                                        } else {
                                            j27 = j12;
                                            j28 = j25;
                                            j29 = j26;
                                            f12 = f13;
                                            c4 = c3;
                                            c10 = 0;
                                            c11 = 1;
                                            i19 = 3;
                                        }
                                        j30 = j24;
                                        j31 = j22;
                                        c2093f5 = c2093f4;
                                        j32 = j21;
                                    }
                                    c0585q2.romeo();
                                    C3321e c3321e = new C3321e(stats.alpha, stats.bravo);
                                    C3321e c3321e2 = new C3321e(stats.charlie, stats.delta);
                                    C3321e c3321e3 = new C3321e(stats.echo, stats.foxtrot);
                                    C3321e[] c3321eArr = new C3321e[i19];
                                    c3321eArr[c10] = c3321e;
                                    c3321eArr[c11] = c3321e2;
                                    c3321eArr[c4] = c3321e3;
                                    c0585q = c0585q2;
                                    AbstractC3318b.golf(CollectionsKt.listOf(c3321eArr), Float.valueOf(J4.charlie(stats.golf, 0.0f, 1.0f)), sVar, c2093f5, j32, j31, j30, j28, j29, f12, j27, 0.0f, 0.0f, 0.0f, 0.0f, c0585q, (i17 << 3) & 2147483520, (i17 >> 27) & 14, 30720);
                                    c2093f3 = c2093f5;
                                    j16 = j32;
                                    j17 = j31;
                                    j15 = j30;
                                    j20 = j28;
                                    j18 = j29;
                                    f11 = f12;
                                    j19 = j27;
                                } else {
                                    c0585q = c0585q2;
                                    c0585q.ochre();
                                    j15 = j7;
                                    c2093f3 = c2093f2;
                                    j16 = j13;
                                    j17 = j14;
                                    j18 = j11;
                                    j19 = j12;
                                    f11 = f10;
                                    j20 = j10;
                                }
                                uniform = c0585q.uniform();
                                if (uniform == null) {
                                    uniform.delta = new Xd.l(sVar, c2093f3, j16, j17, j15, j20, j18, f11, j19, i4, i5) { // from class: zb.h

                                        /* renamed from: a, reason: collision with root package name */
                                        public final /* synthetic */ long f14199a;

                                        /* renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ float f14200b;

                                        /* renamed from: c, reason: collision with root package name */
                                        public final /* synthetic */ long f14201c;

                                        /* renamed from: d, reason: collision with root package name */
                                        public final /* synthetic */ int f14202d;
                                        public final /* synthetic */ s purple;
                                        public final /* synthetic */ C2093f red;
                                        public final /* synthetic */ long silver;
                                        public final /* synthetic */ long teal;
                                        public final /* synthetic */ long white;
                                        public final /* synthetic */ long yellow;

                                        {
                                            this.f14202d = i5;
                                        }

                                        @Override // Xd.l
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int cyan = C0564b.cyan(49);
                                            long j33 = this.f14201c;
                                            int i25 = this.f14202d;
                                            V3.alpha(C3504g.this, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f14199a, this.f14200b, j33, (InterfaceC0581m) obj, cyan, i25);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                        } else {
                            c3 = 2;
                        }
                        i13 = 65536;
                        int i242 = (((i5 & 128) == 0 || !c0585q2.foxtrot(j11)) ? 4194304 : 8388608) | i23 | i13 | (((i5 & 64) == 0 || !c0585q2.foxtrot(j10)) ? 524288 : 1048576);
                        i14 = 256 & i5;
                        if (i14 == 0) {
                        }
                        i16 = i5 & 512;
                        if (i16 == 0) {
                        }
                        if (!c0585q2.magenta(i17 & 1, (i17 & 306783379) == 306783378)) {
                        }
                        uniform = c0585q.uniform();
                        if (uniform == null) {
                        }
                    }
                } else {
                    j14 = j6;
                }
                i12 = 8192;
                int i232 = i22 | i12;
                if ((i5 & 32) == 0) {
                }
                i13 = 65536;
                int i2422 = (((i5 & 128) == 0 || !c0585q2.foxtrot(j11)) ? 4194304 : 8388608) | i232 | i13 | (((i5 & 64) == 0 || !c0585q2.foxtrot(j10)) ? 524288 : 1048576);
                i14 = 256 & i5;
                if (i14 == 0) {
                }
                i16 = i5 & 512;
                if (i16 == 0) {
                }
                if (!c0585q2.magenta(i17 & 1, (i17 & 306783379) == 306783378)) {
                }
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
        } else {
            j13 = j5;
        }
        i11 = Barcode.FORMAT_UPC_E;
        int i222 = i10 | i11;
        if ((i5 & 16) != 0) {
        }
        i12 = 8192;
        int i2322 = i222 | i12;
        if ((i5 & 32) == 0) {
        }
        i13 = 65536;
        int i24222 = (((i5 & 128) == 0 || !c0585q2.foxtrot(j11)) ? 4194304 : 8388608) | i2322 | i13 | (((i5 & 64) == 0 || !c0585q2.foxtrot(j10)) ? 524288 : 1048576);
        i14 = 256 & i5;
        if (i14 == 0) {
        }
        i16 = i5 & 512;
        if (i16 == 0) {
        }
        if (!c0585q2.magenta(i17 & 1, (i17 & 306783379) == 306783378)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static float bravo(EdgeEffect edgeEffect, float f5, float f10, Q0.d dVar) {
        float f11;
        float f12 = b.an.alpha;
        double alpha = dVar.alpha() * 386.0878f * 160.0f * 0.84f;
        double d4 = b.an.alpha * alpha;
        float exp = (float) (Math.exp((b.an.bravo / b.an.charlie) * Math.log((Math.abs(f5) * 0.35f) / d4)) * d4);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            f11 = E2.f.bravo(edgeEffect);
        } else {
            f11 = 0.0f;
        }
        if (exp > f11 * f10) {
            return 0.0f;
        }
        int delta = Zd.a.delta(f5);
        if (i4 >= 31) {
            edgeEffect.onAbsorb(delta);
            return f5;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(delta);
        }
        return f5;
    }
}
