package androidx.camera.core;

import android.util.Size;

/* loaded from: classes3.dex */
public final class D extends w {
    public final Object silver;
    public final ap teal;
    public final int white;
    public final int yellow;

    public D(ar arVar, Size size, ap apVar) {
        super(arVar);
        this.silver = new Object();
        if (size == null) {
            this.white = this.purple.bravo();
            this.yellow = this.purple.alpha();
        } else {
            this.white = size.getWidth();
            this.yellow = size.getHeight();
        }
        this.teal = apVar;
    }

    @Override // androidx.camera.core.w, androidx.camera.core.ar
    public final int alpha() {
        return this.yellow;
    }

    @Override // androidx.camera.core.w, androidx.camera.core.ar
    public final int bravo() {
        return this.white;
    }

    @Override // androidx.camera.core.w, androidx.camera.core.ar
    public final ap red() {
        return this.teal;
    }
}
