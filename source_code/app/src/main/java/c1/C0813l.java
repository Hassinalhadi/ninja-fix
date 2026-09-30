package c1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: c1.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0813l {
    public int alpha;
    public int bravo;
    public float charlie;
    public float delta;

    public final void alpha(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0820s.hotel);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 1) {
                this.charlie = obtainStyledAttributes.getFloat(index, this.charlie);
            } else if (index == 0) {
                int i5 = obtainStyledAttributes.getInt(index, this.alpha);
                this.alpha = i5;
                this.alpha = C0815n.delta[i5];
            } else if (index == 4) {
                this.bravo = obtainStyledAttributes.getInt(index, this.bravo);
            } else if (index == 3) {
                this.delta = obtainStyledAttributes.getFloat(index, this.delta);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
