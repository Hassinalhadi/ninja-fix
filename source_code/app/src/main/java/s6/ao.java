package s6;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ao implements Map, Serializable {
    public final /* synthetic */ int alpha;
    public final transient Object[] purple;
    public transient AbstractCollection red;
    public transient AbstractCollection silver;
    public transient AbstractCollection teal;

    public /* synthetic */ ao(int i4, Object[] objArr) {
        this.alpha = i4;
        this.purple = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.alpha) {
            case 0:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            default:
                if (get(obj) != null) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.alpha) {
            case 0:
                an anVar = (an) this.teal;
                if (anVar == null) {
                    anVar = new an(1, this.purple);
                    this.teal = anVar;
                }
                return anVar.contains(obj);
            default:
                t6.u4 u4Var = (t6.u4) this.teal;
                if (u4Var == null) {
                    u4Var = new t6.u4(1, this.purple);
                    this.teal = u4Var;
                }
                return u4Var.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.alpha) {
            case 0:
                al alVar = (al) this.red;
                if (alVar == null) {
                    al alVar2 = new al(this, this.purple);
                    this.red = alVar2;
                    return alVar2;
                }
                return alVar;
            default:
                t6.s4 s4Var = (t6.s4) this.red;
                if (s4Var == null) {
                    t6.s4 s4Var2 = new t6.s4(this, this.purple);
                    this.red = s4Var2;
                    return s4Var2;
                }
                return s4Var;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.alpha) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return entrySet().equals(((Map) obj).entrySet());
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return entrySet().equals(((Map) obj).entrySet());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.alpha) {
            case 0:
                if (obj != null) {
                    Object[] objArr = this.purple;
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4);
                    if (obj4.equals(obj)) {
                        obj2 = objArr[1];
                        Objects.requireNonNull(obj2);
                        if (obj2 != null) {
                            return null;
                        }
                        return obj2;
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                }
            default:
                if (obj != null) {
                    Object[] objArr2 = this.purple;
                    Object obj5 = objArr2[0];
                    obj5.getClass();
                    if (obj5.equals(obj)) {
                        obj3 = objArr2[1];
                        obj3.getClass();
                        if (obj3 != null) {
                            return null;
                        }
                        return obj3;
                    }
                }
                obj3 = null;
                if (obj3 != null) {
                }
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                Object obj3 = get(obj);
                if (obj3 != null) {
                    return obj3;
                }
                return obj2;
            default:
                Object obj4 = get(obj);
                if (obj4 != null) {
                    return obj4;
                }
                return obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i4;
        switch (this.alpha) {
            case 0:
                al alVar = (al) this.red;
                if (alVar == null) {
                    alVar = new al(this, this.purple);
                    this.red = alVar;
                }
                return t6.W1.bravo(alVar);
            default:
                t6.s4 s4Var = (t6.s4) this.red;
                if (s4Var == null) {
                    s4Var = new t6.s4(this, this.purple);
                    this.red = s4Var;
                }
                int i5 = 0;
                for (Object obj : s4Var) {
                    if (obj != null) {
                        i4 = obj.hashCode();
                    } else {
                        i4 = 0;
                    }
                    i5 += i4;
                }
                return i5;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.alpha) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.alpha) {
            case 0:
                am amVar = (am) this.silver;
                if (amVar == null) {
                    am amVar2 = new am(this, new an(0, this.purple));
                    this.silver = amVar2;
                    return amVar2;
                }
                return amVar;
            default:
                t6.t4 t4Var = (t6.t4) this.silver;
                if (t4Var == null) {
                    t6.t4 t4Var2 = new t6.t4(this, new t6.u4(0, this.purple));
                    this.silver = t4Var2;
                    return t4Var2;
                }
                return t4Var;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.alpha) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    public final String toString() {
        switch (this.alpha) {
            case 0:
                boolean z2 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb2.append('{');
                Iterator it = ((al) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z2) {
                        sb2.append(", ");
                    }
                    sb2.append(entry.getKey());
                    sb2.append('=');
                    sb2.append(entry.getValue());
                    z2 = false;
                }
                sb2.append('}');
                return sb2.toString();
            default:
                boolean z10 = true;
                StringBuilder sb3 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb3.append('{');
                Iterator it2 = ((t6.s4) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z10) {
                        sb3.append(", ");
                    }
                    sb3.append(entry2.getKey());
                    sb3.append('=');
                    sb3.append(entry2.getValue());
                    z10 = false;
                }
                sb3.append('}');
                return sb3.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.alpha) {
            case 0:
                an anVar = (an) this.teal;
                if (anVar == null) {
                    an anVar2 = new an(1, this.purple);
                    this.teal = anVar2;
                    return anVar2;
                }
                return anVar;
            default:
                t6.u4 u4Var = (t6.u4) this.teal;
                if (u4Var == null) {
                    t6.u4 u4Var2 = new t6.u4(1, this.purple);
                    this.teal = u4Var2;
                    return u4Var2;
                }
                return u4Var;
        }
    }
}
