package a0;

import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import s0.e0;

/* loaded from: classes3.dex */
public final class at extends T.r implements s0.ab, e0 {

    /* renamed from: a, reason: collision with root package name */
    public as f2586a;
    public float alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2587b;

    /* renamed from: c, reason: collision with root package name */
    public long f2588c;

    /* renamed from: d, reason: collision with root package name */
    public long f2589d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f2590f;

    /* renamed from: g, reason: collision with root package name */
    public A0.p f2591g;
    public float purple;
    public float red;
    public float silver;
    public float teal;
    public float white;
    public long yellow;

    @Override // s0.e0
    public final boolean charlie() {
        return false;
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.e0
    public final void india(A0.ad adVar) {
    }

    @Override // s0.ab
    public final /* synthetic */ int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.echo(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public final /* synthetic */ int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.hotel(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    public final q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        AbstractC2367C victor = aoVar.victor(j5);
        return arVar.papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new B2.ap(17, victor, this));
    }

    @Override // s0.ab
    public final /* synthetic */ int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.kilo(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public final /* synthetic */ int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.november(this, interfaceC2402u, interfaceC2401t, i4);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.alpha);
        sb2.append(", scaleY=");
        sb2.append(this.purple);
        sb2.append(", alpha = ");
        sb2.append(this.red);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.silver);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.teal);
        sb2.append(", cameraDistance=");
        sb2.append(this.white);
        sb2.append(", transformOrigin=");
        sb2.append((Object) aw.delta(this.yellow));
        sb2.append(", shape=");
        sb2.append(this.f2586a);
        sb2.append(", clip=");
        sb2.append(this.f2587b);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        ao.ad.bronze(this.f2588c, ", spotShadowColor=", sb2);
        ao.ad.bronze(this.f2589d, ", compositingStrategy=", sb2);
        sb2.append((Object) C0371y.alpha(this.e));
        sb2.append(", blendMode=");
        sb2.append((Object) C0359m.alpha(this.f2590f));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yankee() {
        return false;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yellow() {
        return false;
    }
}
