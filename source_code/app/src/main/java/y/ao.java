package y;

import android.view.textclassifier.TextClassification;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ao {
    public final CharSequence alpha;
    public final long bravo;
    public final TextClassification charlie;

    public ao(CharSequence charSequence, long j5, TextClassification textClassification) {
        this.alpha = charSequence;
        this.bravo = j5;
        this.charlie = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        if (Intrinsics.areEqual(this.alpha, aoVar.alpha) && D0.am.bravo(this.bravo, aoVar.bravo) && Intrinsics.areEqual(this.charlie, aoVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() * 31;
        int i4 = D0.am.charlie;
        long j5 = this.bravo;
        int i5 = (((int) (j5 ^ (j5 >>> 32))) + hashCode2) * 31;
        hashCode = this.charlie.hashCode();
        return hashCode + i5;
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.alpha) + ", selection=" + ((Object) D0.am.hotel(this.bravo)) + ", textClassification=" + this.charlie + ')';
    }
}
