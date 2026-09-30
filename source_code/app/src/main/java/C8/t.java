package C8;

import com.google.protobuf.AbstractC1511n;
import com.google.protobuf.AbstractC1513p;
import com.google.protobuf.ap;
import com.google.protobuf.at;

/* loaded from: classes2.dex */
public final class t extends AbstractC1513p implements u {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final t DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile ap PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private g applicationInfo_;
    private int bitField0_;
    private o gaugeMetric_;
    private r networkRequestMetric_;
    private aa traceMetric_;
    private ac transportInfo_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.p, C8.t] */
    static {
        ?? abstractC1513p = new AbstractC1513p();
        DEFAULT_INSTANCE = abstractC1513p;
        AbstractC1513p.papa(t.class, abstractC1513p);
    }

    public static void sierra(t tVar, g gVar) {
        tVar.getClass();
        tVar.applicationInfo_ = gVar;
        tVar.bitField0_ |= 1;
    }

    public static void tango(t tVar, o oVar) {
        tVar.getClass();
        tVar.gaugeMetric_ = oVar;
        tVar.bitField0_ |= 8;
    }

    public static void uniform(t tVar, aa aaVar) {
        tVar.getClass();
        tVar.traceMetric_ = aaVar;
        tVar.bitField0_ |= 2;
    }

    public static void victor(t tVar, r rVar) {
        tVar.getClass();
        tVar.networkRequestMetric_ = rVar;
        tVar.bitField0_ |= 4;
    }

    public static s yankee() {
        return (s) DEFAULT_INSTANCE.india();
    }

    @Override // C8.u
    public final boolean alpha() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // C8.u
    public final boolean bravo() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // C8.u
    public final aa charlie() {
        aa aaVar = this.traceMetric_;
        if (aaVar == null) {
            return aa.bronze();
        }
        return aaVar;
    }

    @Override // C8.u
    public final boolean delta() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // C8.u
    public final r echo() {
        r rVar = this.networkRequestMetric_;
        if (rVar == null) {
            return r.coral();
        }
        return rVar;
    }

    @Override // C8.u
    public final o foxtrot() {
        o oVar = this.gaugeMetric_;
        if (oVar == null) {
            return o.yankee();
        }
        return oVar;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.protobuf.ap, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC1513p
    public final Object juliet(int i4) {
        ap apVar;
        switch (av.q.mike(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new at(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new AbstractC1513p();
            case 4:
                return new AbstractC1511n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ap apVar2 = PARSER;
                if (apVar2 == null) {
                    synchronized (t.class) {
                        try {
                            ap apVar3 = PARSER;
                            apVar = apVar3;
                            if (apVar3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                apVar = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return apVar;
                }
                return apVar2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final g whiskey() {
        g gVar = this.applicationInfo_;
        if (gVar == null) {
            return g.yankee();
        }
        return gVar;
    }

    public final boolean xray() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }
}
