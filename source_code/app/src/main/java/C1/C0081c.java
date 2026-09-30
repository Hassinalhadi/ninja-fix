package C1;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: C1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0081c extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ List red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0081c(List list, Nd.c cVar) {
        super(2, cVar);
        this.red = list;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0081c c0081c = new C0081c(this.red, cVar);
        c0081c.purple = obj;
        return c0081c;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0081c) create((ar) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            ar arVar = (ar) this.purple;
            this.alpha = 1;
            if (g.alpha(this.red, arVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
