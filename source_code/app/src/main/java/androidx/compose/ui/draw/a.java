package androidx.compose.ui.draw;

import T.d;
import T.f;
import T.s;
import a0.AbstractC0367u;
import f0.AbstractC1680b;
import kotlin.jvm.functions.Function1;
import q0.InterfaceC2392k;

/* loaded from: classes3.dex */
public abstract class a {
    public static final s alpha(s sVar, Function1 function1) {
        return sVar.then(new DrawBehindElement(function1));
    }

    public static final s bravo(s sVar, Function1 function1) {
        return sVar.then(new DrawWithCacheElement(function1));
    }

    public static final s charlie(s sVar, Function1 function1) {
        return sVar.then(new DrawWithContentElement(function1));
    }

    public static s delta(s sVar, AbstractC1680b abstractC1680b, f fVar, InterfaceC2392k interfaceC2392k, float f5, AbstractC0367u abstractC0367u, int i4) {
        if ((i4 & 4) != 0) {
            fVar = d.teal;
        }
        f fVar2 = fVar;
        if ((i4 & 16) != 0) {
            f5 = 1.0f;
        }
        return sVar.then(new PainterElement(abstractC1680b, fVar2, interfaceC2392k, f5, abstractC0367u));
    }
}
