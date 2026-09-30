package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes3.dex */
public final class X extends Transition.EpicenterCallback {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Rect bravo;

    public /* synthetic */ X(int i4, Rect rect) {
        this.alpha = i4;
        this.bravo = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.alpha) {
            case 0:
                return this.bravo;
            default:
                Rect rect = this.bravo;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
