package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1528e0 extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ long purple;
    public final /* synthetic */ C1530f0 red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528e0(C1530f0 c1530f0, Nd.c cVar) {
        super(2, cVar);
        this.red = c1530f0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C1528e0 c1528e0 = new C1528e0(this.red, cVar);
        c1528e0.purple = ((Z.b) obj).alpha;
        return c1528e0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        long j5 = ((Z.b) obj).alpha;
        C1528e0 c1528e0 = new C1528e0(this.red, (Nd.c) obj2);
        c1528e0.purple = j5;
        return c1528e0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        long j5 = this.purple;
        C1548o0 c1548o0 = this.red.f11995j;
        this.alpha = 1;
        Object alpha = androidx.compose.foundation.gestures.a.alpha(c1548o0, j5, this);
        if (alpha == aVar) {
            return aVar;
        }
        return alpha;
    }
}
