package androidx.compose.foundation.layout;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p3.EnumC2270b;
import qb.C2442i;
import s6.AbstractC2806w7;
import t6.AbstractC3036o2;
import vb.AbstractC3185a;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Xd.l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ kotlin.e yellow;

    public /* synthetic */ r(T.s sVar, T.f fVar, boolean z2, P.d dVar, int i4, int i5) {
        this.purple = sVar;
        this.white = fVar;
        this.red = z2;
        this.yellow = dVar;
        this.silver = i4;
        this.teal = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.silver | 1);
                P.d dVar = (P.d) this.yellow;
                AbstractC0538d.alpha((T.s) this.purple, (T.f) this.white, this.red, dVar, (InterfaceC0581m) obj, cyan, this.teal);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.silver | 1);
                C2442i c2442i = (C2442i) this.white;
                boolean z2 = this.red;
                AbstractC2806w7.bravo(c2442i, (Function0) this.yellow, (T.s) this.purple, z2, (InterfaceC0581m) obj, cyan2, this.teal);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.silver | 1);
                P.d dVar2 = (P.d) this.yellow;
                AbstractC3036o2.alpha(this.red, (Function0) this.white, (T.s) this.purple, dVar2, (InterfaceC0581m) obj, cyan3, this.teal);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan4 = C0564b.cyan(this.silver | 1);
                T.p pVar = T.p.alpha;
                boolean z10 = this.red;
                AbstractC3185a.bravo((EnumC2270b) this.purple, (String) this.white, pVar, (Function0) this.yellow, z10, (InterfaceC0581m) obj, cyan4, this.teal);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ r(EnumC2270b enumC2270b, String str, Function0 function0, boolean z2, int i4, int i5) {
        this.purple = enumC2270b;
        this.white = str;
        this.yellow = function0;
        this.red = z2;
        this.silver = i4;
        this.teal = i5;
    }

    public /* synthetic */ r(C2442i c2442i, Function0 function0, T.s sVar, boolean z2, int i4, int i5) {
        this.white = c2442i;
        this.yellow = function0;
        this.purple = sVar;
        this.red = z2;
        this.silver = i4;
        this.teal = i5;
    }

    public /* synthetic */ r(boolean z2, Function0 function0, T.s sVar, P.d dVar, int i4, int i5) {
        this.red = z2;
        this.white = function0;
        this.purple = sVar;
        this.yellow = dVar;
        this.silver = i4;
        this.teal = i5;
    }
}
