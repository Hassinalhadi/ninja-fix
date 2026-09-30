package Ne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {
    public static final f echo = f.golf("<root>");
    public static final Pattern foxtrot = Pattern.compile("\\.");
    public static final d golf = new Object();
    public final String alpha;
    public transient c bravo;
    public transient e charlie;
    public transient f delta;

    public e(String str, c cVar) {
        if (str == null) {
            alpha(0);
            throw null;
        }
        if (cVar != null) {
            this.alpha = str;
            this.bravo = cVar;
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i5 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1) {
            switch (i4) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i4) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public final e bravo(f fVar) {
        String str;
        if (fVar != null) {
            String str2 = this.alpha;
            if (str2.isEmpty()) {
                str = fVar.bravo();
            } else {
                str = str2 + "." + fVar.bravo();
            }
            return new e(str, this, fVar);
        }
        alpha(9);
        throw null;
    }

    public final void charlie() {
        String str = this.alpha;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.delta = f.delta(str.substring(lastIndexOf + 1));
            this.charlie = new e(str.substring(0, lastIndexOf));
        } else {
            this.delta = f.delta(str);
            this.charlie = c.charlie.india();
        }
    }

    public final boolean delta() {
        if (this.bravo == null) {
            String str = this.alpha;
            if (str != null) {
                if (str.indexOf(60) >= 0) {
                    return false;
                }
                return true;
            }
            alpha(4);
            throw null;
        }
        return true;
    }

    public final List echo() {
        List list;
        String str = this.alpha;
        if (str.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            String[] split = foxtrot.split(str);
            Intrinsics.echo(split, "<this>");
            d transform = golf;
            Intrinsics.echo(transform, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                arrayList.add(f.delta(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        alpha(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && this.alpha.equals(((e) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final f foxtrot() {
        f fVar = this.delta;
        if (fVar != null) {
            if (fVar != null) {
                return fVar;
            }
            alpha(10);
            throw null;
        }
        if (!this.alpha.isEmpty()) {
            charlie();
            f fVar2 = this.delta;
            if (fVar2 != null) {
                return fVar2;
            }
            alpha(11);
            throw null;
        }
        throw new IllegalStateException("root");
    }

    public final c golf() {
        c cVar = this.bravo;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            alpha(5);
            throw null;
        }
        c cVar2 = new c(this);
        this.bravo = cVar2;
        return cVar2;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        String str = this.alpha;
        if (str.isEmpty()) {
            str = echo.bravo();
        }
        if (str != null) {
            return str;
        }
        alpha(17);
        throw null;
    }

    public e(String str) {
        if (str != null) {
            this.alpha = str;
        } else {
            alpha(2);
            throw null;
        }
    }

    public e(String str, e eVar, f fVar) {
        if (str != null) {
            this.alpha = str;
            this.charlie = eVar;
            this.delta = fVar;
            return;
        }
        alpha(3);
        throw null;
    }
}
