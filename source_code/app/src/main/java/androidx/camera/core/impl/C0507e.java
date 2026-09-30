package androidx.camera.core.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.impl.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0507e {
    public final ah alpha;
    public final List bravo;
    public final int charlie;
    public final int delta;
    public final androidx.camera.core.t echo;

    public C0507e(ah ahVar, List list, int i4, int i5, androidx.camera.core.t tVar) {
        this.alpha = ahVar;
        this.bravo = list;
        this.charlie = i4;
        this.delta = i5;
        this.echo = tVar;
    }

    public static B9.ab alpha(ah ahVar) {
        B9.ab abVar = new B9.ab(21);
        if (ahVar != null) {
            abVar.purple = ahVar;
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                abVar.white = list;
                abVar.red = -1;
                abVar.silver = -1;
                abVar.teal = androidx.camera.core.t.delta;
                return abVar;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }
        throw new NullPointerException("Null surface");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0507e) {
                C0507e c0507e = (C0507e) obj;
                if (this.alpha.equals(c0507e.alpha) && this.bravo.equals(c0507e.bravo) && this.charlie == c0507e.charlie && this.delta == c0507e.delta && this.echo.equals(c0507e.echo)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * (-721379959)) ^ this.charlie) * 1000003) ^ this.delta) * 1000003) ^ this.echo.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.alpha + ", sharedSurfaces=" + this.bravo + ", physicalCameraId=null, mirrorMode=" + this.charlie + ", surfaceGroupId=" + this.delta + ", dynamicRange=" + this.echo + "}";
    }
}
