package G0;

import E0.q;
import E0.s;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.Intrinsics;
import s6.U4;

/* loaded from: classes3.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i4, int i5, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z2, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i13)) == layout.getLineCount() - 1) {
            q qVar = s.alpha;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float bravo = U4.bravo(layout, lineForOffset, paint) + U4.alpha(layout, lineForOffset, paint);
                if (bravo == 0.0f) {
                    return;
                }
                Intrinsics.checkNotNull(canvas);
                canvas.translate(bravo, 0.0f);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z2) {
        return 0;
    }
}
