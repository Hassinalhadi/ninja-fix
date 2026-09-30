package androidx.camera.core.impl;

import android.util.Size;
import java.util.HashMap;

/* renamed from: androidx.camera.core.impl.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0511i {
    public final Size alpha;
    public final HashMap bravo;
    public final Size charlie;
    public final HashMap delta;
    public final Size echo;
    public final HashMap foxtrot;
    public final HashMap golf;

    public C0511i(Size size, HashMap hashMap, Size size2, HashMap hashMap2, Size size3, HashMap hashMap3, HashMap hashMap4) {
        if (size != null) {
            this.alpha = size;
            this.bravo = hashMap;
            if (size2 != null) {
                this.charlie = size2;
                this.delta = hashMap2;
                if (size3 != null) {
                    this.echo = size3;
                    this.foxtrot = hashMap3;
                    this.golf = hashMap4;
                    return;
                }
                throw new NullPointerException("Null recordSize");
            }
            throw new NullPointerException("Null previewSize");
        }
        throw new NullPointerException("Null analysisSize");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0511i) {
                C0511i c0511i = (C0511i) obj;
                if (this.alpha.equals(c0511i.alpha) && this.bravo.equals(c0511i.bravo) && this.charlie.equals(c0511i.charlie) && this.delta.equals(c0511i.delta) && this.echo.equals(c0511i.echo) && this.foxtrot.equals(c0511i.foxtrot) && this.golf.equals(c0511i.golf)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode()) * 1000003) ^ this.delta.hashCode()) * 1000003) ^ this.echo.hashCode()) * 1000003) ^ this.foxtrot.hashCode()) * 1000003) ^ this.golf.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.alpha + ", s720pSizeMap=" + this.bravo + ", previewSize=" + this.charlie + ", s1440pSizeMap=" + this.delta + ", recordSize=" + this.echo + ", maximumSizeMap=" + this.foxtrot + ", ultraMaximumSizeMap=" + this.golf + "}";
    }
}
