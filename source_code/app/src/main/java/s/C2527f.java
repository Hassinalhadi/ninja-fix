package s;

import A2.s;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import u.InterfaceC3132f;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2527f extends Pd.i implements Function1 {
    public int alpha;
    public final /* synthetic */ C2528g purple;
    public final /* synthetic */ InterfaceC3132f red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2527f(C2528g c2528g, InterfaceC3132f interfaceC3132f, Nd.c cVar) {
        super(1, cVar);
        this.purple = c2528g;
        this.red = interfaceC3132f;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new C2527f(this.purple, this.red, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C2527f) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Finally extract failed */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Looper looper;
        C2525d c2525d;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        C2528g c2528g = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                C2526e c2526e = new C2526e();
                c2528g.getClass();
                InterfaceC3132f interfaceC3132f = this.red;
                C2522a c2522a = new C2522a(c2528g, interfaceC3132f, 0);
                C2522a c2522a2 = new C2522a(c2528g, interfaceC3132f, 1);
                View view = c2528g.alpha;
                C2525d c2525d2 = new C2525d(c2526e, c2522a, c2522a2, view);
                Function1 function1 = c2528g.bravo;
                if (function1 != null && (c2525d = (C2525d) function1.invoke(c2525d2)) != null) {
                    c2525d2 = c2525d;
                }
                Looper myLooper = Looper.myLooper();
                Handler handler = view.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (myLooper != looper) {
                    s sVar = c2528g.india;
                    if (sVar == null) {
                        sVar = new s(c2528g, c2525d2, c2526e, 27);
                        c2528g.india = sVar;
                    }
                    view.post(sVar);
                } else {
                    ActionMode startActionMode = view.startActionMode(new ActionModeCallbackC2535n(c2525d2), 1);
                    if (startActionMode == null) {
                        return Unit.INSTANCE;
                    }
                    c2528g.hotel = startActionMode;
                }
                this.alpha = 1;
                Object india = c2526e.alpha.india(this);
                if (india != aVar) {
                    india = Unit.INSTANCE;
                }
                if (india == aVar) {
                    return aVar;
                }
            }
            c2528g.echo.alpha();
            ActionMode actionMode = c2528g.hotel;
            if (actionMode != null) {
                actionMode.finish();
            }
            s sVar2 = c2528g.india;
            if (sVar2 != null) {
                c2528g.alpha.removeCallbacks(sVar2);
            }
            c2528g.hotel = null;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            c2528g.echo.alpha();
            ActionMode actionMode2 = c2528g.hotel;
            if (actionMode2 != null) {
                actionMode2.finish();
            }
            s sVar3 = c2528g.india;
            if (sVar3 != null) {
                c2528g.alpha.removeCallbacks(sVar3);
            }
            c2528g.hotel = null;
            throw th;
        }
    }
}
