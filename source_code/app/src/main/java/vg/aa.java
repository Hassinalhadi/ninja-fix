package vg;

import java.io.IOException;
import java.lang.reflect.Method;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class aa extends A {
    public final Method delta;
    public final int echo;
    public final m foxtrot;

    public aa(Method method, int i4, m mVar) {
        this.delta = method;
        this.echo = i4;
        this.foxtrot = mVar;
    }

    @Override // vg.A
    public final void alpha(an anVar, Object obj) {
        Method method = this.delta;
        int i4 = this.echo;
        if (obj != null) {
            try {
                anVar.kilo = (RequestBody) this.foxtrot.bravo(obj);
                return;
            } catch (IOException e) {
                throw A.papa(method, e, i4, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
        throw A.oscar(method, i4, "Body parameter value must not be null.", new Object[0]);
    }
}
