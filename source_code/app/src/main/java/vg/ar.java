package vg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class ar implements InvocationHandler {
    public final Object[] alpha = new Object[0];
    public final /* synthetic */ Class bravo;
    public final /* synthetic */ at charlie;

    public ar(at atVar, Class cls) {
        this.charlie = atVar;
        this.bravo = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r0 = vg.au.alpha(r9, r1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r9.alpha.put(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006b, code lost:
    
        r0 = (vg.au) r0;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.alpha;
        }
        Object[] objArr2 = objArr;
        C3222a c3222a = aj.bravo;
        boolean foxtrot = c3222a.foxtrot(method);
        Class cls = this.bravo;
        if (foxtrot) {
            return c3222a.echo(method, cls, obj, objArr2);
        }
        at atVar = this.charlie;
        while (true) {
            Object obj3 = atVar.alpha.get(method);
            if (obj3 instanceof au) {
                obj2 = (au) obj3;
                break;
            }
            if (obj3 == null) {
                Object obj4 = new Object();
                synchronized (obj4) {
                    try {
                        obj3 = atVar.alpha.putIfAbsent(method, obj4);
                        if (obj3 == null) {
                            try {
                                break;
                            } catch (Throwable th) {
                                atVar.alpha.remove(method);
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (obj3) {
                try {
                    Object obj5 = atVar.alpha.get(method);
                    if (obj5 != null) {
                        break;
                    }
                } finally {
                }
            }
            break;
        }
        s sVar = (s) obj2;
        return sVar.bravo(new y(sVar.alpha, obj, objArr2, sVar.bravo, sVar.charlie), objArr2);
    }
}
