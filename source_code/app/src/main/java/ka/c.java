package ka;

import androidx.appcompat.widget.P0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {
    public final boolean alpha;
    public final List bravo;
    public final List charlie;
    public final String delta;
    public final String echo;

    public c(boolean z2, List active, List completed, String str, String str2) {
        Intrinsics.echo(active, "active");
        Intrinsics.echo(completed, "completed");
        this.alpha = z2;
        this.bravo = active;
        this.charlie = completed;
        this.delta = str;
        this.echo = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.alpha == cVar.alpha && Intrinsics.areEqual(this.bravo, cVar.bravo) && Intrinsics.areEqual(this.charlie, cVar.charlie) && Intrinsics.areEqual(this.delta, cVar.delta) && Intrinsics.areEqual(this.echo, cVar.echo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int golf = com.google.android.material.datepicker.j.golf(com.google.android.material.datepicker.j.golf(i4 * 31, 31, this.bravo), 31, this.charlie);
        int i5 = 0;
        String str = this.delta;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (golf + hashCode) * 31;
        String str2 = this.echo;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return i10 + i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UiState(loading=");
        sb2.append(this.alpha);
        sb2.append(", active=");
        sb2.append(this.bravo);
        sb2.append(", completed=");
        sb2.append(this.charlie);
        sb2.append(", errorActive=");
        sb2.append(this.delta);
        sb2.append(", errorCompleted=");
        return P0.gold(sb2, this.echo, ")");
    }
}
