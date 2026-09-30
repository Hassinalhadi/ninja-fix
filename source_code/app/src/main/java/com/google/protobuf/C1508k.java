package com.google.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1508k {
    public static final /* synthetic */ int charlie = 0;
    public final aw alpha = new aw(16);
    public boolean bravo;

    static {
        new C1508k(0);
    }

    public C1508k() {
    }

    public static void bravo(C1503f c1503f, T t5, int i4, Object obj) {
        if (t5 == T.teal) {
            c1503f.tango(i4, 3);
            ((AbstractC1513p) ((aj) obj)).romeo(c1503f);
            c1503f.tango(i4, 4);
            return;
        }
        c1503f.tango(i4, t5.purple);
        switch (t5.ordinal()) {
            case 0:
                c1503f.quebec(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c1503f.oscar(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                c1503f.whiskey(((Long) obj).longValue());
                return;
            case 3:
                c1503f.whiskey(((Long) obj).longValue());
                return;
            case 4:
                c1503f.romeo(((Integer) obj).intValue());
                return;
            case 5:
                c1503f.quebec(((Long) obj).longValue());
                return;
            case 6:
                c1503f.oscar(((Integer) obj).intValue());
                return;
            case 7:
                c1503f.kilo(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof C1502e) {
                    c1503f.mike((C1502e) obj);
                    return;
                } else {
                    c1503f.sierra((String) obj);
                    return;
                }
            case 9:
                ((AbstractC1513p) ((aj) obj)).romeo(c1503f);
                return;
            case 10:
                AbstractC1513p abstractC1513p = (AbstractC1513p) ((aj) obj);
                c1503f.uniform(abstractC1513p.hotel(null));
                abstractC1513p.romeo(c1503f);
                return;
            case 11:
                if (obj instanceof C1502e) {
                    c1503f.mike((C1502e) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c1503f.uniform(length);
                c1503f.lima(bArr, 0, length);
                return;
            case 12:
                c1503f.uniform(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof C8.i) {
                    c1503f.romeo(((C8.i) obj).alpha);
                    return;
                } else {
                    c1503f.romeo(((Integer) obj).intValue());
                    return;
                }
            case 14:
                c1503f.oscar(((Integer) obj).intValue());
                return;
            case 15:
                c1503f.quebec(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c1503f.uniform((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c1503f.whiskey((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void alpha() {
        aw awVar;
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.bravo) {
            return;
        }
        int i4 = 0;
        while (true) {
            awVar = this.alpha;
            if (i4 >= awVar.purple.size()) {
                break;
            }
            Map.Entry charlie2 = awVar.charlie(i4);
            if (charlie2.getValue() instanceof AbstractC1513p) {
                AbstractC1513p abstractC1513p = (AbstractC1513p) charlie2.getValue();
                abstractC1513p.getClass();
                ar arVar = ar.charlie;
                arVar.getClass();
                arVar.alpha(abstractC1513p.getClass()).alpha(abstractC1513p);
                abstractC1513p.november();
            }
            i4++;
        }
        if (!awVar.silver) {
            if (awVar.purple.size() <= 0) {
                Iterator it = awVar.delta().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    throw new ClassCastException();
                }
            } else {
                awVar.charlie(0).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!awVar.silver) {
            if (awVar.red.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(awVar.red);
            }
            awVar.red = unmodifiableMap;
            if (awVar.white.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(awVar.white);
            }
            awVar.white = unmodifiableMap2;
            awVar.silver = true;
        }
        this.bravo = true;
    }

    public final Object clone() {
        C1508k c1508k = new C1508k();
        aw awVar = this.alpha;
        if (awVar.purple.size() <= 0) {
            Iterator it = awVar.delta().iterator();
            if (!it.hasNext()) {
                return c1508k;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                entry.getValue();
                throw null;
            }
            throw new ClassCastException();
        }
        Map.Entry charlie2 = awVar.charlie(0);
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
        if (!(obj instanceof C1508k)) {
            return false;
        }
        return this.alpha.equals(((C1508k) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public C1508k(int i4) {
        alpha();
        alpha();
    }
}
