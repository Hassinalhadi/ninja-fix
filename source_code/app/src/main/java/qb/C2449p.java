package qb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: qb.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2449p {
    public final String alpha;
    public final String bravo;
    public final String charlie;

    public C2449p(String title, String subtitle, String buttonText) {
        Intrinsics.echo(title, "title");
        Intrinsics.echo(subtitle, "subtitle");
        Intrinsics.echo(buttonText, "buttonText");
        this.alpha = title;
        this.bravo = subtitle;
        this.charlie = buttonText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2449p)) {
            return false;
        }
        C2449p c2449p = (C2449p) obj;
        if (Intrinsics.areEqual(this.alpha, c2449p.alpha) && Intrinsics.areEqual(this.bravo, c2449p.bravo) && Intrinsics.areEqual(this.charlie, c2449p.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OfflineCardData(title=");
        sb2.append(this.alpha);
        sb2.append(", subtitle=");
        sb2.append(this.bravo);
        sb2.append(", buttonText=");
        return P0.gold(sb2, this.charlie, ")");
    }
}
