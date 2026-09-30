package wd;

import Pd.i;
import Xd.l;
import io.ktor.utils.io.t;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class e extends i implements l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ t purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t tVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = tVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        e eVar = new e(this.purple, cVar);
        eVar.alpha = obj;
        return eVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (this.alpha == null && !this.purple.hotel()) {
            z2 = false;
        } else {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
