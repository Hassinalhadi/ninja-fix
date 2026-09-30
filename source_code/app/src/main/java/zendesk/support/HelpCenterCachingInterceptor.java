package zendesk.support;

import com.zendesk.util.StringUtils;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class HelpCenterCachingInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        if (StringUtils.hasLength(proceed.headers().get(GuideConstants.CUSTOM_HC_CACHING_HEADER))) {
            return proceed.newBuilder().header(GuideConstants.STANDARD_CACHING_HEADER, proceed.header(GuideConstants.CUSTOM_HC_CACHING_HEADER)).build();
        }
        return proceed;
    }
}
