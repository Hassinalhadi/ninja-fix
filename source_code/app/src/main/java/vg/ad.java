package vg;

import java.lang.reflect.Method;
import okhttp3.Headers;

/* loaded from: classes2.dex */
public final class ad extends A {
    public final /* synthetic */ int delta;
    public final Method echo;
    public final int foxtrot;

    public /* synthetic */ ad(Method method, int i4, int i5) {
        this.delta = i5;
        this.echo = method;
        this.foxtrot = i4;
    }

    @Override // vg.A
    public final void alpha(an anVar, Object obj) {
        switch (this.delta) {
            case 0:
                Headers headers = (Headers) obj;
                if (headers != null) {
                    anVar.foxtrot.addAll(headers);
                    return;
                } else {
                    throw A.oscar(this.echo, this.foxtrot, "Headers parameter must not be null.", new Object[0]);
                }
            default:
                if (obj != null) {
                    anVar.charlie = obj.toString();
                    return;
                } else {
                    throw A.oscar(this.echo, this.foxtrot, "@Url parameter is null.", new Object[0]);
                }
        }
    }
}
