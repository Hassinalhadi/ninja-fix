package fg;

import Xd.l;
import com.clevertap.android.sdk.Constants;
import ge.InterfaceC1772d;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public final lg.b alpha;
    public final InterfaceC1772d bravo;
    public final lg.b charlie;
    public final l delta;
    public final c echo;
    public final List foxtrot;

    public a(lg.b scopeQualifier, InterfaceC1772d primaryType, lg.b bVar, l lVar, c cVar, List secondaryTypes) {
        Intrinsics.echo(scopeQualifier, "scopeQualifier");
        Intrinsics.echo(primaryType, "primaryType");
        Intrinsics.echo(secondaryTypes, "secondaryTypes");
        this.alpha = scopeQualifier;
        this.bravo = primaryType;
        this.charlie = bVar;
        this.delta = lVar;
        this.echo = cVar;
        this.foxtrot = secondaryTypes;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            Intrinsics.charlie(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
            a aVar = (a) obj;
            if (!Intrinsics.areEqual(this.bravo, aVar.bravo) || !Intrinsics.areEqual(this.charlie, aVar.charlie) || !Intrinsics.areEqual(this.alpha, aVar.alpha)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        lg.b bVar = this.charlie;
        if (bVar != null) {
            i4 = bVar.alpha.hashCode();
        } else {
            i4 = 0;
        }
        return this.alpha.alpha.hashCode() + ((this.bravo.hashCode() + (i4 * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(this.echo);
        sb2.append(": '");
        sb2.append(pg.a.alpha(this.bravo));
        sb2.append('\'');
        lg.b bVar = this.charlie;
        if (bVar != null) {
            sb2.append(",qualifier:");
            sb2.append(bVar);
        }
        lg.b bVar2 = this.alpha;
        if (!Intrinsics.areEqual(bVar2, mg.a.echo)) {
            sb2.append(",scope:");
            sb2.append(bVar2);
        }
        if (!this.foxtrot.isEmpty()) {
            sb2.append(",binds:");
            CollectionsKt.magenta(this.foxtrot, sb2, Constants.SEPARATOR_COMMA, null, null, new com.clevertap.android.sdk.inapp.images.preload.a(16), 60);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
