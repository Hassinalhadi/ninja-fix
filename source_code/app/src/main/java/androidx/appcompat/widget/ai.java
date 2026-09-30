package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public final class ai extends RatingBar {
    public final ag alpha;

    public ai(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        S0.alpha(getContext(), this);
        ag agVar = new ag(this);
        this.alpha = agVar;
        agVar.alpha(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        Bitmap bitmap = this.alpha.bravo;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }
}
