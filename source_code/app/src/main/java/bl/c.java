package bl;

import android.opengl.EGLSurface;
import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class c {
    public final EGLSurface alpha;
    public final int bravo;
    public final int charlie;

    public c(EGLSurface eGLSurface, int i4, int i5) {
        if (eGLSurface != null) {
            this.alpha = eGLSurface;
            this.bravo = i4;
            this.charlie = i5;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.alpha.equals(cVar.alpha) && this.bravo == cVar.bravo && this.charlie == cVar.charlie) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo) * 1000003) ^ this.charlie;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutputSurface{eglSurface=");
        sb2.append(this.alpha);
        sb2.append(", width=");
        sb2.append(this.bravo);
        sb2.append(", height=");
        return P0.cyan(sb2, this.charlie, "}");
    }
}
