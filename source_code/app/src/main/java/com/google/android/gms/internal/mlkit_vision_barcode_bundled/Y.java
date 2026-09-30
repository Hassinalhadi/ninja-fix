package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class Y {
    public static final Y purple;
    public static final Y red;
    public static final /* synthetic */ Y[] silver;
    public final Z alpha;

    /* JADX INFO: Fake field, exist only in values array */
    Y EF0;

    /* JADX INFO: Fake field, exist only in values array */
    Y EF1;

    /* JADX INFO: Fake field, exist only in values array */
    Y EF2;

    static {
        Y y10 = new Y("DOUBLE", 0, Z.silver);
        Y y11 = new Y("FLOAT", 1, Z.red);
        Z z2 = Z.purple;
        Y y12 = new Y("INT64", 2, z2);
        Y y13 = new Y("UINT64", 3, z2);
        Z z10 = Z.alpha;
        Y y14 = new Y("INT32", 4, z10);
        Y y15 = new Y("FIXED64", 5, z2);
        Y y16 = new Y("FIXED32", 6, z10);
        Y y17 = new Y("BOOL", 7, Z.teal);
        Y y18 = new Y("STRING", 8, Z.white);
        Z z11 = Z.f7430b;
        Y y19 = new Y("GROUP", 9, z11);
        purple = y19;
        Y y20 = new Y("MESSAGE", 10, z11);
        Y y21 = new Y("BYTES", 11, Z.yellow);
        Y y22 = new Y("UINT32", 12, z10);
        Y y23 = new Y("ENUM", 13, Z.f7429a);
        red = y23;
        silver = new Y[]{y10, y11, y12, y13, y14, y15, y16, y17, y18, y19, y20, y21, y22, y23, new Y("SFIXED32", 14, z10), new Y("SFIXED64", 15, z2), new Y("SINT32", 16, z10), new Y("SINT64", 17, z2)};
    }

    public Y(String str, int i4, Z z2) {
        this.alpha = z2;
    }

    public static Y[] values() {
        return (Y[]) silver.clone();
    }
}
