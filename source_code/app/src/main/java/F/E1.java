package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class E1 extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(T.s sVar, long j5, float f5, long j6, int i4, int i5, int i10) {
        super(2);
        this.alpha = sVar;
        this.purple = j5;
        this.red = f5;
        this.silver = j6;
        this.teal = i4;
        this.white = i5;
        this.yellow = i10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.white | 1);
        float f5 = this.red;
        G1.bravo(this.alpha, this.purple, f5, this.silver, this.teal, (InterfaceC0581m) obj, cyan, this.yellow);
        return Unit.INSTANCE;
    }
}
