package zf;

import bz.af;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class y extends Pd.c implements InterfaceC3440j {
    public final InterfaceC3440j alpha;
    public final Nd.h purple;
    public final int red;
    public Nd.h silver;
    public Nd.c teal;

    public y(InterfaceC3440j interfaceC3440j, Nd.h hVar) {
        super(w.alpha, Nd.i.alpha);
        this.alpha = interfaceC3440j;
        this.purple = hVar;
        this.red = ((Number) hVar.fold(0, new ud.f(20))).intValue();
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        try {
            Object foxtrot = foxtrot(cVar, obj);
            if (foxtrot == Od.a.alpha) {
                return foxtrot;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.silver = new u(cVar.getContext(), th);
            throw th;
        }
    }

    public final Object foxtrot(Nd.c cVar, Object obj) {
        Nd.h context = cVar.getContext();
        vf.ad.oscar(context);
        Nd.h hVar = this.silver;
        if (hVar != context) {
            if (!(hVar instanceof u)) {
                if (((Number) context.fold(0, new af(24, this))).intValue() == this.red) {
                    this.silver = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.purple + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(kotlin.text.n.charlie("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((u) hVar).purple + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.teal = cVar;
        z zVar = aa.alpha;
        InterfaceC3440j interfaceC3440j = this.alpha;
        Intrinsics.charlie(interfaceC3440j, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        zVar.getClass();
        Object emit = interfaceC3440j.emit(obj, this);
        if (!Intrinsics.areEqual(emit, Od.a.alpha)) {
            this.teal = null;
        }
        return emit;
    }

    @Override // Pd.a, Pd.d
    public final Pd.d getCallerFrame() {
        Nd.c cVar = this.teal;
        if (cVar instanceof Pd.d) {
            return (Pd.d) cVar;
        }
        return null;
    }

    @Override // Pd.c, Nd.c
    public final Nd.h getContext() {
        Nd.h hVar = this.silver;
        if (hVar == null) {
            return Nd.i.alpha;
        }
        return hVar;
    }

    @Override // Pd.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        if (m207exceptionOrNullimpl != null) {
            this.silver = new u(getContext(), m207exceptionOrNullimpl);
        }
        Nd.c cVar = this.teal;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return Od.a.alpha;
    }
}
