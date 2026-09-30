package b7;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;
import s6.O5;

/* loaded from: classes2.dex */
public final class n extends O5 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ n(int i4) {
        this.alpha = i4;
    }

    @Override // s6.O5
    public final float golf(Object obj) {
        float displayedWidthIncrease;
        switch (this.alpha) {
            case 0:
                return ((o) obj).f3348j.bravo * 10000.0f;
            default:
                displayedWidthIncrease = ((MaterialButton) obj).getDisplayedWidthIncrease();
                return displayedWidthIncrease;
        }
    }

    @Override // s6.O5
    public final void mike(Object obj, float f5) {
        int i4 = 1;
        switch (this.alpha) {
            case 0:
                o oVar = (o) obj;
                oVar.f3348j.bravo = f5 / 10000.0f;
                oVar.invalidateSelf();
                int i5 = (int) f5;
                if (oVar.purple.bravo(true)) {
                    float f10 = 0.0f;
                    if (oVar.f3352n == null) {
                        LinearInterpolator linearInterpolator = M6.a.alpha;
                        Context context = oVar.alpha;
                        oVar.f3354p = x2.q.foxtrot(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        oVar.f3355q = x2.q.foxtrot(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        oVar.f3352n = valueAnimator;
                        valueAnimator.setDuration(500L);
                        oVar.f3352n.setFloatValues(0.0f, 1.0f);
                        oVar.f3352n.setInterpolator(null);
                        oVar.f3352n.addUpdateListener(new P6.b(i4, oVar));
                    }
                    float f11 = i5;
                    if (f11 >= 1000.0f && f11 <= 9000.0f) {
                        f10 = 1.0f;
                    }
                    if (f10 != oVar.f3349k) {
                        if (oVar.f3352n.isRunning()) {
                            oVar.f3352n.cancel();
                        }
                        oVar.f3349k = f10;
                        if (f10 == 1.0f) {
                            oVar.f3353o = oVar.f3354p;
                            oVar.f3352n.start();
                            return;
                        } else {
                            oVar.f3353o = oVar.f3355q;
                            oVar.f3352n.reverse();
                            return;
                        }
                    }
                    if (!oVar.f3352n.isRunning()) {
                        oVar.f3348j.echo = f10;
                        oVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f5);
                return;
        }
    }
}
