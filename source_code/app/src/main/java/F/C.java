package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class C extends Lambda implements Xd.l {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ C0.a purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ ay silver;
    public final /* synthetic */ int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(boolean z2, C0.a aVar, T.s sVar, ay ayVar, int i4) {
        super(2);
        this.alpha = z2;
        this.purple = aVar;
        this.red = sVar;
        this.silver = ayVar;
        this.teal = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.teal | 1);
        T.s sVar = this.red;
        ay ayVar = this.silver;
        F.bravo(this.alpha, this.purple, sVar, ayVar, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
