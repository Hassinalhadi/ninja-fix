package i1;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class i {
    public final Resources alpha;
    public final Resources.Theme bravo;

    public i(Resources resources, Resources.Theme theme) {
        this.alpha = resources;
        this.bravo = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.alpha.equals(iVar.alpha) && Objects.equals(this.bravo, iVar.bravo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.alpha, this.bravo);
    }
}
