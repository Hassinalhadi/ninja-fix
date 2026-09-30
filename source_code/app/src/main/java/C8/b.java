package C8;

import com.google.protobuf.AbstractC1511n;
import com.google.protobuf.AbstractC1513p;
import com.google.protobuf.ap;
import com.google.protobuf.at;

/* loaded from: classes2.dex */
public final class b extends AbstractC1513p {
    private static final b DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile ap PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        AbstractC1513p.papa(b.class, bVar);
    }

    public static void sierra(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        bVar.bitField0_ |= 1;
        bVar.packageName_ = str;
    }

    public static void tango(b bVar) {
        bVar.getClass();
        bVar.bitField0_ |= 2;
        bVar.sdkVersion_ = "21.0.5";
    }

    public static void uniform(b bVar, String str) {
        bVar.getClass();
        bVar.bitField0_ |= 4;
        bVar.versionName_ = str;
    }

    public static b victor() {
        return DEFAULT_INSTANCE;
    }

    public static a yankee() {
        return (a) DEFAULT_INSTANCE.india();
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
                return new at(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new b();
            case 4:
                return new AbstractC1511n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ap apVar2 = PARSER;
                if (apVar2 == null) {
                    synchronized (b.class) {
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
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean xray() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }
}
