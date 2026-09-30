package a2;

import androidx.compose.runtime.ax;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.N;

/* renamed from: a2.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0387l extends Pd.i implements Xd.l {
    public final /* synthetic */ ax alpha;
    public final /* synthetic */ C0389n purple;
    public final /* synthetic */ SnapshotStateList red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0387l(ax axVar, C0389n c0389n, SnapshotStateList snapshotStateList, Nd.c cVar) {
        super(2, cVar);
        this.alpha = axVar;
        this.purple = c0389n;
        this.red = snapshotStateList;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0387l(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0387l) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        for (Y1.l lVar : (Set) this.alpha.getValue()) {
            C0389n c0389n = this.purple;
            if (!((List) ((N) c0389n.bravo().echo.alpha).getValue()).contains(lVar) && !this.red.contains(lVar)) {
                c0389n.bravo().charlie(lVar);
            }
        }
        return Unit.INSTANCE;
    }
}
