package b7;

import android.animation.ObjectAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class w extends K3.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0726h f3364c = new C0726h(Float.class, "animationFraction", 5);

    /* renamed from: a, reason: collision with root package name */
    public boolean f3365a;

    /* renamed from: b, reason: collision with root package name */
    public float f3366b;
    public ObjectAnimator silver;
    public final P1.a teal;
    public final z white;
    public int yellow;

    public w(z zVar) {
        super(3);
        this.yellow = 1;
        this.white = zVar;
        this.teal = new P1.a(1);
    }

    public final void amber() {
        this.f3365a = true;
        this.yellow = 1;
        Iterator it = ((ArrayList) this.red).iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            z zVar = this.white;
            rVar.charlie = zVar.echo[0];
            rVar.delta = zVar.india / 2;
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
        this.silver.setDuration(this.white.november * 333.0f);
        amber();
    }

    @Override // K3.b
    public final void uniform(C0721c c0721c) {
    }

    @Override // K3.b
    public final void victor() {
    }

    @Override // K3.b
    public final void xray() {
        zulu();
        amber();
        this.silver.start();
    }

    @Override // K3.b
    public final void yankee() {
    }

    public final void zulu() {
        if (this.silver == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f3364c, 0.0f, 1.0f);
            this.silver = ofFloat;
            ofFloat.setDuration(this.white.november * 333.0f);
            this.silver.setInterpolator(null);
            this.silver.setRepeatCount(-1);
            this.silver.addListener(new O6.b(5, this));
        }
    }
}
