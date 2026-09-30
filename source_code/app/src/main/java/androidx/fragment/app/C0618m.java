package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0618m extends Lambda implements Function0 {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ C0620o purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ ViewGroup silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0618m(C0620o c0620o, ViewGroup viewGroup, Object obj) {
        super(0);
        this.purple = c0620o;
        this.silver = viewGroup;
        this.red = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [o1.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.foxtrot.echo(this.silver, this.red);
                return Unit.INSTANCE;
            default:
                C0620o c0620o = this.purple;
                ArrayList arrayList = c0620o.charlie;
                d0 d0Var = c0620o.foxtrot;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((C0621p) it.next()).alpha.golf) {
                            if (L.gray(2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            ?? obj = new Object();
                            d0Var.uniform(((C0621p) c0620o.charlie.get(0)).alpha.charlie, this.red, obj, new RunnableC0628x(3, c0620o));
                            obj.alpha();
                            return Unit.INSTANCE;
                        }
                    }
                }
                if (L.gray(2)) {
                    Log.v("FragmentManager", "Animating to start");
                }
                Object obj2 = c0620o.quebec;
                Intrinsics.checkNotNull(obj2);
                d0Var.delta(obj2, new RunnableC0617l(c0620o, this.silver));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0618m(C0620o c0620o, Object obj, ViewGroup viewGroup) {
        super(0);
        this.purple = c0620o;
        this.red = obj;
        this.silver = viewGroup;
    }
}
