package Yb;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final class O extends Pd.i implements Xd.l {
    public final /* synthetic */ Ref.ObjectRef alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Ref.ObjectRef objectRef, Nd.c cVar) {
        super(2, cVar);
        this.alpha = objectRef;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new O(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        File file = (File) this.alpha.alpha;
        if (file != null) {
            return Boolean.valueOf(file.delete());
        }
        return null;
    }
}
