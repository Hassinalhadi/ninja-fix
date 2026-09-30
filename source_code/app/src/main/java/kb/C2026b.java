package kb;

import O0.j;
import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m.C2093f;
import s6.AbstractC2608a6;
import t6.AbstractC3032n3;
import t6.AbstractC3066u3;
import y.C3344D;

/* renamed from: kb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2026b implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ C2026b(s sVar, Function0 function0, boolean z2, int i4) {
        this.alpha = 1;
        this.purple = sVar;
        this.teal = function0;
        this.red = z2;
        this.silver = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                int cyan = C0564b.cyan(this.silver | 1);
                AbstractC2608a6.bravo(this.red, (s) this.purple, (C2093f) this.teal, interfaceC0581m, cyan);
                return Unit.INSTANCE;
            case 1:
                AbstractC3032n3.charlie(C0564b.cyan(this.silver | 1), (s) this.purple, interfaceC0581m, (Function0) this.teal, this.red);
                return Unit.INSTANCE;
            default:
                int cyan2 = C0564b.cyan(this.silver | 1);
                AbstractC3066u3.alpha(this.red, (j) this.purple, (C3344D) this.teal, interfaceC0581m, cyan2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C2026b(boolean z2, Object obj, Object obj2, int i4, int i5) {
        this.alpha = i5;
        this.red = z2;
        this.purple = obj;
        this.teal = obj2;
        this.silver = i4;
    }
}
