package Aa;

import B9.AbstractC0032c;
import B9.AbstractC0050l;
import B9.AbstractC0054n;
import B9.AbstractC0071w;
import B9.ae;
import H0.ac;
import Nf.C0266y;
import Nf.P;
import Nf.Q;
import S.w;
import S.x;
import Tf.ah;
import Tf.v;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.aw;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.t0;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bv.ag;
import com.app.network.network.models.ActionType;
import com.app.network.network.models.CustomerPhoneResponse;
import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.models.Order;
import com.app.network.network.models.SignUpRequest;
import com.app.network.network.models.WithdrawHistory;
import com.app.network.network.models.WithdrawStatus;
import com.app.network.network.models.WithdrawTransaction;
import com.app.network.network.response.DataResponse;
import com.clevertap.android.sdk.Constants;
import d3.s;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.step3documents.ShareDocumentsFragment;
import delivery.samurai.android.ui.changePassword.ChangePasswordActivity;
import delivery.samurai.android.ui.envelop.EnvelopDetailActivity;
import delivery.samurai.android.ui.envelop.EnvelopsListingActivity;
import delivery.samurai.android.ui.envelopV2.EnvelopDetailActivityV2;
import delivery.samurai.android.ui.envelopV2.EnvelopsListingActivityV2;
import delivery.samurai.android.ui.orders.OrderHistoryFragment;
import delivery.samurai.android.ui.orders.note.ui.AllAddressNoteActivity;
import delivery.samurai.android.ui.orders.note.ui.CustomerCallAssistActivity;
import delivery.samurai.android.ui.splash.SplashActivity;
import delivery.samurai.android.ui.withdraw.WithdrawDetailActivity;
import f0.AbstractC1680b;
import g0.C1725e;
import g3.C1743d;
import g3.u;
import i.C1860i;
import i.InterfaceC1869r;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.ws.WebSocketProtocol;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import r3.C2492a;
import s6.AbstractC2634d5;
import s6.AbstractC2707l6;
import s6.J4;
import s6.S6;
import t6.A2;
import t6.B2;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ l(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final Object alpha(Object obj) {
        float f5;
        byte[] bArr = (byte[]) obj;
        Intrinsics.echo(bArr, "<this>");
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        Element documentElement = newInstance.newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(bArr))).getDocumentElement();
        Intrinsics.delta(documentElement, "getDocumentElement(...)");
        Zf.a aVar = new Zf.a(documentElement);
        Q0.d density = (Q0.d) this.purple;
        Intrinsics.echo(density, "density");
        T3.b bVar = new T3.b(1, false);
        float echo = A2.echo(B2.bravo(aVar, "width"), density);
        float echo2 = A2.echo(B2.bravo(aVar, "height"), density);
        String bravo = B2.bravo(aVar, "viewportWidth");
        float f10 = 0.0f;
        if (bravo != null) {
            f5 = Float.parseFloat(bravo);
        } else {
            f5 = 0.0f;
        }
        String bravo2 = B2.bravo(aVar, "viewportHeight");
        if (bravo2 != null) {
            f10 = Float.parseFloat(bravo2);
        }
        C1725e c1725e = new C1725e(null, echo, echo2, f5, f10, 0L, 0, Intrinsics.areEqual(B2.bravo(aVar, "autoMirrored"), "true"), 97);
        B2.foxtrot(aVar, c1725e, bVar);
        return new Wf.g(c1725e.echo());
    }

    /* JADX WARN: Removed duplicated region for block: B:340:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x09e1  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        int i4;
        List emptyList;
        List list;
        int i5;
        EnvelopNotification envelopNotification;
        List items;
        Object obj2;
        String str2;
        AtomicInteger atomicInteger;
        int i10;
        String createdAt;
        List emptyList2;
        int i11;
        int i12;
        boolean z2;
        int i13;
        String stringExtra;
        List listOf;
        String str3;
        int i14;
        boolean z10;
        List items2;
        List items3;
        List items4;
        List<WithdrawHistory> history;
        List<WithdrawHistory> p4;
        String str4;
        List list2;
        int i15 = 8;
        List list3 = null;
        r2 = null;
        r2 = null;
        List list4 = null;
        String str5 = null;
        List list5 = null;
        Object obj3 = null;
        EnvelopNotification envelopNotification2 = null;
        String str6 = null;
        int i16 = 0;
        int i17 = 1;
        boolean z11 = true;
        r5 = true;
        boolean z12 = true;
        boolean z13 = true;
        i17 = 1;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                int i18 = c2492a.alpha;
                k9.d dVar = ((n) this.purple).A;
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2 && dVar.getItemCount() > 0 && !dVar.bravo) {
                            dVar.bravo = true;
                            dVar.notifyItemInserted(((ArrayList) dVar.charlie).size());
                        }
                    } else {
                        DataResponse dataResponse = (DataResponse) c2492a.charlie;
                        if (dataResponse != null) {
                            list3 = dataResponse.getItems();
                        }
                        ArrayList arrayList = (ArrayList) dVar.charlie;
                        arrayList.clear();
                        if (list3 != null && !list3.isEmpty()) {
                            arrayList.addAll(list3);
                        }
                        dVar.notifyDataSetChanged();
                        if (dVar.bravo) {
                            dVar.bravo = false;
                            dVar.notifyItemRemoved(((ArrayList) dVar.charlie).size());
                        }
                    }
                } else if (dVar.bravo) {
                    dVar.bravo = false;
                    dVar.notifyItemRemoved(((ArrayList) dVar.charlie).size());
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC1869r LazyColumn = (InterfaceC1869r) obj;
                Intrinsics.echo(LazyColumn, "$this$LazyColumn");
                for (Map.Entry entry : ((Map) this.purple).entrySet()) {
                    Cb.b bVar = (Cb.b) entry.getKey();
                    List list6 = (List) entry.getValue();
                    com.google.android.material.datepicker.j.bravo(LazyColumn, av.q.echo("header_", bVar.name()), new P.d(new Cb.d(i17, bVar), 345565712, true), 2);
                    ((C1860i) LazyColumn).quebec(list6.size(), new Cb.l(i16, new A4.a(2), list6), new Cb.m(0, list6), new P.d(new Cb.n(i16, list6), 802480018, true));
                }
                return Unit.INSTANCE;
            case 2:
                SignUpRequest request = (SignUpRequest) obj;
                Intrinsics.echo(request, "request");
                ShareDocumentsFragment shareDocumentsFragment = (ShareDocumentsFragment) this.purple;
                Editable text = shareDocumentsFragment.romeo().f88o.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                request.setVehiclePlateNumber(str);
                Editable text2 = shareDocumentsFragment.romeo().f89p.getText();
                if (text2 != null) {
                    str6 = text2.toString();
                }
                request.setVehicleSequenceNumber(str6);
                return Unit.INSTANCE;
            case 3:
                HashMap hashMap = (HashMap) obj;
                Da.q qVar = (Da.q) this.purple;
                ae aeVar = qVar.B;
                if (aeVar != null) {
                    AppCompatImageView ivDoc = aeVar.f331h;
                    Intrinsics.delta(ivDoc, "ivDoc");
                    if (hashMap.containsKey(Integer.valueOf(qVar.f960z))) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    ivDoc.setVisibility(i4);
                    ae aeVar2 = qVar.B;
                    if (aeVar2 != null) {
                        AppCompatImageView ivPlaceHolder = aeVar2.f332i;
                        Intrinsics.delta(ivPlaceHolder, "ivPlaceHolder");
                        if (!hashMap.containsKey(Integer.valueOf(qVar.f960z))) {
                            i15 = 0;
                        }
                        ivPlaceHolder.setVisibility(i15);
                        return Unit.INSTANCE;
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            case 4:
                if (!((Boolean) obj).booleanValue()) {
                    Toast.makeText(((ComposeView) this.purple).getContext(), R.string.failed_to_leave_shift, 0).show();
                }
                return Unit.INSTANCE;
            case 5:
                C2492a c2492a2 = (C2492a) obj;
                int i19 = c2492a2.alpha;
                Ea.g gVar = (Ea.g) this.purple;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            gVar.victor().bronze();
                        }
                    } else {
                        gVar.victor().tango();
                        DataResponse dataResponse2 = (DataResponse) c2492a2.charlie;
                        if (dataResponse2 == null || (emptyList = dataResponse2.getItems()) == null) {
                            emptyList = CollectionsKt.emptyList();
                        }
                        gVar.f984z.bravo(emptyList);
                    }
                } else {
                    gVar.victor().tango();
                }
                return Unit.INSTANCE;
            case 6:
                C2492a c2492a3 = (C2492a) obj;
                int i20 = EnvelopDetailActivity.f12246L;
                int i21 = c2492a3.alpha;
                EnvelopDetailActivity envelopDetailActivity = (EnvelopDetailActivity) this.purple;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            envelopDetailActivity.bronze();
                        }
                    } else {
                        envelopDetailActivity.tango();
                        AbstractC0050l abstractC0050l = envelopDetailActivity.f12249J;
                        if (abstractC0050l != null) {
                            abstractC0050l.romeo((EnvelopNotification) c2492a3.charlie);
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    }
                } else {
                    envelopDetailActivity.tango();
                    L9.d.pink(envelopDetailActivity, String.valueOf(c2492a3.bravo));
                }
                return Unit.INSTANCE;
            case 7:
                C2492a c2492a4 = (C2492a) obj;
                int i22 = EnvelopsListingActivity.f12251M;
                int i23 = c2492a4.alpha;
                EnvelopsListingActivity envelopsListingActivity = (EnvelopsListingActivity) this.purple;
                if (i23 != 0) {
                    if (i23 != 1) {
                        if (i23 == 2) {
                            envelopsListingActivity.gray().delta.setRefreshing(true);
                        }
                    } else {
                        envelopsListingActivity.gray().delta.setRefreshing(false);
                        DataResponse dataResponse3 = (DataResponse) c2492a4.charlie;
                        if (dataResponse3 != null) {
                            list = dataResponse3.getItems();
                        } else {
                            list = null;
                        }
                        RecyclerView recyclerView = envelopsListingActivity.gray().charlie;
                        if (list != null && !list.isEmpty()) {
                            i17 = 0;
                        }
                        if (i17 != 0) {
                            i5 = 8;
                        } else {
                            i5 = 0;
                        }
                        recyclerView.setVisibility(i5);
                        LinearLayoutCompat linearLayoutCompat = envelopsListingActivity.gray().bravo;
                        if (list == null || list.isEmpty()) {
                            i15 = 0;
                        }
                        linearLayoutCompat.setVisibility(i15);
                        envelopsListingActivity.f12254L.bravo(list);
                        String stringExtra2 = envelopsListingActivity.getIntent().getStringExtra("redirectId");
                        if (stringExtra2 != null) {
                            if (dataResponse3 != null && (items = dataResponse3.getItems()) != null) {
                                Iterator it = items.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (Intrinsics.areEqual(String.valueOf(((EnvelopNotification) obj2).getId()), stringExtra2)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                envelopNotification = (EnvelopNotification) obj2;
                                if (envelopNotification != null) {
                                    envelopNotification2 = envelopNotification;
                                    if (envelopNotification2 != null) {
                                        Intent intent = new Intent(envelopsListingActivity, (Class<?>) EnvelopDetailActivity.class);
                                        intent.putExtra("ENVELOP_NOTIFICATION_ID", stringExtra2);
                                        intent.putExtra("ENVELOP_NOTIFICATION", envelopNotification);
                                        envelopsListingActivity.startActivity(intent);
                                    }
                                }
                            }
                            envelopNotification = null;
                            if (envelopNotification2 != null) {
                            }
                        }
                    }
                } else {
                    envelopsListingActivity.gray().delta.setRefreshing(false);
                }
                return Unit.INSTANCE;
            case 8:
                C2492a c2492a5 = (C2492a) obj;
                int i24 = EnvelopDetailActivityV2.f12255N;
                int i25 = c2492a5.alpha;
                EnvelopDetailActivityV2 envelopDetailActivityV2 = (EnvelopDetailActivityV2) this.purple;
                if (i25 != 0) {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            envelopDetailActivityV2.bronze();
                        }
                    } else {
                        envelopDetailActivityV2.tango();
                        EnvelopNotification envelopNotification3 = (EnvelopNotification) c2492a5.charlie;
                        envelopDetailActivityV2.f12258L = envelopNotification3;
                        envelopDetailActivityV2.gray().romeo(envelopNotification3);
                        AbstractC0054n gray = envelopDetailActivityV2.gray();
                        if (envelopNotification3 != null && (createdAt = envelopNotification3.getCreatedAt()) != null) {
                            str2 = AbstractC2634d5.golf(createdAt);
                        } else {
                            str2 = "";
                        }
                        gray.f569j.setText(str2);
                        envelopDetailActivityV2.gold(envelopNotification3);
                        AtomicInteger atomicInteger2 = s.alpha;
                        do {
                            atomicInteger = s.alpha;
                            i10 = atomicInteger.get();
                            if (i10 <= 0) {
                            }
                            W1.b.alpha(envelopDetailActivityV2).charlie(new Intent("delivery.samurai.envelope_read"));
                        } while (!atomicInteger.compareAndSet(i10, i10 - 1));
                        W1.b.alpha(envelopDetailActivityV2).charlie(new Intent("delivery.samurai.envelope_read"));
                    }
                } else {
                    envelopDetailActivityV2.tango();
                    L9.d.pink(envelopDetailActivityV2, String.valueOf(c2492a5.bravo));
                }
                return Unit.INSTANCE;
            case 9:
                C2492a c2492a6 = (C2492a) obj;
                int i26 = EnvelopsListingActivityV2.Q;
                Intrinsics.checkNotNull(c2492a6);
                EnvelopsListingActivityV2 envelopsListingActivityV2 = (EnvelopsListingActivityV2) this.purple;
                int i27 = c2492a6.alpha;
                if (i27 != 0) {
                    if (i27 != 1) {
                        if (i27 == 2 && !envelopsListingActivityV2.f12265M) {
                            ((SwipeRefreshLayout) envelopsListingActivityV2.gray().silver).setRefreshing(true);
                        }
                    } else {
                        ((SwipeRefreshLayout) envelopsListingActivityV2.gray().silver).setRefreshing(false);
                        envelopsListingActivityV2.f12265M = false;
                        DataResponse dataResponse4 = (DataResponse) c2492a6.charlie;
                        if (dataResponse4 == null || (emptyList2 = dataResponse4.getItems()) == null) {
                            emptyList2 = CollectionsKt.emptyList();
                        }
                        if (dataResponse4 != null) {
                            i11 = dataResponse4.getPage();
                        } else {
                            i11 = 0;
                        }
                        if (dataResponse4 != null) {
                            i12 = dataResponse4.getPageCount();
                        } else {
                            i12 = 1;
                        }
                        ArrayList arrayList2 = envelopsListingActivityV2.f12261I;
                        if (i11 == 0) {
                            arrayList2.clear();
                        }
                        arrayList2.addAll(emptyList2);
                        if (i11 < i12 - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        envelopsListingActivityV2.f12266N = z2;
                        if (arrayList2 == null || !arrayList2.isEmpty()) {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.areEqual(((EnvelopNotification) it2.next()).getUnread(), Boolean.TRUE)) {
                                    ((t0) envelopsListingActivityV2.f12262J).setValue(Boolean.valueOf(z13));
                                    envelopsListingActivityV2.f12268P.bravo(arrayList2);
                                    RecyclerView recyclerView2 = (RecyclerView) envelopsListingActivityV2.gray().red;
                                    if (!arrayList2.isEmpty()) {
                                        i13 = 8;
                                    } else {
                                        i13 = 0;
                                    }
                                    recyclerView2.setVisibility(i13);
                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) envelopsListingActivityV2.gray().purple;
                                    if (arrayList2.isEmpty()) {
                                        i15 = 0;
                                    }
                                    linearLayoutCompat2.setVisibility(i15);
                                    ((ComposeView) envelopsListingActivityV2.gray().teal).invalidate();
                                    stringExtra = envelopsListingActivityV2.getIntent().getStringExtra("redirectId");
                                    if (stringExtra != null) {
                                        Iterator it3 = arrayList2.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                Object next = it3.next();
                                                if (Intrinsics.areEqual(String.valueOf(((EnvelopNotification) next).getId()), stringExtra)) {
                                                    obj3 = next;
                                                }
                                            }
                                        }
                                        EnvelopNotification envelopNotification4 = (EnvelopNotification) obj3;
                                        if (envelopNotification4 != null) {
                                            Intent intent2 = new Intent(envelopsListingActivityV2, (Class<?>) EnvelopDetailActivityV2.class);
                                            intent2.putExtra("ENVELOP_NOTIFICATION_ID", stringExtra);
                                            intent2.putExtra("ENVELOP_NOTIFICATION", envelopNotification4);
                                            envelopsListingActivityV2.startActivity(intent2);
                                        }
                                    }
                                }
                            }
                        }
                        z13 = false;
                        ((t0) envelopsListingActivityV2.f12262J).setValue(Boolean.valueOf(z13));
                        envelopsListingActivityV2.f12268P.bravo(arrayList2);
                        RecyclerView recyclerView22 = (RecyclerView) envelopsListingActivityV2.gray().red;
                        if (!arrayList2.isEmpty()) {
                        }
                        recyclerView22.setVisibility(i13);
                        LinearLayoutCompat linearLayoutCompat22 = (LinearLayoutCompat) envelopsListingActivityV2.gray().purple;
                        if (arrayList2.isEmpty()) {
                        }
                        linearLayoutCompat22.setVisibility(i15);
                        ((ComposeView) envelopsListingActivityV2.gray().teal).invalidate();
                        stringExtra = envelopsListingActivityV2.getIntent().getStringExtra("redirectId");
                        if (stringExtra != null) {
                        }
                    }
                } else {
                    ((SwipeRefreshLayout) envelopsListingActivityV2.gray().silver).setRefreshing(false);
                    envelopsListingActivityV2.f12265M = false;
                }
                return Unit.INSTANCE;
            case 10:
                N2.g state = (N2.g) obj;
                Intrinsics.echo(state, "state");
                AbstractC1680b abstractC1680b = state.alpha;
                float intBitsToFloat = Float.intBitsToFloat((int) (abstractC1680b.mo1getIntrinsicSizeNHjbRc() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (abstractC1680b.mo1getIntrinsicSizeNHjbRc() & 4294967295L));
                if (intBitsToFloat > 0.0f && intBitsToFloat2 > 0.0f) {
                    ((n0) ((aw) this.purple)).kilo(J4.charlie(intBitsToFloat / intBitsToFloat2, 0.8f, 1.91f));
                }
                return Unit.INSTANCE;
            case 11:
                ac acVar = (ac) obj;
                return ((H0.l) this.purple).alpha(new ac(null, acVar.bravo, acVar.charlie, acVar.delta, acVar.echo)).getValue();
            case 12:
                Lf.a buildSerialDescriptor = (Lf.a) obj;
                Intrinsics.echo(buildSerialDescriptor, "$this$buildSerialDescriptor");
                Lf.a.alpha(buildSerialDescriptor, Constants.KEY_TYPE, P.bravo);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Polymorphic<");
                Jf.b bVar2 = (Jf.b) this.purple;
                sb2.append(bVar2.alpha.kilo());
                sb2.append('>');
                Lf.a.alpha(buildSerialDescriptor, "value", AbstractC2707l6.delta(sb2.toString(), Lf.j.bravo, new SerialDescriptor[0]));
                List list7 = bVar2.bravo;
                Intrinsics.echo(list7, "<set-?>");
                buildSerialDescriptor.bravo = list7;
                return Unit.INSTANCE;
            case 13:
                Kb.a item = (Kb.a) obj;
                Intrinsics.echo(item, "item");
                Kb.h hVar = (Kb.h) this.purple;
                Kb.c cVar = item.alpha;
                switch (cVar.ordinal()) {
                    case 0:
                        Context requireContext = hVar.requireContext();
                        Intrinsics.delta(requireContext, "requireContext(...)");
                        Intent intent3 = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                        intent3.setData(Uri.parse("package:" + hVar.requireContext().getPackageName()));
                        L9.d.orange(requireContext, intent3, 6);
                        break;
                    case 1:
                        if (Build.VERSION.SDK_INT >= 26) {
                            Context requireContext2 = hVar.requireContext();
                            Intrinsics.delta(requireContext2, "requireContext(...)");
                            Intent intent4 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                            intent4.putExtra("android.provider.extra.APP_PACKAGE", hVar.requireContext().getPackageName());
                            L9.d.orange(requireContext2, intent4, 6);
                            break;
                        }
                        break;
                    case 2:
                        hVar.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                        break;
                    case 3:
                        if (Build.VERSION.SDK_INT >= 29) {
                            Context requireContext3 = hVar.requireContext();
                            Intrinsics.delta(requireContext3, "requireContext(...)");
                            C1743d charlie = L9.d.charlie(requireContext3);
                            if (!charlie.alpha) {
                                u uVar = u.purple;
                                List list8 = charlie.bravo;
                                if (!list8.contains(uVar) && !list8.contains(u.alpha)) {
                                    hVar.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 1002);
                                    break;
                                } else {
                                    hVar.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        Context requireContext4 = hVar.requireContext();
                        Intrinsics.delta(requireContext4, "requireContext(...)");
                        L9.d.orange(requireContext4, new Intent("android.settings.BATTERY_SAVER_SETTINGS"), 6);
                        break;
                    case 5:
                        if (Build.VERSION.SDK_INT >= 24) {
                            Context requireContext5 = hVar.requireContext();
                            Intrinsics.delta(requireContext5, "requireContext(...)");
                            L9.d.orange(requireContext5, new Intent("android.settings.DATA_SAVER_SETTINGS"), 6);
                            break;
                        }
                        break;
                    case 6:
                        Context requireContext6 = hVar.requireContext();
                        Intrinsics.delta(requireContext6, "requireContext(...)");
                        L9.d.orange(requireContext6, new Intent("android.settings.WIFI_SETTINGS"), 6);
                        break;
                    case 7:
                        Context requireContext7 = hVar.requireContext();
                        Intrinsics.delta(requireContext7, "requireContext(...)");
                        L9.d.orange(requireContext7, new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 6);
                        break;
                    case 8:
                        Context requireContext8 = hVar.requireContext();
                        Intrinsics.delta(requireContext8, "requireContext(...)");
                        L9.d.orange(requireContext8, new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 6);
                        break;
                    case 9:
                        Context requireContext9 = hVar.requireContext();
                        Intrinsics.delta(requireContext9, "requireContext(...)");
                        L9.d.orange(requireContext9, new Intent("android.settings.DATE_SETTINGS"), 6);
                        break;
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        Context requireContext10 = hVar.requireContext();
                        Intrinsics.delta(requireContext10, "requireContext(...)");
                        String packageName = requireContext10.getPackageName();
                        Intrinsics.delta(packageName, "getPackageName(...)");
                        String checkTypeName = cVar.name();
                        CharSequence loadLabel = requireContext10.getApplicationInfo().loadLabel(requireContext10.getPackageManager());
                        Intrinsics.echo(checkTypeName, "checkTypeName");
                        Intent intent5 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent5.setData(Uri.parse("package:".concat(packageName)));
                        intent5.addFlags(268435456);
                        int hashCode = checkTypeName.hashCode();
                        if (hashCode != -1960699544) {
                            if (hashCode != -580625143) {
                                if (hashCode == -148429511 && checkTypeName.equals("XIAOMI_BATTERY_SETTINGS")) {
                                    Intent intent6 = new Intent();
                                    intent6.setComponent(new ComponentName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity"));
                                    intent6.putExtra("package_name", packageName);
                                    if (loadLabel == null || (str3 = loadLabel.toString()) == null) {
                                        str3 = "";
                                    }
                                    intent6.putExtra("package_label", str3);
                                    intent6.addFlags(268435456);
                                    listOf = ab.juliet(intent6);
                                }
                                listOf = CollectionsKt.emptyList();
                            } else {
                                if (checkTypeName.equals("HUAWEI_APP_LAUNCH")) {
                                    Intent intent7 = new Intent();
                                    intent7.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"));
                                    intent7.addFlags(268435456);
                                    listOf = ab.juliet(intent7);
                                }
                                listOf = CollectionsKt.emptyList();
                            }
                        } else {
                            if (checkTypeName.equals("VIVO_BATTERY_SETTINGS")) {
                                Intent intent8 = new Intent();
                                intent8.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"));
                                intent8.addFlags(268435456);
                                Intent intent9 = new Intent();
                                intent9.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager"));
                                intent9.addFlags(268435456);
                                listOf = CollectionsKt.listOf(intent8, intent9);
                            }
                            listOf = CollectionsKt.emptyList();
                        }
                        PackageManager packageManager = requireContext10.getPackageManager();
                        Iterator it4 = listOf.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                Intent intent10 = (Intent) it4.next();
                                if (packageManager.resolveActivity(intent10, 65536) != null) {
                                    try {
                                        requireContext10.startActivity(intent10);
                                        break;
                                    } catch (Exception unused) {
                                        continue;
                                    }
                                }
                            } else {
                                try {
                                    requireContext10.startActivity(intent5);
                                    break;
                                } catch (Exception unused2) {
                                    break;
                                }
                            }
                        }
                        break;
                    case 12:
                    case 13:
                        Context requireContext11 = hVar.requireContext();
                        Intrinsics.delta(requireContext11, "requireContext(...)");
                        L9.d.orange(requireContext11, new Intent("android.settings.WIRELESS_SETTINGS"), 6);
                        break;
                    case 14:
                        Context requireContext12 = hVar.requireContext();
                        Intrinsics.delta(requireContext12, "requireContext(...)");
                        L9.d.orange(requireContext12, new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"), 6);
                        break;
                }
                return Unit.INSTANCE;
            case 14:
                ActionType type = (ActionType) obj;
                Intrinsics.echo(type, "type");
                String simpleName = Gc.q.class.getSimpleName();
                Nc.n nVar = (Nc.n) this.purple;
                if (nVar.requireActivity().getSupportFragmentManager().blue(simpleName) == null) {
                    W8.a aVar = Gc.q.A;
                    int intValue = ((Number) nVar.purple.getValue()).intValue();
                    aVar.getClass();
                    Gc.q qVar2 = new Gc.q();
                    Bundle bundle = new Bundle();
                    bundle.putString(Constants.KEY_TYPE, new com.google.gson.l().india(type));
                    bundle.putInt("orderId", intValue);
                    qVar2.setArguments(bundle);
                    qVar2.romeo(nVar.requireActivity().getSupportFragmentManager(), simpleName);
                }
                return Unit.INSTANCE;
            case 15:
                Lf.a buildSerialDescriptor2 = (Lf.a) obj;
                Intrinsics.echo(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                List list9 = (List) ((C0266y) this.purple).charlie;
                Intrinsics.echo(list9, "<set-?>");
                buildSerialDescriptor2.bravo = list9;
                return Unit.INSTANCE;
            case 16:
                Lf.a buildClassSerialDescriptor = (Lf.a) obj;
                Intrinsics.echo(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                Q q4 = (Q) this.purple;
                Lf.a.alpha(buildClassSerialDescriptor, "first", q4.alpha.getDescriptor());
                Lf.a.alpha(buildClassSerialDescriptor, "second", q4.bravo.getDescriptor());
                Lf.a.alpha(buildClassSerialDescriptor, "third", q4.charlie.getDescriptor());
                return Unit.INSTANCE;
            case 17:
                ((P2.f) this.purple).f1891d = true;
                return Unit.INSTANCE;
            case 18:
                C2492a c2492a7 = (C2492a) obj;
                int i28 = c2492a7.alpha;
                OrderHistoryFragment orderHistoryFragment = (OrderHistoryFragment) this.purple;
                if (i28 != 0) {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            ((SwipeRefreshLayout) orderHistoryFragment.romeo().delta).setRefreshing(true);
                        }
                    } else {
                        ((SwipeRefreshLayout) orderHistoryFragment.romeo().delta).setRefreshing(false);
                        DataResponse dataResponse5 = (DataResponse) c2492a7.charlie;
                        if (dataResponse5 != null) {
                            i14 = dataResponse5.getPageCount() - 1;
                        } else {
                            i14 = 0;
                        }
                        int i29 = orderHistoryFragment.f12342j;
                        if (i14 == i29) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        orderHistoryFragment.f12343k = z10;
                        Ca.c cVar2 = orderHistoryFragment.f12345m;
                        if (i29 > 0) {
                            if (dataResponse5 != null && (items4 = dataResponse5.getItems()) != null) {
                                cVar2.alpha(items4);
                            } else {
                                return Unit.INSTANCE;
                            }
                        } else {
                            LinearLayout linearLayout = (LinearLayout) orderHistoryFragment.romeo().bravo;
                            if (dataResponse5 != null && (items3 = dataResponse5.getItems()) != null) {
                                z12 = items3.isEmpty();
                            }
                            if (z12) {
                                i15 = 0;
                            }
                            linearLayout.setVisibility(i15);
                            if (dataResponse5 != null && (items2 = dataResponse5.getItems()) != null) {
                                cVar2.bravo(items2);
                            } else {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } else {
                    ((SwipeRefreshLayout) orderHistoryFragment.romeo().delta).setRefreshing(false);
                    Context context = orderHistoryFragment.getContext();
                    if (context != null) {
                        L9.d.pink(context, String.valueOf(c2492a7.bravo));
                    }
                }
                return Unit.INSTANCE;
            case 19:
                C2492a c2492a8 = (C2492a) obj;
                int i30 = c2492a8.alpha;
                Qb.p pVar = (Qb.p) this.purple;
                if (i30 != 0) {
                    if (i30 != 1) {
                        if (i30 == 2) {
                            ProgressBar progress = pVar.coral().f354j;
                            Intrinsics.delta(progress, "progress");
                            progress.setVisibility(0);
                        }
                    } else {
                        ProgressBar progress2 = pVar.coral().f354j;
                        Intrinsics.delta(progress2, "progress");
                        progress2.setVisibility(8);
                        Order order = (Order) c2492a8.charlie;
                        if (order == null) {
                            return Unit.INSTANCE;
                        }
                        Order order2 = pVar.f1936u;
                        if (order2 == null) {
                            pVar.f1936u = order;
                        } else {
                            order2.mergeFrom(order);
                        }
                        pVar.crimson();
                    }
                } else {
                    ProgressBar progress3 = pVar.coral().f354j;
                    Intrinsics.delta(progress3, "progress");
                    progress3.setVisibility(8);
                    pVar.black(String.valueOf(c2492a8.bravo));
                }
                return Unit.INSTANCE;
            case 20:
                R.g gVar2 = ((R.e) this.purple).red;
                if (gVar2 != null) {
                    z11 = gVar2.bravo(obj);
                }
                return Boolean.valueOf(z11);
            case 21:
                x xVar = (x) this.purple;
                xVar.getClass();
                synchronized (xVar.golf) {
                    w wVar = xVar.india;
                    Intrinsics.checkNotNull(wVar);
                    Object obj4 = wVar.bravo;
                    Intrinsics.checkNotNull(obj4);
                    int i31 = wVar.delta;
                    ag agVar = wVar.charlie;
                    if (agVar == null) {
                        agVar = new ag();
                        wVar.charlie = agVar;
                        wVar.foxtrot.mike(obj4, agVar);
                    }
                    wVar.charlie(obj, i31, obj4, agVar);
                }
                return Unit.INSTANCE;
            case 22:
                C2492a c2492a9 = (C2492a) obj;
                int i32 = ChangePasswordActivity.f12232K;
                int i33 = c2492a9.alpha;
                ChangePasswordActivity changePasswordActivity = (ChangePasswordActivity) this.purple;
                if (i33 != 0) {
                    if (i33 != 1) {
                        if (i33 == 2) {
                            changePasswordActivity.bronze();
                        }
                    } else {
                        changePasswordActivity.tango();
                        String string = changePasswordActivity.getString(R.string.password_updated);
                        Intrinsics.delta(string, "getString(...)");
                        L9.d.pink(changePasswordActivity, string);
                        Intent addFlags = new Intent(changePasswordActivity, (Class<?>) SplashActivity.class).addFlags(32768).addFlags(268435456);
                        Intrinsics.delta(addFlags, "addFlags(...)");
                        changePasswordActivity.startActivity(addFlags);
                    }
                } else {
                    changePasswordActivity.tango();
                    String str7 = c2492a9.bravo;
                    if (str7 != null) {
                        String string2 = changePasswordActivity.getString(R.string.attention);
                        Intrinsics.delta(string2, "getString(...)");
                        String string3 = changePasswordActivity.getString(R.string.ok);
                        Intrinsics.delta(string3, "getString(...)");
                        L9.d.olive(changePasswordActivity, string2, str7, string3, null, null, null, 120);
                    }
                }
                return Unit.INSTANCE;
            case 23:
                ah it5 = (ah) obj;
                Intrinsics.echo(it5, "it");
                return ((v) this.purple).onPathResult(it5, "listRecursively");
            case 24:
                C2492a c2492a10 = (C2492a) obj;
                int i34 = c2492a10.alpha;
                Va.a aVar2 = (Va.a) this.purple;
                if (i34 != 0) {
                    if (i34 != 1) {
                        if (i34 == 2) {
                            aVar2.victor().bronze();
                        }
                    } else {
                        aVar2.victor().tango();
                        Va.d dVar2 = aVar2.f2174z;
                        if (dVar2 != null) {
                            DataResponse dataResponse6 = (DataResponse) c2492a10.charlie;
                            if (dataResponse6 != null) {
                                list5 = dataResponse6.getItems();
                            }
                            dVar2.bravo(list5);
                        } else {
                            Intrinsics.lima("adapter");
                            throw null;
                        }
                    }
                } else {
                    aVar2.victor().tango();
                }
                return Unit.INSTANCE;
            case 25:
                C2492a c2492a11 = (C2492a) obj;
                AllAddressNoteActivity allAddressNoteActivity = (AllAddressNoteActivity) this.purple;
                AbstractC0032c abstractC0032c = allAddressNoteActivity.f12365J;
                if (abstractC0032c != null) {
                    abstractC0032c.f427i.setRefreshing(false);
                    int i35 = c2492a11.alpha;
                    if (i35 != 0) {
                        if (i35 != 1) {
                            if (i35 == 2) {
                                AbstractC0032c abstractC0032c2 = allAddressNoteActivity.f12365J;
                                if (abstractC0032c2 != null) {
                                    abstractC0032c2.f425g.setVisibility(0);
                                    abstractC0032c2.f428j.setVisibility(8);
                                    abstractC0032c2.f426h.setVisibility(8);
                                    abstractC0032c2.f424f.setVisibility(8);
                                } else {
                                    Intrinsics.lima("binding");
                                    throw null;
                                }
                            }
                        } else {
                            List list10 = (List) c2492a11.charlie;
                            if (list10 != null) {
                                Sc.p pVar2 = allAddressNoteActivity.f12366K;
                                if (pVar2 != null) {
                                    ArrayList arrayList3 = (ArrayList) pVar2.delta;
                                    arrayList3.clear();
                                    arrayList3.addAll(list10);
                                    pVar2.notifyDataSetChanged();
                                    AbstractC0032c abstractC0032c3 = allAddressNoteActivity.f12365J;
                                    if (abstractC0032c3 != null) {
                                        abstractC0032c3.f425g.setVisibility(8);
                                        abstractC0032c3.f428j.setVisibility(8);
                                        abstractC0032c3.f426h.setVisibility(0);
                                        if (allAddressNoteActivity.f12369N) {
                                            i15 = 0;
                                        }
                                        abstractC0032c3.f424f.setVisibility(i15);
                                    } else {
                                        Intrinsics.lima("binding");
                                        throw null;
                                    }
                                } else {
                                    Intrinsics.lima("adapter");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        AbstractC0032c abstractC0032c4 = allAddressNoteActivity.f12365J;
                        if (abstractC0032c4 != null) {
                            abstractC0032c4.f425g.setVisibility(8);
                            String str8 = c2492a11.bravo;
                            if (str8 == null) {
                                str8 = "";
                            }
                            TextView textView = abstractC0032c4.f428j;
                            textView.setText(str8);
                            textView.setVisibility(0);
                            abstractC0032c4.f426h.setVisibility(8);
                            abstractC0032c4.f424f.setVisibility(8);
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    }
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("binding");
                throw null;
            case 26:
                C2492a c2492a12 = (C2492a) obj;
                int i36 = CustomerCallAssistActivity.f12372M;
                int i37 = c2492a12.alpha;
                CustomerCallAssistActivity customerCallAssistActivity = (CustomerCallAssistActivity) this.purple;
                if (i37 != 0) {
                    if (i37 == 1) {
                        CustomerPhoneResponse customerPhoneResponse = (CustomerPhoneResponse) c2492a12.charlie;
                        if (customerPhoneResponse != null) {
                            str5 = customerPhoneResponse.getPhone();
                        }
                        if (str5 != null && !StringsKt.gray(str5)) {
                            Wb.s sVar = new Wb.s();
                            sVar.setArguments(S6.charlie(new Pair("arg_phone", str5)));
                            sVar.romeo(customerCallAssistActivity.getSupportFragmentManager(), "CallOptionsBottomSheet");
                        } else {
                            String string4 = customerCallAssistActivity.getString(R.string.phone_not_available);
                            Intrinsics.delta(string4, "getString(...)");
                            if (!StringsKt.gray(string4)) {
                                Toast.makeText(customerCallAssistActivity, string4, 0).show();
                            }
                        }
                    }
                } else {
                    String str9 = c2492a12.bravo;
                    if (str9 == null) {
                        str9 = "";
                    }
                    if (!StringsKt.gray(str9)) {
                        Toast.makeText(customerCallAssistActivity, str9, 0).show();
                    }
                }
                return Unit.INSTANCE;
            case 27:
                C2492a c2492a13 = (C2492a) obj;
                int i38 = WithdrawDetailActivity.f12546N;
                int i39 = c2492a13.alpha;
                WithdrawDetailActivity withdrawDetailActivity = (WithdrawDetailActivity) this.purple;
                if (i39 != 0) {
                    if (i39 != 1) {
                        if (i39 == 2) {
                            withdrawDetailActivity.bronze();
                        }
                    } else {
                        withdrawDetailActivity.tango();
                        AbstractC0071w gray2 = withdrawDetailActivity.gray();
                        WithdrawTransaction withdrawTransaction = (WithdrawTransaction) c2492a13.charlie;
                        gray2.f709h.romeo(withdrawTransaction);
                        withdrawDetailActivity.f12550K = withdrawTransaction;
                        if (withdrawTransaction != null && (history = withdrawTransaction.getHistory()) != null && (p4 = CollectionsKt.p(history, new Sb.k(3))) != null) {
                            for (WithdrawHistory withdrawHistory : p4) {
                                if (withdrawHistory.getStatus() == WithdrawStatus.FAILED || withdrawHistory.getStatus() == WithdrawStatus.REJECTED) {
                                    WithdrawTransaction withdrawTransaction2 = withdrawDetailActivity.f12550K;
                                    if (withdrawTransaction2 != null) {
                                        str4 = withdrawTransaction2.getRefusalReasonMessage();
                                    } else {
                                        str4 = null;
                                    }
                                    withdrawHistory.setRefusalReasonMessage(str4);
                                }
                            }
                            list4 = p4;
                        }
                        withdrawDetailActivity.f12552M.bravo(list4);
                        ViewParent parent = withdrawDetailActivity.gray().f707f.getParent();
                        Intrinsics.charlie(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.post(new A8.g(19, viewGroup, withdrawDetailActivity));
                    }
                } else {
                    withdrawDetailActivity.tango();
                    String str10 = c2492a13.bravo;
                    if (str10 != null) {
                        L9.d.pink(withdrawDetailActivity, str10);
                    }
                }
                return Unit.INSTANCE;
            case 28:
                return alpha(obj);
            default:
                C2492a c2492a14 = (C2492a) obj;
                int i40 = c2492a14.alpha;
                Xa.g gVar3 = (Xa.g) this.purple;
                if (i40 != 0) {
                    if (i40 != 1) {
                        if (i40 == 2) {
                            gVar3.victor().bronze();
                        }
                    } else {
                        gVar3.victor().tango();
                        List list11 = (List) c2492a14.charlie;
                        if (list11 == null) {
                            list2 = CollectionsKt.emptyList();
                        } else {
                            list2 = list11;
                        }
                        Intrinsics.echo(list2, "<set-?>");
                        gVar3.B = list2;
                        Xa.b bVar3 = gVar3.C;
                        if (bVar3 != null) {
                            bVar3.bravo(list11);
                        } else {
                            Intrinsics.lima("adapter");
                            throw null;
                        }
                    }
                } else {
                    gVar3.victor().tango();
                }
                return Unit.INSTANCE;
        }
    }
}
