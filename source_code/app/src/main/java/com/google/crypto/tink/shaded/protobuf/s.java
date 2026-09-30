package com.google.crypto.tink.shaded.protobuf;

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
/* loaded from: classes2.dex */
public final class s {
    public static final s purple;
    public static final s red;
    public static final s[] silver;
    public static final /* synthetic */ s[] teal;
    public final int alpha;

    /* JADX INFO: Fake field, exist only in values array */
    s EF0;

    static {
        ac acVar = ac.DOUBLE;
        s sVar = new s("DOUBLE", 0, 0, 1, acVar);
        ac acVar2 = ac.FLOAT;
        s sVar2 = new s("FLOAT", 1, 1, 1, acVar2);
        ac acVar3 = ac.LONG;
        s sVar3 = new s("INT64", 2, 2, 1, acVar3);
        s sVar4 = new s("UINT64", 3, 3, 1, acVar3);
        ac acVar4 = ac.INT;
        s sVar5 = new s("INT32", 4, 4, 1, acVar4);
        s sVar6 = new s("FIXED64", 5, 5, 1, acVar3);
        s sVar7 = new s("FIXED32", 6, 6, 1, acVar4);
        ac acVar5 = ac.BOOLEAN;
        s sVar8 = new s("BOOL", 7, 7, 1, acVar5);
        ac acVar6 = ac.STRING;
        s sVar9 = new s("STRING", 8, 8, 1, acVar6);
        ac acVar7 = ac.MESSAGE;
        s sVar10 = new s("MESSAGE", 9, 9, 1, acVar7);
        ac acVar8 = ac.BYTE_STRING;
        s sVar11 = new s("BYTES", 10, 10, 1, acVar8);
        s sVar12 = new s("UINT32", 11, 11, 1, acVar4);
        ac acVar9 = ac.ENUM;
        s sVar13 = new s("ENUM", 12, 12, 1, acVar9);
        s sVar14 = new s("SFIXED32", 13, 13, 1, acVar4);
        s sVar15 = new s("SFIXED64", 14, 14, 1, acVar3);
        s sVar16 = new s("SINT32", 15, 15, 1, acVar4);
        s sVar17 = new s("SINT64", 16, 16, 1, acVar3);
        s sVar18 = new s("GROUP", 17, 17, 1, acVar7);
        s sVar19 = new s("DOUBLE_LIST", 18, 18, 2, acVar);
        s sVar20 = new s("FLOAT_LIST", 19, 19, 2, acVar2);
        s sVar21 = new s("INT64_LIST", 20, 20, 2, acVar3);
        s sVar22 = new s("UINT64_LIST", 21, 21, 2, acVar3);
        s sVar23 = new s("INT32_LIST", 22, 22, 2, acVar4);
        s sVar24 = new s("FIXED64_LIST", 23, 23, 2, acVar3);
        s sVar25 = new s("FIXED32_LIST", 24, 24, 2, acVar4);
        s sVar26 = new s("BOOL_LIST", 25, 25, 2, acVar5);
        s sVar27 = new s("STRING_LIST", 26, 26, 2, acVar6);
        s sVar28 = new s("MESSAGE_LIST", 27, 27, 2, acVar7);
        s sVar29 = new s("BYTES_LIST", 28, 28, 2, acVar8);
        s sVar30 = new s("UINT32_LIST", 29, 29, 2, acVar4);
        s sVar31 = new s("ENUM_LIST", 30, 30, 2, acVar9);
        s sVar32 = new s("SFIXED32_LIST", 31, 31, 2, acVar4);
        s sVar33 = new s("SFIXED64_LIST", 32, 32, 2, acVar3);
        s sVar34 = new s("SINT32_LIST", 33, 33, 2, acVar4);
        s sVar35 = new s("SINT64_LIST", 34, 34, 2, acVar3);
        s sVar36 = new s("DOUBLE_LIST_PACKED", 35, 35, 3, acVar);
        purple = sVar36;
        s sVar37 = new s("FLOAT_LIST_PACKED", 36, 36, 3, acVar2);
        s sVar38 = new s("INT64_LIST_PACKED", 37, 37, 3, acVar3);
        s sVar39 = new s("UINT64_LIST_PACKED", 38, 38, 3, acVar3);
        s sVar40 = new s("INT32_LIST_PACKED", 39, 39, 3, acVar4);
        s sVar41 = new s("FIXED64_LIST_PACKED", 40, 40, 3, acVar3);
        s sVar42 = new s("FIXED32_LIST_PACKED", 41, 41, 3, acVar4);
        s sVar43 = new s("BOOL_LIST_PACKED", 42, 42, 3, acVar5);
        s sVar44 = new s("UINT32_LIST_PACKED", 43, 43, 3, acVar4);
        s sVar45 = new s("ENUM_LIST_PACKED", 44, 44, 3, acVar9);
        s sVar46 = new s("SFIXED32_LIST_PACKED", 45, 45, 3, acVar4);
        s sVar47 = new s("SFIXED64_LIST_PACKED", 46, 46, 3, acVar3);
        s sVar48 = new s("SINT32_LIST_PACKED", 47, 47, 3, acVar4);
        s sVar49 = new s("SINT64_LIST_PACKED", 48, 48, 3, acVar3);
        red = sVar49;
        teal = new s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11, sVar12, sVar13, sVar14, sVar15, sVar16, sVar17, sVar18, sVar19, sVar20, sVar21, sVar22, sVar23, sVar24, sVar25, sVar26, sVar27, sVar28, sVar29, sVar30, sVar31, sVar32, sVar33, sVar34, sVar35, sVar36, sVar37, sVar38, sVar39, sVar40, sVar41, sVar42, sVar43, sVar44, sVar45, sVar46, sVar47, sVar48, sVar49, new s("GROUP_LIST", 49, 49, 2, acVar7), new s("MAP", 50, 50, 4, ac.VOID)};
        s[] values = values();
        silver = new s[values.length];
        for (s sVar50 : values) {
            silver[sVar50.alpha] = sVar50;
        }
    }

    public s(String str, int i4, int i5, int i10, ac acVar) {
        this.alpha = i5;
        int mike = av.q.mike(i10);
        if (mike != 1) {
            if (mike == 3) {
                acVar.getClass();
            }
        } else {
            acVar.getClass();
        }
        if (i10 == 1) {
            acVar.ordinal();
        }
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) teal.clone();
    }
}
