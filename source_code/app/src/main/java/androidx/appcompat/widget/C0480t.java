package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import id.C1915c;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0480t {
    public final View alpha;
    public U0 delta;
    public U0 echo;
    public U0 foxtrot;
    public int charlie = -1;
    public final C0488x bravo = C0488x.alpha();

    public C0480t(View view) {
        this.alpha = view;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, androidx.appcompat.widget.U0] */
    public final void alpha() {
        View view = this.alpha;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.delta != null) {
                if (this.foxtrot == null) {
                    this.foxtrot = new Object();
                }
                U0 u02 = this.foxtrot;
                u02.alpha = null;
                u02.delta = false;
                u02.bravo = null;
                u02.charlie = false;
                WeakHashMap weakHashMap = s1.au.alpha;
                ColorStateList charlie = s1.al.charlie(view);
                if (charlie != null) {
                    u02.delta = true;
                    u02.alpha = charlie;
                }
                PorterDuff.Mode delta = s1.al.delta(view);
                if (delta != null) {
                    u02.charlie = true;
                    u02.bravo = delta;
                }
                if (u02.delta || u02.charlie) {
                    C0488x.echo(background, u02, view.getDrawableState());
                    return;
                }
            }
            U0 u03 = this.echo;
            if (u03 != null) {
                C0488x.echo(background, u03, view.getDrawableState());
                return;
            }
            U0 u04 = this.delta;
            if (u04 != null) {
                C0488x.echo(background, u04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList bravo() {
        U0 u02 = this.echo;
        if (u02 != null) {
            return u02.alpha;
        }
        return null;
    }

    public final PorterDuff.Mode charlie() {
        U0 u02 = this.echo;
        if (u02 != null) {
            return u02.bravo;
        }
        return null;
    }

    public final void delta(AttributeSet attributeSet, int i4) {
        ColorStateList india;
        View view = this.alpha;
        Context context = view.getContext();
        int[] iArr = aj.a.amber;
        C1915c victor = C1915c.victor(context, attributeSet, iArr, i4);
        TypedArray typedArray = (TypedArray) victor.red;
        View view2 = this.alpha;
        s1.au.mike(view2, view2.getContext(), iArr, attributeSet, (TypedArray) victor.red, i4);
        try {
            if (typedArray.hasValue(0)) {
                this.charlie = typedArray.getResourceId(0, -1);
                C0488x c0488x = this.bravo;
                Context context2 = view.getContext();
                int i5 = this.charlie;
                synchronized (c0488x) {
                    india = c0488x.alpha.india(i5, context2);
                }
                if (india != null) {
                    golf(india);
                }
            }
            if (typedArray.hasValue(1)) {
                s1.al.india(view, victor.november(1));
            }
            if (typedArray.hasValue(2)) {
                s1.al.juliet(view, S.bravo(typedArray.getInt(2, -1), null));
            }
            victor.xray();
        } catch (Throwable th) {
            victor.xray();
            throw th;
        }
    }

    public final void echo() {
        this.charlie = -1;
        golf(null);
        alpha();
    }

    public final void foxtrot(int i4) {
        ColorStateList colorStateList;
        this.charlie = i4;
        C0488x c0488x = this.bravo;
        if (c0488x != null) {
            Context context = this.alpha.getContext();
            synchronized (c0488x) {
                colorStateList = c0488x.alpha.india(i4, context);
            }
        } else {
            colorStateList = null;
        }
        golf(colorStateList);
        alpha();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.appcompat.widget.U0] */
    public final void golf(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.delta == null) {
                this.delta = new Object();
            }
            U0 u02 = this.delta;
            u02.alpha = colorStateList;
            u02.delta = true;
        } else {
            this.delta = null;
        }
        alpha();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.appcompat.widget.U0] */
    public final void hotel(ColorStateList colorStateList) {
        if (this.echo == null) {
            this.echo = new Object();
        }
        U0 u02 = this.echo;
        u02.alpha = colorStateList;
        u02.delta = true;
        alpha();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.appcompat.widget.U0] */
    public final void india(PorterDuff.Mode mode) {
        if (this.echo == null) {
            this.echo = new Object();
        }
        U0 u02 = this.echo;
        u02.bravo = mode;
        u02.charlie = true;
        alpha();
    }
}
