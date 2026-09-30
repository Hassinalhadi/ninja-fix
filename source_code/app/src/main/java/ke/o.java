package ke;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;

/* loaded from: classes2.dex */
public abstract class o extends t {
    public final /* synthetic */ int echo = 0;
    public final boolean foxtrot;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ o(Method method, boolean z2, int i4) {
        this(method, z2, r4);
        z2 = (i4 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z2;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.delta(genericParameterTypes, "method.genericParameterTypes");
    }

    @Override // ke.InterfaceC2037e
    public Object call(Object[] args) {
        Object obj;
        Intrinsics.echo(args, "args");
        charlie(args);
        Field field = (Field) this.alpha;
        if (this.charlie != null) {
            obj = ArraysKt.fuchsia(args);
        } else {
            obj = null;
        }
        field.set(obj, ArraysKt.maroon(args));
        return Unit.INSTANCE;
    }

    @Override // ke.t
    public void charlie(Object[] args) {
        switch (this.echo) {
            case 0:
                Intrinsics.echo(args, "args");
                AbstractC2653f6.alpha(this, args);
                if (this.foxtrot && ArraysKt.maroon(args) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.charlie(args);
                return;
        }
    }

    public Object echo(Object[] args, Object obj) {
        Intrinsics.echo(args, "args");
        Object invoke = ((Method) this.alpha).invoke(obj, Arrays.copyOf(args, args.length));
        if (this.foxtrot) {
            return Unit.INSTANCE;
        }
        return invoke;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(Method method, boolean z2, Type[] typeArr) {
        super(method, r0, z2 ? method.getDeclaringClass() : null, typeArr);
        Type genericReturnType = method.getGenericReturnType();
        Intrinsics.delta(genericReturnType, "method.genericReturnType");
        this.foxtrot = Intrinsics.areEqual(genericReturnType, Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(Field field, boolean z2, boolean z10) {
        super(field, TYPE, r7, new Type[]{r1});
        Class TYPE = Void.TYPE;
        Intrinsics.delta(TYPE, "TYPE");
        Class<?> declaringClass = z10 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        Intrinsics.delta(genericType, "field.genericType");
        this.foxtrot = z2;
    }
}
