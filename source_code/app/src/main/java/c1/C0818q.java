package c1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: c1.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0818q extends View {
    public boolean alpha;

    public C0818q(Context context) {
        super(context);
        this.alpha = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.alpha = z2;
    }

    public void setGuidelineBegin(int i4) {
        C0806e c0806e = (C0806e) getLayoutParams();
        if (this.alpha && c0806e.alpha == i4) {
            return;
        }
        c0806e.alpha = i4;
        setLayoutParams(c0806e);
    }

    public void setGuidelineEnd(int i4) {
        C0806e c0806e = (C0806e) getLayoutParams();
        if (this.alpha && c0806e.bravo == i4) {
            return;
        }
        c0806e.bravo = i4;
        setLayoutParams(c0806e);
    }

    public void setGuidelinePercent(float f5) {
        C0806e c0806e = (C0806e) getLayoutParams();
        if (this.alpha && c0806e.charlie == f5) {
            return;
        }
        c0806e.charlie = f5;
        setLayoutParams(c0806e);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
    }
}
