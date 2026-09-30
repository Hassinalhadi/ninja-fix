package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class ad extends I implements P {
    public static final int[] beige = {R.attr.state_pressed};
    public static final int[] black = new int[0];
    public final int alpha;
    public int amber;
    public final ab azure;
    public final int bravo;
    public final StateListDrawable charlie;
    public final Drawable delta;
    public final int echo;
    public final int foxtrot;
    public final StateListDrawable golf;
    public final Drawable hotel;
    public final int india;
    public final int juliet;
    public int kilo;
    public int lima;
    public float mike;
    public int november;
    public int oscar;
    public float papa;
    public final RecyclerView sierra;
    public final ValueAnimator zulu;
    public int quebec = 0;
    public int romeo = 0;
    public boolean tango = false;
    public boolean uniform = false;
    public int victor = 0;
    public int whiskey = 0;
    public final int[] xray = new int[2];
    public final int[] yankee = new int[2];

    public ad(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.zulu = ofFloat;
        this.amber = 0;
        ab abVar = new ab(0, this);
        this.azure = abVar;
        Aa.e eVar = new Aa.e(4, this);
        this.charlie = stateListDrawable;
        this.delta = drawable;
        this.golf = stateListDrawable2;
        this.hotel = drawable2;
        this.echo = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.foxtrot = Math.max(i4, drawable.getIntrinsicWidth());
        this.india = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.juliet = Math.max(i4, drawable2.getIntrinsicWidth());
        this.alpha = i5;
        this.bravo = i10;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new X6.e(this));
        ofFloat.addUpdateListener(new ac(this));
        RecyclerView recyclerView2 = this.sierra;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.sierra.removeOnItemTouchListener(this);
            this.sierra.removeOnScrollListener(eVar);
            this.sierra.removeCallbacks(abVar);
        }
        this.sierra = recyclerView;
        recyclerView.addItemDecoration(this);
        this.sierra.addOnItemTouchListener(this);
        this.sierra.addOnScrollListener(eVar);
    }

    public static int charlie(float f5, float f10, int[] iArr, int i4, int i5, int i10) {
        int i11 = iArr[1] - iArr[0];
        if (i11 != 0) {
            int i12 = i4 - i10;
            int i13 = (int) (((f10 - f5) / i11) * i12);
            int i14 = i5 + i13;
            if (i14 < i12 && i14 >= 0) {
                return i13;
            }
        }
        return 0;
    }

    public final boolean alpha(float f5, float f10) {
        if (f10 >= this.romeo - this.india) {
            int i4 = this.oscar;
            int i5 = this.november;
            if (f5 >= i4 - (i5 / 2) && f5 <= (i5 / 2) + i4) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean bravo(float f5, float f10) {
        boolean z2;
        RecyclerView recyclerView = this.sierra;
        WeakHashMap weakHashMap = s1.au.alpha;
        if (recyclerView.getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = this.echo;
        if (!z2 ? f5 >= this.quebec - i4 : f5 <= i4) {
            int i5 = this.lima;
            int i10 = this.kilo / 2;
            if (f10 >= i5 - i10 && f10 <= i10 + i5) {
                return true;
            }
        }
        return false;
    }

    public final void delta(int i4) {
        ab abVar = this.azure;
        StateListDrawable stateListDrawable = this.charlie;
        if (i4 == 2 && this.victor != 2) {
            stateListDrawable.setState(beige);
            this.sierra.removeCallbacks(abVar);
        }
        if (i4 == 0) {
            this.sierra.invalidate();
        } else {
            echo();
        }
        if (this.victor == 2 && i4 != 2) {
            stateListDrawable.setState(black);
            this.sierra.removeCallbacks(abVar);
            this.sierra.postDelayed(abVar, 1200);
        } else if (i4 == 1) {
            this.sierra.removeCallbacks(abVar);
            this.sierra.postDelayed(abVar, 1500);
        }
        this.victor = i4;
    }

    public final void echo() {
        int i4 = this.amber;
        ValueAnimator valueAnimator = this.zulu;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.amber = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.I
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
        int i4 = this.quebec;
        RecyclerView recyclerView2 = this.sierra;
        if (i4 == recyclerView2.getWidth() && this.romeo == recyclerView2.getHeight()) {
            if (this.amber != 0) {
                if (this.tango) {
                    int i5 = this.quebec;
                    int i10 = this.echo;
                    int i11 = i5 - i10;
                    int i12 = this.lima;
                    int i13 = this.kilo;
                    int i14 = i12 - (i13 / 2);
                    StateListDrawable stateListDrawable = this.charlie;
                    stateListDrawable.setBounds(0, 0, i10, i13);
                    int i15 = this.romeo;
                    int i16 = this.foxtrot;
                    Drawable drawable = this.delta;
                    drawable.setBounds(0, 0, i16, i15);
                    WeakHashMap weakHashMap = s1.au.alpha;
                    if (recyclerView2.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i10, i14);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i10, -i14);
                    } else {
                        canvas.translate(i11, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i14);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i11, -i14);
                    }
                }
                if (this.uniform) {
                    int i17 = this.romeo;
                    int i18 = this.india;
                    int i19 = i17 - i18;
                    int i20 = this.oscar;
                    int i21 = this.november;
                    int i22 = i20 - (i21 / 2);
                    StateListDrawable stateListDrawable2 = this.golf;
                    stateListDrawable2.setBounds(0, 0, i21, i18);
                    int i23 = this.quebec;
                    int i24 = this.juliet;
                    Drawable drawable2 = this.hotel;
                    drawable2.setBounds(0, 0, i23, i24);
                    canvas.translate(0.0f, i19);
                    drawable2.draw(canvas);
                    canvas.translate(i22, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i22, -i19);
                    return;
                }
                return;
            }
            return;
        }
        this.quebec = recyclerView2.getWidth();
        this.romeo = recyclerView2.getHeight();
        delta(0);
    }
}
