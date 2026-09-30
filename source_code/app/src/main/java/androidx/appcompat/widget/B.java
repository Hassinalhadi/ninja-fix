package androidx.appcompat.widget;

import android.widget.TextView;

/* loaded from: classes3.dex */
public abstract class B {
    public static int alpha(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void bravo(TextView textView, int i4, int i5, int i10, int i11) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i10, i11);
    }

    public static void charlie(TextView textView, int[] iArr, int i4) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
    }

    public static boolean delta(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
