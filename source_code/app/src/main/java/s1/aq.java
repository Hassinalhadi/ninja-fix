package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class aq {
    public static View.AccessibilityDelegate alpha(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void bravo(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4, int i5) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i4, i5);
    }
}
