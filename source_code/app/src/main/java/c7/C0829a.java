package c7;

import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ah;
import s6.AbstractC2815x7;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0829a extends ah {
    public static final int[][] yellow = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList teal;
    public boolean white;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.teal == null) {
            int charlie = AbstractC2815x7.charlie(delivery.samurai.android.R.attr.colorControlActivated, this);
            int charlie2 = AbstractC2815x7.charlie(delivery.samurai.android.R.attr.colorOnSurface, this);
            int charlie3 = AbstractC2815x7.charlie(delivery.samurai.android.R.attr.colorSurface, this);
            this.teal = new ColorStateList(yellow, new int[]{AbstractC2815x7.golf(1.0f, charlie3, charlie), AbstractC2815x7.golf(0.54f, charlie3, charlie2), AbstractC2815x7.golf(0.38f, charlie3, charlie2), AbstractC2815x7.golf(0.38f, charlie3, charlie2)});
        }
        return this.teal;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.white && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.white = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
