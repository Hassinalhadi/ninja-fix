package Bb;

import a0.C0366t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class f {
    public final String alpha;
    public final String bravo;
    public final C0366t charlie;

    public f(String value, String label, C0366t c0366t) {
        Intrinsics.echo(value, "value");
        Intrinsics.echo(label, "label");
        this.alpha = value;
        this.bravo = label;
        this.charlie = c0366t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Intrinsics.areEqual(this.alpha, fVar.alpha) && Intrinsics.areEqual(this.bravo, fVar.bravo) && Intrinsics.areEqual(this.charlie, fVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int alpha;
        int sierra = AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo);
        C0366t c0366t = this.charlie;
        if (c0366t == null) {
            alpha = 0;
        } else {
            alpha = p.alpha(c0366t.alpha);
        }
        return sierra + alpha;
    }

    public final String toString() {
        return "AssignmentDetailItem(value=" + this.alpha + ", label=" + this.bravo + ", valueColor=" + this.charlie + ")";
    }
}
