package C1;

import androidx.datastore.core.CorruptionException;
import java.io.Serializable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class ag extends Pd.i implements Function1 {
    public Serializable alpha;
    public int purple;
    public final /* synthetic */ Ref.ObjectRef red;
    public final /* synthetic */ ap silver;
    public final /* synthetic */ kotlin.jvm.internal.s teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(Ref.ObjectRef objectRef, ap apVar, kotlin.jvm.internal.s sVar, Nd.c cVar) {
        super(1, cVar);
        this.red = objectRef;
        this.silver = apVar;
        this.teal = sVar;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new ag(this.red, this.silver, this.teal, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ag) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r9 != r0) goto L30;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        kotlin.jvm.internal.s sVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        kotlin.jvm.internal.s sVar2 = this.teal;
        Ref.ObjectRef objectRef2 = this.red;
        ap apVar = this.silver;
        try {
        } catch (CorruptionException unused) {
            Object obj2 = objectRef2.alpha;
            this.alpha = sVar2;
            this.purple = 3;
            obj = apVar.kilo(obj2, true, this);
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        sVar2 = (kotlin.jvm.internal.s) this.alpha;
                        ResultKt.alpha(obj);
                        sVar2.alpha = ((Number) obj).intValue();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (kotlin.jvm.internal.s) this.alpha;
                ResultKt.alpha(obj);
                sVar.alpha = ((Number) obj).intValue();
                return Unit.INSTANCE;
            }
            objectRef = (Ref.ObjectRef) this.alpha;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            this.alpha = objectRef2;
            this.purple = 1;
            obj = apVar.juliet(this);
            if (obj != aVar) {
                objectRef = objectRef2;
            } else {
                return aVar;
            }
        }
        objectRef.alpha = obj;
        A hotel = apVar.hotel();
        this.alpha = sVar2;
        this.purple = 2;
        obj = hotel.alpha();
        if (obj != aVar) {
            sVar = sVar2;
            sVar.alpha = ((Number) obj).intValue();
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
