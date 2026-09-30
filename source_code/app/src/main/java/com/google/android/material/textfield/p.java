package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.SecurityGuardBrige.ArchersSmoothLoginers.FeatureAccessGuard;
import delivery.samurai.android.R;
import java.util.ArrayList;
import s6.AbstractC2719n0;
import s6.AbstractC2752q6;

/* loaded from: classes2.dex */
public final class p {
    public final int alpha;
    public ColorStateList amber;
    public Typeface azure;
    public final int bravo;
    public final int charlie;
    public final TimeInterpolator delta;
    public final TimeInterpolator echo;
    public final TimeInterpolator foxtrot;
    public final Context golf;
    public final TextInputLayout hotel;
    public LinearLayout india;
    public int juliet;
    public FrameLayout kilo;
    public AnimatorSet lima;
    public final float mike;
    public int november;
    public int oscar;
    public CharSequence papa;
    public boolean quebec;
    public AppCompatTextView romeo;
    public CharSequence sierra;
    public int tango;
    public int uniform;
    public ColorStateList victor;
    public CharSequence whiskey;
    public boolean xray;
    public AppCompatTextView yankee;
    public int zulu;

    public p(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.golf = context;
        this.hotel = textInputLayout;
        this.mike = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.alpha = x2.q.echo(context, R.attr.motionDurationShort4, 217);
        this.bravo = x2.q.echo(context, R.attr.motionDurationMedium4, FeatureAccessGuard.FEATURE_PANEL);
        this.charlie = x2.q.echo(context, R.attr.motionDurationShort4, FeatureAccessGuard.FEATURE_PANEL);
        this.delta = x2.q.foxtrot(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, M6.a.delta);
        LinearInterpolator linearInterpolator = M6.a.alpha;
        this.echo = x2.q.foxtrot(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.foxtrot = x2.q.foxtrot(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void alpha(AppCompatTextView appCompatTextView, int i4) {
        if (this.india == null && this.kilo == null) {
            Context context = this.golf;
            LinearLayout linearLayout = new LinearLayout(context);
            this.india = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.india;
            TextInputLayout textInputLayout = this.hotel;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.kilo = new FrameLayout(context);
            this.india.addView(this.kilo, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                bravo();
            }
        }
        if (i4 != 0 && i4 != 1) {
            this.india.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.kilo.setVisibility(0);
            this.kilo.addView(appCompatTextView);
        }
        this.india.setVisibility(0);
        this.juliet++;
    }

    public final void bravo() {
        if (this.india != null) {
            TextInputLayout textInputLayout = this.hotel;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.golf;
                boolean foxtrot = AbstractC2719n0.foxtrot(context);
                LinearLayout linearLayout = this.india;
                int paddingStart = editText.getPaddingStart();
                if (foxtrot) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (foxtrot) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (foxtrot) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void charlie() {
        AnimatorSet animatorSet = this.lima;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void delta(ArrayList arrayList, boolean z2, AppCompatTextView appCompatTextView, int i4, int i5, int i10) {
        boolean z10;
        float f5;
        long j5;
        TimeInterpolator timeInterpolator;
        if (appCompatTextView != null && z2) {
            if (i4 == i10 || i4 == i5) {
                if (i10 == i4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, f5);
                int i11 = this.charlie;
                if (z10) {
                    j5 = this.bravo;
                } else {
                    j5 = i11;
                }
                ofFloat.setDuration(j5);
                if (z10) {
                    timeInterpolator = this.echo;
                } else {
                    timeInterpolator = this.foxtrot;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i4 == i10 && i5 != 0) {
                    ofFloat.setStartDelay(i11);
                }
                arrayList.add(ofFloat);
                if (i10 == i4 && i5 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.mike, 0.0f);
                    ofFloat2.setDuration(this.alpha);
                    ofFloat2.setInterpolator(this.delta);
                    ofFloat2.setStartDelay(i11);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView echo(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                return null;
            }
            return this.yankee;
        }
        return this.romeo;
    }

    public final void foxtrot() {
        this.papa = null;
        charlie();
        if (this.november == 1) {
            if (this.xray && !TextUtils.isEmpty(this.whiskey)) {
                this.oscar = 2;
            } else {
                this.oscar = 0;
            }
        }
        india(this.november, this.oscar, hotel(this.romeo, ""));
    }

    public final void golf(AppCompatTextView appCompatTextView, int i4) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.india;
        if (linearLayout != null) {
            if ((i4 == 0 || i4 == 1) && (frameLayout = this.kilo) != null) {
                frameLayout.removeView(appCompatTextView);
            } else {
                linearLayout.removeView(appCompatTextView);
            }
            int i5 = this.juliet - 1;
            this.juliet = i5;
            LinearLayout linearLayout2 = this.india;
            if (i5 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean hotel(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.hotel;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            if (this.oscar != this.november || appCompatTextView == null || !TextUtils.equals(appCompatTextView.getText(), charSequence)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void india(int i4, int i5, boolean z2) {
        TextView echo;
        TextView echo2;
        if (i4 == i5) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.lima = animatorSet;
            ArrayList arrayList = new ArrayList();
            delta(arrayList, this.xray, this.yankee, 2, i4, i5);
            delta(arrayList, this.quebec, this.romeo, 1, i4, i5);
            AbstractC2752q6.bravo(animatorSet, arrayList);
            animatorSet.addListener(new n(this, i5, echo(i4), i4, echo(i5)));
            animatorSet.start();
        } else if (i4 != i5) {
            if (i5 != 0 && (echo2 = echo(i5)) != null) {
                echo2.setVisibility(0);
                echo2.setAlpha(1.0f);
            }
            if (i4 != 0 && (echo = echo(i4)) != null) {
                echo.setVisibility(4);
                if (i4 == 1) {
                    echo.setText((CharSequence) null);
                }
            }
            this.november = i5;
        }
        TextInputLayout textInputLayout = this.hotel;
        textInputLayout.tango();
        textInputLayout.whiskey(z2, false);
        textInputLayout.zulu();
    }
}
