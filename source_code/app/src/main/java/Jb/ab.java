package Jb;

import delivery.samurai.android.ui.homev2.ConnectionDiagnosticsViewModelV2;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ab extends Pd.i implements Xd.l {
    public kotlin.jvm.internal.t alpha;
    public ConnectionDiagnosticsViewModelV2 purple;
    public int red;
    public int silver;
    public int teal;
    public final /* synthetic */ ConnectionDiagnosticsViewModelV2 white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ConnectionDiagnosticsViewModelV2 connectionDiagnosticsViewModelV2, Nd.c cVar) {
        super(2, cVar);
        this.white = connectionDiagnosticsViewModelV2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ab(this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ab) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0061  */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.jvm.internal.t, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0053 -> B:5:0x0056). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.t tVar;
        ConnectionDiagnosticsViewModelV2 connectionDiagnosticsViewModelV2;
        int i4;
        int i5;
        Od.a aVar = Od.a.alpha;
        int i10 = this.teal;
        if (i10 != 0) {
            if (i10 == 1) {
                i4 = this.silver;
                i5 = this.red;
                connectionDiagnosticsViewModelV2 = this.purple;
                tVar = this.alpha;
                ResultKt.alpha(obj);
                long j5 = tVar.alpha * 2;
                if (j5 > 8000) {
                    j5 = 8000;
                }
                tVar.alpha = j5;
                i4++;
                if (i4 < i5) {
                    connectionDiagnosticsViewModelV2.getClass();
                    vf.ad.zulu(androidx.lifecycle.T.hotel(connectionDiagnosticsViewModelV2), null, null, new aa(connectionDiagnosticsViewModelV2, null), 3);
                    long j6 = tVar.alpha;
                    this.alpha = tVar;
                    this.purple = connectionDiagnosticsViewModelV2;
                    this.red = i5;
                    this.silver = i4;
                    this.teal = 1;
                    if (vf.ad.november(j6, this) == aVar) {
                        return aVar;
                    }
                    long j52 = tVar.alpha * 2;
                    if (j52 > 8000) {
                    }
                    tVar.alpha = j52;
                    i4++;
                    if (i4 < i5) {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            ?? obj2 = new Object();
            obj2.alpha = 1000L;
            tVar = obj2;
            connectionDiagnosticsViewModelV2 = this.white;
            i4 = 0;
            i5 = 3;
            if (i4 < i5) {
            }
        }
    }
}
