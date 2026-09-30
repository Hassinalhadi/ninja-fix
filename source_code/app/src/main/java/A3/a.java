package A3;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public final boolean alpha;
    public final Object bravo;
    public final Enum charlie;
    public final String delta;
    public final List echo;

    public a(boolean z2, String str, B3.a aVar, String str2, List messageArgs, int i4) {
        str = (i4 & 2) != 0 ? null : str;
        aVar = (i4 & 4) != 0 ? null : aVar;
        str2 = (i4 & 8) != 0 ? null : str2;
        messageArgs = (i4 & 16) != 0 ? CollectionsKt.emptyList() : messageArgs;
        Intrinsics.echo(messageArgs, "messageArgs");
        this.alpha = z2;
        this.bravo = str;
        this.charlie = aVar;
        this.delta = str2;
        this.echo = messageArgs;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.alpha != aVar.alpha || !Intrinsics.areEqual(this.bravo, aVar.bravo) || !Intrinsics.areEqual(this.charlie, aVar.charlie) || !Intrinsics.areEqual(this.delta, aVar.delta) || !Intrinsics.areEqual(this.echo, aVar.echo)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        int hashCode2;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = i4 * 31;
        int i10 = 0;
        Object obj = this.bravo;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (i5 + hashCode) * 31;
        Enum r22 = this.charlie;
        if (r22 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r22.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str = this.delta;
        if (str != null) {
            i10 = str.hashCode();
        }
        return this.echo.hashCode() + ((i12 + i10) * 31);
    }

    public final String toString() {
        return "ValidationResult(isValid=" + this.alpha + ", normalized=" + this.bravo + ", errorKey=" + this.charlie + ", messageKey=" + this.delta + ", messageArgs=" + this.echo + ")";
    }
}
