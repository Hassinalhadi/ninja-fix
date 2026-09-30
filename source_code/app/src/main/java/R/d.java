package R;

import a2.C0389n;
import androidx.compose.runtime.af;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import bv.al;
import bx.s;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements af {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;
    public final /* synthetic */ Object charlie;
    public final /* synthetic */ Object delta;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.bravo = obj;
        this.charlie = obj2;
        this.delta = obj3;
    }

    @Override // androidx.compose.runtime.af
    public final void dispose() {
        switch (this.alpha) {
            case 0:
                e eVar = (e) this.bravo;
                al alVar = eVar.purple;
                Object obj = this.charlie;
                Object kilo = alVar.kilo(obj);
                j jVar = (j) this.delta;
                if (kilo == jVar) {
                    Map charlie = jVar.charlie();
                    boolean isEmpty = charlie.isEmpty();
                    Map map = eVar.alpha;
                    if (isEmpty) {
                        map.remove(obj);
                        return;
                    } else {
                        map.put(obj, charlie);
                        return;
                    }
                }
                return;
            case 1:
                C0389n c0389n = (C0389n) this.bravo;
                Y1.l lVar = (Y1.l) this.charlie;
                c0389n.bravo().charlie(lVar);
                ((SnapshotStateList) this.delta).remove(lVar);
                return;
            default:
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.bravo;
                Object obj2 = this.charlie;
                snapshotStateList.remove(obj2);
                ((s) this.delta).delta.kilo(obj2);
                return;
        }
    }
}
