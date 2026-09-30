package com.squareup.moshi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class au implements InvocationHandler {
    public final /* synthetic */ Class alpha;

    public au(Class cls) {
        this.alpha = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        name.getClass();
        Class cls = this.alpha;
        char c3 = 65535;
        switch (name.hashCode()) {
            case -1776922004:
                if (name.equals("toString")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1295482945:
                if (name.equals("equals")) {
                    c3 = 1;
                    break;
                }
                break;
            case 147696667:
                if (name.equals("hashCode")) {
                    c3 = 2;
                    break;
                }
                break;
            case 1444986633:
                if (name.equals("annotationType")) {
                    c3 = 3;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return "@" + cls.getName() + "()";
            case 1:
                return Boolean.valueOf(cls.isInstance(objArr[0]));
            case 2:
                return 0;
            case 3:
                return cls;
            default:
                return method.invoke(obj, objArr);
        }
    }
}
