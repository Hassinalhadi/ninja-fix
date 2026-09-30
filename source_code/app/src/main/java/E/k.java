package E;

import a0.C0366t;
import a0.ao;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import f.C1676m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends View {
    public static final int[] white = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] yellow = new int[0];
    public t alpha;
    public Boolean purple;
    public Long red;
    public A2.q silver;
    public Function0 teal;

    private final void setRippleState(boolean z2) {
        long j5;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.silver;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.red;
        if (l10 != null) {
            j5 = l10.longValue();
        } else {
            j5 = 0;
        }
        long j6 = currentAnimationTimeMillis - j5;
        if (!z2 && j6 < 5) {
            A2.q qVar = new A2.q(3, this);
            this.silver = qVar;
            postDelayed(qVar, 50L);
        } else {
            if (z2) {
                iArr = white;
            } else {
                iArr = yellow;
            }
            t tVar = this.alpha;
            if (tVar != null) {
                tVar.setState(iArr);
            }
        }
        this.red = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(k kVar) {
        t tVar = kVar.alpha;
        if (tVar != null) {
            tVar.setState(yellow);
        }
        kVar.silver = null;
    }

    public final void bravo(C1676m c1676m, boolean z2, long j5, int i4, long j6, float f5, Function0 function0) {
        if (this.alpha == null || !Intrinsics.areEqual(Boolean.valueOf(z2), this.purple)) {
            t tVar = new t(z2);
            setBackground(tVar);
            this.alpha = tVar;
            this.purple = Boolean.valueOf(z2);
        }
        t tVar2 = this.alpha;
        Intrinsics.checkNotNull(tVar2);
        this.teal = function0;
        echo(j5, i4, j6, f5);
        if (z2) {
            tVar2.setHotspot(Float.intBitsToFloat((int) (c1676m.alpha >> 32)), Z.b.delta(c1676m.alpha));
        } else {
            tVar2.setHotspot(tVar2.getBounds().centerX(), tVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void charlie() {
        this.teal = null;
        A2.q qVar = this.silver;
        if (qVar != null) {
            removeCallbacks(qVar);
            A2.q qVar2 = this.silver;
            Intrinsics.checkNotNull(qVar2);
            qVar2.run();
        } else {
            t tVar = this.alpha;
            if (tVar != null) {
                tVar.setState(yellow);
            }
        }
        t tVar2 = this.alpha;
        if (tVar2 == null) {
            return;
        }
        tVar2.setVisible(false, false);
        unscheduleDrawable(tVar2);
    }

    public final void delta() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            charlie();
        } else {
            super.draw(canvas);
        }
    }

    public final void echo(long j5, int i4, long j6, float f5) {
        boolean charlie;
        t tVar = this.alpha;
        if (tVar == null) {
            return;
        }
        Integer num = tVar.red;
        if (num == null || num.intValue() != i4) {
            tVar.red = Integer.valueOf(i4);
            tVar.setRadius(i4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f5 *= 2;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        long bravo = C0366t.bravo(f5, j6);
        C0366t c0366t = tVar.purple;
        if (c0366t == null) {
            charlie = false;
        } else {
            charlie = C0366t.charlie(c0366t.alpha, bravo);
        }
        if (!charlie) {
            tVar.purple = new C0366t(bravo);
            tVar.setColor(ColorStateList.valueOf(ao.beige(bravo)));
        }
        Rect rect = new Rect(0, 0, Zd.a.delta(Z.e.delta(j5)), Zd.a.delta(Z.e.bravo(j5)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        tVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Function0 function0 = this.teal;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
