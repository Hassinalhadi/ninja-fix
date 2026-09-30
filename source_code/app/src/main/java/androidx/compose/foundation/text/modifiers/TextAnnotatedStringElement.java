package androidx.compose.foundation.text.modifiers;

import D0.an;
import D0.g;
import H0.j;
import T.r;
import a0.InterfaceC0368v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.F;
import t0.C2915g0;
import x.C3273d;
import x.C3277h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Ls0/F;", "Lx/h;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextAnnotatedStringElement extends F {

    /* renamed from: a, reason: collision with root package name */
    public final int f2974a;
    public final g alpha;

    /* renamed from: b, reason: collision with root package name */
    public final List f2975b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f2976c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0368v f2977d;
    public final Function1 e;
    public final an purple;
    public final j red;
    public final Function1 silver;
    public final int teal;
    public final boolean white;
    public final int yellow;

    public TextAnnotatedStringElement(g gVar, an anVar, j jVar, Function1 function1, int i4, boolean z2, int i5, int i10, List list, Function1 function12, InterfaceC0368v interfaceC0368v, Function1 function13) {
        this.alpha = gVar;
        this.purple = anVar;
        this.red = jVar;
        this.silver = function1;
        this.teal = i4;
        this.white = z2;
        this.yellow = i5;
        this.f2974a = i10;
        this.f2975b = list;
        this.f2976c = function12;
        this.f2977d = interfaceC0368v;
        this.e = function13;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x.h, T.r] */
    @Override // s0.F
    public final r create() {
        Function1 function1 = this.f2976c;
        Function1 function12 = this.e;
        g gVar = this.alpha;
        an anVar = this.purple;
        j jVar = this.red;
        Function1 function13 = this.silver;
        int i4 = this.teal;
        boolean z2 = this.white;
        int i5 = this.yellow;
        int i10 = this.f2974a;
        List list = this.f2975b;
        InterfaceC0368v interfaceC0368v = this.f2977d;
        ?? rVar = new r();
        rVar.alpha = gVar;
        rVar.purple = anVar;
        rVar.red = jVar;
        rVar.silver = function13;
        rVar.teal = i4;
        rVar.white = z2;
        rVar.yellow = i5;
        rVar.f14051a = i10;
        rVar.f14052b = list;
        rVar.f14053c = function1;
        rVar.f14054d = interfaceC0368v;
        rVar.e = function12;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextAnnotatedStringElement) {
                TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
                if (Intrinsics.areEqual(this.f2977d, textAnnotatedStringElement.f2977d) && Intrinsics.areEqual(this.alpha, textAnnotatedStringElement.alpha) && Intrinsics.areEqual(this.purple, textAnnotatedStringElement.purple) && Intrinsics.areEqual(this.f2975b, textAnnotatedStringElement.f2975b) && Intrinsics.areEqual(this.red, textAnnotatedStringElement.red) && this.silver == textAnnotatedStringElement.silver && this.e == textAnnotatedStringElement.e && this.teal == textAnnotatedStringElement.teal && this.white == textAnnotatedStringElement.white && this.yellow == textAnnotatedStringElement.yellow && this.f2974a == textAnnotatedStringElement.f2974a && this.f2976c == textAnnotatedStringElement.f2976c && Intrinsics.areEqual(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        int hashCode = (this.red.hashCode() + AbstractC2327c.romeo(this.alpha.hashCode() * 31, 31, this.purple)) * 31;
        int i13 = 0;
        Function1 function1 = this.silver;
        if (function1 != null) {
            i4 = function1.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (((hashCode + i4) * 31) + this.teal) * 31;
        if (this.white) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i15 = (((((i14 + i5) * 31) + this.yellow) * 31) + this.f2974a) * 31;
        List list = this.f2975b;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i16 = (i15 + i10) * 31;
        Function1 function12 = this.f2976c;
        if (function12 != null) {
            i11 = function12.hashCode();
        } else {
            i11 = 0;
        }
        int i17 = (i16 + i11) * 961;
        InterfaceC0368v interfaceC0368v = this.f2977d;
        if (interfaceC0368v != null) {
            i12 = interfaceC0368v.hashCode();
        } else {
            i12 = 0;
        }
        int i18 = (i17 + i12) * 31;
        Function1 function13 = this.e;
        if (function13 != null) {
            i13 = function13.hashCode();
        }
        return i18 + i13;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r3.alpha.bravo(r2.alpha) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b3  */
    @Override // s0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void update(r rVar) {
        boolean z2;
        boolean areEqual;
        boolean z10;
        int i4;
        int i5;
        List list;
        int i10;
        boolean z11;
        j jVar;
        Function1 function1;
        Function1 function12;
        Function1 function13;
        boolean z12;
        boolean charlie;
        j jVar2;
        C3277h c3277h = (C3277h) rVar;
        InterfaceC0368v interfaceC0368v = c3277h.f14054d;
        InterfaceC0368v interfaceC0368v2 = this.f2977d;
        boolean areEqual2 = Intrinsics.areEqual(interfaceC0368v2, interfaceC0368v);
        c3277h.f14054d = interfaceC0368v2;
        if (areEqual2) {
            an anVar = c3277h.purple;
            an anVar2 = this.purple;
            if (anVar2 == anVar) {
                anVar2.getClass();
            }
            z2 = false;
            g gVar = this.alpha;
            areEqual = Intrinsics.areEqual(c3277h.alpha.purple, gVar.purple);
            boolean areEqual3 = Intrinsics.areEqual(c3277h.alpha.alpha, gVar.alpha);
            if (!areEqual && areEqual3) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                c3277h.alpha = gVar;
            }
            if (!areEqual) {
                c3277h.f14058i = null;
            }
            i4 = this.yellow;
            i5 = this.teal;
            an anVar3 = this.purple;
            list = this.f2975b;
            i10 = this.f2974a;
            z11 = this.white;
            jVar = this.red;
            boolean z13 = true;
            boolean z14 = !c3277h.purple.charlie(anVar3);
            c3277h.purple = anVar3;
            if (!Intrinsics.areEqual(c3277h.f14052b, list)) {
                c3277h.f14052b = list;
                z14 = true;
            }
            if (c3277h.f14051a != i10) {
                c3277h.f14051a = i10;
                z14 = true;
            }
            if (c3277h.yellow != i4) {
                c3277h.yellow = i4;
                z14 = true;
            }
            if (c3277h.white != z11) {
                c3277h.white = z11;
                z14 = true;
            }
            if (!Intrinsics.areEqual(c3277h.red, jVar)) {
                c3277h.red = jVar;
                z14 = true;
            }
            if (c3277h.teal != i5) {
                c3277h.teal = i5;
                z14 = true;
            }
            if (Intrinsics.areEqual(null, null)) {
                z13 = z14;
            }
            function1 = this.f2976c;
            function12 = this.e;
            function13 = this.silver;
            boolean z15 = true;
            if (c3277h.silver == function13) {
                c3277h.silver = function13;
                z12 = true;
            } else {
                z12 = false;
            }
            if (c3277h.f14053c != function1) {
                c3277h.f14053c = function1;
                z12 = true;
            }
            if (!Intrinsics.areEqual(null, null)) {
                z12 = true;
            }
            if (c3277h.e == function12) {
                c3277h.e = function12;
            } else {
                z15 = z12;
            }
            if (!z10 || z13 || z15) {
                C3273d b2 = c3277h.b();
                g gVar2 = c3277h.alpha;
                an anVar4 = c3277h.purple;
                j jVar3 = c3277h.red;
                int i11 = c3277h.teal;
                boolean z16 = c3277h.white;
                int i12 = c3277h.yellow;
                int i13 = c3277h.f14051a;
                List list2 = c3277h.f14052b;
                b2.alpha = gVar2;
                charlie = anVar4.charlie(b2.kilo);
                b2.kilo = anVar4;
                if (charlie) {
                    jVar2 = jVar3;
                    b2.quebec <<= 2;
                    b2.lima = null;
                    b2.november = null;
                    b2.papa = -1;
                    b2.oscar = -1;
                } else {
                    jVar2 = jVar3;
                }
                b2.bravo = jVar2;
                b2.charlie = i11;
                b2.delta = z16;
                b2.echo = i12;
                b2.foxtrot = i13;
                b2.golf = list2;
                b2.quebec = (b2.quebec << 2) | 2;
                b2.lima = null;
                b2.november = null;
                b2.papa = -1;
                b2.oscar = -1;
            }
            if (!c3277h.isAttached()) {
                if (z10 || (z2 && c3277h.f14057h != null)) {
                    AbstractC2555o.golf(c3277h).coral();
                }
                if (z10 || z13 || z15) {
                    AbstractC2555o.golf(c3277h).blue();
                    AbstractC2557q.india(c3277h);
                }
                if (z2) {
                    AbstractC2557q.india(c3277h);
                    return;
                }
                return;
            }
            return;
        }
        z2 = true;
        g gVar3 = this.alpha;
        areEqual = Intrinsics.areEqual(c3277h.alpha.purple, gVar3.purple);
        boolean areEqual32 = Intrinsics.areEqual(c3277h.alpha.alpha, gVar3.alpha);
        if (!areEqual) {
        }
        z10 = true;
        if (z10) {
        }
        if (!areEqual) {
        }
        i4 = this.yellow;
        i5 = this.teal;
        an anVar32 = this.purple;
        list = this.f2975b;
        i10 = this.f2974a;
        z11 = this.white;
        jVar = this.red;
        boolean z132 = true;
        boolean z142 = !c3277h.purple.charlie(anVar32);
        c3277h.purple = anVar32;
        if (!Intrinsics.areEqual(c3277h.f14052b, list)) {
        }
        if (c3277h.f14051a != i10) {
        }
        if (c3277h.yellow != i4) {
        }
        if (c3277h.white != z11) {
        }
        if (!Intrinsics.areEqual(c3277h.red, jVar)) {
        }
        if (c3277h.teal != i5) {
        }
        if (Intrinsics.areEqual(null, null)) {
        }
        function1 = this.f2976c;
        function12 = this.e;
        function13 = this.silver;
        boolean z152 = true;
        if (c3277h.silver == function13) {
        }
        if (c3277h.f14053c != function1) {
        }
        if (!Intrinsics.areEqual(null, null)) {
        }
        if (c3277h.e == function12) {
        }
        if (!z10) {
        }
        C3273d b22 = c3277h.b();
        g gVar22 = c3277h.alpha;
        an anVar42 = c3277h.purple;
        j jVar32 = c3277h.red;
        int i112 = c3277h.teal;
        boolean z162 = c3277h.white;
        int i122 = c3277h.yellow;
        int i132 = c3277h.f14051a;
        List list22 = c3277h.f14052b;
        b22.alpha = gVar22;
        charlie = anVar42.charlie(b22.kilo);
        b22.kilo = anVar42;
        if (charlie) {
        }
        b22.bravo = jVar2;
        b22.charlie = i112;
        b22.delta = z162;
        b22.echo = i122;
        b22.foxtrot = i132;
        b22.golf = list22;
        b22.quebec = (b22.quebec << 2) | 2;
        b22.lima = null;
        b22.november = null;
        b22.papa = -1;
        b22.oscar = -1;
        if (!c3277h.isAttached()) {
        }
    }
}
