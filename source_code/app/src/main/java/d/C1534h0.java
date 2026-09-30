package d;

import a0.InterfaceC0342ab;
import android.content.Context;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cb.C0841f;
import com.app.network.network.models.agreement.AppAgreement;
import com.app.network.network.models.trophies.Trophy;
import com.checkout.address.model.State;
import com.checkout.address.ui.edit.AddressEditViewModel;
import com.checkout.address.ui.state.StatePickerViewModel;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import com.checkout.components.ui.view.RotateIconViewKt;
import com.checkout.components.wallet.WalletComponent;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.TrophiesCollectionsFragment;
import delivery.samurai.android.ui.about.TrophyMilestonesFragment;
import delivery.samurai.android.ui.agreement.Agreement;
import delivery.samurai.android.ui.agreement.AgreementDetailFragment;
import delivery.samurai.android.ui.agreement.AgreementFragment;
import g.AbstractC1719b;
import i.C1860i;
import i.C1864m;
import i.C1867p;
import i.C1874w;
import i.InterfaceC1869r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kb.C2028d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ld.C2068d;
import ob.C2209b;
import okhttp3.ResponseBody;
import pd.AbstractC2304b;
import qd.AbstractC2463a;
import r3.C2492a;
import y.InterfaceC3372l;

/* renamed from: d.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1534h0 implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ C1534h0(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0374  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i4;
        int collectionSizeOrDefault;
        int i5;
        int i10;
        Integer num;
        C1867p c1867p;
        j.l lVar;
        String valueOf;
        String valueOf2;
        String golf;
        String str;
        float f5 = 0.0f;
        int i11 = 8;
        int i12 = 0;
        C1867p c1867p2 = null;
        kotlin.jvm.internal.aa aaVar = null;
        j.l lVar2 = null;
        Object obj2 = this.purple;
        switch (this.alpha) {
            case 0:
                C1548o0 c1548o0 = (C1548o0) obj2;
                return new Z.b(c1548o0.charlie(c1548o0.kilo, ((Z.b) obj).alpha, c1548o0.juliet));
            case 1:
                return com.checkout.address.ui.navigation.a.a((AddressEditViewModel) obj2, (State) obj);
            case 2:
                if (((Throwable) obj) != null) {
                    ((cd.c) obj2).f3491b.alpha(AbstractC2463a.echo);
                }
                return Unit.INSTANCE;
            case 3:
                ((va.o) obj2).invoke(new g3.q());
                return Unit.INSTANCE;
            case 4:
                ka.c cVar = (ka.c) obj;
                TrophiesCollectionsFragment trophiesCollectionsFragment = (TrophiesCollectionsFragment) obj2;
                if (cVar.alpha) {
                    trophiesCollectionsFragment.kilo().bronze();
                } else {
                    trophiesCollectionsFragment.kilo().tango();
                }
                String str2 = cVar.delta;
                if (str2 != null) {
                    androidx.fragment.app.an requireActivity = trophiesCollectionsFragment.requireActivity();
                    Intrinsics.delta(requireActivity, "requireActivity(...)");
                    L9.d.pink(requireActivity, str2);
                }
                String str3 = cVar.echo;
                if (str3 != null) {
                    androidx.fragment.app.an requireActivity2 = trophiesCollectionsFragment.requireActivity();
                    Intrinsics.delta(requireActivity2, "requireActivity(...)");
                    L9.d.pink(requireActivity2, str3);
                }
                List list = cVar.bravo;
                if (!list.isEmpty()) {
                    ((LinearLayout) trophiesCollectionsFragment.romeo().golf).setVisibility(0);
                }
                List r4 = CollectionsKt.r(list, 3);
                int i13 = 0;
                for (Object obj3 : CollectionsKt.listOf((B9.I) trophiesCollectionsFragment.romeo().foxtrot, (B9.I) trophiesCollectionsFragment.romeo().delta, (B9.I) trophiesCollectionsFragment.romeo().hotel)) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    B9.I i15 = (B9.I) obj3;
                    if (i13 < r4.size()) {
                        i15.alpha.setVisibility(0);
                        Trophy trophy = (Trophy) r4.get(i13);
                        ShapeableImageView shapeableImageView = i15.charlie;
                        ((com.bumptech.glide.j) ((com.bumptech.glide.j) com.bumptech.glide.b.foxtrot(shapeableImageView).quebec(trophy.localizedImage()).bravo()).lima(R.drawable.img_place_holder)).azure(shapeableImageView);
                        i15.bravo.setProgress(Zd.a.charlie(trophy.getCaptainProgress()));
                        i15.delta.setText(trophiesCollectionsFragment.getString(R.string.trophy_progress_label, Integer.valueOf(Zd.a.charlie(trophy.getCaptainProgress()))));
                    } else {
                        i15.alpha.setVisibility(8);
                    }
                    i13 = i14;
                }
                MaterialCardView materialCardView = (MaterialCardView) trophiesCollectionsFragment.romeo().echo;
                List list2 = cVar.charlie;
                if (!list2.isEmpty()) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                materialCardView.setVisibility(i4);
                if (!list2.isEmpty()) {
                    List r5 = CollectionsKt.r(list2, 3);
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(r5, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator it = r5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Trophy) it.next()).localizedImage());
                    }
                    TrophiesCollectionsFragment.quebec((ShapeableImageView) trophiesCollectionsFragment.romeo().india, (String) CollectionsKt.jade(0, arrayList));
                    TrophiesCollectionsFragment.quebec((ShapeableImageView) trophiesCollectionsFragment.romeo().juliet, (String) CollectionsKt.jade(1, arrayList));
                    TrophiesCollectionsFragment.quebec((ShapeableImageView) trophiesCollectionsFragment.romeo().kilo, (String) CollectionsKt.jade(2, arrayList));
                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) trophiesCollectionsFragment.romeo().india;
                    if (CollectionsKt.jade(0, arrayList) != null) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    shapeableImageView2.setVisibility(i5);
                    ShapeableImageView shapeableImageView3 = (ShapeableImageView) trophiesCollectionsFragment.romeo().juliet;
                    if (CollectionsKt.jade(1, arrayList) != null) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    shapeableImageView3.setVisibility(i10);
                    ShapeableImageView shapeableImageView4 = (ShapeableImageView) trophiesCollectionsFragment.romeo().kilo;
                    if (CollectionsKt.jade(2, arrayList) != null) {
                        i11 = 0;
                    }
                    shapeableImageView4.setVisibility(i11);
                }
                return Unit.INSTANCE;
            case 5:
                C2492a c2492a = (C2492a) obj;
                if (c2492a != null) {
                    num = Integer.valueOf(c2492a.alpha);
                } else {
                    num = null;
                }
                TrophyMilestonesFragment trophyMilestonesFragment = (TrophyMilestonesFragment) obj2;
                if (num != null && num.intValue() == 2) {
                    trophyMilestonesFragment.kilo().bronze();
                } else if (num != null && num.intValue() == 1) {
                    Collection collection = (Collection) c2492a.charlie;
                    if (collection != null && !collection.isEmpty()) {
                        B9.G g2 = trophyMilestonesFragment.f12118c;
                        if (g2 != null) {
                            g2.f137j.setVisibility(0);
                            Ca.c cVar2 = trophyMilestonesFragment.e;
                            if (cVar2 != null) {
                                cVar2.bravo((List) c2492a.charlie);
                            } else {
                                Intrinsics.lima("adapter");
                                throw null;
                            }
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    }
                    trophyMilestonesFragment.kilo().tango();
                } else if (num != null && num.intValue() == 0) {
                    trophyMilestonesFragment.kilo().tango();
                    androidx.fragment.app.an requireActivity3 = trophyMilestonesFragment.requireActivity();
                    Intrinsics.delta(requireActivity3, "requireActivity(...)");
                    String str4 = c2492a.bravo;
                    if (str4 == null) {
                        str4 = trophyMilestonesFragment.getString(R.string.error_something_went_wrong);
                        Intrinsics.delta(str4, "getString(...)");
                    }
                    L9.d.pink(requireActivity3, str4);
                } else if (num != null && num.intValue() == 3) {
                    trophyMilestonesFragment.kilo().tango();
                } else {
                    trophyMilestonesFragment.kilo().tango();
                }
                return Unit.INSTANCE;
            case 6:
                ResponseBody responseBody = (ResponseBody) obj2;
                if (responseBody != null) {
                    responseBody.close();
                }
                return Unit.INSTANCE;
            case 7:
                return WalletScreenViewModel.delta((WalletScreenViewModel) obj2, (String) obj);
            case 8:
                hd.o HttpResponseValidator = (hd.o) obj;
                Intrinsics.echo(HttpResponseValidator, "$this$HttpResponseValidator");
                HttpResponseValidator.charlie = ((cd.d) obj2).foxtrot;
                HttpResponseValidator.alpha.add(new Pd.i(2, null));
                return Unit.INSTANCE;
            case 9:
                ((vf.J) obj2).yellow();
                return Unit.INSTANCE;
            case 10:
                Throwable th = (Throwable) obj;
                rg.b bVar = hd.ai.alpha;
                vf.a0 a0Var = (vf.a0) obj2;
                if (th != null) {
                    bVar.hotel("Cancelling request because engine Job failed with error: " + th);
                    a0Var.foxtrot(vf.ad.alpha("Engine failed", th));
                } else {
                    bVar.hotel("Cancelling request because engine Job completed");
                    a0Var.yellow();
                }
                return Unit.INSTANCE;
            case 11:
                ((vf.aq) obj2).dispose();
                return Unit.INSTANCE;
            case 12:
                ((vf.Y) obj2).foxtrot(null);
                return Unit.INSTANCE;
            case 13:
                C1864m c1864m = (C1864m) obj2;
                return c1864m.X(((Integer) obj).intValue(), c1864m.silver);
            case 14:
                float f10 = -((Float) obj).floatValue();
                C1874w c1874w = (C1874w) obj2;
                if ((f10 >= 0.0f || c1874w.delta()) && (f10 <= 0.0f || c1874w.charlie())) {
                    if (Math.abs(c1874w.hotel) > 0.5f) {
                        AbstractC1719b.charlie("entered drag with non-zero pending scroll");
                    }
                    c1874w.delta = true;
                    float f11 = c1874w.hotel + f10;
                    c1874w.hotel = f11;
                    if (Math.abs(f11) > 0.5f) {
                        float f12 = c1874w.hotel;
                        int round = Math.round(f12);
                        C1867p foxtrot = ((C1867p) ((androidx.compose.runtime.t0) c1874w.foxtrot).getValue()).foxtrot(round, !c1874w.bravo);
                        if (foxtrot != null && (c1867p = c1874w.charlie) != null) {
                            C1867p foxtrot2 = c1867p.foxtrot(round, true);
                            if (foxtrot2 != null) {
                                c1874w.charlie = foxtrot2;
                            }
                            if (c1867p2 == null) {
                                c1874w.foxtrot(c1867p2, c1874w.bravo, true);
                                c1874w.victor.setValue(Unit.INSTANCE);
                                c1874w.hotel(f12 - c1874w.hotel, c1867p2);
                            } else {
                                s0.al alVar = c1874w.kilo;
                                if (alVar != null) {
                                    alVar.kilo();
                                }
                                c1874w.hotel(f12 - c1874w.hotel, c1874w.golf());
                            }
                        }
                        c1867p2 = foxtrot;
                        if (c1867p2 == null) {
                        }
                    }
                    if (Math.abs(c1874w.hotel) > 0.5f) {
                        f10 -= c1874w.hotel;
                        c1874w.hotel = 0.0f;
                    }
                    f5 = f10;
                }
                return Float.valueOf(-f5);
            case 15:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    io.ktor.utils.io.m mVar = (io.ktor.utils.io.m) obj2;
                    if (!mVar.lima()) {
                        mVar.delta(th2);
                    }
                }
                return Unit.INSTANCE;
            case 16:
                return Integer.valueOf(((Be.e) obj2).golf(((Integer) obj).intValue()));
            case 17:
                float f13 = -((Float) obj).floatValue();
                j.t tVar = (j.t) obj2;
                if ((f13 >= 0.0f || tVar.delta()) && (f13 <= 0.0f || tVar.charlie())) {
                    if (Math.abs(tVar.golf) > 0.5f) {
                        AbstractC1719b.charlie("entered drag with non-zero pending scroll");
                    }
                    float f14 = tVar.golf + f13;
                    tVar.golf = f14;
                    if (Math.abs(f14) > 0.5f) {
                        float f15 = tVar.golf;
                        int delta = Zd.a.delta(f15);
                        j.l foxtrot3 = ((j.l) ((androidx.compose.runtime.t0) tVar.echo).getValue()).foxtrot(delta, !tVar.bravo);
                        if (foxtrot3 != null && (lVar = tVar.charlie) != null) {
                            j.l foxtrot4 = lVar.foxtrot(delta, true);
                            if (foxtrot4 != null) {
                                tVar.charlie = foxtrot4;
                            }
                            if (lVar2 == null) {
                                tVar.foxtrot(lVar2, tVar.bravo, true);
                                tVar.romeo.setValue(Unit.INSTANCE);
                                tVar.hotel(f15 - tVar.golf, lVar2);
                            } else {
                                s0.al alVar2 = tVar.juliet;
                                if (alVar2 != null) {
                                    alVar2.kilo();
                                }
                                tVar.hotel(f15 - tVar.golf, tVar.golf());
                            }
                        }
                        lVar2 = foxtrot3;
                        if (lVar2 == null) {
                        }
                    }
                    if (Math.abs(tVar.golf) > 0.5f) {
                        f13 -= tVar.golf;
                        tVar.golf = 0.0f;
                    }
                    f5 = f13;
                }
                return Float.valueOf(-f5);
            case 18:
                return com.checkout.components.address.U.a((StatePickerViewModel) obj2, (String) obj);
            case 19:
                return RotateIconViewKt.charlie((bz.ag) obj2, (InterfaceC0342ab) obj);
            case 20:
                InterfaceC1869r LazyRow = (InterfaceC1869r) obj;
                Intrinsics.echo(LazyRow, "$this$LazyRow");
                float f16 = C2209b.alpha;
                com.google.android.material.datepicker.j.bravo(LazyRow, null, new P.d(new Vc.d(i11), 23598094, true), 3);
                List list3 = ((C0841f) obj2).alpha;
                ((C1860i) LazyRow).quebec(list3.size(), null, new B2.ap(24, C2028d.red, list3), new P.d(new U.o(list3), -632812321, true));
                return Unit.INSTANCE;
            case 21:
                C2068d prepare = (C2068d) obj;
                Intrinsics.echo(prepare, "$this$prepare");
                prepare.bravo = new kd.l(i12);
                prepare.alpha = new kd.z((kd.e) obj2, null);
                return Unit.INSTANCE;
            case 22:
                if (obj == ((kotlin.collections.a) obj2)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 23:
                Map.Entry it2 = (Map.Entry) obj;
                Intrinsics.echo(it2, "it");
                kotlin.collections.f fVar = (kotlin.collections.f) obj2;
                StringBuilder sb2 = new StringBuilder();
                Object key = it2.getKey();
                String str5 = "(this Map)";
                if (key == fVar) {
                    valueOf = "(this Map)";
                } else {
                    valueOf = String.valueOf(key);
                }
                sb2.append(valueOf);
                sb2.append('=');
                Object value = it2.getValue();
                if (value != fVar) {
                    str5 = String.valueOf(value);
                }
                sb2.append(str5);
                return sb2.toString();
            case 24:
                ge.z it3 = (ge.z) obj;
                Intrinsics.echo(it3, "it");
                ((kotlin.jvm.internal.aa) obj2).getClass();
                ge.aa aaVar2 = it3.alpha;
                if (aaVar2 == null) {
                    return "*";
                }
                ge.w wVar = it3.bravo;
                if (wVar instanceof kotlin.jvm.internal.aa) {
                    aaVar = (kotlin.jvm.internal.aa) wVar;
                }
                if (aaVar != null && (golf = aaVar.golf(true)) != null) {
                    valueOf2 = golf;
                } else {
                    valueOf2 = String.valueOf(wVar);
                }
                int i16 = kotlin.jvm.internal.z.$EnumSwitchMapping$0[aaVar2.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            return "out ".concat(valueOf2);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return "in ".concat(valueOf2);
                }
                return valueOf2;
            case 25:
                C2492a c2492a2 = (C2492a) obj;
                int i17 = Agreement.f12120R;
                int i18 = c2492a2.alpha;
                Agreement agreement = (Agreement) obj2;
                if (i18 != 0) {
                    if (i18 == 1) {
                        agreement.f12128O++;
                        agreement.green();
                    }
                } else {
                    String string = agreement.getString(R.string.failed_to_sign_agreement_with_reason, String.valueOf(c2492a2.bravo));
                    Intrinsics.delta(string, "getString(...)");
                    L9.d.pink(agreement, string);
                }
                return Unit.INSTANCE;
            case 26:
                C2492a c2492a3 = (C2492a) obj;
                int i19 = c2492a3.alpha;
                AgreementDetailFragment agreementDetailFragment = (AgreementDetailFragment) obj2;
                if (i19 != 0) {
                    if (i19 == 1) {
                        AppAgreement appAgreement = (AppAgreement) c2492a3.charlie;
                        WebView webView = agreementDetailFragment.f12130f;
                        if (webView != null) {
                            if (appAgreement == null || (str = appAgreement.getContent()) == null) {
                                str = "";
                            }
                            webView.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
                        } else {
                            Intrinsics.lima("htmlContentTextView");
                            throw null;
                        }
                    }
                } else {
                    Context context = agreementDetailFragment.getContext();
                    if (context != null) {
                        L9.d.pink(context, String.valueOf(c2492a3.bravo));
                    }
                }
                return Unit.INSTANCE;
            case 27:
                C2492a c2492a4 = (C2492a) obj;
                int i20 = c2492a4.alpha;
                AgreementFragment agreementFragment = (AgreementFragment) obj2;
                if (i20 != 0) {
                    if (i20 != 1) {
                        if (i20 == 2 && agreementFragment.f12132g == 0) {
                            ((SwipeRefreshLayout) agreementFragment.romeo().silver).setRefreshing(true);
                        }
                    } else {
                        ((SwipeRefreshLayout) agreementFragment.romeo().silver).setRefreshing(false);
                        List list4 = (List) c2492a4.charlie;
                        if (list4 == null) {
                            list4 = CollectionsKt.emptyList();
                        }
                        agreementFragment.f12133h = list4.isEmpty();
                        if (agreementFragment.f12132g == 0) {
                            Ca.c cVar3 = agreementFragment.f12131f;
                            if (cVar3 != null) {
                                cVar3.bravo(list4);
                            } else {
                                Intrinsics.lima("adapter");
                                throw null;
                            }
                        } else {
                            Ca.c cVar4 = agreementFragment.f12131f;
                            if (cVar4 != null) {
                                cVar4.alpha(list4);
                            } else {
                                Intrinsics.lima("adapter");
                                throw null;
                            }
                        }
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) agreementFragment.romeo().purple;
                        Ca.c cVar5 = agreementFragment.f12131f;
                        if (cVar5 != null) {
                            if (cVar5.alpha.size() == 0) {
                                i11 = 0;
                            }
                            linearLayoutCompat.setVisibility(i11);
                        } else {
                            Intrinsics.lima("adapter");
                            throw null;
                        }
                    }
                } else {
                    ((SwipeRefreshLayout) agreementFragment.romeo().silver).setRefreshing(false);
                    Context context2 = agreementFragment.getContext();
                    if (context2 != null) {
                        L9.d.pink(context2, String.valueOf(c2492a4.bravo));
                    }
                }
                return Unit.INSTANCE;
            case 28:
                return WalletComponent.bravo((WalletComponent) obj2, (String) obj);
            default:
                ((A0.k) ((A0.ad) obj)).hotel(y.ai.charlie, new y.ah(n.al.alpha, ((InterfaceC3372l) obj2).alpha(), y.ag.purple, true));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C1534h0(C0841f c0841f) {
        this.alpha = 20;
        float f5 = C2209b.alpha;
        this.purple = c0841f;
    }

    public /* synthetic */ C1534h0(cd.c cVar, AbstractC2304b abstractC2304b) {
        this.alpha = 2;
        this.purple = cVar;
    }
}
