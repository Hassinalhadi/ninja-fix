package C8;

import com.google.protobuf.AbstractC1511n;
import com.google.protobuf.AbstractC1513p;
import com.google.protobuf.af;
import com.google.protobuf.ap;
import com.google.protobuf.at;

/* loaded from: classes2.dex */
public final class g extends AbstractC1513p {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final g DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile ap PARSER;
    private b androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private af customAttributes_ = af.purple;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC1513p.papa(g.class, gVar);
    }

    public static e black() {
        return (e) DEFAULT_INSTANCE.india();
    }

    public static void sierra(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.bitField0_ |= 1;
        gVar.googleAppId_ = str;
    }

    public static void tango(g gVar, i iVar) {
        gVar.getClass();
        gVar.applicationProcessState_ = iVar.alpha;
        gVar.bitField0_ |= 8;
    }

    public static af uniform(g gVar) {
        af afVar = gVar.customAttributes_;
        if (!afVar.alpha) {
            gVar.customAttributes_ = afVar.charlie();
        }
        return gVar.customAttributes_;
    }

    public static void victor(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.bitField0_ |= 2;
        gVar.appInstanceId_ = str;
    }

    public static void whiskey(g gVar, b bVar) {
        gVar.getClass();
        gVar.androidAppInfo_ = bVar;
        gVar.bitField0_ |= 4;
    }

    public static g yankee() {
        return DEFAULT_INSTANCE;
    }

    public final boolean amber() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean azure() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean beige() {
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
                return new at(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", h.alpha, "customAttributes_", f.alpha});
            case 3:
                return new g();
            case 4:
                return new AbstractC1511n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ap apVar2 = PARSER;
                if (apVar2 == null) {
                    synchronized (g.class) {
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

    public final b xray() {
        b bVar = this.androidAppInfo_;
        if (bVar == null) {
            return b.victor();
        }
        return bVar;
    }

    public final boolean zulu() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }
}
