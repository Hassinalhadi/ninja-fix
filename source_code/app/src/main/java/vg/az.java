package vg;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes2.dex */
public final class az implements WildcardType {
    public final Type alpha;
    public final Type purple;

    public az(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    typeArr2[0].getClass();
                    A.delta(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.purple = typeArr2[0];
                        this.alpha = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                typeArr[0].getClass();
                A.delta(typeArr[0]);
                this.purple = null;
                this.alpha = typeArr[0];
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && A.echo(this, (WildcardType) obj)) {
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
        return A.alpha;
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
            return "? super " + A.tango(type);
        }
        Type type2 = this.alpha;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + A.tango(type2);
    }
}
