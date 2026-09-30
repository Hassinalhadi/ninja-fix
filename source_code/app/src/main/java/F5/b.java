package F5;

import android.content.Context;
import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class b extends c {
    public final Context alpha;
    public final N5.a bravo;
    public final N5.a charlie;
    public final String delta;

    public b(Context context, N5.a aVar, N5.a aVar2, String str) {
        if (context != null) {
            this.alpha = context;
            if (aVar != null) {
                this.bravo = aVar;
                if (aVar2 != null) {
                    this.charlie = aVar2;
                    if (str != null) {
                        this.delta = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.alpha.equals(((b) cVar).alpha)) {
                b bVar = (b) cVar;
                if (this.bravo.equals(bVar.bravo) && this.charlie.equals(bVar.charlie) && this.delta.equals(bVar.delta)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode()) * 1000003) ^ this.delta.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.alpha);
        sb2.append(", wallClock=");
        sb2.append(this.bravo);
        sb2.append(", monotonicClock=");
        sb2.append(this.charlie);
        sb2.append(", backendName=");
        return P0.gold(sb2, this.delta, "}");
    }
}
