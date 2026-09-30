package m0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class d extends Lambda implements Function1 {
    public final /* synthetic */ Ref.ObjectRef alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Ref.ObjectRef objectRef) {
        super(1);
        this.alpha = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        Ref.ObjectRef objectRef = this.alpha;
        Object obj2 = objectRef.alpha;
        if (obj2 == null && fVar.red) {
            objectRef.alpha = fVar;
        } else if (obj2 != null) {
            fVar.getClass();
        }
        return Boolean.TRUE;
    }
}
