package okhttp3.internal.ws;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003JN\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "perMessageDeflate", "", "clientMaxWindowBits", "", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "noContextTakeover", "clientOriginated", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", "other", "hashCode", "toString", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final /* data */ class WebSocketExtensions {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";

    @Nullable
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;

    @Nullable
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "<init>", "()V", "HEADER_WEB_SOCKET_EXTENSION", "", "parse", "Lokhttp3/internal/ws/WebSocketExtensions;", "responseHeaders", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
        
            if (r7 == null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
        
            r3 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00df, code lost:
        
            if (r9 == null) goto L34;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final WebSocketExtensions parse(@NotNull Headers responseHeaders) throws IOException {
            String str;
            Intrinsics.echo(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z2 = false;
            Integer num = null;
            boolean z10 = false;
            Integer num2 = null;
            boolean z11 = false;
            boolean z12 = false;
            for (int i4 = 0; i4 < size; i4++) {
                if (r.hotel(responseHeaders.name(i4), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true)) {
                    String value = responseHeaders.value(i4);
                    int i5 = 0;
                    while (i5 < value.length()) {
                        int i10 = i5;
                        int delimiterOffset$default = _UtilCommonKt.delimiterOffset$default(value, ',', i10, 0, 4, (Object) null);
                        char c3 = ';';
                        int delimiterOffset = _UtilCommonKt.delimiterOffset(value, ';', i10, delimiterOffset$default);
                        String trimSubstring = _UtilCommonKt.trimSubstring(value, i10, delimiterOffset);
                        int i11 = delimiterOffset + 1;
                        if (r.hotel(trimSubstring, "permessage-deflate", true)) {
                            if (z2) {
                                z12 = true;
                            }
                            while (i11 < delimiterOffset$default) {
                                int delimiterOffset2 = _UtilCommonKt.delimiterOffset(value, c3, i11, delimiterOffset$default);
                                int delimiterOffset3 = _UtilCommonKt.delimiterOffset(value, '=', i11, delimiterOffset2);
                                String trimSubstring2 = _UtilCommonKt.trimSubstring(value, i11, delimiterOffset3);
                                if (delimiterOffset3 < delimiterOffset2) {
                                    str = _UtilCommonKt.trimSubstring(value, delimiterOffset3 + 1, delimiterOffset2);
                                    Intrinsics.echo(str, "<this>");
                                    if (str.length() >= 2 && StringsKt.olive(str, "\"", false) && StringsKt.bronze(str, "\"")) {
                                        str = str.substring(1, str.length() - 1);
                                        Intrinsics.delta(str, "substring(...)");
                                    }
                                } else {
                                    str = null;
                                }
                                int i12 = delimiterOffset2 + 1;
                                if (r.hotel(trimSubstring2, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z12 = true;
                                    }
                                    if (str != null) {
                                        num = r.tango(str);
                                    } else {
                                        num = null;
                                    }
                                } else if (r.hotel(trimSubstring2, "client_no_context_takeover", true)) {
                                    if (z10) {
                                        z12 = true;
                                    }
                                    if (str != null) {
                                        z12 = true;
                                    }
                                    i11 = i12;
                                    z10 = true;
                                } else {
                                    if (r.hotel(trimSubstring2, "server_max_window_bits", true)) {
                                        if (num2 != null) {
                                            z12 = true;
                                        }
                                        if (str != null) {
                                            num2 = r.tango(str);
                                        } else {
                                            num2 = null;
                                        }
                                    } else if (r.hotel(trimSubstring2, "server_no_context_takeover", true)) {
                                        if (z11) {
                                            z12 = true;
                                        }
                                        if (str != null) {
                                            z12 = true;
                                        }
                                        i11 = i12;
                                        z11 = true;
                                    }
                                    i11 = i12;
                                    z12 = true;
                                }
                                c3 = ';';
                            }
                            i5 = i11;
                            z2 = true;
                        } else {
                            i5 = i11;
                            z12 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z2, num, z10, num2, z11, z12);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z2, Integer num, boolean z10, Integer num2, boolean z11, boolean z12, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = webSocketExtensions.perMessageDeflate;
        }
        if ((i4 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i4 & 4) != 0) {
            z10 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i4 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i4 & 16) != 0) {
            z11 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i4 & 32) != 0) {
            z12 = webSocketExtensions.unknownValues;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        return webSocketExtensions.copy(z2, num, z10, num2, z13, z14);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPerMessageDeflate() {
        return this.perMessageDeflate;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getClientMaxWindowBits() {
        return this.clientMaxWindowBits;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getClientNoContextTakeover() {
        return this.clientNoContextTakeover;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getServerMaxWindowBits() {
        return this.serverMaxWindowBits;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getServerNoContextTakeover() {
        return this.serverNoContextTakeover;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUnknownValues() {
        return this.unknownValues;
    }

    @NotNull
    public final WebSocketExtensions copy(boolean perMessageDeflate, @Nullable Integer clientMaxWindowBits, boolean clientNoContextTakeover, @Nullable Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
        return new WebSocketExtensions(perMessageDeflate, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unknownValues);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) other;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && Intrinsics.areEqual(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && Intrinsics.areEqual(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    public int hashCode() {
        int i4;
        int hashCode;
        int i5;
        int i10;
        int i11 = 1237;
        if (this.perMessageDeflate) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = i4 * 31;
        Integer num = this.clientMaxWindowBits;
        int i13 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i14 = (i12 + hashCode) * 31;
        if (this.clientNoContextTakeover) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i15 = (i14 + i5) * 31;
        Integer num2 = this.serverMaxWindowBits;
        if (num2 != null) {
            i13 = num2.hashCode();
        }
        int i16 = (i15 + i13) * 31;
        if (this.serverNoContextTakeover) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i17 = (i16 + i10) * 31;
        if (this.unknownValues) {
            i11 = 1231;
        }
        return i17 + i11;
    }

    public final boolean noContextTakeover(boolean clientOriginated) {
        if (clientOriginated) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.perMessageDeflate);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.clientMaxWindowBits);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.clientNoContextTakeover);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.serverMaxWindowBits);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.serverNoContextTakeover);
        sb2.append(", unknownValues=");
        return P0.gray(sb2, this.unknownValues, ')');
    }

    public WebSocketExtensions(boolean z2, @Nullable Integer num, boolean z10, @Nullable Integer num2, boolean z11, boolean z12) {
        this.perMessageDeflate = z2;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z10;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z11;
        this.unknownValues = z12;
    }

    public /* synthetic */ WebSocketExtensions(boolean z2, Integer num, boolean z10, Integer num2, boolean z11, boolean z12, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z2, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? false : z10, (i4 & 8) != 0 ? null : num2, (i4 & 16) != 0 ? false : z11, (i4 & 32) != 0 ? false : z12);
    }
}
