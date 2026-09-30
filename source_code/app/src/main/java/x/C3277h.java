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
import N2.t;
import T.r;
import a0.AbstractC0362p;
import a0.C0366t;
import a0.InterfaceC0364r;
import a0.InterfaceC0368v;
import a0.ar;
import android.os.Trace;
import ge.v;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n;
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
import t6.AbstractC2967a3;
import t6.I2;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3277h extends r implements ab, InterfaceC2558s, e0 {

    /* renamed from: a, reason: collision with root package name */
    public int f14051a;
    public D0.g alpha;

    /* renamed from: b, reason: collision with root package name */
    public List f14052b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f14053c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0368v f14054d;
    public Function1 e;

    /* renamed from: f, reason: collision with root package name */
    public Map f14055f;

    /* renamed from: g, reason: collision with root package name */
    public C3273d f14056g;

    /* renamed from: h, reason: collision with root package name */
    public C3275f f14057h;

    /* renamed from: i, reason: collision with root package name */
    public C3276g f14058i;
    public an purple;
    public H0.j red;
    public Function1 silver;
    public int teal;
    public boolean white;
    public int yellow;

    public final C3273d b() {
        if (this.f14056g == null) {
            this.f14056g = new C3273d(this.alpha, this.purple, this.red, this.teal, this.white, this.yellow, this.f14051a, this.f14052b);
        }
        C3273d c3273d = this.f14056g;
        Intrinsics.checkNotNull(c3273d);
        return c3273d;
    }

    @Override // s0.InterfaceC2558s
    public final /* synthetic */ void blue() {
    }

    public final C3273d c(Q0.d dVar) {
        C3273d c3273d;
        C3276g c3276g = this.f14058i;
        if (c3276g != null && c3276g.charlie && (c3273d = c3276g.delta) != null) {
            c3273d.delta(dVar);
            return c3273d;
        }
        C3273d b2 = b();
        b2.delta(dVar);
        return b2;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [x.f] */
    @Override // s0.e0
    public final void india(ad adVar) {
        C3275f c3275f = this.f14057h;
        C3275f c3275f2 = c3275f;
        if (c3275f == null) {
            final int i4 = 0;
            ?? r02 = new Function1(this) { // from class: x.f
                public final /* synthetic */ C3277h purple;

                {
                    this.purple = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ak akVar;
                    boolean z2;
                    long j5;
                    boolean z10;
                    switch (i4) {
                        case 0:
                            List list = (List) obj;
                            C3277h c3277h = this.purple;
                            ak akVar2 = c3277h.b().november;
                            if (akVar2 != null) {
                                aj ajVar = akVar2.alpha;
                                D0.g gVar = ajVar.alpha;
                                an anVar = c3277h.purple;
                                InterfaceC0368v interfaceC0368v = c3277h.f14054d;
                                if (interfaceC0368v != null) {
                                    j5 = interfaceC0368v.alpha();
                                } else {
                                    j5 = C0366t.kilo;
                                }
                                akVar = new ak(new aj(gVar, an.echo(anVar, j5, 0L, null, null, null, 0L, null, 0, 0L, 16777214), ajVar.charlie, ajVar.delta, ajVar.echo, ajVar.foxtrot, ajVar.golf, ajVar.hotel, ajVar.india, ajVar.juliet), akVar2.bravo, akVar2.charlie);
                                list.add(akVar);
                            } else {
                                akVar = null;
                            }
                            if (akVar != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            D0.g gVar2 = (D0.g) obj;
                            C3277h c3277h2 = this.purple;
                            C3276g c3276g = c3277h2.f14058i;
                            if (c3276g != null) {
                                if (!Intrinsics.areEqual(gVar2, c3276g.bravo)) {
                                    c3276g.bravo = gVar2;
                                    C3273d c3273d = c3276g.delta;
                                    if (c3273d != null) {
                                        an anVar2 = c3277h2.purple;
                                        H0.j jVar = c3277h2.red;
                                        int i5 = c3277h2.teal;
                                        boolean z11 = c3277h2.white;
                                        int i10 = c3277h2.yellow;
                                        int i11 = c3277h2.f14051a;
                                        List emptyList = CollectionsKt.emptyList();
                                        c3273d.alpha = gVar2;
                                        boolean charlie = anVar2.charlie(c3273d.kilo);
                                        c3273d.kilo = anVar2;
                                        if (!charlie) {
                                            c3273d.quebec <<= 2;
                                            c3273d.lima = null;
                                            c3273d.november = null;
                                            c3273d.papa = -1;
                                            c3273d.oscar = -1;
                                        }
                                        c3273d.bravo = jVar;
                                        c3273d.charlie = i5;
                                        c3273d.delta = z11;
                                        c3273d.echo = i10;
                                        c3273d.foxtrot = i11;
                                        c3273d.golf = emptyList;
                                        c3273d.quebec = (c3273d.quebec << 2) | 2;
                                        c3273d.lima = null;
                                        c3273d.november = null;
                                        c3273d.papa = -1;
                                        c3273d.oscar = -1;
                                    }
                                }
                            } else {
                                C3276g c3276g2 = new C3276g(c3277h2.alpha, gVar2);
                                C3273d c3273d2 = new C3273d(gVar2, c3277h2.purple, c3277h2.red, c3277h2.teal, c3277h2.white, c3277h2.yellow, c3277h2.f14051a, CollectionsKt.emptyList());
                                c3273d2.delta(c3277h2.b().juliet);
                                c3276g2.delta = c3273d2;
                                c3277h2.f14058i = c3276g2;
                            }
                            AbstractC2555o.golf(c3277h2).coral();
                            AbstractC2555o.golf(c3277h2).blue();
                            AbstractC2557q.india(c3277h2);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            C3277h c3277h3 = this.purple;
                            C3276g c3276g3 = c3277h3.f14058i;
                            if (c3276g3 == null) {
                                z10 = false;
                            } else {
                                Function1 function1 = c3277h3.e;
                                if (function1 != null) {
                                    Intrinsics.checkNotNull(c3276g3);
                                    function1.invoke(c3276g3);
                                }
                                C3276g c3276g4 = c3277h3.f14058i;
                                if (c3276g4 != null) {
                                    c3276g4.charlie = booleanValue;
                                }
                                AbstractC2555o.golf(c3277h3).coral();
                                AbstractC2555o.golf(c3277h3).blue();
                                AbstractC2557q.india(c3277h3);
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                    }
                }
            };
            this.f14057h = r02;
            c3275f2 = r02;
        }
        D0.g gVar = this.alpha;
        v[] vVarArr = aa.alpha;
        A0.k kVar = (A0.k) adVar;
        kVar.hotel(x.amber, kotlin.collections.ab.juliet(gVar));
        C3276g c3276g = this.f14058i;
        if (c3276g != null) {
            D0.g gVar2 = c3276g.bravo;
            ac acVar = x.azure;
            v[] vVarArr2 = aa.alpha;
            v vVar = vVarArr2[15];
            acVar.alpha(adVar, gVar2);
            boolean z2 = c3276g.charlie;
            ac acVar2 = x.beige;
            v vVar2 = vVarArr2[16];
            acVar2.alpha(adVar, Boolean.valueOf(z2));
        }
        final int i5 = 1;
        kVar.hotel(A0.j.kilo, new A0.a(null, new Function1(this) { // from class: x.f
            public final /* synthetic */ C3277h purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ak akVar;
                boolean z22;
                long j5;
                boolean z10;
                switch (i5) {
                    case 0:
                        List list = (List) obj;
                        C3277h c3277h = this.purple;
                        ak akVar2 = c3277h.b().november;
                        if (akVar2 != null) {
                            aj ajVar = akVar2.alpha;
                            D0.g gVar3 = ajVar.alpha;
                            an anVar = c3277h.purple;
                            InterfaceC0368v interfaceC0368v = c3277h.f14054d;
                            if (interfaceC0368v != null) {
                                j5 = interfaceC0368v.alpha();
                            } else {
                                j5 = C0366t.kilo;
                            }
                            akVar = new ak(new aj(gVar3, an.echo(anVar, j5, 0L, null, null, null, 0L, null, 0, 0L, 16777214), ajVar.charlie, ajVar.delta, ajVar.echo, ajVar.foxtrot, ajVar.golf, ajVar.hotel, ajVar.india, ajVar.juliet), akVar2.bravo, akVar2.charlie);
                            list.add(akVar);
                        } else {
                            akVar = null;
                        }
                        if (akVar != null) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        return Boolean.valueOf(z22);
                    case 1:
                        D0.g gVar22 = (D0.g) obj;
                        C3277h c3277h2 = this.purple;
                        C3276g c3276g2 = c3277h2.f14058i;
                        if (c3276g2 != null) {
                            if (!Intrinsics.areEqual(gVar22, c3276g2.bravo)) {
                                c3276g2.bravo = gVar22;
                                C3273d c3273d = c3276g2.delta;
                                if (c3273d != null) {
                                    an anVar2 = c3277h2.purple;
                                    H0.j jVar = c3277h2.red;
                                    int i52 = c3277h2.teal;
                                    boolean z11 = c3277h2.white;
                                    int i10 = c3277h2.yellow;
                                    int i11 = c3277h2.f14051a;
                                    List emptyList = CollectionsKt.emptyList();
                                    c3273d.alpha = gVar22;
                                    boolean charlie = anVar2.charlie(c3273d.kilo);
                                    c3273d.kilo = anVar2;
                                    if (!charlie) {
                                        c3273d.quebec <<= 2;
                                        c3273d.lima = null;
                                        c3273d.november = null;
                                        c3273d.papa = -1;
                                        c3273d.oscar = -1;
                                    }
                                    c3273d.bravo = jVar;
                                    c3273d.charlie = i52;
                                    c3273d.delta = z11;
                                    c3273d.echo = i10;
                                    c3273d.foxtrot = i11;
                                    c3273d.golf = emptyList;
                                    c3273d.quebec = (c3273d.quebec << 2) | 2;
                                    c3273d.lima = null;
                                    c3273d.november = null;
                                    c3273d.papa = -1;
                                    c3273d.oscar = -1;
                                }
                            }
                        } else {
                            C3276g c3276g22 = new C3276g(c3277h2.alpha, gVar22);
                            C3273d c3273d2 = new C3273d(gVar22, c3277h2.purple, c3277h2.red, c3277h2.teal, c3277h2.white, c3277h2.yellow, c3277h2.f14051a, CollectionsKt.emptyList());
                            c3273d2.delta(c3277h2.b().juliet);
                            c3276g22.delta = c3273d2;
                            c3277h2.f14058i = c3276g22;
                        }
                        AbstractC2555o.golf(c3277h2).coral();
                        AbstractC2555o.golf(c3277h2).blue();
                        AbstractC2557q.india(c3277h2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        C3277h c3277h3 = this.purple;
                        C3276g c3276g3 = c3277h3.f14058i;
                        if (c3276g3 == null) {
                            z10 = false;
                        } else {
                            Function1 function1 = c3277h3.e;
                            if (function1 != null) {
                                Intrinsics.checkNotNull(c3276g3);
                                function1.invoke(c3276g3);
                            }
                            C3276g c3276g4 = c3277h3.f14058i;
                            if (c3276g4 != null) {
                                c3276g4.charlie = booleanValue;
                            }
                            AbstractC2555o.golf(c3277h3).coral();
                            AbstractC2555o.golf(c3277h3).blue();
                            AbstractC2557q.india(c3277h3);
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                }
            }
        }));
        final int i10 = 2;
        kVar.hotel(A0.j.lima, new A0.a(null, new Function1(this) { // from class: x.f
            public final /* synthetic */ C3277h purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ak akVar;
                boolean z22;
                long j5;
                boolean z10;
                switch (i10) {
                    case 0:
                        List list = (List) obj;
                        C3277h c3277h = this.purple;
                        ak akVar2 = c3277h.b().november;
                        if (akVar2 != null) {
                            aj ajVar = akVar2.alpha;
                            D0.g gVar3 = ajVar.alpha;
                            an anVar = c3277h.purple;
                            InterfaceC0368v interfaceC0368v = c3277h.f14054d;
                            if (interfaceC0368v != null) {
                                j5 = interfaceC0368v.alpha();
                            } else {
                                j5 = C0366t.kilo;
                            }
                            akVar = new ak(new aj(gVar3, an.echo(anVar, j5, 0L, null, null, null, 0L, null, 0, 0L, 16777214), ajVar.charlie, ajVar.delta, ajVar.echo, ajVar.foxtrot, ajVar.golf, ajVar.hotel, ajVar.india, ajVar.juliet), akVar2.bravo, akVar2.charlie);
                            list.add(akVar);
                        } else {
                            akVar = null;
                        }
                        if (akVar != null) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        return Boolean.valueOf(z22);
                    case 1:
                        D0.g gVar22 = (D0.g) obj;
                        C3277h c3277h2 = this.purple;
                        C3276g c3276g2 = c3277h2.f14058i;
                        if (c3276g2 != null) {
                            if (!Intrinsics.areEqual(gVar22, c3276g2.bravo)) {
                                c3276g2.bravo = gVar22;
                                C3273d c3273d = c3276g2.delta;
                                if (c3273d != null) {
                                    an anVar2 = c3277h2.purple;
                                    H0.j jVar = c3277h2.red;
                                    int i52 = c3277h2.teal;
                                    boolean z11 = c3277h2.white;
                                    int i102 = c3277h2.yellow;
                                    int i11 = c3277h2.f14051a;
                                    List emptyList = CollectionsKt.emptyList();
                                    c3273d.alpha = gVar22;
                                    boolean charlie = anVar2.charlie(c3273d.kilo);
                                    c3273d.kilo = anVar2;
                                    if (!charlie) {
                                        c3273d.quebec <<= 2;
                                        c3273d.lima = null;
                                        c3273d.november = null;
                                        c3273d.papa = -1;
                                        c3273d.oscar = -1;
                                    }
                                    c3273d.bravo = jVar;
                                    c3273d.charlie = i52;
                                    c3273d.delta = z11;
                                    c3273d.echo = i102;
                                    c3273d.foxtrot = i11;
                                    c3273d.golf = emptyList;
                                    c3273d.quebec = (c3273d.quebec << 2) | 2;
                                    c3273d.lima = null;
                                    c3273d.november = null;
                                    c3273d.papa = -1;
                                    c3273d.oscar = -1;
                                }
                            }
                        } else {
                            C3276g c3276g22 = new C3276g(c3277h2.alpha, gVar22);
                            C3273d c3273d2 = new C3273d(gVar22, c3277h2.purple, c3277h2.red, c3277h2.teal, c3277h2.white, c3277h2.yellow, c3277h2.f14051a, CollectionsKt.emptyList());
                            c3273d2.delta(c3277h2.b().juliet);
                            c3276g22.delta = c3273d2;
                            c3277h2.f14058i = c3276g22;
                        }
                        AbstractC2555o.golf(c3277h2).coral();
                        AbstractC2555o.golf(c3277h2).blue();
                        AbstractC2557q.india(c3277h2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        C3277h c3277h3 = this.purple;
                        C3276g c3276g3 = c3277h3.f14058i;
                        if (c3276g3 == null) {
                            z10 = false;
                        } else {
                            Function1 function1 = c3277h3.e;
                            if (function1 != null) {
                                Intrinsics.checkNotNull(c3276g3);
                                function1.invoke(c3276g3);
                            }
                            C3276g c3276g4 = c3277h3.f14058i;
                            if (c3276g4 != null) {
                                c3276g4.charlie = booleanValue;
                            }
                            AbstractC2555o.golf(c3277h3).coral();
                            AbstractC2555o.golf(c3277h3).blue();
                            AbstractC2557q.india(c3277h3);
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                }
            }
        }));
        kVar.hotel(A0.j.mike, new A0.a(null, new n(29, this)));
        aa.alpha(adVar, c3275f2);
    }

    @Override // s0.InterfaceC2558s
    public final void jade(s0.an anVar) {
        boolean z2;
        boolean z10;
        long j5;
        boolean alpha;
        if (isAttached()) {
            InterfaceC0364r mike = anVar.alpha.purple.mike();
            C3273d c3 = c(anVar);
            ak akVar = c3.november;
            if (akVar != null) {
                float f5 = (int) (akVar.charlie >> 32);
                o oVar = akVar.bravo;
                boolean z11 = true;
                if (f5 >= oVar.delta && !oVar.charlie && ((int) (r3 & 4294967295L)) >= oVar.echo) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2 && this.teal != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Z.c alpha2 = I2.alpha(0L, (Float.floatToRawIntBits((int) (r3 >> 32)) << 32) | (4294967295L & Float.floatToRawIntBits((int) (r3 & 4294967295L))));
                    mike.golf();
                    mike.papa(alpha2);
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
                        o.juliet(oVar, mike, echo, this.purple.alpha.alpha.alpha(), arVar2, lVar2, eVar2);
                    } else {
                        InterfaceC0368v interfaceC0368v = this.f14054d;
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
                        o.india(oVar, mike, j5, arVar2, lVar2, eVar2);
                    }
                    if (z10) {
                        mike.november();
                    }
                    C3276g c3276g = this.f14058i;
                    if (c3276g != null && c3276g.charlie) {
                        alpha = false;
                    } else {
                        alpha = AbstractC2967a3.alpha(this.alpha);
                    }
                    if (!alpha) {
                        List list = this.f14052b;
                        if (list != null && !list.isEmpty()) {
                            z11 = false;
                        }
                        if (z11) {
                            return;
                        }
                    }
                    anVar.charlie();
                } finally {
                }
            } else {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + c3);
            }
        }
    }

    @Override // s0.ab
    public final int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return c(interfaceC2402u).alpha(i4, interfaceC2402u.getLayoutDirection());
    }

    @Override // s0.ab
    public final int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return at.oscar(c(interfaceC2402u).echo(interfaceC2402u.getLayoutDirection()).romeo());
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    public final aq mo0measure3p2s80s(q0.ar arVar, ao aoVar, long j5) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            C3273d c3 = c(arVar);
            boolean charlie = c3.charlie(j5, arVar.getLayoutDirection());
            ak akVar = c3.november;
            if (akVar != null) {
                akVar.bravo.alpha.delta();
                if (charlie) {
                    AbstractC2555o.echo(this, 2).H();
                    Function1 function1 = this.silver;
                    if (function1 != null) {
                        function1.invoke(akVar);
                    }
                    Map map = this.f14055f;
                    if (map == null) {
                        map = new LinkedHashMap(2);
                    }
                    map.put(AbstractC2384c.alpha, Integer.valueOf(Math.round(akVar.delta)));
                    map.put(AbstractC2384c.bravo, Integer.valueOf(Math.round(akVar.echo)));
                    this.f14055f = map;
                }
                Function1 function12 = this.f14053c;
                if (function12 != null) {
                    function12.invoke(akVar.foxtrot);
                }
                long j6 = akVar.charlie;
                int i4 = (int) (j6 >> 32);
                int i5 = (int) (j6 & 4294967295L);
                AbstractC2367C victor = aoVar.victor(X6.bravo(i4, i4, i5, i5));
                Map map2 = this.f14055f;
                Intrinsics.checkNotNull(map2);
                aq papa = arVar.papa(i4, i5, map2, new t(victor, 10));
                Trace.endSection();
                return papa;
            }
            throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + c3);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // s0.ab
    public final int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return c(interfaceC2402u).alpha(i4, interfaceC2402u.getLayoutDirection());
    }

    @Override // s0.ab
    public final int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return at.oscar(c(interfaceC2402u).echo(interfaceC2402u.getLayoutDirection()).november());
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
