package Y1;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;
import pf.C2355e;
import pf.C2361k;
import yf.N;

/* loaded from: classes3.dex */
public abstract class at {
    public o alpha;
    public boolean bravo;

    public abstract aa alpha();

    public final o bravo() {
        o oVar = this.alpha;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public aa charlie(aa aaVar, Bundle bundle, aj ajVar) {
        return aaVar;
    }

    public void delta(List list, aj ajVar) {
        C2355e c2355e = new C2355e(AbstractC2360j.hotel(AbstractC2360j.oscar(CollectionsKt.beige(list), new Cb.ad(21, this, ajVar)), new C2361k(1)));
        while (c2355e.hasNext()) {
            bravo().hotel((l) c2355e.next());
        }
    }

    public void echo(o oVar) {
        this.alpha = oVar;
        this.bravo = true;
    }

    public void foxtrot(l lVar) {
        boolean z2;
        aa aaVar = lVar.purple;
        if (aaVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            aaVar = null;
        }
        if (aaVar == null) {
            return;
        }
        ak akVar = new ak();
        akVar.bravo = true;
        boolean z10 = akVar.bravo;
        ai aiVar = akVar.alpha;
        aiVar.alpha = z10;
        aiVar.bravo = akVar.charlie;
        int i4 = akVar.delta;
        boolean z11 = akVar.echo;
        boolean z12 = akVar.foxtrot;
        aiVar.charlie = i4;
        aiVar.delta = z11;
        aiVar.echo = z12;
        charlie(aaVar, null, aiVar.alpha());
        bravo().delta(lVar);
    }

    public void golf(Bundle bundle) {
    }

    public Bundle hotel() {
        return null;
    }

    public void india(l lVar, boolean z2) {
        List list = (List) ((N) bravo().echo.alpha).getValue();
        if (list.contains(lVar)) {
            ListIterator listIterator = list.listIterator(list.size());
            l lVar2 = null;
            while (juliet()) {
                lVar2 = (l) listIterator.previous();
                if (Intrinsics.areEqual(lVar2, lVar)) {
                    break;
                }
            }
            if (lVar2 != null) {
                bravo().echo(lVar2, z2);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + lVar + " which does not exist in back stack " + list).toString());
    }

    public boolean juliet() {
        return true;
    }
}
