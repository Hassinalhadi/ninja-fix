package R6;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import g7.aa;
import g7.z;

/* loaded from: classes2.dex */
public final class c extends ViewOutlineProvider {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ c(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.alpha) {
            case 0:
                f fVar = ((Chip) this.bravo).teal;
                if (fVar != null) {
                    fVar.getOutline(outline);
                    return;
                } else {
                    outline.setAlpha(0.0f);
                    return;
                }
            case 1:
                z zVar = (z) this.bravo;
                if (zVar.charlie != null && !zVar.delta.isEmpty()) {
                    RectF rectF = zVar.delta;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, zVar.golf);
                    return;
                }
                return;
            default:
                Path path = ((aa) this.bravo).echo;
                if (!path.isEmpty()) {
                    outline.setPath(path);
                    return;
                }
                return;
        }
    }
}
