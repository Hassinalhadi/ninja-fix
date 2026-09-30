package x2;

import android.view.View;
import androidx.appcompat.widget.P0;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ai {
    public final View bravo;
    public final HashMap alpha = new HashMap();
    public final ArrayList charlie = new ArrayList();

    public ai(View view) {
        this.bravo = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ai) {
            ai aiVar = (ai) obj;
            if (this.bravo == aiVar.bravo && this.alpha.equals(aiVar.alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() + (this.bravo.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder beige = ao.ad.beige("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        beige.append(this.bravo);
        beige.append("\n");
        String crimson = P0.crimson(beige.toString(), "    values:");
        HashMap hashMap = this.alpha;
        for (String str : hashMap.keySet()) {
            crimson = crimson + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return crimson;
    }
}
