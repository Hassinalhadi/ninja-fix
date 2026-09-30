package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n {
    public static final /* synthetic */ int charlie = 0;
    public final au alpha = au.foxtrot();
    public boolean bravo;

    static {
        new n(0);
    }

    public n() {
    }

    public static void bravo(C0602i c0602i, K k6, int i4, Object obj) {
        if (k6 == K.silver) {
            c0602i.beige(i4, 3);
            ((s) ((ah) obj)).kilo(c0602i);
            c0602i.beige(i4, 4);
            return;
        }
        c0602i.beige(i4, k6.purple);
        switch (k6.ordinal()) {
            case 0:
                c0602i.whiskey(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c0602i.uniform(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                c0602i.coral(((Long) obj).longValue());
                return;
            case 3:
                c0602i.coral(((Long) obj).longValue());
                return;
            case 4:
                c0602i.yankee(((Integer) obj).intValue());
                return;
            case 5:
                c0602i.whiskey(((Long) obj).longValue());
                return;
            case 6:
                c0602i.uniform(((Integer) obj).intValue());
                return;
            case 7:
                c0602i.oscar(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof C0599f) {
                    c0602i.sierra((C0599f) obj);
                    return;
                } else {
                    c0602i.azure((String) obj);
                    return;
                }
            case 9:
                ((s) ((ah) obj)).kilo(c0602i);
                return;
            case 10:
                ah ahVar = (ah) obj;
                c0602i.getClass();
                c0602i.blue(((s) ahVar).alpha(null));
                ((s) ahVar).kilo(c0602i);
                return;
            case 11:
                if (obj instanceof C0599f) {
                    c0602i.sierra((C0599f) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c0602i.blue(length);
                c0602i.papa(bArr, 0, length);
                return;
            case 12:
                c0602i.blue(((Integer) obj).intValue());
                return;
            case 13:
                c0602i.yankee(((Integer) obj).intValue());
                return;
            case 14:
                c0602i.uniform(((Integer) obj).intValue());
                return;
            case 15:
                c0602i.whiskey(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0602i.blue((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0602i.coral((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void alpha() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.bravo) {
            return;
        }
        au auVar = this.alpha;
        int size = auVar.alpha.size();
        for (int i4 = 0; i4 < size; i4++) {
            Map.Entry charlie2 = auVar.charlie(i4);
            if (charlie2.getValue() instanceof s) {
                s sVar = (s) charlie2.getValue();
                sVar.getClass();
                ap apVar = ap.charlie;
                apVar.getClass();
                apVar.alpha(sVar.getClass()).alpha(sVar);
                sVar.golf();
            }
        }
        if (!auVar.red) {
            if (auVar.alpha.size() <= 0) {
                Iterator it = auVar.delta().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    throw new ClassCastException();
                }
            } else {
                auVar.charlie(0).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!auVar.red) {
            if (auVar.purple.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(auVar.purple);
            }
            auVar.purple = unmodifiableMap;
            if (auVar.teal.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(auVar.teal);
            }
            auVar.teal = unmodifiableMap2;
            auVar.red = true;
        }
        this.bravo = true;
    }

    public final Object clone() {
        n nVar = new n();
        au auVar = this.alpha;
        if (auVar.alpha.size() <= 0) {
            Iterator it = auVar.delta().iterator();
            if (!it.hasNext()) {
                return nVar;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                entry.getValue();
                throw null;
            }
            throw new ClassCastException();
        }
        Map.Entry charlie2 = auVar.charlie(0);
        if (charlie2.getKey() == null) {
            charlie2.getValue();
            throw null;
        }
        throw new ClassCastException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        return this.alpha.equals(((n) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public n(int i4) {
        alpha();
        alpha();
    }
}
