package A2;

import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class ab extends aj {
    public final /* synthetic */ int echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab(int i4, Class cls) {
        super(cls);
        this.echo = i4;
    }

    @Override // A2.aj
    public final ak charlie() {
        switch (this.echo) {
            case 0:
                return new ak((UUID) this.bravo, (J2.p) this.charlie, (Set) this.delta);
            default:
                J2.p pVar = (J2.p) this.charlie;
                if (!pVar.quebec) {
                    return new ak((UUID) this.bravo, pVar, (Set) this.delta);
                }
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
    }
}
