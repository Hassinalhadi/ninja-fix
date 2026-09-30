package ge;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ad implements ParameterizedType, Type {
    public final Class alpha;
    public final Type purple;
    public final Type[] red;

    public ad(Class cls, Type type, ArrayList arrayList) {
        this.alpha = cls;
        this.purple = type;
        this.red = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (Intrinsics.areEqual(this.alpha, parameterizedType.getRawType()) && Intrinsics.areEqual(this.purple, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.red, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.red;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.purple;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.alpha;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Class cls = this.alpha;
        Type type = this.purple;
        if (type != null) {
            sb2.append(ah.alpha(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(ah.alpha(cls));
        }
        Type[] typeArr = this.red;
        if (typeArr.length != 0) {
            ac acVar = ac.alpha;
            ArraysKt___ArraysKt.papa(typeArr, sb2, ", ", "<", ">", "...", ac.alpha);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode();
        Type type = this.purple;
        if (type != null) {
            i4 = type.hashCode();
        } else {
            i4 = 0;
        }
        return (hashCode ^ i4) ^ Arrays.hashCode(this.red);
    }

    public final String toString() {
        return getTypeName();
    }
}
