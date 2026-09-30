package Yb;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: Yb.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0338y extends Pd.i implements Xd.l {
    public final /* synthetic */ ag alpha;
    public final /* synthetic */ boolean purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0338y(ag agVar, boolean z2, Nd.c cVar) {
        super(2, cVar);
        this.alpha = agVar;
        this.purple = z2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0338y(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0338y) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        File file;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ag agVar = this.alpha;
        File file2 = agVar.bravo;
        if (file2 != null) {
            file2.delete();
        }
        agVar.bravo = null;
        agVar.charlie = null;
        if (this.purple && (file = agVar.delta) != null) {
            file.delete();
        }
        agVar.delta = null;
        agVar.echo = false;
        agVar.foxtrot = null;
        return Unit.INSTANCE;
    }
}
