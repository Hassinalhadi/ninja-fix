package C1;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class l extends Pd.i implements Function1 {
    public Object alpha;
    public Serializable purple;
    public Object red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ap f775s;
    public Object silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.o f776t;
    public Iterator teal;
    public int white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ap apVar, com.google.firebase.messaging.o oVar, Nd.c cVar) {
        super(1, cVar);
        this.f775s = apVar;
        this.f776t = oVar;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new l(this.f775s, this.f776t, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.io.Serializable] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ef.a alpha;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.q qVar;
        Iterator it;
        Ef.a aVar;
        kotlin.jvm.internal.q qVar2;
        Ref.ObjectRef objectRef3;
        k kVar;
        kotlin.jvm.internal.q qVar3;
        Ef.c cVar;
        Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.q qVar4;
        Object obj2;
        Object obj3;
        int i4;
        Integer alpha2;
        int i5;
        Od.a aVar2 = Od.a.alpha;
        int i10 = this.yellow;
        com.google.firebase.messaging.o oVar = this.f776t;
        ap apVar = this.f775s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            i5 = this.white;
                            obj3 = this.alpha;
                            ResultKt.alpha(obj);
                            return new C0080b(obj3, i5, ((Number) obj).intValue());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj4 = (Ef.a) this.red;
                    objectRef4 = (Ref.ObjectRef) this.purple;
                    qVar4 = (kotlin.jvm.internal.q) this.alpha;
                    ResultKt.alpha(obj);
                    obj2 = obj4;
                    try {
                        qVar4.alpha = true;
                        ((Ef.c) obj2).foxtrot(null);
                        obj3 = objectRef4.alpha;
                        if (obj3 == null) {
                            i4 = obj3.hashCode();
                        } else {
                            i4 = 0;
                        }
                        A hotel = apVar.hotel();
                        this.alpha = obj3;
                        this.purple = null;
                        this.red = null;
                        this.white = i4;
                        this.yellow = 4;
                        alpha2 = hotel.alpha();
                        if (alpha2 != aVar2) {
                            i5 = i4;
                            obj = alpha2;
                            return new C0080b(obj3, i5, ((Number) obj).intValue());
                        }
                        return aVar2;
                    } catch (Throwable th) {
                        ((Ef.c) obj2).foxtrot(null);
                        throw th;
                    }
                }
                it = this.teal;
                kVar = (k) this.silver;
                objectRef3 = (Ref.ObjectRef) this.red;
                qVar2 = (kotlin.jvm.internal.q) this.purple;
                aVar = (Ef.a) this.alpha;
                ResultKt.alpha(obj);
                while (it.hasNext()) {
                    Xd.l lVar = (Xd.l) it.next();
                    this.alpha = aVar;
                    this.purple = qVar2;
                    this.red = objectRef3;
                    this.silver = kVar;
                    this.teal = it;
                    this.yellow = 2;
                    if (lVar.invoke(kVar, this) == aVar2) {
                        break;
                    }
                }
                objectRef2 = objectRef3;
                qVar3 = qVar2;
                alpha = aVar;
                oVar.charlie = null;
                this.alpha = qVar3;
                this.purple = objectRef2;
                this.red = alpha;
                this.silver = null;
                this.teal = null;
                this.yellow = 3;
                cVar = (Ef.c) alpha;
                if (cVar.delta(this) != aVar2) {
                    objectRef4 = objectRef2;
                    qVar4 = qVar3;
                    obj2 = cVar;
                    qVar4.alpha = true;
                    ((Ef.c) obj2).foxtrot(null);
                    obj3 = objectRef4.alpha;
                    if (obj3 == null) {
                    }
                    A hotel2 = apVar.hotel();
                    this.alpha = obj3;
                    this.purple = null;
                    this.red = null;
                    this.white = i4;
                    this.yellow = 4;
                    alpha2 = hotel2.alpha();
                    if (alpha2 != aVar2) {
                    }
                }
                return aVar2;
            }
            objectRef = (Ref.ObjectRef) this.silver;
            objectRef2 = (Ref.ObjectRef) this.red;
            kotlin.jvm.internal.q qVar5 = (kotlin.jvm.internal.q) this.purple;
            alpha = (Ef.a) this.alpha;
            ResultKt.alpha(obj);
            qVar = qVar5;
        } else {
            ResultKt.alpha(obj);
            alpha = Ef.d.alpha();
            ?? obj5 = new Object();
            objectRef = new Ref.ObjectRef();
            this.alpha = alpha;
            this.purple = obj5;
            this.red = objectRef;
            this.silver = objectRef;
            this.yellow = 1;
            obj = ap.golf(apVar, true, this);
            if (obj != aVar2) {
                objectRef2 = objectRef;
                qVar = obj5;
            }
            return aVar2;
        }
        objectRef.alpha = ((C0080b) obj).bravo;
        k kVar2 = new k(alpha, qVar, objectRef2, apVar);
        List list = (List) oVar.charlie;
        qVar3 = qVar;
        if (list != null) {
            it = list.iterator();
            aVar = alpha;
            qVar2 = qVar;
            objectRef3 = objectRef2;
            kVar = kVar2;
            while (it.hasNext()) {
            }
            objectRef2 = objectRef3;
            qVar3 = qVar2;
            alpha = aVar;
        }
        oVar.charlie = null;
        this.alpha = qVar3;
        this.purple = objectRef2;
        this.red = alpha;
        this.silver = null;
        this.teal = null;
        this.yellow = 3;
        cVar = (Ef.c) alpha;
        if (cVar.delta(this) != aVar2) {
        }
        return aVar2;
    }
}
