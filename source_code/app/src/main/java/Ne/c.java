package Ne;

/* loaded from: classes2.dex */
public final class c {
    public static final c charlie = new c("");
    public final e alpha;
    public transient c bravo;

    public c(String str) {
        if (str != null) {
            this.alpha = new e(str, this);
        } else {
            alpha(1);
            throw null;
        }
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i5 = 2;
                break;
            case 8:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i4) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i4) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static c juliet(f fVar) {
        if (fVar != null) {
            if (fVar != null) {
                return new c(new e(fVar.bravo(), charlie.india(), fVar));
            }
            e.alpha(16);
            throw null;
        }
        alpha(13);
        throw null;
    }

    public final String bravo() {
        String str = this.alpha.alpha;
        if (str != null) {
            return str;
        }
        e.alpha(4);
        throw null;
    }

    public final c charlie(f fVar) {
        if (fVar != null) {
            return new c(this.alpha.bravo(fVar), this);
        }
        alpha(8);
        throw null;
    }

    public final boolean delta() {
        return this.alpha.alpha.isEmpty();
    }

    public final c echo() {
        c cVar = this.bravo;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            alpha(6);
            throw null;
        }
        if (!delta()) {
            e eVar = this.alpha;
            e eVar2 = eVar.charlie;
            if (eVar2 == null) {
                if (!eVar.alpha.isEmpty()) {
                    eVar.charlie();
                    eVar2 = eVar.charlie;
                    if (eVar2 == null) {
                        e.alpha(8);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("root");
                }
            }
            c cVar2 = new c(eVar2);
            this.bravo = cVar2;
            return cVar2;
        }
        throw new IllegalStateException("root");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.alpha.equals(((c) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final f foxtrot() {
        f foxtrot = this.alpha.foxtrot();
        if (foxtrot != null) {
            return foxtrot;
        }
        alpha(9);
        throw null;
    }

    public final f golf() {
        e eVar = this.alpha;
        if (eVar.alpha.isEmpty()) {
            f fVar = e.echo;
            if (fVar != null) {
                return fVar;
            }
            e.alpha(12);
            throw null;
        }
        f foxtrot = eVar.foxtrot();
        if (foxtrot != null) {
            return foxtrot;
        }
        e.alpha(13);
        throw null;
    }

    public final int hashCode() {
        return this.alpha.alpha.hashCode();
    }

    public final boolean hotel(f fVar) {
        if (fVar != null) {
            String str = this.alpha.alpha;
            if (str.isEmpty()) {
                return false;
            }
            int indexOf = str.indexOf(46);
            String bravo = fVar.bravo();
            if (indexOf == -1) {
                indexOf = Math.max(str.length(), bravo.length());
            }
            return str.regionMatches(0, bravo, 0, indexOf);
        }
        alpha(12);
        throw null;
    }

    public final e india() {
        e eVar = this.alpha;
        if (eVar != null) {
            return eVar;
        }
        alpha(5);
        throw null;
    }

    public final String toString() {
        return this.alpha.toString();
    }

    public c(e eVar) {
        if (eVar != null) {
            this.alpha = eVar;
        } else {
            alpha(2);
            throw null;
        }
    }

    public c(e eVar, c cVar) {
        this.alpha = eVar;
        this.bravo = cVar;
    }
}
