package androidx.compose.material3.internal;

import a0.InterfaceC0342ab;
import bz.X;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class an extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ X purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an(X x4, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = x4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                ((a0.ap) ((InterfaceC0342ab) obj)).charlie(((Number) this.purple.getValue()).floatValue());
                return Unit.INSTANCE;
            default:
                ((a0.ap) ((InterfaceC0342ab) obj)).charlie(((Number) this.purple.getValue()).floatValue());
                return Unit.INSTANCE;
        }
    }
}
