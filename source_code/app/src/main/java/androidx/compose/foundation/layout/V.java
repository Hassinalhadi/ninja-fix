package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import t0.AbstractC2911e0;

/* loaded from: classes3.dex */
public abstract class V {
    public static final FillElement alpha;
    public static final FillElement bravo;
    public static final FillElement charlie;
    public static final WrapContentElement delta;
    public static final WrapContentElement echo;
    public static final WrapContentElement foxtrot;
    public static final WrapContentElement golf;
    public static final WrapContentElement hotel;
    public static final WrapContentElement india;

    static {
        aa aaVar = aa.purple;
        alpha = new FillElement(aaVar, 1.0f, "fillMaxWidth");
        aa aaVar2 = aa.alpha;
        bravo = new FillElement(aaVar2, 1.0f, "fillMaxHeight");
        aa aaVar3 = aa.red;
        charlie = new FillElement(aaVar3, 1.0f, "fillMaxSize");
        T.i iVar = T.d.f2063g;
        delta = new WrapContentElement(aaVar, new Ac.k(25, iVar), iVar, "wrapContentWidth");
        T.i iVar2 = T.d.f2062f;
        echo = new WrapContentElement(aaVar, new Ac.k(25, iVar2), iVar2, "wrapContentWidth");
        T.j jVar = T.d.f2061d;
        foxtrot = new WrapContentElement(aaVar2, new C0536b(jVar, 1), jVar, "wrapContentHeight");
        T.j jVar2 = T.d.f2060c;
        golf = new WrapContentElement(aaVar2, new C0536b(jVar2, 1), jVar2, "wrapContentHeight");
        T.k kVar = T.d.teal;
        hotel = new WrapContentElement(aaVar3, new Ac.k(26, kVar), kVar, "wrapContentSize");
        T.k kVar2 = T.d.alpha;
        india = new WrapContentElement(aaVar3, new Ac.k(26, kVar2), kVar2, "wrapContentSize");
    }

    public static final T.s alpha(T.s sVar, float f5, float f10) {
        return sVar.then(new UnspecifiedConstraintsElement(f5, f10));
    }

    public static /* synthetic */ T.s bravo(T.s sVar, float f5, float f10, int i4) {
        if ((i4 & 1) != 0) {
            f5 = Float.NaN;
        }
        if ((i4 & 2) != 0) {
            f10 = Float.NaN;
        }
        return alpha(sVar, f5, f10);
    }

    public static final T.s charlie(T.s sVar, float f5) {
        FillElement fillElement;
        if (f5 == 1.0f) {
            fillElement = alpha;
        } else {
            fillElement = new FillElement(aa.purple, f5, "fillMaxWidth");
        }
        return sVar.then(fillElement);
    }

    public static final T.s echo(T.s sVar, float f5) {
        return sVar.then(new SizeElement(0.0f, f5, 0.0f, f5, AbstractC2911e0.alpha, 5));
    }

    public static final T.s foxtrot(T.s sVar, float f5, float f10) {
        return sVar.then(new SizeElement(0.0f, f5, 0.0f, f10, AbstractC2911e0.alpha, 5));
    }

    public static /* synthetic */ T.s golf(T.s sVar, float f5, float f10, int i4) {
        if ((i4 & 1) != 0) {
            f5 = Float.NaN;
        }
        if ((i4 & 2) != 0) {
            f10 = Float.NaN;
        }
        return foxtrot(sVar, f5, f10);
    }

    public static final T.s hotel(T.s sVar, float f5) {
        return sVar.then(new SizeElement(f5, f5, f5, f5, false, AbstractC2911e0.alpha));
    }

    public static final T.s india(T.s sVar, float f5, float f10) {
        return sVar.then(new SizeElement(f5, f10, f5, f10, false, AbstractC2911e0.alpha));
    }

    public static T.s juliet(T.s sVar, float f5, float f10, float f11, float f12, int i4) {
        float f13;
        float f14;
        float f15;
        if ((i4 & 2) != 0) {
            f13 = Float.NaN;
        } else {
            f13 = f10;
        }
        if ((i4 & 4) != 0) {
            f14 = Float.NaN;
        } else {
            f14 = f11;
        }
        if ((i4 & 8) != 0) {
            f15 = Float.NaN;
        } else {
            f15 = f12;
        }
        return sVar.then(new SizeElement(f5, f13, f14, f15, false, AbstractC2911e0.alpha));
    }

    public static final T.s kilo(T.s sVar, float f5) {
        return sVar.then(new SizeElement(f5, f5, f5, f5, true, AbstractC2911e0.alpha));
    }

    public static final T.s lima(T.s sVar, float f5, float f10) {
        return sVar.then(new SizeElement(f5, f10, f5, f10, true, AbstractC2911e0.alpha));
    }

    public static final T.s mike(T.s sVar, float f5, float f10, float f11, float f12) {
        return sVar.then(new SizeElement(f5, f10, f11, f12, true, AbstractC2911e0.alpha));
    }

    public static /* synthetic */ T.s november(T.s sVar, float f5, float f10, float f11, int i4) {
        if ((i4 & 1) != 0) {
            f5 = Float.NaN;
        }
        if ((i4 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i4 & 4) != 0) {
            f11 = Float.NaN;
        }
        return mike(sVar, f5, f10, f11, Float.NaN);
    }

    public static final T.s oscar(T.s sVar, float f5) {
        return sVar.then(new SizeElement(f5, 0.0f, f5, 0.0f, AbstractC2911e0.alpha, 10));
    }

    public static final T.s papa(T.s sVar, float f5, float f10) {
        return sVar.then(new SizeElement(f5, 0.0f, f10, 0.0f, AbstractC2911e0.alpha, 10));
    }

    public static /* synthetic */ T.s quebec(T.s sVar, float f5, float f10, int i4) {
        if ((i4 & 1) != 0) {
            f5 = Float.NaN;
        }
        if ((i4 & 2) != 0) {
            f10 = Float.NaN;
        }
        return papa(sVar, f5, f10);
    }

    public static T.s romeo(T.s sVar) {
        WrapContentElement wrapContentElement;
        T.j jVar = T.d.f2061d;
        if (Intrinsics.areEqual(jVar, jVar)) {
            wrapContentElement = foxtrot;
        } else if (Intrinsics.areEqual(jVar, T.d.f2060c)) {
            wrapContentElement = golf;
        } else {
            wrapContentElement = new WrapContentElement(aa.alpha, new C0536b(jVar, 1), jVar, "wrapContentHeight");
        }
        return sVar.then(wrapContentElement);
    }

    public static T.s sierra(T.s sVar, T.k kVar, int i4) {
        WrapContentElement wrapContentElement;
        int i5 = i4 & 1;
        T.k kVar2 = T.d.teal;
        if (i5 != 0) {
            kVar = kVar2;
        }
        if (Intrinsics.areEqual(kVar, kVar2)) {
            wrapContentElement = hotel;
        } else if (Intrinsics.areEqual(kVar, T.d.alpha)) {
            wrapContentElement = india;
        } else {
            wrapContentElement = new WrapContentElement(aa.red, new Ac.k(26, kVar), kVar, "wrapContentSize");
        }
        return sVar.then(wrapContentElement);
    }

    public static T.s tango(T.s sVar, int i4) {
        WrapContentElement wrapContentElement;
        T.i iVar = T.d.f2064h;
        int i5 = i4 & 1;
        T.i iVar2 = T.d.f2063g;
        if (i5 != 0) {
            iVar = iVar2;
        }
        if (Intrinsics.areEqual(iVar, iVar2)) {
            wrapContentElement = delta;
        } else if (Intrinsics.areEqual(iVar, T.d.f2062f)) {
            wrapContentElement = echo;
        } else {
            wrapContentElement = new WrapContentElement(aa.purple, new Ac.k(25, iVar), iVar, "wrapContentWidth");
        }
        return sVar.then(wrapContentElement);
    }
}
