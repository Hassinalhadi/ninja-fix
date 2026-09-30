package Q9;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import t3.InterfaceC2959d;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"LQ9/h;", "Lokhttp3/Authenticator;", "<init>", "()V", "", "echo", "()Ljava/lang/String;", "Lokhttp3/Route;", "route", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "authenticate", "(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;", "alpha", "a", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements Authenticator {

    /* renamed from: alpha, reason: from kotlin metadata */
    public static final Companion INSTANCE = null;
    private static final Lazy<OkHttpClient> bravo = null;
    private static final Lazy<InterfaceC2959d> charlie = null;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LQ9/h$a;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "pinnedClient$delegate", "Lkotlin/Lazy;", "charlie", "()Lokhttp3/OkHttpClient;", "pinnedClient", "Lt3/d;", "refreshService$delegate", "delta", "()Lt3/d;", "refreshService", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Q9.h$a, reason: from kotlin metadata */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final OkHttpClient charlie() {
            return (OkHttpClient) h.charlie().getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InterfaceC2959d delta() {
            Object value = h.delta().getValue();
            Intrinsics.delta(value, "getValue(...)");
            return (InterfaceC2959d) value;
        }

        private Companion() {
        }
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(13, h.class);
        Hidden0.special_clinit_13_00(h.class);
    }

    public static native /* synthetic */ OkHttpClient alpha();

    public static native /* synthetic */ InterfaceC2959d bravo();

    public static final native /* synthetic */ Lazy charlie();

    public static final native /* synthetic */ Lazy delta();

    private final native String echo();

    private static final native OkHttpClient foxtrot();

    private static final native InterfaceC2959d golf();

    @Override // okhttp3.Authenticator
    public native Request authenticate(Route route, Response response);
}
