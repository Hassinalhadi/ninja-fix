package Cb;

import B2.ap;
import B9.C;
import Y1.ai;
import Y1.aj;
import Y1.ak;
import Y1.at;
import Yb.C0333u0;
import Yb.S;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.L;
import androidx.fragment.app.an;
import androidx.lifecycle.T;
import androidx.lifecycle.az;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bv.al;
import com.app.network.network.models.AppAgreementTypeEnum;
import com.app.network.network.models.Attribute;
import com.app.network.network.models.DeviceInfo;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.SignUpRequest;
import com.checkout.components.redirecthandler.RedirectWebViewExecutor;
import com.checkout.components.redirecthandler.model.RedirectRequest;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.R;
import delivery.samurai.android.notifications.MyFirebaseMessagingService;
import delivery.samurai.android.ui.agreement.Agreement;
import delivery.samurai.android.ui.auth.signup.step3documents.ShareDocumentsFragment;
import delivery.samurai.android.ui.envelopV2.EnvelopsListingActivityV2;
import delivery.samurai.android.ui.envelopV2.EnvelopsViewModelV2;
import delivery.samurai.android.ui.home.HomeViewModel;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import delivery.samurai.android.ui.orders.OrderHistoryFragment;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsViewModel;
import delivery.samurai.android.ui.transfer.TransferCardViewModel;
import i.C1860i;
import i.InterfaceC1869r;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import pf.AbstractC2360j;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import q3.C2407a;
import r1.C2483b;
import r3.C2492a;
import s6.AbstractC2716m6;
import s6.AbstractC2724n5;
import vf.ao;
import yf.AbstractC3428A;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class ad implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ ad(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    private final Object alpha(Object obj) {
        J2.l lVar = (J2.l) this.purple;
        H0.ac acVar = (H0.ac) this.red;
        H0.af afVar = (H0.af) obj;
        synchronized (((r6.u) lVar.alpha)) {
            try {
                if (afVar.echo()) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e3  */
    /* JADX WARN: Type inference failed for: r0v143, types: [Y1.av, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Context context;
        Object obj2;
        Pair pair;
        Object adVar;
        Object invoke;
        Object obj3;
        int i4;
        Typeface echo;
        H0.ae aeVar;
        String str7;
        String concat;
        StringBuilder sb2;
        int i5;
        List list;
        DeviceInfo copy;
        Date date;
        Date date2;
        DeviceInfo copy2;
        Y1.ac acVar;
        List emptyList;
        List<OrderTask> tasks;
        OrderTask orderTask;
        List<String> deliveryProofImages;
        int i10 = 7;
        List list2 = null;
        int i11 = 0;
        boolean z2 = true;
        switch (this.alpha) {
            case 0:
                androidx.compose.runtime.ag DisposableEffect = (androidx.compose.runtime.ag) obj;
                Intrinsics.echo(DisposableEffect, "$this$DisposableEffect");
                return new af(0, (L) this.purple, (String) this.red);
            case 1:
                SignUpRequest request = (SignUpRequest) obj;
                Intrinsics.echo(request, "request");
                C c3 = (C) this.purple;
                Editable text = c3.f89p.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                request.setVehicleSequenceNumber(str);
                Editable text2 = c3.f88o.getText();
                if (text2 != null) {
                    str2 = text2.toString();
                } else {
                    str2 = null;
                }
                request.setVehiclePlateNumber(str2);
                ShareDocumentsFragment shareDocumentsFragment = (ShareDocumentsFragment) this.red;
                Pair pair2 = ((Da.a) shareDocumentsFragment.sierra().getUploadedDocument().getValue()).bravo;
                if (pair2 != null) {
                    str3 = (String) pair2.getSecond();
                } else {
                    str3 = null;
                }
                request.setIdCardSnap(str3);
                Pair pair3 = ((Da.a) shareDocumentsFragment.sierra().getUploadedDocument().getValue()).alpha;
                if (pair3 != null) {
                    str4 = (String) pair3.getSecond();
                } else {
                    str4 = null;
                }
                request.setProfileSnap(str4);
                Pair pair4 = ((Da.a) shareDocumentsFragment.sierra().getUploadedDocument().getValue()).charlie;
                if (pair4 != null) {
                    str5 = (String) pair4.getSecond();
                } else {
                    str5 = null;
                }
                request.setDrivingLicenseSnap(str5);
                Pair pair5 = ((Da.a) shareDocumentsFragment.sierra().getUploadedDocument().getValue()).delta;
                if (pair5 != null) {
                    str6 = (String) pair5.getSecond();
                } else {
                    str6 = null;
                }
                request.setVehicleRegistrationSnap(str6);
                return Unit.INSTANCE;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                Intrinsics.echo(bitmap, "bitmap");
                File file = (File) this.purple;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    Da.q qVar = (Da.q) this.red;
                    Object value = qVar.A.getValue();
                    Intrinsics.checkNotNull(value);
                    HashMap hashMap = (HashMap) value;
                    String str8 = (String) hashMap.get(Integer.valueOf(qVar.f960z));
                    if (str8 != null) {
                        new File(str8).delete();
                    }
                    String absolutePath = file.getAbsolutePath();
                    C3462a.alpha("FILE_SIZE", 12, String.valueOf(new File(absolutePath).length() / Barcode.FORMAT_UPC_E), null);
                    an requireActivity = qVar.requireActivity();
                    Intrinsics.charlie(requireActivity, "null cannot be cast to non-null type android.app.Activity");
                    requireActivity.runOnUiThread(new A2.s(hashMap, qVar, absolutePath, i10));
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC2716m6.alpha(fileOutputStream, th);
                        throw th2;
                    }
                }
            case 3:
                ((Ef.b) this.red).getClass();
                ((Ef.c) this.purple).foxtrot(null);
                return Unit.INSTANCE;
            case 4:
                Gb.m it = (Gb.m) obj;
                int i12 = EnvelopsListingActivityV2.Q;
                Intrinsics.echo(it, "it");
                ((ax) this.red).setValue(it);
                EnvelopsListingActivityV2 envelopsListingActivityV2 = (EnvelopsListingActivityV2) this.purple;
                envelopsListingActivityV2.f12267O = it;
                envelopsListingActivityV2.gold(it);
                return Unit.INSTANCE;
            case 5:
                Throwable th3 = (Throwable) obj;
                Intrinsics.checkNotNull(th3);
                String onHandleError = ((EnvelopsViewModelV2) this.red).onHandleError(th3);
                ((az) this.purple).postValue(com.google.android.material.datepicker.j.november(0, onHandleError, Constants.KEY_MSG, onHandleError));
                return Unit.INSTANCE;
            case 6:
                C2492a c2492a = (C2492a) obj;
                W8.a aVar = Gc.q.A;
                int i13 = c2492a.alpha;
                Gc.q qVar2 = (Gc.q) this.purple;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            qVar2.victor().bronze();
                        }
                    } else {
                        qVar2.victor().tango();
                        d3.k victor = qVar2.victor();
                        String string = qVar2.getString(R.string.notified_message);
                        Intrinsics.delta(string, "getString(...)");
                        L9.d.pink(victor, string);
                        new Handler(Looper.getMainLooper()).post(new Gc.n(qVar2, 0));
                    }
                } else {
                    qVar2.victor().tango();
                    String str9 = c2492a.bravo;
                    if (str9 != null && (context = ((ComposeView) this.red).getContext()) != null) {
                        L9.d.pink(context, str9);
                    }
                }
                return Unit.INSTANCE;
            case 7:
                Bitmap it2 = (Bitmap) obj;
                int i14 = ZenDeskChatActivity.f12498T;
                Intrinsics.echo(it2, "it");
                File file2 = (File) this.purple;
                it2.compress(Bitmap.CompressFormat.JPEG, 70, new FileOutputStream(file2));
                az azVar = ((ZenDeskChatActivity) this.red).f12501J;
                List list3 = (List) azVar.getValue();
                if (list3 != null) {
                    String absolutePath2 = file2.getAbsolutePath();
                    Intrinsics.delta(absolutePath2, "getAbsolutePath(...)");
                    list3.add(absolutePath2);
                    obj2 = list3;
                } else {
                    obj2 = null;
                }
                azVar.postValue(obj2);
                return Unit.INSTANCE;
            case 8:
                H0.l lVar = (H0.l) this.purple;
                H0.ac acVar2 = (H0.ac) this.red;
                Function1 function1 = (Function1) obj;
                H0.q qVar3 = lVar.delta;
                H0.a aVar2 = lVar.alpha;
                Aa.l lVar2 = lVar.foxtrot;
                qVar3.getClass();
                H0.k kVar = acVar2.alpha;
                if (!(kVar instanceof H0.n)) {
                    adVar = null;
                } else {
                    List list4 = ((H0.n) kVar).white;
                    H0.v vVar = acVar2.bravo;
                    int i15 = acVar2.charlie;
                    ArrayList arrayList = new ArrayList(list4.size());
                    int size = list4.size();
                    int i16 = 0;
                    while (i16 < size) {
                        boolean z10 = z2;
                        Object obj4 = list4.get(i16);
                        H0.z zVar = (H0.z) ((H0.i) obj4);
                        if (Intrinsics.areEqual(zVar.bravo, vVar) && zVar.charlie == i15) {
                            arrayList.add(obj4);
                        }
                        i16++;
                        z2 = z10;
                    }
                    boolean z11 = z2;
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list4.size());
                        int size2 = list4.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            Object obj5 = list4.get(i17);
                            if (((H0.z) ((H0.i) obj5)).charlie == i15) {
                                arrayList2.add(obj5);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list4 = arrayList2;
                        }
                        int compareTo = vVar.compareTo(H0.v.purple);
                        int i18 = vVar.alpha;
                        if (compareTo < 0) {
                            int size3 = list4.size();
                            int i19 = 0;
                            H0.v vVar2 = null;
                            H0.v vVar3 = null;
                            while (true) {
                                if (i19 < size3) {
                                    H0.v vVar4 = ((H0.z) ((H0.i) list4.get(i19))).bravo;
                                    int golf = Intrinsics.golf(vVar4.alpha, i18);
                                    int i20 = vVar4.alpha;
                                    if (golf < 0) {
                                        if (vVar2 == null || Intrinsics.golf(i20, vVar2.alpha) > 0) {
                                            vVar2 = vVar4;
                                        }
                                    } else if (Intrinsics.golf(i20, i18) > 0) {
                                        if (vVar3 == null || Intrinsics.golf(i20, vVar3.alpha) < 0) {
                                            vVar3 = vVar4;
                                        }
                                    } else {
                                        vVar2 = vVar4;
                                        vVar3 = vVar2;
                                    }
                                    i19++;
                                }
                            }
                            if (vVar2 == null) {
                                vVar2 = vVar3;
                            }
                            arrayList = new ArrayList(list4.size());
                            int size4 = list4.size();
                            for (int i21 = 0; i21 < size4; i21++) {
                                Object obj6 = list4.get(i21);
                                if (Intrinsics.areEqual(((H0.z) ((H0.i) obj6)).bravo, vVar2)) {
                                    arrayList.add(obj6);
                                }
                            }
                        } else {
                            H0.v vVar5 = H0.v.red;
                            if (vVar.compareTo(vVar5) > 0) {
                                int size5 = list4.size();
                                int i22 = 0;
                                H0.v vVar6 = null;
                                H0.v vVar7 = null;
                                while (true) {
                                    if (i22 < size5) {
                                        H0.v vVar8 = ((H0.z) ((H0.i) list4.get(i22))).bravo;
                                        int golf2 = Intrinsics.golf(vVar8.alpha, i18);
                                        int i23 = vVar8.alpha;
                                        if (golf2 < 0) {
                                            if (vVar6 == null || Intrinsics.golf(i23, vVar6.alpha) > 0) {
                                                vVar6 = vVar8;
                                            }
                                        } else if (Intrinsics.golf(i23, i18) > 0) {
                                            if (vVar7 == null || Intrinsics.golf(i23, vVar7.alpha) < 0) {
                                                vVar7 = vVar8;
                                            }
                                        } else {
                                            vVar6 = vVar8;
                                            vVar7 = vVar6;
                                        }
                                        i22++;
                                    }
                                }
                                if (vVar7 != null) {
                                    vVar6 = vVar7;
                                }
                                arrayList = new ArrayList(list4.size());
                                int size6 = list4.size();
                                for (int i24 = 0; i24 < size6; i24++) {
                                    Object obj7 = list4.get(i24);
                                    if (Intrinsics.areEqual(((H0.z) ((H0.i) obj7)).bravo, vVar6)) {
                                        arrayList.add(obj7);
                                    }
                                }
                            } else {
                                int size7 = list4.size();
                                int i25 = 0;
                                H0.v vVar9 = null;
                                H0.v vVar10 = null;
                                while (true) {
                                    if (i25 < size7) {
                                        H0.v vVar11 = ((H0.z) ((H0.i) list4.get(i25))).bravo;
                                        int i26 = size7;
                                        if (Intrinsics.golf(vVar11.alpha, vVar5.alpha) <= 0) {
                                            int golf3 = Intrinsics.golf(vVar11.alpha, i18);
                                            int i27 = vVar11.alpha;
                                            if (golf3 < 0) {
                                                if (vVar9 == null || Intrinsics.golf(i27, vVar9.alpha) > 0) {
                                                    vVar9 = vVar11;
                                                }
                                            } else if (Intrinsics.golf(i27, i18) > 0) {
                                                if (vVar10 == null || Intrinsics.golf(i27, vVar10.alpha) < 0) {
                                                    vVar10 = vVar11;
                                                }
                                            } else {
                                                vVar9 = vVar11;
                                                vVar10 = vVar9;
                                            }
                                        }
                                        i25++;
                                        size7 = i26;
                                    }
                                }
                                if (vVar10 != null) {
                                    vVar9 = vVar10;
                                }
                                arrayList = new ArrayList(list4.size());
                                int size8 = list4.size();
                                for (int i28 = 0; i28 < size8; i28++) {
                                    Object obj8 = list4.get(i28);
                                    if (Intrinsics.areEqual(((H0.z) ((H0.i) obj8)).bravo, vVar9)) {
                                        arrayList.add(obj8);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    H0.v vVar12 = H0.v.red;
                                    int size9 = list4.size();
                                    int i29 = 0;
                                    H0.v vVar13 = null;
                                    H0.v vVar14 = null;
                                    while (true) {
                                        if (i29 < size9) {
                                            H0.v vVar15 = ((H0.z) ((H0.i) list4.get(i29))).bravo;
                                            if (vVar12 != null) {
                                                i4 = size9;
                                                if (Intrinsics.golf(vVar15.alpha, vVar12.alpha) < 0) {
                                                    continue;
                                                    i29++;
                                                    size9 = i4;
                                                }
                                            } else {
                                                i4 = size9;
                                            }
                                            int golf4 = Intrinsics.golf(vVar15.alpha, i18);
                                            int i30 = vVar15.alpha;
                                            if (golf4 < 0) {
                                                if (vVar13 == null || Intrinsics.golf(i30, vVar13.alpha) > 0) {
                                                    vVar13 = vVar15;
                                                }
                                            } else if (Intrinsics.golf(i30, i18) > 0) {
                                                if (vVar14 == null || Intrinsics.golf(i30, vVar14.alpha) < 0) {
                                                    vVar14 = vVar15;
                                                }
                                            } else {
                                                vVar13 = vVar15;
                                                vVar14 = vVar13;
                                            }
                                            i29++;
                                            size9 = i4;
                                        }
                                    }
                                    if (vVar14 != null) {
                                        vVar13 = vVar14;
                                    }
                                    arrayList = new ArrayList(list4.size());
                                    int size10 = list4.size();
                                    for (int i31 = 0; i31 < size10; i31++) {
                                        Object obj9 = list4.get(i31);
                                        if (Intrinsics.areEqual(((H0.z) ((H0.i) obj9)).bravo, vVar13)) {
                                            arrayList.add(obj9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    J2.t tVar = qVar3.alpha;
                    if (arrayList.size() > 0) {
                        H0.i iVar = (H0.i) arrayList.get(0);
                        ((H0.z) iVar).getClass();
                        synchronized (((r6.u) tVar.red)) {
                            try {
                                aVar2.getClass();
                                H0.f fVar = new H0.f(iVar);
                                H0.e eVar = (H0.e) ((bv.w) tVar.alpha).charlie(fVar);
                                if (eVar == null) {
                                    eVar = (H0.e) ((al) tVar.purple).golf(fVar);
                                }
                                if (eVar != null) {
                                    obj3 = eVar.alpha;
                                } else {
                                    try {
                                        invoke = aVar2.golf(iVar);
                                    } catch (Exception unused) {
                                        invoke = lVar2.invoke(acVar2);
                                    }
                                    J2.t.uniform(tVar, iVar, aVar2, invoke);
                                    obj3 = invoke;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        if (obj3 == null) {
                            obj3 = lVar2.invoke(acVar2);
                        }
                        pair = new Pair(null, AbstractC2724n5.bravo(acVar2.delta, obj3, iVar, acVar2.bravo, acVar2.charlie));
                    } else {
                        pair = new Pair(null, lVar2.invoke(acVar2));
                    }
                    List list5 = (List) pair.first;
                    Object obj10 = pair.second;
                    if (list5 == null) {
                        adVar = new H0.ae(obj10, z11);
                    } else {
                        H0.d dVar = new H0.d(list5, obj10, acVar2, qVar3.alpha, function1, aVar2);
                        vf.ad.zulu(qVar3.bravo, null, vf.ac.silver, new H0.o(dVar, null), z11 ? 1 : 0);
                        adVar = new H0.ad(dVar);
                    }
                }
                if (adVar == null) {
                    Aa.m mVar = lVar.echo;
                    mVar.getClass();
                    H0.k kVar2 = acVar2.alpha;
                    H0.y yVar = (H0.y) mVar.purple;
                    int i32 = acVar2.charlie;
                    H0.v vVar16 = acVar2.bravo;
                    if (kVar2 != null && !(kVar2 instanceof H0.g)) {
                        if (kVar2 instanceof H0.x) {
                            echo = yVar.charlie((H0.x) kVar2, vVar16, i32);
                        } else {
                            aeVar = null;
                            if (aeVar == null) {
                                return aeVar;
                            }
                            throw new IllegalStateException("Could not load font");
                        }
                    } else {
                        echo = yVar.echo(vVar16, i32);
                    }
                    aeVar = new H0.ae(echo, true);
                    if (aeVar == null) {
                    }
                } else {
                    return adVar;
                }
                break;
            case 9:
                return alpha(obj);
            case 10:
                Throwable th5 = (Throwable) obj;
                Intrinsics.checkNotNull(th5);
                String onHandleError2 = ((HomeViewModel) this.red).onHandleError(th5);
                ((az) this.purple).postValue(com.google.android.material.datepicker.j.november(0, onHandleError2, Constants.KEY_MSG, onHandleError2));
                return Unit.INSTANCE;
            case 11:
                I0.g gVar = (I0.g) obj;
                if (((I0.g) this.purple) == gVar) {
                    str7 = " > ";
                } else {
                    str7 = "   ";
                }
                StringBuilder tango = Q0.c.tango(str7);
                ((I0.h) this.red).getClass();
                if (gVar instanceof I0.a) {
                    sb2 = new StringBuilder("CommitTextCommand(text.length=");
                    I0.a aVar3 = (I0.a) gVar;
                    sb2.append(aVar3.alpha.purple.length());
                    sb2.append(", newCursorPosition=");
                    i5 = aVar3.bravo;
                } else if (gVar instanceof I0.y) {
                    sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
                    I0.y yVar2 = (I0.y) gVar;
                    sb2.append(yVar2.alpha.purple.length());
                    sb2.append(", newCursorPosition=");
                    i5 = yVar2.bravo;
                } else {
                    if (gVar instanceof I0.x) {
                        concat = ((I0.x) gVar).toString();
                    } else if (gVar instanceof I0.e) {
                        concat = ((I0.e) gVar).toString();
                    } else if (gVar instanceof I0.f) {
                        concat = ((I0.f) gVar).toString();
                    } else if (gVar instanceof I0.z) {
                        concat = ((I0.z) gVar).toString();
                    } else if (gVar instanceof I0.j) {
                        ((I0.j) gVar).getClass();
                        concat = "FinishComposingTextCommand()";
                    } else if (gVar instanceof I0.d) {
                        ((I0.d) gVar).getClass();
                        concat = "DeleteAllCommand()";
                    } else {
                        String kilo = kotlin.jvm.internal.u.alpha.bravo(gVar.getClass()).kilo();
                        if (kilo == null) {
                            kilo = "{anonymous EditCommand}";
                        }
                        concat = "Unknown EditCommand: ".concat(kilo);
                    }
                    tango.append(concat);
                    return tango.toString();
                }
                concat = Q0.c.quebec(sb2, i5, ')');
                tango.append(concat);
                return tango.toString();
            case 12:
                C2492a c2492a2 = (C2492a) obj;
                int i33 = HomeActivityV2.f12269k0;
                int i34 = c2492a2.alpha;
                HomeActivityV2 homeActivityV2 = (HomeActivityV2) this.purple;
                if (i34 != 0) {
                    if (i34 == 1 && (list = (List) c2492a2.charlie) != null && !list.isEmpty()) {
                        AppAgreementTypeEnum appAgreementTypeEnum = (AppAgreementTypeEnum) this.red;
                        String india = new com.google.gson.l().india((ArrayList) list);
                        Intent intent = new Intent(homeActivityV2, (Class<?>) Agreement.class);
                        intent.putExtra("agreements", india);
                        intent.putExtra("agreement_type", appAgreementTypeEnum);
                        homeActivityV2.startActivity(intent);
                    }
                } else {
                    String string2 = homeActivityV2.getString(R.string.error_message);
                    Intrinsics.delta(string2, "getString(...)");
                    L9.d.pink(homeActivityV2, string2);
                }
                return Unit.INSTANCE;
            case 13:
                AndroidApp androidApp = ((HomeViewModelV2) this.purple).alpha;
                copy = r2.copy((r32 & 1) != 0 ? r2.deviceType : null, (r32 & 2) != 0 ? r2.appBuild : null, (r32 & 4) != 0 ? r2.installationUid : null, (r32 & 8) != 0 ? r2.os : null, (r32 & 16) != 0 ? r2.appVersion : null, (r32 & 32) != 0 ? r2.deviceManufacturer : null, (r32 & 64) != 0 ? r2.deviceModel : null, (r32 & 128) != 0 ? r2.bundleId : null, (r32 & Barcode.FORMAT_QR_CODE) != 0 ? r2.fcmToken : null, (r32 & 512) != 0 ? r2.apnToken : null, (r32 & Barcode.FORMAT_UPC_E) != 0 ? r2.mac : null, (r32 & 2048) != 0 ? r2.androidId : null, (r32 & 4096) != 0 ? r2.cleverTapId : null, (r32 & 8192) != 0 ? r2.language : ((DeviceInfo) this.red).getLanguage(), (r32 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? ((DeviceInfo) obj).locationPermissionAllowed : null);
                L9.d.fuchsia(androidApp, copy);
                return Unit.INSTANCE;
            case 14:
                String it3 = (String) obj;
                Intrinsics.echo(it3, "it");
                String key = ((Attribute) this.red).getKey();
                if (key == null) {
                    key = "";
                }
                ((Xd.l) this.purple).invoke(key, it3);
                return Unit.INSTANCE;
            case 15:
                Intrinsics.echo((String) obj, "it");
                return AbstractC3428A.charlie(((N9.i) this.purple).alpha((C2407a) this.red));
            case 16:
                Bitmap it4 = (Bitmap) obj;
                Intrinsics.echo(it4, "it");
                File file3 = (File) this.purple;
                it4.compress(Bitmap.CompressFormat.JPEG, 70, new FileOutputStream(file3));
                TicketDetailsViewModel romeo = ((TicketDetailsFragment) this.red).romeo();
                String absolutePath3 = file3.getAbsolutePath();
                Intrinsics.delta(absolutePath3, "getAbsolutePath(...)");
                az azVar2 = romeo.foxtrot;
                List list6 = (List) azVar2.getValue();
                if (list6 != null) {
                    list6.add(absolutePath3);
                    list2 = list6;
                }
                azVar2.postValue(list2);
                return Unit.INSTANCE;
            case 17:
                C2483b c2483b = (C2483b) obj;
                Long l10 = (Long) c2483b.alpha;
                OrderHistoryFragment orderHistoryFragment = (OrderHistoryFragment) this.purple;
                if (l10 != null) {
                    date = new Date(l10.longValue());
                } else {
                    date = orderHistoryFragment.f12338f;
                }
                orderHistoryFragment.f12338f = date;
                Long l11 = (Long) c2483b.bravo;
                if (l11 != null) {
                    date2 = new Date(l11.longValue());
                } else {
                    date2 = orderHistoryFragment.f12340h;
                }
                orderHistoryFragment.f12340h = date2;
                ((SwipeRefreshLayout) orderHistoryFragment.romeo().delta).setRefreshing(true);
                orderHistoryFragment.f12342j = 0;
                orderHistoryFragment.quebec();
                ((View) this.red).setSelected(true);
                return Unit.INSTANCE;
            case 18:
                Throwable th6 = (Throwable) obj;
                Intrinsics.checkNotNull(th6);
                String onHandleError3 = ((TransferCardViewModel) this.red).onHandleError(th6);
                ((az) this.purple).postValue(com.google.android.material.datepicker.j.november(0, onHandleError3, Constants.KEY_MSG, onHandleError3));
                return Unit.INSTANCE;
            case 19:
                int i35 = MyFirebaseMessagingService.yellow;
                Application application = ((MyFirebaseMessagingService) this.purple).getApplication();
                Intrinsics.charlie(application, "null cannot be cast to non-null type delivery.samurai.android.AndroidApp");
                copy2 = r2.copy((r32 & 1) != 0 ? r2.deviceType : null, (r32 & 2) != 0 ? r2.appBuild : null, (r32 & 4) != 0 ? r2.installationUid : null, (r32 & 8) != 0 ? r2.os : null, (r32 & 16) != 0 ? r2.appVersion : null, (r32 & 32) != 0 ? r2.deviceManufacturer : null, (r32 & 64) != 0 ? r2.deviceModel : null, (r32 & 128) != 0 ? r2.bundleId : null, (r32 & Barcode.FORMAT_QR_CODE) != 0 ? r2.fcmToken : null, (r32 & 512) != 0 ? r2.apnToken : null, (r32 & Barcode.FORMAT_UPC_E) != 0 ? r2.mac : null, (r32 & 2048) != 0 ? r2.androidId : null, (r32 & 4096) != 0 ? r2.cleverTapId : null, (r32 & 8192) != 0 ? r2.language : ((DeviceInfo) this.red).getLanguage(), (r32 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? ((DeviceInfo) obj).locationPermissionAllowed : null);
                L9.d.fuchsia((AndroidApp) application, copy2);
                return Unit.INSTANCE;
            case 20:
                ak navOptions = (ak) obj;
                Intrinsics.echo(navOptions, "$this$navOptions");
                ai aiVar = navOptions.alpha;
                aiVar.foxtrot = 0;
                aiVar.golf = 0;
                aiVar.hotel = -1;
                aiVar.india = -1;
                Y1.aa aaVar = (Y1.aa) this.purple;
                if (aaVar instanceof Y1.ac) {
                    int i36 = Y1.aa.white;
                    Iterator it5 = Y1.y.bravo(aaVar).iterator();
                    while (true) {
                        boolean hasNext = it5.hasNext();
                        Y1.r rVar = (Y1.r) this.red;
                        if (hasNext) {
                            Y1.aa aaVar2 = (Y1.aa) it5.next();
                            Y1.aa foxtrot = rVar.bravo.foxtrot();
                            if (foxtrot != null) {
                                acVar = foxtrot.red;
                            } else {
                                acVar = null;
                            }
                            if (Intrinsics.areEqual(aaVar2, acVar)) {
                            }
                        } else {
                            int i37 = Y1.ac.f2266a;
                            navOptions.delta = ((Y1.aa) AbstractC2360j.november(AbstractC2360j.lima(rVar.bravo.golf(), new X9.i(i10)))).purple.charlie;
                            navOptions.echo = false;
                            ?? obj11 = new Object();
                            obj11.bravo = true;
                            navOptions.echo = obj11.alpha;
                            navOptions.foxtrot = obj11.bravo;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 21:
                Y1.l backStackEntry = (Y1.l) obj;
                Intrinsics.echo(backStackEntry, "backStackEntry");
                Y1.aa aaVar3 = backStackEntry.purple;
                if (aaVar3 != null) {
                    i11 = 1;
                }
                if (i11 == 0) {
                    aaVar3 = null;
                }
                if (aaVar3 == null) {
                    return null;
                }
                androidx.navigation.internal.d dVar2 = backStackEntry.f2268a;
                Bundle alpha = dVar2.alpha();
                aj ajVar = (aj) this.red;
                at atVar = (at) this.purple;
                Y1.aa charlie = atVar.charlie(aaVar3, alpha, ajVar);
                if (charlie == null) {
                    return null;
                }
                if (Intrinsics.areEqual(charlie, aaVar3)) {
                    return backStackEntry;
                }
                return atVar.bravo().bravo(charlie, charlie.bravo(dVar2.alpha()));
            case 22:
                return Boolean.valueOf(RedirectWebViewExecutor.bravo((RedirectWebViewExecutor) this.purple, (RedirectRequest) this.red, (String) obj));
            case 23:
                File file4 = (File) obj;
                Yb.ag agVar = (Yb.ag) this.purple;
                agVar.echo = true;
                OrderTask orderTask2 = (OrderTask) this.red;
                List<String> deliveryProofImages2 = orderTask2.getDeliveryProofImages();
                if (deliveryProofImages2 == null || (emptyList = CollectionsKt.z(deliveryProofImages2)) == null) {
                    emptyList = CollectionsKt.emptyList();
                }
                w.o oVar = agVar.alpha;
                C0333u0 c0333u0 = (C0333u0) oVar.purple;
                androidx.lifecycle.ag foxtrot2 = T.foxtrot(c0333u0.alpha);
                Cf.e eVar2 = ao.alpha;
                vf.ad.zulu(foxtrot2, Cf.d.purple, null, new Yb.af(emptyList, file4, null), 2);
                String absolutePath4 = file4.getAbsolutePath();
                Intrinsics.delta(absolutePath4, "getAbsolutePath(...)");
                orderTask2.setDeliveryProofImages(CollectionsKt.white(absolutePath4));
                ProcessOrderActivityV2 processOrderActivityV2 = c0333u0.alpha;
                String id2 = orderTask2.generateImageId();
                String absolutePath5 = file4.getAbsolutePath();
                Intrinsics.delta(absolutePath5, "getAbsolutePath(...)");
                AtomicInteger atomicInteger = L9.d.alpha;
                Intrinsics.echo(id2, "id");
                L9.k.golf(processOrderActivityV2).edit().putString(id2, absolutePath5).apply();
                ProcessOrderActivityV2 processOrderActivityV22 = (ProcessOrderActivityV2) oVar.red;
                t0 t0Var = (t0) processOrderActivityV22.f12428s0;
                t0Var.setValue(Integer.valueOf(((Number) t0Var.getValue()).intValue() + 1));
                Order order = processOrderActivityV22.f12418i0;
                if (order != null) {
                    List<OrderTask> tasks2 = order.getTasks();
                    if (tasks2 != null) {
                        Iterator<OrderTask> it6 = tasks2.iterator();
                        while (it6.hasNext()) {
                            if (!Intrinsics.areEqual(it6.next().getId(), orderTask2.getId())) {
                                i11++;
                            } else if (i11 != -1 && i11 >= 0 && (tasks = order.getTasks()) != null && (orderTask = tasks.get(i11)) != null) {
                                deliveryProofImages = orderTask2.getDeliveryProofImages();
                                if (deliveryProofImages != null) {
                                    list2 = CollectionsKt.B(deliveryProofImages);
                                }
                                orderTask.setDeliveryProofImages(list2);
                            }
                        }
                    }
                    i11 = -1;
                    if (i11 != -1) {
                        deliveryProofImages = orderTask2.getDeliveryProofImages();
                        if (deliveryProofImages != null) {
                        }
                        orderTask.setDeliveryProofImages(list2);
                    }
                }
                agVar.alpha();
                return Unit.INSTANCE;
            case 24:
                S s3 = (S) this.purple;
                s3.delta = true;
                s3.alpha.xray((File) obj, (OrderTask) this.red);
                s3.alpha();
                return Unit.INSTANCE;
            case 25:
                String imagePath = (String) obj;
                int i38 = ProcessOrderActivityV2.f12378N0;
                Intrinsics.echo(imagePath, "imagePath");
                String taskImageId = ((OrderTask) this.red).generateImageId();
                AtomicInteger atomicInteger2 = L9.d.alpha;
                ProcessOrderActivityV2 processOrderActivityV23 = (ProcessOrderActivityV2) this.purple;
                Intrinsics.echo(processOrderActivityV23, "<this>");
                Intrinsics.echo(taskImageId, "taskImageId");
                L9.d.plum(processOrderActivityV23).edit().putString(taskImageId.concat("_proof"), imagePath).apply();
                t0 t0Var2 = (t0) processOrderActivityV23.f12428s0;
                t0Var2.setValue(Integer.valueOf(((Number) t0Var2.getValue()).intValue() + 1));
                return Unit.INSTANCE;
            case 26:
                AbstractC2366B layout = (AbstractC2366B) obj;
                Intrinsics.echo(layout, "$this$layout");
                AbstractC2367C abstractC2367C = (AbstractC2367C) this.purple;
                AbstractC2366B.juliet(layout, abstractC2367C, 0, 0);
                AbstractC2366B.juliet(layout, (AbstractC2367C) this.red, 0, abstractC2367C.purple);
                return Unit.INSTANCE;
            case 27:
                Z9.d dVar3 = (Z9.d) this.purple;
                Function1 function12 = (Function1) this.red;
                Throwable err = (Throwable) obj;
                Intrinsics.echo(err, "err");
                Z9.c cVar = dVar3.bravo;
                String simpleName = err.getClass().getSimpleName();
                Z9.e eVar3 = cVar.bravo;
                eVar3.bravo.incrementAndGet();
                eVar3.delta = simpleName;
                function12.invoke(err);
                return Unit.INSTANCE;
            case 28:
                InterfaceC1869r LazyRow = (InterfaceC1869r) obj;
                Intrinsics.echo(LazyRow, "$this$LazyRow");
                X9.i iVar2 = new X9.i(19);
                ArrayList arrayList3 = (ArrayList) this.purple;
                int size11 = arrayList3.size();
                ap apVar = new ap(14, iVar2, arrayList3);
                ap apVar2 = new ap(15, Za.d.alpha, arrayList3);
                float f5 = ob.n.alpha;
                ((C1860i) LazyRow).quebec(size11, apVar, apVar2, new P.d(new U.b(arrayList3, (C2093f) this.red), -632812321, true));
                return Unit.INSTANCE;
            default:
                ((Y1.ag) this.purple).hotel((androidx.lifecycle.al) this.red);
                return new Object();
        }
    }

    public /* synthetic */ ad(ArrayList arrayList, C2093f c2093f) {
        this.alpha = 28;
        float f5 = ob.n.alpha;
        this.purple = arrayList;
        this.red = c2093f;
    }
}
