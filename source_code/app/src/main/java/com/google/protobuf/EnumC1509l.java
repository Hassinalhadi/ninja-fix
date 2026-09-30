package com.google.protobuf;

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
/* renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1509l {
    public static final EnumC1509l purple;
    public static final EnumC1509l red;
    public static final EnumC1509l[] silver;
    public static final /* synthetic */ EnumC1509l[] teal;
    public final int alpha;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1509l EF0;

    static {
        v vVar = v.DOUBLE;
        EnumC1509l enumC1509l = new EnumC1509l("DOUBLE", 0, 0, 1, vVar);
        v vVar2 = v.FLOAT;
        EnumC1509l enumC1509l2 = new EnumC1509l("FLOAT", 1, 1, 1, vVar2);
        v vVar3 = v.LONG;
        EnumC1509l enumC1509l3 = new EnumC1509l("INT64", 2, 2, 1, vVar3);
        EnumC1509l enumC1509l4 = new EnumC1509l("UINT64", 3, 3, 1, vVar3);
        v vVar4 = v.INT;
        EnumC1509l enumC1509l5 = new EnumC1509l("INT32", 4, 4, 1, vVar4);
        EnumC1509l enumC1509l6 = new EnumC1509l("FIXED64", 5, 5, 1, vVar3);
        EnumC1509l enumC1509l7 = new EnumC1509l("FIXED32", 6, 6, 1, vVar4);
        v vVar5 = v.BOOLEAN;
        EnumC1509l enumC1509l8 = new EnumC1509l("BOOL", 7, 7, 1, vVar5);
        v vVar6 = v.STRING;
        EnumC1509l enumC1509l9 = new EnumC1509l("STRING", 8, 8, 1, vVar6);
        v vVar7 = v.MESSAGE;
        EnumC1509l enumC1509l10 = new EnumC1509l("MESSAGE", 9, 9, 1, vVar7);
        v vVar8 = v.BYTE_STRING;
        EnumC1509l enumC1509l11 = new EnumC1509l("BYTES", 10, 10, 1, vVar8);
        EnumC1509l enumC1509l12 = new EnumC1509l("UINT32", 11, 11, 1, vVar4);
        v vVar9 = v.ENUM;
        EnumC1509l enumC1509l13 = new EnumC1509l("ENUM", 12, 12, 1, vVar9);
        EnumC1509l enumC1509l14 = new EnumC1509l("SFIXED32", 13, 13, 1, vVar4);
        EnumC1509l enumC1509l15 = new EnumC1509l("SFIXED64", 14, 14, 1, vVar3);
        EnumC1509l enumC1509l16 = new EnumC1509l("SINT32", 15, 15, 1, vVar4);
        EnumC1509l enumC1509l17 = new EnumC1509l("SINT64", 16, 16, 1, vVar3);
        EnumC1509l enumC1509l18 = new EnumC1509l("GROUP", 17, 17, 1, vVar7);
        EnumC1509l enumC1509l19 = new EnumC1509l("DOUBLE_LIST", 18, 18, 2, vVar);
        EnumC1509l enumC1509l20 = new EnumC1509l("FLOAT_LIST", 19, 19, 2, vVar2);
        EnumC1509l enumC1509l21 = new EnumC1509l("INT64_LIST", 20, 20, 2, vVar3);
        EnumC1509l enumC1509l22 = new EnumC1509l("UINT64_LIST", 21, 21, 2, vVar3);
        EnumC1509l enumC1509l23 = new EnumC1509l("INT32_LIST", 22, 22, 2, vVar4);
        EnumC1509l enumC1509l24 = new EnumC1509l("FIXED64_LIST", 23, 23, 2, vVar3);
        EnumC1509l enumC1509l25 = new EnumC1509l("FIXED32_LIST", 24, 24, 2, vVar4);
        EnumC1509l enumC1509l26 = new EnumC1509l("BOOL_LIST", 25, 25, 2, vVar5);
        EnumC1509l enumC1509l27 = new EnumC1509l("STRING_LIST", 26, 26, 2, vVar6);
        EnumC1509l enumC1509l28 = new EnumC1509l("MESSAGE_LIST", 27, 27, 2, vVar7);
        EnumC1509l enumC1509l29 = new EnumC1509l("BYTES_LIST", 28, 28, 2, vVar8);
        EnumC1509l enumC1509l30 = new EnumC1509l("UINT32_LIST", 29, 29, 2, vVar4);
        EnumC1509l enumC1509l31 = new EnumC1509l("ENUM_LIST", 30, 30, 2, vVar9);
        EnumC1509l enumC1509l32 = new EnumC1509l("SFIXED32_LIST", 31, 31, 2, vVar4);
        EnumC1509l enumC1509l33 = new EnumC1509l("SFIXED64_LIST", 32, 32, 2, vVar3);
        EnumC1509l enumC1509l34 = new EnumC1509l("SINT32_LIST", 33, 33, 2, vVar4);
        EnumC1509l enumC1509l35 = new EnumC1509l("SINT64_LIST", 34, 34, 2, vVar3);
        EnumC1509l enumC1509l36 = new EnumC1509l("DOUBLE_LIST_PACKED", 35, 35, 3, vVar);
        purple = enumC1509l36;
        EnumC1509l enumC1509l37 = new EnumC1509l("FLOAT_LIST_PACKED", 36, 36, 3, vVar2);
        EnumC1509l enumC1509l38 = new EnumC1509l("INT64_LIST_PACKED", 37, 37, 3, vVar3);
        EnumC1509l enumC1509l39 = new EnumC1509l("UINT64_LIST_PACKED", 38, 38, 3, vVar3);
        EnumC1509l enumC1509l40 = new EnumC1509l("INT32_LIST_PACKED", 39, 39, 3, vVar4);
        EnumC1509l enumC1509l41 = new EnumC1509l("FIXED64_LIST_PACKED", 40, 40, 3, vVar3);
        EnumC1509l enumC1509l42 = new EnumC1509l("FIXED32_LIST_PACKED", 41, 41, 3, vVar4);
        EnumC1509l enumC1509l43 = new EnumC1509l("BOOL_LIST_PACKED", 42, 42, 3, vVar5);
        EnumC1509l enumC1509l44 = new EnumC1509l("UINT32_LIST_PACKED", 43, 43, 3, vVar4);
        EnumC1509l enumC1509l45 = new EnumC1509l("ENUM_LIST_PACKED", 44, 44, 3, vVar9);
        EnumC1509l enumC1509l46 = new EnumC1509l("SFIXED32_LIST_PACKED", 45, 45, 3, vVar4);
        EnumC1509l enumC1509l47 = new EnumC1509l("SFIXED64_LIST_PACKED", 46, 46, 3, vVar3);
        EnumC1509l enumC1509l48 = new EnumC1509l("SINT32_LIST_PACKED", 47, 47, 3, vVar4);
        EnumC1509l enumC1509l49 = new EnumC1509l("SINT64_LIST_PACKED", 48, 48, 3, vVar3);
        red = enumC1509l49;
        teal = new EnumC1509l[]{enumC1509l, enumC1509l2, enumC1509l3, enumC1509l4, enumC1509l5, enumC1509l6, enumC1509l7, enumC1509l8, enumC1509l9, enumC1509l10, enumC1509l11, enumC1509l12, enumC1509l13, enumC1509l14, enumC1509l15, enumC1509l16, enumC1509l17, enumC1509l18, enumC1509l19, enumC1509l20, enumC1509l21, enumC1509l22, enumC1509l23, enumC1509l24, enumC1509l25, enumC1509l26, enumC1509l27, enumC1509l28, enumC1509l29, enumC1509l30, enumC1509l31, enumC1509l32, enumC1509l33, enumC1509l34, enumC1509l35, enumC1509l36, enumC1509l37, enumC1509l38, enumC1509l39, enumC1509l40, enumC1509l41, enumC1509l42, enumC1509l43, enumC1509l44, enumC1509l45, enumC1509l46, enumC1509l47, enumC1509l48, enumC1509l49, new EnumC1509l("GROUP_LIST", 49, 49, 2, vVar7), new EnumC1509l("MAP", 50, 50, 4, v.VOID)};
        EnumC1509l[] values = values();
        silver = new EnumC1509l[values.length];
        for (EnumC1509l enumC1509l50 : values) {
            silver[enumC1509l50.alpha] = enumC1509l50;
        }
    }

    public EnumC1509l(String str, int i4, int i5, int i10, v vVar) {
        this.alpha = i5;
        int mike = av.q.mike(i10);
        if (mike != 1) {
            if (mike == 3) {
                vVar.getClass();
            }
        } else {
            vVar.getClass();
        }
        if (i10 == 1) {
            vVar.ordinal();
        }
    }

    public static EnumC1509l valueOf(String str) {
        return (EnumC1509l) Enum.valueOf(EnumC1509l.class, str);
    }

    public static EnumC1509l[] values() {
        return (EnumC1509l[]) teal.clone();
    }
}
