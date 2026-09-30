package y5;

/* loaded from: classes3.dex */
public final class m implements Runnable {
    public final float alpha;
    public final float purple;
    public final long red = System.currentTimeMillis();
    public final float silver;
    public final float teal;
    public final /* synthetic */ o white;

    public m(o oVar, float f5, float f10, float f11, float f12) {
        this.white = oVar;
        this.alpha = f11;
        this.purple = f12;
        this.silver = f5;
        this.teal = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.red)) * 1.0f;
        o oVar = this.white;
        float interpolation = oVar.alpha.getInterpolation(Math.min(1.0f, currentTimeMillis / oVar.purple));
        float f5 = this.teal;
        float f10 = this.silver;
        oVar.f14153p.foxtrot(Q0.c.lima(f5, f10, interpolation, f10) / oVar.delta(), this.alpha, this.purple);
        if (interpolation < 1.0f) {
            oVar.f14139a.postOnAnimation(this);
        }
    }
}
