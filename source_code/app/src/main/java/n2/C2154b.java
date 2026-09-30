package n2;

import com.google.android.material.datepicker.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2154b {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final List delta;
    public final List echo;

    public C2154b(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
        Intrinsics.echo(columnNames, "columnNames");
        Intrinsics.echo(referenceColumnNames, "referenceColumnNames");
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = columnNames;
        this.echo = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2154b)) {
            return false;
        }
        C2154b c2154b = (C2154b) obj;
        if (!Intrinsics.areEqual(this.alpha, c2154b.alpha) || !Intrinsics.areEqual(this.bravo, c2154b.bravo) || !Intrinsics.areEqual(this.charlie, c2154b.charlie) || !Intrinsics.areEqual(this.delta, c2154b.delta)) {
            return false;
        }
        return Intrinsics.areEqual(this.echo, c2154b.echo);
    }

    public final int hashCode() {
        return this.echo.hashCode() + j.golf(AbstractC2327c.sierra(AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo), 31, this.charlie), 31, this.delta);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.alpha + "', onDelete='" + this.bravo + " +', onUpdate='" + this.charlie + "', columnNames=" + this.delta + ", referenceColumnNames=" + this.echo + '}';
    }
}
