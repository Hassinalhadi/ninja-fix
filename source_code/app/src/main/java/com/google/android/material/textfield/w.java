package com.google.android.material.textfield;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import s1.C2569b;
import t1.C2952d;

/* loaded from: classes2.dex */
public final class w extends C2569b {
    public final TextInputLayout delta;

    public w(TextInputLayout textInputLayout) {
        this.delta = textInputLayout;
    }

    @Override // s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        CharSequence charSequence;
        boolean z2;
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.alpha;
        AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.delta;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z10 = textInputLayout.f8206o0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        u uVar = textInputLayout.purple;
        AppCompatTextView appCompatTextView = uVar.purple;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(uVar.silver);
        }
        if (!isEmpty) {
            c2952d.november(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            c2952d.november(str);
            if (!z10 && placeholderText != null) {
                c2952d.november(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c2952d.november(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 26) {
                if (i4 >= 26) {
                    accessibilityNodeInfo.setHintText(str);
                } else {
                    accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
                }
            } else {
                if (!isEmpty) {
                    str = ((Object) charSequence) + ", " + str;
                }
                c2952d.november(str);
            }
            if (i4 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                c2952d.hotel(4, isEmpty);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.f8184d.yankee;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.red.bravo().november(c2952d);
    }

    @Override // s1.C2569b
    public final void echo(View view, AccessibilityEvent accessibilityEvent) {
        super.echo(view, accessibilityEvent);
        this.delta.red.bravo().oscar(accessibilityEvent);
    }
}
