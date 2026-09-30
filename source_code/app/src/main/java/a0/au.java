package a0;

import android.graphics.Shader;

/* loaded from: classes3.dex */
public final class au extends AbstractC0362p {
    public final long alpha;

    public au(long j5) {
        this.alpha = j5;
    }

    @Override // a0.AbstractC0362p
    public final void alpha(float f5, long j5, ak akVar) {
        Be.e eVar = (Be.e) akVar;
        eVar.mike(1.0f);
        long j6 = this.alpha;
        if (f5 != 1.0f) {
            j6 = C0366t.bravo(C0366t.delta(j6) * f5, j6);
        }
        eVar.oscar(j6);
        if (((Shader) eVar.charlie) != null) {
            eVar.sierra(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        if (C0366t.charlie(this.alpha, ((au) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.alpha);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C0366t.india(this.alpha)) + ')';
    }
}
