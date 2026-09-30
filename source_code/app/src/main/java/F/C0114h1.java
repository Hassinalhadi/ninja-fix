package F;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: F.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0114h1 extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Function0 red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0114h1(Function0 function0, Nd.c cVar) {
        super(2, cVar);
        this.red = function0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0114h1 c0114h1 = new C0114h1(this.red, cVar);
        c0114h1.purple = obj;
        return c0114h1;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0114h1) create((m0.u) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            m0.u uVar = (m0.u) this.purple;
            R0 r02 = new R0(this.red, 1);
            this.alpha = 1;
            if (d.O0.delta(uVar, r02, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
