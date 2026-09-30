package androidx.camera.core.impl;

/* loaded from: classes3.dex */
public final class DeferrableSurface$SurfaceClosedException extends Exception {
    ah mDeferrableSurface;

    public DeferrableSurface$SurfaceClosedException(String str, ah ahVar) {
        super(str);
        this.mDeferrableSurface = ahVar;
    }

    public ah getDeferrableSurface() {
        return this.mDeferrableSurface;
    }
}
