package F;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import f.C1674k;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class an extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ InterfaceC1673j purple;
    public final /* synthetic */ SnapshotStateList red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(InterfaceC1673j interfaceC1673j, SnapshotStateList snapshotStateList, Nd.c cVar) {
        super(2, cVar);
        this.purple = interfaceC1673j;
        this.red = snapshotStateList;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new an(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((an) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
        yf.az azVar = ((C1674k) this.purple).alpha;
        am amVar = new am(this.red, 0);
        this.alpha = 1;
        azVar.getClass();
        yf.az.juliet(azVar, amVar, this);
        return aVar;
    }
}
