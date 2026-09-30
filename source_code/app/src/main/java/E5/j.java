package E5;

import J3.x;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s6.W5;

/* loaded from: classes3.dex */
public final class j implements J3.s, J3.f, K1.j, p7.l {
    public final /* synthetic */ int alpha;
    public Context purple;

    public /* synthetic */ j() {
        this.alpha = 0;
    }

    @Override // J3.f
    public Class alpha() {
        switch (this.alpha) {
            case 2:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p7.m
    public Object bravo() {
        return this.purple;
    }

    @Override // K1.j
    public void charlie(W5 w52) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new K1.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new A2.s(this, w52, threadPoolExecutor, 9));
    }

    @Override // J3.f
    public Object delta(int i4, Resources.Theme theme, Resources resources) {
        switch (this.alpha) {
            case 2:
                return resources.openRawResourceFd(i4);
            default:
                return resources.openRawResource(i4);
        }
    }

    @Override // J3.f
    public void echo(Object obj) {
        switch (this.alpha) {
            case 2:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, E5.k] */
    public k foxtrot() {
        Context context = this.purple;
        if (context != null) {
            ?? obj = new Object();
            obj.alpha = G5.a.alpha(m.alpha);
            F5.e eVar = new F5.e(3, context);
            obj.purple = eVar;
            obj.red = G5.a.alpha(new F5.g(eVar, new F5.e(0, eVar), 0));
            F5.e eVar2 = obj.purple;
            obj.silver = new F5.e(2, eVar2);
            Kd.a alpha = G5.a.alpha(new F5.g(obj.silver, G5.a.alpha(new F5.e(1, eVar2)), 1));
            obj.teal = alpha;
            n nVar = new n(1);
            F5.e eVar3 = obj.purple;
            t tVar = new t(eVar3, alpha, nVar, 1);
            Kd.a aVar = obj.alpha;
            Kd.a aVar2 = obj.red;
            obj.white = G5.a.alpha(new t(new J5.b(aVar, aVar2, tVar, alpha, alpha), new K5.j(eVar3, aVar2, alpha, tVar, aVar, alpha, alpha), new K5.l(aVar, alpha, tVar, alpha), 0));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    @Override // J3.s
    public J3.r sierra(x xVar) {
        switch (this.alpha) {
            case 2:
                return new J3.b(this.purple, this);
            case 3:
                return new J3.b(this.purple, this);
            case 4:
                return new J3.b(this.purple, xVar.bravo(Integer.class, InputStream.class));
            default:
                return new J3.n(this.purple, 2);
        }
    }

    public /* synthetic */ j(Context context, int i4) {
        this.alpha = i4;
        this.purple = context;
    }

    public j(Context context) {
        this.alpha = 5;
        this.purple = context.getApplicationContext();
    }
}
