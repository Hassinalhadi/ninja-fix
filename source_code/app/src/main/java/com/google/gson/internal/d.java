package com.google.gson.internal;

import androidx.appcompat.widget.P0;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d implements ParameterizedType, Serializable {
    public final Type alpha;
    public final Type purple;
    public final Type[] red;

    public d(Type type, Class cls, Type... typeArr) {
        Type alpha;
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException(P0.blue(cls, "Must specify owner type for "));
        }
        if (type == null) {
            alpha = null;
        } else {
            alpha = f.alpha(type);
        }
        this.alpha = alpha;
        this.purple = f.alpha(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.red = typeArr2;
        int length = typeArr2.length;
        for (int i4 = 0; i4 < length; i4++) {
            Objects.requireNonNull(this.red[i4]);
            f.charlie(this.red[i4]);
            Type[] typeArr3 = this.red;
            typeArr3[i4] = f.alpha(typeArr3[i4]);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && f.echo(this, (ParameterizedType) obj)) {
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
            return f.lima(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(f.lima(type));
        sb2.append("<");
        sb2.append(f.lima(typeArr[0]));
        for (int i4 = 1; i4 < length; i4++) {
            sb2.append(", ");
            sb2.append(f.lima(typeArr[i4]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
