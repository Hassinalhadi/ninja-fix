package s6;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import j1.AbstractC1928b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.x7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2815x7 {
    public static final void alpha(int i4, T.p pVar, InterfaceC0581m interfaceC0581m, Function0 onClick) {
        boolean z2;
        T.p pVar2;
        P.d dVar = Cb.y.alpha;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2003844310);
        int i5 = i4 | 48;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            pVar2 = T.p.alpha;
            T.s charlie = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = ao.ad.xray(c0585q);
            }
            F.K1.charlie(androidx.compose.foundation.a.charlie(charlie, (InterfaceC1673j) jade, null, false, null, onClick, 28), Db.a.bravo, F.K1.lima(((F.O) c0585q.kilo(F.Q.alpha)).papa, c0585q, 0), F.K1.mike(0, 62), null, P.e.echo(1383974948, new Vc.d(9), c0585q), c0585q, 196656, 16);
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Lb.ag(onClick, pVar2, i4);
        }
    }

    public static int bravo(int i4, int i5) {
        return AbstractC1928b.delta(i4, (Color.alpha(i4) * i5) / 255);
    }

    public static int charlie(int i4, View view) {
        Context context = view.getContext();
        TypedValue delta = AbstractC2710m0.delta(view.getContext(), i4, view.getClass().getCanonicalName());
        int i5 = delta.resourceId;
        if (i5 != 0) {
            return context.getColor(i5);
        }
        return delta.data;
    }

    public static int delta(Context context, int i4, int i5) {
        Integer echo = echo(i4, context);
        if (echo != null) {
            return echo.intValue();
        }
        return i5;
    }

    public static Integer echo(int i4, Context context) {
        int i5;
        TypedValue bravo = AbstractC2710m0.bravo(i4, context);
        if (bravo != null) {
            int i10 = bravo.resourceId;
            if (i10 != 0) {
                i5 = context.getColor(i10);
            } else {
                i5 = bravo.data;
            }
            return Integer.valueOf(i5);
        }
        return null;
    }

    public static boolean foxtrot(int i4) {
        double pow;
        double pow2;
        double pow3;
        if (i4 != 0) {
            ThreadLocal threadLocal = AbstractC1928b.alpha;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i4);
            int green = Color.green(i4);
            int blue = Color.blue(i4);
            if (dArr.length == 3) {
                double d4 = red / 255.0d;
                if (d4 < 0.04045d) {
                    pow = d4 / 12.92d;
                } else {
                    pow = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
                }
                double d9 = green / 255.0d;
                if (d9 < 0.04045d) {
                    pow2 = d9 / 12.92d;
                } else {
                    pow2 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
                }
                double d10 = blue / 255.0d;
                if (d10 < 0.04045d) {
                    pow3 = d10 / 12.92d;
                } else {
                    pow3 = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d11 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d11;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d11 / 100.0d <= 0.5d) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        return false;
    }

    public static int golf(float f5, int i4, int i5) {
        return AbstractC1928b.bravo(AbstractC1928b.delta(i5, Math.round(Color.alpha(i5) * f5)), i4);
    }
}
