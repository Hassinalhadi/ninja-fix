package s0;

import a0.InterfaceC0364r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class I extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ L purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(L l10, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = l10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                L l10 = this.purple;
                InterfaceC0364r interfaceC0364r = l10.f13267y;
                Intrinsics.checkNotNull(interfaceC0364r);
                l10.u(interfaceC0364r, l10.f13266x);
                return Unit.INSTANCE;
            default:
                L l11 = this.purple.f13253k;
                if (l11 != null) {
                    l11.H();
                }
                return Unit.INSTANCE;
        }
    }
}
