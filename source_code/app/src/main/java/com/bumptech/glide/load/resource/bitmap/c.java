package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes3.dex */
public final class c implements com.bumptech.glide.load.engine.w, com.bumptech.glide.load.engine.t {
    public final /* synthetic */ int alpha = 0;
    public final Object purple;
    public final Object red;

    public c(G3.b bVar, Bitmap bitmap) {
        Y3.f.charlie(bitmap, "Bitmap must not be null");
        this.purple = bitmap;
        Y3.f.charlie(bVar, "BitmapPool must not be null");
        this.red = bVar;
    }

    public static c charlie(G3.b bVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new c(bVar, bitmap);
    }

    @Override // com.bumptech.glide.load.engine.t
    public final void alpha() {
        switch (this.alpha) {
            case 0:
                ((Bitmap) this.purple).prepareToDraw();
                return;
            default:
                com.bumptech.glide.load.engine.w wVar = (com.bumptech.glide.load.engine.w) this.red;
                if (wVar instanceof com.bumptech.glide.load.engine.t) {
                    ((com.bumptech.glide.load.engine.t) wVar).alpha();
                    return;
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final void bravo() {
        switch (this.alpha) {
            case 0:
                ((G3.b) this.red).delta((Bitmap) this.purple);
                return;
            default:
                ((com.bumptech.glide.load.engine.w) this.red).bravo();
                return;
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final Class delta() {
        switch (this.alpha) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final Object get() {
        switch (this.alpha) {
            case 0:
                return (Bitmap) this.purple;
            default:
                return new BitmapDrawable((Resources) this.purple, (Bitmap) ((com.bumptech.glide.load.engine.w) this.red).get());
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        switch (this.alpha) {
            case 0:
                return Y3.l.charlie((Bitmap) this.purple);
            default:
                return ((com.bumptech.glide.load.engine.w) this.red).getSize();
        }
    }

    public c(Resources resources, com.bumptech.glide.load.engine.w wVar) {
        Y3.f.charlie(resources, "Argument must not be null");
        this.purple = resources;
        Y3.f.charlie(wVar, "Argument must not be null");
        this.red = wVar;
    }
}
