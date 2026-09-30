package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class m extends AbstractMap implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Sb.k f8317b = new Sb.k(15);

    /* renamed from: a, reason: collision with root package name */
    public j f8318a;
    public final Comparator alpha;
    public final boolean purple;
    public l red;
    public int silver;
    public int teal;
    public final l white;
    public j yellow;

    public m(boolean z2) {
        Sb.k kVar = f8317b;
        this.silver = 0;
        this.teal = 0;
        this.alpha = kVar;
        this.purple = z2;
        this.white = new l(z2);
    }

    public final l alpha(Object obj, boolean z2) {
        int i4;
        l lVar;
        Comparable comparable;
        l lVar2;
        l lVar3 = this.red;
        Sb.k kVar = f8317b;
        Comparator comparator = this.alpha;
        if (lVar3 != null) {
            if (comparator == kVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = lVar3.white;
                if (comparable != null) {
                    i4 = comparable.compareTo(obj2);
                } else {
                    i4 = comparator.compare(obj, obj2);
                }
                if (i4 == 0) {
                    return lVar3;
                }
                if (i4 < 0) {
                    lVar2 = lVar3.purple;
                } else {
                    lVar2 = lVar3.red;
                }
                if (lVar2 == null) {
                    break;
                }
                lVar3 = lVar2;
            }
        } else {
            i4 = 0;
        }
        l lVar4 = lVar3;
        if (!z2) {
            return null;
        }
        l lVar5 = this.white;
        if (lVar4 == null) {
            if (comparator == kVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(this.purple, lVar4, obj, lVar5, lVar5.teal);
            this.red = lVar;
        } else {
            lVar = new l(this.purple, lVar4, obj, lVar5, lVar5.teal);
            if (i4 < 0) {
                lVar4.purple = lVar;
            } else {
                lVar4.red = lVar;
            }
            bravo(lVar4, true);
        }
        this.silver++;
        this.teal++;
        return lVar;
    }

    public final void bravo(l lVar, boolean z2) {
        int i4;
        int i5;
        int i10;
        int i11;
        while (lVar != null) {
            l lVar2 = lVar.purple;
            l lVar3 = lVar.red;
            int i12 = 0;
            if (lVar2 != null) {
                i4 = lVar2.f8316b;
            } else {
                i4 = 0;
            }
            if (lVar3 != null) {
                i5 = lVar3.f8316b;
            } else {
                i5 = 0;
            }
            int i13 = i4 - i5;
            if (i13 == -2) {
                l lVar4 = lVar3.purple;
                l lVar5 = lVar3.red;
                if (lVar5 != null) {
                    i11 = lVar5.f8316b;
                } else {
                    i11 = 0;
                }
                if (lVar4 != null) {
                    i12 = lVar4.f8316b;
                }
                int i14 = i12 - i11;
                if (i14 != -1 && (i14 != 0 || z2)) {
                    foxtrot(lVar3);
                    echo(lVar);
                } else {
                    echo(lVar);
                }
                if (z2) {
                    return;
                }
            } else if (i13 == 2) {
                l lVar6 = lVar2.purple;
                l lVar7 = lVar2.red;
                if (lVar7 != null) {
                    i10 = lVar7.f8316b;
                } else {
                    i10 = 0;
                }
                if (lVar6 != null) {
                    i12 = lVar6.f8316b;
                }
                int i15 = i12 - i10;
                if (i15 != 1 && (i15 != 0 || z2)) {
                    echo(lVar2);
                    foxtrot(lVar);
                } else {
                    foxtrot(lVar);
                }
                if (z2) {
                    return;
                }
            } else if (i13 == 0) {
                lVar.f8316b = i4 + 1;
                if (z2) {
                    return;
                }
            } else {
                lVar.f8316b = Math.max(i4, i5) + 1;
                if (!z2) {
                    return;
                }
            }
            lVar = lVar.alpha;
        }
    }

    public final void charlie(l lVar, boolean z2) {
        l lVar2;
        l lVar3;
        int i4;
        if (z2) {
            l lVar4 = lVar.teal;
            lVar4.silver = lVar.silver;
            lVar.silver.teal = lVar4;
        }
        l lVar5 = lVar.purple;
        l lVar6 = lVar.red;
        l lVar7 = lVar.alpha;
        int i5 = 0;
        if (lVar5 != null && lVar6 != null) {
            if (lVar5.f8316b > lVar6.f8316b) {
                l lVar8 = lVar5.red;
                while (true) {
                    l lVar9 = lVar8;
                    lVar3 = lVar5;
                    lVar5 = lVar9;
                    if (lVar5 == null) {
                        break;
                    } else {
                        lVar8 = lVar5.red;
                    }
                }
            } else {
                l lVar10 = lVar6.purple;
                while (true) {
                    lVar2 = lVar6;
                    lVar6 = lVar10;
                    if (lVar6 == null) {
                        break;
                    } else {
                        lVar10 = lVar6.purple;
                    }
                }
                lVar3 = lVar2;
            }
            charlie(lVar3, false);
            l lVar11 = lVar.purple;
            if (lVar11 != null) {
                i4 = lVar11.f8316b;
                lVar3.purple = lVar11;
                lVar11.alpha = lVar3;
                lVar.purple = null;
            } else {
                i4 = 0;
            }
            l lVar12 = lVar.red;
            if (lVar12 != null) {
                i5 = lVar12.f8316b;
                lVar3.red = lVar12;
                lVar12.alpha = lVar3;
                lVar.red = null;
            }
            lVar3.f8316b = Math.max(i4, i5) + 1;
            delta(lVar, lVar3);
            return;
        }
        if (lVar5 != null) {
            delta(lVar, lVar5);
            lVar.purple = null;
        } else if (lVar6 != null) {
            delta(lVar, lVar6);
            lVar.red = null;
        } else {
            delta(lVar, null);
        }
        bravo(lVar7, false);
        this.silver--;
        this.teal++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.red = null;
        this.silver = 0;
        this.teal++;
        l lVar = this.white;
        lVar.teal = lVar;
        lVar.silver = lVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        l lVar = null;
        if (obj != null) {
            try {
                lVar = alpha(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (lVar == null) {
            return false;
        }
        return true;
    }

    public final void delta(l lVar, l lVar2) {
        l lVar3 = lVar.alpha;
        lVar.alpha = null;
        if (lVar2 != null) {
            lVar2.alpha = lVar3;
        }
        if (lVar3 != null) {
            if (lVar3.purple == lVar) {
                lVar3.purple = lVar2;
                return;
            } else {
                lVar3.red = lVar2;
                return;
            }
        }
        this.red = lVar2;
    }

    public final void echo(l lVar) {
        int i4;
        int i5;
        l lVar2 = lVar.purple;
        l lVar3 = lVar.red;
        l lVar4 = lVar3.purple;
        l lVar5 = lVar3.red;
        lVar.red = lVar4;
        if (lVar4 != null) {
            lVar4.alpha = lVar;
        }
        delta(lVar, lVar3);
        lVar3.purple = lVar;
        lVar.alpha = lVar3;
        int i10 = 0;
        if (lVar2 != null) {
            i4 = lVar2.f8316b;
        } else {
            i4 = 0;
        }
        if (lVar4 != null) {
            i5 = lVar4.f8316b;
        } else {
            i5 = 0;
        }
        int max = Math.max(i4, i5) + 1;
        lVar.f8316b = max;
        if (lVar5 != null) {
            i10 = lVar5.f8316b;
        }
        lVar3.f8316b = Math.max(max, i10) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        j jVar = this.yellow;
        if (jVar == null) {
            j jVar2 = new j(this, 0);
            this.yellow = jVar2;
            return jVar2;
        }
        return jVar;
    }

    public final void foxtrot(l lVar) {
        int i4;
        int i5;
        l lVar2 = lVar.purple;
        l lVar3 = lVar.red;
        l lVar4 = lVar2.purple;
        l lVar5 = lVar2.red;
        lVar.purple = lVar5;
        if (lVar5 != null) {
            lVar5.alpha = lVar;
        }
        delta(lVar, lVar2);
        lVar2.red = lVar;
        lVar.alpha = lVar2;
        int i10 = 0;
        if (lVar3 != null) {
            i4 = lVar3.f8316b;
        } else {
            i4 = 0;
        }
        if (lVar5 != null) {
            i5 = lVar5.f8316b;
        } else {
            i5 = 0;
        }
        int max = Math.max(i4, i5) + 1;
        lVar.f8316b = max;
        if (lVar4 != null) {
            i10 = lVar4.f8316b;
        }
        lVar2.f8316b = Math.max(max, i10) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        l lVar;
        if (obj != null) {
            try {
                lVar = alpha(obj, false);
            } catch (ClassCastException unused) {
            }
            if (lVar != null) {
                return null;
            }
            return lVar.f8315a;
        }
        lVar = null;
        if (lVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        j jVar = this.f8318a;
        if (jVar == null) {
            j jVar2 = new j(this, 1);
            this.f8318a = jVar2;
            return jVar2;
        }
        return jVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.purple) {
                throw new NullPointerException("value == null");
            }
            l alpha = alpha(obj, true);
            Object obj3 = alpha.f8315a;
            alpha.f8315a = obj2;
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
        l lVar;
        if (obj != null) {
            try {
                lVar = alpha(obj, false);
            } catch (ClassCastException unused) {
            }
            if (lVar != null) {
                charlie(lVar, true);
            }
            if (lVar != null) {
                return null;
            }
            return lVar.f8315a;
        }
        lVar = null;
        if (lVar != null) {
        }
        if (lVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.silver;
    }
}
