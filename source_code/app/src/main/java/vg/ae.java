package vg;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class ae extends A {
    public final /* synthetic */ int delta = 0;
    public final Method echo;
    public final int foxtrot;
    public final m golf;
    public final Object hotel;

    public ae(Method method, int i4, Headers headers, m mVar) {
        this.echo = method;
        this.foxtrot = i4;
        this.hotel = headers;
        this.golf = mVar;
    }

    @Override // vg.A
    public final void alpha(an anVar, Object obj) {
        m mVar = this.golf;
        Object obj2 = this.hotel;
        int i4 = this.foxtrot;
        Method method = this.echo;
        switch (this.delta) {
            case 0:
                if (obj != null) {
                    try {
                        anVar.india.addPart((Headers) obj2, (RequestBody) mVar.bravo(obj));
                        return;
                    } catch (IOException e) {
                        throw A.oscar(method, i4, "Unable to convert " + obj + " to RequestBody", e);
                    }
                }
                return;
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                anVar.india.addPart(Headers.of("Content-Disposition", ao.ad.gray("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (RequestBody) mVar.bravo(value));
                            } else {
                                throw A.oscar(method, i4, ao.ad.gray("Part map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw A.oscar(method, i4, "Part map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw A.oscar(method, i4, "Part map was null.", new Object[0]);
        }
    }

    public ae(Method method, int i4, m mVar, String str) {
        this.echo = method;
        this.foxtrot = i4;
        this.golf = mVar;
        this.hotel = str;
    }
}
