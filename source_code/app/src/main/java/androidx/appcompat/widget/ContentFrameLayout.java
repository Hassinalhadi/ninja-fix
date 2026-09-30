package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public O f2807a;
    public TypedValue alpha;
    public TypedValue purple;
    public TypedValue red;
    public TypedValue silver;
    public TypedValue teal;
    public TypedValue white;
    public final Rect yellow;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.yellow = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.teal == null) {
            this.teal = new TypedValue();
        }
        return this.teal;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.white == null) {
            this.white = new TypedValue();
        }
        return this.white;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.red == null) {
            this.red = new TypedValue();
        }
        return this.red;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.silver == null) {
            this.silver = new TypedValue();
        }
        return this.silver;
    }

    public TypedValue getMinWidthMajor() {
        if (this.alpha == null) {
            this.alpha = new TypedValue();
        }
        return this.alpha;
    }

    public TypedValue getMinWidthMinor() {
        if (this.purple == null) {
            this.purple = new TypedValue();
        }
        return this.purple;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        O o5 = this.f2807a;
        if (o5 != null) {
            o5.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0469n c0469n;
        super.onDetachedFromWindow();
        O o5 = this.f2807a;
        if (o5 != null) {
            androidx.appcompat.app.ab abVar = ((androidx.appcompat.app.r) o5).alpha;
            P p4 = abVar.f2734k;
            if (p4 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) p4;
                actionBarOverlayLayout.echo();
                ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.teal).alpha.alpha;
                if (actionMenuView != null && (c0469n = actionMenuView.teal) != null) {
                    c0469n.golf();
                    C0455g c0455g = c0469n.f2913n;
                    if (c0455g != null && c0455g.bravo()) {
                        c0455g.india.dismiss();
                    }
                }
            }
            if (abVar.f2739p != null) {
                abVar.e.getDecorView().removeCallbacks(abVar.f2740q);
                if (abVar.f2739p.isShowing()) {
                    try {
                        abVar.f2739p.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                abVar.f2739p = null;
            }
            s1.az azVar = abVar.f2741r;
            if (azVar != null) {
                azVar.bravo();
            }
            ao.l lVar = abVar.azure(0).hotel;
            if (lVar != null) {
                lVar.charlie(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i4, int i5) {
        boolean z2;
        int i10;
        boolean z10;
        int i11;
        int measuredWidth;
        TypedValue typedValue;
        int i12;
        int i13;
        float fraction;
        TypedValue typedValue2;
        int i14;
        int i15;
        float fraction2;
        TypedValue typedValue3;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z2 = true;
        } else {
            z2 = false;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        Rect rect = this.yellow;
        if (mode == Integer.MIN_VALUE) {
            if (z2) {
                typedValue3 = this.silver;
            } else {
                typedValue3 = this.red;
            }
            if (typedValue3 != null && (i16 = typedValue3.type) != 0) {
                if (i16 == 5) {
                    fraction3 = typedValue3.getDimension(displayMetrics);
                } else if (i16 == 6) {
                    int i18 = displayMetrics.widthPixels;
                    fraction3 = typedValue3.getFraction(i18, i18);
                } else {
                    i17 = 0;
                    if (i17 > 0) {
                        i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i4)), 1073741824);
                        z10 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            if (z2) {
                                typedValue2 = this.teal;
                            } else {
                                typedValue2 = this.white;
                            }
                            if (typedValue2 != null && (i14 = typedValue2.type) != 0) {
                                if (i14 == 5) {
                                    fraction2 = typedValue2.getDimension(displayMetrics);
                                } else if (i14 == 6) {
                                    int i19 = displayMetrics.heightPixels;
                                    fraction2 = typedValue2.getFraction(i19, i19);
                                } else {
                                    i15 = 0;
                                    if (i15 > 0) {
                                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i5)), 1073741824);
                                        super.onMeasure(i10, i11);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z10 && mode == Integer.MIN_VALUE) {
                                            if (!z2) {
                                                typedValue = this.purple;
                                            } else {
                                                typedValue = this.alpha;
                                            }
                                            if (typedValue != null && (i12 = typedValue.type) != 0) {
                                                if (i12 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i12 == 6) {
                                                    int i20 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i20, i20);
                                                } else {
                                                    i13 = 0;
                                                    if (i13 > 0) {
                                                        i13 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i13) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                                                        if (!z11) {
                                                            super.onMeasure(makeMeasureSpec, i11);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                i13 = (int) fraction;
                                                if (i13 > 0) {
                                                }
                                                if (measuredWidth < i13) {
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (!z11) {
                                        }
                                    }
                                }
                                i15 = (int) fraction2;
                                if (i15 > 0) {
                                }
                            }
                        }
                        i11 = i5;
                        super.onMeasure(i10, i11);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z10) {
                            if (!z2) {
                            }
                            if (typedValue != null) {
                                if (i12 != 5) {
                                }
                                i13 = (int) fraction;
                                if (i13 > 0) {
                                }
                                if (measuredWidth < i13) {
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                }
            }
        }
        i10 = i4;
        z10 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i11 = i5;
        super.onMeasure(i10, i11);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z10) {
        }
        z11 = false;
        if (!z11) {
        }
    }

    public void setAttachListener(O o5) {
        this.f2807a = o5;
    }
}
