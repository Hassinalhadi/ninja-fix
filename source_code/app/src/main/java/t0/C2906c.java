package t0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2906c extends K3.b {
    public static C2906c teal;
    public static final O0.j white = O0.j.purple;
    public static final O0.j yellow = O0.j.alpha;
    public D0.ak silver;

    @Override // K3.b
    public final int[] foxtrot(int i4) {
        int i5;
        if (november().length() <= 0 || i4 >= november().length()) {
            return null;
        }
        O0.j jVar = white;
        if (i4 < 0) {
            D0.ak akVar = this.silver;
            if (akVar != null) {
                i5 = akVar.bravo.delta(0);
            } else {
                Intrinsics.lima("layoutResult");
                throw null;
            }
        } else {
            D0.ak akVar2 = this.silver;
            if (akVar2 != null) {
                int delta = akVar2.bravo.delta(i4);
                if (zulu(delta, jVar) == i4) {
                    i5 = delta;
                } else {
                    i5 = delta + 1;
                }
            } else {
                Intrinsics.lima("layoutResult");
                throw null;
            }
        }
        D0.ak akVar3 = this.silver;
        if (akVar3 != null) {
            if (i5 >= akVar3.bravo.foxtrot) {
                return null;
            }
            return juliet(zulu(i5, jVar), zulu(i5, yellow) + 1);
        }
        Intrinsics.lima("layoutResult");
        throw null;
    }

    @Override // K3.b
    public final int[] tango(int i4) {
        int i5;
        if (november().length() <= 0 || i4 <= 0) {
            return null;
        }
        int length = november().length();
        O0.j jVar = yellow;
        if (i4 > length) {
            D0.ak akVar = this.silver;
            if (akVar != null) {
                i5 = akVar.bravo.delta(november().length());
            } else {
                Intrinsics.lima("layoutResult");
                throw null;
            }
        } else {
            D0.ak akVar2 = this.silver;
            if (akVar2 != null) {
                int delta = akVar2.bravo.delta(i4);
                if (zulu(delta, jVar) + 1 == i4) {
                    i5 = delta;
                } else {
                    i5 = delta - 1;
                }
            } else {
                Intrinsics.lima("layoutResult");
                throw null;
            }
        }
        if (i5 < 0) {
            return null;
        }
        return juliet(zulu(i5, white), zulu(i5, jVar) + 1);
    }

    public final int zulu(int i4, O0.j jVar) {
        D0.ak akVar = this.silver;
        if (akVar != null) {
            int foxtrot = akVar.foxtrot(i4);
            D0.ak akVar2 = this.silver;
            if (akVar2 != null) {
                if (jVar != akVar2.golf(foxtrot)) {
                    D0.ak akVar3 = this.silver;
                    if (akVar3 != null) {
                        return akVar3.foxtrot(i4);
                    }
                    Intrinsics.lima("layoutResult");
                    throw null;
                }
                if (this.silver != null) {
                    return r6.bravo.charlie(i4, false) - 1;
                }
                Intrinsics.lima("layoutResult");
                throw null;
            }
            Intrinsics.lima("layoutResult");
            throw null;
        }
        Intrinsics.lima("layoutResult");
        throw null;
    }
}
