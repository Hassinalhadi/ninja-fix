package R8;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import s6.AbstractC2726n7;

/* loaded from: classes2.dex */
public abstract class c {
    public static final AbstractC2726n7 alpha;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [s6.n7] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        ?? r02;
        try {
            r02 = new b();
        } catch (ReflectiveOperationException unused) {
            r02 = new Object();
        }
        alpha = r02;
    }

    public static void alpha(AccessibleObject accessibleObject, StringBuilder sb2) {
        Class<?>[] parameterTypes;
        sb2.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i4 = 0; i4 < parameterTypes.length; i4++) {
            if (i4 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i4].getSimpleName());
        }
        sb2.append(')');
    }

    public static String bravo(Constructor constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        alpha(constructor, sb2);
        return sb2.toString();
    }

    public static String charlie(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String delta(AccessibleObject accessibleObject, boolean z2) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + charlie((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            alpha(method, sb2);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb2.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + bravo((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (z2 && Character.isLowerCase(str.charAt(0))) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public static String echo(Exception exc) {
        String str;
        if (exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            String message = exc.getMessage();
            if (message != null && message.contains("to module com.google.gson")) {
                str = "reflection-inaccessible-to-module-gson";
            } else {
                str = "reflection-inaccessible";
            }
            return "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str);
        }
        return "";
    }

    public static void foxtrot(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            StringBuilder victor = Q0.c.victor("Failed making ", delta(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            victor.append(echo(e));
            throw new JsonIOException(victor.toString(), e);
        }
    }
}
