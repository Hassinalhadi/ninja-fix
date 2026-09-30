package Oe;

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
/* loaded from: classes2.dex */
public class ap {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ap[] f1882a;
    public static final ap red;
    public static final ap silver;
    public static final am teal;
    public static final an white;
    public static final ap yellow;
    public final aq alpha;
    public final int purple;

    /* JADX INFO: Fake field, exist only in values array */
    ap EF10;

    /* JADX INFO: Fake field, exist only in values array */
    ap EF11;

    /* JADX INFO: Fake field, exist only in values array */
    ap EF12;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [Oe.ap, Oe.an] */
    /* JADX WARN: Type inference failed for: r8v2, types: [Oe.ap, Oe.am] */
    static {
        ap apVar = new ap("DOUBLE", 0, aq.teal, 1);
        ap apVar2 = new ap("FLOAT", 1, aq.silver, 5);
        aq aqVar = aq.red;
        ap apVar3 = new ap("INT64", 2, aqVar, 0);
        ap apVar4 = new ap("UINT64", 3, aqVar, 0);
        aq aqVar2 = aq.purple;
        ap apVar5 = new ap("INT32", 4, aqVar2, 0);
        red = apVar5;
        ap apVar6 = new ap("FIXED64", 5, aqVar, 1);
        ap apVar7 = new ap("FIXED32", 6, aqVar2, 5);
        ap apVar8 = new ap("BOOL", 7, aq.white, 0);
        silver = apVar8;
        ap apVar9 = new ap("STRING", 8, aq.yellow, 2);
        aq aqVar3 = aq.f1885c;
        ?? apVar10 = new ap("GROUP", 9, aqVar3, 3);
        teal = apVar10;
        ?? apVar11 = new ap("MESSAGE", 10, aqVar3, 2);
        white = apVar11;
        ap apVar12 = new ap("BYTES", 11, aq.f1883a, 2);
        ap apVar13 = new ap("UINT32", 12, aqVar2, 0);
        ap apVar14 = new ap("ENUM", 13, aq.f1884b, 0);
        yellow = apVar14;
        f1882a = new ap[]{apVar, apVar2, apVar3, apVar4, apVar5, apVar6, apVar7, apVar8, apVar9, apVar10, apVar11, apVar12, apVar13, apVar14, new ap("SFIXED32", 14, aqVar2, 5), new ap("SFIXED64", 15, aqVar, 1), new ap("SINT32", 16, aqVar2, 0), new ap("SINT64", 17, aqVar, 0)};
    }

    public ap(String str, int i4, aq aqVar, int i5) {
        this.alpha = aqVar;
        this.purple = i5;
    }

    public static ap valueOf(String str) {
        return (ap) Enum.valueOf(ap.class, str);
    }

    public static ap[] values() {
        return (ap[]) f1882a.clone();
    }

    public boolean alpha() {
        return !(this instanceof al);
    }
}
