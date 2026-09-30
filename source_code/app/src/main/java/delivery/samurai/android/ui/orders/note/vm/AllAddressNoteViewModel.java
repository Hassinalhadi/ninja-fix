package delivery.samurai.android.ui.orders.note.vm;

import Cf.e;
import E9.b;
import E9.d;
import Vb.a;
import Xb.f;
import Xb.g;
import androidx.lifecycle.T;
import androidx.lifecycle.au;
import androidx.lifecycle.az;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r3.C2492a;
import t3.InterfaceC2957b;
import t3.InterfaceC2958c;
import vf.ad;
import vf.ao;

@HiltViewModel
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldelivery/samurai/android/ui/orders/note/vm/AllAddressNoteViewModel;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/b;", "captainService", "Lt3/c;", "orderService", "LE9/b;", "imagePreparer", "LE9/d;", "imageValidator", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/b;Lt3/c;LE9/b;LE9/d;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AllAddressNoteViewModel extends BaseViewModel {
    public final InterfaceC2957b alpha;
    public final InterfaceC2958c bravo;
    public final b charlie;
    public final d delta;
    public final az echo;
    public final az foxtrot;
    public final az golf;
    public final az hotel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public AllAddressNoteViewModel(@NotNull AndroidApp app, @NotNull InterfaceC2957b captainService, @NotNull InterfaceC2958c orderService, @NotNull b imagePreparer, @NotNull d imageValidator) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(captainService, "captainService");
        Intrinsics.echo(orderService, "orderService");
        Intrinsics.echo(imagePreparer, "imagePreparer");
        Intrinsics.echo(imageValidator, "imageValidator");
        this.alpha = captainService;
        this.bravo = orderService;
        this.charlie = imagePreparer;
        this.delta = imageValidator;
        ?? auVar = new au(new a(null, null));
        this.echo = auVar;
        this.foxtrot = auVar;
        ?? auVar2 = new au();
        this.golf = auVar2;
        this.hotel = auVar2;
    }

    public final void alpha(int i4) {
        this.golf.postValue(new C2492a(2, "loading"));
        V1.a hotel = T.hotel(this);
        e eVar = ao.alpha;
        ad.zulu(hotel, Cf.d.purple, null, new f(this, i4, null), 2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final az bravo(String orderId) {
        Intrinsics.echo(orderId, "orderId");
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(this, null, new g(this, orderId, auVar, null), 1, null);
        return auVar;
    }
}
