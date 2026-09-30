package U0;

import android.graphics.Rect;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class aa extends ab {
    @Override // U0.ab
    public final void alpha(z zVar, int i4, int i5) {
        zVar.setSystemGestureExclusionRects(CollectionsKt.white(new Rect(0, 0, i4, i5)));
    }
}
