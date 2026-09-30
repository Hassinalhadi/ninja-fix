package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0450d0;
import s1.au;
import t6.AbstractC3056s3;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends d implements ao.y {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f8041k = {R.attr.state_checked};

    /* renamed from: a, reason: collision with root package name */
    public boolean f8042a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8043b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8044c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckedTextView f8045d;
    public FrameLayout e;

    /* renamed from: f, reason: collision with root package name */
    public ao.n f8046f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f8047g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8048h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f8049i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.material.button.e f8050j;
    public int yellow;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8044c = true;
        com.google.android.material.button.e eVar = new com.google.android.material.button.e(3, this);
        this.f8050j = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(delivery.samurai.android.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(delivery.samurai.android.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(delivery.samurai.android.R.id.design_menu_item_text);
        this.f8045d = checkedTextView;
        au.november(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.e == null) {
                this.e = (FrameLayout) ((ViewStub) findViewById(delivery.samurai.android.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.e.removeAllViews();
            this.e.addView(view);
        }
    }

    @Override // ao.y
    public final void charlie(ao.n nVar) {
        int i4;
        StateListDrawable stateListDrawable;
        this.f8046f = nVar;
        int i5 = nVar.alpha;
        if (i5 > 0) {
            setId(i5);
        }
        if (nVar.isVisible()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        setVisibility(i4);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(delivery.samurai.android.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f8041k, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.teal);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.f3227j);
        AbstractC3056s3.alpha(this, nVar.f3228k);
        ao.n nVar2 = this.f8046f;
        CharSequence charSequence = nVar2.teal;
        CheckedTextView checkedTextView = this.f8045d;
        if (charSequence == null && nVar2.getIcon() == null && this.f8046f.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.e;
            if (frameLayout != null) {
                C0450d0 c0450d0 = (C0450d0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0450d0).width = -1;
                this.e.setLayoutParams(c0450d0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.e;
        if (frameLayout2 != null) {
            C0450d0 c0450d02 = (C0450d0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0450d02).width = -2;
            this.e.setLayoutParams(c0450d02);
        }
    }

    @Override // ao.y
    public ao.n getItemData() {
        return this.f8046f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        ao.n nVar = this.f8046f;
        if (nVar != null && nVar.isCheckable() && this.f8046f.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f8041k);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f8043b != z2) {
            this.f8043b = z2;
            this.f8050j.hotel(this.f8045d, 2048);
        }
    }

    public void setChecked(boolean z2) {
        int i4;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f8045d;
        checkedTextView.setChecked(z2);
        Typeface typeface = checkedTextView.getTypeface();
        if (z2 && this.f8044c) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        checkedTextView.setTypeface(typeface, i4);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, getPaddingTop(), i4, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f8048h) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f8047g);
            }
            int i4 = this.yellow;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.f8042a) {
            if (this.f8049i == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = i1.k.alpha;
                Drawable drawable2 = resources.getDrawable(delivery.samurai.android.R.drawable.navigation_empty_icon, theme);
                this.f8049i = drawable2;
                if (drawable2 != null) {
                    int i5 = this.yellow;
                    drawable2.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.f8049i;
        }
        this.f8045d.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i4) {
        this.f8045d.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(int i4) {
        this.yellow = i4;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z2;
        this.f8047g = colorStateList;
        if (colorStateList != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f8048h = z2;
        ao.n nVar = this.f8046f;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.f8045d.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f8042a = z2;
    }

    public void setTextAppearance(int i4) {
        this.f8045d.setTextAppearance(i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f8045d.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f8045d.setText(charSequence);
    }
}
