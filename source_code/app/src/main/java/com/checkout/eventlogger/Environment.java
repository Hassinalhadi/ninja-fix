package com.checkout.eventlogger;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000:\u0002\t\nB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u00020\u00018\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/checkout/eventlogger/Environment;", "", Constants.KEY_URL, "Ljava/lang/String;", "getUrl$logger_release", "()Ljava/lang/String;", "host", "<init>", "(Ljava/lang/String;)V", "PRODUCTION", "SANDBOX", "Lcom/checkout/eventlogger/Environment$SANDBOX;", "Lcom/checkout/eventlogger/Environment$PRODUCTION;", "logger_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* loaded from: classes3.dex */
public abstract class Environment {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f6549a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/checkout/eventlogger/Environment$PRODUCTION;", "Lcom/checkout/eventlogger/Environment;", "<init>", "()V", "logger_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* loaded from: classes3.dex */
    public static final class PRODUCTION extends Environment {

        @NotNull
        public static final PRODUCTION INSTANCE = new PRODUCTION();

        public PRODUCTION() {
            super("https://cloudevents.integration.checkout.com", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/checkout/eventlogger/Environment$SANDBOX;", "Lcom/checkout/eventlogger/Environment;", "<init>", "()V", "logger_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* loaded from: classes3.dex */
    public static final class SANDBOX extends Environment {

        @NotNull
        public static final SANDBOX INSTANCE = new SANDBOX();

        public SANDBOX() {
            super("https://cloudevents.integration.sandbox.checkout.com", null);
        }
    }

    public Environment(String str) {
        this.f6549a = StringsKt.magenta(str, "/").concat("/logging");
    }

    @NotNull
    /* renamed from: getUrl$logger_release, reason: from getter */
    public final String getF6549a() {
        return this.f6549a;
    }

    public /* synthetic */ Environment(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
