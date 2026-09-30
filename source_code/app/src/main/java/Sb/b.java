package Sb;

import T.p;
import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import vb.AbstractC3185a;
import wc.AbstractC3255a;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ float purple;
    public final /* synthetic */ s red;

    public /* synthetic */ b(float f5, int i4, int i5, s sVar) {
        this.alpha = i5;
        this.purple = f5;
        this.red = sVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                d.charlie(this.purple, this.red, interfaceC0581m, C0564b.cyan(49));
                return Unit.INSTANCE;
            case 1:
                db.l.india(this.purple, this.red, interfaceC0581m, C0564b.cyan(49));
                return Unit.INSTANCE;
            case 2:
                AbstractC3255a.bravo(this.purple, this.red, interfaceC0581m, C0564b.cyan(49));
                return Unit.INSTANCE;
            default:
                AbstractC3185a.charlie((p) this.red, this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(p pVar, float f5, int i4) {
        this.alpha = 3;
        this.red = pVar;
        this.purple = f5;
    }
}
