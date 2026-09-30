package b7;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* renamed from: b7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0727i extends K3.b {
    public static final int[] e = {0, 1350, 2700, 4050};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3328f = {667, 2017, 3367, 4717};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f3329g = {1000, 2350, 3700, 5050};

    /* renamed from: h, reason: collision with root package name */
    public static final C0726h f3330h = new C0726h(Float.class, "animationFraction", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C0726h f3331i = new C0726h(Float.class, "completeEndFraction", 1);

    /* renamed from: a, reason: collision with root package name */
    public int f3332a;

    /* renamed from: b, reason: collision with root package name */
    public float f3333b;

    /* renamed from: c, reason: collision with root package name */
    public float f3334c;

    /* renamed from: d, reason: collision with root package name */
    public C0721c f3335d;
    public ObjectAnimator silver;
    public ObjectAnimator teal;
    public final P1.a white;
    public final C0730l yellow;

    public C0727i(C0730l c0730l) {
        super(1);
        this.f3332a = 0;
        this.f3335d = null;
        this.yellow = c0730l;
        this.white = new P1.a(1);
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
        objectAnimator.setDuration(c0730l.november * 5400.0f);
        this.teal.setDuration(c0730l.november * 333.0f);
        this.f3332a = 0;
        ((r) ((ArrayList) this.red).get(0)).charlie = c0730l.echo[0];
        this.f3334c = 0.0f;
    }

    @Override // K3.b
    public final void uniform(C0721c c0721c) {
        this.f3335d = c0721c;
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
        this.f3332a = 0;
        ((r) ((ArrayList) this.red).get(0)).charlie = this.yellow.echo[0];
        this.f3334c = 0.0f;
        this.silver.start();
    }

    @Override // K3.b
    public final void yankee() {
        this.f3335d = null;
    }

    public final void zulu() {
        ObjectAnimator objectAnimator = this.silver;
        C0730l c0730l = this.yellow;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f3330h, 0.0f, 1.0f);
            this.silver = ofFloat;
            ofFloat.setDuration(c0730l.november * 5400.0f);
            this.silver.setInterpolator(null);
            this.silver.setRepeatCount(-1);
            this.silver.addListener(new C0725g(this, 0));
        }
        if (this.teal == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f3331i, 0.0f, 1.0f);
            this.teal = ofFloat2;
            ofFloat2.setDuration(c0730l.november * 333.0f);
            this.teal.setInterpolator(this.white);
            this.teal.addListener(new C0725g(this, 1));
        }
    }
}
