package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0619n extends Lambda implements Function0 {
    public final /* synthetic */ C0620o alpha;
    public final /* synthetic */ ViewGroup purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Ref.ObjectRef silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0619n(C0620o c0620o, ViewGroup viewGroup, Object obj, Ref.ObjectRef objectRef) {
        super(0);
        this.alpha = c0620o;
        this.purple = viewGroup;
        this.red = obj;
        this.silver = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (L.gray(2)) {
            Log.v("FragmentManager", "Attempting to create TransitionSeekController");
        }
        C0620o c0620o = this.alpha;
        d0 d0Var = c0620o.foxtrot;
        ViewGroup viewGroup = this.purple;
        Object obj = this.red;
        Object india = d0Var.india(viewGroup, obj);
        c0620o.quebec = india;
        if (india == null) {
            if (L.gray(2)) {
                Log.v("FragmentManager", "TransitionSeekController was not created.");
            }
            c0620o.romeo = true;
        } else {
            this.silver.alpha = new C0618m(c0620o, obj, viewGroup);
            if (L.gray(2)) {
                Log.v("FragmentManager", "Started executing operations from " + c0620o.delta + " to " + c0620o.echo);
            }
        }
        return Unit.INSTANCE;
    }
}
