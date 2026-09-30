package Wb;

import android.net.Uri;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import hc.C1844e;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import s6.S6;
import s6.W4;
import vf.U;
import vf.ad;
import vf.ao;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public Ref.ObjectRef alpha;
    public Object purple;
    public Unit red;
    public int silver;
    public final /* synthetic */ AddressNoteActivity teal;
    public final /* synthetic */ Uri white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AddressNoteActivity addressNoteActivity, Uri uri, Nd.c cVar) {
        super(2, cVar);
        this.teal = addressNoteActivity;
        this.white = uri;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x024d, code lost:
    
        if (vf.ad.blue(r12, r2, r11) != r1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x025a, code lost:
    
        if (r3.isDestroyed() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0160, code lost:
    
        r3.lime(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x015e, code lost:
    
        if (r3.isDestroyed() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0150, code lost:
    
        if (vf.ad.blue(r12, r2, r11) != r1) goto L58;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0210: IGET (r12 I:java.lang.Object) = (r6 I:kotlin.jvm.internal.Ref$ObjectRef) A[Catch: all -> 0x003e, TRY_ENTER] (LINE:529) kotlin.jvm.internal.Ref.ObjectRef.alpha java.lang.Object, block:B:106:0x0210 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x026d: INVOKE (r4v3 ?? I:Wb.g), (r6 I:kotlin.jvm.internal.Ref$ObjectRef), (r5 I:Nd.c) DIRECT call: Wb.g.<init>(kotlin.jvm.internal.Ref$ObjectRef, Nd.c):void A[MD:(kotlin.jvm.internal.Ref$ObjectRef, Nd.c):void (m)] (LINE:622), block:B:117:0x0261 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef A[Catch: all -> 0x003e, Exception -> 0x0210, TryCatch #0 {Exception -> 0x0210, blocks: (B:37:0x0039, B:38:0x00e9, B:40:0x00ef, B:43:0x00f7, B:45:0x00fb, B:49:0x0127, B:51:0x012b, B:52:0x0165, B:53:0x016a, B:54:0x016b, B:59:0x0043, B:60:0x00c8, B:78:0x0060, B:79:0x0086, B:81:0x008e, B:84:0x0096, B:86:0x00a0, B:89:0x00b0, B:93:0x01a1, B:97:0x01df, B:102:0x006c), top: B:2:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb A[Catch: all -> 0x003e, Exception -> 0x0210, TryCatch #0 {Exception -> 0x0210, blocks: (B:37:0x0039, B:38:0x00e9, B:40:0x00ef, B:43:0x00f7, B:45:0x00fb, B:49:0x0127, B:51:0x012b, B:52:0x0165, B:53:0x016a, B:54:0x016b, B:59:0x0043, B:60:0x00c8, B:78:0x0060, B:79:0x0086, B:81:0x008e, B:84:0x0096, B:86:0x00a0, B:89:0x00b0, B:93:0x01a1, B:97:0x01df, B:102:0x006c), top: B:2:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127 A[Catch: all -> 0x003e, Exception -> 0x0210, TryCatch #0 {Exception -> 0x0210, blocks: (B:37:0x0039, B:38:0x00e9, B:40:0x00ef, B:43:0x00f7, B:45:0x00fb, B:49:0x0127, B:51:0x012b, B:52:0x0165, B:53:0x016a, B:54:0x016b, B:59:0x0043, B:60:0x00c8, B:78:0x0060, B:79:0x0086, B:81:0x008e, B:84:0x0096, B:86:0x00a0, B:89:0x00b0, B:93:0x01a1, B:97:0x01df, B:102:0x006c), top: B:2:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ce  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? gVar;
        Throwable th;
        ?? r62;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Nd.h plus;
        g gVar2;
        Unit unit;
        Nd.h plus2;
        g gVar3;
        Unit unit2;
        H9.m mVar;
        Nd.h plus3;
        f fVar;
        Nd.h plus4;
        g gVar4;
        Unit unit3;
        Od.a aVar = Od.a.alpha;
        int i4 = this.silver;
        AddressNoteActivity addressNoteActivity = this.teal;
        try {
            try {
            } catch (Exception unused) {
                File file = (File) r62.alpha;
                if (file != null) {
                    file.getAbsolutePath();
                }
                if (!addressNoteActivity.isFinishing() && !addressNoteActivity.isDestroyed()) {
                    String string = addressNoteActivity.getString(R.string.image_process_failed);
                    Intrinsics.delta(string, "getString(...)");
                    L9.d.pink(addressNoteActivity, string);
                }
                U u4 = U.alpha;
                Cf.e eVar = ao.alpha;
                Nd.h plus5 = u4.plus(Cf.d.purple);
                g gVar5 = new g(r62, null);
                this.alpha = null;
                this.purple = null;
                this.silver = 8;
            }
        } catch (Throwable th2) {
            U u10 = U.alpha;
            Cf.e eVar2 = ao.alpha;
            Nd.h plus6 = u10.plus(Cf.d.purple);
            g gVar6 = new g(gVar, null);
            this.alpha = null;
            this.purple = th2;
            this.silver = 9;
            if (ad.blue(plus6, gVar6, this) != aVar) {
                th = th2;
            }
        }
        switch (i4) {
            case 0:
                ResultKt.alpha(obj);
                objectRef = new Ref.ObjectRef();
                Cf.e eVar3 = ao.alpha;
                Cf.d dVar = Cf.d.purple;
                e eVar4 = new e(addressNoteActivity, this.white, null);
                this.alpha = objectRef;
                this.purple = objectRef;
                this.silver = 1;
                obj = ad.blue(dVar, eVar4, this);
                if (obj != aVar) {
                    objectRef2 = objectRef;
                    objectRef2.alpha = obj;
                    if (!addressNoteActivity.isFinishing() && !addressNoteActivity.isDestroyed()) {
                        if (((File) objectRef.alpha).exists() && ((File) objectRef.alpha).length() != 0) {
                            Cf.e eVar5 = ao.alpha;
                            Cf.d dVar2 = Cf.d.purple;
                            h hVar = new h(addressNoteActivity, objectRef, null);
                            this.alpha = objectRef;
                            this.purple = null;
                            this.silver = 4;
                            obj = ad.blue(dVar2, hVar, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                            mVar = (H9.m) obj;
                            U u11 = U.alpha;
                            Cf.e eVar6 = ao.alpha;
                            plus3 = u11.plus(Cf.d.purple);
                            fVar = new f(objectRef, null);
                            this.alpha = objectRef;
                            this.purple = mVar;
                            this.silver = 5;
                            if (ad.blue(plus3, fVar, this) == aVar) {
                                return aVar;
                            }
                            if (!addressNoteActivity.isFinishing() && !addressNoteActivity.isDestroyed()) {
                                if (!(mVar instanceof H9.l)) {
                                    C1844e c1844e = new C1844e();
                                    c1844e.setArguments(S6.charlie(new Pair("IMAGE_PATH", ((File) ((H9.l) mVar).alpha).getAbsolutePath())));
                                    c1844e.romeo(addressNoteActivity.getSupportFragmentManager(), "PhotoEditorDialog");
                                } else if (mVar instanceof H9.k) {
                                    L9.d.pink(addressNoteActivity, W4.alpha(addressNoteActivity, ((H9.k) mVar).alpha));
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                U u12 = U.alpha;
                                Cf.e eVar7 = ao.alpha;
                                Nd.h plus7 = u12.plus(Cf.d.purple);
                                g gVar7 = new g(objectRef, null);
                                this.alpha = null;
                                this.purple = null;
                                this.silver = 7;
                                break;
                            }
                            Unit unit4 = Unit.INSTANCE;
                            U u13 = U.alpha;
                            Cf.e eVar8 = ao.alpha;
                            plus4 = u13.plus(Cf.d.purple);
                            gVar4 = new g(objectRef, null);
                            this.alpha = null;
                            this.purple = null;
                            this.red = unit4;
                            this.silver = 6;
                            if (ad.blue(plus4, gVar4, this) != aVar) {
                                unit3 = unit4;
                                if (!addressNoteActivity.isFinishing() && !addressNoteActivity.isDestroyed()) {
                                    addressNoteActivity.lime(true);
                                }
                                return unit3;
                            }
                            return aVar;
                        }
                        String string2 = addressNoteActivity.getString(R.string.image_load_failed);
                        Intrinsics.delta(string2, "getString(...)");
                        L9.d.pink(addressNoteActivity, string2);
                        addressNoteActivity.lime(true);
                        Unit unit5 = Unit.INSTANCE;
                        U u14 = U.alpha;
                        Cf.e eVar9 = ao.alpha;
                        plus2 = u14.plus(Cf.d.purple);
                        gVar3 = new g(objectRef, null);
                        this.alpha = null;
                        this.purple = unit5;
                        this.silver = 3;
                        if (ad.blue(plus2, gVar3, this) != aVar) {
                            unit2 = unit5;
                            if (!addressNoteActivity.isFinishing() && !addressNoteActivity.isDestroyed()) {
                                addressNoteActivity.lime(true);
                            }
                            return unit2;
                        }
                        return aVar;
                    }
                    Unit unit6 = Unit.INSTANCE;
                    U u15 = U.alpha;
                    Cf.e eVar10 = ao.alpha;
                    plus = u15.plus(Cf.d.purple);
                    gVar2 = new g(objectRef, null);
                    this.alpha = null;
                    this.purple = unit6;
                    this.silver = 2;
                    if (ad.blue(plus, gVar2, this) != aVar) {
                        unit = unit6;
                        if (!addressNoteActivity.isFinishing() && !addressNoteActivity.isDestroyed()) {
                            addressNoteActivity.lime(true);
                        }
                        return unit;
                    }
                    return aVar;
                }
                return aVar;
            case 1:
                objectRef2 = (Ref.ObjectRef) this.purple;
                objectRef = this.alpha;
                ResultKt.alpha(obj);
                objectRef2.alpha = obj;
                if (!addressNoteActivity.isFinishing()) {
                    if (((File) objectRef.alpha).exists()) {
                        Cf.e eVar52 = ao.alpha;
                        Cf.d dVar22 = Cf.d.purple;
                        h hVar2 = new h(addressNoteActivity, objectRef, null);
                        this.alpha = objectRef;
                        this.purple = null;
                        this.silver = 4;
                        obj = ad.blue(dVar22, hVar2, this);
                        if (obj == aVar) {
                        }
                        mVar = (H9.m) obj;
                        U u112 = U.alpha;
                        Cf.e eVar62 = ao.alpha;
                        plus3 = u112.plus(Cf.d.purple);
                        fVar = new f(objectRef, null);
                        this.alpha = objectRef;
                        this.purple = mVar;
                        this.silver = 5;
                        if (ad.blue(plus3, fVar, this) == aVar) {
                        }
                        if (!addressNoteActivity.isFinishing()) {
                            if (!(mVar instanceof H9.l)) {
                            }
                            U u122 = U.alpha;
                            Cf.e eVar72 = ao.alpha;
                            Nd.h plus72 = u122.plus(Cf.d.purple);
                            g gVar72 = new g(objectRef, null);
                            this.alpha = null;
                            this.purple = null;
                            this.silver = 7;
                            break;
                        }
                        Unit unit42 = Unit.INSTANCE;
                        U u132 = U.alpha;
                        Cf.e eVar82 = ao.alpha;
                        plus4 = u132.plus(Cf.d.purple);
                        gVar4 = new g(objectRef, null);
                        this.alpha = null;
                        this.purple = null;
                        this.red = unit42;
                        this.silver = 6;
                        if (ad.blue(plus4, gVar4, this) != aVar) {
                        }
                        return aVar;
                    }
                    String string22 = addressNoteActivity.getString(R.string.image_load_failed);
                    Intrinsics.delta(string22, "getString(...)");
                    L9.d.pink(addressNoteActivity, string22);
                    addressNoteActivity.lime(true);
                    Unit unit52 = Unit.INSTANCE;
                    U u142 = U.alpha;
                    Cf.e eVar92 = ao.alpha;
                    plus2 = u142.plus(Cf.d.purple);
                    gVar3 = new g(objectRef, null);
                    this.alpha = null;
                    this.purple = unit52;
                    this.silver = 3;
                    if (ad.blue(plus2, gVar3, this) != aVar) {
                    }
                    return aVar;
                }
                Unit unit62 = Unit.INSTANCE;
                U u152 = U.alpha;
                Cf.e eVar102 = ao.alpha;
                plus = u152.plus(Cf.d.purple);
                gVar2 = new g(objectRef, null);
                this.alpha = null;
                this.purple = unit62;
                this.silver = 2;
                if (ad.blue(plus, gVar2, this) != aVar) {
                }
                return aVar;
            case 2:
                unit = (Unit) this.purple;
                ResultKt.alpha(obj);
                if (!addressNoteActivity.isFinishing()) {
                    addressNoteActivity.lime(true);
                    break;
                }
                return unit;
            case 3:
                unit2 = (Unit) this.purple;
                ResultKt.alpha(obj);
                if (!addressNoteActivity.isFinishing()) {
                    addressNoteActivity.lime(true);
                    break;
                }
                return unit2;
            case 4:
                objectRef = this.alpha;
                ResultKt.alpha(obj);
                mVar = (H9.m) obj;
                U u1122 = U.alpha;
                Cf.e eVar622 = ao.alpha;
                plus3 = u1122.plus(Cf.d.purple);
                fVar = new f(objectRef, null);
                this.alpha = objectRef;
                this.purple = mVar;
                this.silver = 5;
                if (ad.blue(plus3, fVar, this) == aVar) {
                }
                if (!addressNoteActivity.isFinishing()) {
                }
                Unit unit422 = Unit.INSTANCE;
                U u1322 = U.alpha;
                Cf.e eVar822 = ao.alpha;
                plus4 = u1322.plus(Cf.d.purple);
                gVar4 = new g(objectRef, null);
                this.alpha = null;
                this.purple = null;
                this.red = unit422;
                this.silver = 6;
                if (ad.blue(plus4, gVar4, this) != aVar) {
                }
                return aVar;
            case 5:
                mVar = (H9.m) this.purple;
                objectRef = this.alpha;
                ResultKt.alpha(obj);
                if (!addressNoteActivity.isFinishing()) {
                }
                Unit unit4222 = Unit.INSTANCE;
                U u13222 = U.alpha;
                Cf.e eVar8222 = ao.alpha;
                plus4 = u13222.plus(Cf.d.purple);
                gVar4 = new g(objectRef, null);
                this.alpha = null;
                this.purple = null;
                this.red = unit4222;
                this.silver = 6;
                if (ad.blue(plus4, gVar4, this) != aVar) {
                }
                return aVar;
            case 6:
                unit3 = this.red;
                ResultKt.alpha(obj);
                if (!addressNoteActivity.isFinishing()) {
                    addressNoteActivity.lime(true);
                    break;
                }
                return unit3;
            case 7:
                ResultKt.alpha(obj);
                if (!addressNoteActivity.isFinishing()) {
                    break;
                }
                return Unit.INSTANCE;
            case 8:
                ResultKt.alpha(obj);
                if (!addressNoteActivity.isFinishing()) {
                    break;
                }
                return Unit.INSTANCE;
            case 9:
                th = (Throwable) this.purple;
                ResultKt.alpha(obj);
                if (!addressNoteActivity.isFinishing()) {
                    if (!addressNoteActivity.isDestroyed()) {
                        addressNoteActivity.lime(true);
                        throw th;
                    }
                    throw th;
                }
                throw th;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
