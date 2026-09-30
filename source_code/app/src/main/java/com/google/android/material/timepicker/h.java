package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public abstract class h extends ConstraintLayout {

    /* renamed from: j, reason: collision with root package name */
    public final g f8267j;

    /* renamed from: k, reason: collision with root package name */
    public int f8268k;

    /* renamed from: l, reason: collision with root package name */
    public final g7.i f8269l;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g7.i iVar = new g7.i();
        this.f8269l = iVar;
        g7.j jVar = new g7.j(0.5f);
        g7.l golf = iVar.purple.alpha.golf();
        golf.echo = jVar;
        golf.foxtrot = jVar;
        golf.golf = jVar;
        golf.hotel = jVar;
        iVar.setShapeAppearanceModel(golf.alpha());
        this.f8269l.quebec(ColorStateList.valueOf(-1));
        setBackground(this.f8269l);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.cyan, R.attr.materialClockStyle, 0);
        this.f8268k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f8267j = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.foxtrot();
            }
        };
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f8267j;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public abstract void foxtrot();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        foxtrot();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f8267j;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i4) {
        this.f8269l.quebec(ColorStateList.valueOf(i4));
    }
}
