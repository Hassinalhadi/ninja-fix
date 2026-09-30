package androidx.camera.core;

import android.graphics.Matrix;
import android.media.Image;
import androidx.camera.core.impl.V;

/* renamed from: androidx.camera.core.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0494a implements ar, AutoCloseable {
    public final Image alpha;
    public final O7.l[] purple;
    public final C0498e red;

    public C0494a(Image image) {
        this.alpha = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.purple = new O7.l[planes.length];
            for (int i4 = 0; i4 < planes.length; i4++) {
                this.purple[i4] = new O7.l(23, planes[i4]);
            }
        } else {
            this.purple = new O7.l[0];
        }
        this.red = new C0498e(V.bravo, image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.ar
    public final int alpha() {
        return this.alpha.getHeight();
    }

    @Override // androidx.camera.core.ar
    public final int bravo() {
        return this.alpha.getWidth();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.alpha.close();
    }

    @Override // androidx.camera.core.ar
    public final int getFormat() {
        return this.alpha.getFormat();
    }

    @Override // androidx.camera.core.ar
    public final Image k() {
        return this.alpha;
    }

    @Override // androidx.camera.core.ar
    public final O7.l[] lima() {
        return this.purple;
    }

    @Override // androidx.camera.core.ar
    public final ap red() {
        return this.red;
    }
}
