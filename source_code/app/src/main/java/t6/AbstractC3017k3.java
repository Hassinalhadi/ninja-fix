package t6;

import af.AbstractC0436g;
import af.C0432c;
import af.C0433d;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.compose.LottieConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import xf.EnumC3340a;

/* renamed from: t6.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3017k3 {
    public static final void alpha(boolean z2, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-361453782);
        int i10 = i4 | 6;
        if (c0585q.india(function0)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        if (((i10 | i5) & 19) == 18 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            androidx.compose.runtime.ax black = C0564b.black(function0, c0585q);
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new C0433d(black);
                c0585q.f(jade);
            }
            C0433d c0433d = (C0433d) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new Xe.s(9, c0433d);
                c0585q.f(jade2);
            }
            C0564b.juliet((Function0) jade2, c0585q);
            ae.aj alpha = AbstractC0436g.alpha(c0585q);
            if (alpha != null) {
                ae.ai onBackPressedDispatcher = alpha.getOnBackPressedDispatcher();
                androidx.lifecycle.al alVar = (androidx.lifecycle.al) c0585q.kilo(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                boolean india = c0585q.india(onBackPressedDispatcher) | c0585q.india(alVar);
                Object jade3 = c0585q.jade();
                if (india || jade3 == asVar) {
                    jade3 = new C1.av(onBackPressedDispatcher, alVar, c0433d, 5);
                    c0585q.f(jade3);
                }
                C0564b.charlie(alVar, onBackPressedDispatcher, (Function1) jade3, c0585q);
                z2 = true;
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0432c(z2, function0, i4);
        }
    }

    public static xf.e bravo(int i4, int i5, EnumC3340a enumC3340a) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            enumC3340a = EnumC3340a.alpha;
        }
        if (i4 != -2) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != Integer.MAX_VALUE) {
                        if (enumC3340a == EnumC3340a.alpha) {
                            return new xf.e(i4);
                        }
                        return new xf.o(i4, enumC3340a);
                    }
                    return new xf.e(LottieConstants.IterateForever);
                }
                if (enumC3340a == EnumC3340a.alpha) {
                    return new xf.e(0);
                }
                return new xf.o(1, enumC3340a);
            }
            if (enumC3340a == EnumC3340a.alpha) {
                return new xf.o(1, EnumC3340a.purple);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (enumC3340a == EnumC3340a.alpha) {
            xf.i.pink.getClass();
            return new xf.e(xf.h.bravo);
        }
        return new xf.o(1, enumC3340a);
    }
}
