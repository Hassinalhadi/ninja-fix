package zendesk.core;

import android.content.Context;
import com.zendesk.util.LocaleUtil;
import com.zendesk.util.StringUtils;
import java.io.IOException;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
class AcceptLanguageHeaderInterceptor implements Interceptor {
    private Context context;

    public AcceptLanguageHeaderInterceptor(Context context) {
        this.context = context;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Locale currentLocale = DeviceInfo.getCurrentLocale(this.context);
        if (StringUtils.isEmpty(request.header(Constants.ACCEPT_LANGUAGE)) && currentLocale != null) {
            return chain.proceed(request.newBuilder().addHeader(Constants.ACCEPT_LANGUAGE, LocaleUtil.toLanguageTag(currentLocale)).build());
        }
        return chain.proceed(request);
    }
}
