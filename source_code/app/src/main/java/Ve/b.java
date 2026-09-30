package Ve;

/* loaded from: classes2.dex */
public final class b {
    public final String alpha;

    public b(String str) {
        if (str != null) {
            this.alpha = str;
        } else {
            alpha(5);
            throw null;
        }
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 3 && i4 != 6 && i4 != 7 && i4 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 3 && i4 != 6 && i4 != 7 && i4 != 8) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i4 != 3) {
            if (i4 != 6) {
                if (i4 != 7) {
                    if (i4 != 8) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    } else {
                        objArr[1] = "getInternalName";
                    }
                } else {
                    objArr[1] = "getPackageFqName";
                }
            } else {
                objArr[1] = "getFqNameForClassNameWithoutDollars";
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i4) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 3 || i4 == 6 || i4 == 7 || i4 == 8) {
            throw new IllegalStateException(format);
        }
    }

    public static b bravo(Ne.b bVar) {
        Ne.c golf = bVar.golf();
        String replace = bVar.hotel().bravo().replace('.', '$');
        if (golf.delta()) {
            return new b(replace);
        }
        return new b(golf.bravo().replace('.', '/') + "/" + replace);
    }

    public static b charlie(Ne.c cVar) {
        if (cVar != null) {
            return new b(cVar.bravo().replace('.', '/'));
        }
        alpha(2);
        throw null;
    }

    public static b delta(String str) {
        if (str != null) {
            return new b(str);
        }
        alpha(0);
        throw null;
    }

    public final String echo() {
        String str = this.alpha;
        if (str != null) {
            return str;
        }
        alpha(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            return this.alpha.equals(((b) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return this.alpha;
    }
}
