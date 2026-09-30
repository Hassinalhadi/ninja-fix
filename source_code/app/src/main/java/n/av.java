package n;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class av {
    public static final av bravo = new av(63, null);
    public final Function1 alpha;

    public av(int i4, Function1 function1) {
        this.alpha = (i4 & 16) != 0 ? null : function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof av) {
            av avVar = (av) obj;
            avVar.getClass();
            if (this.alpha == avVar.alpha) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        Function1 function1 = this.alpha;
        if (function1 != null) {
            i4 = function1.hashCode();
        } else {
            i4 = 0;
        }
        return i4 * 31;
    }
}
