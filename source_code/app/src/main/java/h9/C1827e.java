package h9;

import android.location.Location;
import com.incognia.internal.BGx;
import com.incognia.internal.Dl;
import com.incognia.internal.FmN;
import com.incognia.internal.FnB;
import com.incognia.internal.J0;
import com.incognia.internal.Jup;
import com.incognia.internal.K4F;
import com.incognia.internal.QYW;
import com.incognia.internal.V2;
import com.incognia.internal.WA;
import com.incognia.internal.Xtf;
import com.incognia.internal.ayg;
import com.incognia.internal.cQM;
import com.incognia.internal.d7p;
import com.incognia.internal.fVX;
import com.incognia.internal.hm;
import com.incognia.internal.i1;
import com.incognia.internal.thS;
import com.incognia.internal.toE;
import com.incognia.internal.urQ;
import com.incognia.internal.xSL;
import com.incognia.internal.yE;
import com.incognia.internal.yi;
import com.incognia.internal.zZG;
import kotlin.jvm.functions.Function1;

/* renamed from: h9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1827e implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;
    public final /* synthetic */ Object charlie;
    public final /* synthetic */ Object delta;

    public /* synthetic */ C1827e(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.charlie = obj;
        this.bravo = obj2;
        this.delta = obj3;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                FmN.b(this.charlie, (Function1) this.bravo, (Xtf) this.delta);
                return;
            case 1:
                J0.b((urQ) this.charlie, (cQM) this.delta, (Function1) this.bravo);
                return;
            case 2:
                Jup.b(this.charlie, (Dl) this.delta, (Function1) this.bravo);
                return;
            case 3:
                K4F.b((BGx) this.charlie, (K4F) this.bravo, (ayg) this.delta);
                return;
            case 4:
                QYW.b((Location) this.charlie, (toE) this.bravo, (V2) this.delta);
                return;
            case 5:
                V2.b((V2) this.charlie, (Exception) this.bravo, (toE) this.delta);
                return;
            case 6:
                ayg.b(this.charlie, (zZG) this.delta, (Function1) this.bravo);
                return;
            case 7:
                fVX.W((fVX) this.charlie, (Function1) this.bravo, (String) this.delta);
                return;
            case 8:
                i1.b(this.charlie, (hm) this.delta, (Function1) this.bravo);
                return;
            case 9:
                xSL.b(this.charlie, (thS) this.delta, (Function1) this.bravo);
                return;
            case 10:
                yi.b(this.charlie, (Function1) this.bravo, (FnB) this.delta);
                return;
            default:
                zZG.b((zZG) this.charlie, (WA) this.bravo, (yE) this.delta);
                return;
        }
    }

    public /* synthetic */ C1827e(Object obj, Object obj2, Function1 function1, int i4) {
        this.alpha = i4;
        this.charlie = obj;
        this.delta = obj2;
        this.bravo = function1;
    }
}
