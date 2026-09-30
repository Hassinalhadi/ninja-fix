package com.google.android.material.chip;

import L6.a;
import Pf.j;
import R6.b;
import R6.c;
import R6.d;
import R6.e;
import R6.f;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0484v;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.z;
import com.google.mlkit.vision.barcode.common.Barcode;
import e7.AbstractC1632a;
import g1.AbstractC1735d;
import g7.m;
import g7.x;
import java.lang.ref.WeakReference;
import java.util.Locale;
import k1.InterfaceC1999b;
import l7.AbstractC2059a;
import q1.g;
import s1.au;
import s6.AbstractC2710m0;
import s6.AbstractC2719n0;
import s6.R4;
import t6.AbstractC3032n3;

/* loaded from: classes2.dex */
public class Chip extends C0484v implements e, x, Checkable {

    /* renamed from: p, reason: collision with root package name */
    public static final Rect f7962p = new Rect();

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f7963q = {R.attr.state_selected};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f7964r = {R.attr.state_checkable};

    /* renamed from: a, reason: collision with root package name */
    public View.OnClickListener f7965a;

    /* renamed from: b, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f7966b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7967c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7968d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7969f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7970g;

    /* renamed from: h, reason: collision with root package name */
    public int f7971h;

    /* renamed from: i, reason: collision with root package name */
    public int f7972i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f7973j;

    /* renamed from: k, reason: collision with root package name */
    public final d f7974k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7975l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f7976m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f7977n;

    /* renamed from: o, reason: collision with root package name */
    public final b f7978o;
    public f teal;
    public InsetDrawable white;
    public RippleDrawable yellow;

    public Chip(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, delivery.samurai.android.R.attr.chipStyle, 2132083901), attributeSet, delivery.samurai.android.R.attr.chipStyle);
        d7.e eVar;
        float dimension;
        int resourceId;
        this.f7976m = new Rect();
        this.f7977n = new RectF();
        this.f7978o = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        f fVar = new f(context2, attributeSet);
        int[] iArr = a.golf;
        TypedArray golf = z.golf(fVar.f1997h0, attributeSet, iArr, delivery.samurai.android.R.attr.chipStyle, 2132083901, new int[0]);
        fVar.f1972H0 = golf.hasValue(37);
        Context context3 = fVar.f1997h0;
        ColorStateList alpha = AbstractC2719n0.alpha(context3, golf, 24);
        if (fVar.A != alpha) {
            fVar.A = alpha;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList alpha2 = AbstractC2719n0.alpha(context3, golf, 11);
        if (fVar.B != alpha2) {
            fVar.B = alpha2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension2 = golf.getDimension(19, 0.0f);
        if (fVar.C != dimension2) {
            fVar.C = dimension2;
            fVar.invalidateSelf();
            fVar.bronze();
        }
        if (golf.hasValue(12)) {
            fVar.gold(golf.getDimension(12, 0.0f));
        }
        fVar.jade(AbstractC2719n0.alpha(context3, golf, 22));
        fVar.lavender(golf.getDimension(23, 0.0f));
        fVar.plum(AbstractC2719n0.alpha(context3, golf, 36));
        String text = golf.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(fVar.f1971H, text);
        com.google.android.material.internal.x xVar = fVar.f2003n0;
        if (!equals) {
            fVar.f1971H = text;
            xVar.echo = true;
            fVar.invalidateSelf();
            fVar.bronze();
        }
        if (golf.hasValue(0) && (resourceId = golf.getResourceId(0, 0)) != 0) {
            eVar = new d7.e(context3, resourceId);
        } else {
            eVar = null;
        }
        eVar.lima = golf.getDimension(1, eVar.lima);
        xVar.bravo(eVar, context3);
        int i4 = golf.getInt(3, 0);
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    fVar.f1966E0 = TextUtils.TruncateAt.END;
                }
            } else {
                fVar.f1966E0 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            fVar.f1966E0 = TextUtils.TruncateAt.START;
        }
        fVar.ivory(golf.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.ivory(golf.getBoolean(15, false));
        }
        fVar.gray(AbstractC2719n0.delta(context3, golf, 14));
        if (golf.hasValue(17)) {
            fVar.indigo(AbstractC2719n0.alpha(context3, golf, 17));
        }
        fVar.green(golf.getDimension(16, -1.0f));
        fVar.orange(golf.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.orange(golf.getBoolean(26, false));
        }
        fVar.lime(AbstractC2719n0.delta(context3, golf, 25));
        fVar.olive(AbstractC2719n0.alpha(context3, golf, 30));
        fVar.maroon(golf.getDimension(28, 0.0f));
        fVar.crimson(golf.getBoolean(6, false));
        fVar.fuchsia(golf.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.fuchsia(golf.getBoolean(8, false));
        }
        fVar.cyan(AbstractC2719n0.delta(context3, golf, 7));
        if (golf.hasValue(9)) {
            fVar.emerald(AbstractC2719n0.alpha(context3, golf, 9));
        }
        fVar.f1987X = M6.e.alpha(context3, golf, 39);
        fVar.f1988Y = M6.e.alpha(context3, golf, 33);
        float dimension3 = golf.getDimension(21, 0.0f);
        if (fVar.f1989Z != dimension3) {
            fVar.f1989Z = dimension3;
            fVar.invalidateSelf();
            fVar.bronze();
        }
        fVar.pink(golf.getDimension(35, 0.0f));
        fVar.peach(golf.getDimension(34, 0.0f));
        float dimension4 = golf.getDimension(41, 0.0f);
        if (fVar.f1992c0 != dimension4) {
            fVar.f1992c0 = dimension4;
            fVar.invalidateSelf();
            fVar.bronze();
        }
        float dimension5 = golf.getDimension(40, 0.0f);
        if (fVar.f1993d0 != dimension5) {
            fVar.f1993d0 = dimension5;
            fVar.invalidateSelf();
            fVar.bronze();
        }
        fVar.navy(golf.getDimension(29, 0.0f));
        fVar.magenta(golf.getDimension(27, 0.0f));
        float dimension6 = golf.getDimension(13, 0.0f);
        if (fVar.f1996g0 != dimension6) {
            fVar.f1996g0 = dimension6;
            fVar.invalidateSelf();
            fVar.bronze();
        }
        fVar.f1970G0 = golf.getDimensionPixelSize(4, LottieConstants.IterateForever);
        golf.recycle();
        z.alpha(context2, attributeSet, delivery.samurai.android.R.attr.chipStyle, 2132083901);
        z.bravo(context2, attributeSet, iArr, delivery.samurai.android.R.attr.chipStyle, 2132083901, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, delivery.samurai.android.R.attr.chipStyle, 2132083901);
        this.f7970g = obtainStyledAttributes.getBoolean(32, false);
        TypedValue bravo = AbstractC2710m0.bravo(delivery.samurai.android.R.attr.minTouchTargetSize, context2);
        if (bravo != null && bravo.type == 5) {
            dimension = bravo.getDimension(context2.getResources().getDisplayMetrics());
        } else {
            dimension = context2.getResources().getDimension(delivery.samurai.android.R.dimen.mtrl_min_touch_target_size);
        }
        this.f7972i = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) dimension));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.papa(getElevation());
        z.alpha(context2, attributeSet, delivery.samurai.android.R.attr.chipStyle, 2132083901);
        z.bravo(context2, attributeSet, iArr, delivery.samurai.android.R.attr.chipStyle, 2132083901, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, delivery.samurai.android.R.attr.chipStyle, 2132083901);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f7974k = new d(this, this);
        delta();
        if (!hasValue) {
            setOutlineProvider(new c(0, this));
        }
        setChecked(this.f7967c);
        setText(fVar.f1971H);
        setEllipsize(fVar.f1966E0);
        golf();
        if (!this.teal.f1968F0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        foxtrot();
        if (this.f7970g) {
            setMinHeight(this.f7972i);
        }
        this.f7971h = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: R6.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f7966b;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f7977n;
        rectF.setEmpty();
        if (charlie() && this.f7965a != null) {
            f fVar = this.teal;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.silver()) {
                float f5 = fVar.f1996g0 + fVar.f1995f0 + fVar.f1981R + fVar.f1994e0 + fVar.f1993d0;
                if (fVar.getLayoutDirection() == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f5;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f5;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i4 = (int) closeIconTouchBounds.left;
        int i5 = (int) closeIconTouchBounds.top;
        int i10 = (int) closeIconTouchBounds.right;
        int i11 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f7976m;
        rect.set(i4, i5, i10, i11);
        return rect;
    }

    private d7.e getTextAppearance() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f2003n0.golf;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.e != z2) {
            this.e = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f7968d != z2) {
            this.f7968d = z2;
            refreshDrawableState();
        }
    }

    public final void bravo(int i4) {
        int i5;
        this.f7972i = i4;
        int i10 = 0;
        if (!this.f7970g) {
            InsetDrawable insetDrawable = this.white;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.white = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    echo();
                    return;
                }
                return;
            }
            echo();
            return;
        }
        int max = Math.max(0, i4 - ((int) this.teal.C));
        int max2 = Math.max(0, i4 - this.teal.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.white;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.white = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    echo();
                    return;
                }
                return;
            }
            echo();
            return;
        }
        if (max2 > 0) {
            i5 = max2 / 2;
        } else {
            i5 = 0;
        }
        if (max > 0) {
            i10 = max / 2;
        }
        int i11 = i10;
        if (this.white != null) {
            Rect rect = new Rect();
            this.white.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i5 && rect.right == i5) {
                echo();
                return;
            }
        }
        if (getMinHeight() != i4) {
            setMinHeight(i4);
        }
        if (getMinWidth() != i4) {
            setMinWidth(i4);
        }
        this.white = new InsetDrawable((Drawable) this.teal, i5, i11, i5, i11);
        echo();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean charlie() {
        f fVar = this.teal;
        if (fVar != null) {
            Object obj = fVar.f1979O;
            if (obj != null) {
                if (obj instanceof InterfaceC1999b) {
                }
                if (obj == null) {
                    return true;
                }
                return false;
            }
            obj = null;
            if (obj == null) {
            }
        } else {
            return false;
        }
    }

    public final void delta() {
        f fVar;
        if (charlie() && (fVar = this.teal) != null && fVar.f1978N && this.f7965a != null) {
            au.november(this, this.f7974k);
            this.f7975l = true;
        } else {
            au.november(this, null);
            this.f7975l = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i4;
        int i5;
        if (!this.f7975l) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f7974k;
        AccessibilityManager accessibilityManager = dVar.hotel;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i5 = dVar.mike) != Integer.MIN_VALUE) {
                    if (i5 != Integer.MIN_VALUE) {
                        dVar.mike = RecyclerView.UNDEFINED_DURATION;
                        dVar.romeo(i5, Barcode.FORMAT_QR_CODE);
                        return true;
                    }
                }
            } else {
                float x4 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Chip chip = dVar.quebec;
                if (chip.charlie() && chip.getCloseIconTouchBounds().contains(x4, y10)) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                int i10 = dVar.mike;
                if (i10 != i4) {
                    dVar.mike = i4;
                    dVar.romeo(i4, 128);
                    dVar.romeo(i10, Barcode.FORMAT_QR_CODE);
                }
            }
            return true;
        }
        if (super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f7975l) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f7974k;
        dVar.getClass();
        boolean z2 = false;
        int i4 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i5 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i5 = 130;
                                        }
                                    } else {
                                        i5 = 17;
                                    }
                                } else {
                                    i5 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i4 < repeatCount && dVar.mike(i5, null)) {
                                    i4++;
                                    z10 = true;
                                }
                                z2 = z10;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i10 = dVar.lima;
                    if (i10 != Integer.MIN_VALUE) {
                        Chip chip = dVar.quebec;
                        if (i10 == 0) {
                            chip.performClick();
                        } else if (i10 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f7965a;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f7975l) {
                                chip.f7974k.romeo(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = dVar.mike(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = dVar.mike(1, null);
            }
        }
        if (z2 && dVar.lima != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.C0484v, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.teal;
        boolean z2 = false;
        int i4 = 0;
        z2 = false;
        if (fVar != null && f.blue(fVar.f1979O)) {
            f fVar2 = this.teal;
            ?? isEnabled = isEnabled();
            int i5 = isEnabled;
            if (this.f7969f) {
                i5 = isEnabled + 1;
            }
            int i10 = i5;
            if (this.e) {
                i10 = i5 + 1;
            }
            int i11 = i10;
            if (this.f7968d) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (isChecked()) {
                i12 = i11 + 1;
            }
            int[] iArr = new int[i12];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i4 = 1;
            }
            if (this.f7969f) {
                iArr[i4] = 16842908;
                i4++;
            }
            if (this.e) {
                iArr[i4] = 16843623;
                i4++;
            }
            if (this.f7968d) {
                iArr[i4] = 16842919;
                i4++;
            }
            if (isChecked()) {
                iArr[i4] = 16842913;
            }
            z2 = fVar2.ochre(iArr);
        }
        if (z2) {
            invalidate();
        }
    }

    public final void echo() {
        this.yellow = new RippleDrawable(AbstractC1632a.bravo(this.teal.f1969G), getBackgroundDrawable(), null);
        this.teal.getClass();
        setBackground(this.yellow);
        foxtrot();
    }

    public final void foxtrot() {
        f fVar;
        if (!TextUtils.isEmpty(getText()) && (fVar = this.teal) != null) {
            int azure = (int) (fVar.azure() + fVar.f1996g0 + fVar.f1993d0);
            f fVar2 = this.teal;
            int amber = (int) (fVar2.amber() + fVar2.f1989Z + fVar2.f1992c0);
            if (this.white != null) {
                Rect rect = new Rect();
                this.white.getPadding(rect);
                amber += rect.left;
                azure += rect.right;
            }
            setPaddingRelative(amber, getPaddingTop(), azure, getPaddingBottom());
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        boolean z2;
        if (!TextUtils.isEmpty(this.f7973j)) {
            return this.f7973j;
        }
        f fVar = this.teal;
        if (fVar != null && fVar.f1983T) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            getParent();
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.white;
        if (insetDrawable == null) {
            return this.teal;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1985V;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1986W;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.B;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.teal;
        if (fVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, fVar.beige());
    }

    public Drawable getChipDrawable() {
        return this.teal;
    }

    public float getChipEndPadding() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1996g0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.teal;
        if (fVar == null || (drawable = fVar.f1974J) == 0) {
            return null;
        }
        if (drawable instanceof InterfaceC1999b) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1976L;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1975K;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.C;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1989Z;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1965E;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1967F;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.teal;
        if (fVar == null || (drawable = fVar.f1979O) == 0) {
            return null;
        }
        if (drawable instanceof InterfaceC1999b) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1982S;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1995f0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1981R;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1994e0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.Q;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1966E0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f7975l) {
            d dVar = this.f7974k;
            if (dVar.lima == 1 || dVar.kilo == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public M6.e getHideMotionSpec() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1988Y;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1991b0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1990a0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1969G;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        return this.teal.purple.alpha;
    }

    public M6.e getShowMotionSpec() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1987X;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1993d0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.teal;
        if (fVar != null) {
            return fVar.f1992c0;
        }
        return 0.0f;
    }

    public final void golf() {
        TextPaint paint = getPaint();
        f fVar = this.teal;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        d7.e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.delta(getContext(), paint, this.f7978o);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        R4.delta(this, this.teal);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7963q);
        }
        f fVar = this.teal;
        if (fVar != null && fVar.f1983T) {
            View.mergeDrawableStates(onCreateDrawableState, f7964r);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i4, Rect rect) {
        super.onFocusChanged(z2, i4, rect);
        if (this.f7975l) {
            d dVar = this.f7974k;
            int i5 = dVar.lima;
            if (i5 != Integer.MIN_VALUE) {
                dVar.juliet(i5);
            }
            if (z2) {
                dVar.mike(i4, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.teal;
        if (fVar != null && fVar.f1983T) {
            z2 = true;
        } else {
            z2 = false;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i4) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        if (this.f7971h != i4) {
            this.f7971h = i4;
            foxtrot();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f7968d) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.f7968d) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f7965a;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f7975l) {
                    this.f7974k.romeo(1, 1);
                }
                z2 = true;
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        if (!z2 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f7973j = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.yellow) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0484v, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.yellow) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C0484v, android.view.View
    public void setBackgroundResource(int i4) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.crimson(z2);
        }
    }

    public void setCheckableResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.crimson(fVar.f1997h0.getResources().getBoolean(i4));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        f fVar = this.teal;
        if (fVar == null) {
            this.f7967c = z2;
        } else if (fVar.f1983T) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.cyan(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i4) {
        setCheckedIconVisible(i4);
    }

    public void setCheckedIconResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.cyan(AbstractC3032n3.echo(i4, fVar.f1997h0));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.emerald(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.emerald(AbstractC1735d.charlie(i4, fVar.f1997h0));
        }
    }

    public void setCheckedIconVisible(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.fuchsia(fVar.f1997h0.getResources().getBoolean(i4));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.teal;
        if (fVar != null && fVar.B != colorStateList) {
            fVar.B = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i4) {
        ColorStateList charlie;
        f fVar = this.teal;
        if (fVar != null && fVar.B != (charlie = AbstractC1735d.charlie(i4, fVar.f1997h0))) {
            fVar.B = charlie;
            fVar.onStateChange(fVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f5) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.gold(f5);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.gold(fVar.f1997h0.getResources().getDimension(i4));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.teal;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f1964D0 = new WeakReference(null);
            }
            this.teal = fVar;
            fVar.f1968F0 = false;
            fVar.f1964D0 = new WeakReference(this);
            bravo(this.f7972i);
        }
    }

    public void setChipEndPadding(float f5) {
        f fVar = this.teal;
        if (fVar != null && fVar.f1996g0 != f5) {
            fVar.f1996g0 = f5;
            fVar.invalidateSelf();
            fVar.bronze();
        }
    }

    public void setChipEndPaddingResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            float dimension = fVar.f1997h0.getResources().getDimension(i4);
            if (fVar.f1996g0 != dimension) {
                fVar.f1996g0 = dimension;
                fVar.invalidateSelf();
                fVar.bronze();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.gray(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i4) {
        setChipIconVisible(i4);
    }

    public void setChipIconResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.gray(AbstractC3032n3.echo(i4, fVar.f1997h0));
        }
    }

    public void setChipIconSize(float f5) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.green(f5);
        }
    }

    public void setChipIconSizeResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.green(fVar.f1997h0.getResources().getDimension(i4));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.indigo(colorStateList);
        }
    }

    public void setChipIconTintResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.indigo(AbstractC1735d.charlie(i4, fVar.f1997h0));
        }
    }

    public void setChipIconVisible(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.ivory(fVar.f1997h0.getResources().getBoolean(i4));
        }
    }

    public void setChipMinHeight(float f5) {
        f fVar = this.teal;
        if (fVar != null && fVar.C != f5) {
            fVar.C = f5;
            fVar.invalidateSelf();
            fVar.bronze();
        }
    }

    public void setChipMinHeightResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            float dimension = fVar.f1997h0.getResources().getDimension(i4);
            if (fVar.C != dimension) {
                fVar.C = dimension;
                fVar.invalidateSelf();
                fVar.bronze();
            }
        }
    }

    public void setChipStartPadding(float f5) {
        f fVar = this.teal;
        if (fVar != null && fVar.f1989Z != f5) {
            fVar.f1989Z = f5;
            fVar.invalidateSelf();
            fVar.bronze();
        }
    }

    public void setChipStartPaddingResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            float dimension = fVar.f1997h0.getResources().getDimension(i4);
            if (fVar.f1989Z != dimension) {
                fVar.f1989Z = dimension;
                fVar.invalidateSelf();
                fVar.bronze();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.jade(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.jade(AbstractC1735d.charlie(i4, fVar.f1997h0));
        }
    }

    public void setChipStrokeWidth(float f5) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.lavender(f5);
        }
    }

    public void setChipStrokeWidthResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.lavender(fVar.f1997h0.getResources().getDimension(i4));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i4) {
        setText(getResources().getString(i4));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.lime(drawable);
        }
        delta();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        q1.b bVar;
        f fVar = this.teal;
        if (fVar != null && fVar.f1982S != charSequence) {
            String str = q1.b.bravo;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = q1.b.echo;
            } else {
                bVar = q1.b.delta;
            }
            bVar.getClass();
            j jVar = g.alpha;
            fVar.f1982S = bVar.charlie(charSequence);
            fVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i4) {
        setCloseIconVisible(i4);
    }

    public void setCloseIconEndPadding(float f5) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.magenta(f5);
        }
    }

    public void setCloseIconEndPaddingResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.magenta(fVar.f1997h0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.lime(AbstractC3032n3.echo(i4, fVar.f1997h0));
        }
        delta();
    }

    public void setCloseIconSize(float f5) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.maroon(f5);
        }
    }

    public void setCloseIconSizeResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.maroon(fVar.f1997h0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconStartPadding(float f5) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.navy(f5);
        }
    }

    public void setCloseIconStartPaddingResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.navy(fVar.f1997h0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.olive(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.olive(AbstractC1735d.charlie(i4, fVar.f1997h0));
        }
    }

    public void setCloseIconVisible(int i4) {
        setCloseIconVisible(getResources().getBoolean(i4));
    }

    @Override // androidx.appcompat.widget.C0484v, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // androidx.appcompat.widget.C0484v, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i10, int i11) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i10 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i10, i11);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i10, int i11) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i10 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i4, i5, i10, i11);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        f fVar = this.teal;
        if (fVar != null) {
            fVar.papa(f5);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.teal != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                f fVar = this.teal;
                if (fVar != null) {
                    fVar.f1966E0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f7970g = z2;
        bravo(this.f7972i);
    }

    @Override // android.widget.TextView
    public void setGravity(int i4) {
        if (i4 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i4);
        }
    }

    public void setHideMotionSpec(M6.e eVar) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.f1988Y = eVar;
        }
    }

    public void setHideMotionSpecResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.f1988Y = M6.e.bravo(i4, fVar.f1997h0);
        }
    }

    public void setIconEndPadding(float f5) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.peach(f5);
        }
    }

    public void setIconEndPaddingResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.peach(fVar.f1997h0.getResources().getDimension(i4));
        }
    }

    public void setIconStartPadding(float f5) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.pink(f5);
        }
    }

    public void setIconStartPaddingResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.pink(fVar.f1997h0.getResources().getDimension(i4));
        }
    }

    public void setInternalOnCheckedChangeListener(com.google.android.material.internal.e eVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
        if (this.teal == null) {
            return;
        }
        super.setLayoutDirection(i4);
    }

    @Override // android.widget.TextView
    public void setLines(int i4) {
        if (i4 <= 1) {
            super.setLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i4) {
        if (i4 <= 1) {
            super.setMaxLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i4) {
        super.setMaxWidth(i4);
        f fVar = this.teal;
        if (fVar != null) {
            fVar.f1970G0 = i4;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i4) {
        if (i4 <= 1) {
            super.setMinLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7966b = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f7965a = onClickListener;
        delta();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.plum(colorStateList);
        }
        this.teal.getClass();
        echo();
    }

    public void setRippleColorResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.plum(AbstractC1735d.charlie(i4, fVar.f1997h0));
            this.teal.getClass();
            echo();
        }
    }

    @Override // g7.x
    public void setShapeAppearanceModel(m mVar) {
        this.teal.setShapeAppearanceModel(mVar);
    }

    public void setShowMotionSpec(M6.e eVar) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.f1987X = eVar;
        }
    }

    public void setShowMotionSpecResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.f1987X = M6.e.bravo(i4, fVar.f1997h0);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        f fVar = this.teal;
        if (fVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (fVar.f1968F0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            f fVar2 = this.teal;
            if (fVar2 != null && !TextUtils.equals(fVar2.f1971H, charSequence)) {
                fVar2.f1971H = charSequence;
                fVar2.f2003n0.echo = true;
                fVar2.invalidateSelf();
                fVar2.bronze();
            }
        }
    }

    public void setTextAppearance(d7.e eVar) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.f2003n0.bravo(eVar, fVar.f1997h0);
        }
        golf();
    }

    public void setTextAppearanceResource(int i4) {
        setTextAppearance(getContext(), i4);
    }

    public void setTextEndPadding(float f5) {
        f fVar = this.teal;
        if (fVar != null && fVar.f1993d0 != f5) {
            fVar.f1993d0 = f5;
            fVar.invalidateSelf();
            fVar.bronze();
        }
    }

    public void setTextEndPaddingResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            float dimension = fVar.f1997h0.getResources().getDimension(i4);
            if (fVar.f1993d0 != dimension) {
                fVar.f1993d0 = dimension;
                fVar.invalidateSelf();
                fVar.bronze();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f5) {
        super.setTextSize(i4, f5);
        f fVar = this.teal;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i4, f5, getResources().getDisplayMetrics());
            com.google.android.material.internal.x xVar = fVar.f2003n0;
            d7.e eVar = xVar.golf;
            if (eVar != null) {
                eVar.lima = applyDimension;
                xVar.alpha.setTextSize(applyDimension);
                fVar.alpha();
            }
        }
        golf();
    }

    public void setTextStartPadding(float f5) {
        f fVar = this.teal;
        if (fVar != null && fVar.f1992c0 != f5) {
            fVar.f1992c0 = f5;
            fVar.invalidateSelf();
            fVar.bronze();
        }
    }

    public void setTextStartPaddingResource(int i4) {
        f fVar = this.teal;
        if (fVar != null) {
            float dimension = fVar.f1997h0.getResources().getDimension(i4);
            if (fVar.f1992c0 != dimension) {
                fVar.f1992c0 = dimension;
                fVar.invalidateSelf();
                fVar.bronze();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.orange(z2);
        }
        delta();
    }

    public void setCheckedIconVisible(boolean z2) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.fuchsia(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        f fVar = this.teal;
        if (fVar != null) {
            fVar.ivory(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        f fVar = this.teal;
        if (fVar != null) {
            Context context2 = fVar.f1997h0;
            fVar.f2003n0.bravo(new d7.e(context2, i4), context2);
        }
        golf();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i4) {
        super.setTextAppearance(i4);
        f fVar = this.teal;
        if (fVar != null) {
            Context context = fVar.f1997h0;
            fVar.f2003n0.bravo(new d7.e(context, i4), context);
        }
        golf();
    }
}
