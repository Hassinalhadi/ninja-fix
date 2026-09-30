package N2;

import Lb.am;
import a0.AbstractC0367u;
import a0.C0352f;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0563a0;
import androidx.compose.runtime.aw;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.t0;
import f0.AbstractC1680b;
import kotlin.jvm.functions.Function1;
import q0.C2391j;
import q0.InterfaceC2392k;
import s6.AbstractC2832z6;
import s6.K0;
import td.C3117a;
import vf.a0;
import vf.ao;
import yf.AbstractC3428A;
import yf.N;
import z5.C3464a;

/* loaded from: classes3.dex */
public final class n extends AbstractC1680b implements InterfaceC0563a0 {

    /* renamed from: j, reason: collision with root package name */
    public static final am f1858j = new am(9);

    /* renamed from: a, reason: collision with root package name */
    public AbstractC1680b f1859a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f1860b;

    /* renamed from: c, reason: collision with root package name */
    public ae f1861c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2392k f1862d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1863f;

    /* renamed from: g, reason: collision with root package name */
    public final ax f1864g;

    /* renamed from: h, reason: collision with root package name */
    public final ax f1865h;

    /* renamed from: i, reason: collision with root package name */
    public final ax f1866i;
    public C3117a purple;
    public final N red = AbstractC3428A.charlie(new Z.e(0));
    public final ax silver = C0564b.zulu(null);
    public final aw teal = C0564b.victor(1.0f);
    public final ax white = C0564b.zulu(null);
    public h yellow;

    public n(X2.h hVar, M2.f fVar) {
        d dVar = d.alpha;
        this.yellow = dVar;
        this.f1860b = f1858j;
        this.f1862d = C2391j.bravo;
        this.e = 1;
        this.f1864g = C0564b.zulu(dVar);
        this.f1865h = C0564b.zulu(hVar);
        this.f1866i = C0564b.zulu(fVar);
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void alpha() {
        C3117a c3117a = this.purple;
        InterfaceC0563a0 interfaceC0563a0 = null;
        if (c3117a != null) {
            vf.ad.kilo(c3117a, null);
        }
        this.purple = null;
        Object obj = this.f1859a;
        if (obj instanceof InterfaceC0563a0) {
            interfaceC0563a0 = (InterfaceC0563a0) obj;
        }
        if (interfaceC0563a0 != null) {
            interfaceC0563a0.alpha();
        }
    }

    @Override // f0.AbstractC1680b
    public final boolean applyAlpha(float f5) {
        ((n0) this.teal).kilo(f5);
        return true;
    }

    @Override // f0.AbstractC1680b
    public final boolean applyColorFilter(AbstractC0367u abstractC0367u) {
        ((t0) this.white).setValue(abstractC0367u);
        return true;
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void bravo() {
        C3117a c3117a = this.purple;
        InterfaceC0563a0 interfaceC0563a0 = null;
        if (c3117a != null) {
            vf.ad.kilo(c3117a, null);
        }
        this.purple = null;
        Object obj = this.f1859a;
        if (obj instanceof InterfaceC0563a0) {
            interfaceC0563a0 = (InterfaceC0563a0) obj;
        }
        if (interfaceC0563a0 != null) {
            interfaceC0563a0.bravo();
        }
    }

    public final AbstractC1680b charlie(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return K0.alpha(new C0352f(((BitmapDrawable) drawable).getBitmap()), this.e);
        }
        return new C3464a(drawable.mutate());
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void delta() {
        InterfaceC0563a0 interfaceC0563a0;
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.purple == null) {
                a0 foxtrot = vf.ad.foxtrot();
                Cf.e eVar = ao.alpha;
                C3117a charlie = vf.ad.charlie(AbstractC2832z6.charlie(foxtrot, Af.n.alpha.teal));
                this.purple = charlie;
                Object obj = this.f1859a;
                if (obj instanceof InterfaceC0563a0) {
                    interfaceC0563a0 = (InterfaceC0563a0) obj;
                } else {
                    interfaceC0563a0 = null;
                }
                if (interfaceC0563a0 != null) {
                    interfaceC0563a0.delta();
                }
                if (this.f1863f) {
                    X2.g alpha = X2.h.alpha((X2.h) ((t0) this.f1865h).getValue());
                    alpha.bravo = ((M2.k) ((M2.f) ((t0) this.f1866i).getValue())).bravo;
                    alpha.quebec = null;
                    alpha.alpha().zulu.getClass();
                    X2.b bVar = a3.f.alpha;
                    echo(new f(null));
                } else {
                    vf.ad.zulu(charlie, null, null, new k(this, null), 3);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void echo(h hVar) {
        X2.i iVar;
        AbstractC1680b abstractC1680b;
        ae aeVar;
        Object alpha;
        InterfaceC0563a0 interfaceC0563a0;
        Object alpha2;
        AbstractC1680b abstractC1680b2;
        boolean z2;
        h hVar2 = this.yellow;
        h hVar3 = (h) this.f1860b.invoke(hVar);
        this.yellow = hVar3;
        ((t0) this.f1864g).setValue(hVar3);
        InterfaceC0563a0 interfaceC0563a02 = null;
        if (hVar3 instanceof g) {
            iVar = ((g) hVar3).bravo;
        } else {
            if (hVar3 instanceof e) {
                iVar = ((e) hVar3).bravo;
            }
            abstractC1680b = null;
            if (abstractC1680b == null) {
                abstractC1680b = hVar3.alpha();
            }
            this.f1859a = abstractC1680b;
            ((t0) this.silver).setValue(abstractC1680b);
            if (this.purple != null && hVar2.alpha() != hVar3.alpha()) {
                alpha = hVar2.alpha();
                if (!(alpha instanceof InterfaceC0563a0)) {
                    interfaceC0563a0 = (InterfaceC0563a0) alpha;
                } else {
                    interfaceC0563a0 = null;
                }
                if (interfaceC0563a0 != null) {
                    interfaceC0563a0.bravo();
                }
                alpha2 = hVar3.alpha();
                if (alpha2 instanceof InterfaceC0563a0) {
                    interfaceC0563a02 = (InterfaceC0563a0) alpha2;
                }
                if (interfaceC0563a02 != null) {
                    interfaceC0563a02.delta();
                }
            }
            aeVar = this.f1861c;
            if (aeVar != null) {
                aeVar.invoke(hVar3);
                return;
            }
            return;
        }
        Z2.f alpha3 = iVar.bravo().golf.alpha(p.alpha, iVar);
        if (alpha3 instanceof Z2.b) {
            AbstractC1680b alpha4 = hVar2.alpha();
            if (hVar2 instanceof f) {
                abstractC1680b2 = alpha4;
            } else {
                abstractC1680b2 = null;
            }
            AbstractC1680b alpha5 = hVar3.alpha();
            InterfaceC2392k interfaceC2392k = this.f1862d;
            Z2.b bVar = (Z2.b) alpha3;
            if ((iVar instanceof X2.m) && ((X2.m) iVar).golf) {
                z2 = false;
            } else {
                z2 = true;
            }
            abstractC1680b = new x(abstractC1680b2, alpha5, interfaceC2392k, bVar.charlie, z2);
            if (abstractC1680b == null) {
            }
            this.f1859a = abstractC1680b;
            ((t0) this.silver).setValue(abstractC1680b);
            if (this.purple != null) {
                alpha = hVar2.alpha();
                if (!(alpha instanceof InterfaceC0563a0)) {
                }
                if (interfaceC0563a0 != null) {
                }
                alpha2 = hVar3.alpha();
                if (alpha2 instanceof InterfaceC0563a0) {
                }
                if (interfaceC0563a02 != null) {
                }
            }
            aeVar = this.f1861c;
            if (aeVar != null) {
            }
        }
        abstractC1680b = null;
        if (abstractC1680b == null) {
        }
        this.f1859a = abstractC1680b;
        ((t0) this.silver).setValue(abstractC1680b);
        if (this.purple != null) {
        }
        aeVar = this.f1861c;
        if (aeVar != null) {
        }
    }

    @Override // f0.AbstractC1680b
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public final long mo1getIntrinsicSizeNHjbRc() {
        AbstractC1680b abstractC1680b = (AbstractC1680b) ((t0) this.silver).getValue();
        if (abstractC1680b != null) {
            return abstractC1680b.mo1getIntrinsicSizeNHjbRc();
        }
        return 9205357640488583168L;
    }

    @Override // f0.AbstractC1680b
    public final void onDraw(c0.d dVar) {
        Z.e eVar = new Z.e(dVar.bravo());
        N n5 = this.red;
        n5.getClass();
        n5.juliet(null, eVar);
        AbstractC1680b abstractC1680b = (AbstractC1680b) ((t0) this.silver).getValue();
        if (abstractC1680b != null) {
            abstractC1680b.m205drawx_KDEd0(dVar, dVar.bravo(), ((n0) this.teal).juliet(), (AbstractC0367u) ((t0) this.white).getValue());
        }
    }
}
