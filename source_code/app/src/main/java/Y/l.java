package Y;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class l extends Lambda implements Function1 {
    public final /* synthetic */ Ref.ObjectRef alpha;
    public final /* synthetic */ int purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Ref.ObjectRef objectRef, int i4) {
        super(1);
        this.alpha = objectRef;
        this.purple = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean valueOf = Boolean.valueOf(((aa) obj).f(this.purple));
        this.alpha.alpha = valueOf;
        return valueOf;
    }
}
