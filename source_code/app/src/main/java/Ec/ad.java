package Ec;

import B9.L;
import com.app.network.network.models.FintechAccount;
import com.app.network.network.models.ShiftSummary;
import delivery.samurai.android.R;
import i.C1860i;
import i.InterfaceC1869r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import sd.AbstractC2850a;

/* loaded from: classes2.dex */
public final /* synthetic */ class ad implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ ad(Object obj, boolean z2, int i4) {
        this.alpha = i4;
        this.red = obj;
        this.purple = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Object obj2;
        Object obj3;
        String str2;
        String referenceId;
        switch (this.alpha) {
            case 0:
                InterfaceC1869r LazyColumn = (InterfaceC1869r) obj;
                Intrinsics.echo(LazyColumn, "$this$LazyColumn");
                List list = (List) this.red;
                int i4 = 0;
                for (Object obj4 : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ShiftSummary shiftSummary = (ShiftSummary) obj4;
                    String sierra = ap.sierra(shiftSummary);
                    ShiftSummary shiftSummary2 = (ShiftSummary) CollectionsKt.jade(i4 - 1, list);
                    if (shiftSummary2 != null) {
                        str = ap.sierra(shiftSummary2);
                    } else {
                        str = null;
                    }
                    if (!Intrinsics.areEqual(sierra, str)) {
                        com.google.android.material.datepicker.j.bravo(LazyColumn, "header_" + sierra + "_" + i4, new P.d(new ai(sierra, 0), -694964863, true), 2);
                    }
                    com.google.android.material.datepicker.j.bravo(LazyColumn, ao.ad.zulu(i4, "card_"), new P.d(new aj(shiftSummary, 0), 1441927036, true), 2);
                    i4 = i5;
                }
                if (this.purple) {
                    com.google.android.material.datepicker.j.bravo(LazyColumn, "loading", t.kilo, 2);
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC1869r LazyColumn2 = (InterfaceC1869r) obj;
                Intrinsics.echo(LazyColumn2, "$this$LazyColumn");
                for (Map.Entry entry : ((LinkedHashMap) this.red).entrySet()) {
                    String str3 = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    com.google.android.material.datepicker.j.bravo(LazyColumn2, null, new P.d(new ai(str3, 3), 1107368337, true), 3);
                    ((C1860i) LazyColumn2).quebec(list2.size(), null, new Cb.m(5, list2), new P.d(new Cb.n(1, list2), 2039820996, true));
                }
                if (this.purple) {
                    com.google.android.material.datepicker.j.bravo(LazyColumn2, null, Jc.a.bravo, 3);
                }
                return Unit.INSTANCE;
            case 2:
                C2492a c2492a = (C2492a) obj;
                int i10 = c2492a.alpha;
                ga.u uVar = (ga.u) this.red;
                if (i10 != 0) {
                    if (i10 == 1) {
                        List list3 = (List) c2492a.charlie;
                        if (list3 == null) {
                            list3 = CollectionsKt.emptyList();
                        }
                        Iterator it = list3.iterator();
                        while (true) {
                            obj2 = null;
                            if (it.hasNext()) {
                                obj3 = it.next();
                                String accountType = ((FintechAccount) obj3).getAccountType();
                                if (accountType == null || !accountType.equalsIgnoreCase("UR_PAY")) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        FintechAccount fintechAccount = (FintechAccount) obj3;
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                String accountType2 = ((FintechAccount) next).getAccountType();
                                if (accountType2 != null && accountType2.equalsIgnoreCase("STC_PAY")) {
                                    obj2 = next;
                                }
                            }
                        }
                        FintechAccount fintechAccount2 = (FintechAccount) obj2;
                        String str4 = "-";
                        if (fintechAccount2 != null) {
                            L quebec = uVar.quebec();
                            String accountId = fintechAccount2.getAccountId();
                            if (accountId == null) {
                                accountId = "-";
                            }
                            quebec.f174p.setText(accountId);
                            int i11 = 0;
                            uVar.quebec().f169k.setVisibility(0);
                            uVar.quebec().f174p.setVisibility(0);
                            L quebec2 = uVar.quebec();
                            if (!this.purple) {
                                i11 = 4;
                            }
                            quebec2.f165g.setVisibility(i11);
                        } else {
                            uVar.quebec().f169k.setVisibility(8);
                            uVar.quebec().f174p.setVisibility(8);
                        }
                        L quebec3 = uVar.quebec();
                        if (fintechAccount == null || (str2 = fintechAccount.getAccountId()) == null) {
                            str2 = "-";
                        }
                        quebec3.f176r.setText(str2);
                        L quebec4 = uVar.quebec();
                        if (fintechAccount != null && (referenceId = fintechAccount.getReferenceId()) != null) {
                            str4 = referenceId;
                        }
                        quebec4.f175q.setText(str4);
                    }
                } else {
                    L9.d.peach(R.string.error_something_went_wrong, uVar.kilo());
                }
                return Unit.INSTANCE;
            default:
                Byte b2 = (Byte) obj;
                byte byteValue = b2.byteValue();
                boolean contains = AbstractC2850a.alpha.contains(b2);
                StringBuilder sb2 = (StringBuilder) this.red;
                if (!contains && !AbstractC2850a.echo.contains(b2)) {
                    if (this.purple && byteValue == 32) {
                        sb2.append('+');
                    } else {
                        sb2.append(AbstractC2850a.hotel(byteValue));
                    }
                } else {
                    sb2.append((char) byteValue);
                }
                return Unit.INSTANCE;
        }
    }
}
