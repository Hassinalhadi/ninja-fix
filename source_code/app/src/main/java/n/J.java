package n;

import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;

/* loaded from: classes3.dex */
public final class J {
    public final D0.g alpha;
    public final D0.an bravo;
    public final boolean echo;
    public final Q0.d golf;
    public final H0.j hotel;
    public final List india;
    public B9.ab juliet;
    public Q0.n kilo;
    public final int charlie = LottieConstants.IterateForever;
    public final int delta = 1;
    public final int foxtrot = 1;

    public J(D0.g gVar, D0.an anVar, boolean z2, Q0.d dVar, H0.j jVar, List list) {
        this.alpha = gVar;
        this.bravo = anVar;
        this.echo = z2;
        this.golf = dVar;
        this.hotel = jVar;
        this.india = list;
    }

    public final void alpha(Q0.n nVar) {
        B9.ab abVar = this.juliet;
        if (abVar == null || nVar != this.kilo || abVar.delta()) {
            this.kilo = nVar;
            abVar = new B9.ab(this.alpha, D0.ae.hotel(this.bravo, nVar), this.india, this.golf, this.hotel);
        }
        this.juliet = abVar;
    }
}
