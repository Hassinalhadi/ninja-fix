package Me;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2778t6;

/* loaded from: classes2.dex */
public final class e extends AbstractC2778t6 {
    public final String bravo;
    public final String charlie;

    public e(String name, String desc) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(desc, "desc");
        this.bravo = name;
        this.charlie = desc;
    }

    @Override // s6.AbstractC2778t6
    public final String bravo() {
        return this.bravo + this.charlie;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Intrinsics.areEqual(this.bravo, eVar.bravo) && Intrinsics.areEqual(this.charlie, eVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + (this.bravo.hashCode() * 31);
    }
}
