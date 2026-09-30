package R6;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.w;
import com.google.android.material.internal.x;
import s6.AbstractC2728o0;

/* loaded from: classes2.dex */
public final class b extends AbstractC2728o0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    private final void delta(int i4) {
    }

    @Override // s6.AbstractC2728o0
    public final void bravo(int i4) {
        switch (this.alpha) {
            case 0:
                return;
            default:
                x xVar = (x) this.bravo;
                xVar.echo = true;
                w wVar = (w) xVar.foxtrot.get();
                if (wVar != null) {
                    wVar.alpha();
                    return;
                }
                return;
        }
    }

    @Override // s6.AbstractC2728o0
    public final void charlie(Typeface typeface, boolean z2) {
        CharSequence text;
        switch (this.alpha) {
            case 0:
                Chip chip = (Chip) this.bravo;
                f fVar = chip.teal;
                if (fVar.f1968F0) {
                    text = fVar.f1971H;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z2) {
                    x xVar = (x) this.bravo;
                    xVar.echo = true;
                    w wVar = (w) xVar.foxtrot.get();
                    if (wVar != null) {
                        wVar.alpha();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
