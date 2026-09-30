package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public abstract class d implements E3.m {
    @Override // E3.m
    public final com.bumptech.glide.load.engine.w bravo(Context context, com.bumptech.glide.load.engine.w wVar, int i4, int i5) {
        if (Y3.l.india(i4, i5)) {
            G3.b bVar = com.bumptech.glide.b.alpha(context).alpha;
            Bitmap bitmap = (Bitmap) wVar.get();
            if (i4 == Integer.MIN_VALUE) {
                i4 = bitmap.getWidth();
            }
            if (i5 == Integer.MIN_VALUE) {
                i5 = bitmap.getHeight();
            }
            Bitmap charlie = charlie(bVar, bitmap, i4, i5);
            if (bitmap.equals(charlie)) {
                return wVar;
            }
            return c.charlie(bVar, charlie);
        }
        throw new IllegalArgumentException(P0.azure(i4, i5, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }

    public abstract Bitmap charlie(G3.b bVar, Bitmap bitmap, int i4, int i5);
}
