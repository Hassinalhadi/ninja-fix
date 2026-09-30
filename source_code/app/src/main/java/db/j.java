package db;

import androidx.compose.runtime.ax;
import i0.InterfaceC1878a;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class j extends Pd.i implements Xd.l {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ InterfaceC1878a purple;
    public final /* synthetic */ ax red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z2, InterfaceC1878a interfaceC1878a, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = z2;
        this.purple = interfaceC1878a;
        this.red = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new j(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ax axVar = this.red;
        List list = l.echo;
        if (((Boolean) axVar.getValue()).booleanValue() && this.alpha) {
            this.purple.alpha(0);
        }
        return Unit.INSTANCE;
    }
}
