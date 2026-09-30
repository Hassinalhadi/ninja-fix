package Q9;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.util.Log;
import ca.n;
import com.app.feature.location.LocationBroadcastConfig;
import com.app.feature.location.api.AllowMockProvider;
import com.app.feature.location.api.LocationPayloadMapper;
import com.app.feature.location.api.StompStateHolder;
import com.app.feature.location.api.UserInfoProvider;
import com.app.feature.location.store.LastSentLocationStore;
import com.app.feature.location.store.SharedPreferencesLastSentLocationStore;
import com.app.network.network.models.Envelop;
import com.app.network.network.models.Jwt;
import com.app.network.network.models.SocketClients;
import com.app.network.network.models.Stomp;
import com.app.network.network.models.UserInfo;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.clevertap.android.sdk.Constants;
import da.InterfaceC1597c;
import da.InterfaceC1598d;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g3.C1746g;
import g3.EnumC1747h;
import g3.InterfaceC1740a;
import g3.ad;
import g3.ae;
import g3.o;
import g3.p;
import g3.r;
import g3.w;
import h3.InterfaceC1804a;
import h3.InterfaceC1805b;
import h3.InterfaceC1806c;
import h3.InterfaceC1807d;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import k3.InterfaceC2002a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p3.EnumC2270b;
import p3.ah;
import s6.AbstractC2701l0;
import s6.AbstractC2754r0;
import t6.V2;
import u3.InterfaceC3138a;
import u3.InterfaceC3139b;
import u3.InterfaceC3140c;
import u3.InterfaceC3141d;
import u3.InterfaceC3142e;
import u3.InterfaceC3143f;
import v3.InterfaceC3171a;
import yf.InterfaceC3439i;
import yf.N;
import z3.C3462a;

@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0007¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0007¢\u0006\u0004\b9\u0010:J\u0017\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b>\u0010?J!\u0010B\u001a\u00020A2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010@\u001a\u00020=H\u0007¢\u0006\u0004\bB\u0010CJ\u0019\u0010E\u001a\u00020D2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0007¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0007¢\u0006\u0004\bN\u0010OJA\u0010V\u001a\u00020U2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010P\u001a\u00020A2\u0006\u0010Q\u001a\u00020G2\u0006\u0010R\u001a\u00020D2\u0006\u0010S\u001a\u00020J2\u0006\u0010T\u001a\u00020MH\u0007¢\u0006\u0004\bV\u0010WJ\u0019\u0010Y\u001a\u00020X2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\bY\u0010ZJ\u000f\u0010\\\u001a\u00020[H\u0007¢\u0006\u0004\b\\\u0010]¨\u0006^"}, d2 = {"LQ9/c;", "", "<init>", "()V", "Lu3/a;", "provideAuthTokenProvider", "()Lu3/a;", "Lu3/c;", "provideInstallationIdProvider", "()Lu3/c;", "Lda/c;", "provideLoginStateProvider", "()Lda/c;", "Lda/d;", "provideSessionInvalidator", "()Lda/d;", "Lcom/app/feature/location/LocationBroadcastConfig;", "provideLocationBroadcastConfig", "()Lcom/app/feature/location/LocationBroadcastConfig;", "Lcom/app/feature/location/api/LocationPayloadMapper;", "provideLocationPayloadMapper", "()Lcom/app/feature/location/api/LocationPayloadMapper;", "Landroid/content/Context;", "context", "Lcom/app/feature/location/store/LastSentLocationStore;", "provideLastSentLocationStore", "(Landroid/content/Context;)Lcom/app/feature/location/store/LastSentLocationStore;", "lastSentStore", "Lu3/d;", "provideLastLocationStore", "(Lcom/app/feature/location/store/LastSentLocationStore;)Lu3/d;", "Lu3/e;", "provideLogger", "()Lu3/e;", "Lu3/b;", "provideForegroundNotificationProvider", "()Lu3/b;", "LNb/h;", "internetRepository", "Lv3/a;", "provideStompRuntime", "(LNb/h;)Lv3/a;", "Lg3/ae;", "provideStompUrlProvider", "()Lg3/ae;", "Lg3/ad;", "provideStompTokenProvider", "()Lg3/ad;", "LZ9/c;", "metrics", "Lg3/w;", "provideLocationSendFacade", "(LZ9/c;)Lg3/w;", "Lcom/app/feature/location/api/UserInfoProvider;", "provideUserInfoProvider", "()Lcom/app/feature/location/api/UserInfoProvider;", "Lcom/app/feature/location/api/StompStateHolder;", "provideStompStateHolder", "()Lcom/app/feature/location/api/StompStateHolder;", "Lu3/f;", "remoteConfigProvider", "Lcom/app/feature/location/api/AllowMockProvider;", "provideAllowMockProvider", "(Lu3/f;)Lcom/app/feature/location/api/AllowMockProvider;", "allowMockProvider", "Lo3/g;", "provideLocationHealthChecker", "(Landroid/content/Context;Lcom/app/feature/location/api/AllowMockProvider;)Lo3/g;", "Lh3/d;", "provideConnectionDiagnosticsStringProvider", "(Landroid/content/Context;)Lh3/d;", "Lh3/c;", "provideConnectionDiagnosticsServiceProvider", "()Lh3/c;", "Lh3/b;", "provideBackendPingProvider", "()Lh3/b;", "Lh3/a;", "provideAuthStateProvider", "()Lh3/a;", "locationHealthChecker", "serviceProvider", "stringProvider", "backendPingProvider", "authStateProvider", "Lm3/d;", "provideConnectionDiagnostics", "(Landroid/content/Context;Lo3/g;Lh3/c;Lh3/d;Lh3/b;Lh3/a;)Lm3/d;", "Lg3/a;", "provideComplianceChecker", "(Landroid/content/Context;)Lg3/a;", "Lk3/a;", "provideComplianceUiHandler", "()Lk3/a;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InstallIn({SingletonComponent.class})
/* loaded from: classes2.dex */
public final class c {

    @NotNull
    public static final c alpha = new c();

    /* compiled from: Dex2C */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Q9/c$a", "Lcom/app/feature/location/api/AllowMockProvider;", "", "isMockLocationAllowed", "()Z", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements AllowMockProvider {
        final InterfaceC3143f alpha;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(9, a.class);
            Hidden0.special_clinit_9_00(a.class);
        }

        public a(InterfaceC3143f interfaceC3143f) {
            this.alpha = interfaceC3143f;
        }

        @Override // com.app.feature.location.api.AllowMockProvider
        public native boolean isMockLocationAllowed();
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Q9/c$b", "Lu3/a;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC3138a {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Q9/c$c", "Lu3/b;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Q9.c$c */
    /* loaded from: classes2.dex */
    public static final class C0000c implements InterfaceC3139b {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Q9/c$d", "Lu3/c;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC3140c {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Q9/c$e", "Lu3/d;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC3141d {
        final /* synthetic */ LastSentLocationStore alpha;

        public e(LastSentLocationStore lastSentLocationStore) {
            this.alpha = lastSentLocationStore;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Q9/c$f", "Lu3/e;", "", "tag", Constants.KEY_MESSAGE, "", "alpha", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "bravo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC3142e {
        @Override // u3.InterfaceC3142e
        public void alpha(String tag, String r4) {
            Intrinsics.echo(tag, "tag");
            Intrinsics.echo(r4, "message");
            C3462a.alpha(tag, 12, r4, null);
        }

        @Override // u3.InterfaceC3142e
        public void bravo(String tag, String r32, Throwable throwable) {
            Intrinsics.echo(tag, "tag");
            Intrinsics.echo(r32, "message");
            Intrinsics.echo(throwable, "throwable");
            C3462a.alpha(tag, 8, r32, throwable);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Q9/c$g", "Lda/c;", "", "alpha", "()Z", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g implements InterfaceC1597c {
        @Override // da.InterfaceC1597c
        public boolean alpha() {
            String str;
            boolean z2;
            Jwt jwt;
            AndroidApp androidApp = AndroidApp.yellow;
            UserInfo sierra = L9.d.sierra(V2.delta());
            if (sierra != null && (jwt = sierra.getJwt()) != null) {
                str = jwt.getJwtToken();
            } else {
                str = null;
            }
            if (str != null && !StringsKt.gray(str)) {
                z2 = false;
            } else {
                z2 = true;
            }
            return !z2;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Q9/c$h", "Lda/d;", "", "reason", "", "alpha", "(Ljava/lang/String;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC1598d {
        @Override // da.InterfaceC1598d
        public void alpha(String reason) {
            AbstractC2754r0.bravo(reason);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ#\u0010\u0011\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0011\u0010 \u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Q9/c$i", "Lv3/a;", "", "mike", "()V", "oscar", "golf", "", "atMs", "november", "(J)V", "lima", "alpha", "", "code", "", "reason", "bravo", "(Ljava/lang/Integer;Ljava/lang/String;)V", "className", "delta", "(Ljava/lang/String;)V", "charlie", "()I", "foxtrot", "hotel", "timestamp", "echo", "kilo", "()Ljava/lang/Long;", "durationMs", "india", "juliet", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class i implements InterfaceC3171a {
        final /* synthetic */ Nb.h alpha;

        public i(Nb.h hVar) {
            this.alpha = hVar;
        }

        @Override // v3.InterfaceC3171a
        public void alpha(long atMs) {
            if (CaptainLocationMonitoringService.f12074L == null) {
                CaptainLocationMonitoringService.f12074L = Long.valueOf(atMs);
            }
            if (((Boolean) ((N) this.alpha.charlie.alpha).getValue()).booleanValue()) {
                int i4 = CaptainLocationMonitoringService.f12075M + 1;
                CaptainLocationMonitoringService.f12075M = i4;
                C3462a.alpha("SocketConnection", 12, Z9.g.alpha("RUNTIME_ON_FIRST_NOT_CONNECTED", "NOT_CONNECTED", null, Integer.valueOf(CaptainLocationMonitoringService.f12076N), null, null, null, null, null, null, Integer.valueOf(i4), null, y.sierra(new Pair("hasInternet", "true"), new Pair("reason", "server_side_failure")), 3060), null);
            } else {
                int i5 = CaptainLocationMonitoringService.f12075M;
                CaptainLocationMonitoringService.f12075M = 0;
                C3462a.alpha("SocketConnection", 12, Z9.g.alpha("RUNTIME_ON_FIRST_NOT_CONNECTED", "NOT_CONNECTED", null, Integer.valueOf(CaptainLocationMonitoringService.f12076N), null, null, null, null, null, null, 0, null, y.sierra(new Pair("hasInternet", "false"), new Pair("reason", "client_offline"), new Pair("prevFailures", String.valueOf(i5))), 3060), null);
            }
        }

        @Override // v3.InterfaceC3171a
        public void bravo(Integer code, String reason) {
            boolean z2 = CaptainLocationMonitoringService.f12066D;
            CaptainLocationMonitoringService.f12070H = code;
            CaptainLocationMonitoringService.f12071I = reason;
        }

        @Override // v3.InterfaceC3171a
        public int charlie() {
            boolean z2 = CaptainLocationMonitoringService.f12066D;
            return CaptainLocationMonitoringService.f12076N;
        }

        @Override // v3.InterfaceC3171a
        public void delta(String className) {
            boolean z2 = CaptainLocationMonitoringService.f12066D;
            CaptainLocationMonitoringService.f12072J = className;
        }

        @Override // v3.InterfaceC3171a
        public void echo(long timestamp) {
            boolean z2 = CaptainLocationMonitoringService.f12066D;
            CaptainLocationMonitoringService.f12077O = Long.valueOf(timestamp);
        }

        @Override // v3.InterfaceC3171a
        public int foxtrot() {
            boolean z2 = CaptainLocationMonitoringService.f12066D;
            int i4 = CaptainLocationMonitoringService.f12076N + 1;
            CaptainLocationMonitoringService.f12076N = i4;
            return i4;
        }

        @Override // v3.InterfaceC3171a
        public void golf() {
            LinkedHashMap linkedHashMap;
            N n5 = CaptainLocationMonitoringService.f12067E;
            ah ahVar = (ah) n5.getValue();
            ah ahVar2 = ah.red;
            if (ahVar == ahVar2) {
                return;
            }
            n5.getClass();
            n5.juliet(null, ahVar2);
            Log.i("LocationFlow", "STOMP_STATE_CHANGE from=" + ahVar + " to=NOT_CONNECTED timestamp=" + System.currentTimeMillis());
            Log.w("LocationFlow", "🔴 [STOMP_STATE] NOT_CONNECTED | previous: " + ahVar + " → NOT_CONNECTED | lastCloseCode=" + CaptainLocationMonitoringService.f12070H + ", lastCloseReason=" + CaptainLocationMonitoringService.f12071I + ", lastErrorClass=" + CaptainLocationMonitoringService.f12072J);
            StringBuilder sb2 = new StringBuilder("🔴 [STOMP_STATE] NOT_CONNECTED | previous: ");
            sb2.append(ahVar);
            C3462a.alpha("LocationFlow", 12, sb2.toString(), null);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Integer num = CaptainLocationMonitoringService.f12070H;
            if (num != null) {
                linkedHashMap2.put("closeCode", String.valueOf(num));
            }
            String name = ahVar.name();
            String str = CaptainLocationMonitoringService.f12071I;
            String str2 = CaptainLocationMonitoringService.f12072J;
            int i4 = CaptainLocationMonitoringService.f12076N;
            int i5 = CaptainLocationMonitoringService.f12075M;
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = null;
            } else {
                linkedHashMap = linkedHashMap2;
            }
            C3462a.alpha("SocketConnection", 12, Z9.g.alpha("STATE", "NOT_CONNECTED", name, Integer.valueOf(i4), null, null, str, str2, null, null, Integer.valueOf(i5), null, linkedHashMap, 2864), null);
        }

        @Override // v3.InterfaceC3171a
        public void hotel() {
            boolean z2 = CaptainLocationMonitoringService.f12066D;
            CaptainLocationMonitoringService.f12076N = 0;
        }

        @Override // v3.InterfaceC3171a
        public void india(long durationMs) {
            boolean z2 = CaptainLocationMonitoringService.f12066D;
            CaptainLocationMonitoringService.f12078P = Long.valueOf(durationMs);
        }

        @Override // v3.InterfaceC3171a
        public Long juliet() {
            boolean z2 = CaptainLocationMonitoringService.f12066D;
            return CaptainLocationMonitoringService.f12078P;
        }

        @Override // v3.InterfaceC3171a
        public Long kilo() {
            boolean z2 = CaptainLocationMonitoringService.f12066D;
            return CaptainLocationMonitoringService.f12077O;
        }

        @Override // v3.InterfaceC3171a
        public void lima(long atMs) {
            CaptainLocationMonitoringService.f12074L = null;
            CaptainLocationMonitoringService.f12070H = null;
            CaptainLocationMonitoringService.f12071I = null;
            CaptainLocationMonitoringService.f12072J = null;
            int i4 = CaptainLocationMonitoringService.f12075M;
            CaptainLocationMonitoringService.f12075M = 0;
            C3462a.alpha("SocketConnection", 12, Z9.g.alpha("RUNTIME_ON_CONNECTED", "CONNECTED", null, Integer.valueOf(CaptainLocationMonitoringService.f12076N), null, null, null, null, null, null, 0, null, y.romeo(new Pair("prevFailures", String.valueOf(i4))), 3060), null);
        }

        @Override // v3.InterfaceC3171a
        public void mike() {
            N n5 = CaptainLocationMonitoringService.f12067E;
            ah ahVar = (ah) n5.getValue();
            ah ahVar2 = ah.alpha;
            n5.getClass();
            n5.juliet(null, ahVar2);
            Log.i("LocationFlow", "🟡 [STOMP_STATE] CONNECTING | previous: " + ahVar + " → CONNECTING");
            StringBuilder sb2 = new StringBuilder("🟡 [STOMP_STATE] CONNECTING | previous: ");
            sb2.append(ahVar);
            C3462a.alpha("LocationFlow", 12, sb2.toString(), null);
            C3462a.alpha("SocketConnection", 12, Z9.g.alpha("STATE", "CONNECTING", ahVar.name(), Integer.valueOf(CaptainLocationMonitoringService.f12076N), null, null, null, null, null, null, Integer.valueOf(CaptainLocationMonitoringService.f12075M), null, null, 7152), null);
        }

        @Override // v3.InterfaceC3171a
        public void november(long atMs) {
            boolean z2 = CaptainLocationMonitoringService.f12066D;
            CaptainLocationMonitoringService.f12073K = Long.valueOf(atMs);
        }

        @Override // v3.InterfaceC3171a
        public void oscar() {
            N n5 = CaptainLocationMonitoringService.f12067E;
            ah ahVar = (ah) n5.getValue();
            ah ahVar2 = ah.purple;
            n5.getClass();
            n5.juliet(null, ahVar2);
            Log.i("LocationFlow", "STOMP_STATE_CHANGE from=" + ahVar + " to=CONNECTED timestamp=" + System.currentTimeMillis());
            StringBuilder sb2 = new StringBuilder("🟢 [STOMP_STATE] CONNECTED | previous: ");
            sb2.append(ahVar);
            sb2.append(" → CONNECTED");
            Log.i("LocationFlow", sb2.toString());
            C3462a.alpha("LocationFlow", 12, "🟢 [STOMP_STATE] CONNECTED | previous: " + ahVar, null);
            C3462a.alpha("SocketConnection", 12, Z9.g.alpha("STATE", "CONNECTED", ahVar.name(), Integer.valueOf(CaptainLocationMonitoringService.f12076N), null, null, null, null, null, null, Integer.valueOf(CaptainLocationMonitoringService.f12075M), null, null, 7152), null);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Q9/c$j", "Lcom/app/feature/location/api/StompStateHolder;", "Lp3/ah;", "getState", "()Lp3/ah;", "state", "", "setState", "(Lp3/ah;)V", "Lp3/b;", "getGpsQuality", "()Lp3/b;", "quality", "setGpsQuality", "(Lp3/b;)V", "Lyf/i;", "stateFlow", "()Lyf/i;", "gpsQualityFlow", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class j implements StompStateHolder {
        @Override // com.app.feature.location.api.StompStateHolder
        public EnumC2270b getGpsQuality() {
            return (EnumC2270b) CaptainLocationMonitoringService.f12068F.getValue();
        }

        @Override // com.app.feature.location.api.StompStateHolder
        public ah getState() {
            return (ah) CaptainLocationMonitoringService.f12067E.getValue();
        }

        @Override // com.app.feature.location.api.StompStateHolder
        public InterfaceC3439i gpsQualityFlow() {
            return CaptainLocationMonitoringService.f12068F;
        }

        @Override // com.app.feature.location.api.StompStateHolder
        public void setGpsQuality(EnumC2270b quality) {
            Intrinsics.echo(quality, "quality");
            N n5 = CaptainLocationMonitoringService.f12068F;
            n5.getClass();
            n5.juliet(null, quality);
        }

        @Override // com.app.feature.location.api.StompStateHolder
        public void setState(ah state) {
            Intrinsics.echo(state, "state");
            N n5 = CaptainLocationMonitoringService.f12067E;
            n5.getClass();
            n5.juliet(null, state);
        }

        @Override // com.app.feature.location.api.StompStateHolder
        public InterfaceC3439i stateFlow() {
            return CaptainLocationMonitoringService.f12067E;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Q9/c$k", "Lg3/ad;", "", "alpha", "()Ljava/lang/String;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class k implements ad {
        @Override // g3.ad
        public String alpha() {
            Jwt jwt;
            AndroidApp androidApp = AndroidApp.yellow;
            UserInfo sierra = L9.d.sierra(V2.delta());
            if (sierra != null && (jwt = sierra.getJwt()) != null) {
                return jwt.getRefreshToken();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Q9/c$l", "Lg3/ae;", "", "alpha", "()Ljava/lang/String;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class l implements ae {
        @Override // g3.ae
        public String alpha() {
            SocketClients socketClients;
            Stomp stomp;
            AndroidApp androidApp = AndroidApp.yellow;
            UserInfo sierra = L9.d.sierra(V2.delta());
            if (sierra != null && (socketClients = sierra.getSocketClients()) != null && (stomp = socketClients.getStomp()) != null) {
                return stomp.getConnectionUrl();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Q9/c$m", "Lcom/app/feature/location/api/UserInfoProvider;", "", "getLocationsTopic", "()Ljava/lang/String;", "", "getLocationInterval", "()J", "getLocationFastestInterval", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class m implements UserInfoProvider {
        @Override // com.app.feature.location.api.UserInfoProvider
        public long getLocationFastestInterval() {
            Envelop envelop;
            Long locationFastestInterval;
            AndroidApp androidApp = AndroidApp.yellow;
            UserInfo sierra = L9.d.sierra(V2.delta());
            if (sierra != null && (envelop = sierra.getEnvelop()) != null && (locationFastestInterval = envelop.getLocationFastestInterval()) != null) {
                return locationFastestInterval.longValue();
            }
            return 15000L;
        }

        @Override // com.app.feature.location.api.UserInfoProvider
        public long getLocationInterval() {
            Envelop envelop;
            Long locationInterval;
            AndroidApp androidApp = AndroidApp.yellow;
            UserInfo sierra = L9.d.sierra(V2.delta());
            if (sierra != null && (envelop = sierra.getEnvelop()) != null && (locationInterval = envelop.getLocationInterval()) != null) {
                return locationInterval.longValue();
            }
            return OkHttpConstants.READ_TIMEOUT_MS;
        }

        @Override // com.app.feature.location.api.UserInfoProvider
        public String getLocationsTopic() {
            SocketClients socketClients;
            Stomp stomp;
            AndroidApp androidApp = AndroidApp.yellow;
            UserInfo sierra = L9.d.sierra(V2.delta());
            if (sierra != null && (socketClients = sierra.getSocketClients()) != null && (stomp = socketClients.getStomp()) != null) {
                return stomp.getLocationsTopic();
            }
            return null;
        }
    }

    private c() {
    }

    public static final d3.k delta() {
        d3.k kVar;
        WeakReference weakReference = AbstractC2701l0.bravo;
        if (weakReference != null) {
            kVar = (d3.k) weakReference.get();
        } else {
            kVar = null;
        }
        if (kVar == null) {
            AbstractC2701l0.bravo = null;
        }
        return kVar;
    }

    public static final String echo(Location location) {
        double d4;
        float f5;
        Intrinsics.echo(location, "location");
        com.google.gson.l lVar = new com.google.gson.l();
        Double valueOf = Double.valueOf(location.getLatitude());
        Float f10 = null;
        if (Math.abs(valueOf.doubleValue()) > Double.MAX_VALUE) {
            valueOf = null;
        }
        double d9 = 0.0d;
        if (valueOf != null) {
            d4 = valueOf.doubleValue();
        } else {
            d4 = 0.0d;
        }
        Double valueOf2 = Double.valueOf(location.getLongitude());
        if (Math.abs(valueOf2.doubleValue()) > Double.MAX_VALUE) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            d9 = valueOf2.doubleValue();
        }
        double d10 = d9;
        Float valueOf3 = Float.valueOf(location.getAccuracy());
        if (Math.abs(valueOf3.floatValue()) > Float.MAX_VALUE) {
            valueOf3 = null;
        }
        float f11 = 0.0f;
        if (valueOf3 != null) {
            f5 = valueOf3.floatValue();
        } else {
            f5 = 0.0f;
        }
        Float valueOf4 = Float.valueOf(location.getSpeed());
        if (Math.abs(valueOf4.floatValue()) <= Float.MAX_VALUE) {
            f10 = valueOf4;
        }
        if (f10 != null) {
            f11 = f10.floatValue();
        }
        String india = lVar.india(new com.app.network.network.models.Location(d4, d10, f5, f11, location.getTime()));
        Intrinsics.delta(india, "toJson(...)");
        return india;
    }

    public static final n foxtrot() {
        return n.crimson;
    }

    @NotNull
    public final AllowMockProvider provideAllowMockProvider(@NotNull InterfaceC3143f remoteConfigProvider) {
        Intrinsics.echo(remoteConfigProvider, "remoteConfigProvider");
        return new a(remoteConfigProvider);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, h3.a] */
    @NotNull
    public final InterfaceC1804a provideAuthStateProvider() {
        return new Object();
    }

    @NotNull
    public final InterfaceC3138a provideAuthTokenProvider() {
        return new b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, h3.b] */
    @NotNull
    public final InterfaceC1805b provideBackendPingProvider() {
        return new Object();
    }

    @NotNull
    public final InterfaceC1740a provideComplianceChecker(@ApplicationContext @NotNull Context context) {
        Intrinsics.echo(context, "context");
        return new S9.a(context);
    }

    @NotNull
    public final InterfaceC2002a provideComplianceUiHandler() {
        Q4.a aVar = new Q4.a(17);
        EnumC1747h enumC1747h = EnumC1747h.alpha;
        Pair pair = new Pair(g3.m.class, enumC1747h);
        Pair pair2 = new Pair(g3.n.class, enumC1747h);
        EnumC1747h enumC1747h2 = EnumC1747h.purple;
        return new S9.b(aVar, new C1746g(y.sierra(pair, pair2, new Pair(o.class, enumC1747h2), new Pair(p.class, enumC1747h2), new Pair(r.class, EnumC1747h.red)), true, true, false, true, true, null, null, null, null, null, null, null));
    }

    @NotNull
    public final m3.d provideConnectionDiagnostics(@ApplicationContext @NotNull Context context, @NotNull o3.g locationHealthChecker, @NotNull InterfaceC1806c serviceProvider, @NotNull InterfaceC1807d stringProvider, @NotNull InterfaceC1805b backendPingProvider, @NotNull InterfaceC1804a authStateProvider) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(locationHealthChecker, "locationHealthChecker");
        Intrinsics.echo(serviceProvider, "serviceProvider");
        Intrinsics.echo(stringProvider, "stringProvider");
        Intrinsics.echo(backendPingProvider, "backendPingProvider");
        Intrinsics.echo(authStateProvider, "authStateProvider");
        return new m3.d(context, locationHealthChecker, serviceProvider, stringProvider, backendPingProvider, authStateProvider);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h3.c, java.lang.Object] */
    @NotNull
    public final InterfaceC1806c provideConnectionDiagnosticsServiceProvider() {
        return new Object();
    }

    @NotNull
    public final InterfaceC1807d provideConnectionDiagnosticsStringProvider(@ApplicationContext @NotNull Context context) {
        Intrinsics.echo(context, "context");
        return new T9.e(context);
    }

    @NotNull
    public final InterfaceC3139b provideForegroundNotificationProvider() {
        return new C0000c();
    }

    @NotNull
    public final InterfaceC3140c provideInstallationIdProvider() {
        return new d();
    }

    @NotNull
    public final InterfaceC3141d provideLastLocationStore(@NotNull LastSentLocationStore lastSentStore) {
        Intrinsics.echo(lastSentStore, "lastSentStore");
        return new e(lastSentStore);
    }

    @NotNull
    public final LastSentLocationStore provideLastSentLocationStore(@ApplicationContext @NotNull Context context) {
        Intrinsics.echo(context, "context");
        return new SharedPreferencesLastSentLocationStore(context);
    }

    @NotNull
    public final LocationBroadcastConfig provideLocationBroadcastConfig() {
        return new LocationBroadcastConfig("delivery.samurai.android");
    }

    @NotNull
    public final o3.g provideLocationHealthChecker(@ApplicationContext @NotNull Context context, @NotNull AllowMockProvider allowMockProvider) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(allowMockProvider, "allowMockProvider");
        return new o3.g(context, allowMockProvider);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.app.feature.location.api.LocationPayloadMapper, java.lang.Object] */
    @NotNull
    public final LocationPayloadMapper provideLocationPayloadMapper() {
        return new Object();
    }

    @NotNull
    public final w provideLocationSendFacade(@NotNull Z9.c metrics) {
        Intrinsics.echo(metrics, "metrics");
        N connectionState = CaptainLocationMonitoringService.f12067E;
        Intrinsics.echo(connectionState, "connectionState");
        metrics.charlie = "v2";
        if (metrics.india.compareAndSet(false, true)) {
            synchronized (metrics.delta) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                metrics.golf = elapsedRealtime;
                if (connectionState.getValue() != ah.purple) {
                    elapsedRealtime = 0;
                }
                metrics.foxtrot = elapsedRealtime;
                metrics.echo = 0L;
            }
            vf.ad.zulu(metrics.hotel, null, null, new Z9.a(connectionState, metrics, null), 3);
            vf.ad.zulu(metrics.hotel, null, null, new Z9.b(metrics, null), 3);
        }
        return new Z9.d(new ca.o(new Q4.a(18)), metrics);
    }

    @NotNull
    public final InterfaceC3142e provideLogger() {
        return new f();
    }

    @NotNull
    public final InterfaceC1597c provideLoginStateProvider() {
        return new g();
    }

    @NotNull
    public final InterfaceC1598d provideSessionInvalidator() {
        return new h();
    }

    @NotNull
    public final InterfaceC3171a provideStompRuntime(@NotNull Nb.h internetRepository) {
        Intrinsics.echo(internetRepository, "internetRepository");
        return new i(internetRepository);
    }

    @NotNull
    public final StompStateHolder provideStompStateHolder() {
        return new j();
    }

    @NotNull
    public final ad provideStompTokenProvider() {
        return new k();
    }

    @NotNull
    public final ae provideStompUrlProvider() {
        return new l();
    }

    @NotNull
    public final UserInfoProvider provideUserInfoProvider() {
        return new m();
    }
}
