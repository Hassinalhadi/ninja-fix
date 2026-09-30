package C8;

import com.google.protobuf.AbstractC1511n;
import com.google.protobuf.AbstractC1513p;
import com.google.protobuf.ap;
import com.google.protobuf.at;

/* loaded from: classes2.dex */
public final class m extends AbstractC1513p {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final m DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile ap PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        AbstractC1513p.papa(m.class, mVar);
    }

    public static void sierra(m mVar, int i4) {
        mVar.bitField0_ |= 16;
        mVar.maxAppJavaHeapMemoryKb_ = i4;
    }

    public static void tango(m mVar, int i4) {
        mVar.bitField0_ |= 32;
        mVar.maxEncouragedAppJavaHeapMemoryKb_ = i4;
    }

    public static void uniform(m mVar, int i4) {
        mVar.bitField0_ |= 8;
        mVar.deviceRamSizeKb_ = i4;
    }

    public static m victor() {
        return DEFAULT_INSTANCE;
    }

    public static l xray() {
        return (l) DEFAULT_INSTANCE.india();
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
                return new at(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 3:
                return new m();
            case 4:
                return new AbstractC1511n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ap apVar2 = PARSER;
                if (apVar2 == null) {
                    synchronized (m.class) {
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

    public final boolean whiskey() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }
}
