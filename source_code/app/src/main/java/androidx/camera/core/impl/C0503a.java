package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* renamed from: androidx.camera.core.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0503a {
    public final C0510h alpha;
    public final int bravo;
    public final Size charlie;
    public final androidx.camera.core.t delta;
    public final List echo;
    public final au.a foxtrot;
    public final Range golf;

    public C0503a(C0510h c0510h, int i4, Size size, androidx.camera.core.t tVar, List list, au.a aVar, Range range) {
        if (c0510h != null) {
            this.alpha = c0510h;
            this.bravo = i4;
            if (size != null) {
                this.charlie = size;
                if (tVar != null) {
                    this.delta = tVar;
                    if (list != null) {
                        this.echo = list;
                        this.foxtrot = aVar;
                        this.golf = range;
                        return;
                    }
                    throw new NullPointerException("Null captureTypes");
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0503a) {
                C0503a c0503a = (C0503a) obj;
                if (this.alpha.equals(c0503a.alpha) && this.bravo == c0503a.bravo && this.charlie.equals(c0503a.charlie) && this.delta.equals(c0503a.delta) && this.echo.equals(c0503a.echo)) {
                    au.a aVar = c0503a.foxtrot;
                    au.a aVar2 = this.foxtrot;
                    if (aVar2 == null) {
                        if (aVar != null) {
                            return false;
                        }
                    } else if (!aVar2.equals(aVar)) {
                        return false;
                    }
                    Range range = c0503a.golf;
                    Range range2 = this.golf;
                    if (range2 == null) {
                        if (range == null) {
                            return true;
                        }
                        return false;
                    }
                    if (range2.equals(range)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo) * 1000003) ^ this.charlie.hashCode()) * 1000003) ^ this.delta.hashCode()) * 1000003) ^ this.echo.hashCode()) * 1000003;
        int i4 = 0;
        au.a aVar = this.foxtrot;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i5 = (hashCode2 ^ hashCode) * 1000003;
        Range range = this.golf;
        if (range != null) {
            i4 = range.hashCode();
        }
        return i5 ^ i4;
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.alpha + ", imageFormat=" + this.bravo + ", size=" + this.charlie + ", dynamicRange=" + this.delta + ", captureTypes=" + this.echo + ", implementationOptions=" + this.foxtrot + ", targetFrameRate=" + this.golf + "}";
    }
}
