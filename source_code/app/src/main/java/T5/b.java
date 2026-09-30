package T5;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b {
    public final int alpha;
    public final com.google.android.gms.common.api.e bravo;
    public final com.google.android.gms.common.api.b charlie;
    public final String delta;

    public b(com.google.android.gms.common.api.e eVar, com.google.android.gms.common.api.b bVar, String str) {
        this.bravo = eVar;
        this.charlie = bVar;
        this.delta = str;
        this.alpha = Arrays.hashCode(new Object[]{eVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!V5.x.lima(this.bravo, bVar.bravo) || !V5.x.lima(this.charlie, bVar.charlie) || !V5.x.lima(this.delta, bVar.delta)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha;
    }
}
