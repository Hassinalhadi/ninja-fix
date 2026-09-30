package androidx.compose.foundation.text.modifiers;

import D0.an;
import H0.j;
import T.r;
import a0.InterfaceC0368v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.F;
import t0.C2915g0;
import x.C3274e;
import x.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Ls0/F;", "Lx/l;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextStringSimpleElement extends F {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0368v f2978a;
    public final String alpha;
    public final an purple;
    public final j red;
    public final int silver;
    public final boolean teal;
    public final int white;
    public final int yellow;

    public TextStringSimpleElement(String str, an anVar, j jVar, int i4, boolean z2, int i5, int i10, InterfaceC0368v interfaceC0368v) {
        this.alpha = str;
        this.purple = anVar;
        this.red = jVar;
        this.silver = i4;
        this.teal = z2;
        this.white = i5;
        this.yellow = i10;
        this.f2978a = interfaceC0368v;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x.l, T.r] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        rVar.red = this.red;
        rVar.silver = this.silver;
        rVar.teal = this.teal;
        rVar.white = this.white;
        rVar.yellow = this.yellow;
        rVar.f14059a = this.f2978a;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        if (!Intrinsics.areEqual(this.f2978a, textStringSimpleElement.f2978a) || !Intrinsics.areEqual(this.alpha, textStringSimpleElement.alpha) || !Intrinsics.areEqual(this.purple, textStringSimpleElement.purple) || !Intrinsics.areEqual(this.red, textStringSimpleElement.red)) {
            return false;
        }
        if (this.silver == textStringSimpleElement.silver && this.teal == textStringSimpleElement.teal && this.white == textStringSimpleElement.white && this.yellow == textStringSimpleElement.yellow) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int hashCode = (((this.red.hashCode() + AbstractC2327c.romeo(this.alpha.hashCode() * 31, 31, this.purple)) * 31) + this.silver) * 31;
        if (this.teal) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (((((hashCode + i4) * 31) + this.white) * 31) + this.yellow) * 31;
        InterfaceC0368v interfaceC0368v = this.f2978a;
        if (interfaceC0368v != null) {
            i5 = interfaceC0368v.hashCode();
        } else {
            i5 = 0;
        }
        return i10 + i5;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r3.alpha.bravo(r0.alpha) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    @Override // s0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void update(r rVar) {
        boolean z2;
        String str;
        String str2;
        int i4;
        int i5;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        j jVar;
        j jVar2;
        int i12;
        int i13;
        l lVar = (l) rVar;
        InterfaceC0368v interfaceC0368v = lVar.f14059a;
        InterfaceC0368v interfaceC0368v2 = this.f2978a;
        boolean areEqual = Intrinsics.areEqual(interfaceC0368v2, interfaceC0368v);
        lVar.f14059a = interfaceC0368v2;
        boolean z12 = false;
        boolean z13 = true;
        an anVar = this.purple;
        if (areEqual) {
            an anVar2 = lVar.purple;
            if (anVar == anVar2) {
                anVar.getClass();
            }
            z2 = false;
            str = lVar.alpha;
            str2 = this.alpha;
            if (!Intrinsics.areEqual(str, str2)) {
                lVar.alpha = str2;
                lVar.e = null;
                z12 = true;
            }
            boolean z14 = !lVar.purple.charlie(anVar);
            lVar.purple = anVar;
            i4 = lVar.yellow;
            i5 = this.yellow;
            if (i4 != i5) {
                lVar.yellow = i5;
                z14 = true;
            }
            i10 = lVar.white;
            i11 = this.white;
            if (i10 != i11) {
                lVar.white = i11;
                z14 = true;
            }
            z10 = lVar.teal;
            z11 = this.teal;
            if (z10 != z11) {
                lVar.teal = z11;
                z14 = true;
            }
            jVar = lVar.red;
            jVar2 = this.red;
            if (!Intrinsics.areEqual(jVar, jVar2)) {
                lVar.red = jVar2;
                z14 = true;
            }
            i12 = lVar.silver;
            i13 = this.silver;
            if (i12 != i13) {
                z13 = z14;
            } else {
                lVar.silver = i13;
            }
            if (!z12 || z13) {
                C3274e b2 = lVar.b();
                String str3 = lVar.alpha;
                an anVar3 = lVar.purple;
                j jVar3 = lVar.red;
                int i14 = lVar.silver;
                boolean z15 = lVar.teal;
                int i15 = lVar.white;
                int i16 = lVar.yellow;
                b2.alpha = str3;
                b2.bravo = anVar3;
                b2.charlie = jVar3;
                b2.delta = i14;
                b2.echo = z15;
                b2.foxtrot = i15;
                b2.golf = i16;
                b2.sierra = (b2.sierra << 2) | 2;
                b2.charlie();
            }
            if (!lVar.isAttached()) {
                if (z12 || (z2 && lVar.f14062d != null)) {
                    AbstractC2555o.golf(lVar).coral();
                }
                if (z12 || z13) {
                    AbstractC2555o.golf(lVar).blue();
                    AbstractC2557q.india(lVar);
                }
                if (z2) {
                    AbstractC2557q.india(lVar);
                    return;
                }
                return;
            }
            return;
        }
        z2 = true;
        str = lVar.alpha;
        str2 = this.alpha;
        if (!Intrinsics.areEqual(str, str2)) {
        }
        boolean z142 = !lVar.purple.charlie(anVar);
        lVar.purple = anVar;
        i4 = lVar.yellow;
        i5 = this.yellow;
        if (i4 != i5) {
        }
        i10 = lVar.white;
        i11 = this.white;
        if (i10 != i11) {
        }
        z10 = lVar.teal;
        z11 = this.teal;
        if (z10 != z11) {
        }
        jVar = lVar.red;
        jVar2 = this.red;
        if (!Intrinsics.areEqual(jVar, jVar2)) {
        }
        i12 = lVar.silver;
        i13 = this.silver;
        if (i12 != i13) {
        }
        if (!z12) {
        }
        C3274e b22 = lVar.b();
        String str32 = lVar.alpha;
        an anVar32 = lVar.purple;
        j jVar32 = lVar.red;
        int i142 = lVar.silver;
        boolean z152 = lVar.teal;
        int i152 = lVar.white;
        int i162 = lVar.yellow;
        b22.alpha = str32;
        b22.bravo = anVar32;
        b22.charlie = jVar32;
        b22.delta = i142;
        b22.echo = z152;
        b22.foxtrot = i152;
        b22.golf = i162;
        b22.sierra = (b22.sierra << 2) | 2;
        b22.charlie();
        if (!lVar.isAttached()) {
        }
    }
}
