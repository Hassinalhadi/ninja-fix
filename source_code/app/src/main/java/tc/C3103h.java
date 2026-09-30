package tc;

import delivery.samurai.android.ui.reposition.presentation.RepositionViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import vf.ab;
import yf.N;

/* renamed from: tc.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3103h extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C3105j purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3103h(C3105j c3105j, Nd.c cVar) {
        super(2, cVar);
        this.purple = c3105j;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3103h(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((C3103h) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        C3105j c3105j = this.purple;
        RepositionViewModel azure = c3105j.azure();
        C3102g c3102g = new C3102g(c3105j, 0);
        this.alpha = 1;
        ((N) azure.charlie.alpha).collect(c3102g, this);
        return aVar;
    }
}
