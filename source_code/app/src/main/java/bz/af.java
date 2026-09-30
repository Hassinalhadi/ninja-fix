package bz;

import F.AbstractC0141o0;
import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import Yb.C0312j0;
import a0.C0366t;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import androidx.lifecycle.au;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.BaseViewModel;
import com.app.network.network.models.AddressNoteListItem;
import com.app.network.network.models.Allocation;
import com.app.network.network.models.Country;
import com.app.network.network.models.Currency;
import com.app.network.network.models.Image;
import com.app.network.network.models.Order;
import com.app.network.network.models.Platform;
import com.checkout.address.AddressComponent;
import com.checkout.components.card.CardComponent;
import com.checkout.components.card.model.InfoBottomSheetViewStyleState;
import com.checkout.components.card.ui.component.cardnumber.InfoBottomSheetViewKt;
import com.checkout.components.kmp.rememberme.view.otp.OTPViewKt;
import com.checkout.components.kmp.rememberme.view.otp.OTPViewModel;
import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.wallet.WalletComponent;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.CTLocalInApp;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.network.api.CtApi;
import d.C1526d0;
import d.C1530f0;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.AccountQrCodeActivity;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import delivery.samurai.android.ui.reposition.presentation.RepositionViewModel;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingListingActivityV2;
import g.AbstractC1719b;
import g0.C1726f;
import ga.AbstractC1760c;
import j.C1918a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k4.C2007a;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import na.C2166a;
import ob.C2211d;
import org.json.JSONObject;
import pa.AbstractC2297c;
import r3.C2492a;
import s6.AbstractC2772t0;
import s6.AbstractC2817y0;
import sc.C2847b;
import sc.EnumC2848c;
import t6.Q2;
import tc.AbstractC3112q;
import tc.C3098c;
import tc.C3099d;
import tc.C3100e;
import tc.C3105j;
import tc.C3107l;
import tc.C3108m;
import tc.C3109n;
import tc.C3110o;
import tc.C3111p;
import vf.InterfaceC3210n;
import y.C3344D;
import yf.N;

/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ af(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r4 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014c, code lost:
    
        if (r8 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0168, code lost:
    
        if (r8 == null) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Type inference failed for: r1v86, types: [androidx.compose.runtime.q, androidx.compose.runtime.m] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r2v116, types: [vf.I] */
    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v124, types: [vf.I] */
    /* JADX WARN: Type inference failed for: r2v125 */
    /* JADX WARN: Type inference failed for: r2v126 */
    @Override // Xd.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean OTPView$lambda$7$lambda$6;
        Unit updateActionButtonArray$lambda$13;
        boolean checkLimitsBeforeShowing$lambda$10$lambda$9;
        String str;
        boolean z2;
        boolean z10;
        int i4;
        Unit provideView$lambda$18$lambda$17;
        boolean z11;
        boolean z12;
        Float f5;
        String str2;
        String str3;
        String str4;
        Platform platform;
        Platform platform2;
        Image image;
        Platform platform3;
        Country country;
        Currency currency;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r26;
        boolean z16;
        boolean z17;
        String str5 = null;
        Object obj3 = C0580l.alpha;
        final int i5 = 2;
        final int i10 = 1;
        Object obj4 = this.purple;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                ((aj) obj4).alpha((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                cc.g.hotel((AddressNoteListItem) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 2:
                return InfoBottomSheetViewKt.echo((InfoBottomSheetViewStyleState) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 3:
                OTPView$lambda$7$lambda$6 = OTPViewKt.OTPView$lambda$7$lambda$6((OTPViewModel) obj4, ((Integer) obj).intValue(), (String) obj2);
                return Boolean.valueOf(OTPView$lambda$7$lambda$6);
            case 4:
                updateActionButtonArray$lambda$13 = CTLocalInApp.Builder.Builder6.updateActionButtonArray$lambda$13((CTLocalInApp.Builder.Builder6) obj4, (String) obj, (String) obj2);
                return updateActionButtonArray$lambda$13;
            case 5:
                checkLimitsBeforeShowing$lambda$10$lambda$9 = InAppController.checkLimitsBeforeShowing$lambda$10$lambda$9((InAppController) obj4, (JSONObject) obj, (String) obj2);
                return Boolean.valueOf(checkLimitsBeforeShowing$lambda$10$lambda$9);
            case 6:
                C1530f0 c1530f0 = (C1530f0) obj4;
                vf.ad.zulu(c1530f0.getCoroutineScope(), null, null, new C1526d0(c1530f0, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 7:
                return AddressComponent.alpha((AddressComponent) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 8:
                String key = (String) obj;
                List values = (List) obj2;
                Intrinsics.echo(key, "key");
                Intrinsics.echo(values, "values");
                List list = sd.q.alpha;
                if (Intrinsics.areEqual("Content-Length", key)) {
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(CtApi.HEADER_CONTENT_TYPE, key)) {
                    return Unit.INSTANCE;
                }
                gd.h hVar = (gd.h) obj4;
                if (fd.k.alpha.contains(key)) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        hVar.invoke(key, (String) it.next());
                    }
                } else {
                    if (Intrinsics.areEqual("Cookie", key)) {
                        str = "; ";
                    } else {
                        str = Constants.SEPARATOR_COMMA;
                    }
                    hVar.invoke(key, CollectionsKt.maroon(values, str, null, null, null, 62));
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                int i11 = AccountQrCodeActivity.f12107I;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    AccountQrCodeActivity accountQrCodeActivity = (AccountQrCodeActivity) obj4;
                    Bitmap bitmap = (Bitmap) ((t0) accountQrCodeActivity.f12108H).getValue();
                    boolean india = c0585q.india(accountQrCodeActivity);
                    Object jade = c0585q.jade();
                    if (india || jade == obj3) {
                        jade = new C0312j0(25, accountQrCodeActivity);
                        c0585q.f(jade);
                    }
                    AbstractC1760c.alpha(bitmap, (Function0) jade, c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 10:
                return ImageStyleToComposableImageMapper.alpha((ImageStyle) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 11:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    AbstractC0141o0.bravo((C1726f) obj4, null, androidx.compose.foundation.layout.V.kilo(T.p.alpha, C2211d.november), C0366t.echo, c0585q2, 3504, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 12:
                Q0.d dVar = (Q0.d) obj;
                Q0.a aVar = (Q0.a) obj2;
                if (Q0.a.hotel(aVar.alpha) == Integer.MAX_VALUE) {
                    AbstractC1719b.alpha("LazyVerticalGrid's width should be bound by parent.");
                }
                int hotel = Q0.a.hotel(aVar.alpha);
                InterfaceC0539e interfaceC0539e = (InterfaceC0539e) obj4;
                int ochre = hotel - dVar.ochre(interfaceC0539e.alpha());
                int i12 = ochre / 2;
                int i13 = ochre % 2;
                ArrayList arrayList = new ArrayList(2);
                for (int i14 = 0; i14 < 2; i14++) {
                    if (i14 < i13) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    arrayList.add(Integer.valueOf(i4 + i12));
                }
                int[] y10 = CollectionsKt.y(arrayList);
                int[] iArr = new int[y10.length];
                interfaceC0539e.charlie(dVar, hotel, y10, Q0.n.alpha, iArr);
                return new j.o(y10, iArr);
            case 13:
                provideView$lambda$18$lambda$17 = CardComponent.provideView$lambda$18$lambda$17((CardComponent) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return provideView$lambda$18$lambda$17;
            case 14:
                return WalletComponent.charlie((WalletComponent) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 15:
                ((Integer) obj2).getClass();
                n.at.kilo((C3344D) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 16:
                ((n.K) obj4).echo(((Z.b) obj2).alpha);
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ((n.h0) obj4).alpha((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 18:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ?? r12 = (C0585q) interfaceC0581m3;
                if (r12.magenta(intValue3 & 1, z11)) {
                    final na.c cVar = (na.c) obj4;
                    Allocation allocation = (Allocation) ((t0) cVar.azure().hotel).getValue();
                    if (allocation != null) {
                        r12.purple(1259487238);
                        Integer tripCount = allocation.getTripCount();
                        Order order = allocation.getOrder();
                        if (order != null) {
                            f5 = order.getEarnings();
                        } else {
                            f5 = null;
                        }
                        Order order2 = allocation.getOrder();
                        if (order2 != null && (platform3 = order2.getPlatform()) != null && (country = platform3.getCountry()) != null && (currency = country.getCurrency()) != null) {
                            str2 = currency.getSymbol();
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        Double pickupDistanceInKm = allocation.getPickupDistanceInKm();
                        Double deliveryDistanceInKm = allocation.getDeliveryDistanceInKm();
                        Order order3 = allocation.getOrder();
                        if (order3 != null && (platform2 = order3.getPlatform()) != null && (image = platform2.getImage()) != null) {
                            str3 = image.getUrl();
                        } else {
                            str3 = null;
                        }
                        String string = cVar.getString(R.string.new_delivery_order);
                        Intrinsics.delta(string, "getString(...)");
                        Order order4 = allocation.getOrder();
                        if (order4 != null && (platform = order4.getPlatform()) != null) {
                            str4 = platform.getLocalizedName();
                        } else {
                            str4 = null;
                        }
                        String string2 = cVar.getString(R.string.order_from_s, str4);
                        Intrinsics.delta(string2, "getString(...)");
                        String string3 = cVar.getString(R.string.total_of_order);
                        Intrinsics.delta(string3, "getString(...)");
                        String string4 = cVar.getString(R.string.pickup_distance);
                        Intrinsics.delta(string4, "getString(...)");
                        String string5 = cVar.getString(R.string.delivery_distance);
                        Intrinsics.delta(string5, "getString(...)");
                        boolean india2 = r12.india(cVar);
                        Object jade2 = r12.jade();
                        if (india2 || jade2 == obj3) {
                            jade2 = new C2166a(cVar, 1);
                            r12.f(jade2);
                        }
                        Function1 function1 = (Function1) jade2;
                        String string6 = cVar.getString(R.string.estimated_earnings_1);
                        Intrinsics.delta(string6, "getString(...)");
                        if (f5 != null) {
                            str5 = str2.concat(Q2.bravo(f5.floatValue()));
                        }
                        String str6 = str5;
                        String string7 = cVar.getString(R.string.accept);
                        Intrinsics.delta(string7, "getString(...)");
                        String string8 = cVar.getString(R.string.decline);
                        Intrinsics.delta(string8, "getString(...)");
                        boolean india3 = r12.india(cVar);
                        Object jade3 = r12.jade();
                        if (india3 || jade3 == obj3) {
                            final int i15 = 0;
                            jade3 = new Function0() { // from class: na.b
                                /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Integer id2;
                                    Integer id3;
                                    switch (i15) {
                                        case 0:
                                            c cVar2 = cVar;
                                            Allocation allocation2 = (Allocation) ((t0) cVar2.azure().hotel).getValue();
                                            if (allocation2 != null && (id2 = allocation2.getId()) != null) {
                                                int intValue4 = id2.intValue();
                                                OrdersViewModel azure = cVar2.azure();
                                                ?? auVar = new au(new C2492a(2, "loading"));
                                                BaseViewModel.launchApi$default(azure, null, new h(azure, intValue4, auVar, null), 1, null);
                                                auVar.observe(cVar2.getViewLifecycleOwner(), new Dc.t(18, new C2166a(cVar2, 2)));
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            c cVar3 = cVar;
                                            Allocation allocation3 = (Allocation) ((t0) cVar3.azure().hotel).getValue();
                                            if (allocation3 != null && (id3 = allocation3.getId()) != null) {
                                                int intValue5 = id3.intValue();
                                                OrdersViewModel azure2 = cVar3.azure();
                                                ?? auVar2 = new au(new C2492a(2, "loading"));
                                                BaseViewModel.launchApi$default(azure2, null, new s(azure2, intValue5, auVar2, null), 1, null);
                                                auVar2.observe(cVar3.getViewLifecycleOwner(), new Dc.t(18, new C2166a(cVar3, 3)));
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            r12.f(jade3);
                        }
                        Function0 function0 = (Function0) jade3;
                        boolean india4 = r12.india(cVar);
                        Object jade4 = r12.jade();
                        if (india4 || jade4 == obj3) {
                            jade4 = new Function0() { // from class: na.b
                                /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Integer id2;
                                    Integer id3;
                                    switch (i10) {
                                        case 0:
                                            c cVar2 = cVar;
                                            Allocation allocation2 = (Allocation) ((t0) cVar2.azure().hotel).getValue();
                                            if (allocation2 != null && (id2 = allocation2.getId()) != null) {
                                                int intValue4 = id2.intValue();
                                                OrdersViewModel azure = cVar2.azure();
                                                ?? auVar = new au(new C2492a(2, "loading"));
                                                BaseViewModel.launchApi$default(azure, null, new h(azure, intValue4, auVar, null), 1, null);
                                                auVar.observe(cVar2.getViewLifecycleOwner(), new Dc.t(18, new C2166a(cVar2, 2)));
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            c cVar3 = cVar;
                                            Allocation allocation3 = (Allocation) ((t0) cVar3.azure().hotel).getValue();
                                            if (allocation3 != null && (id3 = allocation3.getId()) != null) {
                                                int intValue5 = id3.intValue();
                                                OrdersViewModel azure2 = cVar3.azure();
                                                ?? auVar2 = new au(new C2492a(2, "loading"));
                                                BaseViewModel.launchApi$default(azure2, null, new s(azure2, intValue5, auVar2, null), 1, null);
                                                auVar2.observe(cVar3.getViewLifecycleOwner(), new Dc.t(18, new C2166a(cVar3, 3)));
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            r12.f(jade4);
                        }
                        AbstractC2772t0.alpha(str3, string, string2, tripCount, pickupDistanceInKm, deliveryDistanceInKm, string3, string4, string5, function1, string6, str6, string7, string8, function0, (Function0) jade4, r12, 0);
                        z12 = false;
                    } else {
                        z12 = false;
                        r12.purple(1255634403);
                    }
                    r12.quebec(z12);
                } else {
                    r12.ochre();
                }
                return Unit.INSTANCE;
            case 19:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i16 = AreaListingActivityV2.f12135U;
                if ((intValue4 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m4;
                if (c0585q3.magenta(intValue4 & 1, z13)) {
                    AreaListingActivityV2 areaListingActivityV2 = (AreaListingActivityV2) obj4;
                    androidx.compose.runtime.ax axVar = areaListingActivityV2.f12144P;
                    if (((Boolean) ((t0) areaListingActivityV2.Q).getValue()).booleanValue()) {
                        c0585q3.purple(-1690976946);
                        t0 t0Var = (t0) axVar;
                        String str7 = (String) t0Var.getValue();
                        boolean golf = c0585q3.golf(t0Var) | c0585q3.india(areaListingActivityV2);
                        Object jade5 = c0585q3.jade();
                        if (golf || jade5 == obj3) {
                            jade5 = new C2007a(5, areaListingActivityV2, t0Var);
                            c0585q3.f(jade5);
                        }
                        Function1 function12 = (Function1) jade5;
                        String string9 = areaListingActivityV2.getString(R.string.search_for_area);
                        Intrinsics.delta(string9, "getString(...)");
                        boolean india5 = c0585q3.india(areaListingActivityV2) | c0585q3.golf(t0Var);
                        Object jade6 = c0585q3.jade();
                        if (india5 || jade6 == obj3) {
                            jade6 = new Yb.F(27, areaListingActivityV2, t0Var);
                            c0585q3.f(jade6);
                        }
                        AbstractC2297c.delta(str7, function12, null, string9, (Function0) jade6, c0585q3, 0, 4);
                        z14 = false;
                    } else {
                        z14 = false;
                        c0585q3.purple(-1693923620);
                    }
                    c0585q3.quebec(z14);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 20:
                String key2 = (String) obj;
                List values2 = (List) obj2;
                Intrinsics.echo(key2, "key");
                Intrinsics.echo(values2, "values");
                ((sd.aa) obj4).india.indigo(key2, values2);
                return Unit.INSTANCE;
            case 21:
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((3 & intValue5) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m5;
                if (c0585q4.magenta(intValue5 & 1, z15)) {
                    final C3105j c3105j = (C3105j) obj4;
                    AbstractC3112q abstractC3112q = (AbstractC3112q) C0564b.mike(c3105j.azure().charlie, c0585q4, 0).getValue();
                    if (abstractC3112q instanceof C3111p) {
                        c0585q4.purple(1386142681);
                        c0585q4.quebec(false);
                    } else if (abstractC3112q instanceof C3110o) {
                        c0585q4.purple(1386331657);
                        final C2847b c2847b = ((C3110o) abstractC3112q).alpha;
                        String str8 = c2847b.hotel;
                        if (str8 != null) {
                            if (StringsKt.gray(str8)) {
                                str8 = null;
                                break;
                            }
                        }
                        str8 = c3105j.getString(R.string.reposition_request_title);
                        Intrinsics.delta(str8, "getString(...)");
                        String str9 = str8;
                        String str10 = c2847b.india;
                        if (str10 != null) {
                            if (StringsKt.gray(str10)) {
                                str10 = null;
                                break;
                            }
                        }
                        str10 = c3105j.getString(R.string.reposition_request_subtitle);
                        Intrinsics.delta(str10, "getString(...)");
                        String str11 = str10;
                        String string10 = c3105j.getString(R.string.reposition_earnings_label);
                        Intrinsics.delta(string10, "getString(...)");
                        Double d4 = c2847b.echo;
                        if (d4 != null) {
                            r26 = 0;
                            str5 = String.format(Locale.getDefault(), "﷼ %.2f", Arrays.copyOf(new Object[]{Double.valueOf(d4.doubleValue())}, 1));
                        } else {
                            r26 = 0;
                        }
                        String str12 = str5;
                        String string11 = c3105j.getString(R.string.reposition_distance_label);
                        Intrinsics.delta(string11, "getString(...)");
                        Locale locale = Locale.getDefault();
                        Double valueOf = Double.valueOf(c2847b.golf);
                        String string12 = c3105j.getString(R.string.km_unit);
                        Object[] objArr = new Object[2];
                        objArr[r26] = valueOf;
                        objArr[1] = string12;
                        String format = String.format(locale, "%.1f%s", Arrays.copyOf(objArr, 2));
                        String string13 = c3105j.getString(R.string.accept);
                        Intrinsics.delta(string13, "getString(...)");
                        String string14 = c3105j.getString(R.string.decline);
                        Intrinsics.delta(string14, "getString(...)");
                        if (c2847b.bravo == EnumC2848c.purple) {
                            z16 = true;
                        } else {
                            z16 = r26;
                        }
                        boolean india6 = c0585q4.india(c3105j) | c0585q4.golf(c2847b);
                        Object jade7 = c0585q4.jade();
                        if (india6 || jade7 == obj3) {
                            final int i17 = r26;
                            jade7 = new Function0() { // from class: tc.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            RepositionViewModel azure = c3105j.azure();
                                            C2847b c2847b2 = c2847b;
                                            N n5 = azure.bravo;
                                            AbstractC3112q abstractC3112q2 = (AbstractC3112q) n5.getValue();
                                            n5.juliet(null, C3111p.alpha);
                                            BaseViewModel.launchApi$default(azure, null, new C3113r(azure, c2847b2.alpha, abstractC3112q2, null), 1, null);
                                            return Unit.INSTANCE;
                                        default:
                                            RepositionViewModel azure2 = c3105j.azure();
                                            C2847b c2847b3 = c2847b;
                                            N n10 = azure2.bravo;
                                            AbstractC3112q abstractC3112q3 = (AbstractC3112q) n10.getValue();
                                            n10.juliet(null, C3111p.alpha);
                                            BaseViewModel.launchApi$default(azure2, null, new C3115t(azure2, c2847b3.alpha, abstractC3112q3, null), 1, null);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            c0585q4.f(jade7);
                        }
                        Function0 function02 = (Function0) jade7;
                        boolean india7 = c0585q4.india(c3105j) | c0585q4.golf(c2847b);
                        Object jade8 = c0585q4.jade();
                        if (india7 || jade8 == obj3) {
                            jade8 = new Function0() { // from class: tc.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i10) {
                                        case 0:
                                            RepositionViewModel azure = c3105j.azure();
                                            C2847b c2847b2 = c2847b;
                                            N n5 = azure.bravo;
                                            AbstractC3112q abstractC3112q2 = (AbstractC3112q) n5.getValue();
                                            n5.juliet(null, C3111p.alpha);
                                            BaseViewModel.launchApi$default(azure, null, new C3113r(azure, c2847b2.alpha, abstractC3112q2, null), 1, null);
                                            return Unit.INSTANCE;
                                        default:
                                            RepositionViewModel azure2 = c3105j.azure();
                                            C2847b c2847b3 = c2847b;
                                            N n10 = azure2.bravo;
                                            AbstractC3112q abstractC3112q3 = (AbstractC3112q) n10.getValue();
                                            n10.juliet(null, C3111p.alpha);
                                            BaseViewModel.launchApi$default(azure2, null, new C3115t(azure2, c2847b3.alpha, abstractC3112q3, null), 1, null);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            c0585q4.f(jade8);
                        }
                        AbstractC2817y0.alpha(str9, str11, string10, str12, string11, format, string13, string14, function02, (Function0) jade8, z16, c0585q4, 0);
                        c0585q4.quebec(false);
                    } else if (abstractC3112q instanceof C3107l) {
                        c0585q4.purple(1387880634);
                        Unit unit = Unit.INSTANCE;
                        boolean india8 = c0585q4.india(c3105j) | c0585q4.golf(abstractC3112q);
                        Object jade9 = c0585q4.jade();
                        if (india8 || jade9 == obj3) {
                            jade9 = new C3098c(c3105j, (C3107l) abstractC3112q, null);
                            c0585q4.f(jade9);
                        }
                        C0564b.foxtrot((Xd.l) jade9, c0585q4, unit);
                        c0585q4.quebec(false);
                    } else if (abstractC3112q instanceof C3108m) {
                        c0585q4.purple(1388151109);
                        Unit unit2 = Unit.INSTANCE;
                        boolean india9 = c0585q4.india(c3105j);
                        Object jade10 = c0585q4.jade();
                        if (india9 || jade10 == obj3) {
                            jade10 = new C3099d(c3105j, null);
                            c0585q4.f(jade10);
                        }
                        C0564b.foxtrot((Xd.l) jade10, c0585q4, unit2);
                        c0585q4.quebec(false);
                    } else if (abstractC3112q instanceof C3109n) {
                        c0585q4.purple(1388347773);
                        String str13 = ((C3109n) abstractC3112q).alpha;
                        boolean india10 = c0585q4.india(c3105j) | c0585q4.golf(abstractC3112q);
                        Object jade11 = c0585q4.jade();
                        if (india10 || jade11 == obj3) {
                            jade11 = new C3100e(c3105j, (C3109n) abstractC3112q, null);
                            c0585q4.f(jade11);
                        }
                        C0564b.foxtrot((Xd.l) jade11, c0585q4, str13);
                        c0585q4.quebec(false);
                    } else {
                        throw ao.ad.black(c0585q4, 1153092322, false);
                    }
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 22:
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int i18 = ShiftBookingListingActivityV2.f12464X;
                if ((intValue6 & 3) != 2) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m6;
                if (c0585q5.magenta(intValue6 & 1, z17)) {
                    final ShiftBookingListingActivityV2 shiftBookingListingActivityV2 = (ShiftBookingListingActivityV2) obj4;
                    Ac.r rVar = (Ac.r) ((t0) shiftBookingListingActivityV2.f12471N).getValue();
                    List list2 = (List) ((t0) shiftBookingListingActivityV2.f12472O).getValue();
                    boolean india11 = c0585q5.india(shiftBookingListingActivityV2);
                    Object jade12 = c0585q5.jade();
                    if (india11 || jade12 == obj3) {
                        jade12 = new Function1(shiftBookingListingActivityV2, i5) { // from class: zc.j
                            public final int alpha;
                            public final ShiftBookingListingActivityV2 purple;

                            static {
                                AlwaysMougraohSmootihbngmode.registerNativesForClass(144, j.class);
                                Hidden0.special_clinit_144_00(j.class);
                            }

                            {
                                this.alpha = i5;
                                this.purple = shiftBookingListingActivityV2;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final native Object invoke(Object obj5);
                        };
                        c0585q5.f(jade12);
                    }
                    Ac.q.bravo(rVar, list2, (Function1) jade12, c0585q5, 0);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 23:
                String name = (String) obj;
                List values3 = (List) obj2;
                Intrinsics.echo(name, "name");
                Intrinsics.echo(values3, "values");
                ((G3.a) obj4).indigo(name, values3);
                return Unit.INSTANCE;
            default:
                int intValue7 = ((Integer) obj).intValue();
                Nd.f fVar = (Nd.f) obj2;
                Nd.g key3 = fVar.getKey();
                Nd.f fVar2 = ((zf.y) obj4).purple.get(key3);
                if (key3 != vf.H.alpha) {
                    if (fVar != fVar2) {
                        intValue7 = RecyclerView.UNDEFINED_DURATION;
                    }
                    intValue7++;
                } else {
                    vf.I i19 = (vf.I) fVar2;
                    ?? r22 = (vf.I) fVar;
                    while (r22 != 0) {
                        if (r22 == i19 || !(r22 instanceof Af.q)) {
                            str5 = r22;
                            if (str5 == i19) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + ((Object) str5) + ", expected child of " + i19 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        } else {
                            InterfaceC3210n interfaceC3210n = (InterfaceC3210n) vf.P.purple.get((Af.q) r22);
                            if (interfaceC3210n != null) {
                                r22 = interfaceC3210n.getParent();
                            } else {
                                r22 = 0;
                            }
                        }
                    }
                    if (str5 == i19) {
                    }
                }
                return Integer.valueOf(intValue7);
        }
    }

    public /* synthetic */ af(C1918a c1918a, InterfaceC0539e interfaceC0539e) {
        this.alpha = 12;
        this.purple = interfaceC0539e;
    }

    public /* synthetic */ af(Object obj, int i4, int i5) {
        this.alpha = i5;
        this.purple = obj;
    }
}
