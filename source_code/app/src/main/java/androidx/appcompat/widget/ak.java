package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public final class ak extends SeekBar {
    public final al alpha;

    public ak(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        S0.alpha(getContext(), this);
        al alVar = new al(this);
        this.alpha = alVar;
        alVar.alpha(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        al alVar = this.alpha;
        Drawable drawable = alVar.echo;
        if (drawable != null && drawable.isStateful()) {
            ak akVar = alVar.delta;
            if (drawable.setState(akVar.getDrawableState())) {
                akVar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.alpha.echo;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.alpha.delta(canvas);
    }
}
