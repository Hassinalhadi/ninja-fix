package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class c implements E3.f {
    public final E3.f bravo;
    public final E3.f charlie;

    public c(E3.f fVar, E3.f fVar2) {
        this.bravo = fVar;
        this.charlie = fVar2;
    }

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        this.bravo.alpha(messageDigest);
        this.charlie.alpha(messageDigest);
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.bravo.equals(cVar.bravo) && this.charlie.equals(cVar.charlie)) {
                return true;
            }
        }
        return false;
    }

    @Override // E3.f
    public final int hashCode() {
        return this.charlie.hashCode() + (this.bravo.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.bravo + ", signature=" + this.charlie + '}';
    }
}
