package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0628x implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ RunnableC0628x(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                ai aiVar = (ai) this.purple;
                e0 e0Var = aiVar.mViewLifecycleOwner;
                e0Var.white.bravo(aiVar.mSavedViewRegistryState);
                aiVar.mSavedViewRegistryState = null;
                return;
            case 1:
                Ref.ObjectRef seekCancelLambda = (Ref.ObjectRef) this.purple;
                Intrinsics.echo(seekCancelLambda, "$seekCancelLambda");
                Function0 function0 = (Function0) seekCancelLambda.alpha;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 2:
                W.alpha(4, (ArrayList) this.purple);
                return;
            case 3:
                C0620o this$0 = (C0620o) this.purple;
                Intrinsics.echo(this$0, "this$0");
                if (L.gray(2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                Iterator it = this$0.charlie.iterator();
                while (it.hasNext()) {
                    ((C0621p) it.next()).alpha.charlie(this$0);
                }
                return;
            default:
                Iterator it2 = ((L) this.purple).oscar.iterator();
                while (it2.hasNext()) {
                    ((G) it2.next()).onBackStackChangeCancelled();
                }
                return;
        }
    }
}
