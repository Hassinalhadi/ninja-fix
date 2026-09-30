package t0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: t0.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2938s extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Y.d purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2938s(Y.d dVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return Boolean.valueOf(((Y.aa) obj).f(this.purple.alpha));
            default:
                return Boolean.valueOf(((Y.aa) obj).f(this.purple.alpha));
        }
    }
}
