package vg;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ay implements ParameterizedType {
    public final Type alpha;
    public final Type purple;
    public final Type[] red;

    public ay(Type type, Type type2, Type... typeArr) {
        boolean z2;
        if (type2 instanceof Class) {
            if (type == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            A.delta(type3);
        }
        this.alpha = type;
        this.purple = type2;
        this.red = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && A.echo(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.red.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.alpha;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.purple;
    }

    public final int hashCode() {
        int i4;
        int hashCode = Arrays.hashCode(this.red) ^ this.purple.hashCode();
        Type type = this.alpha;
        if (type != null) {
            i4 = type.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode ^ i4;
    }

    public final String toString() {
        Type[] typeArr = this.red;
        int length = typeArr.length;
        Type type = this.purple;
        if (length == 0) {
            return A.tango(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(A.tango(type));
        sb2.append("<");
        sb2.append(A.tango(typeArr[0]));
        for (int i4 = 1; i4 < typeArr.length; i4++) {
            sb2.append(", ");
            sb2.append(A.tango(typeArr[i4]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
