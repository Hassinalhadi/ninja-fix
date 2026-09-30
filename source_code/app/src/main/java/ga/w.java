package ga;

import Lb.C0233p;
import Lb.D;
import android.os.Bundle;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import com.app.network.network.models.Attribute;
import com.app.network.network.models.AttributeActionType;
import com.app.network.network.models.AttributeGroup;
import com.app.network.network.models.MissingAttributes;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.I0;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ac purple;

    public /* synthetic */ w(ac acVar, int i4) {
        this.alpha = i4;
        this.purple = acVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    I0.alpha(P.e.echo(-1444827273, new w(this.purple, 1), c0585q), c0585q, 48);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                if (c0585q2.magenta(intValue & 1, z10)) {
                    final ac acVar = this.purple;
                    f fVar = (f) ((t0) acVar.quebec().bravo).getValue();
                    boolean india = c0585q2.india(acVar);
                    Object jade = c0585q2.jade();
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    if (india || jade == asVar) {
                        final int i5 = 0;
                        jade = new Function0() { // from class: ga.x
                            /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
                            
                                if (r5 != null) goto L19;
                             */
                            @Override // kotlin.jvm.functions.Function0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke() {
                                AttributeGroup attributeGroup;
                                List<AttributeGroup> groups;
                                Object obj3;
                                String str = null;
                                ac acVar2 = acVar;
                                int i10 = 0;
                                switch (i5) {
                                    case 0:
                                        if (acVar2.f12676i) {
                                            String str2 = ((f) ((t0) acVar2.quebec().bravo).getValue()).echo;
                                            if (!StringsKt.gray(str2) && !Intrinsics.areEqual(str2, "-")) {
                                                str = str2;
                                            }
                                            D d4 = new D();
                                            Bundle bundle = new Bundle();
                                            bundle.putString("arg_current_value", str);
                                            d4.setArguments(bundle);
                                            d4.f1710v = new v(acVar2, i10);
                                            d4.romeo(acVar2.getChildFragmentManager(), "stc_pay_bottom_sheet");
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        MissingAttributes oscar = L9.d.oscar(acVar2.kilo().lima());
                                        if (oscar != null && (groups = oscar.getGroups()) != null) {
                                            Iterator<T> it = groups.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj3 = it.next();
                                                    acVar2.quebec();
                                                    if (MyAccountViewModel.bravo(((AttributeGroup) obj3).getGroup(), "UR_PAY")) {
                                                    }
                                                } else {
                                                    obj3 = null;
                                                }
                                            }
                                            attributeGroup = (AttributeGroup) obj3;
                                            break;
                                        }
                                        attributeGroup = new AttributeGroup();
                                        attributeGroup.setGroup("UR_PAY");
                                        attributeGroup.setActionType(AttributeActionType.RECOMMENDED);
                                        attributeGroup.setActionText(null);
                                        attributeGroup.setActionDescription(null);
                                        attributeGroup.setTitle(acVar2.getString(R.string.urpay_sheet_title));
                                        attributeGroup.setSectionLabel(acVar2.getString(R.string.urpay_section_label));
                                        attributeGroup.setWarningText(acVar2.getString(R.string.urpay_warning_text));
                                        attributeGroup.setSuccessMessage(null);
                                        attributeGroup.setOtpTitle(null);
                                        attributeGroup.setOtpSubtitle(null);
                                        attributeGroup.setOtpDescription(null);
                                        attributeGroup.setRequiresOtpVerification(false);
                                        Attribute attribute = new Attribute();
                                        attribute.setKey("UR_PAY_ACCOUNT_IBAN");
                                        attribute.setDisplayName(acVar2.getString(R.string.urpay_iban));
                                        attribute.setHint(acVar2.getString(R.string.hint_urpay_iban));
                                        attribute.setInputType("TEXT");
                                        Attribute attribute2 = new Attribute();
                                        attribute2.setKey("UR_PAY_ID_NUMBER");
                                        attribute2.setDisplayName(acVar2.getString(R.string.urpay_id_label));
                                        attribute2.setHint(acVar2.getString(R.string.urpay_id_hint));
                                        attribute2.setInputType("NUMBER");
                                        attributeGroup.setAttributes(CollectionsKt.listOf(attribute, attribute2));
                                        C0233p c0233p = new C0233p();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("arg_group", new com.google.gson.l().india(attributeGroup));
                                        c0233p.setArguments(bundle2);
                                        c0233p.f1811w = new v(acVar2, 5);
                                        c0233p.romeo(acVar2.getChildFragmentManager(), "missing_attr_sheet");
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q2.f(jade);
                    }
                    Function0 function0 = (Function0) jade;
                    boolean india2 = c0585q2.india(acVar);
                    Object jade2 = c0585q2.jade();
                    if (india2 || jade2 == asVar) {
                        final int i10 = 1;
                        jade2 = new Function0() { // from class: ga.x
                            /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
                            
                                if (r5 != null) goto L19;
                             */
                            @Override // kotlin.jvm.functions.Function0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke() {
                                AttributeGroup attributeGroup;
                                List<AttributeGroup> groups;
                                Object obj3;
                                String str = null;
                                ac acVar2 = acVar;
                                int i102 = 0;
                                switch (i10) {
                                    case 0:
                                        if (acVar2.f12676i) {
                                            String str2 = ((f) ((t0) acVar2.quebec().bravo).getValue()).echo;
                                            if (!StringsKt.gray(str2) && !Intrinsics.areEqual(str2, "-")) {
                                                str = str2;
                                            }
                                            D d4 = new D();
                                            Bundle bundle = new Bundle();
                                            bundle.putString("arg_current_value", str);
                                            d4.setArguments(bundle);
                                            d4.f1710v = new v(acVar2, i102);
                                            d4.romeo(acVar2.getChildFragmentManager(), "stc_pay_bottom_sheet");
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        MissingAttributes oscar = L9.d.oscar(acVar2.kilo().lima());
                                        if (oscar != null && (groups = oscar.getGroups()) != null) {
                                            Iterator<T> it = groups.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj3 = it.next();
                                                    acVar2.quebec();
                                                    if (MyAccountViewModel.bravo(((AttributeGroup) obj3).getGroup(), "UR_PAY")) {
                                                    }
                                                } else {
                                                    obj3 = null;
                                                }
                                            }
                                            attributeGroup = (AttributeGroup) obj3;
                                            break;
                                        }
                                        attributeGroup = new AttributeGroup();
                                        attributeGroup.setGroup("UR_PAY");
                                        attributeGroup.setActionType(AttributeActionType.RECOMMENDED);
                                        attributeGroup.setActionText(null);
                                        attributeGroup.setActionDescription(null);
                                        attributeGroup.setTitle(acVar2.getString(R.string.urpay_sheet_title));
                                        attributeGroup.setSectionLabel(acVar2.getString(R.string.urpay_section_label));
                                        attributeGroup.setWarningText(acVar2.getString(R.string.urpay_warning_text));
                                        attributeGroup.setSuccessMessage(null);
                                        attributeGroup.setOtpTitle(null);
                                        attributeGroup.setOtpSubtitle(null);
                                        attributeGroup.setOtpDescription(null);
                                        attributeGroup.setRequiresOtpVerification(false);
                                        Attribute attribute = new Attribute();
                                        attribute.setKey("UR_PAY_ACCOUNT_IBAN");
                                        attribute.setDisplayName(acVar2.getString(R.string.urpay_iban));
                                        attribute.setHint(acVar2.getString(R.string.hint_urpay_iban));
                                        attribute.setInputType("TEXT");
                                        Attribute attribute2 = new Attribute();
                                        attribute2.setKey("UR_PAY_ID_NUMBER");
                                        attribute2.setDisplayName(acVar2.getString(R.string.urpay_id_label));
                                        attribute2.setHint(acVar2.getString(R.string.urpay_id_hint));
                                        attribute2.setInputType("NUMBER");
                                        attributeGroup.setAttributes(CollectionsKt.listOf(attribute, attribute2));
                                        C0233p c0233p = new C0233p();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("arg_group", new com.google.gson.l().india(attributeGroup));
                                        c0233p.setArguments(bundle2);
                                        c0233p.f1811w = new v(acVar2, 5);
                                        c0233p.romeo(acVar2.getChildFragmentManager(), "missing_attr_sheet");
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q2.f(jade2);
                    }
                    e.bravo(fVar, function0, (Function0) jade2, null, c0585q2, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
