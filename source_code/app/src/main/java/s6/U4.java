package s6;

import android.graphics.Paint;
import android.text.Layout;

/* loaded from: classes2.dex */
public abstract class U4 {
    public static final /* synthetic */ int alpha = 0;

    public static final float alpha(Layout layout, int i4, Paint paint) {
        int i5;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i4);
        E0.q qVar = E0.s.alpha;
        if (layout.getEllipsisCount(i4) <= 0 || layout.getParagraphDirection(i4) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i4) + layout.getLineStart(i4)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i4);
        if (paragraphAlignment == null) {
            i5 = -1;
        } else {
            i5 = G0.d.$EnumSwitchMapping$0[paragraphAlignment.ordinal()];
        }
        if (i5 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float bravo(Layout layout, int i4, Paint paint) {
        float width;
        float width2;
        E0.q qVar = E0.s.alpha;
        if (layout.getEllipsisCount(i4) > 0) {
            int i5 = -1;
            if (layout.getParagraphDirection(i4) == -1 && layout.getWidth() < layout.getLineRight(i4)) {
                float measureText = paint.measureText("…") + (layout.getLineRight(i4) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i4) + layout.getLineStart(i4)));
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i4);
                if (paragraphAlignment != null) {
                    i5 = G0.d.$EnumSwitchMapping$0[paragraphAlignment.ordinal()];
                }
                if (i5 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i4);
                    width2 = (layout.getWidth() - measureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i4);
                    width2 = layout.getWidth() - measureText;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }
}
