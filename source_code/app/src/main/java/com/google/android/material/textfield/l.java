package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import ao.ad;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import id.C1915c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s6.AbstractC2719n0;
import t6.AbstractC3032n3;

/* loaded from: classes2.dex */
public final class l extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final F0.e f8224a;
    public final TextInputLayout alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f8225b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f8226c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f8227d;
    public PorterDuff.Mode e;

    /* renamed from: f, reason: collision with root package name */
    public int f8228f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView.ScaleType f8229g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnLongClickListener f8230h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f8231i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f8232j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8233k;

    /* renamed from: l, reason: collision with root package name */
    public EditText f8234l;

    /* renamed from: m, reason: collision with root package name */
    public final AccessibilityManager f8235m;

    /* renamed from: n, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f8236n;

    /* renamed from: o, reason: collision with root package name */
    public final j f8237o;
    public final FrameLayout purple;
    public final CheckableImageButton red;
    public ColorStateList silver;
    public PorterDuff.Mode teal;
    public View.OnLongClickListener white;
    public final CheckableImageButton yellow;

    public l(TextInputLayout textInputLayout, C1915c c1915c) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f8225b = 0;
        this.f8226c = new LinkedHashSet();
        this.f8237o = new j(this);
        k kVar = new k(this);
        this.f8235m = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.alpha = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.purple = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton alpha = alpha(this, from, R.id.text_input_error_icon);
        this.red = alpha;
        CheckableImageButton alpha2 = alpha(frameLayout, from, R.id.text_input_end_icon);
        this.yellow = alpha2;
        this.f8224a = new F0.e(this, c1915c);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f8232j = appCompatTextView;
        TypedArray typedArray = (TypedArray) c1915c.red;
        if (typedArray.hasValue(38)) {
            this.silver = AbstractC2719n0.bravo(getContext(), c1915c, 38);
        }
        if (typedArray.hasValue(39)) {
            this.teal = z.hotel(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            india(c1915c.oscar(37));
        }
        alpha.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        alpha.setImportantForAccessibility(2);
        alpha.setClickable(false);
        alpha.setPressable(false);
        alpha.setCheckable(false);
        alpha.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f8227d = AbstractC2719n0.bravo(getContext(), c1915c, 32);
            }
            if (typedArray.hasValue(33)) {
                this.e = z.hotel(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            golf(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && alpha2.getContentDescription() != (text = typedArray.getText(27))) {
                alpha2.setContentDescription(text);
            }
            alpha2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f8227d = AbstractC2719n0.bravo(getContext(), c1915c, 55);
            }
            if (typedArray.hasValue(56)) {
                this.e = z.hotel(typedArray.getInt(56, -1), null);
            }
            golf(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (alpha2.getContentDescription() != text2) {
                alpha2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f8228f) {
                this.f8228f = dimensionPixelSize;
                alpha2.setMinimumWidth(dimensionPixelSize);
                alpha2.setMinimumHeight(dimensionPixelSize);
                alpha.setMinimumWidth(dimensionPixelSize);
                alpha.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType bravo = r6.s.bravo(typedArray.getInt(31, -1));
                this.f8229g = bravo;
                alpha2.setScaleType(bravo);
                alpha.setScaleType(bravo);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
            if (typedArray.hasValue(74)) {
                appCompatTextView.setTextColor(c1915c.november(74));
            }
            CharSequence text3 = typedArray.getText(72);
            this.f8231i = TextUtils.isEmpty(text3) ? null : text3;
            appCompatTextView.setText(text3);
            november();
            frameLayout.addView(alpha2);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(alpha);
            textInputLayout.f8176V.add(kVar);
            if (textInputLayout.teal != null) {
                kVar.alpha(textInputLayout);
            }
            addOnAttachStateChangeListener(new B8.b(6, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton alpha(ViewGroup viewGroup, LayoutInflater layoutInflater, int i4) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i4);
        if (AbstractC2719n0.foxtrot(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final m bravo() {
        m dVar;
        int i4 = this.f8225b;
        F0.e eVar = this.f8224a;
        SparseArray sparseArray = (SparseArray) eVar.delta;
        m mVar = (m) sparseArray.get(i4);
        if (mVar == null) {
            l lVar = (l) eVar.echo;
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                dVar = new i(lVar);
                            } else {
                                throw new IllegalArgumentException(ad.zulu(i4, "Invalid end icon mode: "));
                            }
                        } else {
                            dVar = new c(lVar);
                        }
                    } else {
                        dVar = new t(lVar, eVar.charlie);
                    }
                } else {
                    dVar = new d(lVar, 1);
                }
            } else {
                dVar = new d(lVar, 0);
            }
            sparseArray.append(i4, dVar);
            return dVar;
        }
        return mVar;
    }

    public final int charlie() {
        int marginStart;
        if (!delta() && !echo()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.yellow;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return this.f8232j.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean delta() {
        if (this.purple.getVisibility() == 0 && this.yellow.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean echo() {
        if (this.red.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void foxtrot(boolean z2) {
        boolean z10;
        boolean isActivated;
        boolean z11;
        m bravo = bravo();
        boolean kilo = bravo.kilo();
        CheckableImageButton checkableImageButton = this.yellow;
        boolean z12 = true;
        if (kilo && (z11 = checkableImageButton.silver) != bravo.lima()) {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        } else {
            z10 = false;
        }
        if ((bravo instanceof i) && (isActivated = checkableImageButton.isActivated()) != bravo.juliet()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z12 = z10;
        }
        if (!z2 && !z12) {
            return;
        }
        r6.s.charlie(this.alpha, checkableImageButton, this.f8227d);
    }

    public final void golf(int i4) {
        boolean z2;
        Drawable drawable;
        if (this.f8225b == i4) {
            return;
        }
        m bravo = bravo();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f8236n;
        AccessibilityManager accessibilityManager = this.f8235m;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        CharSequence charSequence = null;
        this.f8236n = null;
        bravo.sierra();
        this.f8225b = i4;
        Iterator it = this.f8226c.iterator();
        if (!it.hasNext()) {
            if (i4 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            hotel(z2);
            m bravo2 = bravo();
            int i5 = this.f8224a.bravo;
            if (i5 == 0) {
                i5 = bravo2.delta();
            }
            if (i5 != 0) {
                drawable = AbstractC3032n3.echo(i5, getContext());
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.yellow;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.alpha;
            if (drawable != null) {
                r6.s.alpha(textInputLayout, checkableImageButton, this.f8227d, this.e);
                r6.s.charlie(textInputLayout, checkableImageButton, this.f8227d);
            }
            int charlie = bravo2.charlie();
            if (charlie != 0) {
                charSequence = getResources().getText(charlie);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(bravo2.kilo());
            if (bravo2.india(textInputLayout.getBoxBackgroundMode())) {
                bravo2.romeo();
                AccessibilityManager.TouchExplorationStateChangeListener hotel = bravo2.hotel();
                this.f8236n = hotel;
                if (hotel != null && accessibilityManager != null && isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(this.f8236n);
                }
                View.OnClickListener foxtrot = bravo2.foxtrot();
                View.OnLongClickListener onLongClickListener = this.f8230h;
                checkableImageButton.setOnClickListener(foxtrot);
                r6.s.delta(checkableImageButton, onLongClickListener);
                EditText editText = this.f8234l;
                if (editText != null) {
                    bravo2.mike(editText);
                    juliet(bravo2);
                }
                r6.s.alpha(textInputLayout, checkableImageButton, this.f8227d, this.e);
                foxtrot(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i4);
        }
        throw ad.yankee(it);
    }

    public final void hotel(boolean z2) {
        int i4;
        if (delta() != z2) {
            if (z2) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            this.yellow.setVisibility(i4);
            kilo();
            mike();
            this.alpha.sierra();
        }
    }

    public final void india(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.red;
        checkableImageButton.setImageDrawable(drawable);
        lima();
        r6.s.alpha(this.alpha, checkableImageButton, this.silver, this.teal);
    }

    public final void juliet(m mVar) {
        if (this.f8234l != null) {
            if (mVar.echo() != null) {
                this.f8234l.setOnFocusChangeListener(mVar.echo());
            }
            if (mVar.golf() != null) {
                this.yellow.setOnFocusChangeListener(mVar.golf());
            }
        }
    }

    public final void kilo() {
        int i4;
        boolean z2;
        int i5 = 8;
        if (this.yellow.getVisibility() == 0 && !echo()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        this.purple.setVisibility(i4);
        if (this.f8231i != null && !this.f8233k) {
            z2 = false;
        } else {
            z2 = 8;
        }
        if (delta() || echo() || !z2) {
            i5 = 0;
        }
        setVisibility(i5);
    }

    public final void lima() {
        int i4;
        CheckableImageButton checkableImageButton = this.red;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.alpha;
        if (drawable != null && textInputLayout.f8184d.quebec && textInputLayout.oscar()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        checkableImageButton.setVisibility(i4);
        kilo();
        mike();
        if (this.f8225b != 0) {
            return;
        }
        textInputLayout.sierra();
    }

    public final void mike() {
        int i4;
        TextInputLayout textInputLayout = this.alpha;
        if (textInputLayout.teal == null) {
            return;
        }
        if (!delta() && !echo()) {
            i4 = textInputLayout.teal.getPaddingEnd();
        } else {
            i4 = 0;
        }
        this.f8232j.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.teal.getPaddingTop(), i4, textInputLayout.teal.getPaddingBottom());
    }

    public final void november() {
        int i4;
        AppCompatTextView appCompatTextView = this.f8232j;
        int visibility = appCompatTextView.getVisibility();
        boolean z2 = false;
        if (this.f8231i != null && !this.f8233k) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        if (visibility != i4) {
            m bravo = bravo();
            if (i4 == 0) {
                z2 = true;
            }
            bravo.papa(z2);
        }
        kilo();
        appCompatTextView.setVisibility(i4);
        this.alpha.sierra();
    }
}
