package F;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import d0.C1575m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class J0 extends ViewOutlineProvider {
    public final /* synthetic */ int alpha;

    public /* synthetic */ J0(int i4) {
        this.alpha = i4;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.alpha) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 3:
                if ((view instanceof C1575m) && (outline2 = ((C1575m) view).teal) != null) {
                    outline.set(outline2);
                    return;
                }
                return;
            default:
                Intrinsics.charlie(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                ao.ad.cyan(view);
                throw null;
        }
    }
}
