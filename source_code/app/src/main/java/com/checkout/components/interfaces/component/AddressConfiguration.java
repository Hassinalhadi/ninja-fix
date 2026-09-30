package com.checkout.components.interfaces.component;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.google.android.material.datepicker.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR%\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011¨\u0006("}, d2 = {"Lcom/checkout/components/interfaces/component/AddressConfiguration;", "Lcom/checkout/components/interfaces/component/StandaloneComponentOption;", "Lcom/checkout/components/interfaces/model/contact/ContactData;", Column.DATA, "", "Lcom/checkout/components/interfaces/model/AddressField;", "fields", "Lkotlin/Function1;", "", "onComplete", "<init>", "(Lcom/checkout/components/interfaces/model/contact/ContactData;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lcom/checkout/components/interfaces/model/contact/ContactData;", "component2", "()Ljava/util/List;", "component3", "()Lkotlin/jvm/functions/Function1;", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/model/contact/ContactData;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/checkout/components/interfaces/component/AddressConfiguration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/contact/ContactData;", "getData", "b", "Ljava/util/List;", "getFields", "c", "Lkotlin/jvm/functions/Function1;", "getOnComplete", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class AddressConfiguration implements StandaloneComponentOption {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ContactData data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List fields;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1 onComplete;

    public AddressConfiguration(@Nullable ContactData contactData, @NotNull List<? extends AddressField> fields, @NotNull Function1<? super ContactData, Unit> onComplete) {
        Intrinsics.echo(fields, "fields");
        Intrinsics.echo(onComplete, "onComplete");
        this.data = contactData;
        this.fields = fields;
        this.onComplete = onComplete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressConfiguration copy$default(AddressConfiguration addressConfiguration, ContactData contactData, List list, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            contactData = addressConfiguration.data;
        }
        if ((i4 & 2) != 0) {
            list = addressConfiguration.fields;
        }
        if ((i4 & 4) != 0) {
            function1 = addressConfiguration.onComplete;
        }
        return addressConfiguration.copy(contactData, list, function1);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ContactData getData() {
        return this.data;
    }

    @NotNull
    public final List<AddressField> component2() {
        return this.fields;
    }

    @NotNull
    public final Function1<ContactData, Unit> component3() {
        return this.onComplete;
    }

    @NotNull
    public final AddressConfiguration copy(@Nullable ContactData data, @NotNull List<? extends AddressField> fields, @NotNull Function1<? super ContactData, Unit> onComplete) {
        Intrinsics.echo(fields, "fields");
        Intrinsics.echo(onComplete, "onComplete");
        return new AddressConfiguration(data, fields, onComplete);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressConfiguration)) {
            return false;
        }
        AddressConfiguration addressConfiguration = (AddressConfiguration) other;
        return Intrinsics.areEqual(this.data, addressConfiguration.data) && Intrinsics.areEqual(this.fields, addressConfiguration.fields) && Intrinsics.areEqual(this.onComplete, addressConfiguration.onComplete);
    }

    @Nullable
    public final ContactData getData() {
        return this.data;
    }

    @NotNull
    public final List<AddressField> getFields() {
        return this.fields;
    }

    @NotNull
    public final Function1<ContactData, Unit> getOnComplete() {
        return this.onComplete;
    }

    public final int hashCode() {
        int hashCode;
        ContactData contactData = this.data;
        if (contactData == null) {
            hashCode = 0;
        } else {
            hashCode = contactData.hashCode();
        }
        return this.onComplete.hashCode() + j.golf(hashCode * 31, 31, this.fields);
    }

    @NotNull
    public final String toString() {
        return "AddressConfiguration(data=" + this.data + ", fields=" + this.fields + ", onComplete=" + this.onComplete + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressConfiguration(ContactData contactData, List list, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(contactData, list, function1);
        contactData = (i4 & 1) != 0 ? null : contactData;
        if ((i4 & 2) != 0) {
            AddressField.INSTANCE.getClass();
            list = AddressField.access$getBilling$cp();
        }
    }
}
