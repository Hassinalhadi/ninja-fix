package Sb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {
    public final String alpha;
    public final h bravo;
    public final int charlie;

    public c(String str, h hVar, int i4) {
        this.alpha = str;
        this.bravo = hVar;
        this.charlie = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!Intrinsics.areEqual(this.alpha, cVar.alpha) || !Intrinsics.areEqual(this.bravo, cVar.bravo) || this.charlie != cVar.charlie) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31) + this.charlie;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActiveOrderUi(orderNumber=");
        sb2.append(this.alpha);
        sb2.append(", progressUi=");
        sb2.append(this.bravo);
        sb2.append(", orderImageRes=");
        return P0.cyan(sb2, this.charlie, ")");
    }
}
