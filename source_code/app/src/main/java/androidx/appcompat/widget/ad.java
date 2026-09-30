package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import id.C1915c;
import t6.AbstractC3032n3;

/* loaded from: classes3.dex */
public final class ad {
    public final ImageView alpha;
    public U0 bravo;
    public int charlie = 0;

    public ad(ImageView imageView) {
        this.alpha = imageView;
    }

    public final void alpha() {
        U0 u02;
        ImageView imageView = this.alpha;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            S.alpha(drawable);
        }
        if (drawable != null && (u02 = this.bravo) != null) {
            C0488x.echo(drawable, u02, imageView.getDrawableState());
        }
    }

    public final void bravo(AttributeSet attributeSet, int i4) {
        int resourceId;
        ImageView imageView = this.alpha;
        Context context = imageView.getContext();
        int[] iArr = aj.a.foxtrot;
        C1915c victor = C1915c.victor(context, attributeSet, iArr, i4);
        s1.au.mike(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) victor.red, i4);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) victor.red;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC3032n3.echo(resourceId, imageView.getContext())) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                S.alpha(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(victor.november(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(S.bravo(typedArray.getInt(3, -1), null));
            }
            victor.xray();
        } catch (Throwable th) {
            victor.xray();
            throw th;
        }
    }

    public final void charlie(int i4) {
        ImageView imageView = this.alpha;
        if (i4 != 0) {
            Drawable echo = AbstractC3032n3.echo(i4, imageView.getContext());
            if (echo != null) {
                S.alpha(echo);
            }
            imageView.setImageDrawable(echo);
        } else {
            imageView.setImageDrawable(null);
        }
        alpha();
    }
}
