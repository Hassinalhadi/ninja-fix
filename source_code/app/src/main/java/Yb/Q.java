package Yb;

import android.net.Uri;
import com.app.network.network.models.OrderTask;
import delivery.samurai.android.R;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import wf.C3268e;

/* loaded from: classes2.dex */
public final class Q extends Pd.i implements Xd.l {
    public Ref.ObjectRef alpha;
    public Object purple;
    public int red;
    public final /* synthetic */ S silver;
    public final /* synthetic */ Uri teal;
    public final /* synthetic */ OrderTask white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s3, Uri uri, OrderTask orderTask, Nd.c cVar) {
        super(2, cVar);
        this.silver = s3;
        this.teal = uri;
        this.white = orderTask;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Q(this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(1:2)|(1:(1:(6:(3:(1:(1:9)(2:13|14))(3:15|16|17)|10|11)(7:31|32|33|34|(4:39|(2:41|30)|10|11)|42|43)|20|(1:22)|23|(1:27)|28)(7:46|47|48|49|50|(5:52|34|(5:36|39|(0)|10|11)|42|43)|30))(3:56|57|58))(4:84|85|(1:87)|30)|59|60|(6:65|(3:72|(3:74|50|(0))|30)|75|76|77|78)|79|80) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01aa, code lost:
    
        if (vf.ad.blue(r0, r4, r18) == r2) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0130, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0131, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Object blue;
        Ref.ObjectRef objectRef3;
        Object blue2;
        Ref.ObjectRef objectRef4;
        H9.m mVar;
        Nd.h plus;
        M m4;
        Ref.ObjectRef objectRef5;
        C3268e c3268e;
        N n5;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        S s3 = this.silver;
        J2.c cVar = s3.alpha;
        try {
        } catch (Exception e) {
            e = e;
            objectRef = objectRef2;
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 == 5) {
                                ResultKt.alpha(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            objectRef = this.alpha;
                            try {
                                ResultKt.alpha(obj);
                            } catch (Exception e4) {
                                e = e4;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    mVar = (H9.m) this.purple;
                    objectRef5 = this.alpha;
                    try {
                        ResultKt.alpha(obj);
                        objectRef5.alpha = null;
                    } catch (Exception e5) {
                        e = e5;
                        objectRef = objectRef5;
                    }
                    if (!cVar.victor() && !cVar.uniform()) {
                        Cf.e eVar = vf.ao.alpha;
                        c3268e = Af.n.alpha;
                        n5 = new N(s3, mVar, this.white, null);
                        this.alpha = objectRef5;
                        this.purple = null;
                        this.red = 4;
                        if (vf.ad.blue(c3268e, n5, this) == aVar) {
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                    K7.b.alpha().charlie(e);
                    File file = (File) objectRef.alpha;
                    if (file != null) {
                        file.getAbsolutePath();
                    }
                    if (!cVar.victor() && !cVar.uniform()) {
                        ((C0333u0) cVar.purple).alpha.tango();
                        C0333u0 c0333u0 = (C0333u0) cVar.purple;
                        String string = c0333u0.alpha.getString(R.string.image_process_failed);
                        Intrinsics.delta(string, "getString(...)");
                        L9.d.pink(c0333u0.alpha, string);
                    }
                    vf.U u4 = vf.U.alpha;
                    Cf.e eVar2 = vf.ao.alpha;
                    Nd.h plus2 = u4.plus(Cf.d.purple);
                    O o5 = new O(objectRef, null);
                    this.alpha = null;
                    this.purple = null;
                    this.red = 5;
                } else {
                    objectRef4 = this.alpha;
                    try {
                        ResultKt.alpha(obj);
                        blue2 = obj;
                        mVar = (H9.m) blue2;
                        vf.U u10 = vf.U.alpha;
                        Cf.e eVar3 = vf.ao.alpha;
                        plus = u10.plus(Cf.d.purple);
                        m4 = new M(objectRef4, null);
                        this.alpha = objectRef4;
                        this.purple = mVar;
                        this.red = 3;
                    } catch (Exception e10) {
                        e = e10;
                        objectRef = objectRef4;
                    }
                    if (vf.ad.blue(plus, m4, this) != aVar) {
                        objectRef5 = objectRef4;
                        objectRef5.alpha = null;
                        if (!cVar.victor()) {
                            Cf.e eVar4 = vf.ao.alpha;
                            c3268e = Af.n.alpha;
                            n5 = new N(s3, mVar, this.white, null);
                            this.alpha = objectRef5;
                            this.purple = null;
                            this.red = 4;
                            if (vf.ad.blue(c3268e, n5, this) == aVar) {
                            }
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar;
                }
            } else {
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) this.purple;
                Ref.ObjectRef objectRef7 = this.alpha;
                ResultKt.alpha(obj);
                objectRef3 = objectRef7;
                objectRef2 = objectRef6;
                blue = obj;
            }
        } else {
            ResultKt.alpha(obj);
            objectRef2 = new Ref.ObjectRef();
            Cf.e eVar5 = vf.ao.alpha;
            Cf.d dVar = Cf.d.purple;
            L l10 = new L(s3, this.teal, null);
            this.alpha = objectRef2;
            this.purple = objectRef2;
            this.red = 1;
            blue = vf.ad.blue(dVar, l10, this);
            if (blue != aVar) {
                objectRef3 = objectRef2;
            }
            return aVar;
        }
        objectRef2.alpha = blue;
        if (!cVar.victor() && !cVar.uniform()) {
            File file2 = (File) objectRef3.alpha;
            if (file2 != null && file2.exists() && ((File) objectRef3.alpha).length() != 0) {
                I9.b.echo((File) objectRef3.alpha, "gallery", "invoice");
                File file3 = (File) objectRef3.alpha;
                Intrinsics.echo(file3, "file");
                Cf.e eVar6 = vf.ao.alpha;
                Cf.d dVar2 = Cf.d.purple;
                P p4 = new P(s3, objectRef3, null);
                this.alpha = objectRef3;
                this.purple = null;
                this.red = 2;
                blue2 = vf.ad.blue(dVar2, p4, this);
                if (blue2 != aVar) {
                    objectRef4 = objectRef3;
                    mVar = (H9.m) blue2;
                    vf.U u102 = vf.U.alpha;
                    Cf.e eVar32 = vf.ao.alpha;
                    plus = u102.plus(Cf.d.purple);
                    m4 = new M(objectRef4, null);
                    this.alpha = objectRef4;
                    this.purple = mVar;
                    this.red = 3;
                    if (vf.ad.blue(plus, m4, this) != aVar) {
                    }
                }
                return aVar;
            }
            ((C0333u0) cVar.purple).alpha.tango();
            C0333u0 c0333u02 = (C0333u0) cVar.purple;
            String string2 = c0333u02.alpha.getString(R.string.image_load_failed);
            Intrinsics.delta(string2, "getString(...)");
            L9.d.pink(c0333u02.alpha, string2);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
