package E;

import a0.C0366t;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;

/* loaded from: classes3.dex */
public final class t extends RippleDrawable {
    public final boolean alpha;
    public C0366t purple;
    public Integer red;
    public boolean silver;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(boolean z2) {
        super(r0, null, r2);
        ColorDrawable colorDrawable;
        ColorStateList valueOf = ColorStateList.valueOf(ShapeBuilder.DEFAULT_SHAPE_COLOR);
        if (z2) {
            colorDrawable = new ColorDrawable(-1);
        } else {
            colorDrawable = null;
        }
        this.alpha = z2;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.alpha) {
            this.silver = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.silver = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.silver;
    }
}
