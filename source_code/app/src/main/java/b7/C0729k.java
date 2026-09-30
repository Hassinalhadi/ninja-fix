package b7;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import delivery.samurai.android.R;
import java.util.ArrayList;

/* renamed from: b7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0729k extends K3.b {
    public static final P1.a e = M6.a.bravo;

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3336f = {0, 1500, 3000, 4500};

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f3337g = {0.1f, 0.87f};

    /* renamed from: h, reason: collision with root package name */
    public static final C0726h f3338h = new C0726h(Float.class, "animationFraction", 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0726h f3339i = new C0726h(Float.class, "completeEndFraction", 3);

    /* renamed from: a, reason: collision with root package name */
    public int f3340a;

    /* renamed from: b, reason: collision with root package name */
    public float f3341b;

    /* renamed from: c, reason: collision with root package name */
    public float f3342c;

    /* renamed from: d, reason: collision with root package name */
    public C0721c f3343d;
    public ObjectAnimator silver;
    public ObjectAnimator teal;
    public final TimeInterpolator white;
    public final C0730l yellow;

    public C0729k(Context context, C0730l c0730l) {
        super(1);
        this.f3340a = 0;
        this.f3343d = null;
        this.yellow = c0730l;
        this.white = x2.q.foxtrot(context, R.attr.motionEasingStandardInterpolator, e);
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
        C0730l c0730l = this.yellow;
        objectAnimator.setDuration(c0730l.november * 6000.0f);
        this.teal.setDuration(c0730l.november * 500.0f);
        this.f3340a = 0;
        ((r) ((ArrayList) this.red).get(0)).charlie = c0730l.echo[0];
        this.f3342c = 0.0f;
    }

    @Override // K3.b
    public final void uniform(C0721c c0721c) {
        this.f3343d = c0721c;
    }

    @Override // K3.b
    public final void victor() {
        ObjectAnimator objectAnimator = this.teal;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((u) this.purple).isVisible()) {
                this.teal.start();
            } else {
                charlie();
            }
        }
    }

    @Override // K3.b
    public final void xray() {
        zulu();
        this.f3340a = 0;
        ((r) ((ArrayList) this.red).get(0)).charlie = this.yellow.echo[0];
        this.f3342c = 0.0f;
        this.silver.start();
    }

    @Override // K3.b
    public final void yankee() {
        this.f3343d = null;
    }

    public final void zulu() {
        ObjectAnimator objectAnimator = this.silver;
        C0730l c0730l = this.yellow;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f3338h, 0.0f, 1.0f);
            this.silver = ofFloat;
            ofFloat.setDuration(c0730l.november * 6000.0f);
            this.silver.setInterpolator(null);
            this.silver.setRepeatCount(-1);
            this.silver.addListener(new C0728j(this, 0));
        }
        if (this.teal == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f3339i, 0.0f, 1.0f);
            this.teal = ofFloat2;
            ofFloat2.setDuration(c0730l.november * 500.0f);
            this.teal.addListener(new C0728j(this, 1));
        }
    }
}
