package l;

import A0.aa;
import A0.ad;
import A0.h;
import A0.x;
import b.ac;
import f.InterfaceC1673j;
import ge.v;
import k5.C2008a;
import kotlin.collections.n;
import kotlin.jvm.functions.Function1;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2042b extends ac {

    /* renamed from: q, reason: collision with root package name */
    public boolean f12939q;

    /* renamed from: r, reason: collision with root package name */
    public Function1 f12940r;

    /* renamed from: s, reason: collision with root package name */
    public final n f12941s;

    public C2042b(boolean z2, InterfaceC1673j interfaceC1673j, boolean z10, h hVar, Function1 function1) {
        super(interfaceC1673j, null, false, z10, null, hVar, new C2008a(function1, z2, 1));
        this.f12939q = z2;
        this.f12940r = function1;
        this.f12941s = new n(1, this);
    }

    @Override // b.AbstractC0701p
    public final void e(ad adVar) {
        C0.a aVar;
        if (this.f12939q) {
            aVar = C0.a.alpha;
        } else {
            aVar = C0.a.purple;
        }
        v[] vVarArr = aa.alpha;
        A0.ac acVar = x.cyan;
        v vVar = aa.alpha[24];
        acVar.alpha(adVar, aVar);
    }
}
