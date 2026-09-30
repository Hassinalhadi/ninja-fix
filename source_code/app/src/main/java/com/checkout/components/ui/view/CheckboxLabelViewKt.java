package com.checkout.components.ui.view;

import Cb.i;
import Cb.t;
import F.AbstractC0127k2;
import F.AbstractC0145p0;
import F.AbstractC0149q0;
import F.F;
import F.K1;
import P.e;
import Pa.f;
import Q0.g;
import T.d;
import T.j;
import T.p;
import T.s;
import Xd.l;
import a0.C0366t;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.S;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.kmp.rememberme.view.otp.c;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.ModifierExtensionsKt;
import com.checkout.components.ui.utils.extensions.Utils;
import com.checkout.components.ui.view.CheckboxLabelViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import k5.C2008a;
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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aS\u0010\r\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001ai\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "labelViewItem", "", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "LT/s;", "modifier", "", "testTag", "CheckboxLabelView", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/ui/model/TextLabelViewItem;ZLkotlin/jvm/functions/Function1;LT/s;Ljava/lang/String;Landroidx/compose/runtime/m;II)V", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "style", "Lcom/checkout/components/ui/model/state/TextLabelState;", "state", "La0/t;", "primaryColor", "actionColor", "checkmarkColor", "CheckboxLabelView-sTxsimY", "(ZLkotlin/jvm/functions/Function1;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/state/TextLabelState;JJJLT/s;Ljava/lang/String;Landroidx/compose/runtime/m;II)V", "CheckboxLabelViewPreview", "(Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckboxLabelViewKt {
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckboxLabelView(@Nullable DesignTokens designTokens, @NotNull TextLabelViewItem labelViewItem, boolean z2, @NotNull Function1<? super Boolean, Unit> onCheckedChange, @Nullable s sVar, @Nullable String str, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        s sVar2;
        int i11;
        int i12;
        String str2;
        int i13;
        boolean z10;
        s sVar3;
        String str3;
        Q uniform;
        s sVar4;
        String str4;
        int i14;
        int i15;
        int i16;
        boolean india;
        int i17;
        Intrinsics.echo(labelViewItem, "labelViewItem");
        Intrinsics.echo(onCheckedChange, "onCheckedChange");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1941421204);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india = c0585q.golf(designTokens);
            } else {
                india = c0585q.india(designTokens);
            }
            if (india) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(labelViewItem)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.hotel(z2)) {
                i15 = Barcode.FORMAT_QR_CODE;
            } else {
                i15 = 128;
            }
            i10 |= i15;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(onCheckedChange)) {
                i14 = 2048;
            } else {
                i14 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i14;
        }
        int i18 = i5 & 16;
        if (i18 != 0) {
            i10 |= 24576;
        } else if ((i4 & 24576) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i10 |= i11;
            i12 = i5 & 32;
            if (i12 == 0) {
                i10 |= 196608;
            } else if ((196608 & i4) == 0) {
                str2 = str;
                if (c0585q.golf(str2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i10 |= i13;
                if ((74899 & i10) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0585q.magenta(i10 & 1, z10)) {
                    if (i18 != 0) {
                        sVar4 = p.alpha;
                    } else {
                        sVar4 = sVar2;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    TextLabelViewStyle style = labelViewItem.getStyle();
                    TextLabelState state = labelViewItem.getState();
                    Utils utils = Utils.INSTANCE;
                    int i19 = i10;
                    int i20 = i19 << 9;
                    m192CheckboxLabelViewsTxsimY(z2, onCheckedChange, style, state, utils.m191toComposeColorvNxB06k(utils.formBorderColor(designTokens)), utils.m191toComposeColorvNxB06k(utils.actionColor(designTokens)), utils.m191toComposeColorvNxB06k(utils.inverseColor(designTokens)), sVar4, str4, c0585q, ((i19 >> 6) & 126) | (i20 & 29360128) | (i20 & 234881024), 0);
                    sVar3 = sVar4;
                    str3 = str4;
                } else {
                    c0585q.ochre();
                    sVar3 = sVar2;
                    str3 = str2;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new f(designTokens, labelViewItem, z2, onCheckedChange, sVar3, str3, i4, i5);
                    return;
                }
                return;
            }
            str2 = str;
            if ((74899 & i10) != 74898) {
            }
            if (c0585q.magenta(i10 & 1, z10)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        sVar2 = sVar;
        i12 = i5 & 32;
        if (i12 == 0) {
        }
        str2 = str;
        if ((74899 & i10) != 74898) {
        }
        if (c0585q.magenta(i10 & 1, z10)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final Unit CheckboxLabelView$lambda$0(DesignTokens designTokens, TextLabelViewItem textLabelViewItem, boolean z2, Function1 function1, s sVar, String str, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        CheckboxLabelView(designTokens, textLabelViewItem, z2, function1, sVar, str, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c8  */
    /* renamed from: CheckboxLabelView-sTxsimY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m192CheckboxLabelViewsTxsimY(final boolean z2, @NotNull final Function1<? super Boolean, Unit> onCheckedChange, @NotNull final TextLabelViewStyle style, @NotNull final TextLabelState state, final long j5, final long j6, final long j7, @Nullable s sVar, @Nullable String str, @Nullable InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        s sVar2;
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        boolean z10;
        Q uniform;
        String str3;
        boolean z11;
        boolean z12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Intrinsics.echo(onCheckedChange, "onCheckedChange");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1621874281);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i10 = i21 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onCheckedChange)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i10 |= i20;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(style)) {
                i19 = Barcode.FORMAT_QR_CODE;
            } else {
                i19 = 128;
            }
            i10 |= i19;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(state)) {
                i18 = 2048;
            } else {
                i18 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i18;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.foxtrot(j5)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = 8192;
            }
            i10 |= i17;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.foxtrot(j6)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i10 |= i16;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q.foxtrot(j7)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i10 |= i15;
        }
        int i22 = i5 & 128;
        if (i22 != 0) {
            i10 |= 12582912;
        } else if ((12582912 & i4) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i10 |= i11;
            i12 = i5 & Barcode.FORMAT_QR_CODE;
            if (i12 == 0) {
                i10 |= 100663296;
                str2 = str;
            } else {
                str2 = str;
                if ((i4 & 100663296) == 0) {
                    if (c0585q.golf(str2)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i10 |= i13;
                }
            }
            i14 = i10;
            if ((i14 & 38347923) == 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!c0585q.magenta(i14 & 1, z10)) {
                if (i22 != 0) {
                    sVar2 = p.alpha;
                }
                if (i12 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                j jVar = d.f2061d;
                if ((i14 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i14 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z13 = z12 | z11;
                Object jade = c0585q.jade();
                if (z13 || jade == C0580l.alpha) {
                    jade = new C2008a(onCheckedChange, z2, 0);
                    c0585q.f(jade);
                }
                s optionalTestTag = ModifierExtensionsKt.optionalTestTag(a.echo(15, sVar2, null, (Function0) jade, false), str3);
                S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
                long j10 = c0585q.magenta;
                int i23 = (int) (j10 ^ (j10 >>> 32));
                I mike = c0585q.mike();
                s charlie = T.a.charlie(optionalTestTag, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, alpha);
                C0564b.blue(C2551k.echo, c0585q, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i23))) {
                    ad.blue(i23, c0585q, i23, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie);
                C0564b.alpha(AbstractC0145p0.alpha.alpha(new g(Float.NaN)), e.echo(1348446149, new l() { // from class: k5.b
                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CheckboxLabelView_sTxsimY$lambda$4$lambda$3;
                        int intValue = ((Integer) obj2).intValue();
                        Function1 function1 = onCheckedChange;
                        CheckboxLabelView_sTxsimY$lambda$4$lambda$3 = CheckboxLabelViewKt.CheckboxLabelView_sTxsimY$lambda$4$lambda$3(j6, j5, j7, z2, function1, (InterfaceC0581m) obj, intValue);
                        return CheckboxLabelView_sTxsimY$lambda$4$lambda$3;
                    }
                }, c0585q), c0585q, 56);
                TextLabelViewKt.TextLabelView(style, state, c0585q, (i14 >> 6) & 126);
                c0585q.quebec(true);
                str2 = str3;
                sVar2 = sVar2;
            } else {
                c0585q.ochre();
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                final s sVar3 = sVar2;
                final String str4 = str2;
                uniform.delta = new l() { // from class: k5.c
                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CheckboxLabelView_sTxsimY$lambda$5;
                        int intValue = ((Integer) obj2).intValue();
                        Function1 function1 = onCheckedChange;
                        TextLabelViewStyle textLabelViewStyle = style;
                        TextLabelState textLabelState = state;
                        int i24 = i4;
                        int i25 = i5;
                        CheckboxLabelView_sTxsimY$lambda$5 = CheckboxLabelViewKt.CheckboxLabelView_sTxsimY$lambda$5(z2, function1, textLabelViewStyle, textLabelState, j5, j6, j7, sVar3, str4, i24, i25, (InterfaceC0581m) obj, intValue);
                        return CheckboxLabelView_sTxsimY$lambda$5;
                    }
                };
                return;
            }
            return;
        }
        sVar2 = sVar;
        i12 = i5 & Barcode.FORMAT_QR_CODE;
        if (i12 == 0) {
        }
        i14 = i10;
        if ((i14 & 38347923) == 38347922) {
        }
        if (!c0585q.magenta(i14 & 1, z10)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void CheckboxLabelViewPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1108774406);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = C0564b.zulu(Boolean.TRUE);
                c0585q.f(jade);
            }
            AbstractC0149q0.alpha(null, null, null, e.echo(-514410842, new t((ax) jade, 3), c0585q), c0585q, 3072, 7);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 10);
        }
    }

    public static final Unit CheckboxLabelViewPreview$lambda$11(ax axVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0127k2.alpha(null, null, 0L, 0L, 0.0f, 0.0f, null, e.echo(-1744650879, new t(axVar, 2), c0585q), c0585q, 12582912, 127);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit CheckboxLabelViewPreview$lambda$11$lambda$10(ax axVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            boolean booleanValue = ((Boolean) axVar.getValue()).booleanValue();
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new i(axVar, 24);
                c0585q.f(jade);
            }
            Function1 function1 = (Function1) jade;
            TextLabelViewStyle textLabelViewStyle = new TextLabelViewStyle(null, 0, false, 0, null, null, false, 127, null);
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = C0564b.zulu("Checkbox Label");
                c0585q.f(jade2);
            }
            m192CheckboxLabelViewsTxsimY(booleanValue, function1, textLabelViewStyle, new TextLabelState((ax) jade2, null, null, 6, null), C0366t.charlie, C0366t.hotel, C0366t.echo, null, null, c0585q, 1794096, 384);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit CheckboxLabelViewPreview$lambda$11$lambda$10$lambda$8$lambda$7(ax axVar, boolean z2) {
        axVar.setValue(Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    public static final Unit CheckboxLabelViewPreview$lambda$12(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        CheckboxLabelViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit CheckboxLabelView_sTxsimY$lambda$2$lambda$1(Function1 function1, boolean z2) {
        function1.invoke(Boolean.valueOf(!z2));
        return Unit.INSTANCE;
    }

    public static final Unit CheckboxLabelView_sTxsimY$lambda$4$lambda$3(long j5, long j6, long j7, boolean z2, Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z10;
        if ((i4 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z10)) {
            F.alpha(z2, function1, AbstractC0538d.whiskey(p.alpha, 0.0f, 0.0f, 8, 0.0f, 11), false, K1.november(j5, j6, j7, c0585q), c0585q, 384, 40);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit CheckboxLabelView_sTxsimY$lambda$5(boolean z2, Function1 function1, TextLabelViewStyle textLabelViewStyle, TextLabelState textLabelState, long j5, long j6, long j7, s sVar, String str, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        m192CheckboxLabelViewsTxsimY(z2, function1, textLabelViewStyle, textLabelState, j5, j6, j7, sVar, str, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }
}
