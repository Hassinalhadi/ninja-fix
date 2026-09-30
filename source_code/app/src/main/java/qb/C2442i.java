package qb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: qb.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2442i {
    public final String alpha;
    public final String bravo;
    public final String charlie;

    public C2442i(String title, String message, String buttonText) {
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
        if (!(obj instanceof C2442i)) {
            return false;
        }
        C2442i c2442i = (C2442i) obj;
        if (Intrinsics.areEqual(this.alpha, c2442i.alpha) && Intrinsics.areEqual(this.bravo, c2442i.bravo) && Intrinsics.areEqual(this.charlie, c2442i.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookShiftCardData(title=");
        sb2.append(this.alpha);
        sb2.append(", message=");
        sb2.append(this.bravo);
        sb2.append(", buttonText=");
        return P0.gold(sb2, this.charlie, ")");
    }
}
