package com.squareup.moshi;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class af extends AbstractMap implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Sb.k f11960b = new Sb.k(16);

    /* renamed from: a, reason: collision with root package name */
    public ad f11961a;
    public ad yellow;
    public int silver = 0;
    public int teal = 0;
    public final Comparator alpha = f11960b;
    public final ae red = new ae();
    public ae[] purple = new ae[16];
    public int white = 12;

    public final ae alpha(Object obj, boolean z2) {
        int i4;
        ae aeVar;
        boolean z10;
        ae aeVar2;
        ae aeVar3;
        ae aeVar4;
        ae aeVar5;
        ae aeVar6;
        Comparable comparable;
        ae aeVar7;
        ae[] aeVarArr = this.purple;
        int hashCode = obj.hashCode();
        int i5 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i10 = ((i5 >>> 7) ^ i5) ^ (i5 >>> 4);
        boolean z11 = true;
        int length = i10 & (aeVarArr.length - 1);
        ae aeVar8 = aeVarArr[length];
        Sb.k kVar = f11960b;
        ae aeVar9 = null;
        Comparator comparator = this.alpha;
        if (aeVar8 != null) {
            if (comparator == kVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = aeVar8.white;
                if (comparable != null) {
                    i4 = comparable.compareTo(obj2);
                } else {
                    i4 = comparator.compare(obj, obj2);
                }
                if (i4 == 0) {
                    return aeVar8;
                }
                if (i4 < 0) {
                    aeVar7 = aeVar8.purple;
                } else {
                    aeVar7 = aeVar8.red;
                }
                if (aeVar7 == null) {
                    break;
                }
                aeVar8 = aeVar7;
            }
        } else {
            i4 = 0;
        }
        if (!z2) {
            return null;
        }
        ae aeVar10 = this.red;
        if (aeVar8 == null) {
            if (comparator == kVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            aeVar = new ae(aeVar8, obj, i10, aeVar10, aeVar10.teal);
            aeVarArr[length] = aeVar;
        } else {
            ae aeVar11 = aeVar8;
            aeVar = new ae(aeVar11, obj, i10, aeVar10, aeVar10.teal);
            if (i4 < 0) {
                aeVar11.purple = aeVar;
            } else {
                aeVar11.red = aeVar;
            }
            bravo(aeVar11, true);
        }
        int i11 = this.silver;
        this.silver = i11 + 1;
        if (i11 > this.white) {
            ae[] aeVarArr2 = this.purple;
            int length2 = aeVarArr2.length;
            int i12 = length2 * 2;
            ae[] aeVarArr3 = new ae[i12];
            I.al alVar = new I.al(2);
            I.al alVar2 = new I.al(2);
            int i13 = 0;
            while (i13 < length2) {
                ae aeVar12 = aeVarArr2[i13];
                if (aeVar12 == null) {
                    z10 = z11;
                    aeVar3 = aeVar9;
                } else {
                    ae aeVar13 = aeVar9;
                    for (ae aeVar14 = aeVar12; aeVar14 != null; aeVar14 = aeVar14.purple) {
                        aeVar14.alpha = aeVar13;
                        aeVar13 = aeVar14;
                    }
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (aeVar13 == null) {
                            ae aeVar15 = aeVar13;
                            aeVar13 = aeVar9;
                            aeVar2 = aeVar15;
                            z10 = z11;
                        } else {
                            z10 = z11;
                            ae aeVar16 = aeVar13.alpha;
                            aeVar13.alpha = aeVar9;
                            ae aeVar17 = aeVar13.red;
                            while (true) {
                                ae aeVar18 = aeVar17;
                                aeVar2 = aeVar16;
                                aeVar16 = aeVar18;
                                if (aeVar16 == null) {
                                    break;
                                }
                                aeVar16.alpha = aeVar2;
                                aeVar17 = aeVar16.purple;
                            }
                        }
                        if (aeVar13 == null) {
                            break;
                        }
                        if ((aeVar13.yellow & length2) == 0) {
                            i14++;
                        } else {
                            i15++;
                        }
                        aeVar13 = aeVar2;
                        z11 = z10;
                        aeVar9 = null;
                    }
                    alVar.bravo = ((Integer.highestOneBit(i14) * 2) - 1) - i14;
                    alVar.delta = 0;
                    alVar.charlie = 0;
                    aeVar3 = null;
                    alVar.echo = null;
                    alVar2.bravo = ((Integer.highestOneBit(i15) * 2) - 1) - i15;
                    alVar2.delta = 0;
                    alVar2.charlie = 0;
                    alVar2.echo = null;
                    ae aeVar19 = null;
                    while (aeVar12 != null) {
                        aeVar12.alpha = aeVar19;
                        ae aeVar20 = aeVar12;
                        aeVar12 = aeVar12.purple;
                        aeVar19 = aeVar20;
                    }
                    while (true) {
                        if (aeVar19 == null) {
                            aeVar4 = aeVar19;
                            aeVar19 = null;
                        } else {
                            ae aeVar21 = aeVar19.alpha;
                            aeVar19.alpha = null;
                            ae aeVar22 = aeVar19.red;
                            while (true) {
                                ae aeVar23 = aeVar22;
                                aeVar4 = aeVar21;
                                aeVar21 = aeVar23;
                                if (aeVar21 == null) {
                                    break;
                                }
                                aeVar21.alpha = aeVar4;
                                aeVar22 = aeVar21.purple;
                            }
                        }
                        if (aeVar19 == null) {
                            break;
                        }
                        if ((aeVar19.yellow & length2) == 0) {
                            alVar.alpha(aeVar19);
                        } else {
                            alVar2.alpha(aeVar19);
                        }
                        aeVar19 = aeVar4;
                    }
                    if (i14 > 0) {
                        aeVar5 = (ae) alVar.echo;
                        if (aeVar5.alpha != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        aeVar5 = null;
                    }
                    aeVarArr3[i13] = aeVar5;
                    int i16 = i13 + length2;
                    if (i15 > 0) {
                        aeVar6 = (ae) alVar2.echo;
                        if (aeVar6.alpha != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        aeVar6 = null;
                    }
                    aeVarArr3[i16] = aeVar6;
                }
                i13++;
                aeVar9 = aeVar3;
                z11 = z10;
            }
            this.purple = aeVarArr3;
            this.white = (i12 / 4) + (i12 / 2);
        }
        this.teal++;
        return aeVar;
    }

    public final void bravo(ae aeVar, boolean z2) {
        int i4;
        int i5;
        int i10;
        int i11;
        while (aeVar != null) {
            ae aeVar2 = aeVar.purple;
            ae aeVar3 = aeVar.red;
            int i12 = 0;
            if (aeVar2 != null) {
                i4 = aeVar2.f11959b;
            } else {
                i4 = 0;
            }
            if (aeVar3 != null) {
                i5 = aeVar3.f11959b;
            } else {
                i5 = 0;
            }
            int i13 = i4 - i5;
            if (i13 == -2) {
                ae aeVar4 = aeVar3.purple;
                ae aeVar5 = aeVar3.red;
                if (aeVar5 != null) {
                    i11 = aeVar5.f11959b;
                } else {
                    i11 = 0;
                }
                if (aeVar4 != null) {
                    i12 = aeVar4.f11959b;
                }
                int i14 = i12 - i11;
                if (i14 != -1 && (i14 != 0 || z2)) {
                    foxtrot(aeVar3);
                }
                echo(aeVar);
                if (z2) {
                    return;
                }
            } else if (i13 == 2) {
                ae aeVar6 = aeVar2.purple;
                ae aeVar7 = aeVar2.red;
                if (aeVar7 != null) {
                    i10 = aeVar7.f11959b;
                } else {
                    i10 = 0;
                }
                if (aeVar6 != null) {
                    i12 = aeVar6.f11959b;
                }
                int i15 = i12 - i10;
                if (i15 != 1 && (i15 != 0 || z2)) {
                    echo(aeVar2);
                }
                foxtrot(aeVar);
                if (z2) {
                    return;
                }
            } else if (i13 == 0) {
                aeVar.f11959b = i4 + 1;
                if (z2) {
                    return;
                }
            } else {
                aeVar.f11959b = Math.max(i4, i5) + 1;
                if (!z2) {
                    return;
                }
            }
            aeVar = aeVar.alpha;
        }
    }

    public final void charlie(ae aeVar, boolean z2) {
        ae aeVar2;
        ae aeVar3;
        int i4;
        if (z2) {
            ae aeVar4 = aeVar.teal;
            aeVar4.silver = aeVar.silver;
            aeVar.silver.teal = aeVar4;
            aeVar.teal = null;
            aeVar.silver = null;
        }
        ae aeVar5 = aeVar.purple;
        ae aeVar6 = aeVar.red;
        ae aeVar7 = aeVar.alpha;
        int i5 = 0;
        if (aeVar5 != null && aeVar6 != null) {
            if (aeVar5.f11959b > aeVar6.f11959b) {
                ae aeVar8 = aeVar5.red;
                while (true) {
                    ae aeVar9 = aeVar8;
                    aeVar3 = aeVar5;
                    aeVar5 = aeVar9;
                    if (aeVar5 == null) {
                        break;
                    } else {
                        aeVar8 = aeVar5.red;
                    }
                }
            } else {
                ae aeVar10 = aeVar6.purple;
                while (true) {
                    aeVar2 = aeVar6;
                    aeVar6 = aeVar10;
                    if (aeVar6 == null) {
                        break;
                    } else {
                        aeVar10 = aeVar6.purple;
                    }
                }
                aeVar3 = aeVar2;
            }
            charlie(aeVar3, false);
            ae aeVar11 = aeVar.purple;
            if (aeVar11 != null) {
                i4 = aeVar11.f11959b;
                aeVar3.purple = aeVar11;
                aeVar11.alpha = aeVar3;
                aeVar.purple = null;
            } else {
                i4 = 0;
            }
            ae aeVar12 = aeVar.red;
            if (aeVar12 != null) {
                i5 = aeVar12.f11959b;
                aeVar3.red = aeVar12;
                aeVar12.alpha = aeVar3;
                aeVar.red = null;
            }
            aeVar3.f11959b = Math.max(i4, i5) + 1;
            delta(aeVar, aeVar3);
            return;
        }
        if (aeVar5 != null) {
            delta(aeVar, aeVar5);
            aeVar.purple = null;
        } else if (aeVar6 != null) {
            delta(aeVar, aeVar6);
            aeVar.red = null;
        } else {
            delta(aeVar, null);
        }
        bravo(aeVar7, false);
        this.silver--;
        this.teal++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.purple, (Object) null);
        this.silver = 0;
        this.teal++;
        ae aeVar = this.red;
        ae aeVar2 = aeVar.silver;
        while (aeVar2 != aeVar) {
            ae aeVar3 = aeVar2.silver;
            aeVar2.teal = null;
            aeVar2.silver = null;
            aeVar2 = aeVar3;
        }
        aeVar.teal = aeVar;
        aeVar.silver = aeVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        ae aeVar = null;
        if (obj != null) {
            try {
                aeVar = alpha(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (aeVar == null) {
            return false;
        }
        return true;
    }

    public final void delta(ae aeVar, ae aeVar2) {
        ae aeVar3 = aeVar.alpha;
        aeVar.alpha = null;
        if (aeVar2 != null) {
            aeVar2.alpha = aeVar3;
        }
        if (aeVar3 != null) {
            if (aeVar3.purple == aeVar) {
                aeVar3.purple = aeVar2;
                return;
            } else {
                aeVar3.red = aeVar2;
                return;
            }
        }
        this.purple[aeVar.yellow & (r0.length - 1)] = aeVar2;
    }

    public final void echo(ae aeVar) {
        int i4;
        int i5;
        ae aeVar2 = aeVar.purple;
        ae aeVar3 = aeVar.red;
        ae aeVar4 = aeVar3.purple;
        ae aeVar5 = aeVar3.red;
        aeVar.red = aeVar4;
        if (aeVar4 != null) {
            aeVar4.alpha = aeVar;
        }
        delta(aeVar, aeVar3);
        aeVar3.purple = aeVar;
        aeVar.alpha = aeVar3;
        int i10 = 0;
        if (aeVar2 != null) {
            i4 = aeVar2.f11959b;
        } else {
            i4 = 0;
        }
        if (aeVar4 != null) {
            i5 = aeVar4.f11959b;
        } else {
            i5 = 0;
        }
        int max = Math.max(i4, i5) + 1;
        aeVar.f11959b = max;
        if (aeVar5 != null) {
            i10 = aeVar5.f11959b;
        }
        aeVar3.f11959b = Math.max(max, i10) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        ad adVar = this.yellow;
        if (adVar != null) {
            return adVar;
        }
        ad adVar2 = new ad(this, 0);
        this.yellow = adVar2;
        return adVar2;
    }

    public final void foxtrot(ae aeVar) {
        int i4;
        int i5;
        ae aeVar2 = aeVar.purple;
        ae aeVar3 = aeVar.red;
        ae aeVar4 = aeVar2.purple;
        ae aeVar5 = aeVar2.red;
        aeVar.purple = aeVar5;
        if (aeVar5 != null) {
            aeVar5.alpha = aeVar;
        }
        delta(aeVar, aeVar2);
        aeVar2.red = aeVar;
        aeVar.alpha = aeVar2;
        int i10 = 0;
        if (aeVar3 != null) {
            i4 = aeVar3.f11959b;
        } else {
            i4 = 0;
        }
        if (aeVar5 != null) {
            i5 = aeVar5.f11959b;
        } else {
            i5 = 0;
        }
        int max = Math.max(i4, i5) + 1;
        aeVar.f11959b = max;
        if (aeVar4 != null) {
            i10 = aeVar4.f11959b;
        }
        aeVar2.f11959b = Math.max(max, i10) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        ae aeVar;
        if (obj != null) {
            try {
                aeVar = alpha(obj, false);
            } catch (ClassCastException unused) {
            }
            if (aeVar != null) {
                return null;
            }
            return aeVar.f11958a;
        }
        aeVar = null;
        if (aeVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        ad adVar = this.f11961a;
        if (adVar != null) {
            return adVar;
        }
        ad adVar2 = new ad(this, 1);
        this.f11961a = adVar2;
        return adVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            ae alpha = alpha(obj, true);
            Object obj3 = alpha.f11958a;
            alpha.f11958a = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        ae aeVar;
        if (obj != null) {
            try {
                aeVar = alpha(obj, false);
            } catch (ClassCastException unused) {
            }
            if (aeVar != null) {
                charlie(aeVar, true);
            }
            if (aeVar != null) {
                return null;
            }
            return aeVar.f11958a;
        }
        aeVar = null;
        if (aeVar != null) {
        }
        if (aeVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.silver;
    }
}
