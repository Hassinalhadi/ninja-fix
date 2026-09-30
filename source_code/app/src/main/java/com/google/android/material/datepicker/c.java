package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import bv.am;
import bv.av;
import q0.C2398q;
import s6.AbstractC2719n0;
import s6.T7;

/* loaded from: classes2.dex */
public final class c {
    public int alpha;
    public Object bravo;
    public Object charlie;
    public Object delta;
    public final Object echo;
    public final Object foxtrot;

    public c(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i4, g7.m mVar, Rect rect) {
        T7.echo(rect.left);
        T7.echo(rect.top);
        T7.echo(rect.right);
        T7.echo(rect.bottom);
        this.bravo = rect;
        this.charlie = colorStateList2;
        this.delta = colorStateList;
        this.echo = colorStateList3;
        this.alpha = i4;
        this.foxtrot = mVar;
    }

    public static c alpha(int i4, Context context) {
        boolean z2;
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.bravo("Cannot create a CalendarItemStyle with a styleResId of 0", z2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, L6.a.xray);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList alpha = AbstractC2719n0.alpha(context, obtainStyledAttributes, 4);
        ColorStateList alpha2 = AbstractC2719n0.alpha(context, obtainStyledAttributes, 9);
        ColorStateList alpha3 = AbstractC2719n0.alpha(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        g7.m alpha4 = g7.m.alpha(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).alpha();
        obtainStyledAttributes.recycle();
        return new c(alpha, alpha2, alpha3, dimensionPixelSize, alpha4, rect);
    }

    public void bravo(TextView textView) {
        g7.i iVar = new g7.i();
        g7.i iVar2 = new g7.i();
        g7.m mVar = (g7.m) this.foxtrot;
        iVar.setShapeAppearanceModel(mVar);
        iVar2.setShapeAppearanceModel(mVar);
        iVar.quebec((ColorStateList) this.delta);
        iVar.purple.kilo = this.alpha;
        iVar.invalidateSelf();
        g7.g gVar = iVar.purple;
        ColorStateList colorStateList = gVar.echo;
        ColorStateList colorStateList2 = (ColorStateList) this.echo;
        if (colorStateList != colorStateList2) {
            gVar.echo = colorStateList2;
            iVar.onStateChange(iVar.getState());
        }
        ColorStateList colorStateList3 = (ColorStateList) this.charlie;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), iVar, iVar2);
        Rect rect = (Rect) this.bravo;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public c() {
        this.bravo = new C2398q[32];
        this.charlie = new float[32];
        this.delta = new byte[32];
        am amVar = av.alpha;
        this.echo = new am();
        this.foxtrot = new am();
    }
}
