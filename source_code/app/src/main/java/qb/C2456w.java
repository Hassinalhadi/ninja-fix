package qb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: qb.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2456w {
    public final String alpha;
    public final String bravo;
    public final String charlie;

    public C2456w(String title, String message, String buttonText) {
        Intrinsics.echo(title, "title");
        Intrinsics.echo(message, "message");
        Intrinsics.echo(buttonText, "buttonText");
        this.alpha = title;
        this.bravo = message;
        this.charlie = buttonText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2456w)) {
            return false;
        }
        C2456w c2456w = (C2456w) obj;
        if (Intrinsics.areEqual(this.alpha, c2456w.alpha) && Intrinsics.areEqual(this.bravo, c2456w.bravo) && Intrinsics.areEqual(this.charlie, c2456w.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutsideWorkingAreaCardData(title=");
        sb2.append(this.alpha);
        sb2.append(", message=");
        sb2.append(this.bravo);
        sb2.append(", buttonText=");
        return P0.gold(sb2, this.charlie, ")");
    }
}
