package C8;

import com.google.protobuf.AbstractC1499b;
import com.google.protobuf.AbstractC1511n;
import com.google.protobuf.AbstractC1513p;
import com.google.protobuf.InterfaceC1516t;
import com.google.protobuf.ap;
import com.google.protobuf.as;
import com.google.protobuf.at;

/* loaded from: classes2.dex */
public final class o extends AbstractC1513p {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final o DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile ap PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private InterfaceC1516t androidMemoryReadings_;
    private int bitField0_;
    private InterfaceC1516t cpuMetricReadings_;
    private m gaugeMetadata_;
    private String sessionId_ = "";

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        AbstractC1513p.papa(o.class, oVar);
    }

    public o() {
        as asVar = as.silver;
        this.cpuMetricReadings_ = asVar;
        this.androidMemoryReadings_ = asVar;
    }

    public static n beige() {
        return (n) DEFAULT_INSTANCE.india();
    }

    public static void sierra(o oVar, String str) {
        oVar.getClass();
        str.getClass();
        oVar.bitField0_ |= 1;
        oVar.sessionId_ = str;
    }

    public static void tango(o oVar, d dVar) {
        oVar.getClass();
        dVar.getClass();
        InterfaceC1516t interfaceC1516t = oVar.androidMemoryReadings_;
        if (!((AbstractC1499b) interfaceC1516t).alpha) {
            oVar.androidMemoryReadings_ = AbstractC1513p.oscar(interfaceC1516t);
        }
        oVar.androidMemoryReadings_.add(dVar);
    }

    public static void uniform(o oVar, m mVar) {
        oVar.getClass();
        mVar.getClass();
        oVar.gaugeMetadata_ = mVar;
        oVar.bitField0_ |= 2;
    }

    public static void victor(o oVar, k kVar) {
        oVar.getClass();
        kVar.getClass();
        InterfaceC1516t interfaceC1516t = oVar.cpuMetricReadings_;
        if (!((AbstractC1499b) interfaceC1516t).alpha) {
            oVar.cpuMetricReadings_ = AbstractC1513p.oscar(interfaceC1516t);
        }
        oVar.cpuMetricReadings_.add(kVar);
    }

    public static o yankee() {
        return DEFAULT_INSTANCE;
    }

    public final boolean amber() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean azure() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
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
                return new at(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", k.class, "gaugeMetadata_", "androidMemoryReadings_", d.class});
            case 3:
                return new o();
            case 4:
                return new AbstractC1511n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ap apVar2 = PARSER;
                if (apVar2 == null) {
                    synchronized (o.class) {
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

    public final int whiskey() {
        return this.androidMemoryReadings_.size();
    }

    public final int xray() {
        return this.cpuMetricReadings_.size();
    }

    public final m zulu() {
        m mVar = this.gaugeMetadata_;
        if (mVar == null) {
            return m.victor();
        }
        return mVar;
    }
}
