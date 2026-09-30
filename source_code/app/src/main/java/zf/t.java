package zf;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import t6.AbstractC3017k3;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class t extends Pd.i implements Xd.l {
    public xf.i alpha;
    public byte[] purple;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function0 f14293s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Pd.i f14294t;
    public int teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f14295u;
    public /* synthetic */ Object white;
    public final /* synthetic */ InterfaceC3439i[] yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Nd.c cVar, Xd.m mVar, Function0 function0, InterfaceC3440j interfaceC3440j, InterfaceC3439i[] interfaceC3439iArr) {
        super(2, cVar);
        this.yellow = interfaceC3439iArr;
        this.f14293s = function0;
        this.f14294t = (Pd.i) mVar;
        this.f14295u = interfaceC3440j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Xd.m, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        t tVar = new t(cVar, this.f14294t, this.f14293s, this.f14295u, this.yellow);
        tVar.white = obj;
        return tVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
    
        if (r13.invoke(r14, r9, r19) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
    
        if (r13.invoke(r14, r12, r19) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r8 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fe, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Type inference failed for: r13v2, types: [Xd.m, Pd.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e4 -> B:10:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00fc -> B:10:0x0085). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int length;
        Object[] objArr;
        byte[] bArr;
        byte b2;
        xf.i iVar;
        Object obj2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.teal;
        Af.t tVar = b.charlie;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2 && i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r22 = this.silver;
                length = this.red;
                byte[] bArr2 = this.purple;
                iVar = this.alpha;
                Object[] objArr2 = (Object[]) this.white;
                ResultKt.alpha(obj);
                b2 = r22;
                bArr = bArr2;
                objArr = objArr2;
            } else {
                ?? r23 = this.silver;
                length = this.red;
                byte[] bArr3 = this.purple;
                iVar = this.alpha;
                Object[] objArr3 = (Object[]) this.white;
                ResultKt.alpha(obj);
                obj2 = ((xf.l) obj).alpha;
                b2 = r23;
                bArr = bArr3;
                objArr = objArr3;
                kotlin.collections.v vVar = (kotlin.collections.v) xf.l.alpha(obj2);
                if (vVar == null) {
                    return Unit.INSTANCE;
                }
                while (true) {
                    int i5 = vVar.alpha;
                    Object obj3 = objArr[i5];
                    objArr[i5] = vVar.bravo;
                    if (obj3 == tVar) {
                        length--;
                    }
                    if (bArr[i5] != b2) {
                        bArr[i5] = b2;
                        vVar = (kotlin.collections.v) xf.l.alpha(iVar.alpha());
                        if (vVar != null) {
                        }
                    }
                    if (length == 0) {
                        Object[] objArr4 = (Object[]) this.f14293s.invoke();
                        ?? r13 = this.f14294t;
                        InterfaceC3440j interfaceC3440j = this.f14295u;
                        if (objArr4 == null) {
                            this.white = objArr;
                            this.alpha = iVar;
                            this.purple = bArr;
                            this.red = length;
                            this.silver = b2;
                            this.teal = 2;
                        } else {
                            ArraysKt.beige(0, 0, 14, objArr, objArr4);
                            this.white = objArr;
                            this.alpha = iVar;
                            this.purple = bArr;
                            this.red = length;
                            this.silver = b2;
                            this.teal = 3;
                        }
                        kotlin.collections.v vVar2 = (kotlin.collections.v) xf.l.alpha(obj2);
                        if (vVar2 == null) {
                        }
                        int i52 = vVar2.alpha;
                        Object obj32 = objArr[i52];
                        objArr[i52] = vVar2.bravo;
                        if (obj32 == tVar) {
                        }
                        if (bArr[i52] != b2) {
                        }
                        if (length == 0) {
                        }
                    }
                }
            }
        } else {
            ResultKt.alpha(obj);
            vf.ab abVar = (vf.ab) this.white;
            length = this.yellow.length;
            if (length == 0) {
                return Unit.INSTANCE;
            }
            objArr = new Object[length];
            ArraysKt.coral(0, length, tVar, objArr);
            xf.e bravo = AbstractC3017k3.bravo(length, 6, null);
            AtomicInteger atomicInteger = new AtomicInteger(length);
            for (int i10 = 0; i10 < length; i10++) {
                vf.ad.zulu(abVar, null, null, new s(this.yellow, i10, atomicInteger, bravo, null), 3);
            }
            bArr = new byte[length];
            b2 = 0;
            iVar = bravo;
        }
        b2 = (byte) (b2 + 1);
        this.white = objArr;
        this.alpha = iVar;
        this.purple = bArr;
        this.red = length;
        this.silver = b2;
        this.teal = 1;
        obj2 = iVar.november(this);
    }
}
