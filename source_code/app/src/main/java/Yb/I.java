package Yb;

import com.app.network.network.models.OrderTask;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.W4;

/* loaded from: classes2.dex */
public final class I extends Pd.i implements Xd.l {
    public final /* synthetic */ S alpha;
    public final /* synthetic */ H9.m purple;
    public final /* synthetic */ OrderTask red;
    public final /* synthetic */ File silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(S s3, H9.m mVar, OrderTask orderTask, File file, Nd.c cVar) {
        super(2, cVar);
        this.alpha = s3;
        this.purple = mVar;
        this.red = orderTask;
        this.silver = file;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new I(this.alpha, this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        S s3 = this.alpha;
        J2.c cVar = s3.alpha;
        if (!cVar.victor() && !cVar.uniform()) {
            ((C0333u0) cVar.purple).alpha.tango();
            H9.m mVar = this.purple;
            boolean z2 = mVar instanceof H9.l;
            File file = this.silver;
            if (z2) {
                File file2 = s3.charlie;
                if (file2 == null || s3.delta) {
                    file2 = null;
                }
                H9.l lVar = (H9.l) mVar;
                s3.charlie = (File) lVar.alpha;
                androidx.lifecycle.ag foxtrot = androidx.lifecycle.T.foxtrot(((C0333u0) cVar.purple).alpha);
                vf.U u4 = vf.U.alpha;
                Cf.e eVar = vf.ao.alpha;
                vf.ad.zulu(foxtrot, u4.plus(Cf.d.purple), null, new G(file, file2, mVar, null), 2);
                File compressedFile = (File) lVar.alpha;
                OrderTask task = this.red;
                F f5 = new F(0, s3, task);
                Cb.ad adVar = new Cb.ad(24, s3, task);
                B2.q qVar = new B2.q(29, s3);
                Intrinsics.echo(compressedFile, "compressedFile");
                Intrinsics.echo(task, "task");
                ProcessOrderActivityV2 processOrderActivityV2 = (ProcessOrderActivityV2) cVar.red;
                if (!processOrderActivityV2.getSupportFragmentManager().jade() && !processOrderActivityV2.isFinishing() && !processOrderActivityV2.isDestroyed()) {
                    new Wb.y(compressedFile, f5, adVar, qVar, processOrderActivityV2.getString(R.string.invoice_photo)).romeo(processOrderActivityV2.getSupportFragmentManager(), "InvoicePreview");
                }
            } else if (mVar instanceof H9.k) {
                androidx.lifecycle.ag foxtrot2 = androidx.lifecycle.T.foxtrot(((C0333u0) cVar.purple).alpha);
                vf.U u10 = vf.U.alpha;
                Cf.e eVar2 = vf.ao.alpha;
                vf.ad.zulu(foxtrot2, u10.plus(Cf.d.purple), null, new H(file, null), 2);
                C0333u0 c0333u0 = (C0333u0) cVar.purple;
                L9.d.pink(c0333u0.alpha, W4.alpha(c0333u0.alpha, ((H9.k) mVar).alpha));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
