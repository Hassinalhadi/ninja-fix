package E;

import a0.AbstractC0349c;
import a0.InterfaceC0364r;
import a0.InterfaceC0368v;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bv.ah;
import f.C1675l;
import f.C1676m;
import f.C1677n;
import f.InterfaceC1673j;
import f.InterfaceC1678o;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q0.z;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.InterfaceC2553m;
import s0.InterfaceC2558s;
import s0.aa;
import s0.an;
import s6.AbstractC2627c7;
import vf.ad;

/* loaded from: classes3.dex */
public final class b extends T.r implements j, InterfaceC2553m, InterfaceC2558s, aa {
    public final InterfaceC1673j alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f970b;

    /* renamed from: d, reason: collision with root package name */
    public i f972d;
    public k e;
    public final boolean purple;
    public final float red;
    public final InterfaceC0368v silver;
    public final Function0 teal;
    public s white;
    public float yellow;

    /* renamed from: a, reason: collision with root package name */
    public long f969a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ah f971c = new ah();

    public b(InterfaceC1673j interfaceC1673j, boolean z2, float f5, InterfaceC0368v interfaceC0368v, Function0 function0) {
        this.alpha = interfaceC1673j;
        this.purple = z2;
        this.red = f5;
        this.silver = interfaceC0368v;
        this.teal = function0;
    }

    @Override // E.j
    public final void amber() {
        this.e = null;
        AbstractC2557q.india(this);
    }

    public final void b(InterfaceC1678o interfaceC1678o) {
        if (interfaceC1678o instanceof C1676m) {
            C1676m c1676m = (C1676m) interfaceC1678o;
            long j5 = this.f969a;
            float f5 = this.yellow;
            i iVar = this.f972d;
            if (iVar != null) {
                Intrinsics.checkNotNull(iVar);
            } else {
                iVar = p.alpha(p.bravo((View) AbstractC2557q.echo(this, AndroidCompositionLocals_androidKt.foxtrot)));
                this.f972d = iVar;
                Intrinsics.checkNotNull(iVar);
            }
            k alpha = iVar.alpha(this);
            alpha.bravo(c1676m, this.purple, j5, Zd.a.delta(f5), this.silver.alpha(), ((g) this.teal.invoke()).delta, new B2.q(5, this));
            this.e = alpha;
            AbstractC2557q.india(this);
            return;
        }
        if (interfaceC1678o instanceof C1677n) {
            C1676m c1676m2 = ((C1677n) interfaceC1678o).alpha;
            k kVar = this.e;
            if (kVar != null) {
                kVar.delta();
                return;
            }
            return;
        }
        if (interfaceC1678o instanceof C1675l) {
            C1676m c1676m3 = ((C1675l) interfaceC1678o).alpha;
            k kVar2 = this.e;
            if (kVar2 != null) {
                kVar2.delta();
            }
        }
    }

    @Override // s0.InterfaceC2558s
    public final /* synthetic */ void blue() {
    }

    @Override // s0.aa
    public final /* synthetic */ void foxtrot(z zVar) {
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.InterfaceC2558s
    public final void jade(an anVar) {
        anVar.charlie();
        s sVar = this.white;
        if (sVar != null) {
            sVar.alpha(anVar, this.yellow, this.silver.alpha());
        }
        InterfaceC0364r mike = anVar.alpha.purple.mike();
        k kVar = this.e;
        if (kVar != null) {
            kVar.echo(this.f969a, Zd.a.delta(this.yellow), this.silver.alpha(), ((g) this.teal.invoke()).delta);
            kVar.draw(AbstractC0349c.alpha(mike));
        }
    }

    @Override // s0.aa
    public final void kilo(long j5) {
        float lavender;
        this.f970b = true;
        Q0.d dVar = AbstractC2555o.golf(this).f13298q;
        this.f969a = AbstractC2627c7.bravo(j5);
        float f5 = this.red;
        if (Float.isNaN(f5)) {
            lavender = h.alpha(dVar, this.purple, this.f969a);
        } else {
            lavender = dVar.lavender(f5);
        }
        this.yellow = lavender;
        ah ahVar = this.f971c;
        Object[] objArr = ahVar.alpha;
        int i4 = ahVar.bravo;
        for (int i5 = 0; i5 < i4; i5++) {
            b((InterfaceC1678o) objArr[i5]);
        }
        ahVar.india();
    }

    @Override // T.r
    public final void onAttach() {
        ad.zulu(getCoroutineScope(), null, null, new m(this, null), 3);
    }

    @Override // T.r
    public final void onDetach() {
        i iVar = this.f972d;
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
}
