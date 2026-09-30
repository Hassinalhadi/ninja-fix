package H0;

import com.zendesk.service.HttpConstants;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public static final v f1407a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f1408b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f1409c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f1410d;
    public static final v e;
    public static final v purple;
    public static final v red;
    public static final v silver;
    public static final v teal;
    public static final v white;
    public static final v yellow;
    public final int alpha;

    static {
        v vVar = new v(100);
        v vVar2 = new v(200);
        v vVar3 = new v(300);
        v vVar4 = new v(HttpConstants.HTTP_BAD_REQUEST);
        purple = vVar4;
        v vVar5 = new v(HttpConstants.HTTP_INTERNAL_ERROR);
        red = vVar5;
        v vVar6 = new v(600);
        silver = vVar6;
        v vVar7 = new v(700);
        teal = vVar7;
        v vVar8 = new v(800);
        v vVar9 = new v(900);
        white = vVar3;
        yellow = vVar4;
        f1407a = vVar5;
        f1408b = vVar6;
        f1409c = vVar7;
        f1410d = vVar8;
        e = vVar9;
        CollectionsKt.listOf(vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9);
    }

    public v(int i4) {
        this.alpha = i4;
        boolean z2 = false;
        if (1 <= i4 && i4 < 1001) {
            z2 = true;
        }
        if (!z2) {
            J0.a.alpha("Font weight can be in range [1, 1000]. Current value: " + i4);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final int compareTo(v vVar) {
        return Intrinsics.golf(this.alpha, vVar.alpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        if (this.alpha == ((v) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        return Q0.c.quebec(new StringBuilder("FontWeight(weight="), this.alpha, ')');
    }
}
