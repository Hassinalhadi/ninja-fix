package t6;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import cb.AbstractC0836a;
import cb.C0837b;
import cb.C0838c;
import cb.C0841f;
import cb.C0842g;
import cb.EnumC0839d;
import com.app.network.network.models.Country;
import com.app.network.network.models.Currency;
import com.app.network.network.models.HandshakeItem;
import com.app.network.network.models.Item;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderAddress;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Platform;
import com.app.network.network.models.PlatformSettings;
import com.app.network.network.models.Receipt;
import com.app.network.network.models.TagDto;
import com.app.network.network.models.TaskStatus;
import com.app.network.network.models.TaskType;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import fc.C1708c;
import g0.C1726f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s.AbstractC2533l;
import u.C3130d;
import u.C3131e;

/* renamed from: t6.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3055s2 {
    public static final void alpha(T.s sVar, androidx.compose.runtime.aa aaVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        P.d dVar2 = AbstractC2533l.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-714464401);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(aaVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(dVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(dVar)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i10;
        }
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = C0564b.yankee(null, androidx.compose.runtime.as.red);
                c0585q.f(jade);
            }
            C3130d bravo = bravo(dVar2, c0585q, (i5 >> 6) & 14);
            C0564b.alpha(aaVar.alpha(bravo), P.e.echo(274270255, new C3131e(sVar, (androidx.compose.runtime.ax) jade, dVar, bravo), c0585q), c0585q, 56);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.al(sVar, aaVar, dVar, i4);
        }
    }

    public static final C3130d bravo(P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((((i4 & 14) ^ 6) > 4 && ((C0585q) interfaceC0581m).golf(dVar)) || (i4 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (z2 || jade == asVar) {
            jade = new C3130d(dVar);
            c0585q.f(jade);
        }
        C3130d c3130d = (C3130d) jade;
        boolean golf = c0585q.golf(c3130d);
        Object jade2 = c0585q.jade();
        if (golf || jade2 == asVar) {
            jade2 = new n.Y(18, c3130d);
            c0585q.f(jade2);
        }
        C0564b.delta(c3130d, (Function1) jade2, c0585q);
        return c3130d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x06d1, code lost:
    
        if ((r3 != null ? r3.getUrl() : null) != null) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x075d, code lost:
    
        if (r6 != null) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0760, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0795, code lost:
    
        if (r6 != null) goto L442;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x059b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0689 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x07f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x08cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x033b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03bf  */
    /* JADX WARN: Type inference failed for: r11v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0838c charlie(Context context, OrderTask orderTask, Order order, Set checkedItemIds, boolean z2, C1708c pickupVisibilityFlags) {
        EnumC0839d enumC0839d;
        String string;
        String str;
        List<OrderTask> tasks;
        Iterator<OrderTask> it;
        int i4;
        int i5;
        int size;
        int i10;
        String description;
        String str2;
        String string2;
        Country country;
        Currency currency;
        Pair pair;
        int i11;
        int i12;
        Triple triple;
        Triple triple2;
        int i13;
        C1726f c1726f;
        OrderAddress address;
        String str3;
        String str4;
        String obj;
        String str5;
        List<HandshakeItem> handshakeItems;
        List<HandshakeItem> appendages;
        boolean z10;
        int i14;
        C0841f c0841f;
        Float payAtPickup;
        Integer id2;
        float floatValue;
        boolean z11;
        String str6;
        ?? emptyList;
        boolean z12;
        boolean areEqual;
        boolean areEqual2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ?? emptyList2;
        String obj2;
        String str7;
        String str8;
        boolean z17;
        String orderDisplayId;
        String string3;
        int i15;
        String nameAr;
        String name;
        String description2;
        String obj3;
        String str9;
        Platform platform;
        PlatformSettings settings;
        boolean z18;
        boolean z19;
        PlatformSettings settings2;
        PlatformSettings settings3;
        int collectionSizeOrDefault;
        String str10;
        Country country2;
        Currency currency2;
        ?? emptyList3;
        boolean z20;
        List list;
        List p4;
        int collectionSizeOrDefault2;
        List p5;
        boolean z21;
        String string4;
        int indexOf;
        OrderTask orderTask2;
        String str11;
        Country country3;
        Currency currency3;
        boolean z22 = true;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(checkedItemIds, "checkedItemIds");
        Intrinsics.echo(pickupVisibilityFlags, "pickupVisibilityFlags");
        TaskStatus taskStatus = orderTask.getTaskStatus();
        int i16 = taskStatus == null ? -1 : Yb.G0.$EnumSwitchMapping$1[taskStatus.ordinal()];
        if (i16 == -1) {
            enumC0839d = EnumC0839d.alpha;
        } else if (i16 == 1) {
            enumC0839d = EnumC0839d.purple;
        } else if (i16 == 2) {
            enumC0839d = EnumC0839d.red;
        } else if (i16 != 3) {
            if (i16 != 4 && i16 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            enumC0839d = EnumC0839d.silver;
        } else {
            enumC0839d = EnumC0839d.red;
        }
        EnumC0839d enumC0839d2 = enumC0839d;
        TaskType taskType = orderTask.getTaskType();
        int i17 = taskType == null ? -1 : Yb.G0.$EnumSwitchMapping$0[taskType.ordinal()];
        if (i17 == 1 || i17 == 2) {
            string = context.getString(R.string.pickup_from);
        } else if (i17 == 3) {
            string = context.getString(R.string.deliver_to);
        } else if (i17 == 4) {
            string = context.getString(R.string.returning);
        } else if (i17 == 5) {
            string = context.getString(R.string.area_location);
        } else {
            str = "";
            Intrinsics.checkNotNull(str);
            tasks = order.getTasks();
            if (tasks == null) {
                tasks = CollectionsKt.emptyList();
            }
            it = tasks.iterator();
            i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    i5 = 0;
                    i4 = -1;
                    break;
                }
                i5 = 0;
                if (Intrinsics.areEqual(it.next().getId(), orderTask.getId())) {
                    break;
                }
                i4++;
            }
            Integer valueOf = Integer.valueOf(i4);
            if (i4 < 0) {
                valueOf = null;
            }
            int intValue = (valueOf == null ? valueOf.intValue() : i5) + 1;
            size = tasks.size();
            if (size < 1) {
                size = 1;
            }
            String magenta = StringsKt.magenta(StringsKt.b(str).toString(), ":");
            Integer valueOf2 = Integer.valueOf(intValue);
            Integer valueOf3 = Integer.valueOf(size);
            Object[] objArr = new Object[3];
            objArr[i5] = magenta;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            String string5 = context.getString(R.string.task_card_title_with_index, objArr);
            Intrinsics.delta(string5, "getString(...)");
            TaskType taskType2 = orderTask.getTaskType();
            i10 = taskType2 != null ? -1 : Yb.G0.$EnumSwitchMapping$0[taskType2.ordinal()];
            if (i10 != 1 || i10 == 2) {
                description = orderTask.getDescription();
                if (description == null) {
                    description = "";
                }
                if (orderTask.getTaskType() != TaskType.ON_DEMAND_PICK_UP) {
                    string2 = context.getString(R.string.on_demand_amount);
                } else {
                    Float payAtPickup2 = orderTask.getPayAtPickup();
                    Float valueOf4 = Float.valueOf(payAtPickup2 != null ? payAtPickup2.floatValue() : 0.0f);
                    Platform platform2 = order.getPlatform();
                    if (platform2 == null || (country = platform2.getCountry()) == null || (currency = country.getCurrency()) == null || (str2 = currency.getLocalizedName()) == null) {
                        str2 = "";
                    }
                    Object[] objArr2 = new Object[2];
                    objArr2[i5] = valueOf4;
                    objArr2[1] = str2;
                    string2 = context.getString(R.string.pay_amount, objArr2);
                }
                Intrinsics.checkNotNull(string2);
                pair = new Pair(description, string2);
            } else if (i10 != 3 && i10 != 4 && i10 != 5) {
                String description3 = orderTask.getDescription();
                if (description3 == null) {
                    description3 = "";
                }
                pair = new Pair(description3, "");
            } else {
                String description4 = orderTask.getDescription();
                if (description4 == null) {
                    description4 = "";
                }
                Float collectAtDelivery = orderTask.getCollectAtDelivery();
                String bravo = collectAtDelivery != null ? Q2.bravo(collectAtDelivery.floatValue()) : null;
                Platform platform3 = order.getPlatform();
                if (platform3 == null || (country3 = platform3.getCountry()) == null || (currency3 = country3.getCurrency()) == null || (str11 = currency3.getLocalizedName()) == null) {
                    str11 = "";
                }
                Object[] objArr3 = new Object[2];
                objArr3[i5] = bravo;
                objArr3[1] = str11;
                String string6 = context.getString(R.string.collect_currency, objArr3);
                Intrinsics.delta(string6, "getString(...)");
                pair = new Pair(description4, string6);
            }
            String str12 = (String) pair.second;
            TaskType taskType3 = orderTask.getTaskType();
            i11 = taskType3 != null ? -1 : Yb.G0.$EnumSwitchMapping$0[taskType3.ordinal()];
            if (i11 != 1 || i11 == 2) {
                TaskStatus taskStatus2 = orderTask.getTaskStatus();
                i12 = taskStatus2 != null ? -1 : Yb.G0.$EnumSwitchMapping$1[taskStatus2.ordinal()];
                if (i12 != 1) {
                    triple = new Triple(context.getString(R.string.start_pickup), AbstractC0836a.charlie, Boolean.TRUE);
                } else if (i12 == 2) {
                    triple = new Triple(context.getString(R.string.mark_as_complete), AbstractC0836a.delta, Boolean.TRUE);
                } else if (i12 == 3) {
                    triple = new Triple(context.getString(R.string.mark_as_complete), AbstractC0836a.delta, Boolean.TRUE);
                } else if (i12 != 4) {
                    triple = new Triple(null, null, Boolean.TRUE);
                } else {
                    triple = new Triple(context.getString(R.string.completed), AbstractC0836a.delta, Boolean.FALSE);
                }
            } else {
                if (i11 != 3 && i11 != 4 && i11 != 5) {
                    triple2 = new Triple(null, null, Boolean.TRUE);
                } else {
                    List<OrderTask> tasks2 = order.getTasks();
                    if (tasks2 == null || (indexOf = tasks2.indexOf(orderTask)) <= 0) {
                        z21 = true;
                    } else {
                        TaskStatus[] taskStatusArr = new TaskStatus[2];
                        taskStatusArr[i5] = TaskStatus.COMPLETED;
                        taskStatusArr[1] = TaskStatus.CANCELLED;
                        List listOf = CollectionsKt.listOf(taskStatusArr);
                        List<OrderTask> tasks3 = order.getTasks();
                        z21 = CollectionsKt.bronze(listOf, (tasks3 == null || (orderTask2 = tasks3.get(indexOf - 1)) == null) ? null : orderTask2.getTaskStatus());
                    }
                    TaskStatus taskStatus3 = orderTask.getTaskStatus();
                    int i18 = taskStatus3 == null ? -1 : Yb.G0.$EnumSwitchMapping$1[taskStatus3.ordinal()];
                    if (i18 == 1) {
                        if (orderTask.getTaskType() == TaskType.RETURN_TO_AREA) {
                            string4 = context.getString(R.string.return_to_area);
                        } else {
                            string4 = context.getString(R.string.start_delivery);
                        }
                        Intrinsics.checkNotNull(string4);
                        triple2 = new Triple(string4, AbstractC0836a.charlie, Boolean.valueOf(z21));
                    } else if (i18 == 2) {
                        triple = new Triple(context.getString(R.string.mark_as_complete), AbstractC0836a.delta, Boolean.TRUE);
                    } else if (i18 == 4) {
                        triple = new Triple(context.getString(R.string.completed), AbstractC0836a.delta, Boolean.FALSE);
                    } else if (i18 != 5) {
                        triple = new Triple(null, null, Boolean.TRUE);
                    } else {
                        triple = new Triple(context.getString(R.string.canceled), AbstractC0836a.delta, Boolean.FALSE);
                    }
                }
                String str13 = (String) triple2.first;
                C1726f c1726f2 = (C1726f) triple2.second;
                boolean booleanValue = ((Boolean) triple2.third).booleanValue();
                TaskType taskType4 = orderTask.getTaskType();
                i13 = taskType4 == null ? -1 : Yb.G0.$EnumSwitchMapping$0[taskType4.ordinal()];
                if (i13 == 3 && i13 != 4 && i13 != 5) {
                    c1726f = AbstractC0836a.alpha;
                } else {
                    c1726f = AbstractC0836a.bravo;
                }
                C1726f c1726f3 = c1726f;
                address = orderTask.getAddress();
                if (address != null) {
                    List<String> imageUrls = address.getImageUrls();
                    if (imageUrls == null || (str3 = (String) CollectionsKt.green(imageUrls)) == null || StringsKt.gray(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        str5 = str3;
                    } else {
                        String imageUrl = address.getImageUrl();
                        if (imageUrl == null || StringsKt.gray(imageUrl)) {
                            imageUrl = null;
                        }
                        if (imageUrl != null && (str4 = (String) CollectionsKt.green(StringsKt.maroon(imageUrl, new String[]{Constants.SEPARATOR_COMMA}, 6))) != null && (obj = StringsKt.b(str4).toString()) != null) {
                            ?? r11 = i5;
                            if (kotlin.text.r.quebec(obj, "http://", r11) || kotlin.text.r.quebec(obj, "https://", r11)) {
                                str5 = obj;
                            }
                        }
                    }
                    Integer id3 = orderTask.getId();
                    int intValue2 = id3 == null ? id3.intValue() : 0;
                    handshakeItems = orderTask.getHandshakeItems();
                    if ((handshakeItems != null || handshakeItems.isEmpty()) && ((appendages = orderTask.getAppendages()) == null || appendages.isEmpty())) {
                        z10 = booleanValue;
                        i14 = 1;
                        c0841f = null;
                    } else {
                        List<HandshakeItem> handshakeItems2 = orderTask.getHandshakeItems();
                        if (handshakeItems2 != null && (p5 = CollectionsKt.p(handshakeItems2, new Sb.k(8))) != null) {
                            emptyList3 = new ArrayList();
                            Iterator it2 = p5.iterator();
                            while (it2.hasNext()) {
                                String value = ((HandshakeItem) it2.next()).getValue();
                                if (value == null || StringsKt.gray(value)) {
                                    value = null;
                                }
                                if (value != null) {
                                    emptyList3.add(value);
                                }
                            }
                        } else {
                            emptyList3 = CollectionsKt.emptyList();
                        }
                        List<HandshakeItem> appendages2 = orderTask.getAppendages();
                        if (appendages2 != null && (p4 = CollectionsKt.p(appendages2, new Sb.k(9))) != null) {
                            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(p4, 10);
                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
                            int i19 = 0;
                            for (Object obj4 : p4) {
                                int i20 = i19 + 1;
                                if (i19 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                HandshakeItem handshakeItem = (HandshakeItem) obj4;
                                String value2 = handshakeItem.getValue();
                                if (value2 == null) {
                                    value2 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
                                }
                                String str14 = value2;
                                String icon = handshakeItem.getIcon();
                                arrayList.add(new C0837b(str14, handshakeItem.getKey(), (icon == null || StringsKt.gray(icon)) ? null : icon, A0.z.juliet("appendage_", intValue2, i19, "_"), checkedItemIds.contains("appendage_" + intValue2 + "_" + i19)));
                                z22 = z22;
                                i19 = i20;
                                booleanValue = booleanValue;
                            }
                            z10 = booleanValue;
                            z20 = z22;
                            list = arrayList;
                        } else {
                            z10 = booleanValue;
                            z20 = true;
                            list = CollectionsKt.emptyList();
                        }
                        c0841f = new C0841f(emptyList3, list);
                        i14 = z20;
                    }
                    payAtPickup = orderTask.getPayAtPickup();
                    if ((payAtPickup == null ? payAtPickup.floatValue() : 0.0f) <= 0.0f) {
                        Float payAtPickup3 = orderTask.getPayAtPickup();
                        if (payAtPickup3 != null) {
                            floatValue = payAtPickup3.floatValue();
                        }
                        floatValue = 0.0f;
                    } else {
                        if (s6.H0.charlie(order, orderTask) && (id2 = order.getId()) != null) {
                            int intValue3 = id2.intValue();
                            SharedPreferences sharedPreferences = context.getSharedPreferences("on_demand_amounts", 0);
                            Double valueOf5 = sharedPreferences.contains("amount_for_order_" + intValue3) ? Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("amount_for_order_" + intValue3, 0L))) : null;
                            Float valueOf6 = valueOf5 != null ? Float.valueOf((float) valueOf5.doubleValue()) : null;
                            if (valueOf6 != null) {
                                floatValue = valueOf6.floatValue();
                            }
                        }
                        floatValue = 0.0f;
                    }
                    z11 = ((orderTask.getTaskType() != TaskType.PICK_UP || orderTask.getTaskType() == TaskType.ON_DEMAND_PICK_UP) && floatValue > 0.0f && !s6.H0.charlie(order, orderTask)) ? i14 : false;
                    if (z11) {
                        str6 = null;
                    } else {
                        Float valueOf7 = Float.valueOf(floatValue);
                        Platform platform4 = order.getPlatform();
                        if (platform4 == null || (country2 = platform4.getCountry()) == null || (currency2 = country2.getCurrency()) == null || (str10 = currency2.getLocalizedName()) == null) {
                            str10 = "";
                        }
                        Object[] objArr4 = new Object[2];
                        objArr4[0] = valueOf7;
                        objArr4[i14] = str10;
                        str6 = context.getString(R.string.pay_amount, objArr4);
                    }
                    boolean z23 = (z2 || !AbstractC3060t2.bravo(order, orderTask)) ? false : i14;
                    boolean z24 = (z23 || pickupVisibilityFlags.bravo) ? false : i14;
                    boolean z25 = pickupVisibilityFlags.alpha;
                    boolean z26 = (z23 || z25) ? false : i14;
                    if (s6.H0.charlie(order, orderTask) && !z24) {
                        List<Item> items = orderTask.getItems();
                        if (items == null) {
                            items = CollectionsKt.emptyList();
                        }
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10);
                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                        for (Item item : items) {
                            String name2 = item.getName();
                            if (name2 == null && (name2 = item.getDescription()) == null) {
                                name2 = "";
                            }
                            Integer quantity = item.getQuantity();
                            arrayList2.add(new C0842g(name2, quantity != null ? quantity.intValue() : 0));
                        }
                        emptyList = new ArrayList();
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            if (!StringsKt.gray(((C0842g) next).alpha)) {
                                emptyList.add(next);
                            }
                        }
                    } else {
                        emptyList = CollectionsKt.emptyList();
                    }
                    List list2 = emptyList;
                    String quebec = L9.d.quebec(context, orderTask.generateImageId());
                    String juliet = L9.d.juliet(context, orderTask.generateImageId());
                    z12 = (quebec == null && new File(quebec).exists()) ? i14 : false;
                    boolean z27 = (juliet == null && new File(juliet).exists()) ? i14 : false;
                    Platform platform5 = order.getPlatform();
                    areEqual = (platform5 != null || (settings3 = platform5.getSettings()) == null) ? false : Intrinsics.areEqual(settings3.getCaptainReceiptRequired(), Boolean.TRUE);
                    Platform platform6 = order.getPlatform();
                    areEqual2 = (platform6 != null || (settings2 = platform6.getSettings()) == null) ? false : Intrinsics.areEqual(settings2.getPickupTaskConfirmationImageRequired(), Boolean.TRUE);
                    TaskStatus taskStatus4 = orderTask.getTaskStatus();
                    TaskStatus taskStatus5 = TaskStatus.STARTED;
                    float f5 = floatValue;
                    boolean z28 = ((orderTask.getTaskType() != TaskType.PICK_UP || orderTask.getTaskType() == TaskType.ON_DEMAND_PICK_UP) && orderTask.getTaskStatus() != TaskStatus.COMPLETED && (areEqual || areEqual2) && (((taskStatus4 != taskStatus5 || (z25 && orderTask.getTaskStatus() == TaskStatus.AT_DESTINATION)) ? i14 : false) || z27 || z12)) ? i14 : false;
                    if (areEqual) {
                        if (!z27) {
                            Receipt receipt = orderTask.getReceipt();
                        }
                        z13 = i14;
                        z14 = (areEqual2 || !z12) ? false : i14;
                        Yb.F0 f02 = new Yb.F0(z28, areEqual, areEqual2, z13, z14);
                        if (!s6.H0.charlie(order, orderTask) || z26) {
                            f02 = new Yb.F0(false, areEqual, areEqual2, z13, z14);
                        }
                        Yb.F0 f03 = f02;
                        if (!s6.H0.charlie(order, orderTask) && orderTask.getTaskStatus() == taskStatus5 && z10) {
                            Boolean requiresInvoice = orderTask.getRequiresInvoice();
                            Boolean bool = Boolean.TRUE;
                            if (Intrinsics.areEqual(requiresInvoice, bool) && !z27) {
                                Receipt receipt2 = orderTask.getReceipt();
                                if ((receipt2 != null ? receipt2.getUrl() : null) == null) {
                                    z18 = false;
                                    if (Intrinsics.areEqual(orderTask.getRequiresAmountInput(), bool)) {
                                        if (Intrinsics.areEqual(orderTask.getRequiresInvoiceQrCode(), bool)) {
                                            Integer id4 = orderTask.getId();
                                        }
                                        z19 = i14;
                                    } else {
                                        if (f5 <= 0.0f) {
                                            Integer id5 = orderTask.getId();
                                        }
                                        z19 = i14;
                                    }
                                    z15 = (z18 || !z19) ? false : i14;
                                }
                            }
                            z18 = i14;
                            if (Intrinsics.areEqual(orderTask.getRequiresAmountInput(), bool)) {
                            }
                            if (z18) {
                            }
                        } else {
                            z15 = z10;
                        }
                        if (orderTask.getTaskType() == TaskType.DELIVERY && orderTask.getTaskStatus() == taskStatus5) {
                            platform = order.getPlatform();
                            if ((platform != null || (settings = platform.getSettings()) == null) ? false : Intrinsics.areEqual(settings.getDeliveryTaskConfirmationImageRequired(), Boolean.TRUE)) {
                                z16 = i14;
                                List<String> deliveryProofImages = orderTask.getDeliveryProofImages();
                                String str15 = (deliveryProofImages == null && (str9 = (String) CollectionsKt.olive(deliveryProofImages)) != null && new File(str9).exists()) ? str9 : null;
                                boolean z29 = (z16 || str15 == null) ? false : i14;
                                String string7 = !z16 ? context.getString(R.string.proof_of_delivery) : null;
                                if (!z16) {
                                    List<String> deliveryProofImages2 = orderTask.getDeliveryProofImages();
                                    if (deliveryProofImages2 != null) {
                                        emptyList2 = new ArrayList();
                                        for (Object obj5 : deliveryProofImages2) {
                                            if (new File((String) obj5).exists()) {
                                                emptyList2.add(obj5);
                                            }
                                        }
                                    } else {
                                        emptyList2 = 0;
                                    }
                                    if (emptyList2 == 0) {
                                        emptyList2 = CollectionsKt.emptyList();
                                    }
                                } else {
                                    emptyList2 = CollectionsKt.emptyList();
                                }
                                List list3 = emptyList2;
                                OrderAddress address2 = orderTask.getAddress();
                                String str16 = (address2 != null || (description2 = address2.getDescription()) == null || (obj3 = StringsKt.b(description2).toString()) == null || StringsKt.gray(obj3)) ? null : obj3;
                                Platform platform7 = order.getPlatform();
                                obj2 = (platform7 != null || (name = platform7.getName()) == null) ? null : StringsKt.b(name).toString();
                                if ((obj2 != null || StringsKt.gray(obj2)) ? i14 : false) {
                                    obj2 = null;
                                }
                                if (obj2 != null) {
                                    Platform platform8 = order.getPlatform();
                                    str7 = (platform8 == null || (nameAr = platform8.getNameAr()) == null) ? null : StringsKt.b(nameAr).toString();
                                    if ((str7 == null || StringsKt.gray(str7)) ? i14 : false) {
                                        str7 = null;
                                    }
                                } else {
                                    str7 = obj2;
                                }
                                boolean z30 = (orderTask.getTaskType() != TaskType.PICK_UP || orderTask.getTaskType() == TaskType.ON_DEMAND_PICK_UP) ? i14 : false;
                                if (z2 || !z30) {
                                    str8 = null;
                                } else {
                                    List<TagDto> tags = orderTask.getTags();
                                    if (tags != null) {
                                        if (tags.isEmpty()) {
                                            i15 = 0;
                                        } else {
                                            Iterator it4 = tags.iterator();
                                            i15 = 0;
                                            while (it4.hasNext()) {
                                                String value3 = ((TagDto) it4.next()).getValue();
                                                if (!((value3 == null || StringsKt.gray(value3)) ? i14 : false) && (i15 = i15 + 1) < 0) {
                                                    CollectionsKt.t();
                                                    throw null;
                                                }
                                            }
                                        }
                                        str8 = null;
                                    } else {
                                        str8 = null;
                                        i15 = 0;
                                    }
                                    if (i15 > i14) {
                                        z17 = true;
                                        orderDisplayId = orderTask.getOrderDisplayId();
                                        if (orderDisplayId != null) {
                                            if (StringsKt.gray(orderDisplayId)) {
                                                orderDisplayId = str8;
                                            }
                                            if (orderDisplayId != null) {
                                                string3 = orderDisplayId;
                                                return new C0838c(string5, str12, str, enumC0839d2, string3, !z17 ? str8 : str7, CollectionsKt.emptyList(), CollectionsKt.emptyList(), c0841f, z11, str6, str16, str13, c1726f2, z15, c1726f3, list2, str5, f03.alpha, f03.bravo, f03.charlie, f03.echo, f03.delta, juliet, quebec, z16, z29, str15, string7, list3);
                                            }
                                        }
                                        Integer orderId = orderTask.getOrderId();
                                        string3 = orderId != null ? context.getString(R.string.order_number_s, String.valueOf(orderId.intValue())) : str8;
                                        return new C0838c(string5, str12, str, enumC0839d2, string3, !z17 ? str8 : str7, CollectionsKt.emptyList(), CollectionsKt.emptyList(), c0841f, z11, str6, str16, str13, c1726f2, z15, c1726f3, list2, str5, f03.alpha, f03.bravo, f03.charlie, f03.echo, f03.delta, juliet, quebec, z16, z29, str15, string7, list3);
                                    }
                                }
                                z17 = false;
                                orderDisplayId = orderTask.getOrderDisplayId();
                                if (orderDisplayId != null) {
                                }
                                Integer orderId2 = orderTask.getOrderId();
                                if (orderId2 != null) {
                                }
                                return new C0838c(string5, str12, str, enumC0839d2, string3, !z17 ? str8 : str7, CollectionsKt.emptyList(), CollectionsKt.emptyList(), c0841f, z11, str6, str16, str13, c1726f2, z15, c1726f3, list2, str5, f03.alpha, f03.bravo, f03.charlie, f03.echo, f03.delta, juliet, quebec, z16, z29, str15, string7, list3);
                            }
                        }
                        z16 = false;
                        List<String> deliveryProofImages3 = orderTask.getDeliveryProofImages();
                        if (deliveryProofImages3 == null) {
                        }
                        if (z16) {
                        }
                        if (!z16) {
                        }
                        if (!z16) {
                        }
                        List list32 = emptyList2;
                        OrderAddress address22 = orderTask.getAddress();
                        if (address22 != null) {
                        }
                        Platform platform72 = order.getPlatform();
                        if (platform72 != null) {
                        }
                        if ((obj2 != null || StringsKt.gray(obj2)) ? i14 : false) {
                        }
                        if (obj2 != null) {
                        }
                        if (orderTask.getTaskType() != TaskType.PICK_UP) {
                        }
                        if (z2) {
                        }
                        str8 = null;
                        z17 = false;
                        orderDisplayId = orderTask.getOrderDisplayId();
                        if (orderDisplayId != null) {
                        }
                        Integer orderId22 = orderTask.getOrderId();
                        if (orderId22 != null) {
                        }
                        return new C0838c(string5, str12, str, enumC0839d2, string3, !z17 ? str8 : str7, CollectionsKt.emptyList(), CollectionsKt.emptyList(), c0841f, z11, str6, str16, str13, c1726f2, z15, c1726f3, list2, str5, f03.alpha, f03.bravo, f03.charlie, f03.echo, f03.delta, juliet, quebec, z16, z29, str15, string7, list32);
                    }
                    z13 = false;
                    if (areEqual2) {
                    }
                    Yb.F0 f022 = new Yb.F0(z28, areEqual, areEqual2, z13, z14);
                    if (!s6.H0.charlie(order, orderTask)) {
                    }
                    f022 = new Yb.F0(false, areEqual, areEqual2, z13, z14);
                    Yb.F0 f032 = f022;
                    if (!s6.H0.charlie(order, orderTask)) {
                    }
                    z15 = z10;
                    if (orderTask.getTaskType() == TaskType.DELIVERY) {
                        platform = order.getPlatform();
                        if ((platform != null || (settings = platform.getSettings()) == null) ? false : Intrinsics.areEqual(settings.getDeliveryTaskConfirmationImageRequired(), Boolean.TRUE)) {
                        }
                    }
                    z16 = false;
                    List<String> deliveryProofImages32 = orderTask.getDeliveryProofImages();
                    if (deliveryProofImages32 == null) {
                    }
                    if (z16) {
                    }
                    if (!z16) {
                    }
                    if (!z16) {
                    }
                    List list322 = emptyList2;
                    OrderAddress address222 = orderTask.getAddress();
                    if (address222 != null) {
                    }
                    Platform platform722 = order.getPlatform();
                    if (platform722 != null) {
                    }
                    if ((obj2 != null || StringsKt.gray(obj2)) ? i14 : false) {
                    }
                    if (obj2 != null) {
                    }
                    if (orderTask.getTaskType() != TaskType.PICK_UP) {
                    }
                    if (z2) {
                    }
                    str8 = null;
                    z17 = false;
                    orderDisplayId = orderTask.getOrderDisplayId();
                    if (orderDisplayId != null) {
                    }
                    Integer orderId222 = orderTask.getOrderId();
                    if (orderId222 != null) {
                    }
                    return new C0838c(string5, str12, str, enumC0839d2, string3, !z17 ? str8 : str7, CollectionsKt.emptyList(), CollectionsKt.emptyList(), c0841f, z11, str6, str16, str13, c1726f2, z15, c1726f3, list2, str5, f032.alpha, f032.bravo, f032.charlie, f032.echo, f032.delta, juliet, quebec, z16, z29, str15, string7, list322);
                }
                str5 = null;
                Integer id32 = orderTask.getId();
                if (id32 == null) {
                }
                handshakeItems = orderTask.getHandshakeItems();
                if (handshakeItems != null) {
                }
                z10 = booleanValue;
                i14 = 1;
                c0841f = null;
                payAtPickup = orderTask.getPayAtPickup();
                if ((payAtPickup == null ? payAtPickup.floatValue() : 0.0f) <= 0.0f) {
                }
                if (orderTask.getTaskType() != TaskType.PICK_UP) {
                }
                if (z11) {
                }
                if (z2) {
                }
                if (z23) {
                }
                boolean z252 = pickupVisibilityFlags.alpha;
                if (z23) {
                }
                if (s6.H0.charlie(order, orderTask)) {
                }
                emptyList = CollectionsKt.emptyList();
                List list22 = emptyList;
                String quebec2 = L9.d.quebec(context, orderTask.generateImageId());
                String juliet2 = L9.d.juliet(context, orderTask.generateImageId());
                if (quebec2 == null) {
                }
                if (juliet2 == null) {
                }
                Platform platform52 = order.getPlatform();
                if (platform52 != null) {
                }
                Platform platform62 = order.getPlatform();
                if (platform62 != null) {
                }
                TaskStatus taskStatus42 = orderTask.getTaskStatus();
                TaskStatus taskStatus52 = TaskStatus.STARTED;
                float f52 = floatValue;
                if (orderTask.getTaskType() != TaskType.PICK_UP) {
                }
                if (areEqual) {
                }
                z13 = false;
                if (areEqual2) {
                }
                Yb.F0 f0222 = new Yb.F0(z28, areEqual, areEqual2, z13, z14);
                if (!s6.H0.charlie(order, orderTask)) {
                }
                f0222 = new Yb.F0(false, areEqual, areEqual2, z13, z14);
                Yb.F0 f0322 = f0222;
                if (!s6.H0.charlie(order, orderTask)) {
                }
                z15 = z10;
                if (orderTask.getTaskType() == TaskType.DELIVERY) {
                }
                z16 = false;
                List<String> deliveryProofImages322 = orderTask.getDeliveryProofImages();
                if (deliveryProofImages322 == null) {
                }
                if (z16) {
                }
                if (!z16) {
                }
                if (!z16) {
                }
                List list3222 = emptyList2;
                OrderAddress address2222 = orderTask.getAddress();
                if (address2222 != null) {
                }
                Platform platform7222 = order.getPlatform();
                if (platform7222 != null) {
                }
                if ((obj2 != null || StringsKt.gray(obj2)) ? i14 : false) {
                }
                if (obj2 != null) {
                }
                if (orderTask.getTaskType() != TaskType.PICK_UP) {
                }
                if (z2) {
                }
                str8 = null;
                z17 = false;
                orderDisplayId = orderTask.getOrderDisplayId();
                if (orderDisplayId != null) {
                }
                Integer orderId2222 = orderTask.getOrderId();
                if (orderId2222 != null) {
                }
                return new C0838c(string5, str12, str, enumC0839d2, string3, !z17 ? str8 : str7, CollectionsKt.emptyList(), CollectionsKt.emptyList(), c0841f, z11, str6, str16, str13, c1726f2, z15, c1726f3, list22, str5, f0322.alpha, f0322.bravo, f0322.charlie, f0322.echo, f0322.delta, juliet2, quebec2, z16, z29, str15, string7, list3222);
            }
            triple2 = triple;
            String str132 = (String) triple2.first;
            C1726f c1726f22 = (C1726f) triple2.second;
            boolean booleanValue2 = ((Boolean) triple2.third).booleanValue();
            TaskType taskType42 = orderTask.getTaskType();
            if (taskType42 == null) {
            }
            if (i13 == 3) {
            }
            c1726f = AbstractC0836a.bravo;
            C1726f c1726f32 = c1726f;
            address = orderTask.getAddress();
            if (address != null) {
            }
            str5 = null;
            Integer id322 = orderTask.getId();
            if (id322 == null) {
            }
            handshakeItems = orderTask.getHandshakeItems();
            if (handshakeItems != null) {
            }
            z10 = booleanValue2;
            i14 = 1;
            c0841f = null;
            payAtPickup = orderTask.getPayAtPickup();
            if ((payAtPickup == null ? payAtPickup.floatValue() : 0.0f) <= 0.0f) {
            }
            if (orderTask.getTaskType() != TaskType.PICK_UP) {
            }
            if (z11) {
            }
            if (z2) {
            }
            if (z23) {
            }
            boolean z2522 = pickupVisibilityFlags.alpha;
            if (z23) {
            }
            if (s6.H0.charlie(order, orderTask)) {
            }
            emptyList = CollectionsKt.emptyList();
            List list222 = emptyList;
            String quebec22 = L9.d.quebec(context, orderTask.generateImageId());
            String juliet22 = L9.d.juliet(context, orderTask.generateImageId());
            if (quebec22 == null) {
            }
            if (juliet22 == null) {
            }
            Platform platform522 = order.getPlatform();
            if (platform522 != null) {
            }
            Platform platform622 = order.getPlatform();
            if (platform622 != null) {
            }
            TaskStatus taskStatus422 = orderTask.getTaskStatus();
            TaskStatus taskStatus522 = TaskStatus.STARTED;
            float f522 = floatValue;
            if (orderTask.getTaskType() != TaskType.PICK_UP) {
            }
            if (areEqual) {
            }
            z13 = false;
            if (areEqual2) {
            }
            Yb.F0 f02222 = new Yb.F0(z28, areEqual, areEqual2, z13, z14);
            if (!s6.H0.charlie(order, orderTask)) {
            }
            f02222 = new Yb.F0(false, areEqual, areEqual2, z13, z14);
            Yb.F0 f03222 = f02222;
            if (!s6.H0.charlie(order, orderTask)) {
            }
            z15 = z10;
            if (orderTask.getTaskType() == TaskType.DELIVERY) {
            }
            z16 = false;
            List<String> deliveryProofImages3222 = orderTask.getDeliveryProofImages();
            if (deliveryProofImages3222 == null) {
            }
            if (z16) {
            }
            if (!z16) {
            }
            if (!z16) {
            }
            List list32222 = emptyList2;
            OrderAddress address22222 = orderTask.getAddress();
            if (address22222 != null) {
            }
            Platform platform72222 = order.getPlatform();
            if (platform72222 != null) {
            }
            if ((obj2 != null || StringsKt.gray(obj2)) ? i14 : false) {
            }
            if (obj2 != null) {
            }
            if (orderTask.getTaskType() != TaskType.PICK_UP) {
            }
            if (z2) {
            }
            str8 = null;
            z17 = false;
            orderDisplayId = orderTask.getOrderDisplayId();
            if (orderDisplayId != null) {
            }
            Integer orderId22222 = orderTask.getOrderId();
            if (orderId22222 != null) {
            }
            return new C0838c(string5, str12, str, enumC0839d2, string3, !z17 ? str8 : str7, CollectionsKt.emptyList(), CollectionsKt.emptyList(), c0841f, z11, str6, str16, str132, c1726f22, z15, c1726f32, list222, str5, f03222.alpha, f03222.bravo, f03222.charlie, f03222.echo, f03222.delta, juliet22, quebec22, z16, z29, str15, string7, list32222);
        }
        str = string;
        Intrinsics.checkNotNull(str);
        tasks = order.getTasks();
        if (tasks == null) {
        }
        it = tasks.iterator();
        i4 = 0;
        while (true) {
            if (it.hasNext()) {
            }
            i4++;
        }
        Integer valueOf8 = Integer.valueOf(i4);
        if (i4 < 0) {
        }
        int intValue4 = (valueOf8 == null ? valueOf8.intValue() : i5) + 1;
        size = tasks.size();
        if (size < 1) {
        }
        String magenta2 = StringsKt.magenta(StringsKt.b(str).toString(), ":");
        Integer valueOf22 = Integer.valueOf(intValue4);
        Integer valueOf32 = Integer.valueOf(size);
        Object[] objArr5 = new Object[3];
        objArr5[i5] = magenta2;
        objArr5[1] = valueOf22;
        objArr5[2] = valueOf32;
        String string52 = context.getString(R.string.task_card_title_with_index, objArr5);
        Intrinsics.delta(string52, "getString(...)");
        TaskType taskType22 = orderTask.getTaskType();
        if (taskType22 != null) {
        }
        if (i10 != 1) {
        }
        description = orderTask.getDescription();
        if (description == null) {
        }
        if (orderTask.getTaskType() != TaskType.ON_DEMAND_PICK_UP) {
        }
        Intrinsics.checkNotNull(string2);
        pair = new Pair(description, string2);
        String str122 = (String) pair.second;
        TaskType taskType32 = orderTask.getTaskType();
        if (taskType32 != null) {
        }
        if (i11 != 1) {
        }
        TaskStatus taskStatus22 = orderTask.getTaskStatus();
        if (taskStatus22 != null) {
        }
        if (i12 != 1) {
        }
        triple2 = triple;
        String str1322 = (String) triple2.first;
        C1726f c1726f222 = (C1726f) triple2.second;
        boolean booleanValue22 = ((Boolean) triple2.third).booleanValue();
        TaskType taskType422 = orderTask.getTaskType();
        if (taskType422 == null) {
        }
        if (i13 == 3) {
        }
        c1726f = AbstractC0836a.bravo;
        C1726f c1726f322 = c1726f;
        address = orderTask.getAddress();
        if (address != null) {
        }
        str5 = null;
        Integer id3222 = orderTask.getId();
        if (id3222 == null) {
        }
        handshakeItems = orderTask.getHandshakeItems();
        if (handshakeItems != null) {
        }
        z10 = booleanValue22;
        i14 = 1;
        c0841f = null;
        payAtPickup = orderTask.getPayAtPickup();
        if ((payAtPickup == null ? payAtPickup.floatValue() : 0.0f) <= 0.0f) {
        }
        if (orderTask.getTaskType() != TaskType.PICK_UP) {
        }
        if (z11) {
        }
        if (z2) {
        }
        if (z23) {
        }
        boolean z25222 = pickupVisibilityFlags.alpha;
        if (z23) {
        }
        if (s6.H0.charlie(order, orderTask)) {
        }
        emptyList = CollectionsKt.emptyList();
        List list2222 = emptyList;
        String quebec222 = L9.d.quebec(context, orderTask.generateImageId());
        String juliet222 = L9.d.juliet(context, orderTask.generateImageId());
        if (quebec222 == null) {
        }
        if (juliet222 == null) {
        }
        Platform platform5222 = order.getPlatform();
        if (platform5222 != null) {
        }
        Platform platform6222 = order.getPlatform();
        if (platform6222 != null) {
        }
        TaskStatus taskStatus4222 = orderTask.getTaskStatus();
        TaskStatus taskStatus5222 = TaskStatus.STARTED;
        float f5222 = floatValue;
        if (orderTask.getTaskType() != TaskType.PICK_UP) {
        }
        if (areEqual) {
        }
        z13 = false;
        if (areEqual2) {
        }
        Yb.F0 f022222 = new Yb.F0(z28, areEqual, areEqual2, z13, z14);
        if (!s6.H0.charlie(order, orderTask)) {
        }
        f022222 = new Yb.F0(false, areEqual, areEqual2, z13, z14);
        Yb.F0 f032222 = f022222;
        if (!s6.H0.charlie(order, orderTask)) {
        }
        z15 = z10;
        if (orderTask.getTaskType() == TaskType.DELIVERY) {
        }
        z16 = false;
        List<String> deliveryProofImages32222 = orderTask.getDeliveryProofImages();
        if (deliveryProofImages32222 == null) {
        }
        if (z16) {
        }
        if (!z16) {
        }
        if (!z16) {
        }
        List list322222 = emptyList2;
        OrderAddress address222222 = orderTask.getAddress();
        if (address222222 != null) {
        }
        Platform platform722222 = order.getPlatform();
        if (platform722222 != null) {
        }
        if ((obj2 != null || StringsKt.gray(obj2)) ? i14 : false) {
        }
        if (obj2 != null) {
        }
        if (orderTask.getTaskType() != TaskType.PICK_UP) {
        }
        if (z2) {
        }
        str8 = null;
        z17 = false;
        orderDisplayId = orderTask.getOrderDisplayId();
        if (orderDisplayId != null) {
        }
        Integer orderId222222 = orderTask.getOrderId();
        if (orderId222222 != null) {
        }
        return new C0838c(string52, str122, str, enumC0839d2, string3, !z17 ? str8 : str7, CollectionsKt.emptyList(), CollectionsKt.emptyList(), c0841f, z11, str6, str16, str1322, c1726f222, z15, c1726f322, list2222, str5, f032222.alpha, f032222.bravo, f032222.charlie, f032222.echo, f032222.delta, juliet222, quebec222, z16, z29, str15, string7, list322222);
    }
}
