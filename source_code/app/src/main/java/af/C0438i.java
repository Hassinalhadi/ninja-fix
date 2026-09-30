package af;

import hd.AbstractC1848d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.q;
import od.C2226c;

/* renamed from: af.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0438i extends Pd.i implements Xd.m {
    public final /* synthetic */ int alpha = 1;
    public /* synthetic */ Object purple;

    public /* synthetic */ C0438i(int i4, Nd.c cVar) {
        super(i4, cVar);
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.alpha) {
            case 0:
                return new C0438i((q) this.purple, (Nd.c) obj3).invokeSuspend(Unit.INSTANCE);
            default:
                C0438i c0438i = new C0438i(3, (Nd.c) obj3);
                c0438i.purple = (C2226c) obj;
                c0438i.invokeSuspend(Unit.INSTANCE);
                return null;
        }
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.alpha) {
            case 0:
                Od.a aVar = Od.a.alpha;
                ResultKt.alpha(obj);
                ((q) this.purple).alpha = true;
                return Unit.INSTANCE;
            default:
                Od.a aVar2 = Od.a.alpha;
                ResultKt.alpha(obj);
                if (((C2226c) this.purple).foxtrot.echo(AbstractC1848d.alpha) == null) {
                    return null;
                }
                throw new ClassCastException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0438i(q qVar, Nd.c cVar) {
        super(3, cVar);
        this.purple = qVar;
    }
}
