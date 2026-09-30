package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c1.C0810i;
import c1.C0811j;
import c1.C0815n;
import delivery.samurai.android.R;
import g.C1718a;
import g1.AbstractC1735d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s1.au;
import s6.AbstractC2719n0;

/* loaded from: classes2.dex */
class ClockFaceView extends h implements f {
    public final ColorStateList A;

    /* renamed from: m, reason: collision with root package name */
    public final ClockHandView f8245m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f8246n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f8247o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f8248p;

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f8249q;

    /* renamed from: r, reason: collision with root package name */
    public final c f8250r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f8251s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f8252t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8253u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8254v;

    /* renamed from: w, reason: collision with root package name */
    public final int f8255w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8256x;

    /* renamed from: y, reason: collision with root package name */
    public final String[] f8257y;

    /* renamed from: z, reason: collision with root package name */
    public float f8258z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8246n = new Rect();
        this.f8247o = new RectF();
        this.f8248p = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f8249q = sparseArray;
        this.f8252t = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.india, R.attr.materialClockStyle, 2132083979);
        Resources resources = getResources();
        ColorStateList alpha = AbstractC2719n0.alpha(context, obtainStyledAttributes, 1);
        this.A = alpha;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f8245m = clockHandView;
        this.f8253u = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = alpha.getColorForState(new int[]{android.R.attr.state_selected}, alpha.getDefaultColor());
        this.f8251s = new int[]{colorForState, colorForState, alpha.getDefaultColor()};
        clockHandView.red.add(this);
        int defaultColor = AbstractC1735d.charlie(R.color.material_timepicker_clockface, context).getDefaultColor();
        ColorStateList alpha2 = AbstractC2719n0.alpha(context, obtainStyledAttributes, 0);
        setBackgroundColor(alpha2 != null ? alpha2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.f8250r = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f8257y = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i4 = 0; i4 < Math.max(this.f8257y.length, size); i4++) {
            TextView textView = (TextView) sparseArray.get(i4);
            if (i4 >= this.f8257y.length) {
                removeView(textView);
                sparseArray.remove(i4);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i4, textView);
                    addView(textView);
                }
                textView.setText(this.f8257y[i4]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i4));
                int i5 = (i4 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i5));
                z2 = i5 > 1 ? true : z2;
                au.november(textView, this.f8250r);
                textView.setTextColor(this.A);
            }
        }
        ClockHandView clockHandView2 = this.f8245m;
        if (clockHandView2.purple && !z2) {
            clockHandView2.f8264f = 1;
        }
        clockHandView2.purple = z2;
        clockHandView2.invalidate();
        this.f8254v = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f8255w = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f8256x = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void foxtrot() {
        int i4;
        C0815n c0815n = new C0815n();
        c0815n.bravo(this);
        HashMap hashMap = new HashMap();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i10 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i10 == null) {
                    i10 = 1;
                }
                if (!hashMap.containsKey(i10)) {
                    hashMap.put(i10, new ArrayList());
                }
                ((List) hashMap.get(i10)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i4 = Math.round(this.f8268k * 0.66f);
            } else {
                i4 = this.f8268k;
            }
            Iterator it = list.iterator();
            float f5 = 0.0f;
            while (it.hasNext()) {
                int id2 = ((View) it.next()).getId();
                HashMap hashMap2 = c0815n.charlie;
                if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                    hashMap2.put(Integer.valueOf(id2), new C0810i());
                }
                C0811j c0811j = ((C0810i) hashMap2.get(Integer.valueOf(id2))).delta;
                c0811j.zulu = R.id.circle_center;
                c0811j.amber = i4;
                c0811j.azure = f5;
                f5 += 360.0f / list.size();
            }
        }
        c0815n.alpha(this);
        setConstraintSet(null);
        requestLayout();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f8249q;
            if (i11 < sparseArray.size()) {
                ((TextView) sparseArray.get(i11)).setVisibility(0);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void golf() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z2;
        RadialGradient radialGradient;
        RectF rectF2 = this.f8245m.yellow;
        float f5 = Float.MAX_VALUE;
        TextView textView = null;
        int i4 = 0;
        while (true) {
            sparseArray = this.f8249q;
            int size = sparseArray.size();
            rectF = this.f8247o;
            rect = this.f8246n;
            if (i4 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i4);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f5) {
                    textView = textView2;
                    f5 = height;
                }
            }
            i4++;
        }
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            TextView textView3 = (TextView) sparseArray.get(i5);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                textView3.setSelected(z2);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f8248p);
                rectF.inset(r8.left, r8.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f8251s, this.f8252t, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1718a.zulu(1, this.f8257y.length, 1).purple);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        golf();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f8256x / Math.max(Math.max(this.f8254v / displayMetrics.heightPixels, this.f8255w / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
