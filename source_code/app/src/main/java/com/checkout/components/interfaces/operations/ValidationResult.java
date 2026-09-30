package com.checkout.components.interfaces.operations;

import com.checkout.components.interfaces.error.model.BaseOperationsError;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/interfaces/operations/ValidationResult;", "", "S", "Success", "Failure", "Lcom/checkout/components/interfaces/operations/ValidationResult$Failure;", "Lcom/checkout/components/interfaces/operations/ValidationResult$Success;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ValidationResult<S> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/interfaces/operations/ValidationResult$Failure;", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "", "Lcom/checkout/components/interfaces/error/model/BaseOperationsError;", RedirectCustomTabEventLogger.RESULT_ERROR, "<init>", "(Lcom/checkout/components/interfaces/error/model/BaseOperationsError;)V", "a", "Lcom/checkout/components/interfaces/error/model/BaseOperationsError;", "getError", "()Lcom/checkout/components/interfaces/error/model/BaseOperationsError;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Failure extends ValidationResult {
        public static final int $stable = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final BaseOperationsError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull BaseOperationsError error) {
            super(null);
            Intrinsics.echo(error, "error");
            this.error = error;
        }

        @NotNull
        public final BaseOperationsError getError() {
            return this.error;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/interfaces/operations/ValidationResult$Success;", "", "T", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "value", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Success<T> extends ValidationResult<T> {
        public static final int $stable = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull T value) {
            super(null);
            Intrinsics.echo(value, "value");
            this.value = value;
        }

        @NotNull
        public final T getValue() {
            return (T) this.value;
        }
    }

    public ValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
