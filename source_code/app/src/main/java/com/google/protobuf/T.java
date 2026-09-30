package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'red' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public class T {
    public static final T red;
    public static final O silver;
    public static final P teal;
    public static final /* synthetic */ T[] white;
    public final U alpha;
    public final int purple;

    /* JADX INFO: Fake field, exist only in values array */
    T EF10;

    /* JADX INFO: Fake field, exist only in values array */
    T EF11;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.protobuf.O, com.google.protobuf.T] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.protobuf.P, com.google.protobuf.T] */
    static {
        T t5 = new T("DOUBLE", 0, U.DOUBLE, 1);
        T t10 = new T("FLOAT", 1, U.FLOAT, 5);
        U u4 = U.LONG;
        T t11 = new T("INT64", 2, u4, 0);
        red = t11;
        T t12 = new T("UINT64", 3, u4, 0);
        U u10 = U.INT;
        T t13 = new T("INT32", 4, u10, 0);
        T t14 = new T("FIXED64", 5, u4, 1);
        T t15 = new T("FIXED32", 6, u10, 5);
        T t16 = new T("BOOL", 7, U.BOOLEAN, 0);
        ?? t17 = new T("STRING", 8, U.STRING, 2);
        silver = t17;
        U u11 = U.MESSAGE;
        ?? t18 = new T("GROUP", 9, u11, 3);
        teal = t18;
        white = new T[]{t5, t10, t11, t12, t13, t14, t15, t16, t17, t18, new T("MESSAGE", 10, u11, 2), new T("BYTES", 11, U.BYTE_STRING, 2), new T("UINT32", 12, u10, 0), new T("ENUM", 13, U.ENUM, 0), new T("SFIXED32", 14, u10, 5), new T("SFIXED64", 15, u4, 1), new T("SINT32", 16, u10, 0), new T("SINT64", 17, u4, 0)};
    }

    public T(String str, int i4, U u4, int i5) {
        this.alpha = u4;
        this.purple = i5;
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) white.clone();
    }
}
