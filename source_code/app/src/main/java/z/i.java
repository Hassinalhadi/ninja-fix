package z;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import f.C1674k;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.az;

/* loaded from: classes3.dex */
public final class i extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ InterfaceC1673j purple;
    public final /* synthetic */ SnapshotStateList red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC1673j interfaceC1673j, SnapshotStateList snapshotStateList, Nd.c cVar) {
        super(2, cVar);
        this.purple = interfaceC1673j;
        this.red = snapshotStateList;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        az azVar = ((C1674k) this.purple).alpha;
        F.am amVar = new F.am(this.red, 2);
        this.alpha = 1;
        azVar.getClass();
        az.juliet(azVar, amVar, this);
        return aVar;
    }
}
