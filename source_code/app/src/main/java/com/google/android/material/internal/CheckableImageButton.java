package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.customview.view.AbsSavedState;
import s1.au;

/* loaded from: classes2.dex */
public class CheckableImageButton extends androidx.appcompat.widget.ac implements Checkable {
    public static final int[] yellow = {R.attr.state_checked};
    public boolean silver;
    public boolean teal;
    public boolean white;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public boolean red;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.red = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.red ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, delivery.samurai.android.R.attr.imageButtonStyle);
        this.teal = true;
        this.white = true;
        au.november(this, new com.google.android.material.button.e(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.silver;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        if (this.silver) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i4 + 1), yellow);
        }
        return super.onCreateDrawableState(i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.alpha);
        setChecked(savedState.red);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, com.google.android.material.internal.CheckableImageButton$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.red = this.silver;
        return absSavedState;
    }

    public void setCheckable(boolean z2) {
        if (this.teal != z2) {
            this.teal = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.teal && this.silver != z2) {
            this.silver = z2;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z2) {
        this.white = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.white) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.silver);
    }
}
