package t0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2908d extends K3.b {
    public static C2908d white;
    public D0.ak silver;
    public A0.s teal;
    public static final O0.j yellow = O0.j.purple;

    /* renamed from: a, reason: collision with root package name */
    public static final O0.j f13846a = O0.j.alpha;

    @Override // K3.b
    public final int[] foxtrot(int i4) {
        int i5;
        if (november().length() <= 0 || i4 >= november().length()) {
            return null;
        }
        try {
            A0.s sVar = this.teal;
            if (sVar != null) {
                Z.c golf = sVar.golf();
                int round = Math.round(golf.delta - golf.bravo);
                if (i4 <= 0) {
                    i4 = 0;
                }
                D0.ak akVar = this.silver;
                if (akVar != null) {
                    int delta = akVar.bravo.delta(i4);
                    D0.ak akVar2 = this.silver;
                    if (akVar2 != null) {
                        float foxtrot = akVar2.bravo.foxtrot(delta) + round;
                        D0.ak akVar3 = this.silver;
                        if (akVar3 != null) {
                            if (akVar3 != null) {
                                if (foxtrot < akVar3.bravo.foxtrot(r0.foxtrot - 1)) {
                                    D0.ak akVar4 = this.silver;
                                    if (akVar4 != null) {
                                        i5 = akVar4.bravo.echo(foxtrot);
                                    } else {
                                        Intrinsics.lima("layoutResult");
                                        throw null;
                                    }
                                } else {
                                    D0.ak akVar5 = this.silver;
                                    if (akVar5 != null) {
                                        i5 = akVar5.bravo.foxtrot;
                                    } else {
                                        Intrinsics.lima("layoutResult");
                                        throw null;
                                    }
                                }
                                return juliet(i4, zulu(i5 - 1, f13846a) + 1);
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
                Intrinsics.lima("layoutResult");
                throw null;
            }
            Intrinsics.lima("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // K3.b
    public final int[] tango(int i4) {
        int i5;
        if (november().length() <= 0 || i4 <= 0) {
            return null;
        }
        try {
            A0.s sVar = this.teal;
            if (sVar != null) {
                Z.c golf = sVar.golf();
                int round = Math.round(golf.delta - golf.bravo);
                int length = november().length();
                if (length <= i4) {
                    i4 = length;
                }
                D0.ak akVar = this.silver;
                if (akVar != null) {
                    int delta = akVar.bravo.delta(i4);
                    D0.ak akVar2 = this.silver;
                    if (akVar2 != null) {
                        float foxtrot = akVar2.bravo.foxtrot(delta) - round;
                        if (foxtrot > 0.0f) {
                            D0.ak akVar3 = this.silver;
                            if (akVar3 != null) {
                                i5 = akVar3.bravo.echo(foxtrot);
                            } else {
                                Intrinsics.lima("layoutResult");
                                throw null;
                            }
                        } else {
                            i5 = 0;
                        }
                        if (i4 == november().length() && i5 < delta) {
                            i5++;
                        }
                        return juliet(zulu(i5, yellow), i4);
                    }
                    Intrinsics.lima("layoutResult");
                    throw null;
                }
                Intrinsics.lima("layoutResult");
                throw null;
            }
            Intrinsics.lima("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
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
