package N8;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ G1.f red;
    public final /* synthetic */ n silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object obj, G1.f fVar, n nVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = obj;
        this.red = fVar;
        this.silver = nVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        m mVar = new m(this.purple, this.red, this.silver, cVar);
        mVar.alpha = obj;
        return mVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((G1.b) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        G1.b bVar = (G1.b) this.alpha;
        Object obj2 = this.purple;
        G1.f key = this.red;
        if (obj2 != null) {
            bVar.getClass();
            Intrinsics.echo(key, "key");
            bVar.delta(key, obj2);
        } else {
            bVar.getClass();
            Intrinsics.echo(key, "key");
            bVar.bravo();
            bVar.alpha.remove(key);
        }
        n.alpha(this.silver, bVar);
        return Unit.INSTANCE;
    }
}
