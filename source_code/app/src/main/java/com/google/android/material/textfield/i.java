package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.camera.core.impl.ai;
import delivery.samurai.android.R;
import l3.AbstractC2056a;
import t1.C2952d;

/* loaded from: classes2.dex */
public final class i extends m {
    public final int echo;
    public final int foxtrot;
    public final TimeInterpolator golf;
    public AutoCompleteTextView hotel;
    public final com.clevertap.android.sdk.inapp.fragment.a india;
    public final Ba.m juliet;
    public final h kilo;
    public boolean lima;
    public boolean mike;
    public boolean november;
    public long oscar;
    public AccessibilityManager papa;
    public ValueAnimator quebec;
    public ValueAnimator romeo;

    public i(l lVar) {
        super(lVar);
        this.india = new com.clevertap.android.sdk.inapp.fragment.a(5, this);
        this.juliet = new Ba.m(3, this);
        this.kilo = new h(0, this);
        this.oscar = Long.MAX_VALUE;
        this.foxtrot = x2.q.echo(lVar.getContext(), R.attr.motionDurationShort3, 67);
        this.echo = x2.q.echo(lVar.getContext(), R.attr.motionDurationShort3, 50);
        this.golf = x2.q.foxtrot(lVar.getContext(), R.attr.motionEasingLinearInterpolator, M6.a.alpha);
    }

    @Override // com.google.android.material.textfield.m
    public final void alpha() {
        if (this.papa.isTouchExplorationEnabled() && AbstractC2056a.bravo(this.hotel) && !this.delta.hasFocus()) {
            this.hotel.dismissDropDown();
        }
        this.hotel.post(new ai(25, this));
    }

    @Override // com.google.android.material.textfield.m
    public final int charlie() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.m
    public final int delta() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.m
    public final View.OnFocusChangeListener echo() {
        return this.juliet;
    }

    @Override // com.google.android.material.textfield.m
    public final View.OnClickListener foxtrot() {
        return this.india;
    }

    @Override // com.google.android.material.textfield.m
    public final AccessibilityManager.TouchExplorationStateChangeListener hotel() {
        return this.kilo;
    }

    @Override // com.google.android.material.textfield.m
    public final boolean india(int i4) {
        return i4 != 0;
    }

    @Override // com.google.android.material.textfield.m
    public final boolean juliet() {
        return this.lima;
    }

    @Override // com.google.android.material.textfield.m
    public final boolean lima() {
        return this.november;
    }

    @Override // com.google.android.material.textfield.m
    public final void mike(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.hotel = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new com.clevertap.android.sdk.inapp.fragment.b(2, this));
            this.hotel.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.g
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    i iVar = i.this;
                    iVar.mike = true;
                    iVar.oscar = SystemClock.uptimeMillis();
                    iVar.tango(false);
                }
            });
            this.hotel.setThreshold(0);
            TextInputLayout textInputLayout = this.alpha;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!AbstractC2056a.bravo(editText) && this.papa.isTouchExplorationEnabled()) {
                this.delta.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // com.google.android.material.textfield.m
    public final void november(C2952d c2952d) {
        boolean echo;
        if (!AbstractC2056a.bravo(this.hotel)) {
            c2952d.juliet(Spinner.class.getName());
        }
        int i4 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
        if (i4 >= 26) {
            echo = accessibilityNodeInfo.isShowingHintText();
        } else {
            echo = c2952d.echo(4);
        }
        if (echo) {
            if (i4 >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // com.google.android.material.textfield.m
    public final void oscar(AccessibilityEvent accessibilityEvent) {
        boolean z2;
        if (this.papa.isEnabled() && !AbstractC2056a.bravo(this.hotel)) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.november && !this.hotel.isPopupShowing()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z2) {
                uniform();
                this.mike = true;
                this.oscar = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // com.google.android.material.textfield.m
    public final void romeo() {
        int i4 = 3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.golf;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.foxtrot);
        ofFloat.addUpdateListener(new P6.b(i4, this));
        this.romeo = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.echo);
        ofFloat2.addUpdateListener(new P6.b(i4, this));
        this.quebec = ofFloat2;
        ofFloat2.addListener(new O6.b(7, this));
        this.papa = (AccessibilityManager) this.charlie.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.m
    public final void sierra() {
        AutoCompleteTextView autoCompleteTextView = this.hotel;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.hotel.setOnDismissListener(null);
        }
    }

    public final void tango(boolean z2) {
        if (this.november != z2) {
            this.november = z2;
            this.romeo.cancel();
            this.quebec.start();
        }
    }

    public final void uniform() {
        boolean z2;
        if (this.hotel == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.oscar;
        if (uptimeMillis >= 0 && uptimeMillis <= 300) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            this.mike = false;
        }
        if (!this.mike) {
            tango(!this.november);
            if (this.november) {
                this.hotel.requestFocus();
                this.hotel.showDropDown();
                return;
            } else {
                this.hotel.dismissDropDown();
                return;
            }
        }
        this.mike = false;
    }
}
