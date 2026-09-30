package cf;

import kotlin.jvm.internal.Intrinsics;
import pe.an;

/* renamed from: cf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0848d {
    public final Ke.e alpha;
    public final Ie.j bravo;
    public final Ke.a charlie;
    public final an delta;

    public C0848d(Ke.e nameResolver, Ie.j classProto, Ke.a aVar, an sourceElement) {
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(classProto, "classProto");
        Intrinsics.echo(sourceElement, "sourceElement");
        this.alpha = nameResolver;
        this.bravo = classProto;
        this.charlie = aVar;
        this.delta = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0848d)) {
            return false;
        }
        C0848d c0848d = (C0848d) obj;
        if (Intrinsics.areEqual(this.alpha, c0848d.alpha) && Intrinsics.areEqual(this.bravo, c0848d.bravo) && Intrinsics.areEqual(this.charlie, c0848d.charlie) && Intrinsics.areEqual(this.delta, c0848d.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.delta.hashCode() + ((this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.alpha + ", classProto=" + this.bravo + ", metadataVersion=" + this.charlie + ", sourceElement=" + this.delta + ')';
    }
}
