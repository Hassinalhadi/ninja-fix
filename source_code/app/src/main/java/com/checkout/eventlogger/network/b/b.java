package com.checkout.eventlogger.network.b;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class b<T> {

    /* loaded from: classes3.dex */
    public static final class a<T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Throwable f6602a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Throwable cause) {
            super(null);
            Intrinsics.echo(cause, "cause");
            this.f6602a = cause;
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof a) && Intrinsics.areEqual(this.f6602a, ((a) obj).f6602a);
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.f6602a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "Error(cause=" + this.f6602a + ")";
        }
    }

    /* renamed from: com.checkout.eventlogger.network.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0005b<T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f6603a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0005b(@NotNull String errorMessage) {
            super(null);
            Intrinsics.echo(errorMessage, "errorMessage");
            this.f6603a = errorMessage;
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof C0005b) && Intrinsics.areEqual(this.f6603a, ((C0005b) obj).f6603a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.f6603a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return P0.gold(new StringBuilder("Failure(errorMessage="), this.f6603a, ")");
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f6604a;

        public c(T t5) {
            super(null);
            this.f6604a = t5;
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof c) && Intrinsics.areEqual(this.f6604a, ((c) obj).f6604a);
            }
            return true;
        }

        public int hashCode() {
            T t5 = this.f6604a;
            if (t5 != null) {
                return t5.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return P0.emerald(new StringBuilder("Success(body="), this.f6604a, ")");
        }
    }

    public b() {
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
