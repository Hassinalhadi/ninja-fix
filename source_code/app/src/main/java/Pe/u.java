package Pe;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public enum u {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set purple;
    public static final Set red;
    public final boolean alpha;

    static {
        u[] values = values();
        ArrayList arrayList = new ArrayList();
        for (u uVar : values) {
            if (uVar.alpha) {
                arrayList.add(uVar);
            }
        }
        purple = CollectionsKt.D(arrayList);
        red = ArraysKt.g(values());
    }

    u(boolean z2) {
        this.alpha = z2;
    }
}
