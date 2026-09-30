package Jb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ah extends ai {
    public final int alpha;
    public final int bravo;
    public final String charlie;

    public ah(int i4, int i5, String str) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ah) {
                ah ahVar = (ah) obj;
                if (this.alpha != ahVar.alpha || this.bravo != ahVar.bravo || !Intrinsics.areEqual(this.charlie, ahVar.charlie)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + (((this.alpha * 31) + this.bravo) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Item(id=");
        sb2.append(this.alpha);
        sb2.append(", icon=");
        sb2.append(this.bravo);
        sb2.append(", title=");
        return P0.gold(sb2, this.charlie, ")");
    }
}
