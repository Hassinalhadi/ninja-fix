package F;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: F.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0086a1 extends Pd.i implements Xd.m {
    public /* synthetic */ float alpha;
    public final /* synthetic */ Function1 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086a1(Function1 function1, Nd.c cVar) {
        super(3, cVar);
        this.purple = function1;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        C0086a1 c0086a1 = new C0086a1(this.purple, (Nd.c) obj3);
        c0086a1.alpha = floatValue;
        return c0086a1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.purple.invoke(new Float(this.alpha));
        return Unit.INSTANCE;
    }
}
