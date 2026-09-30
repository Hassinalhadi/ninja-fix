package com.checkout.components.rememberme.model;

import Jf.d;
import Jf.e;
import Nf.C0266y;
import Nf.K;
import Nf.az;
import ao.ad;
import b.c0;
import com.checkout.components.rememberme.C0991w0;
import com.clevertap.android.sdk.Constants;
import d5.C1589a;
import ge.InterfaceC1772d;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/rememberme/model/RememberMeScreen;", "", "", "seen0", "LNf/K;", "serializationConstructorMarker", "<init>", "(ILNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/checkout/components/rememberme/model/RememberMeScreen;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Authentication", "Wallet", "Alternative", "WebViewDialog", "GetToKnowUsDialog", "com/checkout/components/rememberme/w0", "Lcom/checkout/components/rememberme/model/RememberMeScreen$Alternative;", "Lcom/checkout/components/rememberme/model/RememberMeScreen$Authentication;", "Lcom/checkout/components/rememberme/model/RememberMeScreen$GetToKnowUsDialog;", "Lcom/checkout/components/rememberme/model/RememberMeScreen$Wallet;", "Lcom/checkout/components/rememberme/model/RememberMeScreen$WebViewDialog;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@e
/* loaded from: classes3.dex */
public abstract class RememberMeScreen {
    public static final int $stable = 0;

    @NotNull
    public static final C0991w0 Companion = new C0991w0();

    /* renamed from: a */
    private static final Lazy f6068a = LazyKt.alpha(i.alpha, new c0(27));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/rememberme/model/RememberMeScreen$Alternative;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final class Alternative extends RememberMeScreen {
        public static final int $stable = 0;

        @NotNull
        public static final Alternative INSTANCE = new Alternative();

        /* renamed from: b */
        private static final /* synthetic */ Lazy f6069b = LazyKt.alpha(i.alpha, new c0(28));

        private Alternative() {
            super(null);
        }

        public static final /* synthetic */ KSerializer a() {
            return new C0266y("com.checkout.components.rememberme.model.RememberMeScreen.Alternative", INSTANCE, new Annotation[0]);
        }

        public static /* synthetic */ KSerializer bravo() {
            return a();
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f6069b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/rememberme/model/RememberMeScreen$Authentication;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final class Authentication extends RememberMeScreen {
        public static final int $stable = 0;

        @NotNull
        public static final Authentication INSTANCE = new Authentication();

        /* renamed from: b */
        private static final /* synthetic */ Lazy f6070b = LazyKt.alpha(i.alpha, new c0(29));

        private Authentication() {
            super(null);
        }

        public static final /* synthetic */ KSerializer a() {
            return new C0266y("com.checkout.components.rememberme.model.RememberMeScreen.Authentication", INSTANCE, new Annotation[0]);
        }

        public static /* synthetic */ KSerializer bravo() {
            return a();
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f6070b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/rememberme/model/RememberMeScreen$GetToKnowUsDialog;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final class GetToKnowUsDialog extends RememberMeScreen {
        public static final int $stable = 0;

        @NotNull
        public static final GetToKnowUsDialog INSTANCE = new GetToKnowUsDialog();

        /* renamed from: b */
        private static final /* synthetic */ Lazy f6071b = LazyKt.alpha(i.alpha, new C1589a(0));

        private GetToKnowUsDialog() {
            super(null);
        }

        public static final /* synthetic */ KSerializer a() {
            return new C0266y("com.checkout.components.rememberme.model.RememberMeScreen.GetToKnowUsDialog", INSTANCE, new Annotation[0]);
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f6071b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/rememberme/model/RememberMeScreen$Wallet;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final class Wallet extends RememberMeScreen {
        public static final int $stable = 0;

        @NotNull
        public static final Wallet INSTANCE = new Wallet();

        /* renamed from: b */
        private static final /* synthetic */ Lazy f6072b = LazyKt.alpha(i.alpha, new C1589a(1));

        private Wallet() {
            super(null);
        }

        public static final /* synthetic */ KSerializer a() {
            return new C0266y("com.checkout.components.rememberme.model.RememberMeScreen.Wallet", INSTANCE, new Annotation[0]);
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f6072b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/checkout/components/rememberme/model/RememberMeScreen$WebViewDialog;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "", Constants.KEY_URL, "<init>", "(Ljava/lang/String;)V", "", "seen0", "LNf/K;", "serializationConstructorMarker", "(ILjava/lang/String;LNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rememberme_standardRelease", "(Lcom/checkout/components/rememberme/model/RememberMeScreen$WebViewDialog;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Ljava/lang/String;)Lcom/checkout/components/rememberme/model/RememberMeScreen$WebViewDialog;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getUrl", "Companion", "$serializer", "com/checkout/components/rememberme/model/a", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* data */ class WebViewDialog extends RememberMeScreen {
        public static final int $stable = 0;

        @NotNull
        public static final a Companion = new a();

        /* renamed from: b, reason: from kotlin metadata */
        private final String com.clevertap.android.sdk.Constants.KEY_URL java.lang.String;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WebViewDialog(int i4, String str, K k6) {
            super(i4, k6);
            if (1 != (i4 & 1)) {
                az.juliet(i4, 1, RememberMeScreen$WebViewDialog$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.com.clevertap.android.sdk.Constants.KEY_URL java.lang.String = str;
        }

        public static WebViewDialog copy$default(WebViewDialog webViewDialog, String url, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                url = webViewDialog.com.clevertap.android.sdk.Constants.KEY_URL java.lang.String;
            }
            webViewDialog.getClass();
            Intrinsics.echo(url, "url");
            return new WebViewDialog(url);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCom.clevertap.android.sdk.Constants.KEY_URL java.lang.String() {
            return this.com.clevertap.android.sdk.Constants.KEY_URL java.lang.String;
        }

        @NotNull
        public final WebViewDialog copy(@NotNull String url) {
            Intrinsics.echo(url, "url");
            return new WebViewDialog(url);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WebViewDialog) && Intrinsics.areEqual(this.com.clevertap.android.sdk.Constants.KEY_URL java.lang.String, ((WebViewDialog) other).com.clevertap.android.sdk.Constants.KEY_URL java.lang.String);
        }

        @NotNull
        public final String getUrl() {
            return this.com.clevertap.android.sdk.Constants.KEY_URL java.lang.String;
        }

        public final int hashCode() {
            return this.com.clevertap.android.sdk.Constants.KEY_URL java.lang.String.hashCode();
        }

        @NotNull
        public final String toString() {
            return ad.gray("WebViewDialog(url=", this.com.clevertap.android.sdk.Constants.KEY_URL java.lang.String, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewDialog(@NotNull String url) {
            super(null);
            Intrinsics.echo(url, "url");
            this.com.clevertap.android.sdk.Constants.KEY_URL java.lang.String = url;
        }
    }

    public /* synthetic */ RememberMeScreen(int i4, K k6) {
    }

    public static final KSerializer a() {
        v vVar = u.alpha;
        return new d("com.checkout.components.rememberme.model.RememberMeScreen", vVar.bravo(RememberMeScreen.class), new InterfaceC1772d[]{vVar.bravo(Alternative.class), vVar.bravo(Authentication.class), vVar.bravo(GetToKnowUsDialog.class), vVar.bravo(Wallet.class), vVar.bravo(WebViewDialog.class)}, new KSerializer[]{new C0266y("com.checkout.components.rememberme.model.RememberMeScreen.Alternative", Alternative.INSTANCE, new Annotation[0]), new C0266y("com.checkout.components.rememberme.model.RememberMeScreen.Authentication", Authentication.INSTANCE, new Annotation[0]), new C0266y("com.checkout.components.rememberme.model.RememberMeScreen.GetToKnowUsDialog", GetToKnowUsDialog.INSTANCE, new Annotation[0]), new C0266y("com.checkout.components.rememberme.model.RememberMeScreen.Wallet", Wallet.INSTANCE, new Annotation[0]), RememberMeScreen$WebViewDialog$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static /* synthetic */ KSerializer alpha() {
        return a();
    }

    public static final /* synthetic */ void write$Self(RememberMeScreen self, Mf.b output, SerialDescriptor serialDesc) {
    }

    public RememberMeScreen(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
