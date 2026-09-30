package Jb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aj {
    public final r alpha;
    public final List bravo;

    public aj(r rVar, List drawerMenuItems) {
        Intrinsics.echo(drawerMenuItems, "drawerMenuItems");
        this.alpha = rVar;
        this.bravo = drawerMenuItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        if (Intrinsics.areEqual(this.alpha, ajVar.alpha) && Intrinsics.areEqual(this.bravo, ajVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "DrawerUiState(headerState=" + this.alpha + ", drawerMenuItems=" + this.bravo + ")";
    }
}
