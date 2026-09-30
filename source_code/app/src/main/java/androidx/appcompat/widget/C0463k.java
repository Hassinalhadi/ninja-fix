package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import delivery.samurai.android.R;
import t6.AbstractC3056s3;

/* renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0463k extends AppCompatImageView implements InterfaceC0471o {
    public final /* synthetic */ C0469n alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0463k(C0469n c0469n, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.alpha = c0469n;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC3056s3.alpha(this, getContentDescription());
        setOnTouchListener(new C0461j(this, this));
    }

    @Override // androidx.appcompat.widget.InterfaceC0471o
    public final boolean alpha() {
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC0471o
    public final boolean bravo() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.alpha.november();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i4, int i5, int i10, int i11) {
        boolean frame = super.setFrame(i4, i5, i10, i11);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
