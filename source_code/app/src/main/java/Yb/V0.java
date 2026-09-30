package Yb;

import F.G2;
import F.S2;
import F.T2;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.OrderTask;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import java.util.Arrays;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import q0.AbstractC2367C;
import q0.AbstractC2375K;
import q0.InterfaceC2380P;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.J4;
import t6.AbstractC3071v3;

/* loaded from: classes2.dex */
public abstract class V0 {
    public static final float alpha = 8;
    public static final float bravo = 4;
    public static final long charlie = a0.ao.delta(4293256677L);

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0121, code lost:
    
        if (r11 < 0) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final OrderTask task, T.s sVar, final Long l10, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        int i10;
        boolean z2;
        final T.s sVar2;
        long j5;
        Long l11;
        Long l12;
        long j6;
        Integer etaInSeconds;
        long intValue;
        Long l13;
        int i11;
        final int i12;
        long alpha2;
        Intrinsics.echo(task, "task");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1303283332);
        if (c0585q.india(task)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5 | 48;
        if (c0585q.golf(l10)) {
            i10 = Barcode.FORMAT_QR_CODE;
        } else {
            i10 = 128;
        }
        int i14 = i13 | i10;
        if ((i14 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            sVar2 = T.p.alpha;
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (l10 == null) {
                c0585q.purple(-390390886);
                boolean golf = c0585q.golf(task.getId()) | c0585q.golf(task.getRemainingHandShakeSeconds());
                Object jade = c0585q.jade();
                if (!golf && jade != asVar) {
                    j5 = 1000;
                } else {
                    Integer remainingHandShakeSeconds = task.getRemainingHandShakeSeconds();
                    if (remainingHandShakeSeconds != null) {
                        if (remainingHandShakeSeconds.intValue() <= 0) {
                            remainingHandShakeSeconds = null;
                        }
                        if (remainingHandShakeSeconds != null) {
                            j5 = 1000;
                            jade = Long.valueOf((remainingHandShakeSeconds.intValue() * 1000) + System.currentTimeMillis());
                            c0585q.f(jade);
                        }
                    }
                    j5 = 1000;
                    jade = null;
                    c0585q.f(jade);
                }
                l11 = (Long) jade;
                c0585q.quebec(false);
            } else {
                j5 = 1000;
                c0585q.purple(-1675162542);
                c0585q.quebec(false);
                l11 = l10;
            }
            Integer id2 = task.getId();
            Date startedAt = task.getStartedAt();
            if (startedAt != null) {
                l12 = Long.valueOf(startedAt.getTime());
            } else {
                l12 = null;
            }
            boolean golf2 = c0585q.golf(l11) | c0585q.golf(id2) | c0585q.golf(l12) | c0585q.golf(task.getRemainingHandShakeSeconds()) | c0585q.golf(task.getEtaInSeconds());
            Object jade2 = c0585q.jade();
            if (golf2 || jade2 == asVar) {
                if (l11 != null) {
                    j6 = 0;
                    long longValue = (l11.longValue() - System.currentTimeMillis()) / 1000;
                    if (longValue >= 0) {
                        intValue = longValue;
                        jade2 = C0564b.whiskey((int) intValue);
                        c0585q.f(jade2);
                    }
                    intValue = j6;
                    jade2 = C0564b.whiskey((int) intValue);
                    c0585q.f(jade2);
                } else {
                    j6 = 0;
                    Date startedAt2 = task.getStartedAt();
                    if (startedAt2 != null && (etaInSeconds = task.getEtaInSeconds()) != null) {
                        intValue = (((etaInSeconds.intValue() * j5) + startedAt2.getTime()) - System.currentTimeMillis()) / 1000;
                    }
                    intValue = j6;
                    jade2 = C0564b.whiskey((int) intValue);
                    c0585q.f(jade2);
                }
            }
            androidx.compose.runtime.p0 p0Var = (androidx.compose.runtime.p0) jade2;
            Integer id3 = task.getId();
            Date startedAt3 = task.getStartedAt();
            if (startedAt3 != null) {
                l13 = Long.valueOf(startedAt3.getTime());
            } else {
                l13 = null;
            }
            Object[] objArr = {id3, l13, task.getRemainingHandShakeSeconds(), task.getEtaInSeconds(), l10};
            boolean golf3 = c0585q.golf(p0Var) | c0585q.india(task) | c0585q.golf(l11);
            Object jade3 = c0585q.jade();
            if (golf3 || jade3 == asVar) {
                jade3 = new U0(task, l11, p0Var, null);
                c0585q.f(jade3);
            }
            C0564b.india(objArr, (Xd.l) jade3, c0585q);
            if (!task.showTimer()) {
                androidx.compose.runtime.Q uniform = c0585q.uniform();
                if (uniform != null) {
                    final int i15 = 0;
                    uniform.delta = new Xd.l(task, sVar2, l10, i4, i15) { // from class: Yb.Q0
                        public final /* synthetic */ int alpha;
                        public final /* synthetic */ OrderTask purple;
                        public final /* synthetic */ T.s red;
                        public final /* synthetic */ Long silver;

                        {
                            this.alpha = i15;
                        }

                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            int i16 = this.alpha;
                            InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                            ((Integer) obj2).getClass();
                            switch (i16) {
                                case 0:
                                    int cyan = C0564b.cyan(1);
                                    V0.alpha(this.purple, this.red, this.silver, interfaceC0581m2, cyan);
                                    return Unit.INSTANCE;
                                default:
                                    int cyan2 = C0564b.cyan(1);
                                    V0.alpha(this.purple, this.red, this.silver, interfaceC0581m2, cyan2);
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            Integer etaInSeconds2 = task.getEtaInSeconds();
            if (etaInSeconds2 != null || (etaInSeconds2 = task.getRemainingHandShakeSeconds()) != null) {
                i11 = etaInSeconds2.intValue();
            } else {
                i11 = 1;
            }
            int juliet = p0Var.juliet();
            if (juliet < 0) {
                i12 = 0;
            } else {
                i12 = juliet;
            }
            float f5 = 1.0f;
            if (i11 > 0) {
                f5 = J4.charlie((i11 - i12) / i11, 0.0f, 1.0f);
            }
            final float f10 = f5;
            if (i12 > 0) {
                c0585q.purple(-1675129275);
                alpha2 = AbstractC3071v3.alpha(c0585q, R.color.colorGreen);
            } else {
                c0585q.purple(-1675128029);
                alpha2 = AbstractC3071v3.alpha(c0585q, R.color.colorRed);
            }
            c0585q.quebec(false);
            final long j7 = alpha2;
            final C2093f bravo2 = AbstractC2094g.bravo(alpha / 2);
            T.s tango = androidx.compose.foundation.layout.V.tango(sVar2, 2);
            boolean echo = c0585q.echo(i12) | c0585q.foxtrot(j7) | c0585q.golf(bravo2) | c0585q.delta(f10);
            Object jade4 = c0585q.jade();
            if (echo || jade4 == asVar) {
                Xd.l lVar = new Xd.l() { // from class: Yb.R0
                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z10;
                        InterfaceC2380P SubcomposeLayout = (InterfaceC2380P) obj;
                        Intrinsics.echo(SubcomposeLayout, "$this$SubcomposeLayout");
                        final int i16 = i12;
                        final long j10 = j7;
                        boolean z11 = true;
                        AbstractC2367C victor = ((q0.ao) CollectionsKt.gold(SubcomposeLayout.pink(Constants.KEY_TEXT, new P.d(new Xd.l() { // from class: Yb.S0
                            @Override // Xd.l
                            public final Object invoke(Object obj3, Object obj4) {
                                boolean z12;
                                String format;
                                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if ((intValue2 & 3) != 2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                                if (c0585q2.magenta(intValue2 & 1, z12)) {
                                    int i17 = i16;
                                    if (i17 >= 3600) {
                                        if (i17 < 0) {
                                            i17 = 0;
                                        }
                                        format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i17 / 3600), Integer.valueOf((i17 % 3600) / 60), Integer.valueOf(i17 % 60)}, 3));
                                    } else {
                                        format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i17 / 60), Integer.valueOf(i17 % 60)}, 2));
                                    }
                                    G2.bravo(format, null, j10, 0L, H0.v.f1409c, null, 0L, new O0.k(6), 0L, 0, false, 0, 0, null, ((S2) c0585q2.kilo(T2.alpha)).foxtrot, c0585q2, 196608, 0, 64986);
                                } else {
                                    c0585q2.ochre();
                                }
                                return Unit.INSTANCE;
                            }
                        }, 982104252, true)))).victor(((Q0.a) obj2).alpha);
                        int i17 = victor.alpha;
                        int ochre = SubcomposeLayout.ochre(V0.alpha);
                        int ochre2 = SubcomposeLayout.ochre(V0.bravo);
                        final C2093f c2093f = bravo2;
                        final float f11 = f10;
                        q0.ao aoVar = (q0.ao) CollectionsKt.gold(SubcomposeLayout.pink("bar", new P.d(new Xd.l() { // from class: Yb.T0
                            @Override // Xd.l
                            public final Object invoke(Object obj3, Object obj4) {
                                boolean z12;
                                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if ((intValue2 & 3) != 2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                                if (c0585q2.magenta(intValue2 & 1, z12)) {
                                    T.p pVar = T.p.alpha;
                                    C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
                                    long j11 = c0585q2.magenta;
                                    int i18 = (int) (j11 ^ (j11 >>> 32));
                                    androidx.compose.runtime.I mike = c0585q2.mike();
                                    T.s charlie2 = T.a.charlie(pVar, c0585q2);
                                    InterfaceC2552l.maroon.getClass();
                                    C2550j c2550j = C2551k.bravo;
                                    c0585q2.white();
                                    if (c0585q2.lime) {
                                        c0585q2.lima(c2550j);
                                    } else {
                                        c0585q2.i();
                                    }
                                    C2549i c2549i = C2551k.foxtrot;
                                    C0564b.blue(c2549i, c0585q2, alpha3);
                                    C2549i c2549i2 = C2551k.echo;
                                    C0564b.blue(c2549i2, c0585q2, mike);
                                    C2549i c2549i3 = C2551k.golf;
                                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i18))) {
                                        ao.ad.blue(i18, c0585q2, i18, c2549i3);
                                    }
                                    C2549i c2549i4 = C2551k.delta;
                                    C0564b.blue(c2549i4, c0585q2, charlie2);
                                    T.s echo2 = androidx.compose.foundation.layout.V.echo(com.google.android.material.datepicker.j.hotel(pVar, V0.bravo, c0585q2, pVar, 1.0f), V0.alpha);
                                    long j12 = V0.charlie;
                                    C2093f c2093f2 = C2093f.this;
                                    T.s bravo3 = androidx.compose.foundation.a.bravo(echo2, j12, c2093f2);
                                    q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
                                    long j13 = c0585q2.magenta;
                                    int i19 = (int) (j13 ^ (j13 >>> 32));
                                    androidx.compose.runtime.I mike2 = c0585q2.mike();
                                    T.s charlie3 = T.a.charlie(bravo3, c0585q2);
                                    c0585q2.white();
                                    if (c0585q2.lime) {
                                        c0585q2.lima(c2550j);
                                    } else {
                                        c0585q2.i();
                                    }
                                    C0564b.blue(c2549i, c0585q2, delta);
                                    C0564b.blue(c2549i2, c0585q2, mike2);
                                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i19))) {
                                        ao.ad.blue(i19, c0585q2, i19, c2549i3);
                                    }
                                    C0564b.blue(c2549i4, c0585q2, charlie3);
                                    AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.charlie(pVar, J4.charlie(f11, 0.0f, 1.0f)).then(androidx.compose.foundation.layout.V.bravo), j10, c2093f2), c0585q2, 0);
                                    c0585q2.quebec(true);
                                    c0585q2.quebec(true);
                                } else {
                                    c0585q2.ochre();
                                }
                                return Unit.INSTANCE;
                            }
                        }, 450353393, true)));
                        int i18 = ochre + ochre2;
                        if (i17 >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i18 < 0) {
                            z11 = false;
                        }
                        if (!(z10 & z11)) {
                            Q0.j.alpha("width and height must be >= 0");
                        }
                        AbstractC2367C victor2 = aoVar.victor(Q0.b.hotel(i17, i17, i18, i18));
                        return SubcomposeLayout.papa(victor.alpha, victor.purple + victor2.purple, kotlin.collections.t.alpha, new Cb.ad(26, victor, victor2));
                    }
                };
                c0585q.f(lVar);
                jade4 = lVar;
            }
            AbstractC2375K.alpha(tango, (Xd.l) jade4, c0585q, 0, 0);
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            final int i16 = 1;
            uniform2.delta = new Xd.l(task, sVar2, l10, i4, i16) { // from class: Yb.Q0
                public final /* synthetic */ int alpha;
                public final /* synthetic */ OrderTask purple;
                public final /* synthetic */ T.s red;
                public final /* synthetic */ Long silver;

                {
                    this.alpha = i16;
                }

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    int i162 = this.alpha;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                    ((Integer) obj2).getClass();
                    switch (i162) {
                        case 0:
                            int cyan = C0564b.cyan(1);
                            V0.alpha(this.purple, this.red, this.silver, interfaceC0581m2, cyan);
                            return Unit.INSTANCE;
                        default:
                            int cyan2 = C0564b.cyan(1);
                            V0.alpha(this.purple, this.red, this.silver, interfaceC0581m2, cyan2);
                            return Unit.INSTANCE;
                    }
                }
            };
        }
    }
}
