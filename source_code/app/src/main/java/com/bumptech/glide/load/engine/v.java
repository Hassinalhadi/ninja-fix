package com.bumptech.glide.load.engine;

/* loaded from: classes3.dex */
public final class v implements w, Z3.b {
    public static final J2.t teal = Z3.d.alpha(20, new u8.b(18));
    public final Z3.e alpha = new Object();
    public w purple;
    public boolean red;
    public boolean silver;

    public final synchronized void alpha() {
        this.alpha.alpha();
        if (this.red) {
            this.red = false;
            if (this.silver) {
                bravo();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final synchronized void bravo() {
        this.alpha.alpha();
        this.silver = true;
        if (!this.red) {
            this.purple.bravo();
            this.purple = null;
            teal.alpha(this);
        }
    }

    @Override // Z3.b
    public final Z3.e charlie() {
        return this.alpha;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final Class delta() {
        return this.purple.delta();
    }

    @Override // com.bumptech.glide.load.engine.w
    public final Object get() {
        return this.purple.get();
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        return this.purple.getSize();
    }
}
