package F;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.d2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0099d2 extends Lambda implements Function1 {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ Q0.d purple;
    public final /* synthetic */ Function1 red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0099d2(boolean z2, Q0.d dVar, Function1 function1) {
        super(1);
        this.alpha = z2;
        this.purple = dVar;
        this.red = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Q0.d dVar = this.purple;
        Function1 function1 = this.red;
        return new C0103e2(this.alpha, dVar, (EnumC0107f2) obj, function1);
    }
}
