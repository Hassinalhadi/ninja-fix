package T;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements s {
    public final s alpha;
    public final s purple;

    public m(s sVar, s sVar2) {
        this.alpha = sVar;
        this.purple = sVar2;
    }

    @Override // T.s
    public final boolean all(Function1 function1) {
        if (this.alpha.all(function1) && this.purple.all(function1)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (Intrinsics.areEqual(this.alpha, mVar.alpha) && Intrinsics.areEqual(this.purple, mVar.purple)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // T.s
    public final Object foldIn(Object obj, Xd.l lVar) {
        return this.purple.foldIn(this.alpha.foldIn(obj, lVar), lVar);
    }

    public final int hashCode() {
        return (this.purple.hashCode() * 31) + this.alpha.hashCode();
    }

    @Override // T.s
    public final /* synthetic */ s then(s sVar) {
        return Q0.c.charlie(this, sVar);
    }

    public final String toString() {
        return P0.fuchsia(new StringBuilder(Constants.AES_PREFIX), (String) foldIn("", l.alpha), ']');
    }
}
