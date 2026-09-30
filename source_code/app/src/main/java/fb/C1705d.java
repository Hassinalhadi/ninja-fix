package fb;

import androidx.appcompat.widget.P0;
import f0.AbstractC1680b;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: fb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1705d {
    public final AbstractC1680b alpha;
    public final String bravo;
    public final String charlie;

    public C1705d(AbstractC1680b icon, String label, String value) {
        Intrinsics.echo(icon, "icon");
        Intrinsics.echo(label, "label");
        Intrinsics.echo(value, "value");
        this.alpha = icon;
        this.bravo = label;
        this.charlie = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1705d)) {
            return false;
        }
        C1705d c1705d = (C1705d) obj;
        if (Intrinsics.areEqual(this.alpha, c1705d.alpha) && Intrinsics.areEqual(this.bravo, c1705d.bravo) && Intrinsics.areEqual(this.charlie, c1705d.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TwoSectionCardSection(icon=");
        sb2.append(this.alpha);
        sb2.append(", label=");
        sb2.append(this.bravo);
        sb2.append(", value=");
        return P0.gold(sb2, this.charlie, ")");
    }
}
