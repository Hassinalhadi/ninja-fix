package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import id.C1915c;
import s6.AbstractC2719n0;

/* loaded from: classes2.dex */
public final class u extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public ImageView.ScaleType f8242a;
    public final TextInputLayout alpha;

    /* renamed from: b, reason: collision with root package name */
    public View.OnLongClickListener f8243b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8244c;
    public final AppCompatTextView purple;
    public CharSequence red;
    public final CheckableImageButton silver;
    public ColorStateList teal;
    public PorterDuff.Mode white;
    public int yellow;

    public u(TextInputLayout textInputLayout, C1915c c1915c) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.alpha = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.silver = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.purple = appCompatTextView;
        if (AbstractC2719n0.foxtrot(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f8243b;
        checkableImageButton.setOnClickListener(null);
        r6.s.delta(checkableImageButton, onLongClickListener);
        this.f8243b = null;
        checkableImageButton.setOnLongClickListener(null);
        r6.s.delta(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c1915c.red;
        if (typedArray.hasValue(70)) {
            this.teal = AbstractC2719n0.bravo(getContext(), c1915c, 70);
        }
        if (typedArray.hasValue(71)) {
            this.white = z.hotel(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            bravo(c1915c.oscar(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.yellow) {
                this.yellow = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(69)) {
                ImageView.ScaleType bravo = r6.s.bravo(typedArray.getInt(69, -1));
                this.f8242a = bravo;
                checkableImageButton.setScaleType(bravo);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray.getResourceId(61, 0));
            if (typedArray.hasValue(62)) {
                appCompatTextView.setTextColor(c1915c.november(62));
            }
            CharSequence text2 = typedArray.getText(60);
            this.red = TextUtils.isEmpty(text2) ? null : text2;
            appCompatTextView.setText(text2);
            echo();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int alpha() {
        int i4;
        CheckableImageButton checkableImageButton = this.silver;
        if (checkableImageButton.getVisibility() == 0) {
            i4 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i4 = 0;
        }
        return this.purple.getPaddingStart() + getPaddingStart() + i4;
    }

    public final void bravo(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.silver;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.teal;
            PorterDuff.Mode mode = this.white;
            TextInputLayout textInputLayout = this.alpha;
            r6.s.alpha(textInputLayout, checkableImageButton, colorStateList, mode);
            charlie(true);
            r6.s.charlie(textInputLayout, checkableImageButton, this.teal);
            return;
        }
        charlie(false);
        View.OnLongClickListener onLongClickListener = this.f8243b;
        checkableImageButton.setOnClickListener(null);
        r6.s.delta(checkableImageButton, onLongClickListener);
        this.f8243b = null;
        checkableImageButton.setOnLongClickListener(null);
        r6.s.delta(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void charlie(boolean z2) {
        boolean z10;
        CheckableImageButton checkableImageButton = this.silver;
        int i4 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != z2) {
            if (!z2) {
                i4 = 8;
            }
            checkableImageButton.setVisibility(i4);
            delta();
            echo();
        }
    }

    public final void delta() {
        int paddingStart;
        EditText editText = this.alpha.teal;
        if (editText == null) {
            return;
        }
        if (this.silver.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            paddingStart = editText.getPaddingStart();
        }
        this.purple.setPaddingRelative(paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void echo() {
        int i4;
        int i5 = 8;
        if (this.red != null && !this.f8244c) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        if (this.silver.getVisibility() == 0 || i4 == 0) {
            i5 = 0;
        }
        setVisibility(i5);
        this.purple.setVisibility(i4);
        this.alpha.sierra();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        delta();
    }
}
