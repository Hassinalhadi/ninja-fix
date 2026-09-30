package db;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: db.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1603c {
    public final String alpha;
    public final String bravo;
    public final int charlie;
    public final List delta;

    public C1603c(String name, String str, int i4, List modifiers) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(modifiers, "modifiers");
        this.alpha = name;
        this.bravo = str;
        this.charlie = i4;
        this.delta = modifiers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1603c)) {
            return false;
        }
        C1603c c1603c = (C1603c) obj;
        if (Intrinsics.areEqual(this.alpha, c1603c.alpha) && Intrinsics.areEqual(this.bravo, c1603c.bravo) && this.charlie == c1603c.charlie && Intrinsics.areEqual(this.delta, c1603c.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() * 31;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.delta.hashCode() + ((((hashCode2 + hashCode) * 31) + this.charlie) * 31);
    }

    public final String toString() {
        return "CashierItem(name=" + this.alpha + ", nameAr=" + this.bravo + ", quantity=" + this.charlie + ", modifiers=" + this.delta + ")";
    }
}
