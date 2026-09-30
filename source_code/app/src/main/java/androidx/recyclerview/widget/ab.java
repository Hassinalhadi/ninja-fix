package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import com.zendesk.service.HttpConstants;

/* loaded from: classes3.dex */
public final class ab implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ ab(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.purple;
        switch (this.alpha) {
            case 0:
                ad adVar = (ad) obj;
                int i4 = adVar.amber;
                ValueAnimator valueAnimator = adVar.zulu;
                if (i4 != 1) {
                    if (i4 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                adVar.amber = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(HttpConstants.HTTP_INTERNAL_ERROR);
                valueAnimator.start();
                return;
            default:
                ((StaggeredGridLayoutManager) obj).A();
                return;
        }
    }
}
