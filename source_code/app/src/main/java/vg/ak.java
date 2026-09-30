package vg;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* loaded from: classes2.dex */
public final class ak extends C3222a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13999a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak(int i4) {
        super(7);
        this.f13999a = i4;
    }

    @Override // vg.C3222a
    public String delta(Method method, int i4) {
        Parameter[] parameters;
        boolean isNamePresent;
        String name;
        switch (this.f13999a) {
            case 1:
                parameters = method.getParameters();
                Parameter parameter = parameters[i4];
                isNamePresent = parameter.isNamePresent();
                if (isNamePresent) {
                    StringBuilder sb2 = new StringBuilder("parameter '");
                    name = parameter.getName();
                    sb2.append(name);
                    sb2.append('\'');
                    return sb2.toString();
                }
                return super.delta(method, i4);
            default:
                return super.delta(method, i4);
        }
    }

    @Override // vg.C3222a
    public final Object echo(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f13999a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return A.kilo(method, cls, obj, objArr);
                }
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            default:
                return A.kilo(method, cls, obj, objArr);
        }
    }

    @Override // vg.C3222a
    public final boolean foxtrot(Method method) {
        boolean isDefault;
        boolean isDefault2;
        switch (this.f13999a) {
            case 0:
                isDefault = method.isDefault();
                return isDefault;
            default:
                isDefault2 = method.isDefault();
                return isDefault2;
        }
    }
}
