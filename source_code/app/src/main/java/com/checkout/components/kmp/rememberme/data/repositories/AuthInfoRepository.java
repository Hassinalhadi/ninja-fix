package com.checkout.components.kmp.rememberme.data.repositories;

import com.checkout.components.kmp.rememberme.shared.model.Hint;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yf.AbstractC3428A;
import yf.L;
import yf.N;
import yf.at;
import yf.av;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u001b\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/repositories/AuthInfoRepository;", "", "<init>", "()V", "", "email", "", "updateEmail", "(Ljava/lang/String;)V", "hintId", "updateHintId", "", "Lcom/checkout/components/kmp/rememberme/shared/model/Hint;", "hints", "updateHints", "(Ljava/util/List;)V", "clear", "Lyf/at;", "_email", "Lyf/at;", "Lyf/L;", "Lyf/L;", "getEmail$rememberme_release", "()Lyf/L;", "_hintId", "getHintId$rememberme_release", "_hints", "getHints$rememberme_release", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AuthInfoRepository {
    public static final int $stable = 8;

    @NotNull
    private final at _email;

    @NotNull
    private final at _hintId;

    @NotNull
    private final at _hints;

    @NotNull
    private final L email;

    @NotNull
    private final L hintId;

    @NotNull
    private final L hints;

    public AuthInfoRepository() {
        N charlie = AbstractC3428A.charlie("");
        this._email = charlie;
        this.email = new av(charlie);
        N charlie2 = AbstractC3428A.charlie("");
        this._hintId = charlie2;
        this.hintId = new av(charlie2);
        N charlie3 = AbstractC3428A.charlie(CollectionsKt.emptyList());
        this._hints = charlie3;
        this.hints = new av(charlie3);
    }

    public final void clear() {
        N n5;
        Object value;
        N n10;
        Object value2;
        N n11;
        Object value3;
        at atVar = this._email;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, ""));
        at atVar2 = this._hintId;
        do {
            n10 = (N) atVar2;
            value2 = n10.getValue();
        } while (!n10.hotel(value2, ""));
        at atVar3 = this._hints;
        do {
            n11 = (N) atVar3;
            value3 = n11.getValue();
        } while (!n11.hotel(value3, CollectionsKt.emptyList()));
    }

    @NotNull
    /* renamed from: getEmail$rememberme_release, reason: from getter */
    public final L getEmail() {
        return this.email;
    }

    @NotNull
    /* renamed from: getHintId$rememberme_release, reason: from getter */
    public final L getHintId() {
        return this.hintId;
    }

    @NotNull
    /* renamed from: getHints$rememberme_release, reason: from getter */
    public final L getHints() {
        return this.hints;
    }

    public final void updateEmail(@NotNull String email) {
        N n5;
        Object value;
        Intrinsics.echo(email, "email");
        at atVar = this._email;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, email));
    }

    public final void updateHintId(@NotNull String hintId) {
        N n5;
        Object value;
        Intrinsics.echo(hintId, "hintId");
        at atVar = this._hintId;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, hintId));
    }

    public final void updateHints(@NotNull List<Hint> hints) {
        N n5;
        Object value;
        Intrinsics.echo(hints, "hints");
        at atVar = this._hints;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, hints));
    }
}
