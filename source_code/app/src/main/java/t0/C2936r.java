package t0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: t0.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2936r extends Lambda implements Function1 {
    public final /* synthetic */ Ref.ObjectRef alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2936r(Ref.ObjectRef objectRef) {
        super(1);
        this.alpha = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.alpha.alpha = (Y.aa) obj;
        return Boolean.TRUE;
    }
}
