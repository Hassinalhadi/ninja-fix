package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class B0 extends Pd.i implements Xd.l {
    public bv.am alpha;
    public Function1 purple;
    public xf.i red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function0 f2995s;
    public B2.s silver;
    public Object teal;
    public int white;
    public /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(Function0 function0, Nd.c cVar) {
        super(2, cVar);
        this.f2995s = function0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        B0 b02 = new B0(this.f2995s, cVar);
        b02.yellow = obj;
        return b02;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((B0) create((InterfaceC3440j) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b3 A[LOOP:0: B:17:0x00e3->B:22:0x01b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015a A[EDGE_INSN: B:23:0x015a->B:24:0x015a BREAK  A[LOOP:0: B:17:0x00e3->B:22:0x01b3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015c A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #7 {all -> 0x019d, blocks: (B:66:0x0121, B:20:0x014d, B:25:0x015c, B:31:0x0174, B:33:0x017d, B:71:0x012c, B:85:0x0138), top: B:65:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0198 -> B:9:0x0199). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.B0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
