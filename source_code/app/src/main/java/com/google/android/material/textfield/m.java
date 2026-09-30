package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import t1.C2952d;

/* loaded from: classes2.dex */
public abstract class m {
    public final TextInputLayout alpha;
    public final l bravo;
    public final Context charlie;
    public final CheckableImageButton delta;

    public m(l lVar) {
        this.alpha = lVar.alpha;
        this.bravo = lVar;
        this.charlie = lVar.getContext();
        this.delta = lVar.yellow;
    }

    public void alpha() {
    }

    public void bravo() {
    }

    public int charlie() {
        return 0;
    }

    public int delta() {
        return 0;
    }

    public View.OnFocusChangeListener echo() {
        return null;
    }

    public View.OnClickListener foxtrot() {
        return null;
    }

    public View.OnFocusChangeListener golf() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener hotel() {
        return null;
    }

    public boolean india(int i4) {
        return true;
    }

    public boolean juliet() {
        return false;
    }

    public boolean kilo() {
        return this instanceof i;
    }

    public boolean lima() {
        return false;
    }

    public void mike(EditText editText) {
    }

    public void november(C2952d c2952d) {
    }

    public void oscar(AccessibilityEvent accessibilityEvent) {
    }

    public void papa(boolean z2) {
    }

    public final void quebec() {
        this.bravo.foxtrot(false);
    }

    public void romeo() {
    }

    public void sierra() {
    }
}
