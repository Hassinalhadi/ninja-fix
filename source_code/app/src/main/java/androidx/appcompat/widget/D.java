package androidx.appcompat.widget;

import ae.AbstractC0422a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import g1.AbstractC1735d;
import id.C1915c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import t6.A3;

/* loaded from: classes3.dex */
public final class D {
    public final TextView alpha;
    public U0 bravo;
    public U0 charlie;
    public U0 delta;
    public U0 echo;
    public U0 foxtrot;
    public U0 golf;
    public U0 hotel;
    public final M india;
    public int juliet = 0;
    public int kilo = -1;
    public Typeface lima;
    public boolean mike;

    public D(TextView textView) {
        this.alpha = textView;
        this.india = new M(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, androidx.appcompat.widget.U0] */
    public static U0 charlie(Context context, C0488x c0488x, int i4) {
        ColorStateList india;
        synchronized (c0488x) {
            india = c0488x.alpha.india(i4, context);
        }
        if (india != null) {
            ?? obj = new Object();
            obj.delta = true;
            obj.alpha = india;
            return obj;
        }
        return null;
    }

    public final void alpha(Drawable drawable, U0 u02) {
        if (drawable != null && u02 != null) {
            C0488x.echo(drawable, u02, this.alpha.getDrawableState());
        }
    }

    public final void bravo() {
        U0 u02 = this.bravo;
        TextView textView = this.alpha;
        if (u02 != null || this.charlie != null || this.delta != null || this.echo != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            alpha(compoundDrawables[0], this.bravo);
            alpha(compoundDrawables[1], this.charlie);
            alpha(compoundDrawables[2], this.delta);
            alpha(compoundDrawables[3], this.echo);
        }
        if (this.foxtrot == null && this.golf == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        alpha(compoundDrawablesRelative[0], this.foxtrot);
        alpha(compoundDrawablesRelative[2], this.golf);
    }

    public final ColorStateList delta() {
        U0 u02 = this.hotel;
        if (u02 != null) {
            return u02.alpha;
        }
        return null;
    }

    public final PorterDuff.Mode echo() {
        U0 u02 = this.hotel;
        if (u02 != null) {
            return u02.bravo;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void foxtrot(AttributeSet attributeSet, int i4) {
        boolean z2;
        boolean z10;
        String str;
        String str2;
        float f5;
        float f10;
        float f11;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i5;
        float f12;
        int i10;
        ColorStateList colorStateList;
        int resourceId;
        int i11;
        int resourceId2;
        TextView textView = this.alpha;
        Context context = textView.getContext();
        C0488x alpha = C0488x.alpha();
        int[] iArr = aj.a.hotel;
        C1915c victor = C1915c.victor(context, attributeSet, iArr, i4);
        s1.au.mike(textView, textView.getContext(), iArr, attributeSet, (TypedArray) victor.red, i4);
        TypedArray typedArray = (TypedArray) victor.red;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.bravo = charlie(context, alpha, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.charlie = charlie(context, alpha, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.delta = charlie(context, alpha, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.echo = charlie(context, alpha, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.foxtrot = charlie(context, alpha, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.golf = charlie(context, alpha, typedArray.getResourceId(6, 0));
        }
        victor.xray();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = aj.a.xray;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C1915c c1915c = new C1915c(context, obtainStyledAttributes);
            if (!z11 && obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            } else {
                z2 = false;
                z10 = false;
            }
            mike(context, c1915c);
            int i12 = Build.VERSION.SDK_INT;
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
            } else {
                str2 = null;
            }
            if (i12 >= 26 && obtainStyledAttributes.hasValue(13)) {
                str = obtainStyledAttributes.getString(13);
            } else {
                str = null;
            }
            c1915c.xray();
        } else {
            z2 = false;
            z10 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        C1915c c1915c2 = new C1915c(context, obtainStyledAttributes2);
        if (!z11 && obtainStyledAttributes2.hasValue(14)) {
            z10 = obtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z12 = z10;
        int i13 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        if (i13 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i13 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        mike(context, c1915c2);
        c1915c2.xray();
        if (!z11 && z2) {
            textView.setAllCaps(z12);
        }
        Typeface typeface = this.lima;
        if (typeface != null) {
            if (this.kilo == -1) {
                textView.setTypeface(typeface, this.juliet);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            B.delta(textView, str);
        }
        if (str3 != null) {
            if (i13 >= 24) {
                A.bravo(textView, A.alpha(str3));
            } else {
                textView.setTextLocale(az.alpha(str3.split(Constants.SEPARATOR_COMMA)[0]));
            }
        }
        int[] iArr3 = aj.a.india;
        M m4 = this.india;
        Context context2 = m4.juliet;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i4, 0);
        TextView textView2 = m4.india;
        s1.au.mike(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i4);
        if (obtainStyledAttributes3.hasValue(5)) {
            m4.alpha = obtainStyledAttributes3.getInt(5, 0);
        }
        if (obtainStyledAttributes3.hasValue(4)) {
            f5 = obtainStyledAttributes3.getDimension(4, -1.0f);
        } else {
            f5 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(2)) {
            f10 = obtainStyledAttributes3.getDimension(2, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(1)) {
            f11 = obtainStyledAttributes3.getDimension(1, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i14 = 0; i14 < length; i14++) {
                    iArr4[i14] = obtainTypedArray.getDimensionPixelSize(i14, -1);
                }
                m4.foxtrot = M.bravo(iArr4);
                m4.india();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (m4.juliet()) {
            if (m4.alpha == 1) {
                if (!m4.golf) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f10 == -1.0f) {
                        i11 = 2;
                        f10 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i11 = 2;
                    }
                    if (f11 == -1.0f) {
                        f11 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                    }
                    float f13 = f11;
                    if (f5 == -1.0f) {
                        f5 = 1.0f;
                    }
                    m4.kilo(f10, f13, f5);
                }
                m4.hotel();
            }
        } else {
            m4.alpha = 0;
        }
        if (m1.charlie && m4.alpha != 0) {
            int[] iArr5 = m4.foxtrot;
            if (iArr5.length > 0) {
                if (B.alpha(textView) != -1.0f) {
                    B.bravo(textView, Math.round(m4.delta), Math.round(m4.echo), Math.round(m4.charlie), 0);
                } else {
                    B.charlie(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawable = alpha.bravo(resourceId4, context);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        if (resourceId5 != -1) {
            drawable2 = alpha.bravo(resourceId5, context);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        if (resourceId6 != -1) {
            drawable3 = alpha.bravo(resourceId6, context);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        if (resourceId7 != -1) {
            drawable4 = alpha.bravo(resourceId7, context);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        if (resourceId8 != -1) {
            drawable5 = alpha.bravo(resourceId8, context);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        if (resourceId9 != -1) {
            drawable6 = alpha.bravo(resourceId9, context);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                Drawable drawable7 = compoundDrawablesRelative[0];
                if (drawable7 == null && compoundDrawablesRelative[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative[1];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative[3];
                    }
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative[2], drawable4);
                }
            }
        } else {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative2[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative2[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC1735d.charlie(resourceId, context)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof androidx.core.widget.l) {
                ((androidx.core.widget.l) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode bravo = S.bravo(obtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(bravo);
            } else if (textView instanceof androidx.core.widget.l) {
                ((androidx.core.widget.l) textView).setSupportCompoundDrawablesTintMode(bravo);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i15 = peekValue.data;
                i10 = i15 & 15;
                f12 = TypedValue.complexToFloat(i15);
                i5 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i5) {
                    A3.lima(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i5) {
                    A3.mike(textView, dimensionPixelSize2);
                }
                if (f12 == -1.0f) {
                    if (i10 == i5) {
                        A3.november(textView, (int) f12);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        AbstractC0422a.oscar(textView, i10, f12);
                        return;
                    } else {
                        A3.november(textView, Math.round(TypedValue.applyDimension(i10, f12, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i5 = -1;
            f12 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i5 = -1;
            f12 = -1.0f;
        }
        i10 = i5;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i5) {
        }
        if (dimensionPixelSize2 != i5) {
        }
        if (f12 == -1.0f) {
        }
    }

    public final void golf(int i4, Context context) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, aj.a.xray);
        C1915c c1915c = new C1915c(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.alpha;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        mike(context, c1915c);
        if (i5 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            B.delta(textView, string);
        }
        c1915c.xray();
        Typeface typeface = this.lima;
        if (typeface != null) {
            textView.setTypeface(typeface, this.juliet);
        }
    }

    public final void hotel(int i4, int i5, int i10, int i11) {
        M m4 = this.india;
        if (m4.juliet()) {
            DisplayMetrics displayMetrics = m4.juliet.getResources().getDisplayMetrics();
            m4.kilo(TypedValue.applyDimension(i11, i4, displayMetrics), TypedValue.applyDimension(i11, i5, displayMetrics), TypedValue.applyDimension(i11, i10, displayMetrics));
            if (m4.hotel()) {
                m4.alpha();
            }
        }
    }

    public final void india(int[] iArr, int i4) {
        M m4 = this.india;
        if (m4.juliet()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = m4.juliet.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                m4.foxtrot = M.bravo(iArr2);
                if (!m4.india()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                m4.golf = false;
            }
            if (m4.hotel()) {
                m4.alpha();
            }
        }
    }

    public final void juliet(int i4) {
        M m4 = this.india;
        if (m4.juliet()) {
            if (i4 != 0) {
                if (i4 == 1) {
                    DisplayMetrics displayMetrics = m4.juliet.getResources().getDisplayMetrics();
                    m4.kilo(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m4.hotel()) {
                        m4.alpha();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(ao.ad.zulu(i4, "Unknown auto-size text type: "));
            }
            m4.alpha = 0;
            m4.delta = -1.0f;
            m4.echo = -1.0f;
            m4.charlie = -1.0f;
            m4.foxtrot = new int[0];
            m4.bravo = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.appcompat.widget.U0] */
    public final void kilo(ColorStateList colorStateList) {
        boolean z2;
        if (this.hotel == null) {
            this.hotel = new Object();
        }
        U0 u02 = this.hotel;
        u02.alpha = colorStateList;
        if (colorStateList != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        u02.delta = z2;
        this.bravo = u02;
        this.charlie = u02;
        this.delta = u02;
        this.echo = u02;
        this.foxtrot = u02;
        this.golf = u02;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.appcompat.widget.U0] */
    public final void lima(PorterDuff.Mode mode) {
        boolean z2;
        if (this.hotel == null) {
            this.hotel = new Object();
        }
        U0 u02 = this.hotel;
        u02.bravo = mode;
        if (mode != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        u02.charlie = z2;
        this.bravo = u02;
        this.charlie = u02;
        this.delta = u02;
        this.echo = u02;
        this.foxtrot = u02;
        this.golf = u02;
    }

    public final void mike(Context context, C1915c c1915c) {
        String string;
        boolean z2;
        boolean z10;
        int i4 = this.juliet;
        TypedArray typedArray = (TypedArray) c1915c.red;
        this.juliet = typedArray.getInt(2, i4);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i10 = typedArray.getInt(11, -1);
            this.kilo = i10;
            if (i10 != -1) {
                this.juliet &= 2;
            }
        }
        int i11 = 10;
        boolean z11 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.mike = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            this.lima = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.lima = Typeface.SERIF;
                    return;
                }
                this.lima = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.lima = null;
        if (typedArray.hasValue(12)) {
            i11 = 12;
        }
        int i13 = this.kilo;
        int i14 = this.juliet;
        if (!context.isRestricted()) {
            try {
                Typeface quebec = c1915c.quebec(i11, this.juliet, new ay(this, i13, i14, new WeakReference(this.alpha)));
                if (quebec != null) {
                    if (i5 >= 28 && this.kilo != -1) {
                        Typeface create = Typeface.create(quebec, 0);
                        int i15 = this.kilo;
                        if ((this.juliet & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.lima = C.alpha(create, i15, z10);
                    } else {
                        this.lima = quebec;
                    }
                }
                if (this.lima == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.mike = z2;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.lima == null && (string = typedArray.getString(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.kilo != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i16 = this.kilo;
                if ((this.juliet & 2) != 0) {
                    z11 = true;
                }
                this.lima = C.alpha(create2, i16, z11);
                return;
            }
            this.lima = Typeface.create(string, this.juliet);
        }
    }
}
