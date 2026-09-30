package R6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.w;
import com.google.android.material.internal.x;
import com.google.android.material.internal.z;
import e7.AbstractC1632a;
import g7.g;
import g7.i;
import g7.l;
import j1.AbstractC1928b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k1.InterfaceC1999b;

/* loaded from: classes2.dex */
public final class f extends i implements Drawable.Callback, w {

    /* renamed from: I0, reason: collision with root package name */
    public static final int[] f1958I0 = {R.attr.state_enabled};

    /* renamed from: J0, reason: collision with root package name */
    public static final ShapeDrawable f1959J0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;

    /* renamed from: A0, reason: collision with root package name */
    public PorterDuff.Mode f1960A0;
    public ColorStateList B;

    /* renamed from: B0, reason: collision with root package name */
    public int[] f1961B0;
    public float C;

    /* renamed from: C0, reason: collision with root package name */
    public ColorStateList f1962C0;

    /* renamed from: D, reason: collision with root package name */
    public float f1963D;

    /* renamed from: D0, reason: collision with root package name */
    public WeakReference f1964D0;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f1965E;

    /* renamed from: E0, reason: collision with root package name */
    public TextUtils.TruncateAt f1966E0;

    /* renamed from: F, reason: collision with root package name */
    public float f1967F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f1968F0;

    /* renamed from: G, reason: collision with root package name */
    public ColorStateList f1969G;

    /* renamed from: G0, reason: collision with root package name */
    public int f1970G0;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f1971H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f1972H0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1973I;

    /* renamed from: J, reason: collision with root package name */
    public Drawable f1974J;

    /* renamed from: K, reason: collision with root package name */
    public ColorStateList f1975K;

    /* renamed from: L, reason: collision with root package name */
    public float f1976L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1977M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1978N;

    /* renamed from: O, reason: collision with root package name */
    public Drawable f1979O;

    /* renamed from: P, reason: collision with root package name */
    public RippleDrawable f1980P;
    public ColorStateList Q;

    /* renamed from: R, reason: collision with root package name */
    public float f1981R;

    /* renamed from: S, reason: collision with root package name */
    public SpannableStringBuilder f1982S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f1983T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f1984U;

    /* renamed from: V, reason: collision with root package name */
    public Drawable f1985V;

    /* renamed from: W, reason: collision with root package name */
    public ColorStateList f1986W;

    /* renamed from: X, reason: collision with root package name */
    public M6.e f1987X;

    /* renamed from: Y, reason: collision with root package name */
    public M6.e f1988Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f1989Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f1990a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f1991b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f1992c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f1993d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f1994e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f1995f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f1996g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Context f1997h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Paint f1998i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Paint.FontMetrics f1999j0;

    /* renamed from: k0, reason: collision with root package name */
    public final RectF f2000k0;

    /* renamed from: l0, reason: collision with root package name */
    public final PointF f2001l0;

    /* renamed from: m0, reason: collision with root package name */
    public final Path f2002m0;

    /* renamed from: n0, reason: collision with root package name */
    public final x f2003n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f2004o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f2005p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2006q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f2007r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f2008s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f2009t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2010u0;
    public int v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f2011w0;

    /* renamed from: x0, reason: collision with root package name */
    public ColorFilter f2012x0;

    /* renamed from: y0, reason: collision with root package name */
    public PorterDuffColorFilter f2013y0;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f2014z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, delivery.samurai.android.R.attr.chipStyle, 2132083901);
        this.f1963D = -1.0f;
        this.f1998i0 = new Paint(1);
        this.f1999j0 = new Paint.FontMetrics();
        this.f2000k0 = new RectF();
        this.f2001l0 = new PointF();
        this.f2002m0 = new Path();
        this.f2011w0 = 255;
        this.f1960A0 = PorterDuff.Mode.SRC_IN;
        this.f1964D0 = new WeakReference(null);
        mike(context);
        this.f1997h0 = context;
        x xVar = new x(this);
        this.f2003n0 = xVar;
        this.f1971H = "";
        xVar.alpha.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f1958I0;
        setState(iArr);
        ochre(iArr);
        this.f1968F0 = true;
        f1959J0.setTint(-1);
    }

    public static boolean black(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean blue(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public static void teal(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // com.google.android.material.internal.w
    public final void alpha() {
        bronze();
        invalidateSelf();
    }

    public final float amber() {
        Drawable drawable;
        if (!red() && !purple()) {
            return 0.0f;
        }
        float f5 = this.f1990a0;
        if (this.f2010u0) {
            drawable = this.f1985V;
        } else {
            drawable = this.f1974J;
        }
        float f10 = this.f1976L;
        if (f10 <= 0.0f && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        return f10 + f5 + this.f1991b0;
    }

    public final float azure() {
        if (silver()) {
            return this.f1994e0 + this.f1981R + this.f1995f0;
        }
        return 0.0f;
    }

    public final float beige() {
        if (this.f1972H0) {
            return kilo();
        }
        return this.f1963D;
    }

    public final void bronze() {
        e eVar = (e) this.f1964D0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.bravo(chip.f7972i);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean coral(int[] iArr, int[] iArr2) {
        int i4;
        int i5;
        boolean z2;
        boolean z10;
        int i10;
        int i11;
        d7.e eVar;
        int i12;
        int[] state;
        boolean z11;
        boolean z12;
        ColorStateList colorStateList;
        int i13;
        PorterDuffColorFilter porterDuffColorFilter;
        float amber;
        ColorStateList colorStateList2;
        boolean z13 = true;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList3 = this.A;
        if (colorStateList3 != null) {
            i4 = colorStateList3.getColorForState(iArr, this.f2004o0);
        } else {
            i4 = 0;
        }
        int delta = delta(i4);
        if (this.f2004o0 != delta) {
            this.f2004o0 = delta;
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.B;
        if (colorStateList4 != null) {
            i5 = colorStateList4.getColorForState(iArr, this.f2005p0);
        } else {
            i5 = 0;
        }
        int delta2 = delta(i5);
        if (this.f2005p0 != delta2) {
            this.f2005p0 = delta2;
            onStateChange = true;
        }
        int bravo = AbstractC1928b.bravo(delta2, delta);
        if (this.f2006q0 != bravo) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.purple.delta == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z2 | z10) {
            this.f2006q0 = bravo;
            quebec(ColorStateList.valueOf(bravo));
            onStateChange = true;
        }
        ColorStateList colorStateList5 = this.f1965E;
        if (colorStateList5 != null) {
            i10 = colorStateList5.getColorForState(iArr, this.f2007r0);
        } else {
            i10 = 0;
        }
        if (this.f2007r0 != i10) {
            this.f2007r0 = i10;
            onStateChange = true;
        }
        if (this.f1962C0 != null) {
            int[] iArr3 = AbstractC1632a.alpha;
            boolean z14 = false;
            boolean z15 = false;
            for (int i14 : iArr) {
                if (i14 == 16842910) {
                    z14 = true;
                } else if (i14 == 16842908 || i14 == 16842919 || i14 == 16843623) {
                    z15 = true;
                }
            }
            if (z14 && z15) {
                i11 = this.f1962C0.getColorForState(iArr, this.f2008s0);
                if (this.f2008s0 != i11) {
                    this.f2008s0 = i11;
                }
                eVar = this.f2003n0.golf;
                if (eVar == null && (colorStateList2 = eVar.kilo) != null) {
                    i12 = colorStateList2.getColorForState(iArr, this.f2009t0);
                } else {
                    i12 = 0;
                }
                if (this.f2009t0 != i12) {
                    this.f2009t0 = i12;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length) {
                            break;
                        }
                        if (state[i15] == 16842912) {
                            if (this.f1983T) {
                                z11 = true;
                            }
                        } else {
                            i15++;
                        }
                    }
                }
                z11 = false;
                if (this.f2010u0 != z11 && this.f1985V != null) {
                    amber = amber();
                    this.f2010u0 = z11;
                    if (amber == amber()) {
                        onStateChange = true;
                        z12 = true;
                        colorStateList = this.f2014z0;
                        if (colorStateList != null) {
                            i13 = colorStateList.getColorForState(iArr, this.v0);
                        } else {
                            i13 = 0;
                        }
                        if (this.v0 != i13) {
                            this.v0 = i13;
                            ColorStateList colorStateList6 = this.f2014z0;
                            PorterDuff.Mode mode = this.f1960A0;
                            if (colorStateList6 != null && mode != null) {
                                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                            } else {
                                porterDuffColorFilter = null;
                            }
                            this.f2013y0 = porterDuffColorFilter;
                        } else {
                            z13 = onStateChange;
                        }
                        if (blue(this.f1974J)) {
                            z13 |= this.f1974J.setState(iArr);
                        }
                        if (blue(this.f1985V)) {
                            z13 |= this.f1985V.setState(iArr);
                        }
                        if (blue(this.f1979O)) {
                            int[] iArr4 = new int[iArr.length + iArr2.length];
                            System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                            System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                            z13 |= this.f1979O.setState(iArr4);
                        }
                        if (blue(this.f1980P)) {
                            z13 |= this.f1980P.setState(iArr2);
                        }
                        if (z13) {
                            invalidateSelf();
                        }
                        if (z12) {
                            bronze();
                        }
                        return z13;
                    }
                    onStateChange = true;
                }
                z12 = false;
                colorStateList = this.f2014z0;
                if (colorStateList != null) {
                }
                if (this.v0 != i13) {
                }
                if (blue(this.f1974J)) {
                }
                if (blue(this.f1985V)) {
                }
                if (blue(this.f1979O)) {
                }
                if (blue(this.f1980P)) {
                }
                if (z13) {
                }
                if (z12) {
                }
                return z13;
            }
        }
        i11 = 0;
        if (this.f2008s0 != i11) {
        }
        eVar = this.f2003n0.golf;
        if (eVar == null) {
        }
        i12 = 0;
        if (this.f2009t0 != i12) {
        }
        state = getState();
        if (state != null) {
        }
        z11 = false;
        if (this.f2010u0 != z11) {
            amber = amber();
            this.f2010u0 = z11;
            if (amber == amber()) {
            }
        }
        z12 = false;
        colorStateList = this.f2014z0;
        if (colorStateList != null) {
        }
        if (this.v0 != i13) {
        }
        if (blue(this.f1974J)) {
        }
        if (blue(this.f1985V)) {
        }
        if (blue(this.f1979O)) {
        }
        if (blue(this.f1980P)) {
        }
        if (z13) {
        }
        if (z12) {
        }
        return z13;
    }

    public final void crimson(boolean z2) {
        if (this.f1983T != z2) {
            this.f1983T = z2;
            float amber = amber();
            if (!z2 && this.f2010u0) {
                this.f2010u0 = false;
            }
            float amber2 = amber();
            invalidateSelf();
            if (amber != amber2) {
                bronze();
            }
        }
    }

    public final void cyan(Drawable drawable) {
        if (this.f1985V != drawable) {
            float amber = amber();
            this.f1985V = drawable;
            float amber2 = amber();
            teal(this.f1985V);
            yankee(this.f1985V);
            invalidateSelf();
            if (amber != amber2) {
                bronze();
            }
        }
    }

    @Override // g7.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i4;
        Canvas canvas2;
        int i5;
        float f5;
        boolean z2;
        int i10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i4 = this.f2011w0) != 0) {
            if (i4 < 255) {
                canvas2 = canvas;
                i5 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i4);
            } else {
                canvas2 = canvas;
                i5 = 0;
            }
            boolean z10 = this.f1972H0;
            Paint paint = this.f1998i0;
            RectF rectF = this.f2000k0;
            if (!z10) {
                paint.setColor(this.f2004o0);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, beige(), beige(), paint);
            }
            if (!this.f1972H0) {
                paint.setColor(this.f2005p0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f2012x0;
                if (colorFilter == null) {
                    colorFilter = this.f2013y0;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, beige(), beige(), paint);
            }
            if (this.f1972H0) {
                super.draw(canvas);
            }
            if (this.f1967F > 0.0f && !this.f1972H0) {
                paint.setColor(this.f2007r0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f1972H0) {
                    ColorFilter colorFilter2 = this.f2012x0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f2013y0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f10 = bounds.left;
                float f11 = this.f1967F / 2.0f;
                rectF.set(f10 + f11, bounds.top + f11, bounds.right - f11, bounds.bottom - f11);
                float f12 = this.f1963D - (this.f1967F / 2.0f);
                canvas2.drawRoundRect(rectF, f12, f12, paint);
            }
            paint.setColor(this.f2008s0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.f1972H0) {
                canvas2.drawRoundRect(rectF, beige(), beige(), paint);
            } else {
                RectF rectF2 = new RectF(bounds);
                Path path = this.f2002m0;
                g gVar = this.purple;
                this.f12660l.alpha(gVar.alpha, this.f12670v, gVar.juliet, rectF2, this.f12659k, path);
                foxtrot(canvas2, paint, path, this.purple.alpha, this.f12670v, hotel());
            }
            if (red()) {
                zulu(bounds, rectF);
                float f13 = rectF.left;
                float f14 = rectF.top;
                canvas2.translate(f13, f14);
                this.f1974J.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.f1974J.draw(canvas2);
                canvas2.translate(-f13, -f14);
            }
            if (purple()) {
                zulu(bounds, rectF);
                float f15 = rectF.left;
                float f16 = rectF.top;
                canvas2.translate(f15, f16);
                this.f1985V.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.f1985V.draw(canvas2);
                canvas2.translate(-f15, -f16);
            }
            if (this.f1968F0 && this.f1971H != null) {
                PointF pointF = this.f2001l0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f1971H;
                x xVar = this.f2003n0;
                if (charSequence != null) {
                    float amber = amber() + this.f1989Z + this.f1992c0;
                    if (getLayoutDirection() == 0) {
                        pointF.x = bounds.left + amber;
                    } else {
                        pointF.x = bounds.right - amber;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = xVar.alpha;
                    Paint.FontMetrics fontMetrics = this.f1999j0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF.setEmpty();
                if (this.f1971H != null) {
                    float amber2 = amber() + this.f1989Z + this.f1992c0;
                    float azure = azure() + this.f1996g0 + this.f1993d0;
                    if (getLayoutDirection() == 0) {
                        rectF.left = bounds.left + amber2;
                        rectF.right = bounds.right - azure;
                    } else {
                        rectF.left = bounds.left + azure;
                        rectF.right = bounds.right - amber2;
                    }
                    rectF.top = bounds.top;
                    rectF.bottom = bounds.bottom;
                }
                d7.e eVar = xVar.golf;
                TextPaint textPaint2 = xVar.alpha;
                if (eVar != null) {
                    textPaint2.drawableState = getState();
                    xVar.golf.delta(this.f1997h0, textPaint2, xVar.bravo);
                }
                textPaint2.setTextAlign(align);
                String charSequence2 = this.f1971H.toString();
                if (!xVar.echo) {
                    f5 = xVar.charlie;
                } else {
                    xVar.alpha(charSequence2);
                    f5 = xVar.charlie;
                }
                if (Math.round(f5) > Math.round(rectF.width())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int save = canvas2.save();
                    canvas2.clipRect(rectF);
                    i10 = save;
                } else {
                    i10 = 0;
                }
                CharSequence charSequence3 = this.f1971H;
                if (z2 && this.f1966E0 != null) {
                    charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.f1966E0);
                }
                canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
                canvas2 = canvas;
                if (z2) {
                    canvas2.restoreToCount(i10);
                }
            }
            if (silver()) {
                rectF.setEmpty();
                if (silver()) {
                    float f17 = this.f1996g0 + this.f1995f0;
                    if (getLayoutDirection() == 0) {
                        float f18 = bounds.right - f17;
                        rectF.right = f18;
                        rectF.left = f18 - this.f1981R;
                    } else {
                        float f19 = bounds.left + f17;
                        rectF.left = f19;
                        rectF.right = f19 + this.f1981R;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f20 = this.f1981R;
                    float f21 = exactCenterY - (f20 / 2.0f);
                    rectF.top = f21;
                    rectF.bottom = f21 + f20;
                }
                float f22 = rectF.left;
                float f23 = rectF.top;
                canvas2.translate(f22, f23);
                this.f1979O.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.f1980P.setBounds(this.f1979O.getBounds());
                this.f1980P.jumpToCurrentState();
                this.f1980P.draw(canvas2);
                canvas2.translate(-f22, -f23);
            }
            if (this.f2011w0 < 255) {
                canvas2.restoreToCount(i5);
            }
        }
    }

    public final void emerald(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f1986W != colorStateList) {
            this.f1986W = colorStateList;
            if (this.f1984U && (drawable = this.f1985V) != null && this.f1983T) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void fuchsia(boolean z2) {
        if (this.f1984U != z2) {
            boolean purple = purple();
            this.f1984U = z2;
            boolean purple2 = purple();
            if (purple != purple2) {
                if (purple2) {
                    yankee(this.f1985V);
                } else {
                    teal(this.f1985V);
                }
                invalidateSelf();
                bronze();
            }
        }
    }

    @Override // g7.i, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2011w0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f2012x0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f5;
        float amber = amber() + this.f1989Z + this.f1992c0;
        String charSequence = this.f1971H.toString();
        x xVar = this.f2003n0;
        if (!xVar.echo) {
            f5 = xVar.charlie;
        } else {
            xVar.alpha(charSequence);
            f5 = xVar.charlie;
        }
        return Math.min(Math.round(azure() + f5 + amber + this.f1993d0 + this.f1996g0), this.f1970G0);
    }

    @Override // g7.i, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // g7.i, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f1972H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f1963D);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.C, this.f1963D);
        }
        outline2.setAlpha(this.f2011w0 / 255.0f);
    }

    public final void gold(float f5) {
        if (this.f1963D != f5) {
            this.f1963D = f5;
            l golf = this.purple.alpha.golf();
            golf.charlie(f5);
            setShapeAppearanceModel(golf.alpha());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void gray(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1974J;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC1999b;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float amber = amber();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.f1974J = drawable4;
            float amber2 = amber();
            teal(drawable2);
            if (red()) {
                yankee(this.f1974J);
            }
            invalidateSelf();
            if (amber != amber2) {
                bronze();
            }
        }
    }

    public final void green(float f5) {
        if (this.f1976L != f5) {
            float amber = amber();
            this.f1976L = f5;
            float amber2 = amber();
            invalidateSelf();
            if (amber != amber2) {
                bronze();
            }
        }
    }

    public final void indigo(ColorStateList colorStateList) {
        this.f1977M = true;
        if (this.f1975K != colorStateList) {
            this.f1975K = colorStateList;
            if (red()) {
                this.f1974J.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // g7.i, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!black(this.A) && !black(this.B) && !black(this.f1965E)) {
            d7.e eVar = this.f2003n0.golf;
            if (eVar == null || (colorStateList = eVar.kilo) == null || !colorStateList.isStateful()) {
                if ((!this.f1984U || this.f1985V == null || !this.f1983T) && !blue(this.f1974J) && !blue(this.f1985V) && !black(this.f2014z0)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void ivory(boolean z2) {
        if (this.f1973I != z2) {
            boolean red = red();
            this.f1973I = z2;
            boolean red2 = red();
            if (red != red2) {
                if (red2) {
                    yankee(this.f1974J);
                } else {
                    teal(this.f1974J);
                }
                invalidateSelf();
                bronze();
            }
        }
    }

    public final void jade(ColorStateList colorStateList) {
        if (this.f1965E != colorStateList) {
            this.f1965E = colorStateList;
            if (this.f1972H0) {
                g gVar = this.purple;
                if (gVar.echo != colorStateList) {
                    gVar.echo = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void lavender(float f5) {
        if (this.f1967F != f5) {
            this.f1967F = f5;
            this.f1998i0.setStrokeWidth(f5);
            if (this.f1972H0) {
                this.purple.kilo = f5;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lime(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1979O;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC1999b;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float azure = azure();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.f1979O = drawable4;
            this.f1980P = new RippleDrawable(AbstractC1632a.bravo(this.f1969G), this.f1979O, f1959J0);
            float azure2 = azure();
            teal(drawable2);
            if (silver()) {
                yankee(this.f1979O);
            }
            invalidateSelf();
            if (azure != azure2) {
                bronze();
            }
        }
    }

    public final void magenta(float f5) {
        if (this.f1995f0 != f5) {
            this.f1995f0 = f5;
            invalidateSelf();
            if (silver()) {
                bronze();
            }
        }
    }

    public final void maroon(float f5) {
        if (this.f1981R != f5) {
            this.f1981R = f5;
            invalidateSelf();
            if (silver()) {
                bronze();
            }
        }
    }

    public final void navy(float f5) {
        if (this.f1994e0 != f5) {
            this.f1994e0 = f5;
            invalidateSelf();
            if (silver()) {
                bronze();
            }
        }
    }

    public final boolean ochre(int[] iArr) {
        if (!Arrays.equals(this.f1961B0, iArr)) {
            this.f1961B0 = iArr;
            if (silver()) {
                return coral(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public final void olive(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (silver()) {
                this.f1979O.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i4);
        if (red()) {
            onLayoutDirectionChanged |= this.f1974J.setLayoutDirection(i4);
        }
        if (purple()) {
            onLayoutDirectionChanged |= this.f1985V.setLayoutDirection(i4);
        }
        if (silver()) {
            onLayoutDirectionChanged |= this.f1979O.setLayoutDirection(i4);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        boolean onLevelChange = super.onLevelChange(i4);
        if (red()) {
            onLevelChange |= this.f1974J.setLevel(i4);
        }
        if (purple()) {
            onLevelChange |= this.f1985V.setLevel(i4);
        }
        if (silver()) {
            onLevelChange |= this.f1979O.setLevel(i4);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // g7.i, android.graphics.drawable.Drawable, com.google.android.material.internal.w
    public final boolean onStateChange(int[] iArr) {
        if (this.f1972H0) {
            super.onStateChange(iArr);
        }
        return coral(iArr, this.f1961B0);
    }

    public final void orange(boolean z2) {
        if (this.f1978N != z2) {
            boolean silver = silver();
            this.f1978N = z2;
            boolean silver2 = silver();
            if (silver != silver2) {
                if (silver2) {
                    yankee(this.f1979O);
                } else {
                    teal(this.f1979O);
                }
                invalidateSelf();
                bronze();
            }
        }
    }

    public final void peach(float f5) {
        if (this.f1991b0 != f5) {
            float amber = amber();
            this.f1991b0 = f5;
            float amber2 = amber();
            invalidateSelf();
            if (amber != amber2) {
                bronze();
            }
        }
    }

    public final void pink(float f5) {
        if (this.f1990a0 != f5) {
            float amber = amber();
            this.f1990a0 = f5;
            float amber2 = amber();
            invalidateSelf();
            if (amber != amber2) {
                bronze();
            }
        }
    }

    public final void plum(ColorStateList colorStateList) {
        if (this.f1969G != colorStateList) {
            this.f1969G = colorStateList;
            this.f1962C0 = null;
            onStateChange(getState());
        }
    }

    public final boolean purple() {
        if (this.f1984U && this.f1985V != null && this.f2010u0) {
            return true;
        }
        return false;
    }

    public final boolean red() {
        if (this.f1973I && this.f1974J != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j5);
        }
    }

    @Override // g7.i, android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.f2011w0 != i4) {
            this.f2011w0 = i4;
            invalidateSelf();
        }
    }

    @Override // g7.i, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2012x0 != colorFilter) {
            this.f2012x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // g7.i, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f2014z0 != colorStateList) {
            this.f2014z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // g7.i, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f1960A0 != mode) {
            this.f1960A0 = mode;
            ColorStateList colorStateList = this.f2014z0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f2013y0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        boolean visible = super.setVisible(z2, z10);
        if (red()) {
            visible |= this.f1974J.setVisible(z2, z10);
        }
        if (purple()) {
            visible |= this.f1985V.setVisible(z2, z10);
        }
        if (silver()) {
            visible |= this.f1979O.setVisible(z2, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final boolean silver() {
        if (this.f1978N && this.f1979O != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void yankee(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f1979O) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f1961B0);
                }
                drawable.setTintList(this.Q);
                return;
            }
            Drawable drawable2 = this.f1974J;
            if (drawable == drawable2 && this.f1977M) {
                drawable2.setTintList(this.f1975K);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void zulu(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (!red() && !purple()) {
            return;
        }
        float f5 = this.f1989Z + this.f1990a0;
        if (this.f2010u0) {
            drawable = this.f1985V;
        } else {
            drawable = this.f1974J;
        }
        float f10 = this.f1976L;
        if (f10 <= 0.0f && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        if (getLayoutDirection() == 0) {
            float f11 = rect.left + f5;
            rectF.left = f11;
            rectF.right = f11 + f10;
        } else {
            float f12 = rect.right - f5;
            rectF.right = f12;
            rectF.left = f12 - f10;
        }
        if (this.f2010u0) {
            drawable2 = this.f1985V;
        } else {
            drawable2 = this.f1974J;
        }
        float f13 = this.f1976L;
        if (f13 <= 0.0f && drawable2 != null) {
            f13 = (float) Math.ceil(z.delta(24, this.f1997h0));
            if (drawable2.getIntrinsicHeight() <= f13) {
                f13 = drawable2.getIntrinsicHeight();
            }
        }
        float exactCenterY = rect.exactCenterY() - (f13 / 2.0f);
        rectF.top = exactCenterY;
        rectF.bottom = exactCenterY + f13;
    }
}
