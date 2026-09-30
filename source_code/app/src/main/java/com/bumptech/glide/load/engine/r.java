package com.bumptech.glide.load.engine;

/* loaded from: classes3.dex */
public final class r implements w {
    public final boolean alpha;
    public final boolean purple;
    public final w red;
    public final l silver;
    public final q teal;
    public int white;
    public boolean yellow;

    public r(w wVar, boolean z2, boolean z10, q qVar, l lVar) {
        Y3.f.charlie(wVar, "Argument must not be null");
        this.red = wVar;
        this.alpha = z2;
        this.purple = z10;
        this.teal = qVar;
        Y3.f.charlie(lVar, "Argument must not be null");
        this.silver = lVar;
    }

    public final synchronized void alpha() {
        if (!this.yellow) {
            this.white++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final synchronized void bravo() {
        if (this.white <= 0) {
            if (!this.yellow) {
                this.yellow = true;
                if (this.purple) {
                    this.red.bravo();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final void charlie() {
        boolean z2;
        synchronized (this) {
            int i4 = this.white;
            if (i4 > 0) {
                z2 = true;
                int i5 = i4 - 1;
                this.white = i5;
                if (i5 != 0) {
                    z2 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z2) {
            this.silver.foxtrot(this.teal, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final Class delta() {
        return this.red.delta();
    }

    @Override // com.bumptech.glide.load.engine.w
    public final Object get() {
        return this.red.get();
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        return this.red.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.alpha + ", listener=" + this.silver + ", key=" + this.teal + ", acquired=" + this.white + ", isRecycled=" + this.yellow + ", resource=" + this.red + '}';
    }
}
