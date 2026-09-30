package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import s6.E7;

/* loaded from: classes3.dex */
public final class C2 extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Xd.l purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ Object silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2(Object obj, Xd.l lVar, int i4, int i5) {
        super(2);
        this.alpha = i5;
        this.silver = obj;
        this.purple = lVar;
        this.red = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Number) obj2).intValue();
        switch (i4) {
            case 0:
                G2.alpha((D0.an) this.silver, this.purple, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            default:
                E7.bravo((T.s) this.silver, this.purple, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
        }
    }
}
