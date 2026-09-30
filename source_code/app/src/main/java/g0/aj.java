package g0;

import a0.AbstractC0367u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.t0;
import f0.AbstractC1680b;

/* loaded from: classes3.dex */
public final class aj extends AbstractC1680b {

    /* renamed from: a, reason: collision with root package name */
    public int f12635a;
    public final ax purple = C0564b.zulu(new Z.e(0));
    public final ax red = C0564b.zulu(Boolean.FALSE);
    public final af silver;
    public final p0 teal;
    public float white;
    public AbstractC0367u yellow;

    public aj(C1723c c1723c) {
        af afVar = new af(c1723c);
        afVar.foxtrot = new Xe.s(16, this);
        this.silver = afVar;
        this.teal = C0564b.whiskey(0);
        this.white = 1.0f;
        this.f12635a = -1;
    }

    @Override // f0.AbstractC1680b
    public final boolean applyAlpha(float f5) {
        this.white = f5;
        return true;
    }

    @Override // f0.AbstractC1680b
    public final boolean applyColorFilter(AbstractC0367u abstractC0367u) {
        this.yellow = abstractC0367u;
        return true;
    }

    @Override // f0.AbstractC1680b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo1getIntrinsicSizeNHjbRc() {
        return ((Z.e) ((t0) this.purple).getValue()).alpha;
    }

    @Override // f0.AbstractC1680b
    public final void onDraw(c0.d dVar) {
        AbstractC0367u abstractC0367u = this.yellow;
        af afVar = this.silver;
        if (abstractC0367u == null) {
            abstractC0367u = (AbstractC0367u) ((t0) afVar.golf).getValue();
        }
        if (((Boolean) ((t0) this.red).getValue()).booleanValue() && dVar.getLayoutDirection() == Q0.n.purple) {
            long orange = dVar.orange();
            J2.t lime = dVar.lime();
            long oscar = lime.oscar();
            lime.mike().golf();
            try {
                ((av.ah) lime.alpha).purple(-1.0f, 1.0f, orange);
                afVar.echo(dVar, this.white, abstractC0367u);
            } finally {
                ao.ad.coral(lime, oscar);
            }
        } else {
            afVar.echo(dVar, this.white, abstractC0367u);
        }
        this.f12635a = this.teal.juliet();
    }
}
