package com.checkout.components.rememberme.model;

import Jf.d;
import Jf.e;
import Nf.C0266y;
import Nf.K;
import Nf.az;
import av.q;
import com.checkout.components.rememberme.S0;
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
import s6.AbstractC2796v6;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00102\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/checkout/components/rememberme/model/SaveCardScreen;", "", "", "seen0", "LNf/K;", "serializationConstructorMarker", "<init>", "(ILNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/checkout/components/rememberme/model/SaveCardScreen;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "SaveCard", "CountryPicker", "WebViewDialog", "GetToKnowUsDialog", "com/checkout/components/rememberme/S0", "Lcom/checkout/components/rememberme/model/SaveCardScreen$CountryPicker;", "Lcom/checkout/components/rememberme/model/SaveCardScreen$GetToKnowUsDialog;", "Lcom/checkout/components/rememberme/model/SaveCardScreen$SaveCard;", "Lcom/checkout/components/rememberme/model/SaveCardScreen$WebViewDialog;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@e
/* loaded from: classes3.dex */
public abstract class SaveCardScreen {
    public static final int $stable = 0;

    @NotNull
    public static final S0 Companion = new S0();

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f6074a = LazyKt.alpha(i.alpha, new C1589a(2));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/rememberme/model/SaveCardScreen$CountryPicker;", "Lcom/checkout/components/rememberme/model/SaveCardScreen;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final class CountryPicker extends SaveCardScreen {
        public static final int $stable = 0;

        @NotNull
        public static final CountryPicker INSTANCE = new CountryPicker();

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ Lazy f6075b = LazyKt.alpha(i.alpha, new C1589a(3));

        private CountryPicker() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return new C0266y("com.checkout.components.rememberme.model.SaveCardScreen.CountryPicker", INSTANCE, new Annotation[0]);
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f6075b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/rememberme/model/SaveCardScreen$GetToKnowUsDialog;", "Lcom/checkout/components/rememberme/model/SaveCardScreen;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final class GetToKnowUsDialog extends SaveCardScreen {
        public static final int $stable = 0;

        @NotNull
        public static final GetToKnowUsDialog INSTANCE = new GetToKnowUsDialog();

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ Lazy f6076b = LazyKt.alpha(i.alpha, new C1589a(4));

        private GetToKnowUsDialog() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return new C0266y("com.checkout.components.rememberme.model.SaveCardScreen.GetToKnowUsDialog", INSTANCE, new Annotation[0]);
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f6076b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/rememberme/model/SaveCardScreen$SaveCard;", "Lcom/checkout/components/rememberme/model/SaveCardScreen;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final class SaveCard extends SaveCardScreen {
        public static final int $stable = 0;

        @NotNull
        public static final SaveCard INSTANCE = new SaveCard();

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ Lazy f6077b = LazyKt.alpha(i.alpha, new C1589a(5));

        private SaveCard() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return new C0266y("com.checkout.components.rememberme.model.SaveCardScreen.SaveCard", INSTANCE, new Annotation[0]);
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f6077b.getValue();
        }
    }

    public /* synthetic */ SaveCardScreen(int i4, K k6) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer a() {
        v vVar = u.alpha;
        return new d("com.checkout.components.rememberme.model.SaveCardScreen", vVar.bravo(SaveCardScreen.class), new InterfaceC1772d[]{vVar.bravo(CountryPicker.class), vVar.bravo(GetToKnowUsDialog.class), vVar.bravo(SaveCard.class), vVar.bravo(WebViewDialog.class)}, new KSerializer[]{new C0266y("com.checkout.components.rememberme.model.SaveCardScreen.CountryPicker", CountryPicker.INSTANCE, new Annotation[0]), new C0266y("com.checkout.components.rememberme.model.SaveCardScreen.GetToKnowUsDialog", GetToKnowUsDialog.INSTANCE, new Annotation[0]), new C0266y("com.checkout.components.rememberme.model.SaveCardScreen.SaveCard", SaveCard.INSTANCE, new Annotation[0]), SaveCardScreen$WebViewDialog$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(SaveCardScreen self, Mf.b output, SerialDescriptor serialDesc) {
    }

    public SaveCardScreen(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0016¨\u0006*"}, d2 = {"Lcom/checkout/components/rememberme/model/SaveCardScreen$WebViewDialog;", "Lcom/checkout/components/rememberme/model/SaveCardScreen;", "", Constants.KEY_URL, Constants.KEY_TITLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LNf/K;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rememberme_standardRelease", "(Lcom/checkout/components/rememberme/model/SaveCardScreen$WebViewDialog;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/rememberme/model/SaveCardScreen$WebViewDialog;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getUrl", "c", "getTitle", "Companion", "$serializer", "com/checkout/components/rememberme/model/b", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* data */ class WebViewDialog extends SaveCardScreen {
        public static final int $stable = 0;

        @NotNull
        public static final b Companion = new b();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String url;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WebViewDialog(int i4, String str, String str2, K k6) {
            super(i4, k6);
            if (1 == (i4 & 1)) {
                this.url = str;
                if ((i4 & 2) == 0) {
                    this.title = "";
                    return;
                } else {
                    this.title = str2;
                    return;
                }
            }
            az.juliet(i4, 1, SaveCardScreen$WebViewDialog$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public static /* synthetic */ WebViewDialog copy$default(WebViewDialog webViewDialog, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = webViewDialog.url;
            }
            if ((i4 & 2) != 0) {
                str2 = webViewDialog.title;
            }
            return webViewDialog.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$rememberme_standardRelease(WebViewDialog self, Mf.b output, SerialDescriptor serialDesc) {
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) output;
            abstractC2796v6.xray(serialDesc, 0, self.url);
            if (abstractC2796v6.quebec(serialDesc) || !Intrinsics.areEqual(self.title, "")) {
                abstractC2796v6.xray(serialDesc, 1, self.title);
            }
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final WebViewDialog copy(@NotNull String url, @NotNull String title) {
            Intrinsics.echo(url, "url");
            Intrinsics.echo(title, "title");
            return new WebViewDialog(url, title);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewDialog)) {
                return false;
            }
            WebViewDialog webViewDialog = (WebViewDialog) other;
            return Intrinsics.areEqual(this.url, webViewDialog.url) && Intrinsics.areEqual(this.title, webViewDialog.title);
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.title.hashCode() + (this.url.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return q.golf("WebViewDialog(url=", this.url, ", title=", this.title, ")");
        }

        public /* synthetic */ WebViewDialog(String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? "" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewDialog(@NotNull String url, @NotNull String title) {
            super(null);
            Intrinsics.echo(url, "url");
            Intrinsics.echo(title, "title");
            this.url = url;
            this.title = title;
        }
    }
}
