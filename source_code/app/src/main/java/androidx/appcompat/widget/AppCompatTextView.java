package androidx.appcompat.widget;

import ae.AbstractC0422a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j1.AbstractC1933g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import s6.AbstractC2662g6;
import s6.D5;
import t6.A3;
import t6.AbstractC3032n3;
import t6.AbstractC3051r3;

/* loaded from: classes3.dex */
public class AppCompatTextView extends TextView implements androidx.core.widget.l {
    private final C0480t mBackgroundTintHelper;
    private ab mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<q1.e> mPrecomputedTextFuture;
    private E mSuperCaller;
    private final ax mTextClassifierHelper;
    private final D mTextHelper;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private ab getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new ab(this);
        }
        return this.mEmojiTextViewHelper;
    }

    public final void delta() {
        Future<q1.e> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    A3.charlie(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            c0480t.alpha();
        }
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (m1.charlie) {
            return super.getAutoSizeMaxTextSize();
        }
        D d4 = this.mTextHelper;
        if (d4 != null) {
            return Math.round(d4.india.echo);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (m1.charlie) {
            return super.getAutoSizeMinTextSize();
        }
        D d4 = this.mTextHelper;
        if (d4 != null) {
            return Math.round(d4.india.delta);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (m1.charlie) {
            return super.getAutoSizeStepGranularity();
        }
        D d4 = this.mTextHelper;
        if (d4 != null) {
            return Math.round(d4.india.charlie);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (m1.charlie) {
            return super.getAutoSizeTextAvailableSizes();
        }
        D d4 = this.mTextHelper;
        if (d4 != null) {
            return d4.india.foxtrot;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (m1.charlie) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        D d4 = this.mTextHelper;
        if (d4 == null) {
            return 0;
        }
        return d4.india.alpha;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return A3.papa(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public E getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                this.mSuperCaller = new G(this);
            } else if (i4 >= 28) {
                this.mSuperCaller = new F(this);
            } else if (i4 >= 26) {
                this.mSuperCaller = new C0465l(2, this);
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            return c0480t.bravo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            return c0480t.charlie();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.delta();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.echo();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        delta();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        ax axVar;
        if (Build.VERSION.SDK_INT >= 28 || (axVar = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = axVar.bravo;
        if (textClassifier == null) {
            return aw.alpha(axVar.alpha);
        }
        return textClassifier;
    }

    public q1.d getTextMetricsParamsCompat() {
        return A3.charlie(this);
    }

    public boolean isEmojiCompatEnabled() {
        return ((AbstractC2662g6) getEmojiTextViewHelper().bravo.purple).charlie();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            u1.c.alpha(editorInfo, getText());
        }
        AbstractC3051r3.bravo(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30 && i4 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        D d4 = this.mTextHelper;
        if (d4 != null && !m1.charlie) {
            d4.india.alpha();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        delta();
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        super.onTextChanged(charSequence, i4, i5, i10);
        D d4 = this.mTextHelper;
        if (d4 != null && !m1.charlie && d4.india.foxtrot()) {
            this.mTextHelper.india.alpha();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().bravo(z2);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i10, int i11) throws IllegalArgumentException {
        if (m1.charlie) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i10, i11);
            return;
        }
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.hotel(i4, i5, i10, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) throws IllegalArgumentException {
        if (m1.charlie) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.india(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (m1.charlie) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.juliet(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            c0480t.echo();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            c0480t.foxtrot(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A3.quebec(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().charlie(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC2662g6) getEmojiTextViewHelper().bravo.purple).bravo(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().charlie(i4);
        } else {
            A3.lima(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().alpha(i4);
        } else {
            A3.mike(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        A3.november(this, i4);
    }

    public void setPrecomputedText(q1.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        A3.charlie(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            c0480t.hotel(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            c0480t.india(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.kilo(colorStateList);
        this.mTextHelper.bravo();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.lima(mode);
        this.mTextHelper.bravo();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.golf(i4, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        ax axVar;
        if (Build.VERSION.SDK_INT >= 28 || (axVar = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            axVar.bravo = textClassifier;
        }
    }

    public void setTextFuture(Future<q1.e> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(q1.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.bravo;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i4 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i4 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i4 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i4 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i4 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i4 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i4 = 7;
            }
        }
        setTextDirection(i4);
        getPaint().set(dVar.alpha);
        setBreakStrategy(dVar.charlie);
        setHyphenationFrequency(dVar.delta);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f5) {
        boolean z2 = m1.charlie;
        if (z2) {
            super.setTextSize(i4, f5);
            return;
        }
        D d4 = this.mTextHelper;
        if (d4 != null && !z2) {
            M m4 = d4.india;
            if (!m4.foxtrot()) {
                m4.golf(f5, i4);
            }
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i4) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface != null && i4 > 0) {
            Context context = getContext();
            D5 d52 = AbstractC1933g.alpha;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i4);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, androidx.appcompat.widget.ax] */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        T0.alpha(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        S0.alpha(getContext(), this);
        C0480t c0480t = new C0480t(this);
        this.mBackgroundTintHelper = c0480t;
        c0480t.delta(attributeSet, i4);
        D d4 = new D(this);
        this.mTextHelper = d4;
        d4.foxtrot(attributeSet, i4);
        d4.bravo();
        ?? obj = new Object();
        obj.alpha = this;
        this.mTextClassifierHelper = obj;
        getEmojiTextViewHelper().alpha(attributeSet, i4);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4, float f5) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            getSuperCaller().delta(i4, f5);
        } else if (i5 >= 34) {
            AbstractC0422a.oscar(this, i4, f5);
        } else {
            A3.november(this, Math.round(TypedValue.applyDimension(i4, f5, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? AbstractC3032n3.echo(i4, context) : null, i5 != 0 ? AbstractC3032n3.echo(i5, context) : null, i10 != 0 ? AbstractC3032n3.echo(i10, context) : null, i11 != 0 ? AbstractC3032n3.echo(i11, context) : null);
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? AbstractC3032n3.echo(i4, context) : null, i5 != 0 ? AbstractC3032n3.echo(i5, context) : null, i10 != 0 ? AbstractC3032n3.echo(i10, context) : null, i11 != 0 ? AbstractC3032n3.echo(i11, context) : null);
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.bravo();
        }
    }
}
