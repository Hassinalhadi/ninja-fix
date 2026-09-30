package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public class K {
    public static final G red;
    public static final H silver;
    public static final I teal;
    public static final /* synthetic */ K[] white;
    public final L alpha;
    public final int purple;

    /* JADX INFO: Fake field, exist only in values array */
    K EF10;

    /* JADX INFO: Fake field, exist only in values array */
    K EF11;

    /* JADX INFO: Fake field, exist only in values array */
    K EF12;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.preferences.protobuf.K, androidx.datastore.preferences.protobuf.G] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.preferences.protobuf.I, androidx.datastore.preferences.protobuf.K] */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.datastore.preferences.protobuf.K, androidx.datastore.preferences.protobuf.H] */
    static {
        K k6 = new K("DOUBLE", 0, L.DOUBLE, 1);
        K k10 = new K("FLOAT", 1, L.FLOAT, 5);
        L l10 = L.LONG;
        K k11 = new K("INT64", 2, l10, 0);
        K k12 = new K("UINT64", 3, l10, 0);
        L l11 = L.INT;
        K k13 = new K("INT32", 4, l11, 0);
        K k14 = new K("FIXED64", 5, l10, 1);
        K k15 = new K("FIXED32", 6, l11, 5);
        K k16 = new K("BOOL", 7, L.BOOLEAN, 0);
        ?? k17 = new K("STRING", 8, L.STRING, 2);
        red = k17;
        L l12 = L.MESSAGE;
        ?? k18 = new K("GROUP", 9, l12, 3);
        silver = k18;
        ?? k19 = new K("MESSAGE", 10, l12, 2);
        teal = k19;
        white = new K[]{k6, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, new K("BYTES", 11, L.BYTE_STRING, 2), new K("UINT32", 12, l11, 0), new K("ENUM", 13, L.ENUM, 0), new K("SFIXED32", 14, l11, 5), new K("SFIXED64", 15, l10, 1), new K("SINT32", 16, l11, 0), new K("SINT64", 17, l10, 0)};
    }

    public K(String str, int i4, L l10, int i5) {
        this.alpha = l10;
        this.purple = i5;
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) white.clone();
    }
}
