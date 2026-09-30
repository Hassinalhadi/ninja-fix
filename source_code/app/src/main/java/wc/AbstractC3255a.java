package wc;

import Ac.n;
import Cb.t;
import F.K1;
import F.Q1;
import Jb.C0201i;
import Xd.l;
import a0.C0366t;
import a2.C0391p;
import a4.s;
import af.C0437h;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.N;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ac;
import androidx.lifecycle.al;
import ao.ad;
import k5.C2015h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s.C2530i;
import sb.C2844c;
import t6.AbstractC3012j3;
import t6.T3;

/* renamed from: wc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3255a {
    public static final P.d alpha = new P.d(new ud.f(8), -668743275, false);
    public static final P.d bravo = new P.d(new ud.f(9), -379396394, false);
    public static final P.d charlie = new P.d(new ud.f(10), 1718005632, false);
    public static final P.d delta = new P.d(new Vc.d(14), -914787643, false);
    public static final P.d echo = new P.d(new Vc.d(15), 1379867816, false);
    public static final P.d foxtrot = new P.d(new Vc.d(16), -389603798, false);
    public static final P.d golf = new P.d(new ud.f(11), -503058833, false);
    public static final P.d hotel = new P.d(new ud.f(12), -1387794640, false);

    public static final void alpha(l onScanned, Function0 onClose, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        s sVar;
        Object eVar;
        ax axVar;
        ax axVar2;
        Context context;
        Intrinsics.echo(onScanned, "onScanned");
        Intrinsics.echo(onClose, "onClose");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2137951970);
        if (c0585q.india(onScanned)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.india(onClose)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            Context context2 = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            boolean golf2 = c0585q.golf(context2);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (golf2 || jade == asVar) {
                Context context3 = context2;
                while (true) {
                    if (context3 instanceof Activity) {
                        jade = (Activity) context3;
                        break;
                    } else if (context3 instanceof ContextWrapper) {
                        context3 = ((ContextWrapper) context3).getBaseContext();
                        Intrinsics.delta(context3, "getBaseContext(...)");
                    } else {
                        jade = null;
                        break;
                    }
                }
                c0585q.f(jade);
            }
            Activity activity = (Activity) jade;
            N n5 = R1.e.alpha;
            ac lifecycle = ((al) c0585q.kilo(n5)).getLifecycle();
            Object[] objArr = new Object[0];
            boolean india = c0585q.india(context2);
            Object jade2 = c0585q.jade();
            if (india || jade2 == asVar) {
                jade2 = new C0201i(context2, 6);
                c0585q.f(jade2);
            }
            ax axVar3 = (ax) R.l.echo(objArr, (Function0) jade2, c0585q, 0);
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = C0564b.zulu(Boolean.FALSE);
                c0585q.f(jade3);
            }
            ax axVar4 = (ax) jade3;
            Object[] objArr2 = new Object[0];
            Object jade4 = c0585q.jade();
            if (jade4 == asVar) {
                jade4 = new C2844c(12);
                c0585q.f(jade4);
            }
            ax axVar5 = (ax) R.l.echo(objArr2, (Function0) jade4, c0585q, 48);
            Object jade5 = c0585q.jade();
            if (jade5 == asVar) {
                jade5 = C0564b.zulu(Boolean.FALSE);
                c0585q.f(jade5);
            }
            ax axVar6 = (ax) jade5;
            s sVar2 = new s(4);
            boolean golf3 = c0585q.golf(axVar3) | c0585q.india(activity) | c0585q.india(context2);
            Object jade6 = c0585q.jade();
            if (golf3 || jade6 == asVar) {
                sVar = sVar2;
                eVar = new X9.e(activity, context2, axVar3, axVar4, 12);
                c0585q.f(eVar);
            } else {
                eVar = jade6;
                sVar = sVar2;
            }
            C0437h charlie2 = AbstractC3012j3.charlie(sVar, (Function1) eVar, c0585q);
            Unit unit = Unit.INSTANCE;
            boolean golf4 = c0585q.golf(axVar3) | c0585q.india(charlie2);
            Object jade7 = c0585q.jade();
            if (golf4 || jade7 == asVar) {
                jade7 = new C3262h(charlie2, axVar3, null);
                c0585q.f(jade7);
            }
            C0564b.foxtrot((l) jade7, c0585q, unit);
            boolean india2 = c0585q.india(context2) | c0585q.golf(axVar3) | c0585q.golf(axVar5) | c0585q.india(lifecycle);
            Object jade8 = c0585q.jade();
            if (!india2 && jade8 != asVar) {
                axVar = axVar5;
                axVar2 = axVar4;
                context = context2;
            } else {
                axVar = axVar5;
                axVar2 = axVar4;
                jade8 = new X9.e(lifecycle, context2, axVar3, axVar, 13);
                context = context2;
                c0585q.f(jade8);
            }
            C0564b.delta(lifecycle, (Function1) jade8, c0585q);
            boolean india3 = c0585q.india(context);
            Object jade9 = c0585q.jade();
            if (india3 || jade9 == asVar) {
                jade9 = new C0391p(context, 1);
                c0585q.f(jade9);
            }
            Function1 onError = (Function1) jade9;
            Intrinsics.echo(onError, "onError");
            Context context4 = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            al alVar = (al) c0585q.kilo(n5);
            boolean golf5 = c0585q.golf(alVar);
            Object jade10 = c0585q.jade();
            if (golf5 || jade10 == asVar) {
                jade10 = new C3257c(context4, alVar, onScanned, onError);
                c0585q.f(jade10);
            }
            C3257c c3257c = (C3257c) jade10;
            boolean india4 = c0585q.india(c3257c);
            Object jade11 = c0585q.jade();
            if (india4 || jade11 == asVar) {
                jade11 = new C3256b(c3257c, 1);
                c0585q.f(jade11);
            }
            C0564b.delta(c3257c, (Function1) jade11, c0585q);
            ax axVar7 = axVar;
            long j5 = C0366t.bravo;
            ax axVar8 = axVar2;
            P.d echo2 = P.e.echo(-1845431590, new Ac.h(onClose, c3257c, axVar3, axVar6, 14), c0585q);
            P.d echo3 = P.e.echo(1312325615, new C3260f(c3257c, axVar3, charlie2, 1), c0585q);
            Context context5 = context;
            Q1.alpha(null, echo2, null, null, null, 0, j5, 0L, null, echo3, c0585q, 806879280, 445);
            c0585q = c0585q;
            if (((Boolean) axVar8.getValue()).booleanValue()) {
                c0585q.purple(-1649042877);
                Object jade12 = c0585q.jade();
                if (jade12 == asVar) {
                    jade12 = new C2530i(axVar8, 6);
                    c0585q.f(jade12);
                }
                K1.alpha((Function0) jade12, P.e.echo(-1259082901, new n(axVar7, context5, axVar8, 17), c0585q), null, P.e.echo(1266412781, new t(axVar8, 7), c0585q), null, golf, hotel, null, 0L, 0L, 0L, 0L, 0.0f, null, c0585q, 1772598, 16276);
                c0585q = c0585q;
            } else {
                c0585q.purple(-1660705852);
            }
            c0585q.quebec(false);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2015h(i4, 6, onScanned, onClose);
        }
    }

    public static final void bravo(final float f5, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2073906766);
        if (c0585q.delta(f5)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        boolean z10 = true;
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            final float f10 = 39;
            final float f11 = 4;
            final long bravo2 = C0366t.bravo(0.47f, C0366t.bravo);
            T.s charlie2 = androidx.compose.ui.graphics.a.charlie(sVar, 0.0f, 0.0f, 0.0f, null, 458751);
            if ((i10 & 14) != 4) {
                z10 = false;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new Function1() { // from class: wc.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        c0.d Canvas = (c0.d) obj;
                        Intrinsics.echo(Canvas, "$this$Canvas");
                        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.bravo() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.bravo() & 4294967295L));
                        float lavender = Canvas.lavender(f5);
                        float f12 = (intBitsToFloat - lavender) / 2.0f;
                        float f13 = (intBitsToFloat2 - lavender) / 2.0f;
                        float f14 = f12 + lavender;
                        float f15 = f13 + lavender;
                        ad.november(Canvas, bravo2, 0L, Canvas.bravo(), 0.0f, null, 122);
                        ad.november(Canvas, C0366t.juliet, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(lavender) << 32) | (Float.floatToRawIntBits(lavender) & 4294967295L), 0.0f, null, 56);
                        float lavender2 = Canvas.lavender(f10);
                        float lavender3 = Canvas.lavender(f11);
                        long j5 = C0366t.echo;
                        float f16 = f12 + lavender2;
                        ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), lavender3, 1, 480);
                        float f17 = f13 + lavender2;
                        ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L), lavender3, 1, 480);
                        float f18 = f14 - lavender2;
                        ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), lavender3, 1, 480);
                        ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L), lavender3, 1, 480);
                        float f19 = f15 - lavender2;
                        ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L), (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), lavender3, 1, 480);
                        ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), (Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), lavender3, 1, 480);
                        ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), lavender3, 1, 480);
                        ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L), (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), lavender3, 1, 480);
                        return Unit.INSTANCE;
                    }
                };
                c0585q.f(jade);
            }
            T3.alpha(charlie2, (Function1) jade, c0585q, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Sb.b(f5, i4, 2, sVar);
        }
    }
}
