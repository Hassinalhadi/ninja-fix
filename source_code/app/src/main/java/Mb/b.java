package Mb;

import T.p;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2760r6;
import wb.AbstractC3253e;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ p red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ e white;

    public /* synthetic */ b(boolean z2, e eVar, p pVar, boolean z10, int i4, int i5) {
        this.alpha = i5;
        this.purple = z2;
        this.white = eVar;
        this.red = pVar;
        this.silver = z10;
        this.teal = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.teal | 1);
                p pVar = this.red;
                boolean z2 = this.silver;
                AbstractC2760r6.alpha(this.purple, (Function1) this.white, pVar, z2, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.teal | 1);
                p pVar2 = this.red;
                boolean z10 = this.silver;
                AbstractC3253e.charlie(this.purple, (Function0) this.white, pVar2, z10, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }
}
