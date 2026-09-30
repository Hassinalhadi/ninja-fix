package s6;

import com.google.mlkit.common.MlKitException;
import com.zendesk.service.HttpConstants;

/* renamed from: s6.z5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2831z5 implements O {
    NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(1),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_OUTPUT(2),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_TFLITE_VERSION(3),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_OP(4),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_TYPE_ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    TFLITE_INTERNAL_ERROR(7),
    /* JADX INFO: Fake field, exist only in values array */
    TFLITE_UNKNOWN_ERROR(8),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_MODEL_INVALID(9),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_OUT_FETCHING_MODEL_METADATA(5),
    MODEL_NOT_DOWNLOADED(100),
    /* JADX INFO: Fake field, exist only in values array */
    URI_EXPIRED(101),
    /* JADX INFO: Fake field, exist only in values array */
    NO_NETWORK_CONNECTION(102),
    /* JADX INFO: Fake field, exist only in values array */
    METERED_NETWORK(103),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOAD_FAILED(104),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(105),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(106),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_MODEL_INVALID(107),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(108),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(109),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_MODEL_INVALID(110),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(111),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(112),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(113),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(114),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(115),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(116),
    OPTIONAL_MODULE_NOT_AVAILABLE(201),
    OPTIONAL_MODULE_INIT_ERROR(202),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(203),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(204),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(205),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(206),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(301),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpConstants.HTTP_MOVED_TEMP),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpConstants.HTTP_SEE_OTHER),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpConstants.HTTP_NOT_MODIFIED),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpConstants.HTTP_USE_PROXY),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpConstants.HTTP_BAD_REQUEST),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpConstants.HTTP_UNAUTHORIZED),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpConstants.HTTP_PAYMENT_REQUIRED),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpConstants.HTTP_FORBIDDEN),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpConstants.HTTP_NOT_FOUND),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpConstants.HTTP_BAD_METHOD),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpConstants.HTTP_NOT_ACCEPTABLE),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpConstants.HTTP_PROXY_AUTH),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(HttpConstants.HTTP_INTERNAL_ERROR),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(HttpConstants.HTTP_NOT_IMPLEMENTED),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(600),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(601),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(602),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(603),
    UNKNOWN_ERROR(9999);

    public final int alpha;

    EnumC2831z5(int i4) {
        this.alpha = i4;
    }

    @Override // s6.O
    public final int zza() {
        return this.alpha;
    }
}
