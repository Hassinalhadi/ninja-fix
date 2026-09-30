package okhttp3.internal.sse;

import Tf.ag;
import Tf.b;
import Tf.k;
import Tf.m;
import Tf.n;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import g8.d;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/sse/ServerSentEventReader;", "", "LTf/m;", "source", "Lokhttp3/internal/sse/ServerSentEventReader$Callback;", "callback", "<init>", "(LTf/m;Lokhttp3/internal/sse/ServerSentEventReader$Callback;)V", "", Constants.KEY_ID, Constants.KEY_TYPE, "LTf/k;", Column.DATA, "", "completeEvent", "(Ljava/lang/String;Ljava/lang/String;LTf/k;)V", "", "processNextEvent", "()Z", "LTf/m;", "Lokhttp3/internal/sse/ServerSentEventReader$Callback;", "lastId", "Ljava/lang/String;", "Companion", "Callback", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServerSentEventReader {

    @NotNull
    private static final n CRLF;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ag options;

    @NotNull
    private final Callback callback;

    @Nullable
    private String lastId;

    @NotNull
    private final m source;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/sse/ServerSentEventReader$Callback;", "", "onEvent", "", Constants.KEY_ID, "", Constants.KEY_TYPE, Column.DATA, "onRetryChange", "timeMs", "", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Callback {
        void onEvent(@Nullable String id2, @Nullable String type, @NotNull String data);

        void onRetryChange(long timeMs);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/sse/ServerSentEventReader$Companion;", "", "<init>", "()V", "LTf/m;", "LTf/k;", Column.DATA, "", "readData", "(LTf/m;LTf/k;)V", "", "readRetryMs", "(LTf/m;)J", "LTf/ag;", "options", "LTf/ag;", "getOptions", "()LTf/ag;", "LTf/n;", "CRLF", "LTf/n;", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void readData(m mVar, k kVar) throws IOException {
            kVar.pink(10);
            mVar.a(kVar, mVar.i(ServerSentEventReader.CRLF));
            mVar.c(getOptions());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long readRetryMs(m mVar) throws IOException {
            return Util.toLongOrDefault(mVar.e(), -1L);
        }

        @NotNull
        public final ag getOptions() {
            return ServerSentEventReader.options;
        }

        private Companion() {
        }
    }

    static {
        n nVar = n.silver;
        options = b.foxtrot(d.oscar("\r\n"), d.oscar("\r"), d.oscar("\n"), d.oscar("data: "), d.oscar("data:"), d.oscar("data\r\n"), d.oscar("data\r"), d.oscar("data\n"), d.oscar("id: "), d.oscar("id:"), d.oscar("id\r\n"), d.oscar("id\r"), d.oscar("id\n"), d.oscar("event: "), d.oscar("event:"), d.oscar("event\r\n"), d.oscar("event\r"), d.oscar("event\n"), d.oscar("retry: "), d.oscar("retry:"));
        CRLF = d.oscar("\r\n");
    }

    public ServerSentEventReader(@NotNull m source, @NotNull Callback callback) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(callback, "callback");
        this.source = source;
        this.callback = callback;
    }

    private final void completeEvent(String id2, String type, k data) throws IOException {
        if (data.purple != 0) {
            this.lastId = id2;
            data.india(1L);
            this.callback.onEvent(id2, type, data.green());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Tf.k, java.lang.Object] */
    public final boolean processNextEvent() throws IOException {
        String str = this.lastId;
        ?? obj = new Object();
        while (true) {
            String str2 = null;
            while (true) {
                m mVar = this.source;
                ag agVar = options;
                int c3 = mVar.c(agVar);
                if (c3 >= 0 && c3 < 3) {
                    completeEvent(str, str2, obj);
                    return true;
                }
                if (3 <= c3 && c3 < 5) {
                    INSTANCE.readData(this.source, obj);
                } else if (5 <= c3 && c3 < 8) {
                    obj.pink(10);
                } else if (8 <= c3 && c3 < 10) {
                    str = this.source.e();
                    if (str.length() <= 0) {
                        str = null;
                    }
                } else if (10 <= c3 && c3 < 13) {
                    str = null;
                } else if (13 <= c3 && c3 < 15) {
                    str2 = this.source.e();
                    if (str2.length() > 0) {
                    }
                } else if (15 > c3 || c3 >= 18) {
                    if (18 <= c3 && c3 < 20) {
                        long readRetryMs = INSTANCE.readRetryMs(this.source);
                        if (readRetryMs != -1) {
                            this.callback.onRetryChange(readRetryMs);
                        }
                    } else if (c3 == -1) {
                        long i4 = this.source.i(CRLF);
                        if (i4 != -1) {
                            this.source.india(i4);
                            this.source.c(agVar);
                        } else {
                            return false;
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
            }
        }
    }
}
