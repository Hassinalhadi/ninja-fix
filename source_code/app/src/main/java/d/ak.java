package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ak extends Pd.i implements Xd.m {
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak(int i4, int i5, Nd.c cVar) {
        super(i4, cVar);
        this.alpha = i5;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.alpha) {
            case 0:
                long j5 = ((Z.b) obj2).alpha;
                return new ak(3, 0, (Nd.c) obj3).invokeSuspend(Unit.INSTANCE);
            case 1:
                ((Number) obj2).floatValue();
                return new ak(3, 1, (Nd.c) obj3).invokeSuspend(Unit.INSTANCE);
            default:
                long j6 = ((Z.b) obj2).alpha;
                return new ak(3, 2, (Nd.c) obj3).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.alpha) {
            case 0:
                Od.a aVar = Od.a.alpha;
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            case 1:
                Od.a aVar2 = Od.a.alpha;
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            default:
                Od.a aVar3 = Od.a.alpha;
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
        }
    }
}
