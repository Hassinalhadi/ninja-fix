package je;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import t6.AbstractC3090z2;

/* loaded from: classes2.dex */
public final class ao extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ at purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao(at atVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = atVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return AbstractC3090z2.alpha(this.purple.purple);
            default:
                return new ar(this.purple);
        }
    }
}
