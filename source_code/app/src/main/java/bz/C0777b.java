package bz;

import androidx.compose.runtime.t0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: bz.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0777b extends Pd.i implements Function1 {
    public final /* synthetic */ C0778c alpha;
    public final /* synthetic */ Object purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777b(C0778c c0778c, Object obj, Nd.c cVar) {
        super(1, cVar);
        this.alpha = c0778c;
        this.purple = obj;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new C0777b(this.alpha, this.purple, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0777b) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        C0778c c0778c = this.alpha;
        C0778c.bravo(c0778c);
        Object alpha = C0778c.alpha(c0778c, this.purple);
        ((t0) c0778c.charlie.purple).setValue(alpha);
        ((t0) c0778c.echo).setValue(alpha);
        return Unit.INSTANCE;
    }
}
