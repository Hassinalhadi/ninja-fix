package androidx.datastore.preferences.protobuf;

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
/* loaded from: classes3.dex */
public final class o {
    public static final o purple;
    public static final o red;
    public static final o[] silver;
    public static final /* synthetic */ o[] teal;
    public final int alpha;

    /* JADX INFO: Fake field, exist only in values array */
    o EF0;

    static {
        v vVar = v.DOUBLE;
        o oVar = new o("DOUBLE", 0, 0, 1, vVar);
        v vVar2 = v.FLOAT;
        o oVar2 = new o("FLOAT", 1, 1, 1, vVar2);
        v vVar3 = v.LONG;
        o oVar3 = new o("INT64", 2, 2, 1, vVar3);
        o oVar4 = new o("UINT64", 3, 3, 1, vVar3);
        v vVar4 = v.INT;
        o oVar5 = new o("INT32", 4, 4, 1, vVar4);
        o oVar6 = new o("FIXED64", 5, 5, 1, vVar3);
        o oVar7 = new o("FIXED32", 6, 6, 1, vVar4);
        v vVar5 = v.BOOLEAN;
        o oVar8 = new o("BOOL", 7, 7, 1, vVar5);
        v vVar6 = v.STRING;
        o oVar9 = new o("STRING", 8, 8, 1, vVar6);
        v vVar7 = v.MESSAGE;
        o oVar10 = new o("MESSAGE", 9, 9, 1, vVar7);
        v vVar8 = v.BYTE_STRING;
        o oVar11 = new o("BYTES", 10, 10, 1, vVar8);
        o oVar12 = new o("UINT32", 11, 11, 1, vVar4);
        v vVar9 = v.ENUM;
        o oVar13 = new o("ENUM", 12, 12, 1, vVar9);
        o oVar14 = new o("SFIXED32", 13, 13, 1, vVar4);
        o oVar15 = new o("SFIXED64", 14, 14, 1, vVar3);
        o oVar16 = new o("SINT32", 15, 15, 1, vVar4);
        o oVar17 = new o("SINT64", 16, 16, 1, vVar3);
        o oVar18 = new o("GROUP", 17, 17, 1, vVar7);
        o oVar19 = new o("DOUBLE_LIST", 18, 18, 2, vVar);
        o oVar20 = new o("FLOAT_LIST", 19, 19, 2, vVar2);
        o oVar21 = new o("INT64_LIST", 20, 20, 2, vVar3);
        o oVar22 = new o("UINT64_LIST", 21, 21, 2, vVar3);
        o oVar23 = new o("INT32_LIST", 22, 22, 2, vVar4);
        o oVar24 = new o("FIXED64_LIST", 23, 23, 2, vVar3);
        o oVar25 = new o("FIXED32_LIST", 24, 24, 2, vVar4);
        o oVar26 = new o("BOOL_LIST", 25, 25, 2, vVar5);
        o oVar27 = new o("STRING_LIST", 26, 26, 2, vVar6);
        o oVar28 = new o("MESSAGE_LIST", 27, 27, 2, vVar7);
        o oVar29 = new o("BYTES_LIST", 28, 28, 2, vVar8);
        o oVar30 = new o("UINT32_LIST", 29, 29, 2, vVar4);
        o oVar31 = new o("ENUM_LIST", 30, 30, 2, vVar9);
        o oVar32 = new o("SFIXED32_LIST", 31, 31, 2, vVar4);
        o oVar33 = new o("SFIXED64_LIST", 32, 32, 2, vVar3);
        o oVar34 = new o("SINT32_LIST", 33, 33, 2, vVar4);
        o oVar35 = new o("SINT64_LIST", 34, 34, 2, vVar3);
        o oVar36 = new o("DOUBLE_LIST_PACKED", 35, 35, 3, vVar);
        purple = oVar36;
        o oVar37 = new o("FLOAT_LIST_PACKED", 36, 36, 3, vVar2);
        o oVar38 = new o("INT64_LIST_PACKED", 37, 37, 3, vVar3);
        o oVar39 = new o("UINT64_LIST_PACKED", 38, 38, 3, vVar3);
        o oVar40 = new o("INT32_LIST_PACKED", 39, 39, 3, vVar4);
        o oVar41 = new o("FIXED64_LIST_PACKED", 40, 40, 3, vVar3);
        o oVar42 = new o("FIXED32_LIST_PACKED", 41, 41, 3, vVar4);
        o oVar43 = new o("BOOL_LIST_PACKED", 42, 42, 3, vVar5);
        o oVar44 = new o("UINT32_LIST_PACKED", 43, 43, 3, vVar4);
        o oVar45 = new o("ENUM_LIST_PACKED", 44, 44, 3, vVar9);
        o oVar46 = new o("SFIXED32_LIST_PACKED", 45, 45, 3, vVar4);
        o oVar47 = new o("SFIXED64_LIST_PACKED", 46, 46, 3, vVar3);
        o oVar48 = new o("SINT32_LIST_PACKED", 47, 47, 3, vVar4);
        o oVar49 = new o("SINT64_LIST_PACKED", 48, 48, 3, vVar3);
        red = oVar49;
        teal = new o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12, oVar13, oVar14, oVar15, oVar16, oVar17, oVar18, oVar19, oVar20, oVar21, oVar22, oVar23, oVar24, oVar25, oVar26, oVar27, oVar28, oVar29, oVar30, oVar31, oVar32, oVar33, oVar34, oVar35, oVar36, oVar37, oVar38, oVar39, oVar40, oVar41, oVar42, oVar43, oVar44, oVar45, oVar46, oVar47, oVar48, oVar49, new o("GROUP_LIST", 49, 49, 2, vVar7), new o("MAP", 50, 50, 4, v.VOID)};
        o[] values = values();
        silver = new o[values.length];
        for (o oVar50 : values) {
            silver[oVar50.alpha] = oVar50;
        }
    }

    public o(String str, int i4, int i5, int i10, v vVar) {
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

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) teal.clone();
    }
}
