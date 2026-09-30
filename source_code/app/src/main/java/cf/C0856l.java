package cf;

import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: cf.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0856l {
    public final Object alpha;
    public final Me.f bravo;
    public final Me.f charlie;
    public final Me.f delta;
    public final String echo;
    public final Ne.b foxtrot;

    public C0856l(Object obj, Me.f fVar, Me.f fVar2, Me.f fVar3, String filePath, Ne.b bVar) {
        Intrinsics.echo(filePath, "filePath");
        this.alpha = obj;
        this.bravo = fVar;
        this.charlie = fVar2;
        this.delta = fVar3;
        this.echo = filePath;
        this.foxtrot = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0856l) {
                C0856l c0856l = (C0856l) obj;
                if (!Intrinsics.areEqual(this.alpha, c0856l.alpha) || !Intrinsics.areEqual(this.bravo, c0856l.bravo) || !Intrinsics.areEqual(this.charlie, c0856l.charlie) || !Intrinsics.areEqual(this.delta, c0856l.delta) || !Intrinsics.areEqual(this.echo, c0856l.echo) || !Intrinsics.areEqual(this.foxtrot, c0856l.foxtrot)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() * 31;
        int i4 = 0;
        Me.f fVar = this.bravo;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        int i5 = (hashCode2 + hashCode) * 31;
        Me.f fVar2 = this.charlie;
        if (fVar2 != null) {
            i4 = fVar2.hashCode();
        }
        return this.foxtrot.hashCode() + AbstractC2327c.sierra((this.delta.hashCode() + ((i5 + i4) * 31)) * 31, 31, this.echo);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.alpha + ", compilerVersion=" + this.bravo + ", languageVersion=" + this.charlie + ", expectedVersion=" + this.delta + ", filePath=" + this.echo + ", classId=" + this.foxtrot + ')';
    }
}
