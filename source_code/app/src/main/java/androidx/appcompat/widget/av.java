package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import id.C1915c;
import t6.AbstractC3032n3;

/* loaded from: classes3.dex */
public final class av extends Spinner {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2870b = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2871a;
    public final C0480t alpha;
    public final Context purple;
    public final am red;
    public SpinnerAdapter silver;
    public final boolean teal;
    public final au white;
    public int yellow;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public av(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, delivery.samurai.android.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f2871a = new Rect();
        S0.alpha(getContext(), this);
        int[] iArr = aj.a.whiskey;
        C1915c victor = C1915c.victor(context, attributeSet, iArr, delivery.samurai.android.R.attr.spinnerStyle);
        this.alpha = new C0480t(this);
        TypedArray typedArray2 = (TypedArray) victor.red;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.purple = new an.d(context, resourceId);
        } else {
            this.purple = context;
        }
        int i4 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f2870b, delivery.samurai.android.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i4 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i4 != 0) {
            if (i4 == 1) {
                at atVar = new at(this, this.purple, attributeSet);
                C1915c victor2 = C1915c.victor(this.purple, attributeSet, iArr, delivery.samurai.android.R.attr.spinnerStyle);
                this.yellow = ((TypedArray) victor2.red).getLayoutDimension(3, -2);
                atVar.india(victor2.oscar(1));
                atVar.f2866w = typedArray2.getString(2);
                victor2.xray();
                this.white = atVar;
                this.red = new am(this, this, atVar);
            }
        } else {
            ap apVar = new ap(this);
            this.white = apVar;
            apVar.red = typedArray2.getString(2);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(delivery.samurai.android.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        victor.xray();
        this.teal = true;
        SpinnerAdapter spinnerAdapter = this.silver;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.silver = null;
        }
        this.alpha.delta(attributeSet, delivery.samurai.android.R.attr.spinnerStyle);
    }

    public final int alpha(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i5 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f2871a;
            drawable.getPadding(rect);
            return rect.left + rect.right + i5;
        }
        return i5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.alpha();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        au auVar = this.white;
        if (auVar != null) {
            return auVar.bravo();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        au auVar = this.white;
        if (auVar != null) {
            return auVar.november();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.white != null) {
            return this.yellow;
        }
        return super.getDropDownWidth();
    }

    public final au getInternalPopup() {
        return this.white;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        au auVar = this.white;
        if (auVar != null) {
            return auVar.echo();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.purple;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        au auVar = this.white;
        if (auVar != null) {
            return auVar.delta();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            return c0480t.bravo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            return c0480t.charlie();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        au auVar = this.white;
        if (auVar != null && auVar.alpha()) {
            auVar.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.white != null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), alpha(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (appCompatSpinner$SavedState.alpha && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new an(0, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, androidx.appcompat.widget.AppCompatSpinner$SavedState] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        au auVar = this.white;
        if (auVar != null && auVar.alpha()) {
            z2 = true;
        } else {
            z2 = false;
        }
        baseSavedState.alpha = z2;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        am amVar = this.red;
        if (amVar != null && amVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        au auVar = this.white;
        if (auVar != null) {
            if (!auVar.alpha()) {
                this.white.mike(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.echo();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.foxtrot(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        au auVar = this.white;
        if (auVar != null) {
            auVar.lima(i4);
            auVar.charlie(i4);
        } else {
            super.setDropDownHorizontalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        au auVar = this.white;
        if (auVar != null) {
            auVar.kilo(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.white != null) {
            this.yellow = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        au auVar = this.white;
        if (auVar != null) {
            auVar.india(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(AbstractC3032n3.echo(i4, getPopupContext()));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        au auVar = this.white;
        if (auVar != null) {
            auVar.foxtrot(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.hotel(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.india(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.appcompat.widget.aq, android.widget.ListAdapter, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.teal) {
            this.silver = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        au auVar = this.white;
        if (auVar != 0) {
            Context context = this.purple;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.alpha = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.purple = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ao.alpha((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            auVar.oscar(obj);
        }
    }
}
