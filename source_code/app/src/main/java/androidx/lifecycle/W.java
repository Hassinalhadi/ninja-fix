package androidx.lifecycle;

import android.app.Application;
import androidx.appcompat.widget.P0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class W {
    public static final List alpha = CollectionsKt.listOf(Application.class, P.class);
    public static final List bravo = kotlin.collections.ab.juliet(P.class);

    public static final Constructor alpha(Class modelClass, List signature) {
        Intrinsics.echo(modelClass, "modelClass");
        Intrinsics.echo(signature, "signature");
        Lf.h golf = kotlin.jvm.internal.x.golf(modelClass.getConstructors());
        while (golf.hasNext()) {
            Constructor constructor = (Constructor) golf.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.delta(parameterTypes, "getParameterTypes(...)");
            List b2 = ArraysKt.b(parameterTypes);
            if (Intrinsics.areEqual(signature, b2)) {
                return constructor;
            }
            if (signature.size() == b2.size() && b2.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final Y bravo(Class modelClass, Constructor constructor, Object... objArr) {
        Intrinsics.echo(modelClass, "modelClass");
        try {
            return (Y) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(P0.blue(modelClass, "Failed to access "), e);
        } catch (InstantiationException e4) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(P0.blue(modelClass, "An exception happened in constructor of "), e5.getCause());
        }
    }
}
