package je;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import s6.AbstractC2671h6;
import s6.AbstractC2751q5;

/* loaded from: classes2.dex */
public final class ax extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ay purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax(ay ayVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = ayVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        boolean z2;
        AccessibleObject accessibleObject;
        ay ayVar = this.purple;
        switch (this.alpha) {
            case 0:
                return new aw(ayVar);
            default:
                Object whiskey = ayVar.whiskey();
                try {
                    Object obj2 = L.e;
                    if (ayVar.victor()) {
                        obj = AbstractC2671h6.alpha(ayVar.f12891b, ayVar.tango());
                    } else {
                        obj = null;
                    }
                    if (obj == obj2) {
                        obj = null;
                    }
                    ayVar.victor();
                    if (((AccessibleObject) whiskey) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        accessibleObject = (AccessibleObject) whiskey;
                    } else {
                        accessibleObject = null;
                    }
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(AbstractC2751q5.alpha(ayVar));
                    }
                    if (whiskey == null) {
                        return null;
                    }
                    if (whiskey instanceof Field) {
                        return ((Field) whiskey).get(obj);
                    }
                    if (whiskey instanceof Method) {
                        int length = ((Method) whiskey).getParameterTypes().length;
                        if (length != 0) {
                            if (length != 1) {
                                if (length == 2) {
                                    Method method = (Method) whiskey;
                                    Class<?> cls = ((Method) whiskey).getParameterTypes()[1];
                                    Intrinsics.delta(cls, "fieldOrMethod.parameterTypes[1]");
                                    return method.invoke(null, obj, a0.echo(cls));
                                }
                                throw new AssertionError("delegate method " + whiskey + " should take 0, 1, or 2 parameters");
                            }
                            Method method2 = (Method) whiskey;
                            if (obj == null) {
                                Class<?> cls2 = ((Method) whiskey).getParameterTypes()[0];
                                Intrinsics.delta(cls2, "fieldOrMethod.parameterTypes[0]");
                                obj = a0.echo(cls2);
                            }
                            return method2.invoke(null, obj);
                        }
                        return ((Method) whiskey).invoke(null, null);
                    }
                    throw new AssertionError("delegate field/method " + whiskey + " neither field nor method");
                } catch (IllegalAccessException e) {
                    throw new IllegalPropertyDelegateAccessException(e);
                }
        }
    }
}
