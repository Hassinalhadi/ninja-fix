package Dc;

import delivery.samurai.android.ui.shiftsV2.ShiftsFragmentV2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class v extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ShiftsFragmentV2 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(ShiftsFragmentV2 shiftsFragmentV2, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = shiftsFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return this.purple;
            default:
                return this.purple;
        }
    }
}
