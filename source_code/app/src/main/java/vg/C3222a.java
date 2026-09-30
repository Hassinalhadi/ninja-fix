package vg;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: vg.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3222a implements m {
    public static final C3222a purple = new C3222a(0);
    public static final C3222a red = new C3222a(1);
    public static final C3222a silver = new C3222a(2);
    public static final C3222a teal = new C3222a(3);
    public static final C3222a white = new C3222a(4);
    public static final C3222a yellow = new C3222a(5);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C3222a(int i4) {
        this.alpha = i4;
    }

    public List alpha(Executor executor) {
        return Collections.singletonList(new o(executor));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [Tf.m, Tf.l, java.lang.Object] */
    @Override // vg.m
    public Object bravo(Object obj) {
        switch (this.alpha) {
            case 0:
                return obj.toString();
            case 1:
                ResponseBody responseBody = (ResponseBody) obj;
                try {
                    ?? obj2 = new Object();
                    responseBody.get$this_asResponseBody().g(obj2);
                    ResponseBody create = ResponseBody.create(responseBody.get$contentType(), responseBody.get$contentLength(), (Tf.m) obj2);
                    responseBody.close();
                    return create;
                } catch (Throwable th) {
                    responseBody.close();
                    throw th;
                }
            case 2:
                return (RequestBody) obj;
            case 3:
                return (ResponseBody) obj;
            case 4:
                ((ResponseBody) obj).close();
                return Unit.INSTANCE;
            default:
                ((ResponseBody) obj).close();
                return null;
        }
    }

    public List charlie() {
        return Collections.EMPTY_LIST;
    }

    public String delta(Method method, int i4) {
        return "parameter #" + (i4 + 1);
    }

    public Object echo(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean foxtrot(Method method) {
        return false;
    }
}
