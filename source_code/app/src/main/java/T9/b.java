package T9;

import Pd.i;
import Xd.l;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.k;
import kotlin.text.r;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import vf.ab;
import w9.h;

/* loaded from: classes2.dex */
public final class b extends i implements l {
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(2, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [okhttp3.Interceptor, java.lang.Object] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
        boolean z2;
        Object m206constructorimpl2;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        long currentTimeMillis = System.currentTimeMillis();
        long j5 = h.alpha;
        if (j5 != 0 && currentTimeMillis - j5 < 10000) {
            z2 = h.bravo;
        } else {
            h.alpha = currentTimeMillis;
            String str = "https://api.samurai.delivery/api/v1/";
            boolean z10 = false;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (!r.golf("https://api.samurai.delivery/api/v1/", "/", false)) {
                    str = "https://api.samurai.delivery/api/v1//";
                }
                m206constructorimpl = Result.m206constructorimpl(str.concat("ping"));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m207exceptionOrNullimpl(m206constructorimpl) == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long millis = timeUnit.toMillis(2L);
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                OkHttpClient.Builder readTimeout = builder.connectTimeout(millis, timeUnit2).readTimeout(timeUnit.toMillis(2L), timeUnit2);
                readTimeout.addInterceptor(new Object());
                try {
                    Response execute = FirebasePerfOkHttpClient.execute(readTimeout.build().newCall(new Request.Builder().url((String) m206constructorimpl).get().build()));
                    try {
                        int code = execute.code();
                        if (200 <= code && code < 400) {
                            z10 = true;
                        }
                        execute.close();
                        m206constructorimpl2 = Result.m206constructorimpl(Boolean.valueOf(z10));
                    } finally {
                    }
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th2));
                }
                Boolean bool = Boolean.FALSE;
                if (m206constructorimpl2 instanceof k) {
                    m206constructorimpl2 = bool;
                }
                Boolean bool2 = (Boolean) m206constructorimpl2;
                h.bravo = bool2.booleanValue();
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
        }
        return Boolean.valueOf(z2);
    }
}
