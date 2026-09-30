package C1;

import kotlin.ResultKt;
import kotlin.Unit;
import yf.C3446p;
import yf.InterfaceC3440j;
import yf.N;
import yf.P;

/* loaded from: classes3.dex */
public final class u extends Pd.i implements Xd.l {
    public C0080b alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ ap silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ap apVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = apVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        u uVar = new u(this.silver, cVar);
        uVar.red = obj;
        return uVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((InterfaceC3440j) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c7, code lost:
    
        if (r11 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r3.emit(r11, r10) == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Type inference failed for: r11v19, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC3440j interfaceC3440j;
        B b2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        ap apVar = this.silver;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        ResultKt.alpha(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b2 = this.alpha;
                interfaceC3440j = (InterfaceC3440j) this.red;
                ResultKt.alpha(obj);
                C3446p c3446p = new C3446p(new t(0, new yf.s(new yf.s(new J8.ah(1, new n(apVar, null), (N) apVar.hotel.purple), new Pd.i(2, null), 2), new p(b2, null), 1)), new q(apVar, (Nd.c) null));
                this.red = null;
                this.alpha = null;
                this.purple = 3;
                if (interfaceC3440j instanceof P) {
                    Object collect = c3446p.collect(interfaceC3440j, this);
                    if (collect != aVar) {
                        collect = Unit.INSTANCE;
                    }
                } else {
                    throw ((P) interfaceC3440j).alpha;
                }
            } else {
                InterfaceC3440j interfaceC3440j2 = (InterfaceC3440j) this.red;
                ResultKt.alpha(obj);
                interfaceC3440j = interfaceC3440j2;
            }
        } else {
            ResultKt.alpha(obj);
            InterfaceC3440j interfaceC3440j3 = (InterfaceC3440j) this.red;
            this.red = interfaceC3440j3;
            this.purple = 1;
            Object blue = vf.ad.blue(apVar.charlie.charlie(), new ah(apVar, null), this);
            if (blue != aVar) {
                interfaceC3440j = interfaceC3440j3;
                obj = blue;
            }
            return aVar;
        }
        b2 = (B) obj;
        if (b2 instanceof C0080b) {
            Object obj2 = ((C0080b) b2).bravo;
            this.red = interfaceC3440j;
            this.alpha = (C0080b) b2;
            this.purple = 2;
        } else if (!(b2 instanceof C)) {
            if (!(b2 instanceof at)) {
                if (b2 instanceof aq) {
                    return Unit.INSTANCE;
                }
            } else {
                throw ((at) b2).bravo;
            }
        } else {
            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        C3446p c3446p2 = new C3446p(new t(0, new yf.s(new yf.s(new J8.ah(1, new n(apVar, null), (N) apVar.hotel.purple), new Pd.i(2, null), 2), new p(b2, null), 1)), new q(apVar, (Nd.c) null));
        this.red = null;
        this.alpha = null;
        this.purple = 3;
        if (interfaceC3440j instanceof P) {
        }
    }
}
