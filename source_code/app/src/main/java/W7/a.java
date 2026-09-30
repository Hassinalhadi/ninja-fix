package W7;

import androidx.camera.core.impl.ah;
import java.util.ArrayList;
import java.util.Iterator;
import t6.AbstractC3066u3;

/* loaded from: classes2.dex */
public final class a {
    public boolean alpha;
    public boolean bravo;
    public boolean charlie;

    public a(boolean z2, boolean z10, boolean z11) {
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = z11;
    }

    public boolean alpha() {
        if ((this.charlie || this.bravo) && this.alpha) {
            return true;
        }
        return false;
    }

    public void bravo(ArrayList arrayList) {
        if ((this.alpha || this.bravo || this.charlie) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ah) it.next()).alpha();
            }
            AbstractC3066u3.bravo("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
