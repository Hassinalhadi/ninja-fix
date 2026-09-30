package Ne;

/* loaded from: classes2.dex */
public final class f implements Comparable {
    public final String alpha;
    public final boolean purple;

    public f(String str, boolean z2) {
        if (str != null) {
            this.alpha = str;
            this.purple = z2;
        } else {
            alpha(0);
            throw null;
        }
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            objArr[0] = "name";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
                } else {
                    objArr[1] = "asStringStripSpecialMarkers";
                }
            } else {
                objArr[1] = "getIdentifier";
            }
        } else {
            objArr[1] = "asString";
        }
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static f delta(String str) {
        if (str != null) {
            if (str.startsWith("<")) {
                return golf(str);
            }
            return echo(str);
        }
        alpha(8);
        throw null;
    }

    public static f echo(String str) {
        if (str != null) {
            return new f(str, false);
        }
        alpha(5);
        throw null;
    }

    public static boolean foxtrot(String str) {
        if (str != null) {
            if (str.isEmpty() || str.startsWith("<")) {
                return false;
            }
            for (int i4 = 0; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
        alpha(6);
        throw null;
    }

    public static f golf(String str) {
        if (str != null) {
            if (str.startsWith("<")) {
                return new f(str, true);
            }
            throw new IllegalArgumentException("special name must start with '<': ".concat(str));
        }
        alpha(7);
        throw null;
    }

    public final String bravo() {
        String str = this.alpha;
        if (str != null) {
            return str;
        }
        alpha(1);
        throw null;
    }

    public final String charlie() {
        if (!this.purple) {
            String bravo = bravo();
            if (bravo != null) {
                return bravo;
            }
            alpha(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.alpha.compareTo(((f) obj).alpha);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.purple != fVar.purple || !this.alpha.equals(fVar.alpha)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + (this.purple ? 1 : 0);
    }

    public final String toString() {
        return this.alpha;
    }
}
