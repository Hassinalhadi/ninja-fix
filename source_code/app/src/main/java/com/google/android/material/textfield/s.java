package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0466l0;
import androidx.appcompat.widget.C0478s;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import java.util.List;
import java.util.Locale;
import l7.AbstractC2059a;
import s6.AbstractC2719n0;

/* loaded from: classes2.dex */
public final class s extends C0478s {

    /* renamed from: a, reason: collision with root package name */
    public final int f8238a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8239b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f8240c;

    /* renamed from: d, reason: collision with root package name */
    public int f8241d;
    public ColorStateList e;
    public final C0466l0 teal;
    public final AccessibilityManager white;
    public final Rect yellow;

    public s(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.yellow = new Rect();
        Context context2 = getContext();
        TypedArray golf = z.golf(context2, attributeSet, L6.a.sierra, R.attr.autoCompleteTextViewStyle, 2132083590, new int[0]);
        if (golf.hasValue(0) && golf.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f8238a = golf.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f8239b = golf.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (golf.hasValue(2)) {
            this.f8240c = ColorStateList.valueOf(golf.getColor(2, 0));
        }
        this.f8241d = golf.getColor(4, 0);
        this.e = AbstractC2719n0.alpha(context2, golf, 5);
        this.white = (AccessibilityManager) context2.getSystemService("accessibility");
        C0466l0 c0466l0 = new C0466l0(context2, null, R.attr.listPopupWindowStyle);
        this.teal = c0466l0;
        c0466l0.f2899r = true;
        c0466l0.f2900s.setFocusable(true);
        c0466l0.f2889h = this;
        c0466l0.f2900s.setInputMethodMode(2);
        c0466l0.oscar(getAdapter());
        c0466l0.f2890i = new q(this);
        if (golf.hasValue(6)) {
            setSimpleItems(golf.getResourceId(6, 0));
        }
        golf.recycle();
    }

    public final TextInputLayout bravo() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean charlie() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.white;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (charlie()) {
            this.teal.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f8240c;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout bravo = bravo();
        if (bravo != null && bravo.f8222y) {
            return bravo.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f8239b;
    }

    public int getSimpleItemSelectedColor() {
        return this.f8241d;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.e;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout bravo = bravo();
        if (bravo != null && bravo.f8222y && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.teal.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int selectedItemPosition;
        super.onMeasure(i4, i5);
        if (View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout bravo = bravo();
            int i10 = 0;
            if (adapter != null && bravo != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0466l0 c0466l0 = this.teal;
                if (!c0466l0.f2900s.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = c0466l0.red.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i11 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i10) {
                        view = null;
                        i10 = itemViewType;
                    }
                    view = adapter.getView(max, view, bravo);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i11 = Math.max(i11, view.getMeasuredWidth());
                }
                Drawable background = c0466l0.f2900s.getBackground();
                if (background != null) {
                    Rect rect = this.yellow;
                    background.getPadding(rect);
                    i11 += rect.left + rect.right;
                }
                i10 = bravo.getEndIconView().getMeasuredWidth() + i11;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i10), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (charlie()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t5) {
        super.setAdapter(t5);
        this.teal.oscar(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0466l0 c0466l0 = this.teal;
        if (c0466l0 != null) {
            c0466l0.india(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i4) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i4));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f8240c = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g7.i) {
            ((g7.i) dropDownBackground).quebec(this.f8240c);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.teal.f2891j = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i4) {
        super.setRawInputType(i4);
        TextInputLayout bravo = bravo();
        if (bravo != null) {
            bravo.uniform();
        }
    }

    public void setSimpleItemSelectedColor(int i4) {
        this.f8241d = i4;
        if (getAdapter() instanceof r) {
            ((r) getAdapter()).alpha();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.e = colorStateList;
        if (getAdapter() instanceof r) {
            ((r) getAdapter()).alpha();
        }
    }

    public void setSimpleItems(int i4) {
        setSimpleItems(getResources().getStringArray(i4));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (charlie()) {
            this.teal.golf();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new r(this, getContext(), this.f8238a, strArr));
    }
}
