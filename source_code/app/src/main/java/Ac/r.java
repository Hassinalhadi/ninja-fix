package Ac;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r {
    public final c alpha;
    public final Long bravo;
    public final s charlie;

    public r(c cVar, Long l10, s statusFilter) {
        Intrinsics.echo(statusFilter, "statusFilter");
        this.alpha = cVar;
        this.bravo = l10;
        this.charlie = statusFilter;
    }

    public static r alpha(r rVar, c cVar, Long l10, s statusFilter, int i4) {
        if ((i4 & 1) != 0) {
            cVar = rVar.alpha;
        }
        if ((i4 & 2) != 0) {
            l10 = rVar.bravo;
        }
        if ((i4 & 4) != 0) {
            statusFilter = rVar.charlie;
        }
        rVar.getClass();
        Intrinsics.echo(statusFilter, "statusFilter");
        return new r(cVar, l10, statusFilter);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Intrinsics.areEqual(this.alpha, rVar.alpha) && Intrinsics.areEqual(this.bravo, rVar.bravo) && this.charlie == rVar.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() * 31;
        Long l10 = this.bravo;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return this.charlie.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "ShiftFilters(selectedChip=" + this.alpha + ", startingPointId=" + this.bravo + ", statusFilter=" + this.charlie + ")";
    }
}
