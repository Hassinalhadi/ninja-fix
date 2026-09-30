package J8;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ai extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ String purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(String str, Nd.c cVar) {
        super(2, cVar);
        this.purple = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ai aiVar = new ai(this.purple, cVar);
        aiVar.alpha = obj;
        return aiVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ai) create((G1.b) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        G1.b bVar = (G1.b) this.alpha;
        bVar.getClass();
        G1.f key = t.charlie;
        Intrinsics.echo(key, "key");
        bVar.delta(key, this.purple);
        return Unit.INSTANCE;
    }
}
