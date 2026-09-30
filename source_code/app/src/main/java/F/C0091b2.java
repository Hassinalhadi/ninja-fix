package F;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0091b2 extends Lambda implements Function0 {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ Q0.d purple;
    public final /* synthetic */ EnumC0107f2 red;
    public final /* synthetic */ Function1 silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091b2(boolean z2, Q0.d dVar, EnumC0107f2 enumC0107f2, Function1 function1) {
        super(0);
        this.alpha = z2;
        this.purple = dVar;
        this.red = enumC0107f2;
        this.silver = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new C0103e2(this.alpha, this.purple, this.red, this.silver);
    }
}
