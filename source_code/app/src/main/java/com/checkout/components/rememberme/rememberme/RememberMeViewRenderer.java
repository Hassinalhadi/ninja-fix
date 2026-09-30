package com.checkout.components.rememberme.rememberme;

import Gb.y;
import Lb.af;
import T.p;
import T.s;
import Xd.l;
import Xd.n;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.rememberme.AbstractC0979s0;
import com.checkout.components.rememberme.R0;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.model.CustomerInfo;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJµ\u0001\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\r24\u0010\u0014\u001a0\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102*\u0010\u0018\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\rH\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/rememberme/rememberme/RememberMeViewRenderer;", "", "Lcom/checkout/components/rememberme/di/DiComponent;", "di", "<init>", "(Lcom/checkout/components/rememberme/di/DiComponent;)V", "Lcom/checkout/components/rememberme/model/CustomerInfo;", "prefilled", "", "SaveCardView", "(Lcom/checkout/components/rememberme/model/CustomerInfo;Landroidx/compose/runtime/m;II)V", "LT/s;", "modifier", "Lkotlin/Function0;", "alternativeView", "addCardView", "Lkotlin/Function4;", "", "", "LNd/c;", "onSubmitNewCard", "Lkotlin/Function2;", "Lkotlin/Result;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "onSendCardMetaDataRequest", "isTokenizationInProgress", "rememberMeAddCardMetadataProvider", "RememberMeView", "(LT/s;LXd/l;LXd/l;LXd/n;LXd/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/m;II)V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RememberMeViewRenderer {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final DiComponent f6212a;

    public RememberMeViewRenderer(@NotNull DiComponent di) {
        Intrinsics.echo(di, "di");
        this.f6212a = di;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(RememberMeViewRenderer rememberMeViewRenderer, s sVar, l lVar, l lVar2, n nVar, l lVar3, Function0 function0, Function0 function02, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        rememberMeViewRenderer.RememberMeView(sVar, lVar, lVar2, nVar, lVar3, function0, function02, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public final void RememberMeView(@Nullable s sVar, @NotNull l alternativeView, @NotNull l addCardView, @NotNull n onSubmitNewCard, @NotNull l onSendCardMetaDataRequest, @NotNull Function0<Boolean> isTokenizationInProgress, @NotNull Function0<CardMetadata> rememberMeAddCardMetadataProvider, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        s sVar2;
        boolean india;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Intrinsics.echo(alternativeView, "alternativeView");
        Intrinsics.echo(addCardView, "addCardView");
        Intrinsics.echo(onSubmitNewCard, "onSubmitNewCard");
        Intrinsics.echo(onSendCardMetaDataRequest, "onSendCardMetaDataRequest");
        Intrinsics.echo(isTokenizationInProgress, "isTokenizationInProgress");
        Intrinsics.echo(rememberMeAddCardMetadataProvider, "rememberMeAddCardMetadataProvider");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1616958008);
        int i19 = i5 & 1;
        if (i19 != 0) {
            i10 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(alternativeView)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i10 |= i18;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(addCardView)) {
                i17 = Barcode.FORMAT_QR_CODE;
            } else {
                i17 = 128;
            }
            i10 |= i17;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(onSubmitNewCard)) {
                i16 = 2048;
            } else {
                i16 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i16;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.india(onSendCardMetaDataRequest)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = 8192;
            }
            i10 |= i15;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.india(isTokenizationInProgress)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i10 |= i14;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q.india(rememberMeAddCardMetadataProvider)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i10 |= i13;
        }
        if ((12582912 & i4) == 0) {
            if ((16777216 & i4) == 0) {
                india = c0585q.golf(this);
            } else {
                india = c0585q.india(this);
            }
            if (india) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i10 |= i12;
        }
        if ((4793491 & i10) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i19 != 0) {
                sVar = p.alpha;
            }
            s sVar3 = sVar;
            int i20 = i10;
            DiComponent diComponent = this.f6212a;
            PrimitiveStateRepository<RememberMeScreen> screenRepository = diComponent.screenRepository();
            int i21 = i20 << 3;
            int i22 = (i20 & 14) | (i21 & 896) | (i21 & 7168) | (i21 & 57344) | (PrimitiveStateRepository.$stable << 15);
            int i23 = i20 << 6;
            AbstractC0979s0.a(sVar3, diComponent, alternativeView, addCardView, onSubmitNewCard, screenRepository, onSendCardMetaDataRequest, isTokenizationInProgress, rememberMeAddCardMetadataProvider, c0585q, i22 | (3670016 & i23) | (29360128 & i23) | (i23 & 234881024));
            sVar2 = sVar3;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new y(this, sVar2, alternativeView, addCardView, onSubmitNewCard, onSendCardMetaDataRequest, isTokenizationInProgress, rememberMeAddCardMetadataProvider, i4, i5, 3);
        }
    }

    public final void SaveCardView(@Nullable CustomerInfo customerInfo, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        CustomerInfo customerInfo2;
        CustomerInfo customerInfo3;
        boolean india;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(350089263);
        int i13 = i5 & 1;
        if (i13 != 0) {
            i10 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c0585q.golf(customerInfo)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if ((i4 & 64) == 0) {
                india = c0585q.golf(this);
            } else {
                india = c0585q.india(this);
            }
            if (india) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i13 != 0) {
                customerInfo3 = null;
            } else {
                customerInfo3 = customerInfo;
            }
            this.f6212a.saveCardViewStateRepository().initiate$rememberme_standardRelease(customerInfo3);
            R0.a(this.f6212a, c0585q, 0);
            customerInfo2 = customerInfo3;
        } else {
            c0585q.ochre();
            customerInfo2 = customerInfo;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new af(i4, this, customerInfo2, i5, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(RememberMeViewRenderer rememberMeViewRenderer, CustomerInfo customerInfo, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        rememberMeViewRenderer.SaveCardView(customerInfo, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }
}
