package p1;

import java.util.List;
import java.util.Objects;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2267b {
    public String alpha;
    public String bravo;
    public List charlie;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2267b)) {
            return false;
        }
        C2267b c2267b = (C2267b) obj;
        if (Objects.equals(this.alpha, c2267b.alpha) && Objects.equals(this.bravo, c2267b.bravo) && Objects.equals(this.charlie, c2267b.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.alpha, this.bravo, this.charlie);
    }
}
