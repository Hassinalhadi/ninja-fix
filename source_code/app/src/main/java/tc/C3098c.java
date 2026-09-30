package tc;

import d3.C1585a;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: tc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3098c extends Pd.i implements Xd.l {
    public final /* synthetic */ C3105j alpha;
    public final /* synthetic */ C3107l purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3098c(C3105j c3105j, C3107l c3107l, Nd.c cVar) {
        super(2, cVar);
        this.alpha = c3105j;
        this.purple = c3107l;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3098c(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3098c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        C3105j c3105j = this.alpha;
        C1585a c1585a = c3105j.f13961v;
        if (c1585a != null) {
            c1585a.invoke(new Long(this.purple.alpha));
        }
        c3105j.lima(false, false);
        return Unit.INSTANCE;
    }
}
