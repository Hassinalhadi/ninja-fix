package Yb;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class H extends Pd.i implements Xd.l {
    public final /* synthetic */ File alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(File file, Nd.c cVar) {
        super(2, cVar);
        this.alpha = file;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new H(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.alpha.delete();
        return Unit.INSTANCE;
    }
}
