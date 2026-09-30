package com.checkout.address.ui.view;

import A0.ab;
import A0.o;
import Gb.f;
import P.e;
import Q0.n;
import T.d;
import T.p;
import Xd.l;
import Yb.F;
import a0.C0366t;
import a2.C0393r;
import a4.s;
import af.C0437h;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.annotation.Keep;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao.ad;
import com.checkout.address.utils.IntentUtils;
import com.checkout.address.utils.StyleUtils;
import com.checkout.components.address.C0860a;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.localisation.ContextExtensionsKt;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.AddressComponentConfig;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.ui.model.InputFieldColors;
import com.checkout.components.ui.model.InputFieldViewItem;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import com.checkout.components.ui.view.InputFieldErrorMessageViewKt;
import com.checkout.components.ui.view.InputFieldViewKt;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.images.preload.a;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2901T;
import t6.AbstractC3012j3;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001ag\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressComponentConfig;", Constants.KEY_CONFIG, "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/state/InputFieldState;", "Lcom/checkout/components/ui/mapper/InputFieldStateMapper;", "stateMapper", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "Lcom/checkout/components/ui/mapper/InputFieldViewStyleMapper;", "styleMapper", "Lcom/checkout/address/utils/StyleUtils;", "styleUtils", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "", "errorMessageRepository", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "errorLabelItem", "", "AddressButtonView", "(Lcom/checkout/components/interfaces/model/AddressComponentConfig;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/address/utils/StyleUtils;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/ui/model/TextLabelViewItem;Landroidx/compose/runtime/m;I)V", "address_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressButtonViewKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x022e  */
    @Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressButtonView(@NotNull AddressComponentConfig addressComponentConfig, @NotNull Mapper<InputFieldStyle, InputFieldState> stateMapper, @NotNull Mapper<InputFieldStyle, InputFieldViewStyle> styleMapper, @NotNull StyleUtils styleUtils, @NotNull PrimitiveStateFlowRepository<String> errorMessageRepository, @NotNull TextLabelViewItem errorLabelItem, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        n nVar;
        boolean z10;
        boolean z11;
        ax axVar;
        Utils utils;
        Object obj;
        n nVar2;
        ax axVar2;
        C0366t c0366t;
        C0366t m158getDisabledIndicatorColorQN2ZGVo;
        InputFieldColors colors;
        boolean india;
        int i10;
        boolean india2;
        int i11;
        boolean india3;
        int i12;
        int i13;
        int i14;
        boolean india4;
        int i15;
        AddressComponentConfig config = addressComponentConfig;
        Intrinsics.echo(config, "config");
        Intrinsics.echo(stateMapper, "stateMapper");
        Intrinsics.echo(styleMapper, "styleMapper");
        Intrinsics.echo(styleUtils, "styleUtils");
        Intrinsics.echo(errorMessageRepository, "errorMessageRepository");
        Intrinsics.echo(errorLabelItem, "errorLabelItem");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(9662406);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india4 = c0585q.golf(config);
            } else {
                india4 = c0585q.india(config);
            }
            if (india4) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(stateMapper)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(styleMapper)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if ((i4 & 4096) == 0) {
                india3 = c0585q.golf(styleUtils);
            } else {
                india3 = c0585q.india(styleUtils);
            }
            if (india3) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        }
        if ((i4 & 24576) == 0) {
            if ((32768 & i4) == 0) {
                india2 = c0585q.golf(errorMessageRepository);
            } else {
                india2 = c0585q.india(errorMessageRepository);
            }
            if (india2) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i5 |= i11;
        }
        if ((196608 & i4) == 0) {
            if ((262144 & i4) == 0) {
                india = c0585q.golf(errorLabelItem);
            } else {
                india = c0585q.india(errorLabelItem);
            }
            if (india) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i5 |= i10;
        }
        if ((74899 & i5) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            ComponentName.Address name = config.getName();
            Context configContext = ContextExtensionsKt.toConfigContext((Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo), config.getLocale());
            Utils utils2 = Utils.INSTANCE;
            if (utils2.isRtl(configContext)) {
                nVar = n.purple;
            } else {
                nVar = n.alpha;
            }
            ax mike = C0564b.mike(errorMessageRepository.getFlow(), c0585q, 0);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(name.getConfiguration().getData());
                c0585q.f(jade);
            }
            ax axVar3 = (ax) jade;
            Object jade2 = c0585q.jade();
            InputFieldColors inputFieldColors = null;
            if (jade2 == asVar) {
                jade2 = C0564b.zulu(null);
                c0585q.f(jade2);
            }
            ax axVar4 = (ax) jade2;
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = ad.xray(c0585q);
            }
            InterfaceC1673j interfaceC1673j = (InterfaceC1673j) jade3;
            Object value = axVar3.getValue();
            if ((i5 & 14) != 4 && ((i5 & 8) == 0 || !c0585q.india(config))) {
                z10 = false;
            } else {
                z10 = true;
            }
            boolean z12 = z10;
            if ((i5 & 7168) != 2048 && ((i5 & 4096) == 0 || !c0585q.india(styleUtils))) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean echo = z12 | z11 | c0585q.echo(nVar.ordinal()) | c0585q.india(styleMapper) | c0585q.india(stateMapper);
            Object jade4 = c0585q.jade();
            if (!echo && jade4 != asVar) {
                utils = utils2;
                axVar = axVar4;
                nVar2 = nVar;
                axVar2 = axVar3;
                obj = value;
            } else {
                axVar = axVar4;
                utils = utils2;
                obj = value;
                nVar2 = nVar;
                C0860a c0860a = new C0860a(axVar3, config, styleUtils, nVar2, styleMapper, stateMapper, axVar, null);
                axVar2 = axVar3;
                config = config;
                c0585q.f(c0860a);
                jade4 = c0860a;
            }
            int i16 = ContactData.$stable;
            C0564b.foxtrot((l) jade4, c0585q, obj);
            Intent prepareIntent$address_standardRelease = IntentUtils.INSTANCE.prepareIntent$address_standardRelease(configContext, config, (ContactData) axVar2.getValue());
            s sVar = new s(5);
            boolean india5 = c0585q.india(name);
            Object jade5 = c0585q.jade();
            if (india5 || jade5 == asVar) {
                jade5 = new C0393r(27, axVar2, name);
                c0585q.f(jade5);
            }
            C0437h charlie = AbstractC3012j3.charlie(sVar, (Function1) jade5, c0585q);
            InputFieldViewItem inputFieldViewItem = (InputFieldViewItem) axVar.getValue();
            if (inputFieldViewItem == null) {
                c0585q.purple(-1535215244);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1535215243);
                if (mike.getValue() != null) {
                    m158getDisabledIndicatorColorQN2ZGVo = new C0366t(utils.m191toComposeColorvNxB06k(styleUtils.errorColor$address_standardRelease()));
                } else {
                    InputFieldColors colors2 = inputFieldViewItem.getStyle().getColors();
                    if (colors2 != null) {
                        m158getDisabledIndicatorColorQN2ZGVo = colors2.m158getDisabledIndicatorColorQN2ZGVo();
                    } else {
                        c0366t = null;
                        InputFieldViewStyle style = inputFieldViewItem.getStyle();
                        colors = inputFieldViewItem.getStyle().getColors();
                        if (colors != null) {
                            inputFieldColors = InputFieldColors.m138copyOjBk2YA$default(colors, null, null, null, null, null, null, null, c0366t, null, 0L, null, null, null, null, 16255, null);
                        }
                        C0564b.alpha(AbstractC2901T.november.alpha(nVar2), e.echo(-2110925485, new f(interfaceC1673j, charlie, prepareIntent$address_standardRelease, InputFieldViewStyle.copy$default(style, null, false, false, null, null, null, null, null, null, false, 0, 0, null, null, inputFieldColors, 16383, null), inputFieldViewItem, mike, errorLabelItem, 1), c0585q), c0585q, 56);
                        c0585q.quebec(false);
                    }
                }
                c0366t = m158getDisabledIndicatorColorQN2ZGVo;
                InputFieldViewStyle style2 = inputFieldViewItem.getStyle();
                colors = inputFieldViewItem.getStyle().getColors();
                if (colors != null) {
                }
                C0564b.alpha(AbstractC2901T.november.alpha(nVar2), e.echo(-2110925485, new f(interfaceC1673j, charlie, prepareIntent$address_standardRelease, InputFieldViewStyle.copy$default(style2, null, false, false, null, null, null, null, null, null, false, 0, 0, null, null, inputFieldColors, 16383, null), inputFieldViewItem, mike, errorLabelItem, 1), c0585q), c0585q, 56);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.e(addressComponentConfig, stateMapper, styleMapper, styleUtils, errorMessageRepository, errorLabelItem, i4, 4);
        }
    }

    public static final Unit a(AddressComponentConfig addressComponentConfig, Mapper mapper, Mapper mapper2, StyleUtils styleUtils, PrimitiveStateFlowRepository primitiveStateFlowRepository, TextLabelViewItem textLabelViewItem, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        AddressButtonView(addressComponentConfig, mapper, mapper2, styleUtils, primitiveStateFlowRepository, textLabelViewItem, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit a(ax axVar, ComponentName.Address address, ActivityResult result) {
        Intrinsics.echo(result, "result");
        if (result.alpha == -1) {
            axVar.setValue(IntentUtils.INSTANCE.getContactDataFromResult$address_standardRelease(result));
            address.getConfiguration().getOnComplete().invoke(axVar.getValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(InterfaceC1673j interfaceC1673j, C0437h c0437h, Intent intent, InputFieldViewStyle inputFieldViewStyle, InputFieldViewItem inputFieldViewItem, D0 d02, TextLabelViewItem textLabelViewItem, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            T.s romeo = V.romeo(p.alpha);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new a(24);
                c0585q.f(jade);
            }
            T.s alpha = androidx.compose.ui.platform.a.alpha(o.bravo(romeo, false, (Function1) jade), "address_button");
            boolean india = c0585q.india(c0437h) | c0585q.india(intent);
            Object jade2 = c0585q.jade();
            if (india || jade2 == asVar) {
                jade2 = new F(16, c0437h, intent);
                c0585q.f(jade2);
            }
            T.s charlie = androidx.compose.foundation.a.charlie(alpha, interfaceC1673j, null, false, null, (Function0) jade2, 28);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(charlie, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                ad.blue(i5, c0585q, i5, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            InputFieldState state = inputFieldViewItem.getState();
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = new a(25);
                c0585q.f(jade3);
            }
            InputFieldViewKt.InputFieldView(inputFieldViewStyle, state, (Function1) jade3, null, null, c0585q, InputFieldViewStyle.$stable | 384 | (InputFieldState.$stable << 3), 24);
            String str = (String) d02.getValue();
            if (str == null) {
                c0585q.purple(-1012723111);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1012723110);
                InputFieldErrorMessageViewKt.m194InputFieldErrorMessageView3JVO9M(Utils.INSTANCE.m191toComposeColorvNxB06k(4289538110L), textLabelViewItem.getStyle(), TextLabelState.copy$default(textLabelViewItem.getState(), C0564b.zulu(str), null, null, 6, null), c0585q, (TextLabelViewStyle.$stable << 3) | (TextLabelState.$stable << 6));
                c0585q.quebec(false);
            }
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(C0437h c0437h, Intent intent) {
        c0437h.alpha(intent);
        return Unit.INSTANCE;
    }

    public static final Unit a(A0.ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        ab.alpha(semantics);
        return Unit.INSTANCE;
    }

    public static final Unit a(String it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }
}
