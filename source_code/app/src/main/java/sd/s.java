package sd;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s {
    public static final s bravo;
    public static final s charlie;
    public static final s delta;
    public static final s echo;
    public static final List foxtrot;
    public final String alpha;

    static {
        s sVar = new s("GET");
        bravo = sVar;
        s sVar2 = new s("POST");
        charlie = sVar2;
        s sVar3 = new s("PUT");
        s sVar4 = new s("PATCH");
        s sVar5 = new s("DELETE");
        s sVar6 = new s("HEAD");
        delta = sVar6;
        s sVar7 = new s("OPTIONS");
        echo = sVar7;
        foxtrot = CollectionsKt.listOf(sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7);
    }

    public s(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && Intrinsics.areEqual(this.alpha, ((s) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return this.alpha;
    }
}
