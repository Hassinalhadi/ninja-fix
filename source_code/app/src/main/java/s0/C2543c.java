package s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r0.InterfaceC2481c;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2543c extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2544d purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2543c(C2544d c2544d, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c2544d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.d();
                return Unit.INSTANCE;
            default:
                C2544d c2544d = this.purple;
                T.q qVar = c2544d.alpha;
                Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((InterfaceC2481c) qVar).bravo(c2544d);
                return Unit.INSTANCE;
        }
    }
}
