package T0;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import s0.Y;

/* loaded from: classes3.dex */
public final class i extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ t purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(t tVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Y snapshotObserver;
        switch (this.alpha) {
            case 0:
                this.purple.getLayoutNode().beige();
                return Unit.INSTANCE;
            case 1:
                t tVar = this.purple;
                if (tVar.teal && tVar.isAttachedToWindow() && tVar.getView().getParent() == tVar) {
                    snapshotObserver = tVar.getSnapshotObserver();
                    snapshotObserver.alpha(tVar, j.f2066s, tVar.getUpdate());
                }
                return Unit.INSTANCE;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.purple.f2085t.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                t tVar2 = this.purple;
                tVar2.getReleaseBlock().invoke(tVar2.f2085t);
                t.golf(tVar2);
                return Unit.INSTANCE;
            case 4:
                t tVar3 = this.purple;
                tVar3.getResetBlock().invoke(tVar3.f2085t);
                return Unit.INSTANCE;
            default:
                t tVar4 = this.purple;
                tVar4.getUpdateBlock().invoke(tVar4.f2085t);
                return Unit.INSTANCE;
        }
    }
}
