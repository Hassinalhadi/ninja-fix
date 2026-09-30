package W9;

import delivery.samurai.android.notifications.MyFirebaseMessagingService;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements SingleTransformer {
    @Override // io.reactivex.SingleTransformer
    public final SingleSource apply(Single observable) {
        int i4 = MyFirebaseMessagingService.yellow;
        Intrinsics.echo(observable, "observable");
        return observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
