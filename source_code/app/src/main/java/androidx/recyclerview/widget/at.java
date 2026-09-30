package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes3.dex */
public final class at extends ao {
    public final /* synthetic */ au alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(au auVar, Context context) {
        super(context);
        this.alpha = auVar;
    }

    @Override // androidx.recyclerview.widget.ao
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.ao
    public final int calculateTimeForScrolling(int i4) {
        return Math.min(100, super.calculateTimeForScrolling(i4));
    }

    @Override // androidx.recyclerview.widget.ao, androidx.recyclerview.widget.a0
    public final void onTargetFound(View view, b0 b0Var, Y y10) {
        au auVar = this.alpha;
        int[] alpha = auVar.alpha(auVar.alpha.getLayoutManager(), view);
        int i4 = alpha[0];
        int i5 = alpha[1];
        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i4), Math.abs(i5)));
        if (calculateTimeForDeceleration > 0) {
            DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
            y10.alpha = i4;
            y10.bravo = i5;
            y10.charlie = calculateTimeForDeceleration;
            y10.echo = decelerateInterpolator;
            y10.foxtrot = true;
        }
    }
}
