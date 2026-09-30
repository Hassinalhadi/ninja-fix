package Yb;

import a2.C0389n;
import af.C0437h;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Handler;
import androidx.compose.runtime.C0565b0;
import androidx.compose.runtime.C0573f0;
import androidx.compose.runtime.C0575g0;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.C0590w;
import androidx.compose.runtime.InterfaceC0563a0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import b.C0707w;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.points.redeem.PointRewardResponse;
import com.checkout.address.AddressComponent;
import com.checkout.address.model.AddressEditState;
import com.checkout.address.model.State;
import com.checkout.address.ui.edit.AddressEditViewModel;
import com.checkout.address.ui.view.AddressButtonViewKt;
import com.checkout.components.card.CardComponent;
import com.checkout.components.card.model.CardComponentConfig;
import com.checkout.components.card.operations.PaymentOperationManager;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.AddressComponentConfig;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.kmp.rememberme.data.remote.HttpClientFactory;
import com.checkout.components.kmp.rememberme.data.remote.NetworkClient;
import com.checkout.components.rememberme.AbstractC0979s0;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.utils.NavControllerWrapper;
import com.checkout.components.ui.country.CountryPickerContentViewKt;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.redeem.presentation.RedeemFragment;
import delivery.samurai.android.ui.redeem.presentation.RedeemViewModel;
import fe.C1715g;
import j.C1923f;
import j.C1924g;
import java.util.Collection;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import nc.C2174g;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import q0.AbstractC2365A;
import s0.AbstractC2557q;
import t6.AbstractC3081x3;
import vf.C3195B;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ F(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3.charlie, ((I0.aa) r4.getValue()).charlie) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021c  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Collection delta;
        int i4;
        C0565b0 c0565b0;
        InterfaceC0563a0 interfaceC0563a0;
        C0565b0 c0565b02;
        InterfaceC0563a0 interfaceC0563a02;
        Unit a6;
        D0.g gVar;
        Unit headers$lambda$2$lambda$1;
        Unit applyAndAckSettings$lambda$7$lambda$6$lambda$5;
        androidx.compose.runtime.tooling.g gVar2 = null;
        Object obj = this.red;
        Object obj2 = this.purple;
        switch (this.alpha) {
            case 0:
                S s3 = (S) obj;
                vf.Y y10 = s3.foxtrot;
                if (y10 != null) {
                    y10.foxtrot(null);
                }
                s3.delta = false;
                s3.alpha();
                J2.c cVar = s3.alpha;
                OrderTask task = (OrderTask) obj2;
                Intrinsics.echo(task, "task");
                ((ProcessOrderActivityV2) cVar.red).maroon(task);
                return Unit.INSTANCE;
            case 1:
                Integer id2 = ((OrderTask) obj2).getId();
                if (id2 != null) {
                    ((androidx.compose.runtime.ax) obj).setValue(Integer.valueOf(id2.intValue()));
                }
                return Unit.INSTANCE;
            case 2:
                ((Z9.d) obj).bravo.bravo.alpha.incrementAndGet();
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            case 3:
                ((C0389n) obj).india((Y1.l) obj2, false);
                return Unit.INSTANCE;
            case 4:
                return AbstractC0979s0.a((NavControllerWrapper) obj, (RememberMeScreen) obj2);
            case 5:
                return new androidx.compose.foundation.lazy.layout.ar((R.g) obj, kotlin.collections.t.alpha, (R.e) obj2);
            case 6:
                bv.am amVar = (bv.am) obj;
                Object[] objArr = amVar.bravo;
                long[] jArr = amVar.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j5 = jArr[i5];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j5) < 128) {
                                    ((C0590w) obj2).amber(objArr[(i5 << 3) + i11]);
                                }
                                j5 >>= 8;
                            }
                            if (i10 != 8) {
                            }
                        }
                        if (i5 != length) {
                            i5++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 7:
                C0585q c0585q = ((androidx.compose.runtime.tooling.c) obj).alpha;
                if (!c0585q.beige) {
                    return CollectionsKt.emptyList();
                }
                C0575g0 c0575g0 = c0585q.charlie;
                C0573f0 delta2 = c0575g0.delta();
                int i12 = 0;
                while (i12 < c0575g0.purple) {
                    try {
                        if (delta2.lima(i12)) {
                            Object november = delta2.november(i12);
                            if (november != obj2) {
                                if (november instanceof C0565b0) {
                                    c0565b02 = (C0565b0) november;
                                } else {
                                    c0565b02 = null;
                                }
                                if (c0565b02 != null) {
                                    interfaceC0563a02 = c0565b02.alpha;
                                } else {
                                    interfaceC0563a02 = null;
                                }
                                if (interfaceC0563a02 == obj2) {
                                }
                            }
                            androidx.compose.runtime.tooling.g gVar3 = new androidx.compose.runtime.tooling.g(i12, null);
                            delta2.charlie();
                            gVar2 = gVar3;
                            if (gVar2 != null) {
                                int i13 = gVar2.alpha;
                                Integer num = gVar2.bravo;
                                if (!c0585q.beige) {
                                    delta = CollectionsKt.emptyList();
                                } else {
                                    try {
                                        delta = AbstractC3081x3.delta(c0575g0.delta(), i13, num);
                                    } finally {
                                    }
                                }
                                return CollectionsKt.a(delta, c0585q.emerald());
                            }
                            return CollectionsKt.emptyList();
                        }
                        int[] iArr = delta2.bravo;
                        int charlie = androidx.compose.runtime.i0.charlie(i12, iArr);
                        int i14 = i12 + 1;
                        if (i14 < delta2.charlie) {
                            i4 = iArr[(i14 * 5) + 4];
                        } else {
                            i4 = delta2.echo;
                        }
                        int i15 = i4 - charlie;
                        for (int i16 = 0; i16 < i15; i16++) {
                            Object hotel = delta2.hotel(i12, i16);
                            if (hotel != obj2) {
                                if (hotel instanceof C0565b0) {
                                    c0565b0 = (C0565b0) hotel;
                                } else {
                                    c0565b0 = null;
                                }
                                if (c0565b0 != null) {
                                    interfaceC0563a0 = c0565b0.alpha;
                                } else {
                                    interfaceC0563a0 = null;
                                }
                                if (interfaceC0563a0 != obj2) {
                                }
                            }
                            gVar2 = new androidx.compose.runtime.tooling.g(i12, Integer.valueOf(i16));
                            if (gVar2 != null) {
                            }
                        }
                        i12 = i14;
                    } finally {
                    }
                }
                if (gVar2 != null) {
                }
            case 8:
                C0707w c0707w = (C0707w) obj;
                s0.an anVar = (s0.an) obj2;
                c0707w.f3321b = c0707w.silver.alpha(anVar.alpha.purple.oscar(), anVar.getLayoutDirection(), anVar);
                return Unit.INSTANCE;
            case 9:
                ((Ref.ObjectRef) obj).alpha = AbstractC2557q.echo((b.ar) obj2, AbstractC2365A.alpha);
                return Unit.INSTANCE;
            case 10:
                ((xf.i) obj).mike(obj2);
                return Unit.INSTANCE;
            case 11:
                return NetworkClient.alpha((HttpClientFactory) obj, (fd.d) obj2);
            case 12:
                return CountryPickerContentViewKt.bravo((Function1) obj, (Country) obj2);
            case 13:
                return AddressComponent.charlie((AddressComponentConfig) obj, (AddressComponent) obj2);
            case 14:
                return AddressEditViewModel.alpha((AddressEditState) obj, (Mapper) obj2);
            case 15:
                return (io.ktor.utils.io.m) io.ktor.utils.io.ak.uniform(C3195B.alpha, (Nd.h) obj, new gd.g((vd.e) obj2, null), 2).purple;
            case 16:
                return AddressButtonViewKt.alpha((C0437h) obj, (Intent) obj2);
            case 17:
                C1923f c1923f = (C1923f) ((androidx.compose.runtime.ad) obj).getValue();
                j.t tVar = (j.t) obj2;
                return new C1924g(tVar, c1923f, new androidx.compose.foundation.lazy.layout.as((C1715g) tVar.delta.foxtrot.getValue(), c1923f));
            case 18:
                return com.checkout.components.address.V.a((Function1) obj, (State) obj2);
            case 19:
                a6 = CardComponent.a((CardComponentConfig) obj, (CardComponent) obj2);
                return a6;
            case 20:
                Regex regex = (Regex) obj;
                regex.getClass();
                String input = (String) obj2;
                Intrinsics.echo(input, "input");
                Matcher matcher = regex.alpha.matcher(input);
                Intrinsics.delta(matcher, "matcher(...)");
                if (!matcher.find(0)) {
                    return null;
                }
                return new kotlin.text.k(matcher, input);
            case 21:
                return PaymentOperationManager.bravo((PaymentOperationManager) obj, (Function0) obj2);
            case 22:
                I0.aa aaVar = (I0.aa) obj;
                androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) obj2;
                if (D0.am.bravo(aaVar.bravo, ((I0.aa) axVar.getValue()).bravo)) {
                    break;
                }
                axVar.setValue(aaVar);
                return Unit.INSTANCE;
            case 23:
                n.h0 h0Var = (n.h0) obj;
                if (h0Var != null) {
                    SnapshotStateList snapshotStateList = h0Var.charlie;
                    if (snapshotStateList.isEmpty()) {
                        gVar = h0Var.bravo;
                    } else {
                        n.H h4 = new n.H(h0Var.bravo);
                        int size = snapshotStateList.size();
                        for (int i17 = 0; i17 < size; i17++) {
                            ((Function1) snapshotStateList.get(i17)).invoke(h4);
                        }
                        gVar = h4.bravo;
                    }
                    h0Var.bravo = gVar;
                    if (gVar != null) {
                        return gVar;
                    }
                }
                return (D0.g) obj2;
            case 24:
                int id3 = ((PointRewardResponse) obj2).getId();
                RedeemViewModel quebec = ((RedeemFragment) obj).quebec();
                V1.a hotel2 = androidx.lifecycle.T.hotel(quebec);
                Cf.e eVar = vf.ao.alpha;
                vf.ad.zulu(hotel2, Cf.d.purple, null, new C2174g(quebec, id3, null), 2);
                return Unit.INSTANCE;
            case 25:
                ((Handler) obj).removeCallbacks((D2.d) obj2);
                return Unit.INSTANCE;
            case 26:
                ((LocationManager) obj).unregisterGnssStatusCallback(h9.z.hotel((o3.d) obj2));
                return Unit.INSTANCE;
            case 27:
                int i18 = AreaListingActivityV2.f12135U;
                ((AreaListingActivityV2) obj).gold((String) ((androidx.compose.runtime.t0) ((androidx.compose.runtime.ax) obj2)).getValue());
                return Unit.INSTANCE;
            case 28:
                headers$lambda$2$lambda$1 = Http2Connection.ReaderRunnable.headers$lambda$2$lambda$1((Http2Connection) obj, (Http2Stream) obj2);
                return headers$lambda$2$lambda$1;
            default:
                applyAndAckSettings$lambda$7$lambda$6$lambda$5 = Http2Connection.ReaderRunnable.applyAndAckSettings$lambda$7$lambda$6$lambda$5((Http2Connection) obj, (Ref.ObjectRef) obj2);
                return applyAndAckSettings$lambda$7$lambda$6$lambda$5;
        }
    }

    public /* synthetic */ F(OrderTask orderTask, androidx.compose.runtime.ax axVar) {
        this.alpha = 1;
        this.purple = orderTask;
        this.red = axVar;
    }
}
