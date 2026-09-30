package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import g1.AbstractC1735d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l7.AbstractC2059a;
import s1.a0;
import s1.al;
import s1.au;
import s6.AbstractC2710m0;
import s6.AbstractC2719n0;
import x2.q;

/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public int A;
    public int B;
    public boolean C;

    /* renamed from: D, reason: collision with root package name */
    public int f7791D;

    /* renamed from: a, reason: collision with root package name */
    public int f7792a;
    public boolean alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f7793b;

    /* renamed from: c, reason: collision with root package name */
    public int f7794c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f7795d;
    public final com.google.android.material.internal.b e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.internal.b f7796f;

    /* renamed from: g, reason: collision with root package name */
    public final V6.a f7797g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7798h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7799i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7800j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f7801k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f7802l;

    /* renamed from: m, reason: collision with root package name */
    public int f7803m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7804n;

    /* renamed from: o, reason: collision with root package name */
    public ValueAnimator f7805o;

    /* renamed from: p, reason: collision with root package name */
    public long f7806p;
    public final int purple;

    /* renamed from: q, reason: collision with root package name */
    public final TimeInterpolator f7807q;

    /* renamed from: r, reason: collision with root package name */
    public final TimeInterpolator f7808r;
    public ViewGroup red;

    /* renamed from: s, reason: collision with root package name */
    public int f7809s;
    public View silver;

    /* renamed from: t, reason: collision with root package name */
    public h f7810t;
    public View teal;

    /* renamed from: u, reason: collision with root package name */
    public int f7811u;

    /* renamed from: v, reason: collision with root package name */
    public int f7812v;

    /* renamed from: w, reason: collision with root package name */
    public int f7813w;
    public int white;

    /* renamed from: x, reason: collision with root package name */
    public a0 f7814x;

    /* renamed from: y, reason: collision with root package name */
    public int f7815y;
    public int yellow;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7816z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, 2132083658), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        ColorStateList alpha;
        ColorStateList alpha2;
        TextUtils.TruncateAt truncateAt;
        int i4 = 28;
        this.alpha = true;
        this.f7795d = new Rect();
        this.f7809s = -1;
        this.f7815y = 0;
        this.A = 0;
        this.B = 0;
        this.f7791D = 0;
        Context context2 = getContext();
        this.f7812v = getResources().getConfiguration().orientation;
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.e = bVar;
        DecelerateInterpolator decelerateInterpolator = M6.a.echo;
        bVar.olive = decelerateInterpolator;
        bVar.lima(false);
        bVar.fuchsia = false;
        this.f7797g = new V6.a(context2);
        int[] iArr = L6.a.kilo;
        z.alpha(context2, attributeSet, R.attr.collapsingToolbarLayoutStyle, 2132083658);
        z.bravo(context2, attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, 2132083658, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, 2132083658);
        int i5 = obtainStyledAttributes.getInt(9, 8388691);
        int i10 = obtainStyledAttributes.getInt(2, 8388627);
        this.f7800j = obtainStyledAttributes.getInt(3, 1);
        bVar.xray(i5);
        bVar.sierra(i10);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.f7793b = dimensionPixelSize;
        this.f7792a = dimensionPixelSize;
        this.yellow = dimensionPixelSize;
        this.white = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(13)) {
            this.white = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.f7792a = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.yellow = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.f7793b = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            this.f7794c = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        }
        this.f7798h = obtainStyledAttributes.getBoolean(28, true);
        setTitle(obtainStyledAttributes.getText(26));
        bVar.whiskey(2132083247);
        bVar.quebec(2132083220);
        if (obtainStyledAttributes.hasValue(16)) {
            bVar.whiskey(obtainStyledAttributes.getResourceId(16, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            bVar.quebec(obtainStyledAttributes.getResourceId(4, 0));
        }
        if (obtainStyledAttributes.hasValue(31)) {
            int i11 = obtainStyledAttributes.getInt(31, -1);
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 3) {
                        truncateAt = TextUtils.TruncateAt.END;
                    } else {
                        truncateAt = TextUtils.TruncateAt.MARQUEE;
                    }
                } else {
                    truncateAt = TextUtils.TruncateAt.MIDDLE;
                }
            } else {
                truncateAt = TextUtils.TruncateAt.START;
            }
            setTitleEllipsize(truncateAt);
        }
        if (obtainStyledAttributes.hasValue(17) && bVar.oscar != (alpha2 = AbstractC2719n0.alpha(context2, obtainStyledAttributes, 17))) {
            bVar.oscar = alpha2;
            bVar.lima(false);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            bVar.romeo(AbstractC2719n0.alpha(context2, obtainStyledAttributes, 5));
        }
        this.f7809s = obtainStyledAttributes.getDimensionPixelSize(22, -1);
        if (obtainStyledAttributes.hasValue(29)) {
            bVar.victor(obtainStyledAttributes.getInt(29, 1));
        } else if (obtainStyledAttributes.hasValue(20)) {
            bVar.victor(obtainStyledAttributes.getInt(20, 1));
        }
        if (obtainStyledAttributes.hasValue(30)) {
            bVar.ochre = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(30, 0));
            bVar.lima(false);
        }
        com.google.android.material.internal.b bVar2 = new com.google.android.material.internal.b(this);
        this.f7796f = bVar2;
        bVar2.olive = decelerateInterpolator;
        bVar2.lima(false);
        bVar2.fuchsia = false;
        if (obtainStyledAttributes.hasValue(24)) {
            setSubtitle(obtainStyledAttributes.getText(24));
        }
        bVar2.xray(i5);
        bVar2.sierra(i10);
        bVar2.whiskey(2132083197);
        bVar2.quebec(2132083218);
        if (obtainStyledAttributes.hasValue(7)) {
            bVar2.whiskey(obtainStyledAttributes.getResourceId(7, 0));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            bVar2.quebec(obtainStyledAttributes.getResourceId(0, 0));
        }
        if (obtainStyledAttributes.hasValue(8) && bVar2.oscar != (alpha = AbstractC2719n0.alpha(context2, obtainStyledAttributes, 8))) {
            bVar2.oscar = alpha;
            bVar2.lima(false);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            bVar2.romeo(AbstractC2719n0.alpha(context2, obtainStyledAttributes, 1));
        }
        if (obtainStyledAttributes.hasValue(25)) {
            bVar2.victor(obtainStyledAttributes.getInt(25, 1));
        }
        if (obtainStyledAttributes.hasValue(30)) {
            bVar2.ochre = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(30, 0));
            bVar2.lima(false);
        }
        this.f7806p = obtainStyledAttributes.getInt(21, 600);
        this.f7807q = q.foxtrot(context2, R.attr.motionEasingStandardInterpolator, M6.a.charlie);
        this.f7808r = q.foxtrot(context2, R.attr.motionEasingStandardInterpolator, M6.a.delta);
        setContentScrim(obtainStyledAttributes.getDrawable(6));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(23));
        setTitleCollapseMode(obtainStyledAttributes.getInt(27, 0));
        this.purple = obtainStyledAttributes.getResourceId(32, -1);
        this.f7816z = obtainStyledAttributes.getBoolean(19, false);
        this.C = obtainStyledAttributes.getBoolean(18, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        androidx.core.widget.f fVar = new androidx.core.widget.f(i4, this);
        WeakHashMap weakHashMap = au.alpha;
        al.lima(this, fVar);
    }

    public static m bravo(View view) {
        m mVar = (m) view.getTag(R.id.view_offset_helper);
        if (mVar == null) {
            m mVar2 = new m(view);
            view.setTag(R.id.view_offset_helper, mVar2);
            return mVar2;
        }
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateList;
        Context context = getContext();
        TypedValue bravo = AbstractC2710m0.bravo(R.attr.colorSurfaceContainer, context);
        if (bravo != null) {
            int i4 = bravo.resourceId;
            if (i4 != 0) {
                colorStateList = AbstractC1735d.charlie(i4, context);
            } else {
                int i5 = bravo.data;
                if (i5 != 0) {
                    colorStateList = ColorStateList.valueOf(i5);
                }
            }
            if (colorStateList == null) {
                return colorStateList.getDefaultColor();
            }
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            V6.a aVar = this.f7797g;
            return aVar.alpha(dimension, aVar.delta);
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public final void alpha() {
        if (!this.alpha) {
            return;
        }
        ViewGroup viewGroup = null;
        this.red = null;
        this.silver = null;
        int i4 = this.purple;
        if (i4 != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i4);
            this.red = viewGroup2;
            if (viewGroup2 != null) {
                ViewParent parent = viewGroup2.getParent();
                View view = viewGroup2;
                while (parent != this && parent != null) {
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    parent = parent.getParent();
                    view = view;
                }
                this.silver = view;
            }
        }
        if (this.red == null) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
            }
            this.red = viewGroup;
        }
        charlie();
        this.alpha = false;
    }

    public final void charlie() {
        View view;
        if (!this.f7798h && (view = this.teal) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.teal);
            }
        }
        if (this.f7798h && this.red != null) {
            if (this.teal == null) {
                this.teal = new View(getContext());
            }
            if (this.teal.getParent() == null) {
                this.red.addView(this.teal, -1, -1);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    public final void delta() {
        boolean z2;
        if (this.f7801k == null && this.f7802l == null) {
            return;
        }
        if (getHeight() + this.f7811u < getScrimVisibleHeightTrigger()) {
            z2 = true;
        } else {
            z2 = false;
        }
        setScrimsShown(z2);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        Drawable drawable;
        super.draw(canvas);
        alpha();
        if (this.red == null && (drawable = this.f7801k) != null && this.f7803m > 0) {
            drawable.mutate().setAlpha(this.f7803m);
            this.f7801k.draw(canvas);
        }
        if (this.f7798h && this.f7799i) {
            ViewGroup viewGroup = this.red;
            com.google.android.material.internal.b bVar = this.f7796f;
            com.google.android.material.internal.b bVar2 = this.e;
            if (viewGroup != null && this.f7801k != null && this.f7803m > 0 && this.f7813w == 1 && bVar2.bravo < bVar2.echo) {
                int save = canvas.save();
                canvas.clipRect(this.f7801k.getBounds(), Region.Op.DIFFERENCE);
                bVar2.foxtrot(canvas);
                bVar.foxtrot(canvas);
                canvas.restoreToCount(save);
            } else {
                bVar2.foxtrot(canvas);
                bVar.foxtrot(canvas);
            }
        }
        if (this.f7802l != null && this.f7803m > 0) {
            a0 a0Var = this.f7814x;
            if (a0Var != null) {
                i4 = a0Var.delta();
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                this.f7802l.setBounds(0, -this.f7811u, getWidth(), i4 - this.f7811u);
                this.f7802l.mutate().setAlpha(this.f7803m);
                this.f7802l.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        boolean z2;
        View view2;
        Drawable drawable = this.f7801k;
        if (drawable != null && this.f7803m > 0 && ((view2 = this.silver) == null || view2 == this ? view == this.red : view == view2)) {
            int width = getWidth();
            int height = getHeight();
            if (this.f7813w == 1 && view != null && this.f7798h) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.f7801k.mutate().setAlpha(this.f7803m);
            this.f7801k.draw(canvas);
            z2 = true;
        } else {
            z2 = false;
        }
        if (super.drawChild(canvas, view, j5) || z2) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z2;
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7802l;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = drawable.setState(drawableState);
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f7801k;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.b bVar = this.e;
        if (bVar != null) {
            bVar.lime = drawableState;
            ColorStateList colorStateList2 = bVar.papa;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.oscar) != null && colorStateList.isStateful())) {
                bVar.lima(false);
                z10 = true;
            }
            z2 |= z10;
        }
        if (z2) {
            invalidate();
        }
    }

    public final void echo(boolean z2, int i4, int i5, int i10, int i11) {
        View view;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (this.f7798h && (view = this.teal) != null) {
            int i20 = 0;
            boolean z11 = true;
            if (view.isAttachedToWindow() && this.teal.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f7799i = z10;
            if (z10 || z2) {
                if (getLayoutDirection() != 1) {
                    z11 = false;
                }
                View view2 = this.silver;
                if (view2 == null) {
                    view2 = this.red;
                }
                int height = ((getHeight() - bravo(view2).bravo) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((g) view2.getLayoutParams())).bottomMargin;
                View view3 = this.teal;
                Rect rect = this.f7795d;
                com.google.android.material.internal.c.alpha(this, view3, rect);
                ViewGroup viewGroup = this.red;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i20 = toolbar.getTitleMarginStart();
                    i13 = toolbar.getTitleMarginEnd();
                    i14 = toolbar.getTitleMarginTop();
                    i12 = toolbar.getTitleMarginBottom();
                } else if (Build.VERSION.SDK_INT >= 24 && (viewGroup instanceof android.widget.Toolbar)) {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    i20 = toolbar2.getTitleMarginStart();
                    i13 = toolbar2.getTitleMarginEnd();
                    i14 = toolbar2.getTitleMarginTop();
                    i12 = toolbar2.getTitleMarginBottom();
                } else {
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                }
                int i21 = rect.left;
                if (z11) {
                    i15 = i13;
                } else {
                    i15 = i20;
                }
                int i22 = i21 + i15;
                int i23 = rect.right;
                if (z11) {
                    i16 = i20;
                } else {
                    i16 = i13;
                }
                int i24 = i23 - i16;
                int i25 = rect.top + height + i14;
                int i26 = (rect.bottom + height) - i12;
                com.google.android.material.internal.b bVar = this.f7796f;
                TextPaint textPaint = bVar.navy;
                textPaint.setTextSize(bVar.november);
                textPaint.setTypeface(bVar.xray);
                textPaint.setLetterSpacing(bVar.white);
                int descent = (int) (i26 - (textPaint.descent() + (-textPaint.ascent())));
                com.google.android.material.internal.b bVar2 = this.e;
                TextPaint textPaint2 = bVar2.navy;
                textPaint2.setTextSize(bVar2.november);
                textPaint2.setTypeface(bVar2.xray);
                textPaint2.setLetterSpacing(bVar2.white);
                int descent2 = (int) (textPaint2.descent() + (-textPaint2.ascent()) + i25);
                if (TextUtils.isEmpty(bVar.crimson)) {
                    bVar2.oscar(i22, i25, i24, i26);
                } else {
                    bVar2.oscar(i22, i25, i24, descent);
                    bVar.oscar(i22, descent2, i24, i26);
                }
                if (this.f7800j == 0) {
                    com.google.android.material.internal.c.alpha(this, this, rect);
                    int i27 = rect.left;
                    if (z11) {
                        i19 = i13;
                    } else {
                        i19 = i20;
                    }
                    int i28 = i27 + i19;
                    int i29 = rect.right;
                    if (!z11) {
                        i20 = i13;
                    }
                    int i30 = i29 - i20;
                    if (TextUtils.isEmpty(bVar.crimson)) {
                        bVar2.papa(i28, i25, i30, i26);
                    } else {
                        bVar2.papa(i28, i25, i30, descent);
                        bVar.papa(i28, descent2, i30, i26);
                    }
                }
                if (z11) {
                    i17 = this.f7792a;
                } else {
                    i17 = this.white;
                }
                int i31 = i17;
                int i32 = rect.top + this.yellow;
                int i33 = i10 - i4;
                if (z11) {
                    i18 = this.white;
                } else {
                    i18 = this.f7792a;
                }
                int i34 = i33 - i18;
                int i35 = (i11 - i5) - this.f7793b;
                if (TextUtils.isEmpty(bVar.crimson)) {
                    this.e.uniform(true, i31, i32, i34, i35);
                    bVar2.lima(z2);
                } else {
                    this.e.uniform(false, i31, i32, i34, (int) ((i35 - (bVar.india() + this.B)) - this.f7794c));
                    this.f7796f.uniform(false, i31, (int) (bVar2.india() + this.A + i32 + this.f7794c), i34, i35);
                    bVar2.lima(z2);
                    bVar.lima(z2);
                }
            }
        }
    }

    public final void foxtrot() {
        CharSequence charSequence;
        ViewGroup viewGroup = this.red;
        if (viewGroup != null && this.f7798h) {
            CharSequence charSequence2 = null;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).getTitle();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(this.e.crimson) && !TextUtils.isEmpty(charSequence)) {
                setTitle(charSequence);
            }
            ViewGroup viewGroup2 = this.red;
            if (viewGroup2 instanceof Toolbar) {
                charSequence2 = ((Toolbar) viewGroup2).getSubtitle();
            } else if (viewGroup2 instanceof android.widget.Toolbar) {
                charSequence2 = ((android.widget.Toolbar) viewGroup2).getSubtitle();
            }
            if (TextUtils.isEmpty(this.f7796f.crimson) && !TextUtils.isEmpty(charSequence2)) {
                setSubtitle(charSequence2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, com.google.android.material.appbar.g, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.alpha = 0;
        layoutParams.bravo = 0.5f;
        return layoutParams;
    }

    public float getCollapsedSubtitleTextSize() {
        return this.f7796f.november;
    }

    public Typeface getCollapsedSubtitleTypeface() {
        Typeface typeface = this.f7796f.xray;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public int getCollapsedTitleGravity() {
        return this.e.lima;
    }

    public float getCollapsedTitleTextSize() {
        return this.e.november;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.e.xray;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f7801k;
    }

    public float getExpandedSubtitleTextSize() {
        return this.f7796f.mike;
    }

    public Typeface getExpandedSubtitleTypeface() {
        Typeface typeface = this.f7796f.amber;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public int getExpandedTitleGravity() {
        return this.e.kilo;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f7793b;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f7792a;
    }

    public int getExpandedTitleMarginStart() {
        return this.white;
    }

    public int getExpandedTitleMarginTop() {
        return this.yellow;
    }

    public int getExpandedTitleSpacing() {
        return this.f7794c;
    }

    public float getExpandedTitleTextSize() {
        return this.e.mike;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.e.amber;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.e.f8060k;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.e.f8052b;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.e.f8052b.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.e.f8052b.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.e.f8056g;
    }

    public int getScrimAlpha() {
        return this.f7803m;
    }

    public long getScrimAnimationDuration() {
        return this.f7806p;
    }

    public int getScrimVisibleHeightTrigger() {
        int i4;
        int i5 = this.f7809s;
        if (i5 >= 0) {
            return i5 + this.f7815y + this.A + this.B + this.f7791D;
        }
        a0 a0Var = this.f7814x;
        if (a0Var != null) {
            i4 = a0Var.delta();
        } else {
            i4 = 0;
        }
        int minimumHeight = getMinimumHeight();
        if (minimumHeight > 0) {
            return Math.min((minimumHeight * 2) + i4, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f7802l;
    }

    public CharSequence getSubtitle() {
        if (this.f7798h) {
            return this.f7796f.crimson;
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.f7798h) {
            return this.e.crimson;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f7813w;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.e.ochre;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.e.coral;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f7813w == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.f7810t == null) {
                this.f7810t = new h(this);
            }
            h hVar = this.f7810t;
            if (appBarLayout.f7768a == null) {
                appBarLayout.f7768a = new ArrayList();
            }
            if (hVar != null && !appBarLayout.f7768a.contains(hVar)) {
                appBarLayout.f7768a.add(hVar);
            }
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.google.android.material.internal.b bVar = this.e;
        bVar.kilo(configuration);
        if (this.f7812v != configuration.orientation && this.C && bVar.bravo == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.f7812v = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        h hVar = this.f7810t;
        if (hVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f7768a) != null) {
            arrayList.remove(hVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        a0 a0Var = this.f7814x;
        if (a0Var != null) {
            int delta = a0Var.delta();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < delta) {
                    WeakHashMap weakHashMap = au.alpha;
                    childAt.offsetTopAndBottom(delta);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            m bravo = bravo(getChildAt(i13));
            View view = bravo.alpha;
            bravo.bravo = view.getTop();
            bravo.charlie = view.getLeft();
        }
        echo(false, i4, i5, i10, i11);
        foxtrot();
        delta();
        int childCount3 = getChildCount();
        for (int i14 = 0; i14 < childCount3; i14++) {
            bravo(getChildAt(i14)).alpha();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i4, int i5) {
        int i10;
        CollapsingToolbarLayout collapsingToolbarLayout;
        ViewGroup viewGroup;
        int measuredHeight;
        int measuredHeight2;
        float india;
        alpha();
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        a0 a0Var = this.f7814x;
        if (a0Var != null) {
            i10 = a0Var.delta();
        } else {
            i10 = 0;
        }
        if ((mode == 0 || this.f7816z) && i10 > 0) {
            this.f7815y = i10;
            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i10, 1073741824));
        }
        foxtrot();
        if (this.f7798h) {
            com.google.android.material.internal.b bVar = this.e;
            if (!TextUtils.isEmpty(bVar.crimson)) {
                int measuredHeight3 = getMeasuredHeight();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.echo(true, 0, 0, getMeasuredWidth(), measuredHeight3);
                float india2 = bVar.india() + collapsingToolbarLayout.f7815y + collapsingToolbarLayout.yellow;
                com.google.android.material.internal.b bVar2 = collapsingToolbarLayout.f7796f;
                if (TextUtils.isEmpty(bVar2.crimson)) {
                    india = 0.0f;
                } else {
                    india = collapsingToolbarLayout.f7794c + bVar2.india();
                }
                int i11 = (int) (india2 + india + collapsingToolbarLayout.f7793b);
                if (i11 > measuredHeight3) {
                    collapsingToolbarLayout.f7791D = i11 - measuredHeight3;
                } else {
                    collapsingToolbarLayout.f7791D = 0;
                }
                if (collapsingToolbarLayout.C) {
                    if (bVar.f8056g > 1) {
                        int i12 = bVar.quebec;
                        if (i12 > 1) {
                            collapsingToolbarLayout.A = (i12 - 1) * Math.round(bVar.india());
                        } else {
                            collapsingToolbarLayout.A = 0;
                        }
                    }
                    if (bVar2.f8056g > 1) {
                        int i13 = bVar2.quebec;
                        if (i13 > 1) {
                            collapsingToolbarLayout.B = (i13 - 1) * Math.round(bVar2.india());
                        } else {
                            collapsingToolbarLayout.B = 0;
                        }
                    }
                }
                int i14 = collapsingToolbarLayout.f7791D;
                int i15 = collapsingToolbarLayout.A;
                int i16 = collapsingToolbarLayout.B;
                if (i14 + i15 + i16 > 0) {
                    super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(measuredHeight3 + i14 + i15 + i16, 1073741824));
                }
                viewGroup = collapsingToolbarLayout.red;
                if (viewGroup == null) {
                    View view = collapsingToolbarLayout.silver;
                    if (view != null && view != collapsingToolbarLayout) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                        } else {
                            measuredHeight2 = view.getMeasuredHeight();
                        }
                        setMinimumHeight(measuredHeight2);
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    } else {
                        measuredHeight = viewGroup.getMeasuredHeight();
                    }
                    setMinimumHeight(measuredHeight);
                    return;
                }
                return;
            }
        }
        collapsingToolbarLayout = this;
        viewGroup = collapsingToolbarLayout.red;
        if (viewGroup == null) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i10, int i11) {
        super.onSizeChanged(i4, i5, i10, i11);
        Drawable drawable = this.f7801k;
        if (drawable != null) {
            ViewGroup viewGroup = this.red;
            if (this.f7813w == 1 && viewGroup != null && this.f7798h) {
                i5 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i4, i5);
        }
    }

    public void setCollapsedSubtitleTextAppearance(int i4) {
        this.f7796f.quebec(i4);
    }

    public void setCollapsedSubtitleTextColor(int i4) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setCollapsedSubtitleTextSize(float f5) {
        com.google.android.material.internal.b bVar = this.f7796f;
        if (bVar.november != f5) {
            bVar.november = f5;
            bVar.lima(false);
        }
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        com.google.android.material.internal.b bVar = this.f7796f;
        if (bVar.tango(typeface)) {
            bVar.lima(false);
        }
    }

    public void setCollapsedTitleGravity(int i4) {
        this.e.sierra(i4);
        this.f7796f.sierra(i4);
    }

    public void setCollapsedTitleTextAppearance(int i4) {
        this.e.quebec(i4);
    }

    public void setCollapsedTitleTextColor(int i4) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setCollapsedTitleTextSize(float f5) {
        com.google.android.material.internal.b bVar = this.e;
        if (bVar.november != f5) {
            bVar.november = f5;
            bVar.lima(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        com.google.android.material.internal.b bVar = this.e;
        if (bVar.tango(typeface)) {
            bVar.lima(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f7801k;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f7801k = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.red;
                if (this.f7813w == 1 && viewGroup != null && this.f7798h) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.f7801k.setCallback(this);
                this.f7801k.setAlpha(this.f7803m);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i4) {
        setContentScrim(new ColorDrawable(i4));
    }

    public void setContentScrimResource(int i4) {
        setContentScrim(getContext().getDrawable(i4));
    }

    public void setExpandedSubtitleColor(int i4) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setExpandedSubtitleTextAppearance(int i4) {
        this.f7796f.whiskey(i4);
    }

    public void setExpandedSubtitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.b bVar = this.f7796f;
        if (bVar.oscar != colorStateList) {
            bVar.oscar = colorStateList;
            bVar.lima(false);
        }
    }

    public void setExpandedSubtitleTextSize(float f5) {
        this.f7796f.yankee(f5);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        com.google.android.material.internal.b bVar = this.f7796f;
        if (bVar.zulu(typeface)) {
            bVar.lima(false);
        }
    }

    public void setExpandedTitleColor(int i4) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setExpandedTitleGravity(int i4) {
        this.e.xray(i4);
        this.f7796f.xray(i4);
    }

    public void setExpandedTitleMarginBottom(int i4) {
        this.f7793b = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i4) {
        this.f7792a = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i4) {
        this.white = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i4) {
        this.yellow = i4;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i4) {
        this.f7794c = i4;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i4) {
        this.e.whiskey(i4);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.b bVar = this.e;
        if (bVar.oscar != colorStateList) {
            bVar.oscar = colorStateList;
            bVar.lima(false);
        }
    }

    public void setExpandedTitleTextSize(float f5) {
        this.e.yankee(f5);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        com.google.android.material.internal.b bVar = this.e;
        if (bVar.zulu(typeface)) {
            bVar.lima(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z2) {
        this.C = z2;
    }

    public void setForceApplySystemWindowInsetTop(boolean z2) {
        this.f7816z = z2;
    }

    public void setHyphenationFrequency(int i4) {
        this.e.f8060k = i4;
    }

    public void setLineSpacingAdd(float f5) {
        this.e.f8058i = f5;
    }

    public void setLineSpacingMultiplier(float f5) {
        this.e.f8059j = f5;
    }

    public void setMaxLines(int i4) {
        this.e.victor(i4);
        this.f7796f.victor(i4);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z2) {
        this.e.fuchsia = z2;
    }

    public void setScrimAlpha(int i4) {
        ViewGroup viewGroup;
        if (i4 != this.f7803m) {
            if (this.f7801k != null && (viewGroup = this.red) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.f7803m = i4;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j5) {
        this.f7806p = j5;
    }

    public void setScrimVisibleHeightTrigger(int i4) {
        if (this.f7809s != i4) {
            this.f7809s = i4;
            delta();
        }
    }

    public void setScrimsShown(boolean z2) {
        boolean z10;
        TimeInterpolator timeInterpolator;
        int i4 = 0;
        if (isLaidOut() && !isInEditMode()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f7804n != z2) {
            if (z10) {
                if (z2) {
                    i4 = 255;
                }
                alpha();
                ValueAnimator valueAnimator = this.f7805o;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f7805o = valueAnimator2;
                    if (i4 > this.f7803m) {
                        timeInterpolator = this.f7807q;
                    } else {
                        timeInterpolator = this.f7808r;
                    }
                    valueAnimator2.setInterpolator(timeInterpolator);
                    this.f7805o.addUpdateListener(new f(0, this));
                } else if (valueAnimator.isRunning()) {
                    this.f7805o.cancel();
                }
                this.f7805o.setDuration(this.f7806p);
                this.f7805o.setIntValues(this.f7803m, i4);
                this.f7805o.start();
            } else {
                if (z2) {
                    i4 = 255;
                }
                setScrimAlpha(i4);
            }
            this.f7804n = z2;
        }
    }

    public void setStaticLayoutBuilderConfigurer(i iVar) {
        com.google.android.material.internal.b bVar = this.e;
        bVar.getClass();
        if (iVar != null) {
            bVar.lima(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z2;
        Drawable drawable2 = this.f7802l;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f7802l = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f7802l.setState(getDrawableState());
                }
                this.f7802l.setLayoutDirection(getLayoutDirection());
                Drawable drawable4 = this.f7802l;
                if (getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawable4.setVisible(z2, false);
                this.f7802l.setCallback(this);
                this.f7802l.setAlpha(this.f7803m);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i4) {
        setStatusBarScrim(new ColorDrawable(i4));
    }

    public void setStatusBarScrimResource(int i4) {
        setStatusBarScrim(getContext().getDrawable(i4));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f7796f.azure(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.e.azure(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i4) {
        boolean z2;
        this.f7813w = i4;
        if (i4 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.e.charlie = z2;
        this.f7796f.charlie = z2;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f7813w == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z2 && this.f7801k == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        com.google.android.material.internal.b bVar = this.e;
        bVar.coral = truncateAt;
        bVar.lima(false);
    }

    public void setTitleEnabled(boolean z2) {
        if (z2 != this.f7798h) {
            this.f7798h = z2;
            setContentDescription(getTitle());
            charlie();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        com.google.android.material.internal.b bVar = this.e;
        bVar.ochre = timeInterpolator;
        bVar.lima(false);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        boolean z2;
        super.setVisibility(i4);
        if (i4 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.f7802l;
        if (drawable != null && drawable.isVisible() != z2) {
            this.f7802l.setVisible(z2, false);
        }
        Drawable drawable2 = this.f7801k;
        if (drawable2 != null && drawable2.isVisible() != z2) {
            this.f7801k.setVisible(z2, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f7801k && drawable != this.f7802l) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.appbar.g, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new FrameLayout.LayoutParams(context, attributeSet);
        layoutParams.alpha = 0;
        layoutParams.bravo = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.lima);
        layoutParams.alpha = obtainStyledAttributes.getInt(0, 0);
        layoutParams.bravo = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setCollapsedSubtitleTextColor(ColorStateList colorStateList) {
        this.f7796f.romeo(colorStateList);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.e.romeo(colorStateList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.appbar.g, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.alpha = 0;
        layoutParams.bravo = 0.5f;
        return layoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, com.google.android.material.appbar.g, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.alpha = 0;
        layoutParams2.bravo = 0.5f;
        return layoutParams2;
    }
}
