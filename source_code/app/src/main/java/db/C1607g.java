package db;

import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: db.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1607g extends Pd.i implements Xd.l {
    public final /* synthetic */ D0 alpha;
    public final /* synthetic */ ax purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1607g(D0 d02, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = d02;
        this.purple = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1607g(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1607g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        D0 d02 = this.alpha;
        List list = l.echo;
        int intValue = ((Number) d02.getValue()).intValue();
        ax axVar = this.purple;
        if (intValue > ((Number) axVar.getValue()).intValue()) {
            axVar.setValue(Integer.valueOf(((Number) d02.getValue()).intValue()));
        }
        return Unit.INSTANCE;
    }
}
