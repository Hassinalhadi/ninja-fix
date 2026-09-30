package d3;

import android.content.Context;
import com.app.network.network.models.Allocation;
import com.app.network.network.models.AttributeGroup;
import com.app.network.network.models.Captain;
import com.app.network.network.models.Envelop;
import com.app.network.network.models.MissingAttributes;
import com.app.network.network.models.Order;
import com.app.network.network.models.UserInfo;
import com.app.network.network.models.captian.User;
import com.app.network.network.response.DataResponse;
import e3.InterfaceC1627a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import td.C3117a;
import vf.ad;
import vf.ao;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1585a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ k purple;

    public /* synthetic */ C1585a(k kVar, int i4) {
        this.alpha = i4;
        this.purple = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DataResponse dataResponse;
        List items;
        int collectionSizeOrDefault;
        Integer num;
        String str;
        boolean z2;
        String str2;
        int i4;
        User user;
        Captain captain;
        k kVar = this.purple;
        switch (this.alpha) {
            case 0:
                ((Long) obj).getClass();
                kVar.yellow.clear();
                kVar.yankee();
                return Unit.INSTANCE;
            case 1:
                C2492a c2492a = (C2492a) obj;
                if (!kVar.isFinishing() && !kVar.isDestroyed() && !kVar.getSupportFragmentManager().jade()) {
                    if (c2492a.alpha == 1 && (dataResponse = (DataResponse) c2492a.charlie) != null && (items = dataResponse.getItems()) != null && (!items.isEmpty())) {
                        List items2 = dataResponse.getItems();
                        if (items2 != null) {
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(items2, 10);
                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                            Iterator it = items2.iterator();
                            while (it.hasNext()) {
                                Order order = ((Allocation) it.next()).getOrder();
                                if (order != null) {
                                    num = order.getAllocationWindowId();
                                } else {
                                    num = null;
                                }
                                arrayList.add(num);
                            }
                            Iterator it2 = CollectionsKt.D(arrayList).iterator();
                            while (it2.hasNext()) {
                                kVar.white.add(String.valueOf((Integer) it2.next()));
                            }
                        }
                        kVar.cyan();
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            default:
                UserInfo userInfo = (UserInfo) obj;
                if (kVar.f12037b) {
                    InterfaceC1627a quebec = kVar.quebec();
                    if (userInfo != null && (captain = userInfo.getCaptain()) != null) {
                        str = captain.getType();
                    } else {
                        str = null;
                    }
                    String valueOf = String.valueOf(str);
                    AtomicInteger atomicInteger = L9.d.alpha;
                    Context context = ((z9.j) quebec).alpha;
                    Intrinsics.echo(context, "<this>");
                    context.getSharedPreferences("incognia_tracker", 0).edit().putString("incognia_captain_type", valueOf).apply();
                    InterfaceC1627a quebec2 = kVar.quebec();
                    if (userInfo != null) {
                        z2 = Intrinsics.areEqual(userInfo.getIncogniaEventsEnabled(), Boolean.TRUE);
                    } else {
                        z2 = false;
                    }
                    Boolean valueOf2 = Boolean.valueOf(z2);
                    Context context2 = ((z9.j) quebec2).alpha;
                    Intrinsics.echo(context2, "<this>");
                    context2.getSharedPreferences("incognia_tracker", 0).edit().putBoolean("incognia_events_enabled", Intrinsics.areEqual(valueOf2, Boolean.TRUE)).apply();
                    InterfaceC1627a quebec3 = kVar.quebec();
                    Intrinsics.checkNotNull(userInfo);
                    ((z9.j) quebec3).bravo(userInfo);
                    InterfaceC1627a quebec4 = kVar.quebec();
                    Captain captain2 = userInfo.getCaptain();
                    if (captain2 != null && (user = captain2.getUser()) != null) {
                        str2 = user.getProfilePictureUrl();
                    } else {
                        str2 = null;
                    }
                    L9.d.navy(((z9.j) quebec4).alpha, str2);
                    Envelop envelop = userInfo.getEnvelop();
                    if (envelop != null) {
                        i4 = envelop.getEnvelopsCount();
                    } else {
                        i4 = 0;
                    }
                    Context context3 = ((z9.j) kVar.quebec()).alpha;
                    Intrinsics.echo(context3, "<this>");
                    context3.getSharedPreferences("envelope_prefs", 0).edit().putInt("envelops_count", i4).apply();
                    kVar.zulu(i4);
                }
                InterfaceC1627a quebec5 = kVar.quebec();
                Intrinsics.checkNotNull(userInfo);
                ((z9.j) quebec5).bravo(userInfo);
                kVar.f12037b = false;
                MissingAttributes missingAttributes = userInfo.getMissingAttributes();
                if (missingAttributes != null) {
                    L9.d.green(((z9.j) kVar.quebec()).alpha, missingAttributes);
                    List<AttributeGroup> forceGroups = missingAttributes.forceGroups();
                    if (!forceGroups.isEmpty()) {
                        C3117a echo = ad.echo();
                        Cf.e eVar = ao.alpha;
                        ad.zulu(echo, Af.n.alpha, null, new e(kVar, forceGroups, null), 2);
                    }
                } else {
                    L9.d.foxtrot(((z9.j) kVar.quebec()).alpha);
                }
                return Unit.INSTANCE;
        }
    }
}
