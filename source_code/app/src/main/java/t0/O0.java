package t0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class O0 extends Pd.i implements Xd.l {
    public xf.b alpha;
    public int purple;
    public /* synthetic */ Object red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f13804s;
    public final /* synthetic */ ContentResolver silver;
    public final /* synthetic */ Uri teal;
    public final /* synthetic */ com.google.android.gms.internal.measurement.U0 white;
    public final /* synthetic */ xf.e yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(ContentResolver contentResolver, Uri uri, com.google.android.gms.internal.measurement.U0 u02, xf.e eVar, Context context, Nd.c cVar) {
        super(2, cVar);
        this.silver = contentResolver;
        this.teal = uri;
        this.white = u02;
        this.yellow = eVar;
        this.f13804s = context;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        xf.e eVar = this.yellow;
        O0 o02 = new O0(this.silver, this.teal, this.white, eVar, this.f13804s, cVar);
        o02.red = obj;
        return o02;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((O0) create((InterfaceC3440j) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r6.emit(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0044, B:15:0x0055, B:17:0x005d, B:25:0x002c, B:27:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC3440j interfaceC3440j;
        xf.b bVar;
        InterfaceC3440j interfaceC3440j2;
        xf.b bVar2;
        Object charlie;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        com.google.android.gms.internal.measurement.U0 u02 = this.white;
        ContentResolver contentResolver = this.silver;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        bVar2 = this.alpha;
                        interfaceC3440j2 = (InterfaceC3440j) this.red;
                        ResultKt.alpha(obj);
                        interfaceC3440j = interfaceC3440j2;
                        bVar = bVar2;
                        this.red = interfaceC3440j;
                        this.alpha = bVar;
                        this.purple = 1;
                        charlie = bVar.charlie(this);
                        if (charlie == aVar) {
                            xf.b bVar3 = bVar;
                            interfaceC3440j2 = interfaceC3440j;
                            obj = charlie;
                            bVar2 = bVar3;
                            if (!((Boolean) obj).booleanValue()) {
                                bVar2.delta();
                                Float f5 = new Float(Settings.Global.getFloat(this.f13804s.getContentResolver(), "animator_duration_scale", 1.0f));
                                this.red = interfaceC3440j2;
                                this.alpha = bVar2;
                                this.purple = 2;
                            } else {
                                contentResolver.unregisterContentObserver(u02);
                                return Unit.INSTANCE;
                            }
                        } else {
                            return aVar;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    bVar2 = this.alpha;
                    interfaceC3440j2 = (InterfaceC3440j) this.red;
                    ResultKt.alpha(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            } else {
                ResultKt.alpha(obj);
                interfaceC3440j = (InterfaceC3440j) this.red;
                contentResolver.registerContentObserver(this.teal, false, u02);
                bVar = new xf.b(this.yellow);
                this.red = interfaceC3440j;
                this.alpha = bVar;
                this.purple = 1;
                charlie = bVar.charlie(this);
                if (charlie == aVar) {
                }
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(u02);
            throw th;
        }
    }
}
