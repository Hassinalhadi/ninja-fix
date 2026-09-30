package sd;

import androidx.appcompat.widget.P0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {
    public final String alpha;
    public final String bravo;

    public j(String name, String value) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(value, "value");
        this.alpha = name;
        this.bravo = value;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (kotlin.text.r.hotel(jVar.alpha, this.alpha, true) && kotlin.text.r.hotel(jVar.bravo, this.bravo, true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.alpha.toLowerCase(locale);
        Intrinsics.delta(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.bravo.toLowerCase(locale);
        Intrinsics.delta(lowerCase2, "toLowerCase(...)");
        return lowerCase2.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderValueParam(name=");
        sb2.append(this.alpha);
        sb2.append(", value=");
        return P0.gold(sb2, this.bravo, ", escapeValue=false)");
    }
}
