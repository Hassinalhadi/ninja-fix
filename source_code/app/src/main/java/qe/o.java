package qe;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.collections.y;

/* loaded from: classes2.dex */
public enum o {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);

    public static final HashMap purple = new HashMap();
    public final boolean alpha;

    static {
        for (o oVar : values()) {
            purple.put(oVar.name(), oVar);
        }
        o[] values = values();
        ArrayList arrayList = new ArrayList();
        for (o oVar2 : values) {
            if (oVar2.alpha) {
                arrayList.add(oVar2);
            }
        }
        CollectionsKt.D(arrayList);
        ArraysKt.g(values());
        o oVar3 = CLASS;
        CollectionsKt.listOf(ANNOTATION_CLASS, oVar3);
        CollectionsKt.listOf(LOCAL_CLASS, oVar3);
        CollectionsKt.listOf(CLASS_ONLY, oVar3);
        o oVar4 = OBJECT;
        CollectionsKt.listOf(COMPANION_OBJECT, oVar4, oVar3);
        CollectionsKt.listOf(STANDALONE_OBJECT, oVar4, oVar3);
        CollectionsKt.listOf(INTERFACE, oVar3);
        CollectionsKt.listOf(ENUM_CLASS, oVar3);
        o oVar5 = PROPERTY;
        o oVar6 = FIELD;
        CollectionsKt.listOf(ENUM_ENTRY, oVar5, oVar6);
        o oVar7 = PROPERTY_SETTER;
        ab.juliet(oVar7);
        o oVar8 = PROPERTY_GETTER;
        ab.juliet(oVar8);
        ab.juliet(FUNCTION);
        o oVar9 = FILE;
        ab.juliet(oVar9);
        EnumC2468d enumC2468d = EnumC2468d.CONSTRUCTOR_PARAMETER;
        o oVar10 = VALUE_PARAMETER;
        y.sierra(new Pair(enumC2468d, oVar10), new Pair(EnumC2468d.FIELD, oVar6), new Pair(EnumC2468d.PROPERTY, oVar5), new Pair(EnumC2468d.FILE, oVar9), new Pair(EnumC2468d.PROPERTY_GETTER, oVar8), new Pair(EnumC2468d.PROPERTY_SETTER, oVar7), new Pair(EnumC2468d.RECEIVER, oVar10), new Pair(EnumC2468d.SETTER_PARAMETER, oVar10), new Pair(EnumC2468d.PROPERTY_DELEGATE_FIELD, oVar6));
    }

    o(boolean z2) {
        this.alpha = z2;
    }
}
