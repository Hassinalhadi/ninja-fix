package O7;

import R7.ab;
import java.io.File;

/* loaded from: classes2.dex */
public final class a {
    public final ab alpha;
    public final String bravo;
    public final File charlie;

    public a(ab abVar, String str, File file) {
        this.alpha = abVar;
        if (str != null) {
            this.bravo = str;
            this.charlie = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.alpha.equals(aVar.alpha) && this.bravo.equals(aVar.bravo) && this.charlie.equals(aVar.charlie)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.alpha + ", sessionId=" + this.bravo + ", reportFile=" + this.charlie + "}";
    }
}
