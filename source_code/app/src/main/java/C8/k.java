package C8;

import com.google.protobuf.AbstractC1511n;
import com.google.protobuf.AbstractC1513p;
import com.google.protobuf.ap;
import com.google.protobuf.at;

/* loaded from: classes2.dex */
public final class k extends AbstractC1513p {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    private static volatile ap PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.p, C8.k] */
    static {
        ?? abstractC1513p = new AbstractC1513p();
        DEFAULT_INSTANCE = abstractC1513p;
        AbstractC1513p.papa(k.class, abstractC1513p);
    }

    public static void sierra(k kVar, long j5) {
        kVar.bitField0_ |= 1;
        kVar.clientTimeUs_ = j5;
    }

    public static void tango(k kVar, long j5) {
        kVar.bitField0_ |= 2;
        kVar.userTimeUs_ = j5;
    }

    public static void uniform(k kVar, long j5) {
        kVar.bitField0_ |= 4;
        kVar.systemTimeUs_ = j5;
    }

    public static j victor() {
        return (j) DEFAULT_INSTANCE.india();
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
                return new at(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 3:
                return new AbstractC1513p();
            case 4:
                return new AbstractC1511n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ap apVar2 = PARSER;
                if (apVar2 == null) {
                    synchronized (k.class) {
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
}
