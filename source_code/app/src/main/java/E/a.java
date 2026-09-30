package E;

import Cb.u;
import a0.AbstractC0349c;
import a0.C0366t;
import a0.InterfaceC0364r;
import android.view.ViewGroup;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0563a0;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import b.E;
import java.util.LinkedHashMap;
import s0.an;

/* loaded from: classes3.dex */
public final class a implements InterfaceC0563a0, j, E {

    /* renamed from: a, reason: collision with root package name */
    public i f964a;
    public final boolean alpha;

    /* renamed from: b, reason: collision with root package name */
    public final ax f965b = C0564b.zulu(null);

    /* renamed from: c, reason: collision with root package name */
    public final ax f966c = C0564b.zulu(Boolean.TRUE);

    /* renamed from: d, reason: collision with root package name */
    public long f967d = 0;
    public int e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final B2.q f968f = new B2.q(4, this);
    public final s purple;
    public final boolean red;
    public final float silver;
    public final ax teal;
    public final ax white;
    public final ViewGroup yellow;

    public a(boolean z2, float f5, ax axVar, ax axVar2, ViewGroup viewGroup) {
        this.alpha = z2;
        this.purple = new s(new u(axVar2, 1), z2);
        this.red = z2;
        this.silver = f5;
        this.teal = axVar;
        this.white = axVar2;
        this.yellow = viewGroup;
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void alpha() {
        i iVar = this.f964a;
        if (iVar != null) {
            amber();
            w.o oVar = iVar.silver;
            k kVar = (k) ((LinkedHashMap) oVar.purple).get(this);
            if (kVar != null) {
                kVar.charlie();
                LinkedHashMap linkedHashMap = (LinkedHashMap) oVar.purple;
                k kVar2 = (k) linkedHashMap.get(this);
                if (kVar2 != null) {
                }
                linkedHashMap.remove(this);
                iVar.red.add(kVar);
            }
        }
    }

    @Override // E.j
    public final void amber() {
        ((t0) this.f965b).setValue(null);
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void bravo() {
        i iVar = this.f964a;
        if (iVar != null) {
            amber();
            w.o oVar = iVar.silver;
            k kVar = (k) ((LinkedHashMap) oVar.purple).get(this);
            if (kVar != null) {
                kVar.charlie();
                LinkedHashMap linkedHashMap = (LinkedHashMap) oVar.purple;
                k kVar2 = (k) linkedHashMap.get(this);
                if (kVar2 != null) {
                }
                linkedHashMap.remove(this);
                iVar.red.add(kVar);
            }
        }
    }

    @Override // b.E
    public final void charlie(an anVar) {
        int ochre;
        float lavender;
        c0.b bVar = anVar.alpha;
        this.f967d = bVar.purple.oscar();
        float f5 = this.silver;
        if (Float.isNaN(f5)) {
            ochre = Zd.a.delta(h.alpha(anVar, this.red, bVar.purple.oscar()));
        } else {
            ochre = anVar.ochre(f5);
        }
        this.e = ochre;
        long j5 = ((C0366t) this.teal.getValue()).alpha;
        float f10 = ((g) this.white.getValue()).delta;
        anVar.charlie();
        if (Float.isNaN(f5)) {
            lavender = h.alpha(anVar, this.alpha, anVar.bravo());
        } else {
            lavender = anVar.lavender(f5);
        }
        this.purple.alpha(anVar, lavender, j5);
        InterfaceC0364r mike = bVar.purple.mike();
        ((Boolean) ((t0) this.f966c).getValue()).booleanValue();
        k kVar = (k) ((t0) this.f965b).getValue();
        if (kVar != null) {
            kVar.echo(bVar.purple.oscar(), this.e, j5, f10);
            kVar.draw(AbstractC0349c.alpha(mike));
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void delta() {
    }
}
