package okhttp3.internal.http2;

import Tf.n;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import okhttp3.internal._UtilJvmKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0014\u0010#\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0014\u0010$\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0014\u0010%\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001bR\u0014\u0010&\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0014\u0010'\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u001bR\u0014\u0010(\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u001bR\u0014\u0010)\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u001bR\u0014\u0010*\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u001bR\u0014\u0010+\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u001bR\u0014\u0010,\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u001bR\u0014\u0010-\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u001bR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100¨\u00063"}, d2 = {"Lokhttp3/internal/http2/Http2;", "", "<init>", "()V", "", "inbound", "", "streamId", "length", Constants.KEY_TYPE, "flags", "", "frameLog", "(ZIIII)Ljava/lang/String;", "", "windowSizeIncrement", "frameLogWindowUpdate", "(ZIIJ)Ljava/lang/String;", "formattedType$okhttp", "(I)Ljava/lang/String;", "formattedType", "formatFlags", "(II)Ljava/lang/String;", "LTf/n;", "CONNECTION_PREFACE", "LTf/n;", "INITIAL_MAX_FRAME_SIZE", "I", "TYPE_DATA", "TYPE_HEADERS", "TYPE_PRIORITY", "TYPE_RST_STREAM", "TYPE_SETTINGS", "TYPE_PUSH_PROMISE", "TYPE_PING", "TYPE_GOAWAY", "TYPE_WINDOW_UPDATE", "TYPE_CONTINUATION", "FLAG_NONE", "FLAG_ACK", "FLAG_END_STREAM", "FLAG_END_HEADERS", "FLAG_END_PUSH_PROMISE", "FLAG_PADDED", "FLAG_PRIORITY", "FLAG_COMPRESSED", "", "FRAME_NAMES", "[Ljava/lang/String;", "FLAGS", "BINARY", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Http2 {

    @NotNull
    private static final String[] BINARY;

    @NotNull
    public static final n CONNECTION_PREFACE;

    @NotNull
    private static final String[] FLAGS;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;

    @NotNull
    private static final String[] FRAME_NAMES;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;

    @NotNull
    public static final Http2 INSTANCE = new Http2();
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
        n nVar = n.silver;
        CONNECTION_PREFACE = g8.d.oscar("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        FRAME_NAMES = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        FLAGS = new String[64];
        String[] strArr = new String[Barcode.FORMAT_QR_CODE];
        for (int i4 = 0; i4 < 256; i4++) {
            String binaryString = Integer.toBinaryString(i4);
            Intrinsics.delta(binaryString, "toBinaryString(...)");
            strArr[i4] = r.november(_UtilJvmKt.format("%8s", binaryString), ' ', '0');
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i5 = iArr[0];
        strArr2[i5 | 8] = P0.gold(new StringBuilder(), strArr2[i5], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr2[i10];
            int i12 = iArr[0];
            String[] strArr3 = FLAGS;
            int i13 = i12 | i11;
            strArr3[i13] = strArr3[i12] + '|' + strArr3[i11];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i12]);
            sb2.append('|');
            strArr3[i13 | 8] = P0.gold(sb2, strArr3[i11], "|PADDED");
        }
        int length = FLAGS.length;
        for (int i14 = 0; i14 < length; i14++) {
            String[] strArr4 = FLAGS;
            if (strArr4[i14] == null) {
                strArr4[i14] = BINARY[i14];
            }
        }
    }

    private Http2() {
    }

    @NotNull
    public final String formatFlags(int type, int flags) {
        String str;
        if (flags == 0) {
            return "";
        }
        if (type != 2 && type != 3) {
            if (type != 4 && type != 6) {
                if (type != 7 && type != 8) {
                    String[] strArr = FLAGS;
                    if (flags < strArr.length) {
                        str = strArr[flags];
                        Intrinsics.checkNotNull(str);
                    } else {
                        str = BINARY[flags];
                    }
                    if (type == 5 && (flags & 4) != 0) {
                        return r.oscar(str, "HEADERS", "PUSH_PROMISE");
                    }
                    if (type == 0 && (flags & 32) != 0) {
                        return r.oscar(str, "PRIORITY", "COMPRESSED");
                    }
                    return str;
                }
            } else {
                if (flags == 1) {
                    return "ACK";
                }
                return BINARY[flags];
            }
        }
        return BINARY[flags];
    }

    @NotNull
    public final String formattedType$okhttp(int type) {
        String[] strArr = FRAME_NAMES;
        if (type < strArr.length) {
            return strArr[type];
        }
        return _UtilJvmKt.format("0x%02x", Integer.valueOf(type));
    }

    @NotNull
    public final String frameLog(boolean inbound, int streamId, int length, int type, int flags) {
        String str;
        String formattedType$okhttp = formattedType$okhttp(type);
        String formatFlags = formatFlags(type, flags);
        if (inbound) {
            str = "<<";
        } else {
            str = ">>";
        }
        return _UtilJvmKt.format("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(streamId), Integer.valueOf(length), formattedType$okhttp, formatFlags);
    }

    @NotNull
    public final String frameLogWindowUpdate(boolean inbound, int streamId, int length, long windowSizeIncrement) {
        String str;
        String formattedType$okhttp = formattedType$okhttp(8);
        if (inbound) {
            str = "<<";
        } else {
            str = ">>";
        }
        return _UtilJvmKt.format("%s 0x%08x %5d %-13s %d", str, Integer.valueOf(streamId), Integer.valueOf(length), formattedType$okhttp, Long.valueOf(windowSizeIncrement));
    }
}
