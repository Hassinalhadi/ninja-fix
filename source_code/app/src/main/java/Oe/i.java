package Oe;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i {
    public static final i charlie = new i(0);
    public final ab alpha = new ab(16);
    public boolean bravo;

    public i() {
    }

    public static int charlie(ap apVar, Object obj) {
        switch (apVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return F0.e.hotel(((Long) obj).longValue());
            case 3:
                return F0.e.hotel(((Long) obj).longValue());
            case 4:
                return F0.e.delta(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return F0.e.golf(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((v) obj).delta();
            case 10:
                return F0.e.foxtrot((v) obj);
            case 11:
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    return eVar.size() + F0.e.golf(eVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return F0.e.golf(bArr.length) + bArr.length;
            case 12:
                return F0.e.golf(((Integer) obj).intValue());
            case 13:
                if (obj instanceof p) {
                    return F0.e.delta(((p) obj).alpha());
                }
                return F0.e.delta(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return F0.e.golf((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return F0.e.hotel((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int delta(m mVar, Object obj) {
        ap apVar = mVar.purple;
        boolean z2 = mVar.red;
        int i4 = mVar.alpha;
        if (z2) {
            int i5 = 0;
            for (Object obj2 : (List) obj) {
                int india = F0.e.india(i4);
                if (apVar == ap.teal) {
                    india *= 2;
                }
                i5 += charlie(apVar, obj2) + india;
            }
            return i5;
        }
        int india2 = F0.e.india(i4);
        if (apVar == ap.teal) {
            india2 *= 2;
        }
        return charlie(apVar, obj) + india2;
    }

    public static boolean echo(Map.Entry entry) {
        m mVar = (m) entry.getKey();
        if (mVar.purple.alpha == aq.f1885c) {
            if (mVar.red) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((v) it.next()).alpha()) {
                        return false;
                    }
                }
                return true;
            }
            Object value = entry.getValue();
            if (value instanceof v) {
                if (!((v) value).alpha()) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    public static Object hotel(f fVar, ap apVar) {
        boolean z2 = true;
        switch (apVar.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(fVar.india()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(fVar.hotel()));
            case 2:
                return Long.valueOf(fVar.kilo());
            case 3:
                return Long.valueOf(fVar.kilo());
            case 4:
                return Integer.valueOf(fVar.juliet());
            case 5:
                return Long.valueOf(fVar.india());
            case 6:
                return Integer.valueOf(fVar.hotel());
            case 7:
                if (fVar.kilo() == 0) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 8:
                int juliet = fVar.juliet();
                int i4 = fVar.bravo;
                int i5 = fVar.delta;
                if (juliet <= i4 - i5 && juliet > 0) {
                    String str = new String(fVar.alpha, i5, juliet, "UTF-8");
                    fVar.delta += juliet;
                    return str;
                }
                if (juliet == 0) {
                    return "";
                }
                return new String(fVar.golf(juliet), "UTF-8");
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return fVar.delta();
            case 12:
                return Integer.valueOf(fVar.juliet());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(fVar.hotel());
            case 15:
                return Long.valueOf(fVar.india());
            case 16:
                int juliet2 = fVar.juliet();
                return Integer.valueOf((-(juliet2 & 1)) ^ (juliet2 >>> 1));
            case 17:
                long kilo = fVar.kilo();
                return Long.valueOf((-(kilo & 1)) ^ (kilo >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if ((r3 instanceof Oe.p) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void juliet(ap apVar, Object obj) {
        obj.getClass();
        boolean z2 = true;
        boolean z10 = false;
        switch (apVar.alpha) {
            case purple:
                z10 = obj instanceof Integer;
                break;
            case red:
                z10 = obj instanceof Long;
                break;
            case silver:
                z10 = obj instanceof Float;
                break;
            case teal:
                z10 = obj instanceof Double;
                break;
            case white:
                z10 = obj instanceof Boolean;
                break;
            case yellow:
                z10 = obj instanceof String;
                break;
            case f1883a:
                if (!(obj instanceof e)) {
                    break;
                }
                z10 = z2;
                break;
            case f1884b:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z10 = z2;
                break;
            case f1885c:
                z10 = obj instanceof v;
                break;
        }
        if (z10) {
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void kilo(F0.e eVar, ap apVar, Object obj) {
        switch (apVar.ordinal()) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                eVar.getClass();
                eVar.bronze(Double.doubleToRawLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                eVar.getClass();
                eVar.blue(Float.floatToRawIntBits(floatValue));
                return;
            case 2:
                eVar.crimson(((Long) obj).longValue());
                return;
            case 3:
                eVar.crimson(((Long) obj).longValue());
                return;
            case 4:
                eVar.yankee(((Integer) obj).intValue());
                return;
            case 5:
                eVar.bronze(((Long) obj).longValue());
                return;
            case 6:
                eVar.blue(((Integer) obj).intValue());
                return;
            case 7:
                eVar.azure(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                eVar.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                eVar.coral(bytes.length);
                eVar.black(bytes);
                return;
            case 9:
                eVar.getClass();
                ((v) obj).echo(eVar);
                return;
            case 10:
                eVar.amber((v) obj);
                return;
            case 11:
                if (obj instanceof e) {
                    e eVar2 = (e) obj;
                    eVar.getClass();
                    eVar.coral(eVar2.size());
                    eVar.beige(eVar2);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                eVar.getClass();
                eVar.coral(bArr.length);
                eVar.black(bArr);
                return;
            case 12:
                eVar.coral(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof p) {
                    eVar.yankee(((p) obj).alpha());
                    return;
                } else {
                    eVar.yankee(((Integer) obj).intValue());
                    return;
                }
            case 14:
                eVar.blue(((Integer) obj).intValue());
                return;
            case 15:
                eVar.bronze(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                eVar.coral((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                eVar.crimson((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void alpha(m mVar, Object obj) {
        List list;
        if (mVar.red) {
            juliet(mVar.purple, obj);
            ab abVar = this.alpha;
            Object obj2 = abVar.get(mVar);
            if (obj2 == null) {
                list = new ArrayList();
                abVar.put(mVar, list);
            } else {
                list = (List) obj2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: bravo, reason: merged with bridge method [inline-methods] */
    public final i clone() {
        ab abVar;
        i iVar = new i();
        int i4 = 0;
        while (true) {
            abVar = this.alpha;
            if (i4 >= abVar.purple.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) abVar.purple.get(i4);
            iVar.india((m) entry.getKey(), entry.getValue());
            i4++;
        }
        for (Map.Entry entry2 : abVar.charlie()) {
            iVar.india((m) entry2.getKey(), entry2.getValue());
        }
        return iVar;
    }

    public final void foxtrot() {
        Map unmodifiableMap;
        if (this.bravo) {
            return;
        }
        ab abVar = this.alpha;
        if (!abVar.silver) {
            for (int i4 = 0; i4 < abVar.purple.size(); i4++) {
                Map.Entry entry = (Map.Entry) abVar.purple.get(i4);
                if (((m) entry.getKey()).red) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : abVar.charlie()) {
                if (((m) entry2.getKey()).red) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!abVar.silver) {
            if (abVar.red.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(abVar.red);
            }
            abVar.red = unmodifiableMap;
            abVar.silver = true;
        }
        this.bravo = true;
    }

    public final void golf(Map.Entry entry) {
        m mVar = (m) entry.getKey();
        Object value = entry.getValue();
        boolean z2 = mVar.red;
        ab abVar = this.alpha;
        if (z2) {
            Object obj = abVar.get(mVar);
            if (obj == null) {
                obj = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                List list = (List) obj;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            abVar.put(mVar, obj);
            return;
        }
        if (mVar.purple.alpha == aq.f1885c) {
            Object obj3 = abVar.get(mVar);
            if (obj3 == null) {
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                abVar.put(mVar, value);
                return;
            }
            abVar.put(mVar, ((v) obj3).charlie().india((o) ((v) value)).golf());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        abVar.put(mVar, value);
    }

    public final void india(m mVar, Object obj) {
        boolean z2 = mVar.red;
        ap apVar = mVar.purple;
        if (z2) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    juliet(apVar, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            juliet(apVar, obj);
        }
        this.alpha.put(mVar, obj);
    }

    public i(int i4) {
        foxtrot();
    }
}
