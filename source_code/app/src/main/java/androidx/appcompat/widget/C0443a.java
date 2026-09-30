package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0443a extends Drawable {
    public final ActionBarContainer alpha;

    public C0443a(ActionBarContainer actionBarContainer) {
        this.alpha = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.alpha;
        if (actionBarContainer.yellow) {
            Drawable drawable = actionBarContainer.white;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.silver;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.teal;
        if (drawable3 != null && actionBarContainer.f2766a) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.alpha;
        if (actionBarContainer.yellow) {
            if (actionBarContainer.white != null) {
                actionBarContainer.silver.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.silver;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
