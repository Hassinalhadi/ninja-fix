package u1;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes3.dex */
public abstract class c {
    public static final String[] alpha = new String[0];

    public static void alpha(EditorInfo editorInfo, CharSequence charSequence) {
        int i4;
        int i5;
        CharSequence subSequence;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            AbstractC3136a.alpha(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i10 >= 30) {
            AbstractC3136a.alpha(editorInfo, charSequence);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        if (i11 > i12) {
            i4 = i12;
        } else {
            i4 = i11;
        }
        if (i11 <= i12) {
            i11 = i12;
        }
        int length = charSequence.length();
        if (i4 >= 0 && i11 <= length) {
            int i13 = editorInfo.inputType & 4095;
            if (i13 != 129 && i13 != 225 && i13 != 18) {
                if (length <= 2048) {
                    charlie(editorInfo, charSequence, i4, i11);
                    return;
                }
                int i14 = i11 - i4;
                if (i14 > 1024) {
                    i5 = 0;
                } else {
                    i5 = i14;
                }
                int i15 = 2048 - i5;
                int min = Math.min(charSequence.length() - i11, i15 - Math.min(i4, (int) (i15 * 0.8d)));
                int min2 = Math.min(i4, i15 - min);
                int i16 = i4 - min2;
                if (Character.isLowSurrogate(charSequence.charAt(i16))) {
                    i16++;
                    min2--;
                }
                if (Character.isHighSurrogate(charSequence.charAt((i11 + min) - 1))) {
                    min--;
                }
                int i17 = min2 + i5;
                int i18 = i17 + min;
                if (i5 != i14) {
                    subSequence = TextUtils.concat(charSequence.subSequence(i16, i16 + min2), charSequence.subSequence(i11, min + i11));
                } else {
                    subSequence = charSequence.subSequence(i16, i18 + i16);
                }
                charlie(editorInfo, subSequence, min2, i17);
                return;
            }
            charlie(editorInfo, null, 0, 0);
            return;
        }
        charlie(editorInfo, null, 0, 0);
    }

    public static void bravo(EditorInfo editorInfo, boolean z2) {
        if (Build.VERSION.SDK_INT >= 35) {
            b.alpha(editorInfo, z2);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z2);
    }

    public static void charlie(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i4);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }
}
