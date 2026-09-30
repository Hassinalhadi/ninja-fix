package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e implements WildcardType, Serializable {
    public final Type alpha;
    public final Type purple;

    public e(Type[] typeArr, Type[] typeArr2) {
        boolean z2;
        boolean z10;
        if (typeArr2.length <= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        f.bravo(z2);
        if (typeArr.length == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        f.bravo(z10);
        if (typeArr2.length == 1) {
            Objects.requireNonNull(typeArr2[0]);
            f.charlie(typeArr2[0]);
            f.bravo(typeArr[0] == Object.class);
            this.purple = f.alpha(typeArr2[0]);
            this.alpha = Object.class;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        f.charlie(typeArr[0]);
        this.purple = null;
        this.alpha = f.alpha(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && f.echo(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.purple;
        if (type != null) {
            return new Type[]{type};
        }
        return f.alpha;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.alpha};
    }

    public final int hashCode() {
        int i4;
        Type type = this.purple;
        if (type != null) {
            i4 = type.hashCode() + 31;
        } else {
            i4 = 1;
        }
        return i4 ^ (this.alpha.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.purple;
        if (type != null) {
            return "? super " + f.lima(type);
        }
        Type type2 = this.alpha;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + f.lima(type2);
    }
}
