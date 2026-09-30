package androidx.compose.runtime;

import id.C1915c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ad extends S.ad implements D0 {
    public final Function0 purple;
    public final u0 red;
    public ac silver = new ac(S.n.kilo().golf());

    public ad(u0 u0Var, Function0 function0) {
        this.purple = function0;
        this.red = u0Var;
    }

    @Override // androidx.compose.runtime.D0
    public final Object getValue() {
        Function1 echo = S.n.kilo().echo();
        if (echo != null) {
            echo.invoke(this);
        }
        S.g kilo = S.n.kilo();
        return juliet((ac) S.n.juliet(this.silver, kilo), kilo, true, this.purple).foxtrot;
    }

    @Override // S.ac
    public final S.ae hotel() {
        return this.silver;
    }

    @Override // S.ac
    public final void india(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.silver = (ac) aeVar;
    }

    public final ac juliet(ac acVar, S.g gVar, boolean z2, Function0 function0) {
        J.e oscar;
        ac acVar2;
        u0 u0Var;
        int i4;
        if (acVar.charlie(this, gVar)) {
            if (z2) {
                oscar = C0564b.oscar();
                Object[] objArr = oscar.alpha;
                int i5 = oscar.red;
                for (int i10 = 0; i10 < i5; i10++) {
                    ((S.v) objArr[i10]).bravo();
                }
                try {
                    bv.ag agVar = acVar.echo;
                    C1915c c1915c = v0.alpha;
                    P.f fVar = (P.f) c1915c.mike();
                    if (fVar == null) {
                        fVar = new P.f();
                        c1915c.yankee(fVar);
                    }
                    int i11 = fVar.alpha;
                    Object[] objArr2 = agVar.bravo;
                    int[] iArr = agVar.charlie;
                    long[] jArr = agVar.alpha;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j5 = jArr[i12];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8;
                                int i14 = 8 - ((~(i12 - length)) >>> 31);
                                int i15 = 0;
                                while (i15 < i14) {
                                    if ((j5 & 255) < 128) {
                                        int i16 = (i12 << 3) + i15;
                                        i4 = i13;
                                        S.ac acVar3 = (S.ac) objArr2[i16];
                                        fVar.alpha = i11 + iArr[i16];
                                        Function1 echo = gVar.echo();
                                        if (echo != null) {
                                            echo.invoke(acVar3);
                                        }
                                    } else {
                                        i4 = i13;
                                    }
                                    j5 >>= i4;
                                    i15++;
                                    i13 = i4;
                                }
                                if (i14 != i13) {
                                    break;
                                }
                            }
                            if (i12 == length) {
                                break;
                            }
                            i12++;
                        }
                    }
                    fVar.alpha = i11;
                    Object[] objArr3 = oscar.alpha;
                    int i17 = oscar.red;
                    for (int i18 = 0; i18 < i17; i18++) {
                        ((S.v) objArr3[i18]).alpha();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return acVar;
        }
        bv.ag agVar2 = new bv.ag();
        C1915c c1915c2 = v0.alpha;
        P.f fVar2 = (P.f) c1915c2.mike();
        if (fVar2 == null) {
            fVar2 = new P.f();
            c1915c2.yankee(fVar2);
        }
        int i19 = fVar2.alpha;
        oscar = C0564b.oscar();
        Object[] objArr4 = oscar.alpha;
        int i20 = oscar.red;
        for (int i21 = 0; i21 < i20; i21++) {
            ((S.v) objArr4[i21]).bravo();
        }
        try {
            fVar2.alpha = i19 + 1;
            Object hotel = r6.u.hotel(function0, new R9.a(this, fVar2, agVar2, i19, 2));
            fVar2.alpha = i19;
            Object[] objArr5 = oscar.alpha;
            int i22 = oscar.red;
            for (int i23 = 0; i23 < i22; i23++) {
                ((S.v) objArr5[i23]).alpha();
            }
            Object obj = S.n.charlie;
            synchronized (obj) {
                try {
                    S.g kilo = S.n.kilo();
                    Object obj2 = acVar.foxtrot;
                    if (obj2 != ac.hotel && (u0Var = this.red) != null && u0Var.alpha(hotel, obj2)) {
                        acVar.echo = agVar2;
                        acVar.golf = acVar.delta(this, kilo);
                        acVar2 = acVar;
                    } else {
                        acVar2 = (ac) S.n.november(this.silver, this, kilo);
                        acVar2.echo = agVar2;
                        acVar2.golf = acVar2.delta(this, kilo);
                        acVar2.foxtrot = hotel;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            P.f fVar3 = (P.f) v0.alpha.mike();
            if (fVar3 != null && fVar3.alpha == 0) {
                S.n.kilo().mike();
                synchronized (obj) {
                    S.g kilo2 = S.n.kilo();
                    acVar2.charlie = kilo2.golf();
                    acVar2.delta = kilo2.hotel();
                }
                return acVar2;
            }
            return acVar2;
        } finally {
            Object[] objArr6 = oscar.alpha;
            int i24 = oscar.red;
            for (int i25 = 0; i25 < i24; i25++) {
                ((S.v) objArr6[i25]).alpha();
            }
        }
    }

    public final ac kilo() {
        S.g kilo = S.n.kilo();
        return juliet((ac) S.n.juliet(this.silver, kilo), kilo, false, this.purple);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        ac acVar = (ac) S.n.india(this.silver);
        if (acVar.charlie(this, S.n.kilo())) {
            str = String.valueOf(acVar.foxtrot);
        } else {
            str = "<Not calculated>";
        }
        sb2.append(str);
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
