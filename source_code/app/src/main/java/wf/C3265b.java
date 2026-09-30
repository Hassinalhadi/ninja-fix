package wf;

import Nd.h;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.Nullable;
import vf.C3221z;

/* renamed from: wf.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3265b extends Nd.a implements CoroutineExceptionHandler {

    @Nullable
    private volatile Object _preHandler;

    public C3265b() {
        super(C3221z.alpha);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L15;
     */
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleException(h hVar, Throwable th) {
        Method method;
        Object obj;
        int i4 = Build.VERSION.SDK_INT;
        if (26 <= i4 && i4 < 28) {
            Object obj2 = this._preHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (obj2 != this) {
                method = (Method) obj2;
            } else {
                try {
                    method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                    if (Modifier.isPublic(method.getModifiers())) {
                    }
                } catch (Throwable unused) {
                }
                method = null;
                this._preHandler = method;
            }
            if (method != null) {
                obj = method.invoke(null, null);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
