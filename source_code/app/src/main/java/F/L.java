package F;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class L extends Lambda implements Xd.l {
    public final /* synthetic */ T1 alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ P.d silver;
    public final /* synthetic */ D0.an teal;
    public final /* synthetic */ float white;
    public final /* synthetic */ androidx.compose.foundation.layout.M yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(T1 t12, boolean z2, boolean z10, P.d dVar, D0.an anVar, float f5, androidx.compose.foundation.layout.M m4) {
        super(2);
        this.alpha = t12;
        this.purple = z2;
        this.red = z10;
        this.silver = dVar;
        this.teal = anVar;
        this.white = f5;
        this.yellow = m4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        long j5;
        long j6;
        long j7;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        T1 t12 = this.alpha;
        boolean z2 = this.purple;
        boolean z10 = this.red;
        if (!z2) {
            j5 = t12.foxtrot;
        } else if (!z10) {
            j5 = t12.bravo;
        } else {
            j5 = t12.kilo;
        }
        long j10 = j5;
        if (!z2) {
            j6 = t12.golf;
        } else if (!z10) {
            j6 = t12.charlie;
        } else {
            j6 = t12.lima;
        }
        if (!z2) {
            j7 = t12.hotel;
        } else if (!z10) {
            j7 = t12.delta;
        } else {
            j7 = t12.mike;
        }
        long j11 = j7;
        N.charlie(this.silver, this.teal, j10, j6, j11, this.white, this.yellow, interfaceC0581m, 0);
        return Unit.INSTANCE;
    }
}
