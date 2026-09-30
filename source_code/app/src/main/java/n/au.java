package n;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.InterfaceC2937r0;

/* loaded from: classes3.dex */
public final class au {
    public final InterfaceC2937r0 alpha;
    public av bravo;
    public Y.i charlie;

    public au(InterfaceC2937r0 interfaceC2937r0) {
        this.alpha = interfaceC2937r0;
    }

    public final av alpha() {
        av avVar = this.bravo;
        if (avVar != null) {
            return avVar;
        }
        Intrinsics.lima("keyboardActions");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bravo(int i4) {
        Function1 function1;
        InterfaceC2937r0 interfaceC2937r0;
        if (i4 == 7) {
            alpha();
        } else if (i4 == 2) {
            alpha();
        } else if (i4 == 6) {
            alpha();
        } else if (i4 == 5) {
            alpha();
        } else {
            if (i4 == 3) {
                function1 = alpha().alpha;
                if (function1 == null) {
                    function1.invoke(this);
                    return true;
                }
                if (i4 == 6) {
                    Y.i iVar = this.charlie;
                    if (iVar != null) {
                        ((Y.n) iVar).foxtrot(1);
                        return true;
                    }
                    Intrinsics.lima("focusManager");
                    throw null;
                }
                if (i4 == 5) {
                    Y.i iVar2 = this.charlie;
                    if (iVar2 != null) {
                        ((Y.n) iVar2).foxtrot(2);
                        return true;
                    }
                    Intrinsics.lima("focusManager");
                    throw null;
                }
                if (i4 == 7 && (interfaceC2937r0 = this.alpha) != null) {
                    ((t0.U) interfaceC2937r0).alpha();
                    return true;
                }
                return false;
            }
            if (i4 == 4) {
                alpha();
            } else if (i4 != 1 && i4 != 0) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        function1 = null;
        if (function1 == null) {
        }
    }
}
