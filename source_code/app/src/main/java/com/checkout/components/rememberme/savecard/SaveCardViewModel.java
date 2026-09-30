package com.checkout.components.rememberme.savecard;

import Cf.d;
import Cf.e;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.rememberme.Z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.AbstractC3220y;
import vf.I;
import vf.ad;
import vf.ao;
import yf.L;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/checkout/components/rememberme/savecard/SaveCardViewModel;", "Landroidx/lifecycle/Y;", "Lcom/checkout/components/interfaces/usecase/SuspendUseCase;", "", "", "checkIsAccountAvailableUseCase", "Lcom/checkout/components/rememberme/savecard/SaveCardViewStateRepository;", "repository", "Lvf/y;", "networkDispatcher", "<init>", "(Lcom/checkout/components/interfaces/usecase/SuspendUseCase;Lcom/checkout/components/rememberme/savecard/SaveCardViewStateRepository;Lvf/y;)V", "", "isChecked", "onCheckedChange$rememberme_standardRelease", "(Z)V", "onCheckedChange", "email", "onEmailChange$rememberme_standardRelease", "(Ljava/lang/String;)V", "onEmailChange", "phoneNumber", "onPhoneNumberChange$rememberme_standardRelease", "onPhoneNumberChange", "onEmailEditClick$rememberme_standardRelease", "()V", "onEmailEditClick", "onPhoneEditClick$rememberme_standardRelease", "onPhoneEditClick", "Lyf/L;", "Lcom/checkout/components/rememberme/savecard/SaveCardViewState;", "getState$rememberme_standardRelease", "()Lyf/L;", "state", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveCardViewModel extends Y {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SuspendUseCase f6270a;

    /* renamed from: b, reason: collision with root package name */
    private final SaveCardViewStateRepository f6271b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3220y f6272c;

    /* renamed from: d, reason: collision with root package name */
    private I f6273d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SaveCardViewModel(SuspendUseCase suspendUseCase, SaveCardViewStateRepository saveCardViewStateRepository, AbstractC3220y abstractC3220y, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(suspendUseCase, saveCardViewStateRepository, abstractC3220y);
        if ((i4 & 4) != 0) {
            e eVar = ao.alpha;
            abstractC3220y = d.purple;
        }
    }

    @NotNull
    public final L getState$rememberme_standardRelease() {
        return this.f6271b.getState();
    }

    public final void onCheckedChange$rememberme_standardRelease(boolean isChecked) {
        this.f6271b.onCheckedChange$rememberme_standardRelease(isChecked);
    }

    public final void onEmailChange$rememberme_standardRelease(@NotNull String email) {
        Intrinsics.echo(email, "email");
        this.f6271b.onEmailChange$rememberme_standardRelease(email);
        I i4 = this.f6273d;
        if (i4 != null) {
            i4.foxtrot(null);
        }
        this.f6273d = ad.zulu(T.hotel(this), this.f6272c, null, new Z0(this, email, null), 2);
    }

    public final void onEmailEditClick$rememberme_standardRelease() {
        this.f6271b.onEmailEditClick$rememberme_standardRelease();
    }

    public final void onPhoneEditClick$rememberme_standardRelease() {
        this.f6271b.onPhoneEditClick$rememberme_standardRelease();
    }

    public final void onPhoneNumberChange$rememberme_standardRelease(@NotNull String phoneNumber) {
        Intrinsics.echo(phoneNumber, "phoneNumber");
        this.f6271b.onPhoneNumberChange$rememberme_standardRelease(phoneNumber);
    }

    public SaveCardViewModel(@NotNull SuspendUseCase<String, Unit> checkIsAccountAvailableUseCase, @NotNull SaveCardViewStateRepository repository, @NotNull AbstractC3220y networkDispatcher) {
        Intrinsics.echo(checkIsAccountAvailableUseCase, "checkIsAccountAvailableUseCase");
        Intrinsics.echo(repository, "repository");
        Intrinsics.echo(networkDispatcher, "networkDispatcher");
        this.f6270a = checkIsAccountAvailableUseCase;
        this.f6271b = repository;
        this.f6272c = networkDispatcher;
    }
}
