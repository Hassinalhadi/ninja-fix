package b7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class y extends K3.b {
    public static final int[] e = {533, 567, 850, 750};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3367f = {1267, 1000, 333, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final C0726h f3368g = new C0726h(Float.class, "animationFraction", 6);

    /* renamed from: a, reason: collision with root package name */
    public int f3369a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3370b;

    /* renamed from: c, reason: collision with root package name */
    public float f3371c;

    /* renamed from: d, reason: collision with root package name */
    public C0721c f3372d;
    public ObjectAnimator silver;
    public ObjectAnimator teal;
    public final Interpolator[] white;
    public final z yellow;

    public y(Context context, z zVar) {
        super(2);
        this.f3369a = 0;
        this.f3372d = null;
        this.yellow = zVar;
        this.white = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    public final void amber() {
        this.f3369a = 0;
        Iterator it = ((ArrayList) this.red).iterator();
        while (it.hasNext()) {
            ((r) it.next()).charlie = this.yellow.echo[0];
        }
    }

    @Override // K3.b
    public final void charlie() {
        ObjectAnimator objectAnimator = this.silver;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // K3.b
    public final void papa() {
        zulu();
        ObjectAnimator objectAnimator = this.silver;
        z zVar = this.yellow;
        objectAnimator.setDuration(zVar.november * 1800.0f);
        this.teal.setDuration(zVar.november * 1800.0f);
        amber();
    }

    @Override // K3.b
    public final void uniform(C0721c c0721c) {
        this.f3372d = c0721c;
    }

    @Override // K3.b
    public final void victor() {
        ObjectAnimator objectAnimator = this.teal;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            charlie();
            if (((u) this.purple).isVisible()) {
                this.teal.setFloatValues(this.f3371c, 1.0f);
                this.teal.setDuration((1.0f - this.f3371c) * 1800.0f);
                this.teal.start();
            }
        }
    }

    @Override // K3.b
    public final void xray() {
        zulu();
        amber();
        this.silver.start();
    }

    @Override // K3.b
    public final void yankee() {
        this.f3372d = null;
    }

    public final void zulu() {
        int i4 = 1;
        int i5 = 0;
        ObjectAnimator objectAnimator = this.silver;
        z zVar = this.yellow;
        C0726h c0726h = f3368g;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, c0726h, 0.0f, 1.0f);
            this.silver = ofFloat;
            ofFloat.setDuration(zVar.november * 1800.0f);
            this.silver.setInterpolator(null);
            this.silver.setRepeatCount(-1);
            this.silver.addListener(new x(this, i5));
        }
        if (this.teal == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, c0726h, 1.0f);
            this.teal = ofFloat2;
            ofFloat2.setDuration(zVar.november * 1800.0f);
            this.teal.setInterpolator(null);
            this.teal.addListener(new x(this, i4));
        }
    }
}
