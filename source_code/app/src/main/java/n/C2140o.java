package n;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: n.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2140o implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ h0 purple;
    public final /* synthetic */ Function1 red;

    public /* synthetic */ C2140o(h0 h0Var, Function1 function1, int i4) {
        this.alpha = i4;
        this.purple = h0Var;
        this.red = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                D0.ak akVar = (D0.ak) obj;
                h0 h0Var = this.purple;
                if (h0Var != null) {
                    ((t0) h0Var.alpha).setValue(akVar);
                }
                Function1 function1 = this.red;
                if (function1 != null) {
                    function1.invoke(akVar);
                }
                return Unit.INSTANCE;
            default:
                h0 h0Var2 = this.purple;
                SnapshotStateList snapshotStateList = h0Var2.charlie;
                Function1 function12 = this.red;
                snapshotStateList.add(function12);
                return new Cb.af(14, h0Var2, function12);
        }
    }
}
