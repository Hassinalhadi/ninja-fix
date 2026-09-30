package com.checkout.components.rememberme.utils;

import D0.an;
import H0.v;
import T.p;
import Xd.l;
import android.content.Context;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.kmp.rememberme.shared.model.ClickTarget;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeConfig;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeEnvironment;
import com.checkout.components.rememberme.di.DefaultStyleProvider;
import com.checkout.components.rememberme.di.ResourceProviderImpl;
import com.checkout.components.rememberme.model.SchemeImageStyle;
import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.ui.R;
import com.checkout.components.ui.mapper.ContainerStyleToModifierMapper;
import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;
import com.checkout.components.ui.mapper.InputComponentStyleToStateMapper;
import com.checkout.components.ui.mapper.InputComponentStyleToViewStyleMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToInputFieldStateMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToViewStyleMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;
import com.checkout.components.ui.model.ButtonItem;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.Padding;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import com.clevertap.android.sdk.inapp.images.preload.a;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import d5.C1589a;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2636d7;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006Jc\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010#\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010&\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00105\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u0010\u001cR\u0017\u00108\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b6\u0010\u001a\u001a\u0004\b7\u0010\u001cR\u0017\u0010;\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010+R\u0017\u0010A\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010G\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/checkout/components/rememberme/utils/PreviewFixtures;", "", "Landroid/content/Context;", "context", "Lcom/checkout/components/rememberme/di/DefaultStyleProvider;", "styleProvider$rememberme_standardRelease", "(Landroid/content/Context;)Lcom/checkout/components/rememberme/di/DefaultStyleProvider;", "styleProvider", "", com.clevertap.android.sdk.Constants.KEY_ID, "", "isDefault", "isSupported", "isExpired", "isAddCard", "Lcom/checkout/components/ui/model/CardScheme;", "scheme", "showCvv", "Lkotlin/Function0;", "", com.clevertap.android.sdk.Constants.KEY_CONTENT, "Lcom/checkout/components/rememberme/model/WalletListItem;", "createWalletListItem", "(Ljava/lang/String;ZZZZLcom/checkout/components/ui/model/CardScheme;ZLXd/l;)Lcom/checkout/components/rememberme/model/WalletListItem;", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "c", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "getCardNumberLabelItem$rememberme_standardRelease", "()Lcom/checkout/components/ui/model/TextLabelViewItem;", "cardNumberLabelItem", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "getDefaultViewItem$rememberme_standardRelease", "defaultViewItem", "e", "getExpiredViewItem$rememberme_standardRelease", "expiredViewItem", "f", "getInfoViewItem$rememberme_standardRelease", "infoViewItem", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "h", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "getInfoImageStyle", "()Lcom/checkout/components/ui/model/style/base/ImageStyle;", "infoImageStyle", "", "i", "Ljava/util/List;", "getWalletListItems", "()Ljava/util/List;", "walletListItems", "j", "getEmailItem", "emailItem", "k", "getErrorItem", "errorItem", "l", "getOverflowImageStyle", "overflowImageStyle", "Lcom/checkout/components/ui/model/ButtonItem;", "m", "Lcom/checkout/components/ui/model/ButtonItem;", "getButtonItem", "()Lcom/checkout/components/ui/model/ButtonItem;", "buttonItem", "Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;", "getPreviewKmpRememberMe", "()Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;", "previewKmpRememberMe", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviewFixtures {
    public static final int $stable;

    @NotNull
    public static final PreviewFixtures INSTANCE;

    /* renamed from: a */
    private static final Lazy f6345a;

    /* renamed from: b */
    private static final Lazy f6346b;

    /* renamed from: c, reason: from kotlin metadata */
    private static final TextLabelViewItem cardNumberLabelItem;

    /* renamed from: d */
    private static final TextLabelViewItem defaultViewItem;

    /* renamed from: e, reason: from kotlin metadata */
    private static final TextLabelViewItem expiredViewItem;

    /* renamed from: f, reason: from kotlin metadata */
    private static final TextLabelViewItem infoViewItem;

    /* renamed from: g */
    private static final TextLabelViewItem f6350g;

    /* renamed from: h, reason: from kotlin metadata */
    private static final ImageStyle infoImageStyle;

    /* renamed from: i, reason: from kotlin metadata */
    private static final List walletListItems;

    /* renamed from: j, reason: from kotlin metadata */
    private static final TextLabelViewItem emailItem;

    /* renamed from: k, reason: from kotlin metadata */
    private static final TextLabelViewItem errorItem;

    /* renamed from: l, reason: from kotlin metadata */
    private static final ImageStyle overflowImageStyle;

    /* renamed from: m, reason: from kotlin metadata */
    private static final ButtonItem buttonItem;

    /* renamed from: n */
    private static final CheckoutKMPRememberMe previewKmpRememberMe;

    static {
        PreviewFixtures previewFixtures = new PreviewFixtures();
        INSTANCE = previewFixtures;
        f6345a = LazyKt.lazy(new C1589a(26));
        f6346b = LazyKt.lazy(new C1589a(27));
        TextLabelState textLabelState = new TextLabelState(C0564b.zulu("···· 6354"), null, null, 6, null);
        long charlie = AbstractC2636d7.charlie(16);
        Utils utils = Utils.INSTANCE;
        cardNumberLabelItem = new TextLabelViewItem(new TextLabelViewStyle(null, 0, false, 0, null, new an(utils.m191toComposeColorvNxB06k(4279790335L), charlie, null, null, null, 0L, 0, 0L, 0, 16777212), false, 95, null), textLabelState);
        defaultViewItem = new TextLabelViewItem(new TextLabelViewStyle(null, 0, false, 0, null, new an(utils.m191toComposeColorvNxB06k(4278190080L), AbstractC2636d7.charlie(15), null, null, null, 0L, 0, 0L, 0, 16777212), false, 95, null), new TextLabelState(C0564b.zulu("Default"), null, null, 6, null));
        expiredViewItem = new TextLabelViewItem(new TextLabelViewStyle(null, 0, false, 0, null, new an(utils.m191toComposeColorvNxB06k(4294967295L), AbstractC2636d7.charlie(15), null, null, null, 0L, 0, 0L, 0, 16777212), false, 95, null), new TextLabelState(C0564b.zulu("Expired"), null, null, 6, null));
        infoViewItem = new TextLabelViewItem(new TextLabelViewStyle(null, 0, false, 0, null, new an(utils.m191toComposeColorvNxB06k(4285690482L), AbstractC2636d7.charlie(12), null, null, null, 0L, 0, 0L, 0, 16777212), false, 95, null), new TextLabelState(C0564b.zulu("Card is not supported"), null, null, 6, null));
        f6350g = new TextLabelViewItem(new TextLabelViewStyle(null, 0, false, 0, null, new an(utils.m191toComposeColorvNxB06k(4285690482L), AbstractC2636d7.charlie(12), v.f1408b, null, null, 0L, 0, 0L, 0, 16777208), false, 95, null), new TextLabelState(C0564b.zulu("Add Card"), null, null, 6, null));
        infoImageStyle = new ImageStyle(Integer.valueOf(R.drawable.cko_ic_info), 4285690482L, null, null, null, null, null, null, 252, null);
        walletListItems = CollectionsKt.listOf(createWalletListItem$default(previewFixtures, "1", true, false, false, false, CardScheme.MASTERCARD, false, null, 220, null), createWalletListItem$default(previewFixtures, "2", false, false, false, false, CardScheme.AMERICAN_EXPRESS, false, null, 218, null), createWalletListItem$default(previewFixtures, "3", false, false, true, false, CardScheme.JCB, false, null, 214, null), createWalletListItem$default(previewFixtures, "4", false, false, false, false, CardScheme.UNION_PAY, false, null, 222, null), createWalletListItem$default(previewFixtures, "5", false, false, false, true, null, false, null, 238, null));
        emailItem = new TextLabelViewItem(new TextLabelViewStyle(null, 0, false, 0, null, new an(utils.m191toComposeColorvNxB06k(4278190080L), AbstractC2636d7.charlie(15), null, null, null, 0L, 0, 0L, 0, 16777212), false, 95, null), new TextLabelState(C0564b.zulu("jordan.smith@email.com"), null, null, 6, null));
        errorItem = new TextLabelViewItem(new TextLabelViewStyle(null, 0, false, 0, null, new an(utils.m191toComposeColorvNxB06k(4289538110L), AbstractC2636d7.charlie(15), null, null, null, 0L, 0, 0L, 0, 16777212), false, 95, null), new TextLabelState(C0564b.zulu("test error"), null, null, 6, null));
        overflowImageStyle = new ImageStyle(Integer.valueOf(R.drawable.cko_ic_overflow), null, null, null, null, null, null, null, 254, null);
        buttonItem = new ButtonItem(new InternalButtonViewStyle(utils.m191toComposeColorvNxB06k(4279790335L), utils.m191toComposeColorvNxB06k(4289769648L), utils.m191toComposeColorvNxB06k(4278224234L), utils.m191toComposeColorvNxB06k(4294967295L), 0L, null, AbstractC2094g.bravo(4), V.charlie(p.alpha, 1.0f), 48, null), new InternalButtonState(C0564b.zulu(Boolean.TRUE), new TextLabelState(C0564b.zulu("Pay"), null, null, 6, null)));
        previewKmpRememberMe = new CheckoutKMPRememberMe(new RememberMeConfig(RememberMeEnvironment.SANDBOX, new a(19), "", "", "", new a(20), null, null, null, null, 960, null));
        $stable = 8;
    }

    private PreviewFixtures() {
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Mapper b() {
        return new InputComponentStyleToStateMapper(new TextLabelStyleToStateMapper(), new InputFieldStyleToInputFieldStateMapper(new ImageStyleToComposableImageMapper()));
    }

    public static final Mapper c() {
        return new InputComponentStyleToViewStyleMapper(new ContainerStyleToModifierMapper(), new TextLabelStyleToViewStyleMapper(), new InputFieldStyleToViewStyleMapper(new TextLabelStyleToViewStyleMapper()));
    }

    public static /* synthetic */ WalletListItem createWalletListItem$default(PreviewFixtures previewFixtures, String str, boolean z2, boolean z10, boolean z11, boolean z12, CardScheme cardScheme, boolean z13, l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z2 = false;
        }
        if ((i4 & 4) != 0) {
            z10 = true;
        }
        if ((i4 & 8) != 0) {
            z11 = false;
        }
        if ((i4 & 16) != 0) {
            z12 = false;
        }
        if ((i4 & 32) != 0) {
            cardScheme = CardScheme.VISA;
        }
        if ((i4 & 64) != 0) {
            z13 = false;
        }
        if ((i4 & 128) != 0) {
            lVar = null;
        }
        return previewFixtures.createWalletListItem(str, z2, z10, z11, z12, cardScheme, z13, lVar);
    }

    @NotNull
    public final WalletListItem createWalletListItem(@NotNull String r19, boolean isDefault, boolean isSupported, boolean isExpired, boolean isAddCard, @NotNull CardScheme scheme, boolean showCvv, @Nullable l r26) {
        ImageStyle imageStyle;
        TextLabelViewItem textLabelViewItem;
        Intrinsics.echo(r19, "id");
        Intrinsics.echo(scheme, "scheme");
        if (isAddCard) {
            imageStyle = new ImageStyle(Integer.valueOf(R.drawable.cko_ic_card), null, null, 32, new Padding(0, 0, 4, 4, 3, null), null, null, null, 230, null);
        } else {
            imageStyle = new ImageStyle(scheme.getImageId(), null, null, 40, null, null, null, null, 246, null);
        }
        SchemeImageStyle schemeImageStyle = new SchemeImageStyle(imageStyle, null);
        if (isAddCard) {
            textLabelViewItem = f6350g;
        } else {
            textLabelViewItem = cardNumberLabelItem;
        }
        return new WalletListItem(r19, null, schemeImageStyle, isDefault, isSupported, isExpired, expiredViewItem, defaultViewItem, textLabelViewItem, infoImageStyle, infoViewItem, new C1589a(28), showCvv, r26, 2, null);
    }

    @NotNull
    public final ButtonItem getButtonItem() {
        return buttonItem;
    }

    @NotNull
    public final TextLabelViewItem getCardNumberLabelItem$rememberme_standardRelease() {
        return cardNumberLabelItem;
    }

    @NotNull
    public final TextLabelViewItem getDefaultViewItem$rememberme_standardRelease() {
        return defaultViewItem;
    }

    @NotNull
    public final TextLabelViewItem getEmailItem() {
        return emailItem;
    }

    @NotNull
    public final TextLabelViewItem getErrorItem() {
        return errorItem;
    }

    @NotNull
    public final TextLabelViewItem getExpiredViewItem$rememberme_standardRelease() {
        return expiredViewItem;
    }

    @NotNull
    public final ImageStyle getInfoImageStyle() {
        return infoImageStyle;
    }

    @NotNull
    public final TextLabelViewItem getInfoViewItem$rememberme_standardRelease() {
        return infoViewItem;
    }

    @NotNull
    public final ImageStyle getOverflowImageStyle() {
        return overflowImageStyle;
    }

    @NotNull
    public final CheckoutKMPRememberMe getPreviewKmpRememberMe() {
        return previewKmpRememberMe;
    }

    @NotNull
    public final List<WalletListItem> getWalletListItems() {
        return walletListItems;
    }

    @NotNull
    public final DefaultStyleProvider styleProvider$rememberme_standardRelease(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        return new DefaultStyleProvider(new ResourceProviderImpl(context, null), (Mapper) f6345a.getValue(), (Mapper) f6346b.getValue(), new TextLabelStyleToViewStyleMapper(), new TextLabelStyleToStateMapper(), null);
    }

    public static final Unit a(ClickTarget it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static final Unit a(String it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }
}
