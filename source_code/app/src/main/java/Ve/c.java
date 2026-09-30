package Ve;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import me.j;

/* loaded from: classes2.dex */
public enum c {
    BOOLEAN(j.BOOLEAN, CTVariableUtils.BOOLEAN, "Z", "java.lang.Boolean"),
    CHAR(j.CHAR, "char", "C", "java.lang.Character"),
    BYTE(j.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(j.SHORT, "short", "S", "java.lang.Short"),
    INT(j.INT, "int", "I", "java.lang.Integer"),
    FLOAT(j.FLOAT, "float", "F", "java.lang.Float"),
    LONG(j.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(j.DOUBLE, "double", "D", "java.lang.Double");


    /* renamed from: f, reason: collision with root package name */
    public static final HashSet f2184f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f2185g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final EnumMap f2186h = new EnumMap(j.class);

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f2187i = new HashMap();
    public final j alpha;
    public final String purple;
    public final String red;
    public final Ne.c silver;

    static {
        for (c cVar : values()) {
            f2184f.add(cVar.echo());
            f2185g.put(cVar.purple, cVar);
            f2186h.put((EnumMap) cVar.delta(), (j) cVar);
            f2187i.put(cVar.charlie(), cVar);
        }
    }

    c(j jVar, String str, String str2, String str3) {
        if (jVar != null) {
            this.alpha = jVar;
            this.purple = str;
            this.red = str2;
            this.silver = new Ne.c(str3);
            return;
        }
        alpha(6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        Object[] objArr;
        if (i4 != 2 && i4 != 4) {
            switch (i4) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i4 != 2 && i4 != 4) {
                switch (i4) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i5 = 3;
                        break;
                }
                objArr = new Object[i5];
                switch (i4) {
                    case 1:
                    case 7:
                        objArr[0] = "name";
                        break;
                    case 2:
                    case 4:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                    case 3:
                        objArr[0] = Constants.KEY_TYPE;
                        break;
                    case 5:
                    case 8:
                        objArr[0] = "desc";
                        break;
                    case 6:
                        objArr[0] = "primitiveType";
                        break;
                    case 9:
                        objArr[0] = "wrapperClassName";
                        break;
                    default:
                        objArr[0] = "className";
                        break;
                }
                if (i4 == 2 && i4 != 4) {
                    switch (i4) {
                        case 10:
                            objArr[1] = "getPrimitiveType";
                            break;
                        case 11:
                            objArr[1] = "getJavaKeywordName";
                            break;
                        case 12:
                            objArr[1] = "getDesc";
                            break;
                        case 13:
                            objArr[1] = "getWrapperFqName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                    }
                } else {
                    objArr[1] = "get";
                }
                switch (i4) {
                    case 1:
                    case 3:
                        objArr[2] = "get";
                        break;
                    case 2:
                    case 4:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    case 5:
                        objArr[2] = "getByDesc";
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "isWrapperClassName";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 2 && i4 != 4) {
                    switch (i4) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i5 = 2;
            objArr = new Object[i5];
            switch (i4) {
            }
            if (i4 == 2) {
            }
            objArr[1] = "get";
            switch (i4) {
            }
            String format2 = String.format(str, objArr);
            if (i4 != 2) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 2) {
            switch (i4) {
            }
            objArr = new Object[i5];
            switch (i4) {
            }
            if (i4 == 2) {
            }
            objArr[1] = "get";
            switch (i4) {
            }
            String format22 = String.format(str, objArr);
            if (i4 != 2) {
            }
            throw new IllegalStateException(format22);
        }
        i5 = 2;
        objArr = new Object[i5];
        switch (i4) {
        }
        if (i4 == 2) {
        }
        objArr[1] = "get";
        switch (i4) {
        }
        String format222 = String.format(str, objArr);
        if (i4 != 2) {
        }
        throw new IllegalStateException(format222);
    }

    public static c bravo(String str) {
        c cVar = (c) f2185g.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String charlie() {
        String str = this.red;
        if (str != null) {
            return str;
        }
        alpha(12);
        throw null;
    }

    public final j delta() {
        j jVar = this.alpha;
        if (jVar != null) {
            return jVar;
        }
        alpha(10);
        throw null;
    }

    public final Ne.c echo() {
        Ne.c cVar = this.silver;
        if (cVar != null) {
            return cVar;
        }
        alpha(13);
        throw null;
    }
}
