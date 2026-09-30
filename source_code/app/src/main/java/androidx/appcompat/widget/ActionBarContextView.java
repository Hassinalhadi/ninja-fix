package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import delivery.samurai.android.R;
import t6.AbstractC3032n3;

/* loaded from: classes3.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a */
    public boolean f2768a;
    public final Fe.d alpha;

    /* renamed from: b */
    public CharSequence f2769b;

    /* renamed from: c */
    public CharSequence f2770c;

    /* renamed from: d */
    public View f2771d;
    public View e;

    /* renamed from: f */
    public View f2772f;

    /* renamed from: g */
    public LinearLayout f2773g;

    /* renamed from: h */
    public TextView f2774h;

    /* renamed from: i */
    public TextView f2775i;

    /* renamed from: j */
    public final int f2776j;

    /* renamed from: k */
    public final int f2777k;

    /* renamed from: l */
    public boolean f2778l;

    /* renamed from: m */
    public final int f2779m;
    public final Context purple;
    public ActionMenuView red;
    public C0469n silver;
    public int teal;
    public s1.az white;
    public boolean yellow;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        this.alpha = new Fe.d(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.purple = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.purple = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aj.a.delta, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = AbstractC3032n3.echo(resourceId, context);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.f2776j = obtainStyledAttributes.getResourceId(5, 0);
        this.f2777k = obtainStyledAttributes.getResourceId(4, 0);
        this.teal = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f2779m = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void alpha(ActionBarContextView actionBarContextView) {
        super.setVisibility(0);
    }

    public static /* synthetic */ void bravo(ActionBarContextView actionBarContextView, int i4) {
        super.setVisibility(i4);
    }

    public static int foxtrot(View view, int i4, int i5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, RecyclerView.UNDEFINED_DURATION), i5);
        return Math.max(0, i4 - view.getMeasuredWidth());
    }

    public static int golf(View view, boolean z2, int i4, int i5, int i10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = ((i10 - measuredHeight) / 2) + i5;
        if (z2) {
            view.layout(i4 - measuredWidth, i11, i4, measuredHeight + i11);
        } else {
            view.layout(i4, i11, i4 + measuredWidth, measuredHeight + i11);
        }
        if (z2) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void charlie(an.b bVar) {
        View view = this.f2771d;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f2779m, (ViewGroup) this, false);
            this.f2771d = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f2771d);
        }
        View findViewById = this.f2771d.findViewById(R.id.action_mode_close_button);
        this.e = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC0445b(0, bVar));
        ao.l charlie = bVar.charlie();
        C0469n c0469n = this.silver;
        if (c0469n != null) {
            c0469n.golf();
            C0455g c0455g = c0469n.f2913n;
            if (c0455g != null && c0455g.bravo()) {
                c0455g.india.dismiss();
            }
        }
        C0469n c0469n2 = new C0469n(getContext());
        this.silver = c0469n2;
        c0469n2.f2905f = true;
        c0469n2.f2906g = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        charlie.bravo(this.silver, this.purple);
        C0469n c0469n3 = this.silver;
        ao.z zVar = c0469n3.f2901a;
        if (zVar == null) {
            ao.z zVar2 = (ao.z) c0469n3.silver.inflate(c0469n3.white, (ViewGroup) this, false);
            c0469n3.f2901a = zVar2;
            zVar2.alpha(c0469n3.red);
            c0469n3.india();
        }
        ao.z zVar3 = c0469n3.f2901a;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(c0469n3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.red = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.red, layoutParams);
    }

    public final void delta() {
        int i4;
        if (this.f2773g == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2773g = linearLayout;
            this.f2774h = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f2775i = (TextView) this.f2773g.findViewById(R.id.action_bar_subtitle);
            int i5 = this.f2776j;
            if (i5 != 0) {
                this.f2774h.setTextAppearance(getContext(), i5);
            }
            int i10 = this.f2777k;
            if (i10 != 0) {
                this.f2775i.setTextAppearance(getContext(), i10);
            }
        }
        this.f2774h.setText(this.f2769b);
        this.f2775i.setText(this.f2770c);
        boolean isEmpty = TextUtils.isEmpty(this.f2769b);
        boolean isEmpty2 = TextUtils.isEmpty(this.f2770c);
        TextView textView = this.f2775i;
        int i11 = 8;
        if (!isEmpty2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView.setVisibility(i4);
        LinearLayout linearLayout2 = this.f2773g;
        if (!isEmpty || !isEmpty2) {
            i11 = 0;
        }
        linearLayout2.setVisibility(i11);
        if (this.f2773g.getParent() == null) {
            addView(this.f2773g);
        }
    }

    public final void echo() {
        removeAllViews();
        this.f2772f = null;
        this.red = null;
        this.silver = null;
        View view = this.e;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.white != null) {
            return this.alpha.bravo;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.teal;
    }

    public CharSequence getSubtitle() {
        return this.f2770c;
    }

    public CharSequence getTitle() {
        return this.f2769b;
    }

    @Override // android.view.View
    /* renamed from: hotel */
    public final void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            s1.az azVar = this.white;
            if (azVar != null) {
                azVar.bravo();
            }
            super.setVisibility(i4);
        }
    }

    public final s1.az india(int i4, long j5) {
        s1.az azVar = this.white;
        if (azVar != null) {
            azVar.bravo();
        }
        Fe.d dVar = this.alpha;
        if (i4 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            s1.az alpha = s1.au.alpha(this);
            alpha.alpha(1.0f);
            alpha.charlie(j5);
            ((ActionBarContextView) dVar.charlie).white = alpha;
            dVar.bravo = i4;
            alpha.delta(dVar);
            return alpha;
        }
        s1.az alpha2 = s1.au.alpha(this);
        alpha2.alpha(0.0f);
        alpha2.charlie(j5);
        ((ActionBarContextView) dVar.charlie).white = alpha2;
        dVar.bravo = i4;
        alpha2.delta(dVar);
        return alpha2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i4;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, aj.a.alpha, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0469n c0469n = this.silver;
        if (c0469n != null) {
            Configuration configuration2 = c0469n.purple.getResources().getConfiguration();
            int i5 = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i5 <= 600 && ((i5 <= 960 || i10 <= 720) && (i5 <= 720 || i10 <= 960))) {
                if (i5 < 500 && ((i5 <= 640 || i10 <= 480) && (i5 <= 480 || i10 <= 640))) {
                    if (i5 >= 360) {
                        i4 = 3;
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 4;
                }
            } else {
                i4 = 5;
            }
            c0469n.f2909j = i4;
            ao.l lVar = c0469n.red;
            if (lVar != null) {
                lVar.papa(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0469n c0469n = this.silver;
        if (c0469n != null) {
            c0469n.golf();
            C0455g c0455g = this.silver.f2913n;
            if (c0455g != null && c0455g.bravo()) {
                c0455g.india.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2768a = false;
        }
        if (!this.f2768a) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2768a = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f2768a = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        boolean z10;
        int paddingLeft;
        int paddingRight;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11 = m1.alpha;
        if (getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            paddingLeft = (i10 - i4) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i11 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2771d;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2771d.getLayoutParams();
            if (z10) {
                i12 = marginLayoutParams.rightMargin;
            } else {
                i12 = marginLayoutParams.leftMargin;
            }
            if (z10) {
                i13 = marginLayoutParams.leftMargin;
            } else {
                i13 = marginLayoutParams.rightMargin;
            }
            if (z10) {
                i14 = paddingLeft - i12;
            } else {
                i14 = paddingLeft + i12;
            }
            int golf = golf(this.f2771d, z10, i14, paddingTop, paddingTop2) + i14;
            if (z10) {
                i15 = golf - i13;
            } else {
                i15 = golf + i13;
            }
            paddingLeft = i15;
        }
        LinearLayout linearLayout = this.f2773g;
        if (linearLayout != null && this.f2772f == null && linearLayout.getVisibility() != 8) {
            paddingLeft += golf(this.f2773g, z10, paddingLeft, paddingTop, paddingTop2);
        }
        View view2 = this.f2772f;
        if (view2 != null) {
            golf(view2, z10, paddingLeft, paddingTop, paddingTop2);
        }
        if (z10) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i10 - i4) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.red;
        if (actionMenuView != null) {
            golf(actionMenuView, !z10, paddingRight, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int i10;
        boolean z2;
        int i11;
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i4) == 1073741824) {
            if (View.MeasureSpec.getMode(i5) != 0) {
                int size = View.MeasureSpec.getSize(i4);
                int i13 = this.teal;
                if (i13 <= 0) {
                    i13 = View.MeasureSpec.getSize(i5);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i14 = i13 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, RecyclerView.UNDEFINED_DURATION);
                View view = this.f2771d;
                if (view != null) {
                    int foxtrot = foxtrot(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2771d.getLayoutParams();
                    paddingLeft = foxtrot - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.red;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = foxtrot(this.red, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.f2773g;
                if (linearLayout != null && this.f2772f == null) {
                    if (this.f2778l) {
                        this.f2773g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f2773g.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f2773g;
                        if (z2) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        linearLayout2.setVisibility(i11);
                    } else {
                        paddingLeft = foxtrot(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.f2772f;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i15 = layoutParams.width;
                    if (i15 != -2) {
                        i10 = 1073741824;
                    } else {
                        i10 = Integer.MIN_VALUE;
                    }
                    if (i15 >= 0) {
                        paddingLeft = Math.min(i15, paddingLeft);
                    }
                    int i16 = layoutParams.height;
                    if (i16 == -2) {
                        i12 = Integer.MIN_VALUE;
                    }
                    if (i16 >= 0) {
                        i14 = Math.min(i16, i14);
                    }
                    this.f2772f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i10), View.MeasureSpec.makeMeasureSpec(i14, i12));
                }
                if (this.teal <= 0) {
                    int childCount = getChildCount();
                    int i17 = 0;
                    for (int i18 = 0; i18 < childCount; i18++) {
                        int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i17) {
                            i17 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i17);
                    return;
                }
                setMeasuredDimension(size, i13);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.yellow = false;
        }
        if (!this.yellow) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.yellow = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.yellow = false;
        return true;
    }

    public void setContentHeight(int i4) {
        this.teal = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2772f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2772f = view;
        if (view != null && (linearLayout = this.f2773g) != null) {
            removeView(linearLayout);
            this.f2773g = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2770c = charSequence;
        delta();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2769b = charSequence;
        delta();
        s1.au.oscar(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f2778l) {
            requestLayout();
        }
        this.f2778l = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
