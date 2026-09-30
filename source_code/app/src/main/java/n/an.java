package n;

import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import okhttp3.internal.http2.Settings;
import t0.AbstractC2901T;

/* loaded from: classes3.dex */
public final class an implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ D0.an red;

    public an(int i4, int i5, D0.an anVar) {
        this.alpha = i4;
        this.purple = i5;
        this.red = anVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i4;
        int i5;
        Integer valueOf;
        float f5;
        ((Number) obj3).intValue();
        C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
        c0585q.purple(408240218);
        int i10 = this.alpha;
        int i11 = this.purple;
        at.yankee(i10, i11);
        T.p pVar = T.p.alpha;
        if (i10 == 1 && i11 == Integer.MAX_VALUE) {
            c0585q.quebec(false);
            return pVar;
        }
        Q0.d dVar = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
        H0.j jVar = (H0.j) c0585q.kilo(AbstractC2901T.kilo);
        Q0.n nVar = (Q0.n) c0585q.kilo(AbstractC2901T.november);
        D0.an anVar = this.red;
        boolean golf = c0585q.golf(anVar) | c0585q.echo(nVar.ordinal());
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (golf || jade == asVar) {
            jade = D0.ae.hotel(anVar, nVar);
            c0585q.f(jade);
        }
        D0.an anVar2 = (D0.an) jade;
        boolean golf2 = c0585q.golf(jVar) | c0585q.golf(anVar2);
        Object jade2 = c0585q.jade();
        if (golf2 || jade2 == asVar) {
            D0.af afVar = anVar2.alpha;
            H0.k kVar = afVar.foxtrot;
            H0.v vVar = afVar.charlie;
            if (vVar == null) {
                vVar = H0.v.yellow;
            }
            H0.r rVar = afVar.delta;
            if (rVar != null) {
                i4 = rVar.alpha;
            } else {
                i4 = 0;
            }
            H0.s sVar = afVar.echo;
            if (sVar != null) {
                i5 = sVar.alpha;
            } else {
                i5 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            }
            jade2 = ((H0.l) jVar).bravo(kVar, vVar, i4, i5);
            c0585q.f(jade2);
        }
        D0 d02 = (D0) jade2;
        boolean golf3 = c0585q.golf(d02.getValue()) | c0585q.golf(dVar) | c0585q.golf(jVar) | c0585q.golf(anVar) | c0585q.echo(nVar.ordinal());
        Object jade3 = c0585q.jade();
        if (golf3 || jade3 == asVar) {
            jade3 = Integer.valueOf((int) (P.alpha(anVar2, dVar, jVar, P.alpha, 1) & 4294967295L));
            c0585q.f(jade3);
        }
        int intValue = ((Number) jade3).intValue();
        boolean golf4 = c0585q.golf(d02.getValue()) | c0585q.golf(dVar) | c0585q.golf(jVar) | c0585q.golf(anVar) | c0585q.echo(nVar.ordinal());
        Object jade4 = c0585q.jade();
        if (golf4 || jade4 == asVar) {
            StringBuilder sb2 = new StringBuilder();
            String str = P.alpha;
            sb2.append(str);
            sb2.append('\n');
            sb2.append(str);
            jade4 = Integer.valueOf((int) (P.alpha(anVar2, dVar, jVar, sb2.toString(), 2) & 4294967295L));
            c0585q.f(jade4);
        }
        int intValue2 = ((Number) jade4).intValue() - intValue;
        Integer num = null;
        if (i10 == 1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((i10 - 1) * intValue2) + intValue);
        }
        if (i11 != Integer.MAX_VALUE) {
            num = Integer.valueOf(((i11 - 1) * intValue2) + intValue);
        }
        float f10 = Float.NaN;
        if (valueOf != null) {
            f5 = dVar.crimson(valueOf.intValue());
        } else {
            f5 = Float.NaN;
        }
        if (num != null) {
            f10 = dVar.crimson(num.intValue());
        }
        T.s foxtrot = androidx.compose.foundation.layout.V.foxtrot(pVar, f5, f10);
        c0585q.quebec(false);
        return foxtrot;
    }
}
