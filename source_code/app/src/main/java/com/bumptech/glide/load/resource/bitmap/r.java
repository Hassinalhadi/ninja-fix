package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class r implements E3.m {
    public final E3.m bravo;
    public final boolean charlie;

    public r(E3.m mVar, boolean z2) {
        this.bravo = mVar;
        this.charlie = z2;
    }

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        this.bravo.alpha(messageDigest);
    }

    @Override // E3.m
    public final com.bumptech.glide.load.engine.w bravo(Context context, com.bumptech.glide.load.engine.w wVar, int i4, int i5) {
        G3.b bVar = com.bumptech.glide.b.alpha(context).alpha;
        Drawable drawable = (Drawable) wVar.get();
        c alpha = q.alpha(bVar, drawable, i4, i5);
        if (alpha == null) {
            if (!this.charlie) {
                return wVar;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        com.bumptech.glide.load.engine.w bravo = this.bravo.bravo(context, alpha, i4, i5);
        if (bravo.equals(alpha)) {
            bravo.bravo();
            return wVar;
        }
        return new c(context.getResources(), bravo);
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.bravo.equals(((r) obj).bravo);
        }
        return false;
    }

    @Override // E3.f
    public final int hashCode() {
        return this.bravo.hashCode();
    }
}
