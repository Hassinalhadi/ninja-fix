package Ac;

import A2.z;
import F.C0103e2;
import I.ak;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.compose.foundation.lazy.layout.as;
import androidx.compose.runtime.C0562a;
import androidx.compose.runtime.C0573f0;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.ad;
import androidx.compose.runtime.av;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.j0;
import androidx.fragment.app.ai;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import bv.aa;
import com.app.network.network.models.AddressNoteListItem;
import com.app.network.network.models.LocalVote;
import com.app.network.network.models.OrderAddress;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.ReasonItem;
import com.app.network.network.models.StartingPoint;
import com.checkout.components.card.CardComponent;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.ui.component.base.InputComponentViewKt;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewKt;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.ui.data.DisplayCvvRepository;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.wallet.GooglePayMediator;
import com.clevertap.android.sdk.network.EndpointId;
import com.clevertap.android.sdk.network.NetworkManager;
import com.clevertap.android.sdk.network.api.SendQueueRequestBody;
import d.C1527e;
import d.C1535i;
import d.InterfaceC1523c;
import d.R0;
import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import fe.C1715g;
import g.AbstractC1719b;
import i.C1855d;
import i.C1860i;
import i.C1862k;
import i.C1874w;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.h0;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;
import pe.AbstractC2327c;
import s0.L;
import t0.C2883A;
import t6.AbstractC3081x3;
import yf.N;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ l(Y1.l lVar, Y1.o oVar, FragmentNavigator fragmentNavigator, ai aiVar) {
        this.alpha = 9;
        this.purple = oVar;
        this.red = fragmentNavigator;
        this.silver = aiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x026e, code lost:
    
        if (r6.isEmpty() == true) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [Cb.b] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Integer num;
        int i4;
        double d4;
        Float longitude;
        Float latitude;
        Integer id2;
        boolean d9;
        Injector a6;
        H6.b a8;
        List check$lambda$1;
        Unit a10;
        Unit a11;
        boolean z2 = true;
        Integer num2 = null;
        Object obj = this.purple;
        Object obj2 = this.silver;
        Object obj3 = this.red;
        switch (this.alpha) {
            case 0:
                ((Function1) obj).invoke(((StartingPoint) obj3).getId());
                ((ax) obj2).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                ((Function1) obj).invoke(r.alpha((r) obj3, (c) obj2, null, null, 6));
                return Unit.INSTANCE;
            case 2:
                ?? r4 = (Cb.b) obj2;
                if (((Cb.b) obj3) != r4) {
                    num2 = r4;
                }
                ((Function1) obj).invoke(num2);
                return Unit.INSTANCE;
            case 3:
                ((ax) obj2).setValue((ReasonItem) obj);
                ((ax) obj3).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 4:
                ReasonItem reasonItem = (ReasonItem) ((ax) obj2).getValue();
                if (reasonItem == null) {
                    ((ax) obj3).setValue(Boolean.TRUE);
                } else {
                    ((Function1) obj).invoke(reasonItem.getValue());
                }
                return Unit.INSTANCE;
            case 5:
                j0 j0Var = (j0) obj3;
                C0562a c0562a = (C0562a) obj;
                if (c0562a != null) {
                    j0Var.alpha(j0Var.charlie(c0562a) - j0Var.tango);
                }
                List alpha = AbstractC3081x3.alpha(j0Var, null, j0Var.tango, null);
                androidx.compose.runtime.tooling.a aVar = (androidx.compose.runtime.tooling.a) CollectionsKt.olive(alpha);
                if (aVar != null) {
                    num = aVar.alpha;
                } else {
                    num = null;
                }
                List teal = ((ak) obj2).teal(num);
                if (num != null && !teal.isEmpty()) {
                    androidx.compose.runtime.tooling.a aVar2 = (androidx.compose.runtime.tooling.a) CollectionsKt.gold(teal);
                    List crimson = CollectionsKt.crimson(teal);
                    aVar2.getClass();
                    teal = CollectionsKt.a(ab.juliet(new androidx.compose.runtime.tooling.a(null, num)), crimson);
                }
                return CollectionsKt.a(alpha, teal);
            case 6:
                K2.p pVar = (K2.p) obj;
                pVar.getClass();
                UUID uuid = (UUID) obj3;
                String uuid2 = uuid.toString();
                z echo = z.echo();
                StringBuilder sb2 = new StringBuilder("Updating progress for ");
                sb2.append(uuid);
                sb2.append(" (");
                A2.j jVar = (A2.j) obj2;
                sb2.append(jVar);
                sb2.append(")");
                String sb3 = sb2.toString();
                String str = K2.p.charlie;
                echo.alpha(str, sb3);
                WorkDatabase workDatabase = pVar.alpha;
                workDatabase.charlie();
                try {
                    J2.p hotel = workDatabase.uniform().hotel(uuid2);
                    if (hotel != null) {
                        if (hotel.bravo == 2) {
                            J2.m mVar = new J2.m(uuid2, jVar);
                            J2.n tango = workDatabase.tango();
                            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) tango.alpha;
                            workDatabase_Impl.bravo();
                            workDatabase_Impl.charlie();
                            try {
                                ((J2.b) tango.purple).oscar(mVar);
                                workDatabase_Impl.papa();
                                workDatabase_Impl.kilo();
                            } catch (Throwable th) {
                                workDatabase_Impl.kilo();
                                throw th;
                            }
                        } else {
                            z.echo().hotel(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                        }
                        workDatabase.papa();
                        return null;
                    }
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } catch (Throwable th2) {
                    try {
                        z.echo().delta(str, "Error updating Worker progress", th2);
                        throw th2;
                    } finally {
                        workDatabase.kilo();
                    }
                }
            case 7:
                int i5 = ProcessOrderActivityV2.f12378N0;
                ProcessOrderActivityV2 processOrderActivityV2 = (ProcessOrderActivityV2) obj;
                if (!processOrderActivityV2.isFinishing() && !processOrderActivityV2.isDestroyed()) {
                    OrderTask orderTask = (OrderTask) obj3;
                    OrderAddress address = orderTask.getAddress();
                    if (address != null && (id2 = address.getId()) != null) {
                        int intValue = id2.intValue();
                        Context lima = processOrderActivityV2.lima();
                        AtomicInteger atomicInteger = L9.d.alpha;
                        Intrinsics.echo(lima, "<this>");
                        List hotel2 = L9.d.hotel(intValue, lima);
                        if (!hotel2.isEmpty()) {
                            if (!hotel2.isEmpty()) {
                                Iterator it = hotel2.iterator();
                                while (it.hasNext()) {
                                    if (((AddressNoteListItem) it.next()).getLocalVote() == LocalVote.DOWN) {
                                    }
                                }
                            }
                            if (Intrinsics.areEqual(orderTask.getCanAddAddressNote(), Boolean.TRUE)) {
                                Context lima2 = processOrderActivityV2.lima();
                                Integer id3 = orderTask.getId();
                                if (id3 != null) {
                                    i4 = id3.intValue();
                                } else {
                                    i4 = -1;
                                }
                                AtomicInteger atomicInteger2 = L9.d.alpha;
                                Intrinsics.echo(lima2, "<this>");
                                lima2.getSharedPreferences("AddressNotesPrefShown", 0).edit().putBoolean("order_complete_dialog_shown_" + i4, true).apply();
                                Intent intent = new Intent(processOrderActivityV2, (Class<?>) AddressNoteActivity.class);
                                OrderAddress address2 = orderTask.getAddress();
                                if (address2 != null) {
                                    num2 = address2.getId();
                                }
                                intent.putExtra("taskAddressId", num2);
                                intent.putExtra("orderTaskId", orderTask.getId());
                                intent.putExtra("KEY_HAS_SKIP", true);
                                OrderAddress address3 = orderTask.getAddress();
                                double d10 = 0.0d;
                                if (address3 != null && (latitude = address3.getLatitude()) != null) {
                                    d4 = latitude.floatValue();
                                } else {
                                    d4 = 0.0d;
                                }
                                intent.putExtra("lat", d4);
                                OrderAddress address4 = orderTask.getAddress();
                                if (address4 != null && (longitude = address4.getLongitude()) != null) {
                                    d10 = longitude.floatValue();
                                }
                                intent.putExtra("lng", d10);
                                intent.putExtra("remainingAddressNoteInputSeconds", (Integer) obj2);
                                processOrderActivityV2.f12416g0.alpha(intent);
                                return Unit.INSTANCE;
                            }
                            processOrderActivityV2.amber(false);
                            return Unit.INSTANCE;
                        }
                    }
                    List list = processOrderActivityV2.f12401R;
                    if (list != null) {
                        break;
                    }
                    processOrderActivityV2.amber(false);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 8:
                I.a aVar3 = (I.a) obj3;
                C0573f0 c0573f0 = (C0573f0) obj2;
                C0585q c0585q = (C0585q) obj;
                I.b bVar = c0585q.gray;
                I.a aVar4 = bVar.bravo;
                try {
                    bVar.bravo = aVar3;
                    C0573f0 c0573f02 = c0585q.coral;
                    int[] iArr = c0585q.oscar;
                    aa aaVar = c0585q.victor;
                    c0585q.oscar = null;
                    c0585q.victor = null;
                    try {
                        c0585q.coral = c0573f0;
                        boolean z10 = bVar.echo;
                        try {
                            bVar.echo = false;
                            throw null;
                        } catch (Throwable th3) {
                            bVar.echo = z10;
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        c0585q.coral = c0573f02;
                        c0585q.oscar = iArr;
                        c0585q.victor = aaVar;
                        throw th4;
                    }
                } catch (Throwable th5) {
                    bVar.bravo = aVar4;
                    throw th5;
                }
            case 9:
                Y1.o oVar = (Y1.o) obj;
                for (Y1.l lVar : (Iterable) ((N) oVar.foxtrot.alpha).getValue()) {
                    ((FragmentNavigator) obj3).getClass();
                    if (FragmentNavigator.november()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + ((ai) obj2) + " viewmodel being cleared");
                    }
                    oVar.charlie(lVar);
                }
                return Unit.INSTANCE;
            case 10:
                return NetworkManager.alpha((NetworkManager) obj, (SendQueueRequestBody) obj3, (EndpointId) obj2);
            case 11:
                C1535i c1535i = (C1535i) obj;
                androidx.compose.foundation.lazy.layout.i iVar = c1535i.silver;
                while (true) {
                    J.e eVar = iVar.alpha;
                    int i10 = eVar.red;
                    if (i10 != 0) {
                        if (i10 != 0) {
                            Z.c cVar = (Z.c) ((C1527e) eVar.alpha[i10 - 1]).alpha.invoke();
                            if (cVar == null) {
                                d9 = true;
                            } else {
                                d9 = c1535i.d(cVar, c1535i.f12001a);
                            }
                            if (d9) {
                                J.e eVar2 = iVar.alpha;
                                ((C1527e) eVar2.mike(eVar2.red - 1)).bravo.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
                            }
                        } else {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                    }
                }
                if (c1535i.white) {
                    Z.c c3 = c1535i.c();
                    if (c3 == null || !c1535i.d(c3, c1535i.f12001a)) {
                        z2 = false;
                    }
                    if (z2) {
                        c1535i.white = false;
                    }
                }
                ((R0) obj3).echo = C1535i.b(c1535i, (InterfaceC1523c) obj2);
                return Unit.INSTANCE;
            case 12:
                C1860i c1860i = (C1860i) ((ad) obj).getValue();
                C1874w c1874w = (C1874w) obj3;
                return new C1862k(c1874w, c1860i, (C1855d) obj2, new as((C1715g) c1874w.echo.foxtrot.getValue(), c1860i));
            case 13:
                k.h hVar = (k.h) obj;
                Z.c b2 = k.h.b(hVar, (L) obj3, (qa.j) obj2);
                if (b2 == null) {
                    return null;
                }
                C1535i c1535i2 = hVar.alpha;
                if (Q0.m.alpha(c1535i2.f12001a, 0L)) {
                    AbstractC1719b.charlie("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return b2.hotel(c1535i2.f(b2, c1535i2.f12001a) ^ (-9223372034707292160L));
            case 14:
                a6 = CardComponent.a((CardComponent) obj, (SupportedSchemesRepository) obj3, (DisplayCvvRepository) obj2);
                return a6;
            case 15:
                a8 = GooglePayMediator.a((GooglePayMediator) obj, (Context) obj3, (Environment) obj2);
                return a8;
            case 16:
                C2883A c2883a = (C2883A) obj2;
                D0.m mVar2 = (D0.m) ((D0.e) obj3).alpha;
                ((h0) obj).getClass();
                if (mVar2 instanceof D0.l) {
                    ((D0.l) mVar2).getClass();
                    try {
                        String str2 = ((D0.l) mVar2).alpha;
                        c2883a.getClass();
                        try {
                            c2883a.alpha.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                        } catch (ActivityNotFoundException e) {
                            throw new IllegalArgumentException(AbstractC2327c.victor('.', "Can't open ", str2), e);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                } else if (mVar2 instanceof D0.k) {
                    ((D0.k) mVar2).getClass();
                }
                return Unit.INSTANCE;
            case 17:
                check$lambda$1 = CertificatePinner.check$lambda$1((CertificatePinner) obj, (List) obj3, (String) obj2);
                return check$lambda$1;
            case 18:
                return ConnectPlan.alpha((CertificatePinner) obj, (Handshake) obj3, (Address) obj2);
            case 19:
                a10 = InputComponentViewKt.a((vf.ab) obj, (C0103e2) obj3, (ax) obj2);
                return a10;
            case 20:
                ((ax) obj2).setValue(Boolean.FALSE);
                ((ax) obj3).setValue(Boolean.TRUE);
                Context context = (Context) obj;
                context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null)).addFlags(268435456));
                return Unit.INSTANCE;
            default:
                a11 = PayButtonViewKt.a((Y.i) obj, (Function0) obj3, (ax) obj2);
                return a11;
        }
    }

    public /* synthetic */ l(C0585q c0585q, I.a aVar, C0573f0 c0573f0, av avVar) {
        this.alpha = 8;
        this.purple = c0585q;
        this.red = aVar;
        this.silver = c0573f0;
    }

    public /* synthetic */ l(Object obj, ax axVar, ax axVar2, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.silver = axVar;
        this.red = axVar2;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }
}
