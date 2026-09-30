package C8;

import com.google.protobuf.AbstractC1498a;
import com.google.protobuf.AbstractC1499b;
import com.google.protobuf.AbstractC1511n;
import com.google.protobuf.AbstractC1513p;
import com.google.protobuf.InterfaceC1516t;
import com.google.protobuf.af;
import com.google.protobuf.ap;
import com.google.protobuf.as;
import com.google.protobuf.at;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class aa extends AbstractC1513p {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final aa DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile ap PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private af counters_;
    private af customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private InterfaceC1516t perfSessions_;
    private InterfaceC1516t subtraces_;

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        AbstractC1513p.papa(aa.class, aaVar);
    }

    public aa() {
        af afVar = af.purple;
        this.counters_ = afVar;
        this.customAttributes_ = afVar;
        this.name_ = "";
        as asVar = as.silver;
        this.subtraces_ = asVar;
        this.perfSessions_ = asVar;
    }

    public static void amber(aa aaVar, long j5) {
        aaVar.bitField0_ |= 8;
        aaVar.durationUs_ = j5;
    }

    public static aa bronze() {
        return DEFAULT_INSTANCE;
    }

    public static x gold() {
        return (x) DEFAULT_INSTANCE.india();
    }

    public static void sierra(aa aaVar, String str) {
        aaVar.getClass();
        str.getClass();
        aaVar.bitField0_ |= 1;
        aaVar.name_ = str;
    }

    public static af tango(aa aaVar) {
        af afVar = aaVar.counters_;
        if (!afVar.alpha) {
            aaVar.counters_ = afVar.charlie();
        }
        return aaVar.counters_;
    }

    public static void uniform(aa aaVar, aa aaVar2) {
        aaVar.getClass();
        aaVar2.getClass();
        InterfaceC1516t interfaceC1516t = aaVar.subtraces_;
        if (!((AbstractC1499b) interfaceC1516t).alpha) {
            aaVar.subtraces_ = AbstractC1513p.oscar(interfaceC1516t);
        }
        aaVar.subtraces_.add(aaVar2);
    }

    public static void victor(aa aaVar, ArrayList arrayList) {
        InterfaceC1516t interfaceC1516t = aaVar.subtraces_;
        if (!((AbstractC1499b) interfaceC1516t).alpha) {
            aaVar.subtraces_ = AbstractC1513p.oscar(interfaceC1516t);
        }
        AbstractC1498a.golf(arrayList, aaVar.subtraces_);
    }

    public static af whiskey(aa aaVar) {
        af afVar = aaVar.customAttributes_;
        if (!afVar.alpha) {
            aaVar.customAttributes_ = afVar.charlie();
        }
        return aaVar.customAttributes_;
    }

    public static void xray(aa aaVar, w wVar) {
        aaVar.getClass();
        InterfaceC1516t interfaceC1516t = aaVar.perfSessions_;
        if (!((AbstractC1499b) interfaceC1516t).alpha) {
            aaVar.perfSessions_ = AbstractC1513p.oscar(interfaceC1516t);
        }
        aaVar.perfSessions_.add(wVar);
    }

    public static void yankee(aa aaVar, List list) {
        InterfaceC1516t interfaceC1516t = aaVar.perfSessions_;
        if (!((AbstractC1499b) interfaceC1516t).alpha) {
            aaVar.perfSessions_ = AbstractC1513p.oscar(interfaceC1516t);
        }
        AbstractC1498a.golf(list, aaVar.perfSessions_);
    }

    public static void zulu(aa aaVar, long j5) {
        aaVar.bitField0_ |= 4;
        aaVar.clientStartTimeUs_ = j5;
    }

    public final boolean azure() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int beige() {
        return this.counters_.size();
    }

    public final Map black() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map blue() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long coral() {
        return this.durationUs_;
    }

    public final String crimson() {
        return this.name_;
    }

    public final InterfaceC1516t cyan() {
        return this.perfSessions_;
    }

    public final InterfaceC1516t emerald() {
        return this.subtraces_;
    }

    public final boolean fuchsia() {
        if ((this.bitField0_ & 4) != 0) {
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
                return new at(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", y.alpha, "subtraces_", aa.class, "customAttributes_", z.alpha, "perfSessions_", w.class});
            case 3:
                return new aa();
            case 4:
                return new AbstractC1511n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ap apVar2 = PARSER;
                if (apVar2 == null) {
                    synchronized (aa.class) {
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
