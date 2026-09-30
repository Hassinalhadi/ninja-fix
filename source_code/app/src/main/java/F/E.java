package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class E extends Lambda implements Xd.l {
    public final /* synthetic */ C0.a alpha;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ ay teal;
    public final /* synthetic */ int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C0.a aVar, Function0 function0, T.s sVar, boolean z2, ay ayVar, int i4) {
        super(2);
        this.alpha = aVar;
        this.purple = function0;
        this.red = sVar;
        this.silver = z2;
        this.teal = ayVar;
        this.white = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.white | 1);
        ay ayVar = this.teal;
        C0.a aVar = this.alpha;
        T.s sVar = this.red;
        boolean z2 = this.silver;
        F.charlie(aVar, this.purple, sVar, z2, ayVar, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
