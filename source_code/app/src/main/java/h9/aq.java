package h9;

import android.content.ClipData;
import android.content.ClipDescription;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.widget.C0492z;
import androidx.camera.core.D;
import androidx.lifecycle.T;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ApmErrorHandler;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.wallet.GooglePayMediator;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.incognia.internal.Czx;
import com.incognia.internal.J0;
import com.incognia.internal.cQM;
import com.incognia.internal.e7L;
import com.incognia.internal.hIA;
import com.incognia.internal.ipc;
import com.incognia.internal.k8E;
import com.incognia.internal.y6;
import com.incognia.internal.yC1;
import delivery.samurai.android.ui.agreement.AgreementFragment;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import delivery.samurai.android.ui.assets.AssetsListActivity;
import delivery.samurai.android.ui.points.presentation.PointsFragment;
import delivery.samurai.android.ui.points.presentation.PointsViewModel;
import delivery.samurai.android.ui.redeem.presentation.RedeemFragment;
import delivery.samurai.android.ui.scanner.ScannerActivity;
import delivery.samurai.android.ui.score.ScoreFragment;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingListingActivityV2;
import java.util.List;
import k4.C2007a;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.Y;
import s1.C2571d;
import s1.C2576i;
import s1.InterfaceC2570c;
import vc.C3187b;
import wc.C3256b;
import wc.C3257c;

/* loaded from: classes2.dex */
public final /* synthetic */ class aq implements e7L, OnSuccessListener, OnFailureListener, Czx, v2.j, G6.e, androidx.camera.core.y, ApmErrorHandler {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ aq(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // androidx.camera.core.y
    public void alpha(D d4) {
        C3257c c3257c = (C3257c) this.purple;
        if (c3257c.echo.get()) {
            d4.close();
            return;
        }
        Image k6 = d4.purple.k();
        if (k6 == null) {
            d4.close();
            return;
        }
        try {
            X8.a charlie = X8.a.charlie(k6, d4.teal.bravo(), null);
            Intrinsics.checkNotNull(charlie);
            try {
                Task process = c3257c.golf.process(charlie);
                aq aqVar = new aq(15, new C3256b(c3257c, 0));
                G6.q qVar = (G6.q) process;
                qVar.getClass();
                qVar.echo(G6.i.alpha, aqVar);
                qVar.bravo(new C3187b(d4, 1));
                Intrinsics.checkNotNull(qVar);
            } catch (Throwable unused) {
                d4.close();
            }
        } catch (Throwable unused2) {
            d4.close();
        }
    }

    @Override // com.incognia.internal.e7L
    public void b(cQM cqm) {
        ipc.b((J0) this.purple, cqm);
    }

    public boolean bravo(C2576i c2576i, int i4, Bundle bundle) {
        InterfaceC2570c interfaceC2570c;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 25 && (i4 & 1) != 0) {
            try {
                ((u1.g) c2576i.alpha).foxtrot();
                Parcelable parcelable = (Parcelable) ((u1.g) c2576i.alpha).oscar();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipDescription alpha = ((u1.g) c2576i.alpha).alpha();
        u1.g gVar = (u1.g) c2576i.alpha;
        ClipData clipData = new ClipData(alpha, new ClipData.Item(gVar.delta()));
        if (i5 >= 31) {
            interfaceC2570c = new com.google.android.material.internal.s(clipData, 2);
        } else {
            C2571d c2571d = new C2571d();
            c2571d.purple = clipData;
            c2571d.red = 2;
            interfaceC2570c = c2571d;
        }
        interfaceC2570c.golf(gVar.juliet());
        interfaceC2570c.charlie(bundle);
        if (s1.au.juliet((C0492z) this.purple, interfaceC2570c.mo202build()) == null) {
            return true;
        }
        return false;
    }

    @Override // G6.e
    public void onComplete(Task task) {
        GooglePayMediator.a((Function1) this.purple, task);
    }

    @Override // com.checkout.components.interfaces.component.ApmErrorHandler
    public void onError(PaymentMethodComponent paymentMethodComponent, CheckoutError checkoutError) {
        InternalCheckoutComponents.golf((ComponentCallback) this.purple, paymentMethodComponent, checkoutError);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        k8E.b((Function1) this.purple, exc);
    }

    @Override // v2.j
    public void onRefresh() {
        Object obj = this.purple;
        switch (this.alpha) {
            case 4:
                AgreementFragment agreementFragment = (AgreementFragment) obj;
                agreementFragment.f12132g = 0;
                agreementFragment.quebec();
                return;
            case 5:
                PointsFragment pointsFragment = (PointsFragment) obj;
                pointsFragment.f12437h = 0;
                pointsFragment.f12438i = false;
                pointsFragment.f12436g.bravo(CollectionsKt.emptyList());
                PointsViewModel quebec = pointsFragment.quebec();
                int i4 = pointsFragment.f12437h;
                V1.a hotel = T.hotel(quebec);
                Cf.e eVar = vf.ao.alpha;
                vf.ad.zulu(hotel, Cf.d.purple, null, new lc.k(quebec, i4, null), 2);
                return;
            case 7:
                RedeemFragment redeemFragment = (RedeemFragment) obj;
                redeemFragment.f12445i = 0;
                redeemFragment.quebec().alpha(redeemFragment.f12445i);
                return;
            case 8:
                AreaListingActivityV2 areaListingActivityV2 = (AreaListingActivityV2) obj;
                areaListingActivityV2.f12139K = 0;
                areaListingActivityV2.gray();
                return;
            case 11:
                AssetsListActivity assetsListActivity = (AssetsListActivity) obj;
                assetsListActivity.f12156J = 0;
                assetsListActivity.gold();
                return;
            case 17:
                ((ScoreFragment) obj).quebec();
                return;
            default:
                int i5 = ShiftBookingListingActivityV2.f12464X;
                ((ShiftBookingListingActivityV2) obj).indigo();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        Object obj2 = this.purple;
        switch (this.alpha) {
            case 1:
                k8E.b((hIA) obj2, obj);
                return;
            case 9:
                ((C2007a) obj2).invoke(obj);
                return;
            case 10:
                ((p3.af) obj2).invoke(obj);
                return;
            case 14:
                int i4 = ScannerActivity.Q;
                ((Y) obj2).invoke(obj);
                return;
            default:
                ((C3256b) obj2).invoke(obj);
                return;
        }
    }

    @Override // com.incognia.internal.Czx
    public void b(boolean z2, List list) {
        yC1.b((y6) this.purple, z2, list);
    }
}
