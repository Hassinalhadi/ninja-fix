package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.measurement.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1376t1 {
    public static final EnumC1376t1 purple;
    public static final EnumC1376t1 red;
    public static final EnumC1376t1[] silver;
    public static final /* synthetic */ EnumC1376t1[] teal;
    public final int alpha;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1376t1 EF0;

    static {
        F1 f12 = F1.teal;
        EnumC1376t1 enumC1376t1 = new EnumC1376t1("DOUBLE", 0, 0, 1, f12);
        F1 f13 = F1.silver;
        EnumC1376t1 enumC1376t12 = new EnumC1376t1("FLOAT", 1, 1, 1, f13);
        F1 f14 = F1.red;
        EnumC1376t1 enumC1376t13 = new EnumC1376t1("INT64", 2, 2, 1, f14);
        EnumC1376t1 enumC1376t14 = new EnumC1376t1("UINT64", 3, 3, 1, f14);
        F1 f15 = F1.purple;
        EnumC1376t1 enumC1376t15 = new EnumC1376t1("INT32", 4, 4, 1, f15);
        EnumC1376t1 enumC1376t16 = new EnumC1376t1("FIXED64", 5, 5, 1, f14);
        EnumC1376t1 enumC1376t17 = new EnumC1376t1("FIXED32", 6, 6, 1, f15);
        F1 f16 = F1.white;
        EnumC1376t1 enumC1376t18 = new EnumC1376t1("BOOL", 7, 7, 1, f16);
        F1 f17 = F1.yellow;
        EnumC1376t1 enumC1376t19 = new EnumC1376t1("STRING", 8, 8, 1, f17);
        F1 f18 = F1.f6675c;
        EnumC1376t1 enumC1376t110 = new EnumC1376t1("MESSAGE", 9, 9, 1, f18);
        F1 f19 = F1.f6673a;
        EnumC1376t1 enumC1376t111 = new EnumC1376t1("BYTES", 10, 10, 1, f19);
        EnumC1376t1 enumC1376t112 = new EnumC1376t1("UINT32", 11, 11, 1, f15);
        F1 f110 = F1.f6674b;
        EnumC1376t1 enumC1376t113 = new EnumC1376t1("ENUM", 12, 12, 1, f110);
        EnumC1376t1 enumC1376t114 = new EnumC1376t1("SFIXED32", 13, 13, 1, f15);
        EnumC1376t1 enumC1376t115 = new EnumC1376t1("SFIXED64", 14, 14, 1, f14);
        EnumC1376t1 enumC1376t116 = new EnumC1376t1("SINT32", 15, 15, 1, f15);
        EnumC1376t1 enumC1376t117 = new EnumC1376t1("SINT64", 16, 16, 1, f14);
        EnumC1376t1 enumC1376t118 = new EnumC1376t1("GROUP", 17, 17, 1, f18);
        EnumC1376t1 enumC1376t119 = new EnumC1376t1("DOUBLE_LIST", 18, 18, 2, f12);
        EnumC1376t1 enumC1376t120 = new EnumC1376t1("FLOAT_LIST", 19, 19, 2, f13);
        EnumC1376t1 enumC1376t121 = new EnumC1376t1("INT64_LIST", 20, 20, 2, f14);
        EnumC1376t1 enumC1376t122 = new EnumC1376t1("UINT64_LIST", 21, 21, 2, f14);
        EnumC1376t1 enumC1376t123 = new EnumC1376t1("INT32_LIST", 22, 22, 2, f15);
        EnumC1376t1 enumC1376t124 = new EnumC1376t1("FIXED64_LIST", 23, 23, 2, f14);
        EnumC1376t1 enumC1376t125 = new EnumC1376t1("FIXED32_LIST", 24, 24, 2, f15);
        EnumC1376t1 enumC1376t126 = new EnumC1376t1("BOOL_LIST", 25, 25, 2, f16);
        EnumC1376t1 enumC1376t127 = new EnumC1376t1("STRING_LIST", 26, 26, 2, f17);
        EnumC1376t1 enumC1376t128 = new EnumC1376t1("MESSAGE_LIST", 27, 27, 2, f18);
        EnumC1376t1 enumC1376t129 = new EnumC1376t1("BYTES_LIST", 28, 28, 2, f19);
        EnumC1376t1 enumC1376t130 = new EnumC1376t1("UINT32_LIST", 29, 29, 2, f15);
        EnumC1376t1 enumC1376t131 = new EnumC1376t1("ENUM_LIST", 30, 30, 2, f110);
        EnumC1376t1 enumC1376t132 = new EnumC1376t1("SFIXED32_LIST", 31, 31, 2, f15);
        EnumC1376t1 enumC1376t133 = new EnumC1376t1("SFIXED64_LIST", 32, 32, 2, f14);
        EnumC1376t1 enumC1376t134 = new EnumC1376t1("SINT32_LIST", 33, 33, 2, f15);
        EnumC1376t1 enumC1376t135 = new EnumC1376t1("SINT64_LIST", 34, 34, 2, f14);
        EnumC1376t1 enumC1376t136 = new EnumC1376t1("DOUBLE_LIST_PACKED", 35, 35, 3, f12);
        purple = enumC1376t136;
        EnumC1376t1 enumC1376t137 = new EnumC1376t1("FLOAT_LIST_PACKED", 36, 36, 3, f13);
        EnumC1376t1 enumC1376t138 = new EnumC1376t1("INT64_LIST_PACKED", 37, 37, 3, f14);
        EnumC1376t1 enumC1376t139 = new EnumC1376t1("UINT64_LIST_PACKED", 38, 38, 3, f14);
        EnumC1376t1 enumC1376t140 = new EnumC1376t1("INT32_LIST_PACKED", 39, 39, 3, f15);
        EnumC1376t1 enumC1376t141 = new EnumC1376t1("FIXED64_LIST_PACKED", 40, 40, 3, f14);
        EnumC1376t1 enumC1376t142 = new EnumC1376t1("FIXED32_LIST_PACKED", 41, 41, 3, f15);
        EnumC1376t1 enumC1376t143 = new EnumC1376t1("BOOL_LIST_PACKED", 42, 42, 3, f16);
        EnumC1376t1 enumC1376t144 = new EnumC1376t1("UINT32_LIST_PACKED", 43, 43, 3, f15);
        EnumC1376t1 enumC1376t145 = new EnumC1376t1("ENUM_LIST_PACKED", 44, 44, 3, f110);
        EnumC1376t1 enumC1376t146 = new EnumC1376t1("SFIXED32_LIST_PACKED", 45, 45, 3, f15);
        EnumC1376t1 enumC1376t147 = new EnumC1376t1("SFIXED64_LIST_PACKED", 46, 46, 3, f14);
        EnumC1376t1 enumC1376t148 = new EnumC1376t1("SINT32_LIST_PACKED", 47, 47, 3, f15);
        EnumC1376t1 enumC1376t149 = new EnumC1376t1("SINT64_LIST_PACKED", 48, 48, 3, f14);
        red = enumC1376t149;
        teal = new EnumC1376t1[]{enumC1376t1, enumC1376t12, enumC1376t13, enumC1376t14, enumC1376t15, enumC1376t16, enumC1376t17, enumC1376t18, enumC1376t19, enumC1376t110, enumC1376t111, enumC1376t112, enumC1376t113, enumC1376t114, enumC1376t115, enumC1376t116, enumC1376t117, enumC1376t118, enumC1376t119, enumC1376t120, enumC1376t121, enumC1376t122, enumC1376t123, enumC1376t124, enumC1376t125, enumC1376t126, enumC1376t127, enumC1376t128, enumC1376t129, enumC1376t130, enumC1376t131, enumC1376t132, enumC1376t133, enumC1376t134, enumC1376t135, enumC1376t136, enumC1376t137, enumC1376t138, enumC1376t139, enumC1376t140, enumC1376t141, enumC1376t142, enumC1376t143, enumC1376t144, enumC1376t145, enumC1376t146, enumC1376t147, enumC1376t148, enumC1376t149, new EnumC1376t1("GROUP_LIST", 49, 49, 2, f18), new EnumC1376t1("MAP", 50, 50, 4, F1.alpha)};
        EnumC1376t1[] values = values();
        silver = new EnumC1376t1[values.length];
        for (EnumC1376t1 enumC1376t150 : values) {
            silver[enumC1376t150.alpha] = enumC1376t150;
        }
    }

    public EnumC1376t1(String str, int i4, int i5, int i10, F1 f12) {
        this.alpha = i5;
        int i11 = i10 - 1;
        if (i11 != 1) {
            if (i11 == 3) {
                f12.getClass();
            }
        } else {
            f12.getClass();
        }
        if (i10 == 1) {
            F1 f13 = F1.alpha;
            f12.ordinal();
        }
    }

    public static EnumC1376t1[] values() {
        return (EnumC1376t1[]) teal.clone();
    }
}
