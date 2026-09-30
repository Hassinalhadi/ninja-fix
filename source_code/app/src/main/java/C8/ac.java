package C8;

import com.google.protobuf.AbstractC1511n;
import com.google.protobuf.AbstractC1513p;
import com.google.protobuf.ap;
import com.google.protobuf.at;

/* loaded from: classes2.dex */
public final class ac extends AbstractC1513p {
    private static final ac DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile ap PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* JADX WARN: Type inference failed for: r0v0, types: [C8.ac, com.google.protobuf.p] */
    static {
        ?? abstractC1513p = new AbstractC1513p();
        DEFAULT_INSTANCE = abstractC1513p;
        AbstractC1513p.papa(ac.class, abstractC1513p);
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
                return new at(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", h.echo});
            case 3:
                return new AbstractC1513p();
            case 4:
                return new AbstractC1511n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ap apVar2 = PARSER;
                if (apVar2 == null) {
                    synchronized (ac.class) {
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
