package Ib;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import n3.EnumC2159b;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class a {
    public final EnumC2159b alpha;
    public final String bravo;
    public final String charlie;

    public a(EnumC2159b type, String title, String subtitle) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(title, "title");
        Intrinsics.echo(subtitle, "subtitle");
        this.alpha = type;
        this.bravo = title;
        this.charlie = subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.alpha == aVar.alpha && Intrinsics.areEqual(this.bravo, aVar.bravo) && Intrinsics.areEqual(this.charlie, aVar.charlie)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.charlie.hashCode() + AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo)) * 31) + 1231;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckItem(type=");
        sb2.append(this.alpha);
        sb2.append(", title=");
        sb2.append(this.bravo);
        sb2.append(", subtitle=");
        return P0.gold(sb2, this.charlie, ", isEnabled=true)");
    }
}
