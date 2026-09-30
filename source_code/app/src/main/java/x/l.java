package x;

import A0.aa;
import A0.ac;
import A0.ad;
import A0.x;
import D0.af;
import D0.aj;
import D0.ak;
import D0.an;
import D0.o;
import D0.s;
import N2.t;
import Q0.n;
import T.r;
import a0.AbstractC0362p;
import a0.C0366t;
import a0.InterfaceC0364r;
import a0.InterfaceC0368v;
import a0.ar;
import android.os.Trace;
import g.AbstractC1719b;
import ge.v;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.at;
import q0.AbstractC2367C;
import q0.AbstractC2384c;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import q0.ao;
import q0.aq;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.InterfaceC2558s;
import s0.ab;
import s0.e0;
import s6.X6;

/* loaded from: classes3.dex */
public final class l extends r implements ab, InterfaceC2558s, e0 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0368v f14059a;
    public String alpha;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f14060b;

    /* renamed from: c, reason: collision with root package name */
    public C3274e f14061c;

    /* renamed from: d, reason: collision with root package name */
    public i f14062d;
    public k e;
    public an purple;
    public H0.j red;
    public int silver;
    public boolean teal;
    public int white;
    public int yellow;

    public final C3274e b() {
        if (this.f14061c == null) {
            this.f14061c = new C3274e(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow);
        }
        C3274e c3274e = this.f14061c;
        Intrinsics.checkNotNull(c3274e);
        return c3274e;
    }

    @Override // s0.InterfaceC2558s
    public final /* synthetic */ void blue() {
    }

    @Override // s0.e0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [x.i] */
    @Override // s0.e0
    public final void india(ad adVar) {
        final int i4 = 0;
        i iVar = this.f14062d;
        i iVar2 = iVar;
        if (iVar == null) {
            ?? r12 = new Function1(this) { // from class: x.i
                public final /* synthetic */ l purple;

                {
                    this.purple = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0142  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x014a  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    long j5;
                    InterfaceC2402u interfaceC2402u;
                    ak akVar;
                    boolean z2;
                    boolean z10;
                    switch (i4) {
                        case 0:
                            List list = (List) obj;
                            l lVar = this.purple;
                            C3274e b2 = lVar.b();
                            an anVar = lVar.purple;
                            InterfaceC0368v interfaceC0368v = lVar.f14059a;
                            if (interfaceC0368v != null) {
                                j5 = interfaceC0368v.alpha();
                            } else {
                                j5 = C0366t.kilo;
                            }
                            an echo = an.echo(anVar, j5, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                            n nVar = b2.oscar;
                            ak akVar2 = null;
                            if (nVar != null && (interfaceC2402u = b2.india) != null) {
                                D0.g gVar = new D0.g(b2.alpha);
                                if (b2.juliet != null && b2.november != null) {
                                    long j6 = b2.papa & (-8589934589L);
                                    akVar = new ak(new aj(gVar, echo, CollectionsKt.emptyList(), b2.foxtrot, b2.echo, b2.delta, interfaceC2402u, nVar, b2.charlie, j6), new o(new B9.ab(gVar, echo, CollectionsKt.emptyList(), interfaceC2402u, b2.charlie), j6, b2.foxtrot, b2.delta), b2.lima);
                                    if (akVar != null) {
                                        list.add(akVar);
                                        akVar2 = akVar;
                                    }
                                    if (akVar2 == null) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    return Boolean.valueOf(z2);
                                }
                            }
                            akVar = null;
                            if (akVar != null) {
                            }
                            if (akVar2 == null) {
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            String str = ((D0.g) obj).purple;
                            l lVar2 = this.purple;
                            k kVar = lVar2.e;
                            if (kVar != null) {
                                if (!Intrinsics.areEqual(str, kVar.bravo)) {
                                    kVar.bravo = str;
                                    C3274e c3274e = kVar.delta;
                                    if (c3274e != null) {
                                        an anVar2 = lVar2.purple;
                                        H0.j jVar = lVar2.red;
                                        int i5 = lVar2.silver;
                                        boolean z11 = lVar2.teal;
                                        int i10 = lVar2.white;
                                        int i11 = lVar2.yellow;
                                        c3274e.alpha = str;
                                        c3274e.bravo = anVar2;
                                        c3274e.charlie = jVar;
                                        c3274e.delta = i5;
                                        c3274e.echo = z11;
                                        c3274e.foxtrot = i10;
                                        c3274e.golf = i11;
                                        c3274e.sierra = (c3274e.sierra << 2) | 2;
                                        c3274e.charlie();
                                    }
                                }
                            } else {
                                k kVar2 = new k(lVar2.alpha, str);
                                C3274e c3274e2 = new C3274e(str, lVar2.purple, lVar2.red, lVar2.silver, lVar2.teal, lVar2.white, lVar2.yellow);
                                c3274e2.delta(lVar2.b().india);
                                kVar2.delta = c3274e2;
                                lVar2.e = kVar2;
                            }
                            AbstractC2555o.golf(lVar2).coral();
                            AbstractC2555o.golf(lVar2).blue();
                            AbstractC2557q.india(lVar2);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            l lVar3 = this.purple;
                            k kVar3 = lVar3.e;
                            if (kVar3 == null) {
                                z10 = false;
                            } else {
                                kVar3.charlie = booleanValue;
                                AbstractC2555o.golf(lVar3).coral();
                                AbstractC2555o.golf(lVar3).blue();
                                AbstractC2557q.india(lVar3);
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                    }
                }
            };
            this.f14062d = r12;
            iVar2 = r12;
        }
        D0.g gVar = new D0.g(this.alpha);
        v[] vVarArr = aa.alpha;
        A0.k kVar = (A0.k) adVar;
        kVar.hotel(x.amber, kotlin.collections.ab.juliet(gVar));
        k kVar2 = this.e;
        if (kVar2 != null) {
            boolean z2 = kVar2.charlie;
            ac acVar = x.beige;
            v[] vVarArr2 = aa.alpha;
            v vVar = vVarArr2[16];
            acVar.alpha(adVar, Boolean.valueOf(z2));
            D0.g gVar2 = new D0.g(kVar2.bravo);
            ac acVar2 = x.azure;
            v vVar2 = vVarArr2[15];
            acVar2.alpha(adVar, gVar2);
        }
        final int i5 = 1;
        kVar.hotel(A0.j.kilo, new A0.a(null, new Function1(this) { // from class: x.i
            public final /* synthetic */ l purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0142  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x014a  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                long j5;
                InterfaceC2402u interfaceC2402u;
                ak akVar;
                boolean z22;
                boolean z10;
                switch (i5) {
                    case 0:
                        List list = (List) obj;
                        l lVar = this.purple;
                        C3274e b2 = lVar.b();
                        an anVar = lVar.purple;
                        InterfaceC0368v interfaceC0368v = lVar.f14059a;
                        if (interfaceC0368v != null) {
                            j5 = interfaceC0368v.alpha();
                        } else {
                            j5 = C0366t.kilo;
                        }
                        an echo = an.echo(anVar, j5, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                        n nVar = b2.oscar;
                        ak akVar2 = null;
                        if (nVar != null && (interfaceC2402u = b2.india) != null) {
                            D0.g gVar3 = new D0.g(b2.alpha);
                            if (b2.juliet != null && b2.november != null) {
                                long j6 = b2.papa & (-8589934589L);
                                akVar = new ak(new aj(gVar3, echo, CollectionsKt.emptyList(), b2.foxtrot, b2.echo, b2.delta, interfaceC2402u, nVar, b2.charlie, j6), new o(new B9.ab(gVar3, echo, CollectionsKt.emptyList(), interfaceC2402u, b2.charlie), j6, b2.foxtrot, b2.delta), b2.lima);
                                if (akVar != null) {
                                    list.add(akVar);
                                    akVar2 = akVar;
                                }
                                if (akVar2 == null) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                return Boolean.valueOf(z22);
                            }
                        }
                        akVar = null;
                        if (akVar != null) {
                        }
                        if (akVar2 == null) {
                        }
                        return Boolean.valueOf(z22);
                    case 1:
                        String str = ((D0.g) obj).purple;
                        l lVar2 = this.purple;
                        k kVar3 = lVar2.e;
                        if (kVar3 != null) {
                            if (!Intrinsics.areEqual(str, kVar3.bravo)) {
                                kVar3.bravo = str;
                                C3274e c3274e = kVar3.delta;
                                if (c3274e != null) {
                                    an anVar2 = lVar2.purple;
                                    H0.j jVar = lVar2.red;
                                    int i52 = lVar2.silver;
                                    boolean z11 = lVar2.teal;
                                    int i10 = lVar2.white;
                                    int i11 = lVar2.yellow;
                                    c3274e.alpha = str;
                                    c3274e.bravo = anVar2;
                                    c3274e.charlie = jVar;
                                    c3274e.delta = i52;
                                    c3274e.echo = z11;
                                    c3274e.foxtrot = i10;
                                    c3274e.golf = i11;
                                    c3274e.sierra = (c3274e.sierra << 2) | 2;
                                    c3274e.charlie();
                                }
                            }
                        } else {
                            k kVar22 = new k(lVar2.alpha, str);
                            C3274e c3274e2 = new C3274e(str, lVar2.purple, lVar2.red, lVar2.silver, lVar2.teal, lVar2.white, lVar2.yellow);
                            c3274e2.delta(lVar2.b().india);
                            kVar22.delta = c3274e2;
                            lVar2.e = kVar22;
                        }
                        AbstractC2555o.golf(lVar2).coral();
                        AbstractC2555o.golf(lVar2).blue();
                        AbstractC2557q.india(lVar2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        l lVar3 = this.purple;
                        k kVar32 = lVar3.e;
                        if (kVar32 == null) {
                            z10 = false;
                        } else {
                            kVar32.charlie = booleanValue;
                            AbstractC2555o.golf(lVar3).coral();
                            AbstractC2555o.golf(lVar3).blue();
                            AbstractC2557q.india(lVar3);
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                }
            }
        }));
        final int i10 = 2;
        kVar.hotel(A0.j.lima, new A0.a(null, new Function1(this) { // from class: x.i
            public final /* synthetic */ l purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0142  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x014a  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                long j5;
                InterfaceC2402u interfaceC2402u;
                ak akVar;
                boolean z22;
                boolean z10;
                switch (i10) {
                    case 0:
                        List list = (List) obj;
                        l lVar = this.purple;
                        C3274e b2 = lVar.b();
                        an anVar = lVar.purple;
                        InterfaceC0368v interfaceC0368v = lVar.f14059a;
                        if (interfaceC0368v != null) {
                            j5 = interfaceC0368v.alpha();
                        } else {
                            j5 = C0366t.kilo;
                        }
                        an echo = an.echo(anVar, j5, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                        n nVar = b2.oscar;
                        ak akVar2 = null;
                        if (nVar != null && (interfaceC2402u = b2.india) != null) {
                            D0.g gVar3 = new D0.g(b2.alpha);
                            if (b2.juliet != null && b2.november != null) {
                                long j6 = b2.papa & (-8589934589L);
                                akVar = new ak(new aj(gVar3, echo, CollectionsKt.emptyList(), b2.foxtrot, b2.echo, b2.delta, interfaceC2402u, nVar, b2.charlie, j6), new o(new B9.ab(gVar3, echo, CollectionsKt.emptyList(), interfaceC2402u, b2.charlie), j6, b2.foxtrot, b2.delta), b2.lima);
                                if (akVar != null) {
                                    list.add(akVar);
                                    akVar2 = akVar;
                                }
                                if (akVar2 == null) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                return Boolean.valueOf(z22);
                            }
                        }
                        akVar = null;
                        if (akVar != null) {
                        }
                        if (akVar2 == null) {
                        }
                        return Boolean.valueOf(z22);
                    case 1:
                        String str = ((D0.g) obj).purple;
                        l lVar2 = this.purple;
                        k kVar3 = lVar2.e;
                        if (kVar3 != null) {
                            if (!Intrinsics.areEqual(str, kVar3.bravo)) {
                                kVar3.bravo = str;
                                C3274e c3274e = kVar3.delta;
                                if (c3274e != null) {
                                    an anVar2 = lVar2.purple;
                                    H0.j jVar = lVar2.red;
                                    int i52 = lVar2.silver;
                                    boolean z11 = lVar2.teal;
                                    int i102 = lVar2.white;
                                    int i11 = lVar2.yellow;
                                    c3274e.alpha = str;
                                    c3274e.bravo = anVar2;
                                    c3274e.charlie = jVar;
                                    c3274e.delta = i52;
                                    c3274e.echo = z11;
                                    c3274e.foxtrot = i102;
                                    c3274e.golf = i11;
                                    c3274e.sierra = (c3274e.sierra << 2) | 2;
                                    c3274e.charlie();
                                }
                            }
                        } else {
                            k kVar22 = new k(lVar2.alpha, str);
                            C3274e c3274e2 = new C3274e(str, lVar2.purple, lVar2.red, lVar2.silver, lVar2.teal, lVar2.white, lVar2.yellow);
                            c3274e2.delta(lVar2.b().india);
                            kVar22.delta = c3274e2;
                            lVar2.e = kVar22;
                        }
                        AbstractC2555o.golf(lVar2).coral();
                        AbstractC2555o.golf(lVar2).blue();
                        AbstractC2557q.india(lVar2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        l lVar3 = this.purple;
                        k kVar32 = lVar3.e;
                        if (kVar32 == null) {
                            z10 = false;
                        } else {
                            kVar32.charlie = booleanValue;
                            AbstractC2555o.golf(lVar3).coral();
                            AbstractC2555o.golf(lVar3).blue();
                            AbstractC2557q.india(lVar3);
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                }
            }
        }));
        kVar.hotel(A0.j.mike, new A0.a(null, new j(0, this)));
        aa.alpha(adVar, iVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // s0.InterfaceC2558s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void jade(s0.an anVar) {
        C3274e b2;
        long j5;
        if (isAttached()) {
            k kVar = this.e;
            if (kVar != null) {
                if (!kVar.charlie) {
                    kVar = null;
                }
                if (kVar != null) {
                    b2 = kVar.delta;
                }
            }
            b2 = b();
            D0.a aVar = b2.juliet;
            if (aVar != null) {
                InterfaceC0364r mike = anVar.alpha.purple.mike();
                boolean z2 = b2.kilo;
                if (z2) {
                    long j6 = b2.lima;
                    mike.golf();
                    mike.lima(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L), 1);
                }
                try {
                    af afVar = this.purple.alpha;
                    O0.l lVar = afVar.mike;
                    if (lVar == null) {
                        lVar = O0.l.bravo;
                    }
                    O0.l lVar2 = lVar;
                    ar arVar = afVar.november;
                    if (arVar == null) {
                        arVar = ar.delta;
                    }
                    ar arVar2 = arVar;
                    c0.e eVar = afVar.papa;
                    if (eVar == null) {
                        eVar = c0.g.alpha;
                    }
                    c0.e eVar2 = eVar;
                    AbstractC0362p echo = afVar.alpha.echo();
                    if (echo != null) {
                        aVar.golf(mike, echo, this.purple.alpha.alpha.alpha(), arVar2, lVar2, eVar2);
                    } else {
                        InterfaceC0368v interfaceC0368v = this.f14059a;
                        if (interfaceC0368v != null) {
                            j5 = interfaceC0368v.alpha();
                        } else {
                            j5 = C0366t.kilo;
                        }
                        if (j5 == 16) {
                            if (this.purple.bravo() != 16) {
                                j5 = this.purple.bravo();
                            } else {
                                j5 = C0366t.bravo;
                            }
                        }
                        aVar.foxtrot(mike, j5, arVar2, lVar2, eVar2);
                    }
                    if (z2) {
                        mike.november();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (z2) {
                        mike.november();
                    }
                    throw th;
                }
            }
            AbstractC1719b.bravo("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f14061c + ", textSubstitution=" + this.e + ')');
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 != null) goto L12;
     */
    @Override // s0.ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        C3274e b2;
        q0.ar arVar = (q0.ar) interfaceC2402u;
        k kVar = this.e;
        if (kVar != null) {
            if (!kVar.charlie) {
                kVar = null;
            }
            if (kVar != null) {
                b2 = kVar.delta;
            }
        }
        b2 = b();
        b2.delta(arVar);
        return b2.alpha(i4, interfaceC2402u.getLayoutDirection());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r4 != null) goto L12;
     */
    @Override // s0.ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        C3274e b2;
        q0.ar arVar = (q0.ar) interfaceC2402u;
        k kVar = this.e;
        if (kVar != null) {
            if (!kVar.charlie) {
                kVar = null;
            }
            if (kVar != null) {
                b2 = kVar.delta;
            }
        }
        b2 = b();
        b2.delta(arVar);
        return at.oscar(b2.echo(interfaceC2402u.getLayoutDirection()).romeo());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r0 != null) goto L13;
     */
    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aq mo0measure3p2s80s(q0.ar arVar, ao aoVar, long j5) {
        C3274e b2;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            k kVar = this.e;
            if (kVar != null) {
                if (!kVar.charlie) {
                    kVar = null;
                }
                if (kVar != null) {
                    b2 = kVar.delta;
                }
            }
            b2 = b();
            b2.delta(arVar);
            boolean bravo = b2.bravo(j5, arVar.getLayoutDirection());
            s sVar = b2.november;
            if (sVar != null) {
                sVar.delta();
            }
            D0.a aVar = b2.juliet;
            Intrinsics.checkNotNull(aVar);
            long j6 = b2.lima;
            if (bravo) {
                AbstractC2555o.echo(this, 2).H();
                HashMap hashMap = this.f14060b;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.f14060b = hashMap;
                }
                hashMap.put(AbstractC2384c.alpha, Integer.valueOf(Math.round(aVar.delta.delta(0))));
                hashMap.put(AbstractC2384c.bravo, Integer.valueOf(Math.round(aVar.delta.delta(r9.golf - 1))));
            }
            int i4 = (int) (j6 >> 32);
            int i5 = (int) (j6 & 4294967295L);
            AbstractC2367C victor = aoVar.victor(X6.bravo(i4, i4, i5, i5));
            HashMap hashMap2 = this.f14060b;
            Intrinsics.checkNotNull(hashMap2);
            aq papa = arVar.papa(i4, i5, hashMap2, new t(victor, 11));
            Trace.endSection();
            return papa;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 != null) goto L12;
     */
    @Override // s0.ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        C3274e b2;
        q0.ar arVar = (q0.ar) interfaceC2402u;
        k kVar = this.e;
        if (kVar != null) {
            if (!kVar.charlie) {
                kVar = null;
            }
            if (kVar != null) {
                b2 = kVar.delta;
            }
        }
        b2 = b();
        b2.delta(arVar);
        return b2.alpha(i4, interfaceC2402u.getLayoutDirection());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r4 != null) goto L12;
     */
    @Override // s0.ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        C3274e b2;
        q0.ar arVar = (q0.ar) interfaceC2402u;
        k kVar = this.e;
        if (kVar != null) {
            if (!kVar.charlie) {
                kVar = null;
            }
            if (kVar != null) {
                b2 = kVar.delta;
            }
        }
        b2 = b();
        b2.delta(arVar);
        return at.oscar(b2.echo(interfaceC2402u.getLayoutDirection()).november());
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
