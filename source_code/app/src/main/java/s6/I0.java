package s6;

import F.AbstractC0122j1;
import F.AbstractC0149q0;
import F.C0103e2;
import Jb.C0195c;
import a0.C0366t;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.app.network.network.models.Country;
import com.app.network.network.models.Currency;
import com.app.network.network.models.Item;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Platform;
import com.app.network.network.models.TaskItemCustomization;
import com.app.network.network.models.TaskType;
import com.google.mlkit.vision.barcode.common.Barcode;
import db.C1603c;
import delivery.samurai.android.R;
import ec.C1648a;
import ec.C1649b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public abstract class I0 {
    public static final void alpha(P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        P.d dVar2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-131298801);
        int i5 = i4 | 6;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            dVar2 = dVar;
            AbstractC0149q0.alpha(Db.c.cyan, Db.e.alpha, Db.g.bravo, dVar2, c0585q, 3504, 0);
        } else {
            dVar2 = dVar;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Db.b(dVar2, i4, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x054c, code lost:
    
        if (r8 > 0.0d) goto L245;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0578  */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(androidx.compose.runtime.ax orderState, androidx.compose.runtime.ax cashierItemListTaskState, androidx.compose.runtime.ax introOrderIdState, androidx.compose.runtime.ax invoiceHandoverWarningState, androidx.compose.runtime.ax inputAmountTaskState, Xd.l onAmountConfirmed, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        C0585q c0585q;
        Double d4;
        Order order;
        String str;
        boolean z10;
        Object obj;
        Order order2;
        Integer num;
        boolean z11;
        boolean z12;
        Object obj2;
        String str2;
        String str3;
        int i15;
        String str4;
        Integer num2;
        int i16;
        Context context;
        Object obj3;
        boolean z13;
        Context context2;
        String str5;
        String str6;
        Platform platform;
        Country country;
        Currency currency;
        List<OrderTask> tasks;
        Object obj4;
        Float payAtPickup;
        C0585q c0585q2;
        Context context3;
        String str7;
        String str8;
        Context context4;
        String str9;
        String str10;
        Iterator it;
        C1603c c1603c;
        String str11;
        String str12;
        int i17;
        Iterator it2;
        Context context5;
        String str13;
        String str14;
        db.m mVar;
        String str15;
        int i18;
        String str16;
        Object obj5;
        boolean z14;
        C0585q c0585q3;
        boolean z15;
        Context context6;
        String str17;
        ?? r32;
        Integer id2;
        ?? r33;
        boolean z16;
        ?? r10;
        boolean z17;
        Object jade;
        androidx.compose.runtime.ax axVar;
        String str18;
        boolean z18;
        int i19 = 1;
        Intrinsics.echo(orderState, "orderState");
        Intrinsics.echo(cashierItemListTaskState, "cashierItemListTaskState");
        Intrinsics.echo(introOrderIdState, "introOrderIdState");
        Intrinsics.echo(invoiceHandoverWarningState, "invoiceHandoverWarningState");
        Intrinsics.echo(inputAmountTaskState, "inputAmountTaskState");
        Intrinsics.echo(onAmountConfirmed, "onAmountConfirmed");
        C0585q c0585q4 = (C0585q) interfaceC0581m;
        c0585q4.silver(-601035595);
        if (c0585q4.golf(orderState)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i20 = i4 | i5;
        if (c0585q4.golf(cashierItemListTaskState)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i21 = i20 | i10;
        if (c0585q4.golf(introOrderIdState)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i22 = i21 | i11;
        if (c0585q4.golf(invoiceHandoverWarningState)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i23 = i22 | i12;
        if (c0585q4.golf(inputAmountTaskState)) {
            i13 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i13 = 8192;
        }
        int i24 = i23 | i13;
        if (c0585q4.india(onAmountConfirmed)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i25 = i24 | i14;
        if ((74899 & i25) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q4.magenta(i25 & 1, z2)) {
            Context context7 = (Context) c0585q4.kilo(AndroidCompositionLocals_androidKt.bravo);
            Integer num3 = (Integer) ((androidx.compose.runtime.t0) introOrderIdState).getValue();
            Object obj6 = C0580l.alpha;
            String str19 = "";
            if (num3 == null) {
                c0585q4.purple(267783393);
                c0585q4.quebec(false);
                str6 = "on_demand_amounts";
                str4 = "context";
                z13 = false;
                obj2 = obj6;
                c0585q2 = c0585q4;
                i15 = i25;
                context2 = context7;
                str5 = "amount_for_order_";
            } else {
                c0585q4.purple(267783394);
                int intValue = num3.intValue();
                boolean echo = c0585q4.echo(intValue);
                Object jade2 = c0585q4.jade();
                if (echo || jade2 == obj6) {
                    Intrinsics.echo(context7, "context");
                    SharedPreferences sharedPreferences = context7.getSharedPreferences("on_demand_amounts", 0);
                    if (!sharedPreferences.contains("amount_for_order_" + intValue)) {
                        jade2 = null;
                    } else {
                        jade2 = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("amount_for_order_" + intValue, 0L)));
                    }
                    c0585q4.f(jade2);
                }
                Double d9 = (Double) jade2;
                androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) orderState;
                Order order3 = (Order) t0Var.getValue();
                if (order3 != null && (tasks = order3.getTasks()) != null) {
                    Iterator it3 = tasks.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj4 = it3.next();
                            OrderTask orderTask = (OrderTask) obj4;
                            if (orderTask.getTaskType() == TaskType.PICK_UP || orderTask.getTaskType() == TaskType.ON_DEMAND_PICK_UP) {
                                break;
                            }
                        } else {
                            obj4 = null;
                            break;
                        }
                    }
                    OrderTask orderTask2 = (OrderTask) obj4;
                    if (orderTask2 != null && (payAtPickup = orderTask2.getPayAtPickup()) != null) {
                        d4 = Double.valueOf(payAtPickup.floatValue());
                        if (d9 != null) {
                            if (d9.doubleValue() <= 0.0d) {
                                d9 = null;
                            }
                            if (d9 != null) {
                                d4 = d9;
                                order = (Order) t0Var.getValue();
                                if (order == null && (platform = order.getPlatform()) != null && (country = platform.getCountry()) != null && (currency = country.getCurrency()) != null) {
                                    str = currency.getLocalizedName();
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                if (d4 == null && d4.doubleValue() > 0.0d) {
                                    z10 = false;
                                    obj = obj6;
                                    str = context7.getString(R.string.pay_amount, Float.valueOf((float) d4.doubleValue()), str);
                                } else {
                                    z10 = false;
                                    obj = obj6;
                                }
                                Intrinsics.checkNotNull(str);
                                order2 = (Order) t0Var.getValue();
                                if (order2 != null) {
                                    num = order2.getAllocationWindowId();
                                } else {
                                    num = null;
                                }
                                boolean india = c0585q4.india(context7) | c0585q4.echo(intValue) | c0585q4.golf(num);
                                if ((i25 & 896) == 256) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                z12 = india | z11;
                                Object jade3 = c0585q4.jade();
                                if (!z12) {
                                    obj2 = obj;
                                    if (jade3 != obj2) {
                                        str2 = "on_demand_amounts";
                                        str3 = "amount_for_order_";
                                        num2 = num;
                                        obj3 = jade3;
                                        i15 = i25;
                                        context = context7;
                                        i16 = intValue;
                                        str4 = "context";
                                        Function0 function0 = (Function0) obj3;
                                        String str20 = str3;
                                        boolean z19 = z10;
                                        U0.t tVar = new U0.t(z19, z19, z19);
                                        Integer num4 = num2;
                                        int i26 = i16;
                                        Context context8 = context;
                                        String str21 = str;
                                        z13 = z10;
                                        Gb.j jVar = new Gb.j(str21, context8, i26, num4, introOrderIdState);
                                        context2 = context8;
                                        str5 = str20;
                                        str6 = str2;
                                        E7.alpha(function0, tVar, P.e.echo(-948032140, jVar, c0585q4), c0585q4, 432, 0);
                                        C0585q c0585q5 = c0585q4;
                                        c0585q5.quebec(z13);
                                        c0585q2 = c0585q5;
                                    }
                                } else {
                                    obj2 = obj;
                                }
                                str3 = "amount_for_order_";
                                num2 = num;
                                str4 = "context";
                                str2 = "on_demand_amounts";
                                i15 = i25;
                                context = context7;
                                i16 = intValue;
                                obj3 = new C1648a(context, i16, num2, introOrderIdState, 0);
                                c0585q4.f(obj3);
                                Function0 function02 = (Function0) obj3;
                                String str202 = str3;
                                boolean z192 = z10;
                                U0.t tVar2 = new U0.t(z192, z192, z192);
                                Integer num42 = num2;
                                int i262 = i16;
                                Context context82 = context;
                                String str212 = str;
                                z13 = z10;
                                Gb.j jVar2 = new Gb.j(str212, context82, i262, num42, introOrderIdState);
                                context2 = context82;
                                str5 = str202;
                                str6 = str2;
                                E7.alpha(function02, tVar2, P.e.echo(-948032140, jVar2, c0585q4), c0585q4, 432, 0);
                                C0585q c0585q52 = c0585q4;
                                c0585q52.quebec(z13);
                                c0585q2 = c0585q52;
                            }
                        }
                        if (d4 != null || d4.doubleValue() <= 0.0d) {
                            d4 = null;
                        }
                        order = (Order) t0Var.getValue();
                        if (order == null) {
                        }
                        str = null;
                        if (str == null) {
                        }
                        if (d4 == null) {
                        }
                        z10 = false;
                        obj = obj6;
                        Intrinsics.checkNotNull(str);
                        order2 = (Order) t0Var.getValue();
                        if (order2 != null) {
                        }
                        boolean india2 = c0585q4.india(context7) | c0585q4.echo(intValue) | c0585q4.golf(num);
                        if ((i25 & 896) == 256) {
                        }
                        z12 = india2 | z11;
                        Object jade32 = c0585q4.jade();
                        if (!z12) {
                        }
                        str3 = "amount_for_order_";
                        num2 = num;
                        str4 = "context";
                        str2 = "on_demand_amounts";
                        i15 = i25;
                        context = context7;
                        i16 = intValue;
                        obj3 = new C1648a(context, i16, num2, introOrderIdState, 0);
                        c0585q4.f(obj3);
                        Function0 function022 = (Function0) obj3;
                        String str2022 = str3;
                        boolean z1922 = z10;
                        U0.t tVar22 = new U0.t(z1922, z1922, z1922);
                        Integer num422 = num2;
                        int i2622 = i16;
                        Context context822 = context;
                        String str2122 = str;
                        z13 = z10;
                        Gb.j jVar22 = new Gb.j(str2122, context822, i2622, num422, introOrderIdState);
                        context2 = context822;
                        str5 = str2022;
                        str6 = str2;
                        E7.alpha(function022, tVar22, P.e.echo(-948032140, jVar22, c0585q4), c0585q4, 432, 0);
                        C0585q c0585q522 = c0585q4;
                        c0585q522.quebec(z13);
                        c0585q2 = c0585q522;
                    }
                }
                d4 = null;
                if (d9 != null) {
                }
                if (d4 != null) {
                }
                d4 = null;
                order = (Order) t0Var.getValue();
                if (order == null) {
                }
                str = null;
                if (str == null) {
                }
                if (d4 == null) {
                }
                z10 = false;
                obj = obj6;
                Intrinsics.checkNotNull(str);
                order2 = (Order) t0Var.getValue();
                if (order2 != null) {
                }
                boolean india22 = c0585q4.india(context7) | c0585q4.echo(intValue) | c0585q4.golf(num);
                if ((i25 & 896) == 256) {
                }
                z12 = india22 | z11;
                Object jade322 = c0585q4.jade();
                if (!z12) {
                }
                str3 = "amount_for_order_";
                num2 = num;
                str4 = "context";
                str2 = "on_demand_amounts";
                i15 = i25;
                context = context7;
                i16 = intValue;
                obj3 = new C1648a(context, i16, num2, introOrderIdState, 0);
                c0585q4.f(obj3);
                Function0 function0222 = (Function0) obj3;
                String str20222 = str3;
                boolean z19222 = z10;
                U0.t tVar222 = new U0.t(z19222, z19222, z19222);
                Integer num4222 = num2;
                int i26222 = i16;
                Context context8222 = context;
                String str21222 = str;
                z13 = z10;
                Gb.j jVar222 = new Gb.j(str21222, context8222, i26222, num4222, introOrderIdState);
                context2 = context8222;
                str5 = str20222;
                str6 = str2;
                E7.alpha(function0222, tVar222, P.e.echo(-948032140, jVar222, c0585q4), c0585q4, 432, 0);
                C0585q c0585q5222 = c0585q4;
                c0585q5222.quebec(z13);
                c0585q2 = c0585q5222;
            }
            OrderTask orderTask3 = (OrderTask) ((androidx.compose.runtime.t0) cashierItemListTaskState).getValue();
            if (orderTask3 == null) {
                c0585q2.purple(270017532);
                c0585q2.quebec(z13);
                context3 = context2;
                str7 = str5;
                str8 = str6;
            } else {
                c0585q2.purple(270017533);
                boolean golf = c0585q2.golf(orderTask3);
                Object jade4 = c0585q2.jade();
                if (!golf && jade4 != obj2) {
                    context3 = context2;
                    str7 = str5;
                    str8 = str6;
                    obj5 = jade4;
                } else {
                    List<Item> items = orderTask3.getItems();
                    if (items == null) {
                        items = CollectionsKt.emptyList();
                    }
                    Intrinsics.echo(items, "<this>");
                    ArrayList arrayList = new ArrayList();
                    Iterator it4 = items.iterator();
                    while (it4.hasNext()) {
                        Item item = (Item) it4.next();
                        String name = item.getName();
                        if (name != null) {
                            if (!StringsKt.gray(name)) {
                                str11 = name;
                            } else {
                                str11 = null;
                            }
                            if (str11 != null) {
                                String nameAr = item.getNameAr();
                                if (nameAr != null && !StringsKt.gray(nameAr)) {
                                    str12 = nameAr;
                                } else {
                                    str12 = null;
                                }
                                Integer quantity = item.getQuantity();
                                if (quantity != null) {
                                    i17 = quantity.intValue();
                                } else {
                                    i17 = 0;
                                }
                                List<TaskItemCustomization> customizations = item.getCustomizations();
                                if (customizations == null) {
                                    customizations = CollectionsKt.emptyList();
                                }
                                it = it4;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it5 = customizations.iterator();
                                while (it5.hasNext()) {
                                    TaskItemCustomization taskItemCustomization = (TaskItemCustomization) it5.next();
                                    String name2 = taskItemCustomization.getName();
                                    if (name2 != null) {
                                        if (!StringsKt.gray(name2)) {
                                            it2 = it5;
                                            str15 = name2;
                                        } else {
                                            it2 = it5;
                                            str15 = null;
                                        }
                                        if (str15 != null) {
                                            Integer quantity2 = taskItemCustomization.getQuantity();
                                            if (quantity2 != null) {
                                                int intValue2 = quantity2.intValue();
                                                str14 = str5;
                                                i18 = intValue2;
                                            } else {
                                                str14 = str5;
                                                i18 = 0;
                                            }
                                            String nameAr2 = taskItemCustomization.getNameAr();
                                            if (nameAr2 != null && !StringsKt.gray(nameAr2)) {
                                                context5 = context2;
                                                str13 = str6;
                                                str16 = nameAr2;
                                            } else {
                                                context5 = context2;
                                                str13 = str6;
                                                str16 = null;
                                            }
                                            mVar = new db.m(i18, str15, str16);
                                            if (mVar == null) {
                                                arrayList2.add(mVar);
                                            }
                                            it5 = it2;
                                            str5 = str14;
                                            str6 = str13;
                                            context2 = context5;
                                        }
                                    } else {
                                        it2 = it5;
                                    }
                                    context5 = context2;
                                    str14 = str5;
                                    str13 = str6;
                                    mVar = null;
                                    if (mVar == null) {
                                    }
                                    it5 = it2;
                                    str5 = str14;
                                    str6 = str13;
                                    context2 = context5;
                                }
                                context4 = context2;
                                str9 = str5;
                                str10 = str6;
                                c1603c = new C1603c(str11, str12, i17, arrayList2);
                                if (c1603c == null) {
                                    arrayList.add(c1603c);
                                }
                                it4 = it;
                                str5 = str9;
                                str6 = str10;
                                context2 = context4;
                            }
                        }
                        context4 = context2;
                        str9 = str5;
                        str10 = str6;
                        it = it4;
                        c1603c = null;
                        if (c1603c == null) {
                        }
                        it4 = it;
                        str5 = str9;
                        str6 = str10;
                        context2 = context4;
                    }
                    context3 = context2;
                    str7 = str5;
                    str8 = str6;
                    c0585q2.f(arrayList);
                    obj5 = arrayList;
                }
                List list = (List) obj5;
                boolean golf2 = c0585q2.golf(orderTask3);
                Object jade5 = c0585q2.jade();
                if (golf2 || jade5 == obj2) {
                    String customerOrderNote = orderTask3.getCustomerOrderNote();
                    if (customerOrderNote != null && !StringsKt.gray(customerOrderNote)) {
                        jade5 = customerOrderNote;
                    } else {
                        jade5 = null;
                    }
                    c0585q2.f(jade5);
                }
                String str22 = (String) jade5;
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                Object jade6 = c0585q2.jade();
                if (z14 || jade6 == obj2) {
                    jade6 = new Cb.u(cashierItemListTaskState, 17);
                    c0585q2.f(jade6);
                }
                E7.alpha((Function0) jade6, new U0.t(true, false, false), P.e.echo(-2039773543, new C1649b(list, cashierItemListTaskState, str22, i19), c0585q2), c0585q2, 432, 0);
                c0585q2.quebec(false);
            }
            if (((Boolean) ((androidx.compose.runtime.t0) invoiceHandoverWarningState).getValue()).booleanValue()) {
                c0585q2.purple(271113538);
                if ((i15 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                Object jade7 = c0585q2.jade();
                if (z18 || jade7 == obj2) {
                    jade7 = new Cb.u(invoiceHandoverWarningState, 18);
                    c0585q2.f(jade7);
                }
                z15 = false;
                C0585q c0585q6 = c0585q2;
                E7.alpha((Function0) jade7, new U0.t(false, false, false), P.e.echo(1875744835, new Cb.t(invoiceHandoverWarningState, 1), c0585q2), c0585q6, 432, 0);
                c0585q3 = c0585q6;
            } else {
                c0585q3 = c0585q2;
                z15 = false;
                c0585q3.purple(265301069);
            }
            c0585q3.quebec(z15);
            OrderTask orderTask4 = (OrderTask) ((androidx.compose.runtime.t0) inputAmountTaskState).getValue();
            if (orderTask4 == null) {
                c0585q3.purple(271845261);
                c0585q3.quebec(z15);
                c0585q = c0585q3;
            } else {
                c0585q3.purple(271845262);
                Integer id3 = orderTask4.getId();
                boolean golf3 = c0585q3.golf(id3);
                Object jade8 = c0585q3.jade();
                if (!golf3 && jade8 != obj2) {
                    context6 = context3;
                    str17 = null;
                } else {
                    if (id3 != null) {
                        int intValue3 = id3.intValue();
                        context6 = context3;
                        Intrinsics.echo(context6, str4);
                        str17 = null;
                        jade8 = context6.getSharedPreferences("on_demand_entered_amount", 0).getString("entered_amount_for_task_" + intValue3, null);
                    } else {
                        context6 = context3;
                        str17 = null;
                        jade8 = null;
                    }
                    c0585q3.f(jade8);
                }
                String str23 = (String) jade8;
                Float payAtPickup2 = orderTask4.getPayAtPickup();
                if (payAtPickup2 != null) {
                    float floatValue = payAtPickup2.floatValue();
                    ?? r34 = payAtPickup2;
                    if (floatValue <= 0.0f) {
                        r34 = str17;
                    }
                    if (r34 != 0) {
                        r32 = Double.valueOf(r34.floatValue());
                        if (str23 != null) {
                            if (r32 != 0) {
                                z16 = true;
                                r10 = 0;
                                str18 = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(r32.doubleValue())}, 1));
                            } else {
                                z16 = true;
                                r10 = 0;
                                str18 = str17;
                            }
                            if (str18 != null) {
                                str19 = str18;
                            }
                        } else {
                            z16 = true;
                            r10 = 0;
                            str19 = str23;
                        }
                        C0103e2 foxtrot = AbstractC0122j1.foxtrot(r10, c0585q3, r10, 3);
                        long j5 = C0366t.echo;
                        float f5 = 24;
                        C2093f delta = AbstractC2094g.delta(f5, f5);
                        if ((57344 & i15) != 16384) {
                            z17 = z16;
                        } else {
                            z17 = false;
                        }
                        jade = c0585q3.jade();
                        if (z17 && jade != obj2) {
                            axVar = inputAmountTaskState;
                        } else {
                            axVar = inputAmountTaskState;
                            jade = new Cb.u(axVar, 19);
                            c0585q3.f(jade);
                        }
                        C0585q c0585q7 = c0585q3;
                        AbstractC0122j1.alpha((Function0) jade, null, foxtrot, 0.0f, delta, j5, 0L, 0.0f, 0L, null, null, null, P.e.echo(-1162002638, new Ac.d(str19, onAmountConfirmed, orderTask4, axVar, 6), c0585q3), c0585q7, 805502976, 3530);
                        c0585q = c0585q7;
                        c0585q.quebec(false);
                    }
                }
                Order order4 = (Order) ((androidx.compose.runtime.t0) orderState).getValue();
                if (order4 != null && (id2 = order4.getId()) != null) {
                    int intValue4 = id2.intValue();
                    Intrinsics.echo(context6, str4);
                    SharedPreferences sharedPreferences2 = context6.getSharedPreferences(str8, 0);
                    String str24 = str7;
                    if (!sharedPreferences2.contains(str24 + intValue4)) {
                        r33 = str17;
                    } else {
                        r33 = Double.valueOf(Double.longBitsToDouble(sharedPreferences2.getLong(str24 + intValue4, 0L)));
                    }
                    if (r33 != 0) {
                        double doubleValue = r33.doubleValue();
                        r32 = r33;
                    }
                }
                r32 = str17;
                if (str23 != null) {
                }
                C0103e2 foxtrot2 = AbstractC0122j1.foxtrot(r10, c0585q3, r10, 3);
                long j52 = C0366t.echo;
                float f52 = 24;
                C2093f delta2 = AbstractC2094g.delta(f52, f52);
                if ((57344 & i15) != 16384) {
                }
                jade = c0585q3.jade();
                if (z17) {
                }
                axVar = inputAmountTaskState;
                jade = new Cb.u(axVar, 19);
                c0585q3.f(jade);
                C0585q c0585q72 = c0585q3;
                AbstractC0122j1.alpha((Function0) jade, null, foxtrot2, 0.0f, delta2, j52, 0L, 0.0f, 0L, null, null, null, P.e.echo(-1162002638, new Ac.d(str19, onAmountConfirmed, orderTask4, axVar, 6), c0585q3), c0585q72, 805502976, 3530);
                c0585q = c0585q72;
                c0585q.quebec(false);
            }
        } else {
            c0585q = c0585q4;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0195c(orderState, cashierItemListTaskState, introOrderIdState, invoiceHandoverWarningState, inputAmountTaskState, onAmountConfirmed, i4, 4);
        }
    }
}
