package F;

import af.C0430a;
import af.C0433d;
import af.C0440k;
import android.view.ActionMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import s.C2528g;
import u.C3128b;
import u.C3130d;
import wc.C3257c;
import y.C3344D;

/* renamed from: F.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0130l1 implements androidx.compose.runtime.af {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ C0130l1(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // androidx.compose.runtime.af
    public final void dispose() {
        Unit unit;
        Unit unit2 = null;
        Object obj = this.bravo;
        switch (this.alpha) {
            case 0:
                M0 m02 = (M0) obj;
                m02.dismiss();
                m02.silver.delta();
                return;
            case 1:
                U0.v vVar = (U0.v) obj;
                vVar.dismiss();
                vVar.silver.delta();
                return;
            case 2:
                U0.z zVar = (U0.z) obj;
                zVar.delta();
                zVar.getClass();
                androidx.lifecycle.T.juliet(zVar, null);
                zVar.f2104g.removeViewImmediate(zVar);
                return;
            case 3:
                ah.g gVar = ((C0430a) obj).alpha;
                if (gVar != null) {
                    gVar.bravo();
                    unit2 = Unit.INSTANCE;
                }
                if (unit2 != null) {
                    return;
                } else {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
            case 4:
                ((C0433d) obj).remove();
                return;
            case 5:
                ((C0440k) obj).remove();
                return;
            case 6:
                ((androidx.compose.foundation.lazy.layout.t) obj).delta = null;
                return;
            case 7:
                androidx.compose.foundation.lazy.layout.ai aiVar = (androidx.compose.foundation.lazy.layout.ai) obj;
                C3.d dVar = aiVar.charlie;
                if (dVar != null) {
                    dVar.alpha = false;
                }
                aiVar.charlie = null;
                return;
            case 8:
                ((androidx.compose.foundation.lazy.layout.ad) obj).foxtrot = true;
                return;
            case 9:
                ((C3344D) obj).papa();
                return;
            case 10:
                C2528g c2528g = (C2528g) obj;
                S.x xVar = c2528g.echo;
                B2.s sVar = xVar.hotel;
                if (sVar != null) {
                    sVar.charlie();
                }
                xVar.alpha();
                ActionMode actionMode = c2528g.hotel;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c2528g.hotel = null;
                return;
            case 11:
                ((t0.V) obj).purple.invoke();
                return;
            case 12:
                C3128b c3128b = (C3128b) ((androidx.compose.runtime.t0) ((C3130d) obj).charlie).getValue();
                if (c3128b != null) {
                    c3128b.close();
                    return;
                }
                return;
            default:
                C3257c c3257c = (C3257c) obj;
                c3257c.echo.set(true);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    bo.e eVar = c3257c.kilo;
                    if (eVar != null) {
                        eVar.foxtrot();
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    Result.m206constructorimpl(unit);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m206constructorimpl(ResultKt.createFailure(th));
                }
                try {
                    c3257c.foxtrot.shutdown();
                    Result.m206constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m206constructorimpl(ResultKt.createFailure(th2));
                }
                try {
                    c3257c.golf.close();
                    Result.m206constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m206constructorimpl(ResultKt.createFailure(th3));
                }
                c3257c.hotel = null;
                c3257c.juliet = null;
                c3257c.kilo = null;
                return;
        }
    }
}
