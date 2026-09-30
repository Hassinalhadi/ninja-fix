package t6;

import F.AbstractC0141o0;
import Yb.C0329s0;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cb.C0838c;
import com.app.network.network.models.AddressNoteListItem;
import com.app.network.network.models.AddressNoteListItemKt;
import com.app.network.network.models.Attachment;
import com.app.network.network.models.Country;
import com.app.network.network.models.Currency;
import com.app.network.network.models.Item;
import com.app.network.network.models.LocalVote;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderAddress;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.OwnerType;
import com.app.network.network.models.Platform;
import com.app.network.network.models.TaskStatus;
import com.app.network.network.models.TaskType;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import fc.C1708c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ob.AbstractC2213f;
import okhttp3.internal.http2.Http2;
import r3.C2492a;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2672h7;
import s6.AbstractC2772t0;
import s6.X4;
import t6.AbstractC3041p2;

/* renamed from: t6.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3041p2 {
    public static final /* synthetic */ int alpha = 0;

    public static final void alpha(List list, int i4, OrderTask orderTask, C0329s0 c0329s0, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        int i11;
        int i12;
        boolean z2;
        List list2;
        final int i13;
        OrderTask orderTask2;
        final C0329s0 c0329s02;
        int i14;
        boolean z10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(576222789);
        if (c0585q.india(list)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i15 = i10 | i5;
        if (c0585q.echo(i4)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i16 = i15 | i11;
        if (c0585q.golf(c0329s0)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i17 = i16 | i12;
        boolean z11 = false;
        if ((i17 & 1043) != 1042) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i17 & 1, z2)) {
            if (list.isEmpty()) {
                androidx.compose.runtime.Q uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new Yb.ap(list, i4, orderTask, c0329s0, i5, 0);
                    return;
                }
                return;
            }
            list2 = list;
            i13 = i4;
            orderTask2 = orderTask;
            c0329s02 = c0329s0;
            i14 = i5;
            AddressNoteListItemKt.attachNoteNumbers(list2);
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new X9.i(13);
                c0585q.f(jade);
            }
            Function1 function1 = (Function1) jade;
            if ((i17 & 7168) != 2048) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((i17 & 112) == 32) {
                z11 = true;
            }
            boolean z12 = z10 | z11;
            Object jade2 = c0585q.jade();
            if (z12 || jade2 == asVar) {
                jade2 = new Xd.m() { // from class: Yb.ar
                    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
                    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                    @Override // Xd.m
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Integer num;
                        LocalVote vote;
                        int collectionSizeOrDefault;
                        LocalVote localVote;
                        ArrayList arrayList;
                        AddressNoteListItem copy;
                        boolean z13;
                        List<OrderTask> tasks;
                        Object obj4;
                        OrderAddress address;
                        int intValue = ((Integer) obj).intValue();
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        OwnerType owner = (OwnerType) obj3;
                        Intrinsics.echo(owner, "owner");
                        C0329s0 c0329s03 = C0329s0.this;
                        if (c0329s03 != null) {
                            int i18 = i13;
                            c0329s03.getClass();
                            Intrinsics.echo(owner, "owner");
                            C0329s0 host = c0329s03.alpha.f12385G0;
                            Intrinsics.echo(host, "host");
                            ProcessOrderActivityV2 processOrderActivityV2 = host.alpha;
                            Order order = processOrderActivityV2.f12418i0;
                            if (order != null && (tasks = order.getTasks()) != null) {
                                Iterator<T> it = tasks.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        Integer id2 = ((OrderTask) obj4).getId();
                                        if (id2 != null && id2.intValue() == i18) {
                                            break;
                                        }
                                    } else {
                                        obj4 = null;
                                        break;
                                    }
                                }
                                OrderTask orderTask3 = (OrderTask) obj4;
                                if (orderTask3 != null && (address = orderTask3.getAddress()) != null) {
                                    num = address.getId();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        if (booleanValue) {
                                            vote = LocalVote.UP;
                                        } else {
                                            vote = LocalVote.DOWN;
                                        }
                                        AtomicInteger atomicInteger = L9.d.alpha;
                                        Intrinsics.echo(vote, "vote");
                                        List<AddressNoteListItem> hotel = L9.d.hotel(intValue2, processOrderActivityV2);
                                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(hotel, 10);
                                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                                        for (AddressNoteListItem addressNoteListItem : hotel) {
                                            List<Attachment> attachments = addressNoteListItem.getAttachments();
                                            if (attachments == null) {
                                                attachments = CollectionsKt.emptyList();
                                            }
                                            LocalVote localVote2 = addressNoteListItem.getLocalVote();
                                            if (localVote2 == null) {
                                                localVote2 = LocalVote.NONE;
                                            }
                                            LocalVote localVote3 = localVote2;
                                            if (addressNoteListItem.getId() == intValue) {
                                                if (vote == LocalVote.UP) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                LocalVote localVote4 = vote;
                                                arrayList = arrayList2;
                                                copy = addressNoteListItem.copy((r34 & 1) != 0 ? addressNoteListItem.attachments : attachments, (r34 & 2) != 0 ? addressNoteListItem.createdAt : null, (r34 & 4) != 0 ? addressNoteListItem.description : null, (r34 & 8) != 0 ? addressNoteListItem.id : 0, (r34 & 16) != 0 ? addressNoteListItem.languageCode : null, (r34 & 32) != 0 ? addressNoteListItem.taskAddressId : 0, (r34 & 64) != 0 ? addressNoteListItem.latitude : null, (r34 & 128) != 0 ? addressNoteListItem.longitude : null, (r34 & Barcode.FORMAT_QR_CODE) != 0 ? addressNoteListItem.upVotes : 0, (r34 & 512) != 0 ? addressNoteListItem.downVotes : 0, (r34 & Barcode.FORMAT_UPC_E) != 0 ? addressNoteListItem.ownerType : null, (r34 & 2048) != 0 ? addressNoteListItem.isVoted : z13, (r34 & 4096) != 0 ? addressNoteListItem.localVote : localVote4, (r34 & 8192) != 0 ? addressNoteListItem.netRating : 0, (r34 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? addressNoteListItem.noteNumber : 0, (r34 & 32768) != 0 ? addressNoteListItem.totalNotes : 0);
                                                localVote = localVote4;
                                            } else {
                                                List<Attachment> list3 = attachments;
                                                localVote = vote;
                                                arrayList = arrayList2;
                                                copy = addressNoteListItem.copy((r34 & 1) != 0 ? addressNoteListItem.attachments : list3, (r34 & 2) != 0 ? addressNoteListItem.createdAt : null, (r34 & 4) != 0 ? addressNoteListItem.description : null, (r34 & 8) != 0 ? addressNoteListItem.id : 0, (r34 & 16) != 0 ? addressNoteListItem.languageCode : null, (r34 & 32) != 0 ? addressNoteListItem.taskAddressId : 0, (r34 & 64) != 0 ? addressNoteListItem.latitude : null, (r34 & 128) != 0 ? addressNoteListItem.longitude : null, (r34 & Barcode.FORMAT_QR_CODE) != 0 ? addressNoteListItem.upVotes : 0, (r34 & 512) != 0 ? addressNoteListItem.downVotes : 0, (r34 & Barcode.FORMAT_UPC_E) != 0 ? addressNoteListItem.ownerType : null, (r34 & 2048) != 0 ? addressNoteListItem.isVoted : false, (r34 & 4096) != 0 ? addressNoteListItem.localVote : localVote3, (r34 & 8192) != 0 ? addressNoteListItem.netRating : 0, (r34 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? addressNoteListItem.noteNumber : 0, (r34 & 32768) != 0 ? addressNoteListItem.totalNotes : 0);
                                            }
                                            arrayList.add(copy);
                                            arrayList2 = arrayList;
                                            vote = localVote;
                                        }
                                        ArrayList arrayList3 = arrayList2;
                                        L9.d.cyan(intValue2, processOrderActivityV2, arrayList3);
                                        if (arrayList3.isEmpty()) {
                                            List notes = CollectionsKt.emptyList();
                                            Intrinsics.echo(notes, "notes");
                                            processOrderActivityV2.f12381C0.put(Integer.valueOf(i18), notes);
                                        } else {
                                            processOrderActivityV2.f12381C0.put(Integer.valueOf(i18), arrayList3);
                                        }
                                        Ac.k kVar = new Ac.k(19, host);
                                        AllAddressNoteViewModel allAddressNoteViewModel = (AllAddressNoteViewModel) processOrderActivityV2.v0.getValue();
                                        ?? auVar = new androidx.lifecycle.au(new C2492a(2, "loading"));
                                        V1.a hotel2 = androidx.lifecycle.T.hotel(allAddressNoteViewModel);
                                        Cf.e eVar = vf.ao.alpha;
                                        vf.ad.zulu(hotel2, Cf.d.purple, null, new Xb.h(booleanValue, allAddressNoteViewModel, intValue, owner, auVar, null), 2);
                                        auVar.observe(processOrderActivityV2, new Dc.t(14, new Ya.c(4, kVar)));
                                    }
                                }
                            }
                            num = null;
                            if (num != null) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                c0585q.f(jade2);
            }
            Xd.m mVar = (Xd.m) jade2;
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = new Vc.i(18);
                c0585q.f(jade3);
            }
            cc.g.charlie(list2, function1, mVar, (Function0) jade3, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(T.p.alpha, 1.0f), 0.0f, 8, 1), c0585q, (i17 & 14) | 221616);
        } else {
            list2 = list;
            i13 = i4;
            orderTask2 = orderTask;
            c0329s02 = c0329s0;
            i14 = i5;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Yb.ap(list2, i13, orderTask2, c0329s02, i14, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11.jade(), java.lang.Integer.valueOf(r8)) == false) goto L168;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x076d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(final OrderTask orderTask, final Order order, final List notes, final int i4, final int i5, final Map expandedByTaskId, final boolean z2, final boolean z10, final C0329s0 c0329s0, final Function1 onCallCustomer, T.s sVar, final Set set, final Xd.l lVar, final int i10, final Long l10, final double d4, final double d9, final Function0 function0, InterfaceC0581m interfaceC0581m, final int i11, final int i12) {
        int i13;
        C0585q c0585q;
        T.s sVar2;
        boolean z11;
        T.p pVar;
        androidx.compose.runtime.as asVar;
        int i14;
        boolean z12;
        C0585q c0585q2;
        int i15;
        char c3;
        Za.c cVar;
        C2549i c2549i;
        TaskStatus taskStatus;
        boolean z13;
        String str;
        C2549i c2549i2;
        T.i iVar;
        int i16;
        Context context;
        C0537c c0537c;
        C2550j c2550j;
        C2549i c2549i3;
        TaskStatus taskStatus2;
        androidx.compose.runtime.as asVar2;
        boolean z14;
        T.p pVar2;
        boolean z15;
        C2550j c2550j2;
        Object[] objArr;
        TaskStatus taskStatus3;
        Object[] objArr2;
        OrderTask orderTask2;
        C2549i c2549i4;
        final P.d dVar;
        C0329s0 c0329s02;
        C2549i c2549i5;
        P.d dVar2;
        C2549i c2549i6;
        int i17;
        OrderTask orderTask3;
        boolean z16;
        androidx.compose.runtime.as asVar3;
        Function0 function02;
        P.d dVar3;
        boolean india;
        Object jade;
        Context context2;
        boolean india2;
        Object jade2;
        boolean india3;
        Object jade3;
        Country country;
        Currency currency;
        Object orDefault;
        Intrinsics.echo(notes, "notes");
        Intrinsics.echo(expandedByTaskId, "expandedByTaskId");
        Intrinsics.echo(onCallCustomer, "onCallCustomer");
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(-160878035);
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0585q3.india(orderTask) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0585q3.india(order) ? 32 : 16;
        }
        int i18 = i13 | (c0585q3.india(notes) ? 256 : 128);
        boolean echo = c0585q3.echo(i4);
        int i19 = Barcode.FORMAT_UPC_E;
        int i20 = i18 | (echo ? 2048 : 1024);
        if ((i11 & 24576) == 0) {
            i20 |= c0585q3.echo(i5) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i20 |= c0585q3.india(expandedByTaskId) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i20 |= c0585q3.hotel(z2) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i20 |= c0585q3.hotel(z10) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i20 |= (i11 & 134217728) == 0 ? c0585q3.golf(c0329s0) : c0585q3.india(c0329s0) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i20 |= c0585q3.india(onCallCustomer) ? 536870912 : 268435456;
        }
        int i21 = i20;
        int i22 = i12 | 6;
        if ((i12 & 48) == 0) {
            i22 |= c0585q3.india(set) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i22 |= c0585q3.india(lVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            if (c0585q3.echo(i10)) {
                i19 = 2048;
            }
            i22 |= i19;
        }
        if ((i12 & 24576) == 0) {
            i22 |= c0585q3.golf(l10) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i22 |= c0585q3.charlie(d4) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i22 |= c0585q3.charlie(d9) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i22 |= c0585q3.india(function0) ? 8388608 : 4194304;
        }
        int i23 = i22;
        if (c0585q3.magenta(i21 & 1, ((i21 & 306783379) == 306783378 && (4793491 & i23) == 4793490) ? false : true)) {
            T.p pVar3 = T.p.alpha;
            androidx.compose.runtime.as asVar4 = C0580l.alpha;
            Context context3 = (Context) c0585q3.kilo(AndroidCompositionLocals_androidKt.bravo);
            Integer id2 = orderTask.getId();
            if (id2 != null) {
                int intValue = id2.intValue();
                if (z10) {
                    orDefault = expandedByTaskId.getOrDefault(id2, Boolean.valueOf(z2));
                    z11 = ((Boolean) orDefault).booleanValue();
                } else {
                    z11 = false;
                }
                boolean bravo = AbstractC2772t0.bravo(c0585q3);
                boolean z17 = z11;
                boolean golf = c0585q3.golf(orderTask) | c0585q3.golf(order) | c0585q3.golf(CollectionsKt.D(set)) | ((i23 & 7168) == 2048) | c0585q3.hotel(bravo);
                Object jade4 = c0585q3.jade();
                if (golf || jade4 == asVar4) {
                    pVar = pVar3;
                    asVar = asVar4;
                    i14 = i23;
                    z12 = z17;
                    c0585q2 = c0585q3;
                    i15 = 2;
                    c3 = 6;
                    C0838c charlie = AbstractC3055s2.charlie(context3, orderTask, order, set, bravo, new C1708c(true, true));
                    context3 = context3;
                    c0585q2.f(charlie);
                    jade4 = charlie;
                } else {
                    pVar = pVar3;
                    asVar = asVar4;
                    c0585q2 = c0585q3;
                    i14 = i23;
                    z12 = z17;
                    i15 = 2;
                    c3 = 6;
                }
                C0838c c0838c = (C0838c) jade4;
                Platform platform = order.getPlatform();
                if (platform != null && (country = platform.getCountry()) != null && (currency = country.getCurrency()) != null) {
                    currency.getSymbol();
                }
                TaskType taskType = orderTask.getTaskType();
                int i24 = taskType == null ? -1 : Yb.as.$EnumSwitchMapping$0[taskType.ordinal()];
                if (i24 != 1 && i24 != i15) {
                    cVar = Za.c.purple;
                } else {
                    cVar = Za.c.red;
                }
                Za.c cVar2 = cVar;
                float f5 = AbstractC2213f.charlie;
                T.p pVar4 = pVar;
                T.s charlie2 = androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f);
                C0537c c0537c2 = AbstractC0542h.charlie;
                T.i iVar2 = T.d.f2062f;
                C0554u alpha2 = AbstractC0553t.alpha(c0537c2, iVar2, c0585q2, 0);
                long j5 = c0585q2.magenta;
                int i25 = (int) (j5 ^ (j5 >>> 32));
                androidx.compose.runtime.I mike = c0585q2.mike();
                T.s charlie3 = T.a.charlie(charlie2, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j3 = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j3);
                } else {
                    c0585q2.i();
                }
                C2549i c2549i7 = C2551k.foxtrot;
                C0564b.blue(c2549i7, c0585q2, alpha2);
                C2549i c2549i8 = C2551k.echo;
                C0564b.blue(c2549i8, c0585q2, mike);
                C2549i c2549i9 = C2551k.golf;
                if (c0585q2.lime) {
                    c2549i = c2549i8;
                } else {
                    c2549i = c2549i8;
                }
                ao.ad.blue(i25, c0585q2, i25, c2549i9);
                C2549i c2549i10 = C2551k.delta;
                C0564b.blue(c2549i10, c0585q2, charlie3);
                boolean z18 = orderTask.getTaskStatus() == TaskStatus.COMPLETED;
                TaskStatus taskStatus4 = orderTask.getTaskStatus();
                TaskStatus taskStatus5 = TaskStatus.CANCELLED;
                boolean z19 = taskStatus4 == taskStatus5;
                if (orderTask.getTaskStatus() == taskStatus5) {
                    taskStatus = taskStatus5;
                    z13 = false;
                    str = Q0.c.oscar(c0585q2, 2115533796, R.string.canceled, c0585q2, false);
                } else {
                    taskStatus = taskStatus5;
                    z13 = false;
                    c0585q2.purple(1157076026);
                    c0585q2.quebec(false);
                    str = null;
                }
                T.s charlie4 = androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f);
                boolean india4 = ((i14 & 29360128) == 8388608) | ((i21 & 29360128) == 8388608 ? true : z13) | c0585q2.india(expandedByTaskId) | c0585q2.echo(intValue) | c0585q2.hotel(z12);
                Object jade5 = c0585q2.jade();
                if (!india4) {
                    androidx.compose.runtime.as asVar5 = asVar;
                    if (jade5 == asVar5) {
                        asVar = asVar5;
                    } else {
                        asVar2 = asVar5;
                        c2549i2 = c2549i7;
                        iVar = iVar2;
                        i16 = intValue;
                        context = context3;
                        c0537c = c0537c2;
                        c2550j = c2550j3;
                        c2549i3 = c2549i;
                        taskStatus2 = taskStatus;
                        z14 = true;
                        pVar2 = pVar4;
                        int i26 = i21 >> 3;
                        boolean z20 = z14;
                        int i27 = i14;
                        C0585q c0585q4 = c0585q2;
                        P2.bravo((Function0) jade5, cVar2, i4, i5, z12, charlie4, z18, z19, str, z10, c0585q4, (i26 & 7168) | (i26 & 896) | 196608 | ((i21 << 6) & 1879048192));
                        c0585q = c0585q4;
                        if (!z12) {
                            c0585q.purple(1157379858);
                            T.s whiskey = AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), 0.0f, AbstractC2213f.foxtrot, 0.0f, 0.0f, 13);
                            int i28 = 0;
                            C0554u alpha3 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
                            long j6 = c0585q.magenta;
                            int i29 = (int) (j6 ^ (j6 >>> 32));
                            androidx.compose.runtime.I mike2 = c0585q.mike();
                            T.s charlie5 = T.a.charlie(whiskey, c0585q);
                            c0585q.white();
                            if (c0585q.lime) {
                                c2550j2 = c2550j;
                                c0585q.lima(c2550j2);
                            } else {
                                c2550j2 = c2550j;
                                c0585q.i();
                            }
                            C2549i c2549i11 = c2549i2;
                            C0564b.blue(c2549i11, c0585q, alpha3);
                            C2549i c2549i12 = c2549i3;
                            C0564b.blue(c2549i12, c0585q, mike2);
                            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i29))) {
                                ao.ad.blue(i29, c0585q, i29, c2549i9);
                            }
                            C0564b.blue(c2549i10, c0585q, charlie5);
                            Object[] objArr3 = orderTask.getMetaData() != null ? z20 ? 1 : 0 : false;
                            OrderAddress address = orderTask.getAddress();
                            if ((address != null ? address.getLatitude() : null) != null) {
                                OrderAddress address2 = orderTask.getAddress();
                                if ((address2 != null ? address2.getLongitude() : null) != null) {
                                    objArr = z20 ? 1 : 0;
                                    taskStatus3 = taskStatus2;
                                    objArr2 = orderTask.getTaskStatus() != taskStatus3 ? z20 ? 1 : 0 : false;
                                    if (objArr2 != false && objArr3 != false) {
                                        c0585q.purple(-475068460);
                                        orderTask2 = orderTask;
                                        P.d echo2 = P.e.echo(1332667520, new Yb.ak(orderTask2, z20 ? 1 : 0), c0585q);
                                        c0585q.quebec(false);
                                        dVar = echo2;
                                        c2549i4 = c2549i9;
                                    } else {
                                        orderTask2 = orderTask;
                                        c0585q.purple(-473438295);
                                        c0585q.quebec(false);
                                        c2549i4 = c2549i9;
                                        dVar = null;
                                    }
                                    if (objArr2 != false && objArr != false) {
                                        c0585q.purple(-473322974);
                                        c0329s02 = c0329s0;
                                        c2549i6 = c2549i10;
                                        i17 = i16;
                                        c2549i5 = c2549i4;
                                        final OrderTask orderTask4 = orderTask2;
                                        Xd.l lVar2 = new Xd.l() { // from class: Yb.ao
                                            @Override // Xd.l
                                            public final Object invoke(Object obj, Object obj2) {
                                                boolean z21;
                                                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                                                int intValue2 = ((Integer) obj2).intValue();
                                                if ((intValue2 & 3) != 2) {
                                                    z21 = true;
                                                } else {
                                                    z21 = false;
                                                }
                                                C0585q c0585q5 = (C0585q) interfaceC0581m2;
                                                if (c0585q5.magenta(intValue2 & 1, z21)) {
                                                    T.s charlie6 = androidx.compose.foundation.layout.V.charlie(T.p.alpha, 1.0f);
                                                    C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q5, 0);
                                                    long j7 = c0585q5.magenta;
                                                    int i30 = (int) (j7 ^ (j7 >>> 32));
                                                    androidx.compose.runtime.I mike3 = c0585q5.mike();
                                                    T.s charlie7 = T.a.charlie(charlie6, c0585q5);
                                                    InterfaceC2552l.maroon.getClass();
                                                    C2550j c2550j4 = C2551k.bravo;
                                                    c0585q5.white();
                                                    if (c0585q5.lime) {
                                                        c0585q5.lima(c2550j4);
                                                    } else {
                                                        c0585q5.i();
                                                    }
                                                    C0564b.blue(C2551k.foxtrot, c0585q5, alpha4);
                                                    C0564b.blue(C2551k.echo, c0585q5, mike3);
                                                    C2549i c2549i13 = C2551k.golf;
                                                    if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(i30))) {
                                                        ao.ad.blue(i30, c0585q5, i30, c2549i13);
                                                    }
                                                    C0564b.blue(C2551k.delta, c0585q5, charlie7);
                                                    P.d dVar4 = P.d.this;
                                                    if (dVar4 == null) {
                                                        c0585q5.purple(-1416335642);
                                                    } else {
                                                        c0585q5.purple(1616879739);
                                                        dVar4.invoke(c0585q5, 0);
                                                    }
                                                    c0585q5.quebec(false);
                                                    OrderTask orderTask5 = orderTask4;
                                                    OrderAddress address3 = orderTask5.getAddress();
                                                    Intrinsics.checkNotNull(address3);
                                                    Float latitude = address3.getLatitude();
                                                    Intrinsics.checkNotNull(latitude);
                                                    double floatValue = latitude.floatValue();
                                                    OrderAddress address4 = orderTask5.getAddress();
                                                    Intrinsics.checkNotNull(address4);
                                                    Intrinsics.checkNotNull(address4.getLongitude());
                                                    AbstractC2672h7.alpha(d4, d9, floatValue, r2.floatValue(), null, c0585q5, 0);
                                                    c0585q5.quebec(true);
                                                } else {
                                                    c0585q5.ochre();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        orderTask3 = orderTask4;
                                        dVar2 = P.e.echo(1858034141, lVar2, c0585q);
                                        c0585q.quebec(false);
                                    } else {
                                        c0329s02 = c0329s0;
                                        c2549i5 = c2549i4;
                                        dVar2 = dVar;
                                        c2549i6 = c2549i10;
                                        i17 = i16;
                                        orderTask3 = orderTask2;
                                        c0585q.purple(-985083357);
                                        c0585q.quebec(false);
                                    }
                                    P.d dVar4 = dVar2;
                                    z16 = objArr2 == true && orderTask3.getTaskType() == TaskType.DELIVERY && orderTask3.getTaskStatus() != TaskStatus.PENDING && !notes.isEmpty();
                                    boolean z21 = orderTask3.getTaskStatus() != taskStatus3;
                                    if (!orderTask3.shouldShowCallIcon(true)) {
                                        c0585q.purple(-471849482);
                                        boolean india5 = ((i21 & 1879048192) == 536870912) | c0585q.india(orderTask3);
                                        Object jade6 = c0585q.jade();
                                        if (india5) {
                                            asVar3 = asVar2;
                                        } else {
                                            asVar3 = asVar2;
                                            if (jade6 != asVar3) {
                                                c0585q.quebec(false);
                                                function02 = (Function0) jade6;
                                            }
                                        }
                                        jade6 = new Yb.aq(onCallCustomer, orderTask3, 0);
                                        c0585q.f(jade6);
                                        c0585q.quebec(false);
                                        function02 = (Function0) jade6;
                                    } else {
                                        asVar3 = asVar2;
                                        c0585q.purple(-471819351);
                                        c0585q.quebec(false);
                                        function02 = null;
                                    }
                                    if (!z16) {
                                        c0585q.purple(-471414490);
                                        P.d echo3 = P.e.echo(402569777, new Yb.ap(notes, i17, orderTask3, c0329s02), c0585q);
                                        c0585q.quebec(false);
                                        dVar3 = echo3;
                                    } else {
                                        c0585q.purple(-471308471);
                                        c0585q.quebec(false);
                                        dVar3 = null;
                                    }
                                    T.s charlie6 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
                                    int i30 = i21 & 234881024;
                                    india = c0585q.india(orderTask3) | (i30 != 67108864 || ((i21 & 134217728) != 0 && c0585q.india(c0329s02)));
                                    jade = c0585q.jade();
                                    if (!india || jade == asVar3) {
                                        jade = new Yb.ai(orderTask3, c0329s02, 2);
                                        c0585q.f(jade);
                                    }
                                    Function0 function03 = (Function0) jade;
                                    context2 = context;
                                    india2 = c0585q.india(orderTask3) | c0585q.india(context2);
                                    jade2 = c0585q.jade();
                                    if (!india2 || jade2 == asVar3) {
                                        jade2 = new Yb.ah(orderTask3, context2, 0);
                                        c0585q.f(jade2);
                                    }
                                    Function0 function04 = (Function0) jade2;
                                    india3 = (i30 != 67108864 || ((i21 & 134217728) != 0 && c0585q.india(c0329s02))) | c0585q.india(orderTask3);
                                    jade3 = c0585q.jade();
                                    if (!india3 || jade3 == asVar3) {
                                        jade3 = new Yb.ai(c0329s02, orderTask3, i28);
                                        c0585q.f(jade3);
                                    }
                                    X4.alpha(c0838c, function03, function04, function02, charlie6, lVar, null, null, (Function0) jade3, P.e.echo(1492488302, new Yb.aj(orderTask3, l10, i28), c0585q), false, dVar4, dVar3, P.e.echo(1713600201, new Yb.ak(orderTask3, 0), c0585q), z21, null, c0585q, 24584 | ((i27 << 15) & 29360128), 1572912, 299872);
                                    if (orderTask3.getTaskStatus() != taskStatus3) {
                                        List<Item> items = orderTask3.getItems();
                                        if (items != null && (items.isEmpty() ^ true)) {
                                            c0585q.purple(-470649317);
                                            T.s whiskey2 = AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), 0.0f, 6, 0.0f, 0.0f, 13);
                                            boolean india6 = (i30 == 67108864 || ((i21 & 134217728) != 0 && c0585q.india(c0329s02))) | c0585q.india(orderTask3);
                                            Object jade7 = c0585q.jade();
                                            if (india6 || jade7 == asVar3) {
                                                jade7 = new Yb.ai(c0329s02, orderTask3, 1);
                                                c0585q.f(jade7);
                                            }
                                            T.s echo4 = androidx.compose.foundation.a.echo(15, whiskey2, null, (Function0) jade7, false);
                                            androidx.compose.foundation.layout.S alpha4 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, T.d.f2061d, c0585q, 48);
                                            long j7 = c0585q.magenta;
                                            int i31 = (int) (j7 ^ (j7 >>> 32));
                                            androidx.compose.runtime.I mike3 = c0585q.mike();
                                            T.s charlie7 = T.a.charlie(echo4, c0585q);
                                            c0585q.white();
                                            if (c0585q.lime) {
                                                c0585q.lima(c2550j2);
                                            } else {
                                                c0585q.i();
                                            }
                                            C0564b.blue(c2549i11, c0585q, alpha4);
                                            C0564b.blue(c2549i12, c0585q, mike3);
                                            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i31))) {
                                                ao.ad.blue(i31, c0585q, i31, c2549i5);
                                            }
                                            C0564b.blue(c2549i6, c0585q, charlie7);
                                            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_list_icon, c0585q, 6), null, androidx.compose.foundation.layout.V.kilo(pVar2, 20), 0L, c0585q, 432, 8);
                                            String string = context2.getString(R.string.items);
                                            Intrinsics.delta(string, "getString(...)");
                                            sVar2 = pVar2;
                                            F.G2.bravo(string, AbstractC0538d.whiskey(sVar2, 8, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((F.S2) c0585q.kilo(F.T2.alpha)).kilo, c0585q, 48, 0, 65532);
                                            c0585q = c0585q;
                                            c0585q.quebec(true);
                                            z15 = false;
                                            c0585q.quebec(z15);
                                            z20 = true;
                                            c0585q.quebec(true);
                                        }
                                    }
                                    sVar2 = pVar2;
                                    z15 = false;
                                    c0585q.purple(-481059954);
                                    c0585q.quebec(z15);
                                    z20 = true;
                                    c0585q.quebec(true);
                                }
                            }
                            objArr = false;
                            taskStatus3 = taskStatus2;
                            if (orderTask.getTaskStatus() != taskStatus3) {
                            }
                            if (objArr2 != false) {
                            }
                            orderTask2 = orderTask;
                            c0585q.purple(-473438295);
                            c0585q.quebec(false);
                            c2549i4 = c2549i9;
                            dVar = null;
                            if (objArr2 != false) {
                            }
                            c0329s02 = c0329s0;
                            c2549i5 = c2549i4;
                            dVar2 = dVar;
                            c2549i6 = c2549i10;
                            i17 = i16;
                            orderTask3 = orderTask2;
                            c0585q.purple(-985083357);
                            c0585q.quebec(false);
                            P.d dVar42 = dVar2;
                            if (objArr2 == true) {
                            }
                            if (orderTask3.getTaskStatus() != taskStatus3) {
                            }
                            if (!orderTask3.shouldShowCallIcon(true)) {
                            }
                            if (!z16) {
                            }
                            T.s charlie62 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
                            int i302 = i21 & 234881024;
                            india = c0585q.india(orderTask3) | (i302 != 67108864 || ((i21 & 134217728) != 0 && c0585q.india(c0329s02)));
                            jade = c0585q.jade();
                            if (!india) {
                            }
                            jade = new Yb.ai(orderTask3, c0329s02, 2);
                            c0585q.f(jade);
                            Function0 function032 = (Function0) jade;
                            context2 = context;
                            india2 = c0585q.india(orderTask3) | c0585q.india(context2);
                            jade2 = c0585q.jade();
                            if (!india2) {
                            }
                            jade2 = new Yb.ah(orderTask3, context2, 0);
                            c0585q.f(jade2);
                            Function0 function042 = (Function0) jade2;
                            india3 = (i302 != 67108864 || ((i21 & 134217728) != 0 && c0585q.india(c0329s02))) | c0585q.india(orderTask3);
                            jade3 = c0585q.jade();
                            if (!india3) {
                            }
                            jade3 = new Yb.ai(c0329s02, orderTask3, i28);
                            c0585q.f(jade3);
                            X4.alpha(c0838c, function032, function042, function02, charlie62, lVar, null, null, (Function0) jade3, P.e.echo(1492488302, new Yb.aj(orderTask3, l10, i28), c0585q), false, dVar42, dVar3, P.e.echo(1713600201, new Yb.ak(orderTask3, 0), c0585q), z21, null, c0585q, 24584 | ((i27 << 15) & 29360128), 1572912, 299872);
                            if (orderTask3.getTaskStatus() != taskStatus3) {
                            }
                            sVar2 = pVar2;
                            z15 = false;
                            c0585q.purple(-481059954);
                            c0585q.quebec(z15);
                            z20 = true;
                            c0585q.quebec(true);
                        } else {
                            sVar2 = pVar2;
                            z15 = false;
                            c0585q.purple(1151736959);
                        }
                        c0585q.quebec(z15);
                        c0585q.quebec(z20);
                    }
                }
                c2549i2 = c2549i7;
                iVar = iVar2;
                i16 = intValue;
                context = context3;
                c0537c = c0537c2;
                c2550j = c2550j3;
                c2549i3 = c2549i;
                taskStatus2 = taskStatus;
                asVar2 = asVar;
                z14 = true;
                pVar2 = pVar4;
                Yb.an anVar = new Yb.an(z10, expandedByTaskId, i16, z12, function0, 0);
                c0585q2.f(anVar);
                jade5 = anVar;
                int i262 = i21 >> 3;
                boolean z202 = z14;
                int i272 = i14;
                C0585q c0585q42 = c0585q2;
                P2.bravo((Function0) jade5, cVar2, i4, i5, z12, charlie4, z18, z19, str, z10, c0585q42, (i262 & 7168) | (i262 & 896) | 196608 | ((i21 << 6) & 1879048192));
                c0585q = c0585q42;
                if (!z12) {
                }
                c0585q.quebec(z15);
                c0585q.quebec(z202);
            } else {
                androidx.compose.runtime.Q uniform = c0585q3.uniform();
                if (uniform != null) {
                    uniform.delta = new Xd.l() { // from class: Yb.am
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int cyan = C0564b.cyan(i11 | 1);
                            int cyan2 = C0564b.cyan(i12);
                            OrderTask orderTask5 = OrderTask.this;
                            Order order2 = order;
                            T.p pVar5 = T.p.alpha;
                            double d10 = d9;
                            Function0 function05 = function0;
                            AbstractC3041p2.bravo(orderTask5, order2, notes, i4, i5, expandedByTaskId, z2, z10, c0329s0, onCallCustomer, pVar5, set, lVar, i10, l10, d4, d10, function05, (InterfaceC0581m) obj, cyan, cyan2);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            c0585q = c0585q3;
            c0585q.ochre();
            sVar2 = sVar;
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Yb.al(orderTask, order, notes, i4, i5, expandedByTaskId, z2, z10, c0329s0, onCallCustomer, sVar2, set, lVar, i10, l10, d4, d9, function0, i11, i12);
        }
    }
}
