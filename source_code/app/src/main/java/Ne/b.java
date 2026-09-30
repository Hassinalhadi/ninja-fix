package Ne;

import com.clevertap.android.sdk.variables.CTVariableUtils;

/* loaded from: classes2.dex */
public final class b {
    public final c alpha;
    public final c bravo;
    public final boolean charlie;

    public b(c cVar, c cVar2, boolean z2) {
        if (cVar != null) {
            this.alpha = cVar;
            this.bravo = cVar2;
            this.charlie = z2;
            return;
        }
        alpha(1);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 5 && i4 != 6 && i4 != 7 && i4 != 9) {
            switch (i4) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i4 != 5 && i4 != 6 && i4 != 7 && i4 != 9) {
                switch (i4) {
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        i5 = 3;
                        break;
                }
                Object[] objArr = new Object[i5];
                switch (i4) {
                    case 1:
                    case 3:
                        objArr[0] = "packageFqName";
                        break;
                    case 2:
                        objArr[0] = "relativeClassName";
                        break;
                    case 4:
                        objArr[0] = "topLevelName";
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                        break;
                    case 8:
                        objArr[0] = "name";
                        break;
                    case 10:
                        objArr[0] = "segment";
                        break;
                    case 11:
                    case 12:
                        objArr[0] = CTVariableUtils.STRING;
                        break;
                    default:
                        objArr[0] = "topLevelFqName";
                        break;
                }
                if (i4 == 5) {
                    if (i4 != 6) {
                        if (i4 != 7) {
                            if (i4 != 9) {
                                switch (i4) {
                                    case 13:
                                    case 14:
                                        objArr[1] = "asString";
                                        break;
                                    case 15:
                                    case 16:
                                        objArr[1] = "asFqNameString";
                                        break;
                                    default:
                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                                        break;
                                }
                            } else {
                                objArr[1] = "asSingleFqName";
                            }
                        } else {
                            objArr[1] = "getShortClassName";
                        }
                    } else {
                        objArr[1] = "getRelativeClassName";
                    }
                } else {
                    objArr[1] = "getPackageFqName";
                }
                switch (i4) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        objArr[2] = "<init>";
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        break;
                    case 8:
                        objArr[2] = "createNestedClassId";
                        break;
                    case 10:
                        objArr[2] = "startsWith";
                        break;
                    case 11:
                    case 12:
                        objArr[2] = "fromString";
                        break;
                    default:
                        objArr[2] = "topLevel";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 5 && i4 != 6 && i4 != 7 && i4 != 9) {
                    switch (i4) {
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i5 = 2;
            Object[] objArr2 = new Object[i5];
            switch (i4) {
            }
            if (i4 == 5) {
            }
            switch (i4) {
            }
            String format2 = String.format(str, objArr2);
            if (i4 != 5) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 5) {
            switch (i4) {
            }
            Object[] objArr22 = new Object[i5];
            switch (i4) {
            }
            if (i4 == 5) {
            }
            switch (i4) {
            }
            String format22 = String.format(str, objArr22);
            if (i4 != 5) {
            }
            throw new IllegalStateException(format22);
        }
        i5 = 2;
        Object[] objArr222 = new Object[i5];
        switch (i4) {
        }
        if (i4 == 5) {
        }
        switch (i4) {
        }
        String format222 = String.format(str, objArr222);
        if (i4 != 5) {
        }
        throw new IllegalStateException(format222);
    }

    public static b echo(String str, boolean z2) {
        String str2;
        if (str != null) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf == -1) {
                str2 = "";
            } else {
                String replace = str.substring(0, lastIndexOf).replace('/', '.');
                str = str.substring(lastIndexOf + 1);
                str2 = replace;
            }
            return new b(new c(str2), new c(str), z2);
        }
        alpha(12);
        throw null;
    }

    public static b juliet(c cVar) {
        if (cVar != null) {
            return new b(cVar.echo(), cVar.foxtrot());
        }
        alpha(0);
        throw null;
    }

    public final c bravo() {
        c cVar = this.alpha;
        boolean delta = cVar.delta();
        c cVar2 = this.bravo;
        if (delta) {
            if (cVar2 != null) {
                return cVar2;
            }
            alpha(9);
            throw null;
        }
        return new c(cVar.bravo() + "." + cVar2.bravo());
    }

    public final String charlie() {
        c cVar = this.alpha;
        boolean delta = cVar.delta();
        c cVar2 = this.bravo;
        if (delta) {
            return cVar2.bravo();
        }
        String str = cVar.bravo().replace('.', '/') + "/" + cVar2.bravo();
        if (str != null) {
            return str;
        }
        alpha(14);
        throw null;
    }

    public final b delta(f fVar) {
        if (fVar != null) {
            return new b(golf(), this.bravo.charlie(fVar), this.charlie);
        }
        alpha(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.alpha.equals(bVar.alpha) && this.bravo.equals(bVar.bravo) && this.charlie == bVar.charlie) {
                return true;
            }
        }
        return false;
    }

    public final b foxtrot() {
        c echo = this.bravo.echo();
        if (echo.delta()) {
            return null;
        }
        return new b(golf(), echo, this.charlie);
    }

    public final c golf() {
        c cVar = this.alpha;
        if (cVar != null) {
            return cVar;
        }
        alpha(5);
        throw null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.charlie).hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31);
    }

    public final c hotel() {
        c cVar = this.bravo;
        if (cVar != null) {
            return cVar;
        }
        alpha(6);
        throw null;
    }

    public final f india() {
        f foxtrot = this.bravo.foxtrot();
        if (foxtrot != null) {
            return foxtrot;
        }
        alpha(7);
        throw null;
    }

    public final String toString() {
        if (this.alpha.delta()) {
            return "/".concat(charlie());
        }
        return charlie();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, f fVar) {
        this(cVar, c.juliet(fVar), false);
        if (cVar == null) {
            alpha(3);
            throw null;
        }
        if (fVar != null) {
        } else {
            alpha(4);
            throw null;
        }
    }
}
