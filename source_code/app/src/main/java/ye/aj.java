package ye;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aj {
    public final Ne.f alpha;
    public final String bravo;

    public aj(Ne.f fVar, String signature) {
        Intrinsics.echo(signature, "signature");
        this.alpha = fVar;
        this.bravo = signature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        if (Intrinsics.areEqual(this.alpha, ajVar.alpha) && Intrinsics.areEqual(this.bravo, ajVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NameAndSignature(name=");
        sb2.append(this.alpha);
        sb2.append(", signature=");
        return P0.fuchsia(sb2, this.bravo, ')');
    }
}
