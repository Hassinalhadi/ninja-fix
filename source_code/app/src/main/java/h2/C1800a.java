package h2;

import Pd.i;
import Xd.l;
import i2.e;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1800a extends i implements l {
    public int alpha;
    public final /* synthetic */ C1803d purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1800a(C1803d c1803d, Nd.c cVar) {
        super(2, cVar);
        this.purple = c1803d;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1800a(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1800a) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
        e eVar = this.purple.alpha;
        this.alpha = 1;
        Object charlie = eVar.charlie(this);
        if (charlie == aVar) {
            return aVar;
        }
        return charlie;
    }
}
