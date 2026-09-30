package Yb;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class D extends Pd.i implements Xd.l {
    public final /* synthetic */ S alpha;
    public final /* synthetic */ boolean purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(S s3, boolean z2, Nd.c cVar) {
        super(2, cVar);
        this.alpha = s3;
        this.purple = z2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new D(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        File file;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        S s3 = this.alpha;
        File file2 = s3.bravo;
        if (file2 != null) {
            file2.delete();
        }
        s3.bravo = null;
        if (this.purple && (file = s3.charlie) != null) {
            file.delete();
        }
        s3.charlie = null;
        s3.delta = false;
        s3.echo = null;
        return Unit.INSTANCE;
    }
}
