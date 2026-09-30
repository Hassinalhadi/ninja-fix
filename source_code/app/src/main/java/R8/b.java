package R8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import s6.AbstractC2726n7;

/* loaded from: classes2.dex */
public final class b extends AbstractC2726n7 {
    public final Method alpha = Class.class.getMethod("isRecord", null);
    public final Method bravo = Class.class.getMethod("getRecordComponents", null);
    public final Method charlie;
    public final Method delta;

    public b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.charlie = cls.getMethod("getName", null);
        this.delta = cls.getMethod("getType", null);
    }

    @Override // s6.AbstractC2726n7
    public final Method bravo(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // s6.AbstractC2726n7
    public final Constructor charlie(Class cls) {
        try {
            Object[] objArr = (Object[]) this.bravo.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i4 = 0; i4 < objArr.length; i4++) {
                clsArr[i4] = (Class) this.delta.invoke(objArr[i4], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // s6.AbstractC2726n7
    public final String[] delta(Class cls) {
        try {
            Object[] objArr = (Object[]) this.bravo.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i4 = 0; i4 < objArr.length; i4++) {
                strArr[i4] = (String) this.charlie.invoke(objArr[i4], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // s6.AbstractC2726n7
    public final boolean echo(Class cls) {
        try {
            return ((Boolean) this.alpha.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
