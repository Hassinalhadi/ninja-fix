package ra;

import Pd.i;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.captian.Assets;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.assets.viewmodel.AssetViewModel;
import gc.C1766d;
import io.reactivex.Single;
import k4.C2007a;
import kotlin.ResultKt;
import kotlin.Unit;
import ma.C2109a;
import vf.ab;

/* renamed from: ra.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2511a extends i implements l {
    public final /* synthetic */ AssetViewModel alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2511a(AssetViewModel assetViewModel, int i4, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = assetViewModel;
        this.purple = i4;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C2511a(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2511a) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AssetViewModel assetViewModel = this.alpha;
        Single<DataResponse<Assets>> gray = assetViewModel.alpha.gray(new Integer(this.purple));
        az azVar = this.red;
        gray.subscribe(new C1766d(28, new C2109a(azVar, 12)), new C1766d(29, new C2007a(11, azVar, assetViewModel)));
        return Unit.INSTANCE;
    }
}
