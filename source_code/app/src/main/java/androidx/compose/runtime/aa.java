package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class aa extends N {
    public final /* synthetic */ int bravo = 1;
    public final Object charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(Function0 function0) {
        super(function0);
        as asVar = as.white;
        this.charlie = asVar;
    }

    @Override // androidx.compose.runtime.N
    public final O alpha(Object obj) {
        boolean z2;
        boolean z10;
        switch (this.bravo) {
            case 0:
                if (obj == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new O(this, obj, z2, null, true);
            default:
                if (obj == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return new O(this, obj, z10, (u0) this.charlie, true);
        }
    }

    @Override // androidx.compose.runtime.N
    public G0 bravo() {
        switch (this.bravo) {
            case 0:
                return (ab) this.charlie;
            default:
                return super.bravo();
        }
    }

    public aa(Function1 function1) {
        super(new Vc.i(25));
        this.charlie = new ab(function1);
    }
}
