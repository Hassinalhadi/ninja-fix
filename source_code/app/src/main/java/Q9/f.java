package Q9;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import X9.o;
import com.app.network.network.models.EnumTypeAdapter;
import com.app.network.network.models.Jwt;
import com.app.network.network.models.PlatformAreaAttendanceChannelEnum;
import com.app.network.network.models.UserInfo;
import com.google.gson.l;
import com.google.gson.m;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import delivery.samurai.android.AndroidApp;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import t6.V2;
import vg.as;
import vg.at;
import zendesk.core.Constants;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"LQ9/f;", "", "<init>", "()V", "Lcom/google/gson/l;", "provideGson", "()Lcom/google/gson/l;", "Lvg/at;", "getPublicRetrofitClient", "()Lvg/at;", "", "bravo", "()Z", "alpha", "a", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InstallIn({SingletonComponent.class})
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: alpha, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final CertificatePinner bravo = new CertificatePinner.Builder().add("api.samurai.delivery", "sha256/ipet1Zjk9DDxGRtbNAPa7Lr/I4XezDjqdX1kpoc6qV4=", "sha256/a9khLOZJxlnJyrxstg/P+seiDCm+Yf3OsrXyFocBaI0=", "sha256/Douxi77vs4G+Ib/BogbTFymEYq0QSFXwSgVCaZcI09Q=").add("staging-backend.samurai.delivery", "sha256/NopPoy8crQxSUJN9BZX6ViZwgGIjXZxWOkGQmkVv4UU=", "sha256/kIdp6NNEd8wsugYyyIYFsi1ylMCED3hZbSR8ZFsa/A4=", "sha256/mEflZT5enoR1FuXLgYYGqnVEoZvmf9c2bVBpiOjYQ0c=").build();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"LQ9/f$a;", "", "<init>", "()V", "Lokhttp3/CertificatePinner;", "certificatePinner", "Lokhttp3/CertificatePinner;", "alpha", "()Lokhttp3/CertificatePinner;", "", "PUBLIC_CLIENT", "Ljava/lang/String;", "AUTH_CLIENT", "WEB_CLIENT", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Q9.f$a, reason: from kotlin metadata */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CertificatePinner alpha() {
            return f.bravo;
        }

        private Companion() {
        }
    }

    /* compiled from: Dex2C */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b implements Interceptor {
        final f alpha;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(10, b.class);
            Hidden0.special_clinit_10_00(b.class);
        }

        public b(f fVar) {
            this.alpha = fVar;
        }

        @Override // okhttp3.Interceptor
        public final native Response intercept(Interceptor.Chain chain);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements Interceptor {
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            Jwt jwt;
            Intrinsics.echo(chain, "chain");
            Request.Builder newBuilder = chain.request().newBuilder();
            String language = Locale.getDefault().getLanguage();
            Intrinsics.delta(language, "getLanguage(...)");
            newBuilder.header(Constants.ACCEPT_LANGUAGE, language);
            AndroidApp androidApp = AndroidApp.yellow;
            UserInfo sierra = L9.d.sierra(V2.delta());
            if (sierra != null && (jwt = sierra.getJwt()) != null) {
                newBuilder.header("Authorization", "Bearer " + jwt.getJwtToken());
            }
            String romeo = L9.d.romeo(V2.delta());
            if (romeo != null) {
                newBuilder.header("installation-uid", romeo);
            }
            AtomicReference atomicReference = o.alpha;
            for (Map.Entry entry : o.alpha(V2.delta()).entrySet()) {
                newBuilder.header((String) entry.getKey(), (String) entry.getValue());
            }
            return chain.proceed(newBuilder.build());
        }
    }

    /* compiled from: Dex2C */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d implements Interceptor {
        final f alpha;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(11, d.class);
            Hidden0.special_clinit_11_00(d.class);
        }

        public d(f fVar) {
            this.alpha = fVar;
        }

        @Override // okhttp3.Interceptor
        public final native Response intercept(Interceptor.Chain chain);
    }

    /* compiled from: Dex2C */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class e implements Interceptor {
        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(12, e.class);
            Hidden0.special_clinit_12_00(e.class);
        }

        @Override // okhttp3.Interceptor
        public final native Response intercept(Interceptor.Chain chain);
    }

    public final boolean bravo() {
        Object m206constructorimpl;
        boolean z2;
        try {
            Result.Companion companion = Result.INSTANCE;
            E8.b echo = E8.b.echo();
            Intrinsics.delta(echo, "getInstance(...)");
            if (echo.bravo().containsKey("security_tls_pinning_enabled")) {
                z2 = echo.charlie("security_tls_pinning_enabled");
            } else {
                z2 = true;
            }
            m206constructorimpl = Result.m206constructorimpl(Boolean.valueOf(z2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        if (m207exceptionOrNullimpl != null) {
            K7.b.alpha().bravo("security: tls_pinning_rc_failed fallback=true err=".concat(m207exceptionOrNullimpl.getClass().getSimpleName()));
            m206constructorimpl = Boolean.TRUE;
        }
        return ((Boolean) m206constructorimpl).booleanValue();
    }

    @NotNull
    public final at getPublicRetrofitClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (bravo()) {
            builder.certificatePinner(bravo);
        }
        builder.addInterceptor(new b(this));
        builder.addInterceptor(new c());
        builder.addInterceptor(new d(this));
        builder.addInterceptor(new e());
        builder.addInterceptor(new i());
        builder.authenticator(new h());
        long foxtrot = E8.b.echo().foxtrot("connection_timeout_interval");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(foxtrot, timeUnit).readTimeout(E8.b.echo().foxtrot("connection_read_timeout_interval"), timeUnit);
        m mVar = new m();
        mVar.bravo(PlatformAreaAttendanceChannelEnum.class, new EnumTypeAdapter(PlatformAreaAttendanceChannelEnum.class));
        l alpha = mVar.alpha();
        as asVar = new as();
        asVar.alpha("https://api.samurai.delivery/api/v1/");
        asVar.charlie.add(wg.a.charlie(alpha));
        RxJava2CallAdapterFactory create = RxJava2CallAdapterFactory.create();
        Objects.requireNonNull(create, "factory == null");
        asVar.delta.add(create);
        asVar.charlie(builder.build());
        return asVar.bravo();
    }

    @NotNull
    public final l provideGson() {
        return new l();
    }
}
