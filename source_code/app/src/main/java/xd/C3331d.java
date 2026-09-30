package xd;

import Xd.l;
import io.ktor.utils.io.t;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: xd.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3331d extends Pd.i implements l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ t purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3331d(t tVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = tVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C3331d c3331d = new C3331d(this.purple, cVar);
        c3331d.alpha = obj;
        return c3331d;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3331d) create(obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
