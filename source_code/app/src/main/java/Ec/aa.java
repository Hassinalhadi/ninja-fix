package Ec;

import android.graphics.Bitmap;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.O;
import bz.a0;
import com.checkout.address.ui.edit.AddressEditViewModel;
import com.checkout.components.address.AbstractC0870k;
import com.checkout.components.kmp.rememberme.view.common.ContainerViewKt;
import com.checkout.components.rememberme.AbstractC0993x;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.picker.PickerItemNotFoundViewKt;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.checkout.components.wallet.GooglePayMediator;
import com.checkout.components.wallet.ui.WalletComponentViewRenderer;
import db.C1602b;
import ga.AbstractC1760c;
import i.C1862k;
import j.C1924g;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n.AbstractC2130e;
import s6.A7;
import t6.T3;
import y.C3344D;

/* loaded from: classes2.dex */
public final /* synthetic */ class aa implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ aa(int i4, int i5, T.s sVar, String str) {
        this.alpha = 0;
        this.purple = sVar;
        this.silver = str;
        this.red = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit ContainerView$lambda$11;
        Unit TextLabelView$lambda$2;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        Integer num = (Integer) obj2;
        switch (this.alpha) {
            case 0:
                num.getClass();
                int cyan = C0564b.cyan(1);
                ap.echo((T.s) this.purple, (String) this.silver, interfaceC0581m, cyan, this.red);
                return Unit.INSTANCE;
            case 1:
                num.getClass();
                Jb.ad.charlie((Ld.c) this.silver, (T.s) this.purple, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 2:
                num.intValue();
                ((P.d) this.purple).delta(this.silver, interfaceC0581m, C0564b.cyan(this.red) | 1);
                return Unit.INSTANCE;
            case 3:
                num.getClass();
                int cyan2 = C0564b.cyan(7);
                Pa.i.delta(this.red, (D0.g) this.purple, (T.p) this.silver, interfaceC0581m, cyan2);
                return Unit.INSTANCE;
            case 4:
                num.getClass();
                Pa.i.alpha((String) this.silver, (T.p) this.purple, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 5:
                num.getClass();
                Sb.d.golf((Sb.e) this.purple, (Function0) this.silver, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 6:
                num.getClass();
                int cyan3 = C0564b.cyan(1);
                A7.delta(this.red, (Function1) this.purple, (T.p) this.silver, interfaceC0581m, cyan3);
                return Unit.INSTANCE;
            case 7:
                ContainerView$lambda$11 = ContainerViewKt.ContainerView$lambda$11((String) this.silver, (Xd.l) this.purple, this.red, interfaceC0581m, num.intValue());
                return ContainerView$lambda$11;
            case 8:
                return AbstractC0993x.a((Y1.ag) this.purple, (DiComponent) this.silver, this.red, interfaceC0581m, num.intValue());
            case 9:
                num.intValue();
                C0564b.alpha((O) this.purple, (Xd.l) this.silver, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 10:
                num.intValue();
                C0564b.bravo((O[]) this.purple, (Xd.l) this.silver, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 11:
                num.intValue();
                T3.alpha((T.s) this.purple, (Function1) this.silver, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 12:
                num.intValue();
                ((a0) this.purple).alpha(this.silver, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 13:
                num.getClass();
                cc.g.golf((List) this.purple, this.red, (Function0) this.silver, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 14:
                num.getClass();
                int cyan4 = C0564b.cyan(7);
                cc.g.delta((Function0) this.silver, (T.s) this.purple, interfaceC0581m, this.red, cyan4);
                return Unit.INSTANCE;
            case 15:
                return PickerItemNotFoundViewKt.alpha((TextLabelViewItem) this.purple, (TextLabelViewItem) this.silver, this.red, interfaceC0581m, num.intValue());
            case 16:
                num.intValue();
                db.l.golf((List) this.purple, (C1602b) this.silver, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 17:
                num.intValue();
                db.l.foxtrot((db.m) this.purple, (C1602b) this.silver, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 18:
                num.getClass();
                AbstractC1760c.alpha((Bitmap) this.purple, (Function0) this.silver, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 19:
                num.getClass();
                int cyan5 = C0564b.cyan(1);
                ((C1862k) this.purple).delta(this.red, this.silver, interfaceC0581m, cyan5);
                return Unit.INSTANCE;
            case 20:
                num.getClass();
                int cyan6 = C0564b.cyan(1);
                ((C1924g) this.purple).delta(this.red, this.silver, interfaceC0581m, cyan6);
                return Unit.INSTANCE;
            case 21:
                return AbstractC0870k.a((Y1.ag) this.purple, (AddressEditViewModel) this.silver, this.red, interfaceC0581m, num.intValue());
            case 22:
                TextLabelView$lambda$2 = TextLabelViewKt.TextLabelView$lambda$2((TextLabelViewStyle) this.purple, (TextLabelState) this.silver, this.red, interfaceC0581m, num.intValue());
                return TextLabelView$lambda$2;
            case 23:
                num.intValue();
                AbstractC2130e.alpha((D0.g) this.purple, (List) this.silver, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            case 24:
                num.getClass();
                n.at.foxtrot((C3344D) this.purple, (P.d) this.silver, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            default:
                return WalletComponentViewRenderer.bravo((WalletComponentViewRenderer) this.purple, (GooglePayMediator) this.silver, this.red, interfaceC0581m, num.intValue());
        }
    }

    public /* synthetic */ aa(int i4, int i5, Object obj, Object obj2) {
        this.alpha = i5;
        this.purple = obj;
        this.silver = obj2;
        this.red = i4;
    }

    public /* synthetic */ aa(int i4, Object obj, Object obj2, int i5, int i10) {
        this.alpha = i10;
        this.red = i4;
        this.purple = obj;
        this.silver = obj2;
    }

    public /* synthetic */ aa(Serializable serializable, Object obj, int i4, int i5) {
        this.alpha = i5;
        this.silver = serializable;
        this.purple = obj;
        this.red = i4;
    }

    public /* synthetic */ aa(Object obj, int i4, Object obj2, int i5, int i10) {
        this.alpha = i10;
        this.purple = obj;
        this.red = i4;
        this.silver = obj2;
    }
}
