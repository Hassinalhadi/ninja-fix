package C8;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.protobuf.AbstractC1498a;
import com.google.protobuf.AbstractC1499b;
import com.google.protobuf.AbstractC1511n;
import com.google.protobuf.AbstractC1513p;
import com.google.protobuf.InterfaceC1516t;
import com.google.protobuf.af;
import com.google.protobuf.ap;
import com.google.protobuf.as;
import com.google.protobuf.at;
import java.util.List;

/* loaded from: classes2.dex */
public final class r extends AbstractC1513p {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final r DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile ap PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private af customAttributes_ = af.purple;
    private String url_ = "";
    private String responseContentType_ = "";
    private InterfaceC1516t perfSessions_ = as.silver;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        AbstractC1513p.papa(r.class, rVar);
    }

    public static void amber(r rVar, long j5) {
        rVar.bitField0_ |= Barcode.FORMAT_UPC_E;
        rVar.timeToResponseCompletedUs_ = j5;
    }

    public static void azure(r rVar, List list) {
        InterfaceC1516t interfaceC1516t = rVar.perfSessions_;
        if (!((AbstractC1499b) interfaceC1516t).alpha) {
            rVar.perfSessions_ = AbstractC1513p.oscar(interfaceC1516t);
        }
        AbstractC1498a.golf(list, rVar.perfSessions_);
    }

    public static void beige(r rVar, int i4) {
        rVar.getClass();
        rVar.httpMethod_ = av.q.mike(i4);
        rVar.bitField0_ |= 2;
    }

    public static void black(r rVar, long j5) {
        rVar.bitField0_ |= 4;
        rVar.requestPayloadBytes_ = j5;
    }

    public static void blue(r rVar, long j5) {
        rVar.bitField0_ |= 8;
        rVar.responsePayloadBytes_ = j5;
    }

    public static r coral() {
        return DEFAULT_INSTANCE;
    }

    public static p orange() {
        return (p) DEFAULT_INSTANCE.india();
    }

    public static void sierra(r rVar, String str) {
        rVar.getClass();
        str.getClass();
        rVar.bitField0_ |= 1;
        rVar.url_ = str;
    }

    public static void tango(r rVar) {
        rVar.getClass();
        rVar.networkClientErrorReason_ = av.q.mike(2);
        rVar.bitField0_ |= 16;
    }

    public static void uniform(r rVar, int i4) {
        rVar.bitField0_ |= 32;
        rVar.httpResponseCode_ = i4;
    }

    public static void victor(r rVar, String str) {
        rVar.getClass();
        str.getClass();
        rVar.bitField0_ |= 64;
        rVar.responseContentType_ = str;
    }

    public static void whiskey(r rVar) {
        rVar.bitField0_ &= -65;
        rVar.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void xray(r rVar, long j5) {
        rVar.bitField0_ |= 128;
        rVar.clientStartTimeUs_ = j5;
    }

    public static void yankee(r rVar, long j5) {
        rVar.bitField0_ |= Barcode.FORMAT_QR_CODE;
        rVar.timeToRequestCompletedUs_ = j5;
    }

    public static void zulu(r rVar, long j5) {
        rVar.bitField0_ |= 512;
        rVar.timeToResponseInitiatedUs_ = j5;
    }

    public final long bronze() {
        return this.clientStartTimeUs_;
    }

    public final int crimson() {
        int i4;
        switch (this.httpMethod_) {
            case 0:
                i4 = 1;
                break;
            case 1:
                i4 = 2;
                break;
            case 2:
                i4 = 3;
                break;
            case 3:
                i4 = 4;
                break;
            case 4:
                i4 = 5;
                break;
            case 5:
                i4 = 6;
                break;
            case 6:
                i4 = 7;
                break;
            case 7:
                i4 = 8;
                break;
            case 8:
                i4 = 9;
                break;
            case 9:
                i4 = 10;
                break;
            default:
                i4 = 0;
                break;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final int cyan() {
        return this.httpResponseCode_;
    }

    public final InterfaceC1516t emerald() {
        return this.perfSessions_;
    }

    public final long fuchsia() {
        return this.requestPayloadBytes_;
    }

    public final long gold() {
        return this.responsePayloadBytes_;
    }

    public final long gray() {
        return this.timeToRequestCompletedUs_;
    }

    public final long green() {
        return this.timeToResponseCompletedUs_;
    }

    public final long indigo() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String ivory() {
        return this.url_;
    }

    public final boolean jade() {
        if ((this.bitField0_ & 128) != 0) {
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
                return new at(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", h.bravo, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", h.charlie, "customAttributes_", q.alpha, "perfSessions_", w.class});
            case 3:
                return new r();
            case 4:
                return new AbstractC1511n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ap apVar2 = PARSER;
                if (apVar2 == null) {
                    synchronized (r.class) {
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

    public final boolean lavender() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean lime() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean magenta() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean maroon() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean navy() {
        if ((this.bitField0_ & Barcode.FORMAT_QR_CODE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean ochre() {
        if ((this.bitField0_ & Barcode.FORMAT_UPC_E) != 0) {
            return true;
        }
        return false;
    }

    public final boolean olive() {
        if ((this.bitField0_ & 512) != 0) {
            return true;
        }
        return false;
    }
}
