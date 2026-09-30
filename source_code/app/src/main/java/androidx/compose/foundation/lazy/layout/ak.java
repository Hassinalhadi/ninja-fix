package androidx.compose.foundation.lazy.layout;

import bz.AbstractC0779d;
import bz.C0788m;
import bz.I;
import bz.P;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ak extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ J2.l purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(J2.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ak(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ak) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            C0788m c0788m = (C0788m) this.purple.purple;
            Float f5 = new Float(0.0f);
            I juliet = AbstractC0779d.juliet(400.0f, new Float(0.5f), 1);
            this.alpha = 1;
            if (P.echo(c0788m, f5, juliet, null, this, 8) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
