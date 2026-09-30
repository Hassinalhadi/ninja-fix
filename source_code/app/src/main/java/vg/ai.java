package vg;

/* loaded from: classes2.dex */
public final class ai extends A {
    public final Class delta;

    public ai(Class cls) {
        this.delta = cls;
    }

    @Override // vg.A
    public final void alpha(an anVar, Object obj) {
        anVar.echo.tag((Class<? super Class>) this.delta, (Class) obj);
    }
}
