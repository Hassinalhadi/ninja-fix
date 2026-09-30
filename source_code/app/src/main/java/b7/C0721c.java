package b7;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: b7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0721c extends androidx.vectordrawable.graphics.drawable.c {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ View bravo;

    public /* synthetic */ C0721c(int i4, View view) {
        this.alpha = i4;
        this.bravo = view;
    }

    @Override // androidx.vectordrawable.graphics.drawable.c
    public final void onAnimationEnd(Drawable drawable) {
        switch (this.alpha) {
            case 0:
                AbstractC0722d abstractC0722d = (AbstractC0722d) this.bravo;
                abstractC0722d.setIndeterminate(false);
                abstractC0722d.charlie(abstractC0722d.purple);
                return;
            case 1:
                AbstractC0722d abstractC0722d2 = (AbstractC0722d) this.bravo;
                if (!abstractC0722d2.white) {
                    abstractC0722d2.setVisibility(abstractC0722d2.yellow);
                    return;
                }
                return;
            default:
                ColorStateList colorStateList = ((com.google.android.material.checkbox.b) this.bravo).f7952h;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    return;
                }
                return;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.c
    public void onAnimationStart(Drawable drawable) {
        switch (this.alpha) {
            case 2:
                super.onAnimationStart(drawable);
                com.google.android.material.checkbox.b bVar = (com.google.android.material.checkbox.b) this.bravo;
                ColorStateList colorStateList = bVar.f7952h;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(bVar.f7956l, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                super.onAnimationStart(drawable);
                return;
        }
    }
}
